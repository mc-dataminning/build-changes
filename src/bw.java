import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bw {
   public static final MapCodec<da> a = a("lightning", da.b);
   public static final MapCodec<ca> b = a("fishing_hook", ca.c);
   public static final MapCodec<dl> c = a("player", dl.c);
   public static final MapCodec<dv> d = a("slime", dv.b);
   public static final MapCodec<dn> e = a("raider", dn.b);
   public static final bw.b<cge.d> f = a("axolotl", bw.b.a(cge.d.f, $$0 -> $$0 instanceof cge $$1 ? Optional.of($$1.gn()) : Optional.empty()));
   public static final bw.b<coi.b> g = a("boat", bw.b.a(coi.b.j, $$0 -> $$0 instanceof coi $$1 ? Optional.of($$1.x()) : Optional.empty()));
   public static final bw.b<cfc.v> h = a("fox", bw.b.a(cfc.v.c, $$0 -> $$0 instanceof cfc $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bw.b<cff.a> i = a("mooshroom", bw.b.a(cff.a.c, $$0 -> $$0 instanceof cff $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bw.b<cfm.g> j = a("rabbit", bw.b.a(cfm.g.h, $$0 -> $$0 instanceof cfm $$1 ? Optional.of($$1.gn()) : Optional.empty()));
   public static final bw.b<chf> k = a("horse", bw.b.a(chf.h, $$0 -> $$0 instanceof cgy $$1 ? Optional.of($$1.s()) : Optional.empty()));
   public static final bw.b<cgz.d> l = a("llama", bw.b.a(cgz.d.e, $$0 -> $$0 instanceof cgz $$1 ? Optional.of($$1.gz()) : Optional.empty()));
   public static final bw.b<cmd> m = a("villager", bw.b.a(lq.w.r(), $$0 -> $$0 instanceof cma $$1 ? Optional.of($$1.a()) : Optional.empty()));
   public static final bw.b<cfi.b> n = a("parrot", bw.b.a(cfi.b.f, $$0 -> $$0 instanceof cfi $$1 ? Optional.of($$1.gv()) : Optional.empty()));
   public static final bw.b<cfs.b> o = a("tropical_fish", bw.b.a(cfs.b.m, $$0 -> $$0 instanceof cfs $$1 ? Optional.of($$1.gy()) : Optional.empty()));
   public static final bw.a<cir> p = a("painting", bw.a.a(lr.W, $$0 -> $$0 instanceof ciq $$1 ? Optional.of($$1.v()) : Optional.empty()));
   public static final bw.a<cew> q = a("cat", bw.a.a(lr.l, $$0 -> $$0 instanceof cev $$1 ? Optional.of($$1.gu()) : Optional.empty()));
   public static final bw.a<cfd> r = a("frog", bw.a.a(lr.F, $$0 -> $$0 instanceof cgm $$1 ? Optional.of($$1.x()) : Optional.empty()));
   public static final bw.a<cfw> s = a("wolf", bw.a.a(lr.m, $$0 -> $$0 instanceof cfv $$1 ? Optional.of($$1.gu()) : Optional.empty()));

   private static <T extends bv> MapCodec<T> a(String $$0, MapCodec<T> $$1) {
      return jw.a(lq.ar, $$0, $$1);
   }

   private static <V> bw.b<V> a(String $$0, bw.b<V> $$1) {
      jw.a(lq.ar, $$0, $$1.a);
      return $$1;
   }

   private static <V> bw.a<V> a(String $$0, bw.a<V> $$1) {
      jw.a(lq.ar, $$0, $$1.a);
      return $$1;
   }

   public static MapCodec<? extends bv> a(jw<MapCodec<? extends bv>> $$0) {
      return a;
   }

   public static bv a(jj<cew> $$0) {
      return q.a(jn.a($$0));
   }

   public static bv b(jj<cfd> $$0) {
      return r.a(jn.a($$0));
   }

   public static bv a(jn<cfw> $$0) {
      return s.a($$0);
   }

   public static class a<V> {
      final MapCodec<bw.a<V>.a> a;
      final Function<bsh, Optional<jj<V>>> b;

      public static <V> bw.a<V> a(akj<? extends jw<V>> $$0, Function<bsh, Optional<jj<V>>> $$1) {
         return new bw.a<>($$0, $$1);
      }

      public a(akj<? extends jw<V>> $$0, Function<bsh, Optional<jj<V>>> $$1) {
         this.b = $$1;
         this.a = RecordCodecBuilder.mapCodec(
            $$1x -> $$1x.group(jy.a($$0).fieldOf("variant").forGetter($$0xx -> $$0xx.c)).apply($$1x, $$0xx -> new bw.a.a($$0xx))
         );
      }

      public bv a(jn<V> $$0) {
         return new bw.a.a($$0);
      }

      class a implements bv {
         final jn<V> c;

         a(final jn<V> $$0) {
            this.c = $$0;
         }

         @Override
         public MapCodec<bw.a<V>.a> a() {
            return a.this.a;
         }

         @Override
         public boolean a(bsh $$0, aqm $$1, @Nullable ewh $$2) {
            return a.this.b.apply($$0).filter(this.c::a).isPresent();
         }
      }
   }

   public static class b<V> {
      final MapCodec<bw.b<V>.a> a;
      final Function<bsh, Optional<V>> b;

      public static <V> bw.b<V> a(jw<V> $$0, Function<bsh, Optional<V>> $$1) {
         return new bw.b<>($$0.r(), $$1);
      }

      public static <V> bw.b<V> a(Codec<V> $$0, Function<bsh, Optional<V>> $$1) {
         return new bw.b<>($$0, $$1);
      }

      public b(Codec<V> $$0, Function<bsh, Optional<V>> $$1) {
         this.b = $$1;
         this.a = RecordCodecBuilder.mapCodec($$1x -> $$1x.group($$0.fieldOf("variant").forGetter($$0xx -> $$0xx.c)).apply($$1x, $$0xx -> new bw.b.a($$0xx)));
      }

      public bv a(V $$0) {
         return new bw.b.a($$0);
      }

      class a implements bv {
         final V c;

         a(final V $$0) {
            this.c = $$0;
         }

         @Override
         public MapCodec<bw.b<V>.a> a() {
            return b.this.a;
         }

         @Override
         public boolean a(bsh $$0, aqm $$1, @Nullable ewh $$2) {
            return b.this.b.apply($$0).filter(this.c::equals).isPresent();
         }
      }
   }
}
