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
   public static final bw.b<cgd.d> f = a("axolotl", bw.b.a(cgd.d.f, $$0 -> $$0 instanceof cgd $$1 ? Optional.of($$1.go()) : Optional.empty()));
   public static final bw.b<coh.b> g = a("boat", bw.b.a(coh.b.j, $$0 -> $$0 instanceof coh $$1 ? Optional.of($$1.x()) : Optional.empty()));
   public static final bw.b<cfb.v> h = a("fox", bw.b.a(cfb.v.c, $$0 -> $$0 instanceof cfb $$1 ? Optional.of($$1.u()) : Optional.empty()));
   public static final bw.b<cfe.a> i = a("mooshroom", bw.b.a(cfe.a.c, $$0 -> $$0 instanceof cfe $$1 ? Optional.of($$1.u()) : Optional.empty()));
   public static final bw.b<cfl.g> j = a("rabbit", bw.b.a(cfl.g.h, $$0 -> $$0 instanceof cfl $$1 ? Optional.of($$1.go()) : Optional.empty()));
   public static final bw.b<che> k = a("horse", bw.b.a(che.h, $$0 -> $$0 instanceof cgx $$1 ? Optional.of($$1.s()) : Optional.empty()));
   public static final bw.b<cgy.d> l = a("llama", bw.b.a(cgy.d.e, $$0 -> $$0 instanceof cgy $$1 ? Optional.of($$1.gA()) : Optional.empty()));
   public static final bw.b<cmc> m = a("villager", bw.b.a(lq.w.r(), $$0 -> $$0 instanceof clz $$1 ? Optional.of($$1.a()) : Optional.empty()));
   public static final bw.b<cfh.b> n = a("parrot", bw.b.a(cfh.b.f, $$0 -> $$0 instanceof cfh $$1 ? Optional.of($$1.gw()) : Optional.empty()));
   public static final bw.b<cfr.b> o = a("tropical_fish", bw.b.a(cfr.b.m, $$0 -> $$0 instanceof cfr $$1 ? Optional.of($$1.gz()) : Optional.empty()));
   public static final bw.a<ciq> p = a("painting", bw.a.a(lr.W, $$0 -> $$0 instanceof cip $$1 ? Optional.of($$1.v()) : Optional.empty()));
   public static final bw.a<cev> q = a("cat", bw.a.a(lr.l, $$0 -> $$0 instanceof ceu $$1 ? Optional.of($$1.gv()) : Optional.empty()));
   public static final bw.a<cfc> r = a("frog", bw.a.a(lr.F, $$0 -> $$0 instanceof cgl $$1 ? Optional.of($$1.y()) : Optional.empty()));
   public static final bw.a<cfv> s = a("wolf", bw.a.a(lr.m, $$0 -> $$0 instanceof cfu $$1 ? Optional.of($$1.gv()) : Optional.empty()));

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

   public static bv a(jj<cev> $$0) {
      return q.a(jn.a($$0));
   }

   public static bv b(jj<cfc> $$0) {
      return r.a(jn.a($$0));
   }

   public static bv a(jn<cfv> $$0) {
      return s.a($$0);
   }

   public static class a<V> {
      final MapCodec<bw.a<V>.a> a;
      final Function<bsg, Optional<jj<V>>> b;

      public static <V> bw.a<V> a(akj<? extends jw<V>> $$0, Function<bsg, Optional<jj<V>>> $$1) {
         return new bw.a<>($$0, $$1);
      }

      public a(akj<? extends jw<V>> $$0, Function<bsg, Optional<jj<V>>> $$1) {
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
         public boolean a(bsg $$0, aqm $$1, @Nullable ewf $$2) {
            return a.this.b.apply($$0).filter(this.c::a).isPresent();
         }
      }
   }

   public static class b<V> {
      final MapCodec<bw.b<V>.a> a;
      final Function<bsg, Optional<V>> b;

      public static <V> bw.b<V> a(jw<V> $$0, Function<bsg, Optional<V>> $$1) {
         return new bw.b<>($$0.r(), $$1);
      }

      public static <V> bw.b<V> a(Codec<V> $$0, Function<bsg, Optional<V>> $$1) {
         return new bw.b<>($$0, $$1);
      }

      public b(Codec<V> $$0, Function<bsg, Optional<V>> $$1) {
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
         public boolean a(bsg $$0, aqm $$1, @Nullable ewf $$2) {
            return b.this.b.apply($$0).filter(this.c::equals).isPresent();
         }
      }
   }
}
