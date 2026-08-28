import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record cyk(List<cyk.b> e, boolean f) {
   public static final cyk a = new cyk(List.of(), true);
   private static final Codec<cyk> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(cyk.b.a.listOf().fieldOf("modifiers").forGetter(cyk::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cyk::c))
            .apply($$0, cyk::new)
   );
   public static final Codec<cyk> b = Codec.withAlternative(g, cyk.b.a.listOf(), $$0 -> new cyk($$0, true));
   public static final zb<wo, cyk> c = zb.a(cyk.b.b.a(yz.a()), cyk::b, yz.b, cyk::c, cyk::new);
   public static final DecimalFormat d = ad.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public cyk a(boolean $$0) {
      return new cyk(this.e, $$0);
   }

   public static cyk.a a() {
      return new cyk.a();
   }

   public cyk a(jn<bvm> $$0, bvp $$1, btx $$2) {
      Builder<cyk.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (cyk.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new cyk.b($$0, $$1, $$2));
      return new cyk($$3.build(), this.f);
   }

   public void a(btx $$0, BiConsumer<jn<bvm>, bvp> $$1) {
      for (cyk.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(btw $$0, BiConsumer<jn<bvm>, bvp> $$1) {
      for (cyk.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, btw $$1) {
      double $$2 = $$0;

      for (cyk.b $$3 : this.e) {
         if ($$3.e.b($$1)) {
            double $$4 = $$3.d.c();

            $$2 += switch ($$3.d.d()) {
               case a -> $$4;
               case b -> $$4 * $$0;
               case c -> $$4 * $$2;
            };
         }
      }

      return $$2;
   }

   public List<cyk.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<cyk.b> a = ImmutableList.builder();

      a() {
      }

      public cyk.a a(jn<bvm> $$0, bvp $$1, btx $$2) {
         this.a.add(new cyk.b($$0, $$1, $$2));
         return this;
      }

      public cyk a() {
         return new cyk(this.a.build(), true);
      }
   }

   public static record b(jn<bvm> c, bvp d, btx e) {
      public static final Codec<cyk.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bvm.a.fieldOf("type").forGetter(cyk.b::a), bvp.a.forGetter(cyk.b::b), btx.l.optionalFieldOf("slot", btx.a).forGetter(cyk.b::c))
               .apply($$0, cyk.b::new)
      );
      public static final zb<wo, cyk.b> b = zb.a(bvm.b, cyk.b::a, bvp.c, cyk.b::b, btx.m, cyk.b::c, cyk.b::new);

      public boolean a(jn<bvm> $$0, alc $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public jn<bvm> a() {
         return this.c;
      }

      public bvp b() {
         return this.d;
      }

      public btx c() {
         return this.e;
      }
   }
}
