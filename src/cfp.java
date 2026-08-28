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

public class cfp {
   private static final Logger a = LogUtils.getLogger();
   private final Short2ObjectMap<cfo> b = new Short2ObjectOpenHashMap();
   private final Map<jn<cfq>, Set<cfo>> c = Maps.newHashMap();
   private final Runnable d;
   private boolean e;

   public cfp(Runnable $$0) {
      this($$0, true, ImmutableList.of());
   }

   cfp(Runnable $$0, boolean $$1, List<cfo> $$2) {
      this.d = $$0;
      this.e = $$1;
      $$2.forEach(this::a);
   }

   public cfp.a a() {
      return new cfp.a(this.e, this.b.values().stream().map(cfo::a).toList());
   }

   public Stream<cfo> a(Predicate<jn<cfq>> $$0, cfn.b $$1) {
      return this.c.entrySet().stream().filter($$1x -> $$0.test((jn<cfq>)$$1x.getKey())).flatMap($$0x -> ((Set)$$0x.getValue()).stream()).filter($$1.a());
   }

   public void a(je $$0, jn<cfq> $$1) {
      if (this.a(new cfo($$0, $$1, this.d))) {
         a.debug("Added POI of type {} @ {}", $$1.g(), $$0);
         this.d.run();
      }
   }

   private boolean a(cfo $$0) {
      je $$1 = $$0.g();
      jn<cfq> $$2 = $$0.h();
      short $$3 = kg.b($$1);
      cfo $$4 = (cfo)this.b.get($$3);
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
      cfo $$1 = (cfo)this.b.remove(kg.b($$0));
      if ($$1 == null) {
         a.error("POI data mismatch: never registered at {}", $$0);
      } else {
         this.c.get($$1.h()).remove($$1);
         a.debug("Removed POI of type {} @ {}", LogUtils.defer($$1::h), LogUtils.defer($$1::g));
         this.d.run();
      }
   }

   @Deprecated
   @baj
   public int b(je $$0) {
      return this.e($$0).map(cfo::b).orElse(0);
   }

   public boolean c(je $$0) {
      cfo $$1 = (cfo)this.b.get(kg.b($$0));
      if ($$1 == null) {
         throw (IllegalStateException)ad.b(new IllegalStateException("POI never registered at " + $$0));
      } else {
         boolean $$2 = $$1.d();
         this.d.run();
         return $$2;
      }
   }

   public boolean a(je $$0, Predicate<jn<cfq>> $$1) {
      return this.d($$0).filter($$1).isPresent();
   }

   public Optional<jn<cfq>> d(je $$0) {
      return this.e($$0).map(cfo::h);
   }

   private Optional<cfo> e(je $$0) {
      return Optional.ofNullable((cfo)this.b.get(kg.b($$0)));
   }

   public void a(Consumer<BiConsumer<je, jn<cfq>>> $$0) {
      if (!this.e) {
         Short2ObjectMap<cfo> $$1 = new Short2ObjectOpenHashMap(this.b);
         this.c();
         $$0.accept(($$1x, $$2) -> {
            short $$3 = kg.b($$1x);
            cfo $$4 = (cfo)$$1.computeIfAbsent($$3, $$2x -> new cfo($$1x, $$2, this.d));
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

   public static record a(boolean b, List<cfo.a> c) {
      public static final Codec<cfp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.BOOL.lenientOptionalFieldOf("Valid", false).forGetter(cfp.a::a), cfo.a.a.listOf().fieldOf("Records").forGetter(cfp.a::b))
               .apply($$0, cfp.a::new)
      );

      public cfp a(Runnable $$0) {
         return new cfp($$0, this.b, this.c.stream().map($$1 -> $$1.a($$0)).toList());
      }

      public boolean a() {
         return this.b;
      }

      public List<cfo.a> b() {
         return this.c;
      }
   }
}
