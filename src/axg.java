import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.floats.FloatArrayList;
import it.unimi.dsi.fastutil.floats.FloatList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.apache.commons.lang3.mutable.MutableObject;

public interface axg<C, I extends azd<C>> extends azd<C> {
   @azg
   String a();

   axg<C, I> a(axg.d<I> var1);

   static <C, I extends azd<C>> Codec<axg<C, I>> a(Codec<I> $$0) {
      MutableObject<Codec<axg<C, I>>> $$1 = new MutableObject();

      record a<C, I extends azd<C>>(float a, axg<C, I> b, float c) {
      }

      Codec<a<C, I>> $$2 = RecordCodecBuilder.create(
         $$1x -> $$1x.group(
                  Codec.FLOAT.fieldOf("location").forGetter(a::a),
                  Codec.lazyInitialized($$1::getValue).fieldOf("value").forGetter(a::b),
                  Codec.FLOAT.fieldOf("derivative").forGetter(a::c)
               )
               .apply($$1x, ($$0xx, $$1xx, $$2x) -> new a($$0xx, $$1xx, $$2x))
      );
      Codec<axg.e<C, I>> $$3 = RecordCodecBuilder.create(
         $$2x -> $$2x.group(
                  $$0.fieldOf("coordinate").forGetter(axg.e::d),
                  axm.a($$2.listOf())
                     .fieldOf("points")
                     .forGetter(
                        $$0xx -> IntStream.range(0, $$0xx.c.length)
                              .mapToObj($$1xx -> new a($$0xx.e()[$$1xx], (axg<C, I>)$$0xx.f().get($$1xx), $$0xx.g()[$$1xx]))
                              .toList()
                     )
               )
               .apply($$2x, ($$0xx, $$1xx) -> {
                  float[] $$2xx = new float[$$1xx.size()];
                  Builder<axg<C, I>> $$3x = ImmutableList.builder();
                  float[] $$4 = new float[$$1xx.size()];

                  for (int $$5 = 0; $$5 < $$1xx.size(); $$5++) {
                     a<C, I> $$6 = (a<C, I>)$$1xx.get($$5);
                     $$2xx[$$5] = $$6.a();
                     $$3x.add($$6.b());
                     $$4[$$5] = $$6.c();
                  }

                  return axg.e.a((I)$$0xx, $$2xx, $$3x.build(), $$4);
               })
      );
      $$1.setValue(
         Codec.either(Codec.FLOAT, $$3)
            .xmap(
               $$0x -> (axg)$$0x.map(axg.c::new, $$0xx -> $$0xx), $$0x -> $$0x instanceof axg.c<C, I> $$1x ? Either.left($$1x.d()) : Either.right((axg.e)$$0x)
            )
      );
      return (Codec<axg<C, I>>)$$1.getValue();
   }

   static <C, I extends azd<C>> axg<C, I> a(float $$0) {
      return new axg.c<>($$0);
   }

   static <C, I extends azd<C>> axg.b<C, I> a(I $$0) {
      return new axg.b<>($$0);
   }

   static <C, I extends azd<C>> axg.b<C, I> a(I $$0, azd<Float> $$1) {
      return new axg.b<>($$0, $$1);
   }

   public static final class b<C, I extends azd<C>> {
      private final I a;
      private final azd<Float> b;
      private final FloatList c = new FloatArrayList();
      private final List<axg<C, I>> d = Lists.newArrayList();
      private final FloatList e = new FloatArrayList();

      protected b(I $$0) {
         this($$0, azd.a);
      }

      protected b(I $$0, azd<Float> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public axg.b<C, I> a(float $$0, float $$1) {
         return this.a($$0, new axg.c<>(this.b.a($$1)), 0.0F);
      }

      public axg.b<C, I> a(float $$0, float $$1, float $$2) {
         return this.a($$0, new axg.c<>(this.b.a($$1)), $$2);
      }

      public axg.b<C, I> a(float $$0, axg<C, I> $$1) {
         return this.a($$0, $$1, 0.0F);
      }

      private axg.b<C, I> a(float $$0, axg<C, I> $$1, float $$2) {
         if (!this.c.isEmpty() && $$0 <= this.c.getFloat(this.c.size() - 1)) {
            throw new IllegalArgumentException("Please register points in ascending order");
         } else {
            this.c.add($$0);
            this.d.add($$1);
            this.e.add($$2);
            return this;
         }
      }

      public axg<C, I> a() {
         if (this.c.isEmpty()) {
            throw new IllegalStateException("No elements added");
         } else {
            return axg.e.a(this.a, this.c.toFloatArray(), ImmutableList.copyOf(this.d), this.e.toFloatArray());
         }
      }
   }

   @azg
   public static record c<C, I extends azd<C>>(float b) implements axg<C, I> {
      @Override
      public float a(C $$0) {
         return this.b;
      }

      @Override
      public String a() {
         return String.format(Locale.ROOT, "k=%.3f", this.b);
      }

      @Override
      public float c() {
         return this.b;
      }

      @Override
      public axg<C, I> a(axg.d<I> $$0) {
         return this;
      }

      public float d() {
         return this.b;
      }
   }

   public interface d<I> {
      I visit(I var1);
   }

   @azg
   public static record e<C, I extends azd<C>>(I b, float[] c, List<axg<C, I>> d, float[] e, float f, float g) implements axg<C, I> {

      public e(I b, float[] c, List<axg<C, I>> d, float[] e, float f, float g) {
         a(c, d, e);
         this.b = b;
         this.c = c;
         this.d = d;
         this.e = e;
         this.f = f;
         this.g = g;
      }

      static <C, I extends azd<C>> axg.e<C, I> a(I $$0, float[] $$1, List<axg<C, I>> $$2, float[] $$3) {
         a($$1, $$2, $$3);
         int $$4 = $$1.length - 1;
         float $$5 = Float.POSITIVE_INFINITY;
         float $$6 = Float.NEGATIVE_INFINITY;
         float $$7 = $$0.b();
         float $$8 = $$0.c();
         if ($$7 < $$1[0]) {
            float $$9 = a($$7, $$1, $$2.get(0).b(), $$3, 0);
            float $$10 = a($$7, $$1, $$2.get(0).c(), $$3, 0);
            $$5 = Math.min($$5, Math.min($$9, $$10));
            $$6 = Math.max($$6, Math.max($$9, $$10));
         }

         if ($$8 > $$1[$$4]) {
            float $$11 = a($$8, $$1, $$2.get($$4).b(), $$3, $$4);
            float $$12 = a($$8, $$1, $$2.get($$4).c(), $$3, $$4);
            $$5 = Math.min($$5, Math.min($$11, $$12));
            $$6 = Math.max($$6, Math.max($$11, $$12));
         }

         for (axg<C, I> $$13 : $$2) {
            $$5 = Math.min($$5, $$13.b());
            $$6 = Math.max($$6, $$13.c());
         }

         for (int $$14 = 0; $$14 < $$4; $$14++) {
            float $$15 = $$1[$$14];
            float $$16 = $$1[$$14 + 1];
            float $$17 = $$16 - $$15;
            axg<C, I> $$18 = $$2.get($$14);
            axg<C, I> $$19 = $$2.get($$14 + 1);
            float $$20 = $$18.b();
            float $$21 = $$18.c();
            float $$22 = $$19.b();
            float $$23 = $$19.c();
            float $$24 = $$3[$$14];
            float $$25 = $$3[$$14 + 1];
            if ($$24 != 0.0F || $$25 != 0.0F) {
               float $$26 = $$24 * $$17;
               float $$27 = $$25 * $$17;
               float $$28 = Math.min($$20, $$22);
               float $$29 = Math.max($$21, $$23);
               float $$30 = $$26 - $$23 + $$20;
               float $$31 = $$26 - $$22 + $$21;
               float $$32 = -$$27 + $$22 - $$21;
               float $$33 = -$$27 + $$23 - $$20;
               float $$34 = Math.min($$30, $$32);
               float $$35 = Math.max($$31, $$33);
               $$5 = Math.min($$5, $$28 + 0.25F * $$34);
               $$6 = Math.max($$6, $$29 + 0.25F * $$35);
            }
         }

         return new axg.e<>($$0, $$1, $$2, $$3, $$5, $$6);
      }

      private static float a(float $$0, float[] $$1, float $$2, float[] $$3, int $$4) {
         float $$5 = $$3[$$4];
         return $$5 == 0.0F ? $$2 : $$2 + $$5 * ($$0 - $$1[$$4]);
      }

      private static <C, I extends azd<C>> void a(float[] $$0, List<axg<C, I>> $$1, float[] $$2) {
         if ($$0.length != $$1.size() || $$0.length != $$2.length) {
            throw new IllegalArgumentException("All lengths must be equal, got: " + $$0.length + " " + $$1.size() + " " + $$2.length);
         } else if ($$0.length == 0) {
            throw new IllegalArgumentException("Cannot create a multipoint spline with no points");
         }
      }

      @Override
      public float a(C $$0) {
         float $$1 = this.b.a($$0);
         int $$2 = a(this.c, $$1);
         int $$3 = this.c.length - 1;
         if ($$2 < 0) {
            return a($$1, this.c, this.d.get(0).a($$0), this.e, 0);
         } else if ($$2 == $$3) {
            return a($$1, this.c, this.d.get($$3).a($$0), this.e, $$3);
         } else {
            float $$4 = this.c[$$2];
            float $$5 = this.c[$$2 + 1];
            float $$6 = ($$1 - $$4) / ($$5 - $$4);
            azd<C> $$7 = (azd<C>)this.d.get($$2);
            azd<C> $$8 = (azd<C>)this.d.get($$2 + 1);
            float $$9 = this.e[$$2];
            float $$10 = this.e[$$2 + 1];
            float $$11 = $$7.a($$0);
            float $$12 = $$8.a($$0);
            float $$13 = $$9 * ($$5 - $$4) - ($$12 - $$11);
            float $$14 = -$$10 * ($$5 - $$4) + ($$12 - $$11);
            return ayd.i($$6, $$11, $$12) + $$6 * (1.0F - $$6) * ayd.i($$6, $$13, $$14);
         }
      }

      private static int a(float[] $$0, float $$1) {
         return ayd.a(0, $$0.length, $$2 -> $$1 < $$0[$$2]) - 1;
      }

      @VisibleForTesting
      @Override
      public String a() {
         return "Spline{coordinate="
            + this.b
            + ", locations="
            + this.a(this.c)
            + ", derivatives="
            + this.a(this.e)
            + ", values="
            + this.d.stream().map(axg::a).collect(Collectors.joining(", ", "[", "]"))
            + "}";
      }

      private String a(float[] $$0) {
         return "["
            + IntStream.range(0, $$0.length)
               .mapToDouble($$1 -> (double)$$0[$$1])
               .mapToObj($$0x -> String.format(Locale.ROOT, "%.3f", $$0x))
               .collect(Collectors.joining(", "))
            + "]";
      }

      @Override
      public axg<C, I> a(axg.d<I> $$0) {
         return a($$0.visit(this.b), this.c, this.f().stream().map($$1 -> $$1.a($$0)).toList(), this.e);
      }

      public I d() {
         return this.b;
      }

      public float[] e() {
         return this.c;
      }

      public List<axg<C, I>> f() {
         return this.d;
      }

      public float[] g() {
         return this.e;
      }

      @Override
      public float b() {
         return this.f;
      }

      @Override
      public float c() {
         return this.g;
      }
   }
}
