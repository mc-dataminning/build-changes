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
   public static final bz.b<cje.e> g = a("axolotl", bz.b.a(cje.e.f, $$0 -> $$0 instanceof cje $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bz.b<chz.v> h = a("fox", bz.b.a(chz.v.c, $$0 -> $$0 instanceof chz $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bz.b<cic.a> i = a("mooshroom", bz.b.a(cic.a.c, $$0 -> $$0 instanceof cic $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bz.b<cil.g> j = a("rabbit", bz.b.a(cil.g.h, $$0 -> $$0 instanceof cil $$1 ? Optional.of($$1.gs()) : Optional.empty()));
   public static final bz.b<ckf> k = a("horse", bz.b.a(ckf.h, $$0 -> $$0 instanceof cjy $$1 ? Optional.of($$1.q()) : Optional.empty()));
   public static final bz.b<cjz.d> l = a("llama", bz.b.a(cjz.d.e, $$0 -> $$0 instanceof cjz $$1 ? Optional.of($$1.gF()) : Optional.empty()));
   public static final bz.b<cpi> m = a("villager", bz.b.a(mb.w.q(), $$0 -> $$0 instanceof cpf $$1 ? Optional.of($$1.a()) : Optional.empty()));
   public static final bz.b<cif.b> n = a("parrot", bz.b.a(cif.b.f, $$0 -> $$0 instanceof cif $$1 ? Optional.of($$1.gG()) : Optional.empty()));
   public static final bz.b<cim.a> o = a("salmon", bz.b.a(cim.a.d, $$0 -> $$0 instanceof cim $$1 ? Optional.of($$1.gy()) : Optional.empty()));
   public static final bz.b<cis.b> p = a("tropical_fish", bz.b.a(cis.b.m, $$0 -> $$0 instanceof cis $$1 ? Optional.of($$1.gA()) : Optional.empty()));
   public static final bz.a<cls> q = a("painting", bz.a.a(mc.X, $$0 -> $$0 instanceof clr $$1 ? Optional.of($$1.m()) : Optional.empty()));
   public static final bz.a<cht> r = a("cat", bz.a.a(mc.l, $$0 -> $$0 instanceof chs $$1 ? Optional.of($$1.gE()) : Optional.empty()));
   public static final bz.a<cia> s = a("frog", bz.a.a(mc.F, $$0 -> $$0 instanceof cjm $$1 ? Optional.of($$1.x()) : Optional.empty()));
   public static final bz.a<ciw> t = a("wolf", bz.a.a(mc.m, $$0 -> $$0 instanceof civ $$1 ? Optional.of($$1.gF()) : Optional.empty()));
   public static final bz.a<cih> u = a("pig", bz.a.a(mc.aU, $$0 -> $$0 instanceof cig $$1 ? Optional.of($$1.t()) : Optional.empty()));

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

   public static by a(jr<cht> $$0) {
      return r.a(jv.a($$0));
   }

   public static by b(jr<cia> $$0) {
      return s.a(jv.a($$0));
   }

   public static by a(jv<ciw> $$0) {
      return t.a($$0);
   }

   public static class a<V> {
      final MapCodec<bz.a<V>.a> a;
      final Function<bva, Optional<jr<V>>> b;

      public static <V> bz.a<V> a(akt<? extends ke<V>> $$0, Function<bva, Optional<jr<V>>> $$1) {
         return new bz.a<>($$0, $$1);
      }

      public a(akt<? extends ke<V>> $$0, Function<bva, Optional<jr<V>>> $$1) {
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
         public boolean a(bva $$0, ard $$1, @Nullable fbx $$2) {
            return a.this.b.apply($$0).filter(this.c::a).isPresent();
         }
      }
   }

   public static class b<V> {
      final MapCodec<bz.b<V>.a> a;
      final Function<bva, Optional<V>> b;

      public static <V> bz.b<V> a(ke<V> $$0, Function<bva, Optional<V>> $$1) {
         return new bz.b<>($$0.q(), $$1);
      }

      public static <V> bz.b<V> a(Codec<V> $$0, Function<bva, Optional<V>> $$1) {
         return new bz.b<>($$0, $$1);
      }

      public b(Codec<V> $$0, Function<bva, Optional<V>> $$1) {
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
         public boolean a(bva $$0, ard $$1, @Nullable fbx $$2) {
            return b.this.b.apply($$0).filter(this.c::equals).isPresent();
         }
      }
   }
}
