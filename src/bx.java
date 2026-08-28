import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bx {
   public static final MapCodec<dd> a = a("lightning", dd.b);
   public static final MapCodec<cb> b = a("fishing_hook", cb.c);
   public static final MapCodec<dp> c = a("player", dp.c);
   public static final MapCodec<dy> d = a("slime", dy.b);
   public static final MapCodec<dr> e = a("raider", dr.b);
   public static final bx.b<cgq.d> f = a("axolotl", bx.b.a(cgq.d.f, $$0 -> $$0 instanceof cgq $$1 ? Optional.of($$1.gl()) : Optional.empty()));
   public static final bx.b<cov.b> g = a("boat", bx.b.a(cov.b.j, $$0 -> $$0 instanceof cov $$1 ? Optional.of($$1.x()) : Optional.empty()));
   public static final bx.b<cfo.v> h = a("fox", bx.b.a(cfo.v.c, $$0 -> $$0 instanceof cfo $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bx.b<cfr.a> i = a("mooshroom", bx.b.a(cfr.a.c, $$0 -> $$0 instanceof cfr $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bx.b<cfy.g> j = a("rabbit", bx.b.a(cfy.g.h, $$0 -> $$0 instanceof cfy $$1 ? Optional.of($$1.gl()) : Optional.empty()));
   public static final bx.b<chr> k = a("horse", bx.b.a(chr.h, $$0 -> $$0 instanceof chk $$1 ? Optional.of($$1.s()) : Optional.empty()));
   public static final bx.b<chl.d> l = a("llama", bx.b.a(chl.d.e, $$0 -> $$0 instanceof chl $$1 ? Optional.of($$1.gw()) : Optional.empty()));
   public static final bx.b<cmp> m = a("villager", bx.b.a(lt.w.r(), $$0 -> $$0 instanceof cmm $$1 ? Optional.of($$1.a()) : Optional.empty()));
   public static final bx.b<cfu.b> n = a("parrot", bx.b.a(cfu.b.f, $$0 -> $$0 instanceof cfu $$1 ? Optional.of($$1.gx()) : Optional.empty()));
   public static final bx.b<cge.b> o = a("tropical_fish", bx.b.a(cge.b.m, $$0 -> $$0 instanceof cge $$1 ? Optional.of($$1.gw()) : Optional.empty()));
   public static final bx.a<cjd> p = a("painting", bx.a.a(lu.X, $$0 -> $$0 instanceof cjc $$1 ? Optional.of($$1.v()) : Optional.empty()));
   public static final bx.a<cfi> q = a("cat", bx.a.a(lu.l, $$0 -> $$0 instanceof cfh $$1 ? Optional.of($$1.gw()) : Optional.empty()));
   public static final bx.a<cfp> r = a("frog", bx.a.a(lu.F, $$0 -> $$0 instanceof cgy $$1 ? Optional.of($$1.x()) : Optional.empty()));
   public static final bx.a<cgi> s = a("wolf", bx.a.a(lu.m, $$0 -> $$0 instanceof cgh $$1 ? Optional.of($$1.gw()) : Optional.empty()));

   private static <T extends bw> MapCodec<T> a(String $$0, MapCodec<T> $$1) {
      return jz.a(lt.ar, $$0, $$1);
   }

   private static <V> bx.b<V> a(String $$0, bx.b<V> $$1) {
      jz.a(lt.ar, $$0, $$1.a);
      return $$1;
   }

   private static <V> bx.a<V> a(String $$0, bx.a<V> $$1) {
      jz.a(lt.ar, $$0, $$1.a);
      return $$1;
   }

   public static MapCodec<? extends bw> a(jz<MapCodec<? extends bw>> $$0) {
      return a;
   }

   public static bw a(jm<cfi> $$0) {
      return q.a(jq.a($$0));
   }

   public static bw b(jm<cfp> $$0) {
      return r.a(jq.a($$0));
   }

   public static bw a(jq<cgi> $$0) {
      return s.a($$0);
   }

   public static class a<V> {
      final MapCodec<bx.a<V>.a> a;
      final Function<bsr, Optional<jm<V>>> b;

      public static <V> bx.a<V> a(akq<? extends jz<V>> $$0, Function<bsr, Optional<jm<V>>> $$1) {
         return new bx.a<>($$0, $$1);
      }

      public a(akq<? extends jz<V>> $$0, Function<bsr, Optional<jm<V>>> $$1) {
         this.b = $$1;
         this.a = RecordCodecBuilder.mapCodec(
            $$1x -> $$1x.group(kb.a($$0).fieldOf("variant").forGetter($$0xx -> $$0xx.c)).apply($$1x, $$0xx -> new bx.a.a($$0xx))
         );
      }

      public bw a(jq<V> $$0) {
         return new bx.a.a($$0);
      }

      class a implements bw {
         final jq<V> c;

         a(final jq<V> $$0) {
            this.c = $$0;
         }

         @Override
         public MapCodec<bx.a<V>.a> a() {
            return a.this.a;
         }

         @Override
         public boolean a(bsr $$0, aqu $$1, @Nullable exa $$2) {
            return a.this.b.apply($$0).filter(this.c::a).isPresent();
         }
      }
   }

   public static class b<V> {
      final MapCodec<bx.b<V>.a> a;
      final Function<bsr, Optional<V>> b;

      public static <V> bx.b<V> a(jz<V> $$0, Function<bsr, Optional<V>> $$1) {
         return new bx.b<>($$0.r(), $$1);
      }

      public static <V> bx.b<V> a(Codec<V> $$0, Function<bsr, Optional<V>> $$1) {
         return new bx.b<>($$0, $$1);
      }

      public b(Codec<V> $$0, Function<bsr, Optional<V>> $$1) {
         this.b = $$1;
         this.a = RecordCodecBuilder.mapCodec($$1x -> $$1x.group($$0.fieldOf("variant").forGetter($$0xx -> $$0xx.c)).apply($$1x, $$0xx -> new bx.b.a($$0xx)));
      }

      public bw a(V $$0) {
         return new bx.b.a($$0);
      }

      class a implements bw {
         final V c;

         a(final V $$0) {
            this.c = $$0;
         }

         @Override
         public MapCodec<bx.b<V>.a> a() {
            return b.this.a;
         }

         @Override
         public boolean a(bsr $$0, aqu $$1, @Nullable exa $$2) {
            return b.this.b.apply($$0).filter(this.c::equals).isPresent();
         }
      }
   }
}
