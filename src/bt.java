import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bt {
   public static final MapCodec<cp> a = a("lightning", cp.b);
   public static final MapCodec<bx> b = a("fishing_hook", bx.c);
   public static final MapCodec<cz> c = a("player", cz.c);
   public static final MapCodec<di> d = a("slime", di.b);
   public static final MapCodec<db> e = a("raider", db.b);
   public static final bt.b<cfs.d> f = a("axolotl", bt.b.a(cfs.d.f, $$0 -> $$0 instanceof cfs $$1 ? Optional.of($$1.gp()) : Optional.empty()));
   public static final bt.b<cnv.b> g = a("boat", bt.b.a(cnv.b.j, $$0 -> $$0 instanceof cnv $$1 ? Optional.of($$1.x()) : Optional.empty()));
   public static final bt.b<ceq.v> h = a("fox", bt.b.a(ceq.v.c, $$0 -> $$0 instanceof ceq $$1 ? Optional.of($$1.u()) : Optional.empty()));
   public static final bt.b<cet.a> i = a("mooshroom", bt.b.a(cet.a.c, $$0 -> $$0 instanceof cet $$1 ? Optional.of($$1.u()) : Optional.empty()));
   public static final bt.b<cfa.g> j = a("rabbit", bt.b.a(cfa.g.h, $$0 -> $$0 instanceof cfa $$1 ? Optional.of($$1.gp()) : Optional.empty()));
   public static final bt.b<cgt> k = a("horse", bt.b.a(cgt.h, $$0 -> $$0 instanceof cgm $$1 ? Optional.of($$1.s()) : Optional.empty()));
   public static final bt.b<cgn.d> l = a("llama", bt.b.a(cgn.d.e, $$0 -> $$0 instanceof cgn $$1 ? Optional.of($$1.gB()) : Optional.empty()));
   public static final bt.b<clq> m = a("villager", bt.b.a(le.y.q(), $$0 -> $$0 instanceof cln $$1 ? Optional.of($$1.a()) : Optional.empty()));
   public static final bt.b<cew.b> n = a("parrot", bt.b.a(cew.b.f, $$0 -> $$0 instanceof cew $$1 ? Optional.of($$1.gx()) : Optional.empty()));
   public static final bt.b<cfg.b> o = a("tropical_fish", bt.b.a(cfg.b.m, $$0 -> $$0 instanceof cfg $$1 ? Optional.of($$1.gA()) : Optional.empty()));
   public static final bt.a<cie> p = a("painting", bt.a.a(lf.S, $$0 -> $$0 instanceof cid $$1 ? Optional.of($$1.p()) : Optional.empty()));
   public static final bt.a<cek> q = a("cat", bt.a.a(lf.l, $$0 -> $$0 instanceof cej $$1 ? Optional.of($$1.gw()) : Optional.empty()));
   public static final bt.a<cer> r = a("frog", bt.a.a(lf.B, $$0 -> $$0 instanceof cga $$1 ? Optional.of($$1.y()) : Optional.empty()));
   public static final bt.a<cfk> s = a("wolf", bt.a.a(lf.m, $$0 -> $$0 instanceof cfj $$1 ? Optional.of($$1.gw()) : Optional.empty()));

   private static <T extends bs> MapCodec<T> a(String $$0, MapCodec<T> $$1) {
      return jk.a(le.at, $$0, $$1);
   }

   private static <V> bt.b<V> a(String $$0, bt.b<V> $$1) {
      jk.a(le.at, $$0, $$1.a);
      return $$1;
   }

   private static <V> bt.a<V> a(String $$0, bt.a<V> $$1) {
      jk.a(le.at, $$0, $$1.a);
      return $$1;
   }

   public static MapCodec<? extends bs> a(jk<MapCodec<? extends bs>> $$0) {
      return a;
   }

   public static bs a(ix<cek> $$0) {
      return q.a(jb.a($$0));
   }

   public static bs b(ix<cer> $$0) {
      return r.a(jb.a($$0));
   }

   public static class a<V> {
      final MapCodec<bt.a<V>.a> a;
      final Function<brw, Optional<ix<V>>> b;

      public static <V> bt.a<V> a(akm<? extends jk<V>> $$0, Function<brw, Optional<ix<V>>> $$1) {
         return new bt.a<>($$0, $$1);
      }

      public a(akm<? extends jk<V>> $$0, Function<brw, Optional<ix<V>>> $$1) {
         this.b = $$1;
         this.a = RecordCodecBuilder.mapCodec(
            $$1x -> $$1x.group(jm.a($$0).fieldOf("variant").forGetter($$0xx -> $$0xx.c)).apply($$1x, $$0xx -> new bt.a.a($$0xx))
         );
      }

      public bs a(jb<V> $$0) {
         return new bt.a.a($$0);
      }

      class a implements bs {
         final jb<V> c;

         a(jb<V> $$0) {
            this.c = $$0;
         }

         @Override
         public MapCodec<bt.a<V>.a> a() {
            return a.this.a;
         }

         @Override
         public boolean a(brw $$0, aqn $$1, @Nullable eum $$2) {
            return a.this.b.apply($$0).filter(this.c::a).isPresent();
         }
      }
   }

   public static class b<V> {
      final MapCodec<bt.b<V>.a> a;
      final Function<brw, Optional<V>> b;

      public static <V> bt.b<V> a(jk<V> $$0, Function<brw, Optional<V>> $$1) {
         return new bt.b<>($$0.q(), $$1);
      }

      public static <V> bt.b<V> a(Codec<V> $$0, Function<brw, Optional<V>> $$1) {
         return new bt.b<>($$0, $$1);
      }

      public b(Codec<V> $$0, Function<brw, Optional<V>> $$1) {
         this.b = $$1;
         this.a = RecordCodecBuilder.mapCodec($$1x -> $$1x.group($$0.fieldOf("variant").forGetter($$0xx -> $$0xx.c)).apply($$1x, $$0xx -> new bt.b.a($$0xx)));
      }

      public bs a(V $$0) {
         return new bt.b.a($$0);
      }

      class a implements bs {
         final V c;

         a(V $$0) {
            this.c = $$0;
         }

         @Override
         public MapCodec<bt.b<V>.a> a() {
            return b.this.a;
         }

         @Override
         public boolean a(brw $$0, aqn $$1, @Nullable eum $$2) {
            return b.this.b.apply($$0).filter(this.c::equals).isPresent();
         }
      }
   }
}
