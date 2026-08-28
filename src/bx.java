import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bx {
   public static final MapCodec<de> a = a("lightning", de.b);
   public static final MapCodec<cb> b = a("fishing_hook", cb.c);
   public static final MapCodec<dq> c = a("player", dq.c);
   public static final MapCodec<ea> d = a("slime", ea.b);
   public static final MapCodec<ds> e = a("raider", ds.b);
   public static final MapCodec<dv> f = a("sheep", dv.b);
   public static final bx.b<chy.e> g = a("axolotl", bx.b.a(chy.e.f, $$0 -> $$0 instanceof chy $$1 ? Optional.of($$1.gv()) : Optional.empty()));
   public static final bx.b<cqh.b> h = a("boat", bx.b.a(cqh.b.j, $$0 -> $$0 instanceof cqh $$1 ? Optional.of($$1.w()) : Optional.empty()));
   public static final bx.b<cgw.v> i = a("fox", bx.b.a(cgw.v.c, $$0 -> $$0 instanceof cgw $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bx.b<cgz.a> j = a("mooshroom", bx.b.a(cgz.a.c, $$0 -> $$0 instanceof cgz $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bx.b<chg.g> k = a("rabbit", bx.b.a(chg.g.h, $$0 -> $$0 instanceof chg $$1 ? Optional.of($$1.gv()) : Optional.empty()));
   public static final bx.b<ciz> l = a("horse", bx.b.a(ciz.h, $$0 -> $$0 instanceof cis $$1 ? Optional.of($$1.q()) : Optional.empty()));
   public static final bx.b<cit.d> m = a("llama", bx.b.a(cit.d.e, $$0 -> $$0 instanceof cit $$1 ? Optional.of($$1.gI()) : Optional.empty()));
   public static final bx.b<cny> n = a("villager", bx.b.a(lx.w.q(), $$0 -> $$0 instanceof cnv $$1 ? Optional.of($$1.a()) : Optional.empty()));
   public static final bx.b<chc.b> o = a("parrot", bx.b.a(chc.b.f, $$0 -> $$0 instanceof chc $$1 ? Optional.of($$1.gJ()) : Optional.empty()));
   public static final bx.b<chm.b> p = a("tropical_fish", bx.b.a(chm.b.m, $$0 -> $$0 instanceof chm $$1 ? Optional.of($$1.gG()) : Optional.empty()));
   public static final bx.a<ckm> q = a("painting", bx.a.a(ly.X, $$0 -> $$0 instanceof ckl $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bx.a<cgq> r = a("cat", bx.a.a(ly.l, $$0 -> $$0 instanceof cgp $$1 ? Optional.of($$1.gH()) : Optional.empty()));
   public static final bx.a<cgx> s = a("frog", bx.a.a(ly.F, $$0 -> $$0 instanceof cig $$1 ? Optional.of($$1.y()) : Optional.empty()));
   public static final bx.a<chq> t = a("wolf", bx.a.a(ly.m, $$0 -> $$0 instanceof chp $$1 ? Optional.of($$1.gI()) : Optional.empty()));

   private static <T extends bw> MapCodec<T> a(String $$0, MapCodec<T> $$1) {
      return kc.a(lx.ap, $$0, $$1);
   }

   private static <V> bx.b<V> a(String $$0, bx.b<V> $$1) {
      kc.a(lx.ap, $$0, $$1.a);
      return $$1;
   }

   private static <V> bx.a<V> a(String $$0, bx.a<V> $$1) {
      kc.a(lx.ap, $$0, $$1.a);
      return $$1;
   }

   public static MapCodec<? extends bw> a(kc<MapCodec<? extends bw>> $$0) {
      return a;
   }

   public static bw a(jp<cgq> $$0) {
      return r.a(jt.a($$0));
   }

   public static bw b(jp<cgx> $$0) {
      return s.a(jt.a($$0));
   }

   public static bw a(jt<chq> $$0) {
      return t.a($$0);
   }

   public static class a<V> {
      final MapCodec<bx.a<V>.a> a;
      final Function<btz, Optional<jp<V>>> b;

      public static <V> bx.a<V> a(alg<? extends kc<V>> $$0, Function<btz, Optional<jp<V>>> $$1) {
         return new bx.a<>($$0, $$1);
      }

      public a(alg<? extends kc<V>> $$0, Function<btz, Optional<jp<V>>> $$1) {
         this.b = $$1;
         this.a = RecordCodecBuilder.mapCodec(
            $$1x -> $$1x.group(ke.a($$0).fieldOf("variant").forGetter($$0xx -> $$0xx.c)).apply($$1x, $$0xx -> new bx.a.a($$0xx))
         );
      }

      public bw a(jt<V> $$0) {
         return new bx.a.a($$0);
      }

      class a implements bw {
         final jt<V> c;

         a(final jt<V> $$0) {
            this.c = $$0;
         }

         @Override
         public MapCodec<bx.a<V>.a> a() {
            return a.this.a;
         }

         @Override
         public boolean a(btz $$0, arm $$1, @Nullable ezh $$2) {
            return a.this.b.apply($$0).filter(this.c::a).isPresent();
         }
      }
   }

   public static class b<V> {
      final MapCodec<bx.b<V>.a> a;
      final Function<btz, Optional<V>> b;

      public static <V> bx.b<V> a(kc<V> $$0, Function<btz, Optional<V>> $$1) {
         return new bx.b<>($$0.q(), $$1);
      }

      public static <V> bx.b<V> a(Codec<V> $$0, Function<btz, Optional<V>> $$1) {
         return new bx.b<>($$0, $$1);
      }

      public b(Codec<V> $$0, Function<btz, Optional<V>> $$1) {
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
         public boolean a(btz $$0, arm $$1, @Nullable ezh $$2) {
            return b.this.b.apply($$0).filter(this.c::equals).isPresent();
         }
      }
   }
}
