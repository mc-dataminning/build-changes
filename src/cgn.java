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

public class cgn {
   private static final Logger a = LogUtils.getLogger();
   private final Short2ObjectMap<cgm> b = new Short2ObjectOpenHashMap();
   private final Map<jq<cgo>, Set<cgm>> c = Maps.newHashMap();
   private final Runnable d;
   private boolean e;

   public cgn(Runnable $$0) {
      this($$0, true, ImmutableList.of());
   }

   cgn(Runnable $$0, boolean $$1, List<cgm> $$2) {
      this.d = $$0;
      this.e = $$1;
      $$2.forEach(this::a);
   }

   public cgn.a a() {
      return new cgn.a(this.e, this.b.values().stream().map(cgm::a).toList());
   }

   public Stream<cgm> a(Predicate<jq<cgo>> $$0, cgl.b $$1) {
      return this.c.entrySet().stream().filter($$1x -> $$0.test((jq<cgo>)$$1x.getKey())).flatMap($$0x -> ((Set)$$0x.getValue()).stream()).filter($$1.a());
   }

   public void a(jh $$0, jq<cgo> $$1) {
      if (this.a(new cgm($$0, $$1, this.d))) {
         a.debug("Added POI of type {} @ {}", $$1.g(), $$0);
         this.d.run();
      }
   }

   private boolean a(cgm $$0) {
      jh $$1 = $$0.g();
      jq<cgo> $$2 = $$0.h();
      short $$3 = kj.b($$1);
      cgm $$4 = (cgm)this.b.get($$3);
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
      cgm $$1 = (cgm)this.b.remove(kj.b($$0));
      if ($$1 == null) {
         a.error("POI data mismatch: never registered at {}", $$0);
      } else {
         this.c.get($$1.h()).remove($$1);
         a.debug("Removed POI of type {} @ {}", LogUtils.defer($$1::h), LogUtils.defer($$1::g));
         this.d.run();
      }
   }

   @Deprecated
   @bat
   public int b(jh $$0) {
      return this.e($$0).map(cgm::b).orElse(0);
   }

   public boolean c(jh $$0) {
      cgm $$1 = (cgm)this.b.get(kj.b($$0));
      if ($$1 == null) {
         throw (IllegalStateException)ae.b(new IllegalStateException("POI never registered at " + $$0));
      } else {
         boolean $$2 = $$1.d();
         this.d.run();
         return $$2;
      }
   }

   public boolean a(jh $$0, Predicate<jq<cgo>> $$1) {
      return this.d($$0).filter($$1).isPresent();
   }

   public Optional<jq<cgo>> d(jh $$0) {
      return this.e($$0).map(cgm::h);
   }

   private Optional<cgm> e(jh $$0) {
      return Optional.ofNullable((cgm)this.b.get(kj.b($$0)));
   }

   public void a(Consumer<BiConsumer<jh, jq<cgo>>> $$0) {
      if (!this.e) {
         Short2ObjectMap<cgm> $$1 = new Short2ObjectOpenHashMap(this.b);
         this.c();
         $$0.accept(($$1x, $$2) -> {
            short $$3 = kj.b($$1x);
            cgm $$4 = (cgm)$$1.computeIfAbsent($$3, $$2x -> new cgm($$1x, $$2, this.d));
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

   public static record a(boolean b, List<cgm.a> c) {
      public static final Codec<cgn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.BOOL.lenientOptionalFieldOf("Valid", false).forGetter(cgn.a::a), cgm.a.a.listOf().fieldOf("Records").forGetter(cgn.a::b))
               .apply($$0, cgn.a::new)
      );

      public cgn a(Runnable $$0) {
         return new cgn($$0, this.b, this.c.stream().map($$1 -> $$1.a($$0)).toList());
      }

      public boolean a() {
         return this.b;
      }

      public List<cgm.a> b() {
         return this.c;
      }
   }
}
