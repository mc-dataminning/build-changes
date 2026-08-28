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
   public static final bx.b<chm.e> f = a("axolotl", bx.b.a(chm.e.f, $$0 -> $$0 instanceof chm $$1 ? Optional.of($$1.gp()) : Optional.empty()));
   public static final bx.b<cpu.b> g = a("boat", bx.b.a(cpu.b.j, $$0 -> $$0 instanceof cpu $$1 ? Optional.of($$1.w()) : Optional.empty()));
   public static final bx.b<cgk.v> h = a("fox", bx.b.a(cgk.v.c, $$0 -> $$0 instanceof cgk $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bx.b<cgn.a> i = a("mooshroom", bx.b.a(cgn.a.c, $$0 -> $$0 instanceof cgn $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bx.b<cgu.g> j = a("rabbit", bx.b.a(cgu.g.h, $$0 -> $$0 instanceof cgu $$1 ? Optional.of($$1.gp()) : Optional.empty()));
   public static final bx.b<cin> k = a("horse", bx.b.a(cin.h, $$0 -> $$0 instanceof cig $$1 ? Optional.of($$1.q()) : Optional.empty()));
   public static final bx.b<cih.d> l = a("llama", bx.b.a(cih.d.e, $$0 -> $$0 instanceof cih $$1 ? Optional.of($$1.gC()) : Optional.empty()));
   public static final bx.b<cnm> m = a("villager", bx.b.a(lu.w.q(), $$0 -> $$0 instanceof cnj $$1 ? Optional.of($$1.a()) : Optional.empty()));
   public static final bx.b<cgq.b> n = a("parrot", bx.b.a(cgq.b.f, $$0 -> $$0 instanceof cgq $$1 ? Optional.of($$1.gD()) : Optional.empty()));
   public static final bx.b<cha.b> o = a("tropical_fish", bx.b.a(cha.b.m, $$0 -> $$0 instanceof cha $$1 ? Optional.of($$1.gA()) : Optional.empty()));
   public static final bx.a<cka> p = a("painting", bx.a.a(lv.X, $$0 -> $$0 instanceof cjz $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bx.a<cge> q = a("cat", bx.a.a(lv.l, $$0 -> $$0 instanceof cgd $$1 ? Optional.of($$1.gB()) : Optional.empty()));
   public static final bx.a<cgl> r = a("frog", bx.a.a(lv.F, $$0 -> $$0 instanceof chu $$1 ? Optional.of($$1.y()) : Optional.empty()));
   public static final bx.a<che> s = a("wolf", bx.a.a(lv.m, $$0 -> $$0 instanceof chd $$1 ? Optional.of($$1.gC()) : Optional.empty()));

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

   public static bw a(jn<cge> $$0) {
      return q.a(jr.a($$0));
   }

   public static bw b(jn<cgl> $$0) {
      return r.a(jr.a($$0));
   }

   public static bw a(jr<che> $$0) {
      return s.a($$0);
   }

   public static class a<V> {
      final MapCodec<bx.a<V>.a> a;
      final Function<bto, Optional<jn<V>>> b;

      public static <V> bx.a<V> a(alb<? extends ka<V>> $$0, Function<bto, Optional<jn<V>>> $$1) {
         return new bx.a<>($$0, $$1);
      }

      public a(alb<? extends ka<V>> $$0, Function<bto, Optional<jn<V>>> $$1) {
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
         public boolean a(bto $$0, arh $$1, @Nullable eys $$2) {
            return a.this.b.apply($$0).filter(this.c::a).isPresent();
         }
      }
   }

   public static class b<V> {
      final MapCodec<bx.b<V>.a> a;
      final Function<bto, Optional<V>> b;

      public static <V> bx.b<V> a(ka<V> $$0, Function<bto, Optional<V>> $$1) {
         return new bx.b<>($$0.q(), $$1);
      }

      public static <V> bx.b<V> a(Codec<V> $$0, Function<bto, Optional<V>> $$1) {
         return new bx.b<>($$0, $$1);
      }

      public b(Codec<V> $$0, Function<bto, Optional<V>> $$1) {
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
         public boolean a(bto $$0, arh $$1, @Nullable eys $$2) {
            return b.this.b.apply($$0).filter(this.c::equals).isPresent();
         }
      }
   }
}
