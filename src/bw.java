import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bw {
   public static final MapCodec<da> a = a("lightning", da.b);
   public static final MapCodec<ca> b = a("fishing_hook", ca.c);
   public static final MapCodec<dk> c = a("player", dk.c);
   public static final MapCodec<du> d = a("slime", du.b);
   public static final MapCodec<dm> e = a("raider", dm.b);
   public static final bw.b<cgs.d> f = a("axolotl", bw.b.a(cgs.d.f, $$0 -> $$0 instanceof cgs $$1 ? Optional.of($$1.gq()) : Optional.empty()));
   public static final bw.b<cow.b> g = a("boat", bw.b.a(cow.b.j, $$0 -> $$0 instanceof cow $$1 ? Optional.of($$1.x()) : Optional.empty()));
   public static final bw.b<cfq.v> h = a("fox", bw.b.a(cfq.v.c, $$0 -> $$0 instanceof cfq $$1 ? Optional.of($$1.u()) : Optional.empty()));
   public static final bw.b<cft.a> i = a("mooshroom", bw.b.a(cft.a.c, $$0 -> $$0 instanceof cft $$1 ? Optional.of($$1.u()) : Optional.empty()));
   public static final bw.b<cga.g> j = a("rabbit", bw.b.a(cga.g.h, $$0 -> $$0 instanceof cga $$1 ? Optional.of($$1.gq()) : Optional.empty()));
   public static final bw.b<cht> k = a("horse", bw.b.a(cht.h, $$0 -> $$0 instanceof chm $$1 ? Optional.of($$1.s()) : Optional.empty()));
   public static final bw.b<chn.d> l = a("llama", bw.b.a(chn.d.e, $$0 -> $$0 instanceof chn $$1 ? Optional.of($$1.gC()) : Optional.empty()));
   public static final bw.b<cmq> m = a("villager", bw.b.a(lp.y.q(), $$0 -> $$0 instanceof cmn $$1 ? Optional.of($$1.a()) : Optional.empty()));
   public static final bw.b<cfw.b> n = a("parrot", bw.b.a(cfw.b.f, $$0 -> $$0 instanceof cfw $$1 ? Optional.of($$1.gy()) : Optional.empty()));
   public static final bw.b<cgg.b> o = a("tropical_fish", bw.b.a(cgg.b.m, $$0 -> $$0 instanceof cgg $$1 ? Optional.of($$1.gB()) : Optional.empty()));
   public static final bw.a<cje> p = a("painting", bw.a.a(lq.S, $$0 -> $$0 instanceof cjd $$1 ? Optional.of($$1.p()) : Optional.empty()));
   public static final bw.a<cfk> q = a("cat", bw.a.a(lq.l, $$0 -> $$0 instanceof cfj $$1 ? Optional.of($$1.gx()) : Optional.empty()));
   public static final bw.a<cfr> r = a("frog", bw.a.a(lq.B, $$0 -> $$0 instanceof cha $$1 ? Optional.of($$1.y()) : Optional.empty()));
   public static final bw.a<cgk> s = a("wolf", bw.a.a(lq.m, $$0 -> $$0 instanceof cgj $$1 ? Optional.of($$1.gx()) : Optional.empty()));

   private static <T extends bv> MapCodec<T> a(String $$0, MapCodec<T> $$1) {
      return jv.a(lp.at, $$0, $$1);
   }

   private static <V> bw.b<V> a(String $$0, bw.b<V> $$1) {
      jv.a(lp.at, $$0, $$1.a);
      return $$1;
   }

   private static <V> bw.a<V> a(String $$0, bw.a<V> $$1) {
      jv.a(lp.at, $$0, $$1.a);
      return $$1;
   }

   public static MapCodec<? extends bv> a(jv<MapCodec<? extends bv>> $$0) {
      return a;
   }

   public static bv a(ji<cfk> $$0) {
      return q.a(jm.a($$0));
   }

   public static bv b(ji<cfr> $$0) {
      return r.a(jm.a($$0));
   }

   public static bv a(jm<cgk> $$0) {
      return s.a($$0);
   }

   public static class a<V> {
      final MapCodec<bw.a<V>.a> a;
      final Function<bsv, Optional<ji<V>>> b;

      public static <V> bw.a<V> a(ale<? extends jv<V>> $$0, Function<bsv, Optional<ji<V>>> $$1) {
         return new bw.a<>($$0, $$1);
      }

      public a(ale<? extends jv<V>> $$0, Function<bsv, Optional<ji<V>>> $$1) {
         this.b = $$1;
         this.a = RecordCodecBuilder.mapCodec(
            $$1x -> $$1x.group(jx.a($$0).fieldOf("variant").forGetter($$0xx -> $$0xx.c)).apply($$1x, $$0xx -> new bw.a.a($$0xx))
         );
      }

      public bv a(jm<V> $$0) {
         return new bw.a.a($$0);
      }

      class a implements bv {
         final jm<V> c;

         a(final jm<V> $$0) {
            this.c = $$0;
         }

         @Override
         public MapCodec<bw.a<V>.a> a() {
            return a.this.a;
         }

         @Override
         public boolean a(bsv $$0, arf $$1, @Nullable evs $$2) {
            return a.this.b.apply($$0).filter(this.c::a).isPresent();
         }
      }
   }

   public static class b<V> {
      final MapCodec<bw.b<V>.a> a;
      final Function<bsv, Optional<V>> b;

      public static <V> bw.b<V> a(jv<V> $$0, Function<bsv, Optional<V>> $$1) {
         return new bw.b<>($$0.q(), $$1);
      }

      public static <V> bw.b<V> a(Codec<V> $$0, Function<bsv, Optional<V>> $$1) {
         return new bw.b<>($$0, $$1);
      }

      public b(Codec<V> $$0, Function<bsv, Optional<V>> $$1) {
         this.b = $$1;
         this.a = RecordCodecBuilder.mapCodec($$1x -> $$1x.group($$0.fieldOf("variant").forGetter($$0xx -> $$0xx.c)).apply($$1x, $$0xx -> new bw.b.a($$0xx)));
      }

      public bv a(V $$0) {
         return new bw.b.a($$0);
      }

      class a implements bv {
         final V c;

         a(final V $$0) {
            this.c = $$0;
         }

         @Override
         public MapCodec<bw.b<V>.a> a() {
            return b.this.a;
         }

         @Override
         public boolean a(bsv $$0, arf $$1, @Nullable evs $$2) {
            return b.this.b.apply($$0).filter(this.c::equals).isPresent();
         }
      }
   }
}
