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
   public static final MapCodec<dh> d = a("slime", dh.b);
   public static final bt.b<cfb.d> e = a("axolotl", bt.b.a(cfb.d.f, $$0 -> $$0 instanceof cfb $$1 ? Optional.of($$1.gp()) : Optional.empty()));
   public static final bt.b<cne.b> f = a("boat", bt.b.a(cne.b.j, $$0 -> $$0 instanceof cne $$1 ? Optional.of($$1.x()) : Optional.empty()));
   public static final bt.b<cdz.v> g = a("fox", bt.b.a(cdz.v.c, $$0 -> $$0 instanceof cdz $$1 ? Optional.of($$1.u()) : Optional.empty()));
   public static final bt.b<cec.a> h = a("mooshroom", bt.b.a(cec.a.c, $$0 -> $$0 instanceof cec $$1 ? Optional.of($$1.u()) : Optional.empty()));
   public static final bt.b<cej.g> i = a("rabbit", bt.b.a(cej.g.h, $$0 -> $$0 instanceof cej $$1 ? Optional.of($$1.gp()) : Optional.empty()));
   public static final bt.b<cgc> j = a("horse", bt.b.a(cgc.h, $$0 -> $$0 instanceof cfv $$1 ? Optional.of($$1.r()) : Optional.empty()));
   public static final bt.b<cfw.d> k = a("llama", bt.b.a(cfw.d.e, $$0 -> $$0 instanceof cfw $$1 ? Optional.of($$1.gB()) : Optional.empty()));
   public static final bt.b<ckz> l = a("villager", bt.b.a(ld.y.q(), $$0 -> $$0 instanceof ckw $$1 ? Optional.of($$1.a()) : Optional.empty()));
   public static final bt.b<cef.b> m = a("parrot", bt.b.a(cef.b.f, $$0 -> $$0 instanceof cef $$1 ? Optional.of($$1.gx()) : Optional.empty()));
   public static final bt.b<cep.b> n = a("tropical_fish", bt.b.a(cep.b.m, $$0 -> $$0 instanceof cep $$1 ? Optional.of($$1.gA()) : Optional.empty()));
   public static final bt.a<chn> o = a("painting", bt.a.a(le.S, $$0 -> $$0 instanceof chm $$1 ? Optional.of($$1.p()) : Optional.empty()));
   public static final bt.a<cdt> p = a("cat", bt.a.a(le.l, $$0 -> $$0 instanceof cds $$1 ? Optional.of($$1.gw()) : Optional.empty()));
   public static final bt.a<cea> q = a("frog", bt.a.a(le.B, $$0 -> $$0 instanceof cfj $$1 ? Optional.of($$1.y()) : Optional.empty()));
   public static final bt.a<cet> r = a("wolf", bt.a.a(le.m, $$0 -> $$0 instanceof ces $$1 ? Optional.of($$1.gw()) : Optional.empty()));

   private static <T extends bs> MapCodec<T> a(String $$0, MapCodec<T> $$1) {
      return jj.a(ld.at, $$0, $$1);
   }

   private static <V> bt.b<V> a(String $$0, bt.b<V> $$1) {
      jj.a(ld.at, $$0, $$1.a);
      return $$1;
   }

   private static <V> bt.a<V> a(String $$0, bt.a<V> $$1) {
      jj.a(ld.at, $$0, $$1.a);
      return $$1;
   }

   public static MapCodec<? extends bs> a(jj<MapCodec<? extends bs>> $$0) {
      return a;
   }

   public static bs a(iw<cdt> $$0) {
      return p.a(ja.a($$0));
   }

   public static bs b(iw<cea> $$0) {
      return q.a(ja.a($$0));
   }

   public static class a<V> {
      final MapCodec<bt.a<V>.a> a;
      final Function<brh, Optional<iw<V>>> b;

      public static <V> bt.a<V> a(akg<? extends jj<V>> $$0, Function<brh, Optional<iw<V>>> $$1) {
         return new bt.a<>($$0, $$1);
      }

      public a(akg<? extends jj<V>> $$0, Function<brh, Optional<iw<V>>> $$1) {
         this.b = $$1;
         this.a = RecordCodecBuilder.mapCodec(
            $$1x -> $$1x.group(jl.a($$0).fieldOf("variant").forGetter($$0xx -> $$0xx.c)).apply($$1x, $$0xx -> new bt.a.a($$0xx))
         );
      }

      public bs a(ja<V> $$0) {
         return new bt.a.a($$0);
      }

      class a implements bs {
         final ja<V> c;

         a(ja<V> $$0) {
            this.c = $$0;
         }

         @Override
         public MapCodec<bt.a<V>.a> a() {
            return a.this.a;
         }

         @Override
         public boolean a(brh $$0, aqh $$1, @Nullable etp $$2) {
            return a.this.b.apply($$0).filter(this.c::a).isPresent();
         }
      }
   }

   public static class b<V> {
      final MapCodec<bt.b<V>.a> a;
      final Function<brh, Optional<V>> b;

      public static <V> bt.b<V> a(jj<V> $$0, Function<brh, Optional<V>> $$1) {
         return new bt.b<>($$0.q(), $$1);
      }

      public static <V> bt.b<V> a(Codec<V> $$0, Function<brh, Optional<V>> $$1) {
         return new bt.b<>($$0, $$1);
      }

      public b(Codec<V> $$0, Function<brh, Optional<V>> $$1) {
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
         public boolean a(brh $$0, aqh $$1, @Nullable etp $$2) {
            return b.this.b.apply($$0).filter(this.c::equals).isPresent();
         }
      }
   }
}
