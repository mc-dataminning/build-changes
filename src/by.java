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
   public static final by.b<cih.e> g = a("axolotl", by.b.a(cih.e.f, $$0 -> $$0 instanceof cih $$1 ? Optional.of($$1.gv()) : Optional.empty()));
   public static final by.b<cqq.b> h = a("boat", by.b.a(cqq.b.j, $$0 -> $$0 instanceof cqq $$1 ? Optional.of($$1.w()) : Optional.empty()));
   public static final by.b<chf.v> i = a("fox", by.b.a(chf.v.c, $$0 -> $$0 instanceof chf $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final by.b<chi.a> j = a("mooshroom", by.b.a(chi.a.c, $$0 -> $$0 instanceof chi $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final by.b<chp.g> k = a("rabbit", by.b.a(chp.g.h, $$0 -> $$0 instanceof chp $$1 ? Optional.of($$1.gv()) : Optional.empty()));
   public static final by.b<cji> l = a("horse", by.b.a(cji.h, $$0 -> $$0 instanceof cjb $$1 ? Optional.of($$1.q()) : Optional.empty()));
   public static final by.b<cjc.d> m = a("llama", by.b.a(cjc.d.e, $$0 -> $$0 instanceof cjc $$1 ? Optional.of($$1.gI()) : Optional.empty()));
   public static final by.b<coh> n = a("villager", by.b.a(lz.w.q(), $$0 -> $$0 instanceof coe $$1 ? Optional.of($$1.a()) : Optional.empty()));
   public static final by.b<chl.b> o = a("parrot", by.b.a(chl.b.f, $$0 -> $$0 instanceof chl $$1 ? Optional.of($$1.gJ()) : Optional.empty()));
   public static final by.b<chq.a> p = a("salmon", by.b.a(chq.a.d, $$0 -> $$0 instanceof chq $$1 ? Optional.of($$1.gE()) : Optional.empty()));
   public static final by.b<chv.b> q = a("tropical_fish", by.b.a(chv.b.m, $$0 -> $$0 instanceof chv $$1 ? Optional.of($$1.gG()) : Optional.empty()));
   public static final by.a<ckv> r = a("painting", by.a.a(ma.X, $$0 -> $$0 instanceof cku $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final by.a<cgz> s = a("cat", by.a.a(ma.l, $$0 -> $$0 instanceof cgy $$1 ? Optional.of($$1.gH()) : Optional.empty()));
   public static final by.a<chg> t = a("frog", by.a.a(ma.F, $$0 -> $$0 instanceof cip $$1 ? Optional.of($$1.y()) : Optional.empty()));
   public static final by.a<chz> u = a("wolf", by.a.a(ma.m, $$0 -> $$0 instanceof chy $$1 ? Optional.of($$1.gI()) : Optional.empty()));

   private static <T extends bx> MapCodec<T> a(String $$0, MapCodec<T> $$1) {
      return kd.a(lz.ap, $$0, $$1);
   }

   private static <V> by.b<V> a(String $$0, by.b<V> $$1) {
      kd.a(lz.ap, $$0, $$1.a);
      return $$1;
   }

   private static <V> by.a<V> a(String $$0, by.a<V> $$1) {
      kd.a(lz.ap, $$0, $$1.a);
      return $$1;
   }

   public static MapCodec<? extends bx> a(kd<MapCodec<? extends bx>> $$0) {
      return a;
   }

   public static bx a(jq<cgz> $$0) {
      return s.a(ju.a($$0));
   }

   public static bx b(jq<chg> $$0) {
      return t.a(ju.a($$0));
   }

   public static bx a(ju<chz> $$0) {
      return u.a($$0);
   }

   public static class a<V> {
      final MapCodec<by.a<V>.a> a;
      final Function<bui, Optional<jq<V>>> b;

      public static <V> by.a<V> a(alk<? extends kd<V>> $$0, Function<bui, Optional<jq<V>>> $$1) {
         return new by.a<>($$0, $$1);
      }

      public a(alk<? extends kd<V>> $$0, Function<bui, Optional<jq<V>>> $$1) {
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
         public boolean a(bui $$0, arq $$1, @Nullable ezr $$2) {
            return a.this.b.apply($$0).filter(this.c::a).isPresent();
         }
      }
   }

   public static class b<V> {
      final MapCodec<by.b<V>.a> a;
      final Function<bui, Optional<V>> b;

      public static <V> by.b<V> a(kd<V> $$0, Function<bui, Optional<V>> $$1) {
         return new by.b<>($$0.q(), $$1);
      }

      public static <V> by.b<V> a(Codec<V> $$0, Function<bui, Optional<V>> $$1) {
         return new by.b<>($$0, $$1);
      }

      public b(Codec<V> $$0, Function<bui, Optional<V>> $$1) {
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
         public boolean a(bui $$0, arq $$1, @Nullable ezr $$2) {
            return b.this.b.apply($$0).filter(this.c::equals).isPresent();
         }
      }
   }
}
