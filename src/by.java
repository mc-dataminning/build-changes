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
   public static final by.b<cid.e> g = a("axolotl", by.b.a(cid.e.f, $$0 -> $$0 instanceof cid $$1 ? Optional.of($$1.gu()) : Optional.empty()));
   public static final by.b<cqm.b> h = a("boat", by.b.a(cqm.b.j, $$0 -> $$0 instanceof cqm $$1 ? Optional.of($$1.w()) : Optional.empty()));
   public static final by.b<chb.v> i = a("fox", by.b.a(chb.v.c, $$0 -> $$0 instanceof chb $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final by.b<che.a> j = a("mooshroom", by.b.a(che.a.c, $$0 -> $$0 instanceof che $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final by.b<chl.g> k = a("rabbit", by.b.a(chl.g.h, $$0 -> $$0 instanceof chl $$1 ? Optional.of($$1.gu()) : Optional.empty()));
   public static final by.b<cje> l = a("horse", by.b.a(cje.h, $$0 -> $$0 instanceof cix $$1 ? Optional.of($$1.q()) : Optional.empty()));
   public static final by.b<ciy.d> m = a("llama", by.b.a(ciy.d.e, $$0 -> $$0 instanceof ciy $$1 ? Optional.of($$1.gH()) : Optional.empty()));
   public static final by.b<cod> n = a("villager", by.b.a(ly.w.q(), $$0 -> $$0 instanceof coa $$1 ? Optional.of($$1.a()) : Optional.empty()));
   public static final by.b<chh.b> o = a("parrot", by.b.a(chh.b.f, $$0 -> $$0 instanceof chh $$1 ? Optional.of($$1.gI()) : Optional.empty()));
   public static final by.b<chm.a> p = a("salmon", by.b.a(chm.a.d, $$0 -> $$0 instanceof chm $$1 ? Optional.of($$1.gD()) : Optional.empty()));
   public static final by.b<chr.b> q = a("tropical_fish", by.b.a(chr.b.m, $$0 -> $$0 instanceof chr $$1 ? Optional.of($$1.gF()) : Optional.empty()));
   public static final by.a<ckr> r = a("painting", by.a.a(lz.X, $$0 -> $$0 instanceof ckq $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final by.a<cgv> s = a("cat", by.a.a(lz.l, $$0 -> $$0 instanceof cgu $$1 ? Optional.of($$1.gG()) : Optional.empty()));
   public static final by.a<chc> t = a("frog", by.a.a(lz.F, $$0 -> $$0 instanceof cil $$1 ? Optional.of($$1.y()) : Optional.empty()));
   public static final by.a<chv> u = a("wolf", by.a.a(lz.m, $$0 -> $$0 instanceof chu $$1 ? Optional.of($$1.gH()) : Optional.empty()));

   private static <T extends bx> MapCodec<T> a(String $$0, MapCodec<T> $$1) {
      return kd.a(ly.ap, $$0, $$1);
   }

   private static <V> by.b<V> a(String $$0, by.b<V> $$1) {
      kd.a(ly.ap, $$0, $$1.a);
      return $$1;
   }

   private static <V> by.a<V> a(String $$0, by.a<V> $$1) {
      kd.a(ly.ap, $$0, $$1.a);
      return $$1;
   }

   public static MapCodec<? extends bx> a(kd<MapCodec<? extends bx>> $$0) {
      return a;
   }

   public static bx a(jq<cgv> $$0) {
      return s.a(ju.a($$0));
   }

   public static bx b(jq<chc> $$0) {
      return t.a(ju.a($$0));
   }

   public static bx a(ju<chv> $$0) {
      return u.a($$0);
   }

   public static class a<V> {
      final MapCodec<by.a<V>.a> a;
      final Function<bue, Optional<jq<V>>> b;

      public static <V> by.a<V> a(alh<? extends kd<V>> $$0, Function<bue, Optional<jq<V>>> $$1) {
         return new by.a<>($$0, $$1);
      }

      public a(alh<? extends kd<V>> $$0, Function<bue, Optional<jq<V>>> $$1) {
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
         public boolean a(bue $$0, arn $$1, @Nullable ezn $$2) {
            return a.this.b.apply($$0).filter(this.c::a).isPresent();
         }
      }
   }

   public static class b<V> {
      final MapCodec<by.b<V>.a> a;
      final Function<bue, Optional<V>> b;

      public static <V> by.b<V> a(kd<V> $$0, Function<bue, Optional<V>> $$1) {
         return new by.b<>($$0.q(), $$1);
      }

      public static <V> by.b<V> a(Codec<V> $$0, Function<bue, Optional<V>> $$1) {
         return new by.b<>($$0, $$1);
      }

      public b(Codec<V> $$0, Function<bue, Optional<V>> $$1) {
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
         public boolean a(bue $$0, arn $$1, @Nullable ezn $$2) {
            return b.this.b.apply($$0).filter(this.c::equals).isPresent();
         }
      }
   }
}
