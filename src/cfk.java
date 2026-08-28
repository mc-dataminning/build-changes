import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class cfk {
   private static final Logger a = LogUtils.getLogger();
   private final Short2ObjectMap<cfj> b = new Short2ObjectOpenHashMap();
   private final Map<jn<cfl>, Set<cfj>> c = Maps.newHashMap();
   private final Runnable d;
   private boolean e;

   public cfk(Runnable $$0) {
      this($$0, true, ImmutableList.of());
   }

   cfk(Runnable $$0, boolean $$1, List<cfj> $$2) {
      this.d = $$0;
      this.e = $$1;
      $$2.forEach(this::a);
   }

   public cfk.a a() {
      return new cfk.a(this.e, this.b.values().stream().map(cfj::a).toList());
   }

   public Stream<cfj> a(Predicate<jn<cfl>> $$0, cfi.b $$1) {
      return this.c.entrySet().stream().filter($$1x -> $$0.test((jn<cfl>)$$1x.getKey())).flatMap($$0x -> ((Set)$$0x.getValue()).stream()).filter($$1.a());
   }

   public void a(je $$0, jn<cfl> $$1) {
      if (this.a(new cfj($$0, $$1, this.d))) {
         a.debug("Added POI of type {} @ {}", $$1.g(), $$0);
         this.d.run();
      }
   }

   private boolean a(cfj $$0) {
      je $$1 = $$0.g();
      jn<cfl> $$2 = $$0.h();
      short $$3 = kg.b($$1);
      cfj $$4 = (cfj)this.b.get($$3);
      if ($$4 != null) {
         if ($$2.equals($$4.h())) {
            return false;
         }

         ad.b("POI data mismatch: already registered at " + $$1);
      }

      this.b.put($$3, $$0);
      this.c.computeIfAbsent($$2, $$0x -> Sets.newHashSet()).add($$0);
      return true;
   }

   public void a(je $$0) {
      cfj $$1 = (cfj)this.b.remove(kg.b($$0));
      if ($$1 == null) {
         a.error("POI data mismatch: never registered at {}", $$0);
      } else {
         this.c.get($$1.h()).remove($$1);
         a.debug("Removed POI of type {} @ {}", LogUtils.defer($$1::h), LogUtils.defer($$1::g));
         this.d.run();
      }
   }

   @Deprecated
   @bai
   public int b(je $$0) {
      return this.e($$0).map(cfj::b).orElse(0);
   }

   public boolean c(je $$0) {
      cfj $$1 = (cfj)this.b.get(kg.b($$0));
      if ($$1 == null) {
         throw (IllegalStateException)ad.b(new IllegalStateException("POI never registered at " + $$0));
      } else {
         boolean $$2 = $$1.d();
         this.d.run();
         return $$2;
      }
   }

   public boolean a(je $$0, Predicate<jn<cfl>> $$1) {
      return this.d($$0).filter($$1).isPresent();
   }

   public Optional<jn<cfl>> d(je $$0) {
      return this.e($$0).map(cfj::h);
   }

   private Optional<cfj> e(je $$0) {
      return Optional.ofNullable((cfj)this.b.get(kg.b($$0)));
   }

   public void a(Consumer<BiConsumer<je, jn<cfl>>> $$0) {
      if (!this.e) {
         Short2ObjectMap<cfj> $$1 = new Short2ObjectOpenHashMap(this.b);
         this.c();
         $$0.accept(($$1x, $$2) -> {
            short $$3 = kg.b($$1x);
            cfj $$4 = (cfj)$$1.computeIfAbsent($$3, $$2x -> new cfj($$1x, $$2, this.d));
            this.a($$4);
         });
         this.e = true;
         this.d.run();
      }
   }

   private void c() {
      this.b.clear();
      this.c.clear();
   }

   boolean b() {
      return this.e;
   }

   public static record a(boolean b, List<cfj.a> c) {
      public static final Codec<cfk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.BOOL.lenientOptionalFieldOf("Valid", false).forGetter(cfk.a::a), cfj.a.a.listOf().fieldOf("Records").forGetter(cfk.a::b))
               .apply($$0, cfk.a::new)
      );

      public cfk a(Runnable $$0) {
         return new cfk($$0, this.b, this.c.stream().map($$1 -> $$1.a($$0)).toList());
      }

      public boolean a() {
         return this.b;
      }

      public List<cfj.a> b() {
         return this.c;
      }
   }
}
