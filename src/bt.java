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
   public static final bt.b<cfq.d> f = a("axolotl", bt.b.a(cfq.d.f, $$0 -> $$0 instanceof cfq $$1 ? Optional.of($$1.gp()) : Optional.empty()));
   public static final bt.b<cnt.b> g = a("boat", bt.b.a(cnt.b.j, $$0 -> $$0 instanceof cnt $$1 ? Optional.of($$1.x()) : Optional.empty()));
   public static final bt.b<ceo.v> h = a("fox", bt.b.a(ceo.v.c, $$0 -> $$0 instanceof ceo $$1 ? Optional.of($$1.u()) : Optional.empty()));
   public static final bt.b<cer.a> i = a("mooshroom", bt.b.a(cer.a.c, $$0 -> $$0 instanceof cer $$1 ? Optional.of($$1.u()) : Optional.empty()));
   public static final bt.b<cey.g> j = a("rabbit", bt.b.a(cey.g.h, $$0 -> $$0 instanceof cey $$1 ? Optional.of($$1.gp()) : Optional.empty()));
   public static final bt.b<cgr> k = a("horse", bt.b.a(cgr.h, $$0 -> $$0 instanceof cgk $$1 ? Optional.of($$1.s()) : Optional.empty()));
   public static final bt.b<cgl.d> l = a("llama", bt.b.a(cgl.d.e, $$0 -> $$0 instanceof cgl $$1 ? Optional.of($$1.gB()) : Optional.empty()));
   public static final bt.b<clo> m = a("villager", bt.b.a(le.y.q(), $$0 -> $$0 instanceof cll $$1 ? Optional.of($$1.a()) : Optional.empty()));
   public static final bt.b<ceu.b> n = a("parrot", bt.b.a(ceu.b.f, $$0 -> $$0 instanceof ceu $$1 ? Optional.of($$1.gx()) : Optional.empty()));
   public static final bt.b<cfe.b> o = a("tropical_fish", bt.b.a(cfe.b.m, $$0 -> $$0 instanceof cfe $$1 ? Optional.of($$1.gA()) : Optional.empty()));
   public static final bt.a<cic> p = a("painting", bt.a.a(lf.S, $$0 -> $$0 instanceof cib $$1 ? Optional.of($$1.p()) : Optional.empty()));
   public static final bt.a<cei> q = a("cat", bt.a.a(lf.l, $$0 -> $$0 instanceof ceh $$1 ? Optional.of($$1.gw()) : Optional.empty()));
   public static final bt.a<cep> r = a("frog", bt.a.a(lf.B, $$0 -> $$0 instanceof cfy $$1 ? Optional.of($$1.y()) : Optional.empty()));
   public static final bt.a<cfi> s = a("wolf", bt.a.a(lf.m, $$0 -> $$0 instanceof cfh $$1 ? Optional.of($$1.gw()) : Optional.empty()));

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

   public static bs a(ix<cei> $$0) {
      return q.a(jb.a($$0));
   }

   public static bs b(ix<cep> $$0) {
      return r.a(jb.a($$0));
   }

   public static class a<V> {
      final MapCodec<bt.a<V>.a> a;
      final Function<bru, Optional<ix<V>>> b;

      public static <V> bt.a<V> a(akl<? extends jk<V>> $$0, Function<bru, Optional<ix<V>>> $$1) {
         return new bt.a<>($$0, $$1);
      }

      public a(akl<? extends jk<V>> $$0, Function<bru, Optional<ix<V>>> $$1) {
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
         public boolean a(bru $$0, aqm $$1, @Nullable euk $$2) {
            return a.this.b.apply($$0).filter(this.c::a).isPresent();
         }
      }
   }

   public static class b<V> {
      final MapCodec<bt.b<V>.a> a;
      final Function<bru, Optional<V>> b;

      public static <V> bt.b<V> a(jk<V> $$0, Function<bru, Optional<V>> $$1) {
         return new bt.b<>($$0.q(), $$1);
      }

      public static <V> bt.b<V> a(Codec<V> $$0, Function<bru, Optional<V>> $$1) {
         return new bt.b<>($$0, $$1);
      }

      public b(Codec<V> $$0, Function<bru, Optional<V>> $$1) {
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
         public boolean a(bru $$0, aqm $$1, @Nullable euk $$2) {
            return b.this.b.apply($$0).filter(this.c::equals).isPresent();
         }
      }
   }
}
