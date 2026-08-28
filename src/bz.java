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
   public static final bz.b<cij.e> g = a("axolotl", bz.b.a(cij.e.f, $$0 -> $$0 instanceof cij $$1 ? Optional.of($$1.gs()) : Optional.empty()));
   public static final bz.b<chh.v> h = a("fox", bz.b.a(chh.v.c, $$0 -> $$0 instanceof chh $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bz.b<chk.a> i = a("mooshroom", bz.b.a(chk.a.c, $$0 -> $$0 instanceof chk $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bz.b<chr.g> j = a("rabbit", bz.b.a(chr.g.h, $$0 -> $$0 instanceof chr $$1 ? Optional.of($$1.gs()) : Optional.empty()));
   public static final bz.b<cjk> k = a("horse", bz.b.a(cjk.h, $$0 -> $$0 instanceof cjd $$1 ? Optional.of($$1.p()) : Optional.empty()));
   public static final bz.b<cje.d> l = a("llama", bz.b.a(cje.d.e, $$0 -> $$0 instanceof cje $$1 ? Optional.of($$1.gF()) : Optional.empty()));
   public static final bz.b<com> m = a("villager", bz.b.a(mb.w.q(), $$0 -> $$0 instanceof coj $$1 ? Optional.of($$1.a()) : Optional.empty()));
   public static final bz.b<chn.b> n = a("parrot", bz.b.a(chn.b.f, $$0 -> $$0 instanceof chn $$1 ? Optional.of($$1.gG()) : Optional.empty()));
   public static final bz.b<chs.a> o = a("salmon", bz.b.a(chs.a.d, $$0 -> $$0 instanceof chs $$1 ? Optional.of($$1.gA()) : Optional.empty()));
   public static final bz.b<chx.b> p = a("tropical_fish", bz.b.a(chx.b.m, $$0 -> $$0 instanceof chx $$1 ? Optional.of($$1.gC()) : Optional.empty()));
   public static final bz.a<ckx> q = a("painting", bz.a.a(mc.X, $$0 -> $$0 instanceof ckw $$1 ? Optional.of($$1.s()) : Optional.empty()));
   public static final bz.a<chb> r = a("cat", bz.a.a(mc.l, $$0 -> $$0 instanceof cha $$1 ? Optional.of($$1.gE()) : Optional.empty()));
   public static final bz.a<chi> s = a("frog", bz.a.a(mc.F, $$0 -> $$0 instanceof cir $$1 ? Optional.of($$1.x()) : Optional.empty()));
   public static final bz.a<cib> t = a("wolf", bz.a.a(mc.m, $$0 -> $$0 instanceof cia $$1 ? Optional.of($$1.gF()) : Optional.empty()));

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

   public static by a(jr<chb> $$0) {
      return r.a(jv.a($$0));
   }

   public static by b(jr<chi> $$0) {
      return s.a(jv.a($$0));
   }

   public static by a(jv<cib> $$0) {
      return t.a($$0);
   }

   public static class a<V> {
      final MapCodec<bz.a<V>.a> a;
      final Function<buk, Optional<jr<V>>> b;

      public static <V> bz.a<V> a(aku<? extends ke<V>> $$0, Function<buk, Optional<jr<V>>> $$1) {
         return new bz.a<>($$0, $$1);
      }

      public a(aku<? extends ke<V>> $$0, Function<buk, Optional<jr<V>>> $$1) {
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
         public boolean a(buk $$0, ard $$1, @Nullable faz $$2) {
            return a.this.b.apply($$0).filter(this.c::a).isPresent();
         }
      }
   }

   public static class b<V> {
      final MapCodec<bz.b<V>.a> a;
      final Function<buk, Optional<V>> b;

      public static <V> bz.b<V> a(ke<V> $$0, Function<buk, Optional<V>> $$1) {
         return new bz.b<>($$0.q(), $$1);
      }

      public static <V> bz.b<V> a(Codec<V> $$0, Function<buk, Optional<V>> $$1) {
         return new bz.b<>($$0, $$1);
      }

      public b(Codec<V> $$0, Function<buk, Optional<V>> $$1) {
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
         public boolean a(buk $$0, ard $$1, @Nullable faz $$2) {
            return b.this.b.apply($$0).filter(this.c::equals).isPresent();
         }
      }
   }
}
