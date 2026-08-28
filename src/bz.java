import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bz {
   public static final MapCodec<dg> a = a("lightning", dg.b);
   public static final MapCodec<cd> b = a("fishing_hook", cd.c);
   public static final MapCodec<ds> c = a("player", ds.c);
   public static final MapCodec<ec> d = a("slime", ec.b);
   public static final MapCodec<du> e = a("raider", du.b);
   public static final MapCodec<dx> f = a("sheep", dx.b);
   public static final bz.b<cik.e> g = a("axolotl", bz.b.a(cik.e.f, $$0 -> $$0 instanceof cik $$1 ? Optional.of($$1.gs()) : Optional.empty()));
   public static final bz.b<chi.v> h = a("fox", bz.b.a(chi.v.c, $$0 -> $$0 instanceof chi $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bz.b<chl.a> i = a("mooshroom", bz.b.a(chl.a.c, $$0 -> $$0 instanceof chl $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bz.b<chs.g> j = a("rabbit", bz.b.a(chs.g.h, $$0 -> $$0 instanceof chs $$1 ? Optional.of($$1.gs()) : Optional.empty()));
   public static final bz.b<cjl> k = a("horse", bz.b.a(cjl.h, $$0 -> $$0 instanceof cje $$1 ? Optional.of($$1.p()) : Optional.empty()));
   public static final bz.b<cjf.d> l = a("llama", bz.b.a(cjf.d.e, $$0 -> $$0 instanceof cjf $$1 ? Optional.of($$1.gF()) : Optional.empty()));
   public static final bz.b<coo> m = a("villager", bz.b.a(mb.w.q(), $$0 -> $$0 instanceof cok $$1 ? Optional.of($$1.a()) : Optional.empty()));
   public static final bz.b<cho.b> n = a("parrot", bz.b.a(cho.b.f, $$0 -> $$0 instanceof cho $$1 ? Optional.of($$1.gG()) : Optional.empty()));
   public static final bz.b<cht.a> o = a("salmon", bz.b.a(cht.a.d, $$0 -> $$0 instanceof cht $$1 ? Optional.of($$1.gA()) : Optional.empty()));
   public static final bz.b<chy.b> p = a("tropical_fish", bz.b.a(chy.b.m, $$0 -> $$0 instanceof chy $$1 ? Optional.of($$1.gC()) : Optional.empty()));
   public static final bz.a<cky> q = a("painting", bz.a.a(mc.X, $$0 -> $$0 instanceof ckx $$1 ? Optional.of($$1.s()) : Optional.empty()));
   public static final bz.a<chc> r = a("cat", bz.a.a(mc.l, $$0 -> $$0 instanceof chb $$1 ? Optional.of($$1.gE()) : Optional.empty()));
   public static final bz.a<chj> s = a("frog", bz.a.a(mc.F, $$0 -> $$0 instanceof cis $$1 ? Optional.of($$1.x()) : Optional.empty()));
   public static final bz.a<cic> t = a("wolf", bz.a.a(mc.m, $$0 -> $$0 instanceof cib $$1 ? Optional.of($$1.gF()) : Optional.empty()));

   private static <T extends by> MapCodec<T> a(String $$0, MapCodec<T> $$1) {
      return ke.a(mb.ap, $$0, $$1);
   }

   private static <V> bz.b<V> a(String $$0, bz.b<V> $$1) {
      ke.a(mb.ap, $$0, $$1.a);
      return $$1;
   }

   private static <V> bz.a<V> a(String $$0, bz.a<V> $$1) {
      ke.a(mb.ap, $$0, $$1.a);
      return $$1;
   }

   public static MapCodec<? extends by> a(ke<MapCodec<? extends by>> $$0) {
      return a;
   }

   public static by a(jr<chc> $$0) {
      return r.a(jv.a($$0));
   }

   public static by b(jr<chj> $$0) {
      return s.a(jv.a($$0));
   }

   public static by a(jv<cic> $$0) {
      return t.a($$0);
   }

   public static class a<V> {
      final MapCodec<bz.a<V>.a> a;
      final Function<bul, Optional<jr<V>>> b;

      public static <V> bz.a<V> a(aku<? extends ke<V>> $$0, Function<bul, Optional<jr<V>>> $$1) {
         return new bz.a<>($$0, $$1);
      }

      public a(aku<? extends ke<V>> $$0, Function<bul, Optional<jr<V>>> $$1) {
         this.b = $$1;
         this.a = RecordCodecBuilder.mapCodec(
            $$1x -> $$1x.group(kg.a($$0).fieldOf("variant").forGetter($$0xx -> $$0xx.c)).apply($$1x, $$0xx -> new bz.a.a($$0xx))
         );
      }

      public by a(jv<V> $$0) {
         return new bz.a.a($$0);
      }

      class a implements by {
         final jv<V> c;

         a(final jv<V> $$0) {
            this.c = $$0;
         }

         @Override
         public MapCodec<bz.a<V>.a> a() {
            return a.this.a;
         }

         @Override
         public boolean a(bul $$0, ard $$1, @Nullable fba $$2) {
            return a.this.b.apply($$0).filter(this.c::a).isPresent();
         }
      }
   }

   public static class b<V> {
      final MapCodec<bz.b<V>.a> a;
      final Function<bul, Optional<V>> b;

      public static <V> bz.b<V> a(ke<V> $$0, Function<bul, Optional<V>> $$1) {
         return new bz.b<>($$0.q(), $$1);
      }

      public static <V> bz.b<V> a(Codec<V> $$0, Function<bul, Optional<V>> $$1) {
         return new bz.b<>($$0, $$1);
      }

      public b(Codec<V> $$0, Function<bul, Optional<V>> $$1) {
         this.b = $$1;
         this.a = RecordCodecBuilder.mapCodec($$1x -> $$1x.group($$0.fieldOf("variant").forGetter($$0xx -> $$0xx.c)).apply($$1x, $$0xx -> new bz.b.a($$0xx)));
      }

      public by a(V $$0) {
         return new bz.b.a($$0);
      }

      class a implements by {
         final V c;

         a(final V $$0) {
            this.c = $$0;
         }

         @Override
         public MapCodec<bz.b<V>.a> a() {
            return b.this.a;
         }

         @Override
         public boolean a(bul $$0, ard $$1, @Nullable fba $$2) {
            return b.this.b.apply($$0).filter(this.c::equals).isPresent();
         }
      }
   }
}
