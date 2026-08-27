import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bt {
   public static final MapCodec<co> a = a("lightning", co.b);
   public static final MapCodec<bw> b = a("fishing_hook", bw.c);
   public static final MapCodec<cy> c = a("player", cy.c);
   public static final MapCodec<dg> d = a("slime", dg.b);
   public static final bt.a<ccx> e = a("cat", bt.a.a(lc.ak, $$0 -> $$0 instanceof ccw $$1 ? Optional.of($$1.gw()) : Optional.empty()));
   public static final bt.a<cde> f = a("frog", bt.a.a(lc.al, $$0 -> $$0 instanceof cen $$1 ? Optional.of($$1.y()) : Optional.empty()));
   public static final bt.a<cef.d> g = a("axolotl", bt.a.a(cef.d.f, $$0 -> $$0 instanceof cef $$1 ? Optional.of($$1.gp()) : Optional.empty()));
   public static final bt.a<cmi.b> h = a("boat", bt.a.a(cmi.b.j, $$0 -> $$0 instanceof cmi $$1 ? Optional.of($$1.x()) : Optional.empty()));
   public static final bt.a<cdd.v> i = a("fox", bt.a.a(cdd.v.c, $$0 -> $$0 instanceof cdd $$1 ? Optional.of($$1.u()) : Optional.empty()));
   public static final bt.a<cdg.a> j = a("mooshroom", bt.a.a(cdg.a.c, $$0 -> $$0 instanceof cdg $$1 ? Optional.of($$1.u()) : Optional.empty()));
   public static final bt.a<iv<cgr>> k = a("painting", bt.a.a(lc.l.r(), $$0 -> $$0 instanceof cgq $$1 ? Optional.of($$1.p()) : Optional.empty()));
   public static final bt.a<cdn.g> l = a("rabbit", bt.a.a(cdn.g.h, $$0 -> $$0 instanceof cdn $$1 ? Optional.of($$1.gp()) : Optional.empty()));
   public static final bt.a<cfg> m = a("horse", bt.a.a(cfg.h, $$0 -> $$0 instanceof cez $$1 ? Optional.of($$1.r()) : Optional.empty()));
   public static final bt.a<cfa.d> n = a("llama", bt.a.a(cfa.d.e, $$0 -> $$0 instanceof cfa $$1 ? Optional.of($$1.gB()) : Optional.empty()));
   public static final bt.a<ckd> o = a("villager", bt.a.a(lc.y.q(), $$0 -> $$0 instanceof cka $$1 ? Optional.of($$1.a()) : Optional.empty()));
   public static final bt.a<cdj.b> p = a("parrot", bt.a.a(cdj.b.f, $$0 -> $$0 instanceof cdj $$1 ? Optional.of($$1.gx()) : Optional.empty()));
   public static final bt.a<cdt.b> q = a("tropical_fish", bt.a.a(cdt.b.m, $$0 -> $$0 instanceof cdt $$1 ? Optional.of($$1.gA()) : Optional.empty()));

   private static <T extends bs> MapCodec<T> a(String $$0, MapCodec<T> $$1) {
      return ji.a(lc.at, $$0, $$1);
   }

   private static <V> bt.a<V> a(String $$0, bt.a<V> $$1) {
      ji.a(lc.at, $$0, $$1.a);
      return $$1;
   }

   public static MapCodec<? extends bs> a(ji<MapCodec<? extends bs>> $$0) {
      return a;
   }

   public static bs a(ccx $$0) {
      return e.a($$0);
   }

   public static bs a(cde $$0) {
      return f.a($$0);
   }

   public static class a<V> {
      final MapCodec<bt.a<V>.a> a;
      final Function<bql, Optional<V>> b;

      public static <V> bt.a<V> a(ji<V> $$0, Function<bql, Optional<V>> $$1) {
         return new bt.a<>($$0.q(), $$1);
      }

      public static <V> bt.a<V> a(Codec<V> $$0, Function<bql, Optional<V>> $$1) {
         return new bt.a<>($$0, $$1);
      }

      public a(Codec<V> $$0, Function<bql, Optional<V>> $$1) {
         this.b = $$1;
         this.a = RecordCodecBuilder.mapCodec($$1x -> $$1x.group($$0.fieldOf("variant").forGetter($$0xx -> $$0xx.c)).apply($$1x, $$0xx -> new bt.a.a($$0xx)));
      }

      public bs a(V $$0) {
         return new bt.a.a($$0);
      }

      class a implements bs {
         final V c;

         a(V $$0) {
            this.c = $$0;
         }

         @Override
         public MapCodec<bt.a<V>.a> a() {
            return a.this.a;
         }

         @Override
         public boolean a(bql $$0, aqe $$1, @Nullable etf $$2) {
            return a.this.b.apply($$0).filter(this.c::equals).isPresent();
         }
      }
   }
}
