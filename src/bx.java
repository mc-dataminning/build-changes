import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bx {
   public static final MapCodec<dd> a = a("lightning", dd.b);
   public static final MapCodec<cb> b = a("fishing_hook", cb.c);
   public static final MapCodec<dp> c = a("player", dp.c);
   public static final MapCodec<dy> d = a("slime", dy.b);
   public static final MapCodec<dr> e = a("raider", dr.b);
   public static final bx.b<chh.e> f = a("axolotl", bx.b.a(chh.e.f, $$0 -> $$0 instanceof chh $$1 ? Optional.of($$1.go()) : Optional.empty()));
   public static final bx.b<cpo.b> g = a("boat", bx.b.a(cpo.b.j, $$0 -> $$0 instanceof cpo $$1 ? Optional.of($$1.w()) : Optional.empty()));
   public static final bx.b<cgf.v> h = a("fox", bx.b.a(cgf.v.c, $$0 -> $$0 instanceof cgf $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bx.b<cgi.a> i = a("mooshroom", bx.b.a(cgi.a.c, $$0 -> $$0 instanceof cgi $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bx.b<cgp.g> j = a("rabbit", bx.b.a(cgp.g.h, $$0 -> $$0 instanceof cgp $$1 ? Optional.of($$1.go()) : Optional.empty()));
   public static final bx.b<cii> k = a("horse", bx.b.a(cii.h, $$0 -> $$0 instanceof cib $$1 ? Optional.of($$1.q()) : Optional.empty()));
   public static final bx.b<cic.d> l = a("llama", bx.b.a(cic.d.e, $$0 -> $$0 instanceof cic $$1 ? Optional.of($$1.gB()) : Optional.empty()));
   public static final bx.b<cnh> m = a("villager", bx.b.a(lu.w.q(), $$0 -> $$0 instanceof cne $$1 ? Optional.of($$1.a()) : Optional.empty()));
   public static final bx.b<cgl.b> n = a("parrot", bx.b.a(cgl.b.f, $$0 -> $$0 instanceof cgl $$1 ? Optional.of($$1.gC()) : Optional.empty()));
   public static final bx.b<cgv.b> o = a("tropical_fish", bx.b.a(cgv.b.m, $$0 -> $$0 instanceof cgv $$1 ? Optional.of($$1.gz()) : Optional.empty()));
   public static final bx.a<cjv> p = a("painting", bx.a.a(lv.X, $$0 -> $$0 instanceof cju $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bx.a<cfz> q = a("cat", bx.a.a(lv.l, $$0 -> $$0 instanceof cfy $$1 ? Optional.of($$1.gA()) : Optional.empty()));
   public static final bx.a<cgg> r = a("frog", bx.a.a(lv.F, $$0 -> $$0 instanceof chp $$1 ? Optional.of($$1.y()) : Optional.empty()));
   public static final bx.a<cgz> s = a("wolf", bx.a.a(lv.m, $$0 -> $$0 instanceof cgy $$1 ? Optional.of($$1.gB()) : Optional.empty()));

   private static <T extends bw> MapCodec<T> a(String $$0, MapCodec<T> $$1) {
      return ka.a(lu.aq, $$0, $$1);
   }

   private static <V> bx.b<V> a(String $$0, bx.b<V> $$1) {
      ka.a(lu.aq, $$0, $$1.a);
      return $$1;
   }

   private static <V> bx.a<V> a(String $$0, bx.a<V> $$1) {
      ka.a(lu.aq, $$0, $$1.a);
      return $$1;
   }

   public static MapCodec<? extends bw> a(ka<MapCodec<? extends bw>> $$0) {
      return a;
   }

   public static bw a(jn<cfz> $$0) {
      return q.a(jr.a($$0));
   }

   public static bw b(jn<cgg> $$0) {
      return r.a(jr.a($$0));
   }

   public static bw a(jr<cgz> $$0) {
      return s.a($$0);
   }

   public static class a<V> {
      final MapCodec<bx.a<V>.a> a;
      final Function<btj, Optional<jn<V>>> b;

      public static <V> bx.a<V> a(ala<? extends ka<V>> $$0, Function<btj, Optional<jn<V>>> $$1) {
         return new bx.a<>($$0, $$1);
      }

      public a(ala<? extends ka<V>> $$0, Function<btj, Optional<jn<V>>> $$1) {
         this.b = $$1;
         this.a = RecordCodecBuilder.mapCodec(
            $$1x -> $$1x.group(kc.a($$0).fieldOf("variant").forGetter($$0xx -> $$0xx.c)).apply($$1x, $$0xx -> new bx.a.a($$0xx))
         );
      }

      public bw a(jr<V> $$0) {
         return new bx.a.a($$0);
      }

      class a implements bw {
         final jr<V> c;

         a(final jr<V> $$0) {
            this.c = $$0;
         }

         @Override
         public MapCodec<bx.a<V>.a> a() {
            return a.this.a;
         }

         @Override
         public boolean a(btj $$0, arg $$1, @Nullable eye $$2) {
            return a.this.b.apply($$0).filter(this.c::a).isPresent();
         }
      }
   }

   public static class b<V> {
      final MapCodec<bx.b<V>.a> a;
      final Function<btj, Optional<V>> b;

      public static <V> bx.b<V> a(ka<V> $$0, Function<btj, Optional<V>> $$1) {
         return new bx.b<>($$0.q(), $$1);
      }

      public static <V> bx.b<V> a(Codec<V> $$0, Function<btj, Optional<V>> $$1) {
         return new bx.b<>($$0, $$1);
      }

      public b(Codec<V> $$0, Function<btj, Optional<V>> $$1) {
         this.b = $$1;
         this.a = RecordCodecBuilder.mapCodec($$1x -> $$1x.group($$0.fieldOf("variant").forGetter($$0xx -> $$0xx.c)).apply($$1x, $$0xx -> new bx.b.a($$0xx)));
      }

      public bw a(V $$0) {
         return new bx.b.a($$0);
      }

      class a implements bw {
         final V c;

         a(final V $$0) {
            this.c = $$0;
         }

         @Override
         public MapCodec<bx.b<V>.a> a() {
            return b.this.a;
         }

         @Override
         public boolean a(btj $$0, arg $$1, @Nullable eye $$2) {
            return b.this.b.apply($$0).filter(this.c::equals).isPresent();
         }
      }
   }
}
