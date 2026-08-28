import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class by {
   public static final MapCodec<df> a = a("lightning", df.b);
   public static final MapCodec<cc> b = a("fishing_hook", cc.c);
   public static final MapCodec<dr> c = a("player", dr.c);
   public static final MapCodec<eb> d = a("slime", eb.b);
   public static final MapCodec<dt> e = a("raider", dt.b);
   public static final MapCodec<dw> f = a("sheep", dw.b);
   public static final by.b<cja.e> g = a("axolotl", by.b.a(cja.e.f, $$0 -> $$0 instanceof cja $$1 ? Optional.of($$1.go()) : Optional.empty()));
   public static final by.b<chy.v> h = a("fox", by.b.a(chy.v.c, $$0 -> $$0 instanceof chy $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final by.b<cib.a> i = a("mooshroom", by.b.a(cib.a.c, $$0 -> $$0 instanceof cib $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final by.b<cii.g> j = a("rabbit", by.b.a(cii.g.h, $$0 -> $$0 instanceof cii $$1 ? Optional.of($$1.go()) : Optional.empty()));
   public static final by.b<ckb> k = a("horse", by.b.a(ckb.h, $$0 -> $$0 instanceof cju $$1 ? Optional.of($$1.p()) : Optional.empty()));
   public static final by.b<cjv.d> l = a("llama", by.b.a(cjv.d.e, $$0 -> $$0 instanceof cjv $$1 ? Optional.of($$1.gB()) : Optional.empty()));
   public static final by.b<cpf> m = a("villager", by.b.a(ma.w.q(), $$0 -> $$0 instanceof cpc $$1 ? Optional.of($$1.a()) : Optional.empty()));
   public static final by.b<cie.b> n = a("parrot", by.b.a(cie.b.f, $$0 -> $$0 instanceof cie $$1 ? Optional.of($$1.gC()) : Optional.empty()));
   public static final by.b<cij.a> o = a("salmon", by.b.a(cij.a.d, $$0 -> $$0 instanceof cij $$1 ? Optional.of($$1.gw()) : Optional.empty()));
   public static final by.b<cio.b> p = a("tropical_fish", by.b.a(cio.b.m, $$0 -> $$0 instanceof cio $$1 ? Optional.of($$1.gy()) : Optional.empty()));
   public static final by.a<clo> q = a("painting", by.a.a(mb.X, $$0 -> $$0 instanceof cln $$1 ? Optional.of($$1.s()) : Optional.empty()));
   public static final by.a<chs> r = a("cat", by.a.a(mb.l, $$0 -> $$0 instanceof chr $$1 ? Optional.of($$1.gA()) : Optional.empty()));
   public static final by.a<chz> s = a("frog", by.a.a(mb.F, $$0 -> $$0 instanceof cji $$1 ? Optional.of($$1.x()) : Optional.empty()));
   public static final by.a<cis> t = a("wolf", by.a.a(mb.m, $$0 -> $$0 instanceof cir $$1 ? Optional.of($$1.gB()) : Optional.empty()));

   private static <T extends bx> MapCodec<T> a(String $$0, MapCodec<T> $$1) {
      return kd.a(ma.ap, $$0, $$1);
   }

   private static <V> by.b<V> a(String $$0, by.b<V> $$1) {
      kd.a(ma.ap, $$0, $$1.a);
      return $$1;
   }

   private static <V> by.a<V> a(String $$0, by.a<V> $$1) {
      kd.a(ma.ap, $$0, $$1.a);
      return $$1;
   }

   public static MapCodec<? extends bx> a(kd<MapCodec<? extends bx>> $$0) {
      return a;
   }

   public static bx a(jq<chs> $$0) {
      return r.a(ju.a($$0));
   }

   public static bx b(jq<chz> $$0) {
      return s.a(ju.a($$0));
   }

   public static bx a(ju<cis> $$0) {
      return t.a($$0);
   }

   public static class a<V> {
      final MapCodec<by.a<V>.a> a;
      final Function<bvb, Optional<jq<V>>> b;

      public static <V> by.a<V> a(alo<? extends kd<V>> $$0, Function<bvb, Optional<jq<V>>> $$1) {
         return new by.a<>($$0, $$1);
      }

      public a(alo<? extends kd<V>> $$0, Function<bvb, Optional<jq<V>>> $$1) {
         this.b = $$1;
         this.a = RecordCodecBuilder.mapCodec(
            $$1x -> $$1x.group(kf.a($$0).fieldOf("variant").forGetter($$0xx -> $$0xx.c)).apply($$1x, $$0xx -> new by.a.a($$0xx))
         );
      }

      public bx a(ju<V> $$0) {
         return new by.a.a($$0);
      }

      class a implements bx {
         final ju<V> c;

         a(final ju<V> $$0) {
            this.c = $$0;
         }

         @Override
         public MapCodec<by.a<V>.a> a() {
            return a.this.a;
         }

         @Override
         public boolean a(bvb $$0, arx $$1, @Nullable fbr $$2) {
            return a.this.b.apply($$0).filter(this.c::a).isPresent();
         }
      }
   }

   public static class b<V> {
      final MapCodec<by.b<V>.a> a;
      final Function<bvb, Optional<V>> b;

      public static <V> by.b<V> a(kd<V> $$0, Function<bvb, Optional<V>> $$1) {
         return new by.b<>($$0.q(), $$1);
      }

      public static <V> by.b<V> a(Codec<V> $$0, Function<bvb, Optional<V>> $$1) {
         return new by.b<>($$0, $$1);
      }

      public b(Codec<V> $$0, Function<bvb, Optional<V>> $$1) {
         this.b = $$1;
         this.a = RecordCodecBuilder.mapCodec($$1x -> $$1x.group($$0.fieldOf("variant").forGetter($$0xx -> $$0xx.c)).apply($$1x, $$0xx -> new by.b.a($$0xx)));
      }

      public bx a(V $$0) {
         return new by.b.a($$0);
      }

      class a implements bx {
         final V c;

         a(final V $$0) {
            this.c = $$0;
         }

         @Override
         public MapCodec<by.b<V>.a> a() {
            return b.this.a;
         }

         @Override
         public boolean a(bvb $$0, arx $$1, @Nullable fbr $$2) {
            return b.this.b.apply($$0).filter(this.c::equals).isPresent();
         }
      }
   }
}
