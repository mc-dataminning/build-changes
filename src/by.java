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
   public static final by.b<cik.e> g = a("axolotl", by.b.a(cik.e.f, $$0 -> $$0 instanceof cik $$1 ? Optional.of($$1.gm()) : Optional.empty()));
   public static final by.b<chi.v> h = a("fox", by.b.a(chi.v.c, $$0 -> $$0 instanceof chi $$1 ? Optional.of($$1.q()) : Optional.empty()));
   public static final by.b<chl.a> i = a("mooshroom", by.b.a(chl.a.c, $$0 -> $$0 instanceof chl $$1 ? Optional.of($$1.q()) : Optional.empty()));
   public static final by.b<chs.g> j = a("rabbit", by.b.a(chs.g.h, $$0 -> $$0 instanceof chs $$1 ? Optional.of($$1.gm()) : Optional.empty()));
   public static final by.b<cjl> k = a("horse", by.b.a(cjl.h, $$0 -> $$0 instanceof cje $$1 ? Optional.of($$1.n()) : Optional.empty()));
   public static final by.b<cjf.d> l = a("llama", by.b.a(cjf.d.e, $$0 -> $$0 instanceof cjf $$1 ? Optional.of($$1.gz()) : Optional.empty()));
   public static final by.b<cok> m = a("villager", by.b.a(lz.w.q(), $$0 -> $$0 instanceof coh $$1 ? Optional.of($$1.a()) : Optional.empty()));
   public static final by.b<cho.b> n = a("parrot", by.b.a(cho.b.f, $$0 -> $$0 instanceof cho $$1 ? Optional.of($$1.gA()) : Optional.empty()));
   public static final by.b<cht.a> o = a("salmon", by.b.a(cht.a.d, $$0 -> $$0 instanceof cht $$1 ? Optional.of($$1.gv()) : Optional.empty()));
   public static final by.b<chy.b> p = a("tropical_fish", by.b.a(chy.b.m, $$0 -> $$0 instanceof chy $$1 ? Optional.of($$1.gx()) : Optional.empty()));
   public static final by.a<cky> q = a("painting", by.a.a(ma.X, $$0 -> $$0 instanceof ckx $$1 ? Optional.of($$1.q()) : Optional.empty()));
   public static final by.a<chc> r = a("cat", by.a.a(ma.l, $$0 -> $$0 instanceof chb $$1 ? Optional.of($$1.gy()) : Optional.empty()));
   public static final by.a<chj> s = a("frog", by.a.a(ma.F, $$0 -> $$0 instanceof cis $$1 ? Optional.of($$1.v()) : Optional.empty()));
   public static final by.a<cic> t = a("wolf", by.a.a(ma.m, $$0 -> $$0 instanceof cib $$1 ? Optional.of($$1.gz()) : Optional.empty()));

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

   public static bx a(jq<chc> $$0) {
      return r.a(ju.a($$0));
   }

   public static bx b(jq<chj> $$0) {
      return s.a(ju.a($$0));
   }

   public static bx a(ju<cic> $$0) {
      return t.a($$0);
   }

   public static class a<V> {
      final MapCodec<by.a<V>.a> a;
      final Function<bul, Optional<jq<V>>> b;

      public static <V> by.a<V> a(ali<? extends kd<V>> $$0, Function<bul, Optional<jq<V>>> $$1) {
         return new by.a<>($$0, $$1);
      }

      public a(ali<? extends kd<V>> $$0, Function<bul, Optional<jq<V>>> $$1) {
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
         public boolean a(bul $$0, arp $$1, @Nullable ezy $$2) {
            return a.this.b.apply($$0).filter(this.c::a).isPresent();
         }
      }
   }

   public static class b<V> {
      final MapCodec<by.b<V>.a> a;
      final Function<bul, Optional<V>> b;

      public static <V> by.b<V> a(kd<V> $$0, Function<bul, Optional<V>> $$1) {
         return new by.b<>($$0.q(), $$1);
      }

      public static <V> by.b<V> a(Codec<V> $$0, Function<bul, Optional<V>> $$1) {
         return new by.b<>($$0, $$1);
      }

      public b(Codec<V> $$0, Function<bul, Optional<V>> $$1) {
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
         public boolean a(bul $$0, arp $$1, @Nullable ezy $$2) {
            return b.this.b.apply($$0).filter(this.c::equals).isPresent();
         }
      }
   }
}
