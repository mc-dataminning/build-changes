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

public class cgk {
   private static final Logger a = LogUtils.getLogger();
   private final Short2ObjectMap<cgj> b = new Short2ObjectOpenHashMap();
   private final Map<jq<cgl>, Set<cgj>> c = Maps.newHashMap();
   private final Runnable d;
   private boolean e;

   public cgk(Runnable $$0) {
      this($$0, true, ImmutableList.of());
   }

   cgk(Runnable $$0, boolean $$1, List<cgj> $$2) {
      this.d = $$0;
      this.e = $$1;
      $$2.forEach(this::a);
   }

   public cgk.a a() {
      return new cgk.a(this.e, this.b.values().stream().map(cgj::a).toList());
   }

   public Stream<cgj> a(Predicate<jq<cgl>> $$0, cgi.b $$1) {
      return this.c.entrySet().stream().filter($$1x -> $$0.test((jq<cgl>)$$1x.getKey())).flatMap($$0x -> ((Set)$$0x.getValue()).stream()).filter($$1.a());
   }

   public void a(jh $$0, jq<cgl> $$1) {
      if (this.a(new cgj($$0, $$1, this.d))) {
         a.debug("Added POI of type {} @ {}", $$1.g(), $$0);
         this.d.run();
      }
   }

   private boolean a(cgj $$0) {
      jh $$1 = $$0.g();
      jq<cgl> $$2 = $$0.h();
      short $$3 = kj.b($$1);
      cgj $$4 = (cgj)this.b.get($$3);
      if ($$4 != null) {
         if ($$2.equals($$4.h())) {
            return false;
         }

         ae.b("POI data mismatch: already registered at " + $$1);
      }

      this.b.put($$3, $$0);
      this.c.computeIfAbsent($$2, $$0x -> Sets.newHashSet()).add($$0);
      return true;
   }

   public void a(jh $$0) {
      cgj $$1 = (cgj)this.b.remove(kj.b($$0));
      if ($$1 == null) {
         a.error("POI data mismatch: never registered at {}", $$0);
      } else {
         this.c.get($$1.h()).remove($$1);
         a.debug("Removed POI of type {} @ {}", LogUtils.defer($$1::h), LogUtils.defer($$1::g));
         this.d.run();
      }
   }

   @Deprecated
   @bau
   public int b(jh $$0) {
      return this.e($$0).map(cgj::b).orElse(0);
   }

   public boolean c(jh $$0) {
      cgj $$1 = (cgj)this.b.get(kj.b($$0));
      if ($$1 == null) {
         throw (IllegalStateException)ae.b(new IllegalStateException("POI never registered at " + $$0));
      } else {
         boolean $$2 = $$1.d();
         this.d.run();
         return $$2;
      }
   }

   public boolean a(jh $$0, Predicate<jq<cgl>> $$1) {
      return this.d($$0).filter($$1).isPresent();
   }

   public Optional<jq<cgl>> d(jh $$0) {
      return this.e($$0).map(cgj::h);
   }

   private Optional<cgj> e(jh $$0) {
      return Optional.ofNullable((cgj)this.b.get(kj.b($$0)));
   }

   public void a(Consumer<BiConsumer<jh, jq<cgl>>> $$0) {
      if (!this.e) {
         Short2ObjectMap<cgj> $$1 = new Short2ObjectOpenHashMap(this.b);
         this.c();
         $$0.accept(($$1x, $$2) -> {
            short $$3 = kj.b($$1x);
            cgj $$4 = (cgj)$$1.computeIfAbsent($$3, $$2x -> new cgj($$1x, $$2, this.d));
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

   public static record a(boolean b, List<cgj.a> c) {
      public static final Codec<cgk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.BOOL.lenientOptionalFieldOf("Valid", false).forGetter(cgk.a::a), cgj.a.a.listOf().fieldOf("Records").forGetter(cgk.a::b))
               .apply($$0, cgk.a::new)
      );

      public cgk a(Runnable $$0) {
         return new cgk($$0, this.b, this.c.stream().map($$1 -> $$1.a($$0)).toList());
      }

      public boolean a() {
         return this.b;
      }

      public List<cgj.a> b() {
         return this.c;
      }
   }
}
