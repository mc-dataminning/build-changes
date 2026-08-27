import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bu {
   public static final MapCodec<cq> a = a("lightning", cq.b);
   public static final MapCodec<by> b = a("fishing_hook", by.c);
   public static final MapCodec<da> c = a("player", da.c);
   public static final MapCodec<dk> d = a("slime", dk.b);
   public static final MapCodec<dc> e = a("potato", dc.b);
   public static final bu.b<cfq.d> f = a("axolotl", bu.b.a(cfq.d.f, $$0 -> $$0 instanceof cfq $$1 ? Optional.of($$1.gy()) : Optional.empty()));
   public static final bu.b<cny.b> g = a("boat", bu.b.a(cny.b.j, $$0 -> $$0 instanceof cny $$1 ? Optional.of($$1.x()) : Optional.empty()));
   public static final bu.b<ceo.v> h = a("fox", bu.b.a(ceo.v.c, $$0 -> $$0 instanceof ceo $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bu.b<cer.a> i = a("mooshroom", bu.b.a(cer.a.c, $$0 -> $$0 instanceof cer $$1 ? Optional.of($$1.t()) : Optional.empty()));
   public static final bu.b<cey.g> j = a("rabbit", bu.b.a(cey.g.h, $$0 -> $$0 instanceof cey $$1 ? Optional.of($$1.gy()) : Optional.empty()));
   public static final bu.b<cgr> k = a("horse", bu.b.a(cgr.h, $$0 -> $$0 instanceof cgk $$1 ? Optional.of($$1.r()) : Optional.empty()));
   public static final bu.b<cgl.d> l = a("llama", bu.b.a(cgl.d.e, $$0 -> $$0 instanceof cgl $$1 ? Optional.of($$1.gK()) : Optional.empty()));
   public static final bu.b<clq> m = a("villager", bu.b.a(lh.y.q(), $$0 -> $$0 instanceof cln $$1 ? Optional.of($$1.a()) : Optional.empty()));
   public static final bu.b<ceu.b> n = a("parrot", bu.b.a(ceu.b.f, $$0 -> $$0 instanceof ceu $$1 ? Optional.of($$1.gG()) : Optional.empty()));
   public static final bu.b<cfe.b> o = a("tropical_fish", bu.b.a(cfe.b.m, $$0 -> $$0 instanceof cfe $$1 ? Optional.of($$1.gJ()) : Optional.empty()));
   public static final bu.a<cic> p = a("painting", bu.a.a(li.S, $$0 -> $$0 instanceof cib $$1 ? Optional.of($$1.p()) : Optional.empty()));
   public static final bu.a<cei> q = a("cat", bu.a.a(li.l, $$0 -> $$0 instanceof ceh $$1 ? Optional.of($$1.gF()) : Optional.empty()));
   public static final bu.a<cep> r = a("frog", bu.a.a(li.B, $$0 -> $$0 instanceof cfy $$1 ? Optional.of($$1.x()) : Optional.empty()));
   public static final bu.a<cfi> s = a("wolf", bu.a.a(li.m, $$0 -> $$0 instanceof cfh $$1 ? Optional.of($$1.gF()) : Optional.empty()));

   private static <T extends bt> MapCodec<T> a(String $$0, MapCodec<T> $$1) {
      return jn.a(lh.at, $$0, $$1);
   }

   private static <V> bu.b<V> a(String $$0, bu.b<V> $$1) {
      jn.a(lh.at, $$0, $$1.a);
      return $$1;
   }

   private static <V> bu.a<V> a(String $$0, bu.a<V> $$1) {
      jn.a(lh.at, $$0, $$1.a);
      return $$1;
   }

   public static MapCodec<? extends bt> a(jn<MapCodec<? extends bt>> $$0) {
      return a;
   }

   public static bt a(ja<cei> $$0) {
      return q.a(je.a($$0));
   }

   public static bt b(ja<cep> $$0) {
      return r.a(je.a($$0));
   }

   public static class a<V> {
      final MapCodec<bu.a<V>.a> a;
      final Function<brv, Optional<ja<V>>> b;

      public static <V> bu.a<V> a(aks<? extends jn<V>> $$0, Function<brv, Optional<ja<V>>> $$1) {
         return new bu.a<>($$0, $$1);
      }

      public a(aks<? extends jn<V>> $$0, Function<brv, Optional<ja<V>>> $$1) {
         this.b = $$1;
         this.a = RecordCodecBuilder.mapCodec(
            $$1x -> $$1x.group(jp.a($$0).fieldOf("variant").forGetter($$0xx -> $$0xx.c)).apply($$1x, $$0xx -> new bu.a.a($$0xx))
         );
      }

      public bt a(je<V> $$0) {
         return new bu.a.a($$0);
      }

      class a implements bt {
         final je<V> c;

         a(je<V> $$0) {
            this.c = $$0;
         }

         @Override
         public MapCodec<bu.a<V>.a> a() {
            return a.this.a;
         }

         @Override
         public boolean a(brv $$0, aqt $$1, @Nullable ewu $$2) {
            return a.this.b.apply($$0).filter(this.c::a).isPresent();
         }
      }
   }

   public static class b<V> {
      final MapCodec<bu.b<V>.a> a;
      final Function<brv, Optional<V>> b;

      public static <V> bu.b<V> a(jn<V> $$0, Function<brv, Optional<V>> $$1) {
         return new bu.b<>($$0.q(), $$1);
      }

      public static <V> bu.b<V> a(Codec<V> $$0, Function<brv, Optional<V>> $$1) {
         return new bu.b<>($$0, $$1);
      }

      public b(Codec<V> $$0, Function<brv, Optional<V>> $$1) {
         this.b = $$1;
         this.a = RecordCodecBuilder.mapCodec($$1x -> $$1x.group($$0.fieldOf("variant").forGetter($$0xx -> $$0xx.c)).apply($$1x, $$0xx -> new bu.b.a($$0xx)));
      }

      public bt a(V $$0) {
         return new bu.b.a($$0);
      }

      class a implements bt {
         final V c;

         a(V $$0) {
            this.c = $$0;
         }

         @Override
         public MapCodec<bu.b<V>.a> a() {
            return b.this.a;
         }

         @Override
         public boolean a(brv $$0, aqt $$1, @Nullable ewu $$2) {
            return b.this.b.apply($$0).filter(this.c::equals).isPresent();
         }
      }
   }
}
