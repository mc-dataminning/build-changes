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
   public static final MapCodec<dz> d = a("slime", dz.b);
   public static final MapCodec<dr> e = a("raider", dr.b);
   public static final MapCodec<du> f = a("sheep", du.b);
   public static final bx.b<chp.e> g = a("axolotl", bx.b.a(chp.e.f, $$0 -> $$0 instanceof chp $$1 ? Optional.of($$1.go()) : Optional.empty()));
   public static final bx.b<cpx.b> h = a("boat", bx.b.a(cpx.b.j, $$0 -> $$0 instanceof cpx $$1 ? Optional.of($$1.w()) : Optional.empty()));
   public static final bx.b<cgn.v> i = a("fox", bx.b.a(cgn.v.c, $$0 -> $$0 instanceof cgn $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bx.b<cgq.a> j = a("mooshroom", bx.b.a(cgq.a.c, $$0 -> $$0 instanceof cgq $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bx.b<cgx.g> k = a("rabbit", bx.b.a(cgx.g.h, $$0 -> $$0 instanceof cgx $$1 ? Optional.of($$1.go()) : Optional.empty()));
   public static final bx.b<ciq> l = a("horse", bx.b.a(ciq.h, $$0 -> $$0 instanceof cij $$1 ? Optional.of($$1.q()) : Optional.empty()));
   public static final bx.b<cik.d> m = a("llama", bx.b.a(cik.d.e, $$0 -> $$0 instanceof cik $$1 ? Optional.of($$1.gB()) : Optional.empty()));
   public static final bx.b<cnp> n = a("villager", bx.b.a(lv.w.q(), $$0 -> $$0 instanceof cnm $$1 ? Optional.of($$1.a()) : Optional.empty()));
   public static final bx.b<cgt.b> o = a("parrot", bx.b.a(cgt.b.f, $$0 -> $$0 instanceof cgt $$1 ? Optional.of($$1.gC()) : Optional.empty()));
   public static final bx.b<chd.b> p = a("tropical_fish", bx.b.a(chd.b.m, $$0 -> $$0 instanceof chd $$1 ? Optional.of($$1.gz()) : Optional.empty()));
   public static final bx.a<ckd> q = a("painting", bx.a.a(lw.X, $$0 -> $$0 instanceof ckc $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bx.a<cgh> r = a("cat", bx.a.a(lw.l, $$0 -> $$0 instanceof cgg $$1 ? Optional.of($$1.gA()) : Optional.empty()));
   public static final bx.a<cgo> s = a("frog", bx.a.a(lw.F, $$0 -> $$0 instanceof chx $$1 ? Optional.of($$1.y()) : Optional.empty()));
   public static final bx.a<chh> t = a("wolf", bx.a.a(lw.m, $$0 -> $$0 instanceof chg $$1 ? Optional.of($$1.gB()) : Optional.empty()));

   private static <T extends bw> MapCodec<T> a(String $$0, MapCodec<T> $$1) {
      return kb.a(lv.aq, $$0, $$1);
   }

   private static <V> bx.b<V> a(String $$0, bx.b<V> $$1) {
      kb.a(lv.aq, $$0, $$1.a);
      return $$1;
   }

   private static <V> bx.a<V> a(String $$0, bx.a<V> $$1) {
      kb.a(lv.aq, $$0, $$1.a);
      return $$1;
   }

   public static MapCodec<? extends bw> a(kb<MapCodec<? extends bw>> $$0) {
      return a;
   }

   public static bw a(jo<cgh> $$0) {
      return r.a(js.a($$0));
   }

   public static bw b(jo<cgo> $$0) {
      return s.a(js.a($$0));
   }

   public static bw a(js<chh> $$0) {
      return t.a($$0);
   }

   public static class a<V> {
      final MapCodec<bx.a<V>.a> a;
      final Function<btr, Optional<jo<V>>> b;

      public static <V> bx.a<V> a(ald<? extends kb<V>> $$0, Function<btr, Optional<jo<V>>> $$1) {
         return new bx.a<>($$0, $$1);
      }

      public a(ald<? extends kb<V>> $$0, Function<btr, Optional<jo<V>>> $$1) {
         this.b = $$1;
         this.a = RecordCodecBuilder.mapCodec(
            $$1x -> $$1x.group(kd.a($$0).fieldOf("variant").forGetter($$0xx -> $$0xx.c)).apply($$1x, $$0xx -> new bx.a.a($$0xx))
         );
      }

      public bw a(js<V> $$0) {
         return new bx.a.a($$0);
      }

      class a implements bw {
         final js<V> c;

         a(final js<V> $$0) {
            this.c = $$0;
         }

         @Override
         public MapCodec<bx.a<V>.a> a() {
            return a.this.a;
         }

         @Override
         public boolean a(btr $$0, arj $$1, @Nullable eyw $$2) {
            return a.this.b.apply($$0).filter(this.c::a).isPresent();
         }
      }
   }

   public static class b<V> {
      final MapCodec<bx.b<V>.a> a;
      final Function<btr, Optional<V>> b;

      public static <V> bx.b<V> a(kb<V> $$0, Function<btr, Optional<V>> $$1) {
         return new bx.b<>($$0.q(), $$1);
      }

      public static <V> bx.b<V> a(Codec<V> $$0, Function<btr, Optional<V>> $$1) {
         return new bx.b<>($$0, $$1);
      }

      public b(Codec<V> $$0, Function<btr, Optional<V>> $$1) {
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
         public boolean a(btr $$0, arj $$1, @Nullable eyw $$2) {
            return b.this.b.apply($$0).filter(this.c::equals).isPresent();
         }
      }
   }
}
