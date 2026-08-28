import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record cyn(List<cyn.b> e, boolean f) {
   public static final cyn a = new cyn(List.of(), true);
   private static final Codec<cyn> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(cyn.b.a.listOf().fieldOf("modifiers").forGetter(cyn::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cyn::c))
            .apply($$0, cyn::new)
   );
   public static final Codec<cyn> b = Codec.withAlternative(g, cyn.b.a.listOf(), $$0 -> new cyn($$0, true));
   public static final zc<wp, cyn> c = zc.a(cyn.b.b.a(za.a()), cyn::b, za.b, cyn::c, cyn::new);
   public static final DecimalFormat d = ad.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public cyn a(boolean $$0) {
      return new cyn(this.e, $$0);
   }

   public static cyn.a a() {
      return new cyn.a();
   }

   public cyn a(jo<bvp> $$0, bvs $$1, bua $$2) {
      Builder<cyn.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (cyn.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new cyn.b($$0, $$1, $$2));
      return new cyn($$3.build(), this.f);
   }

   public void a(bua $$0, BiConsumer<jo<bvp>, bvs> $$1) {
      for (cyn.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(btz $$0, BiConsumer<jo<bvp>, bvs> $$1) {
      for (cyn.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, btz $$1) {
      double $$2 = $$0;

      for (cyn.b $$3 : this.e) {
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

   public List<cyn.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<cyn.b> a = ImmutableList.builder();

      a() {
      }

      public cyn.a a(jo<bvp> $$0, bvs $$1, bua $$2) {
         this.a.add(new cyn.b($$0, $$1, $$2));
         return this;
      }

      public cyn a() {
         return new cyn(this.a.build(), true);
      }
   }

   public static record b(jo<bvp> c, bvs d, bua e) {
      public static final Codec<cyn.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bvp.a.fieldOf("type").forGetter(cyn.b::a), bvs.a.forGetter(cyn.b::b), bua.l.optionalFieldOf("slot", bua.a).forGetter(cyn.b::c))
               .apply($$0, cyn.b::new)
      );
      public static final zc<wp, cyn.b> b = zc.a(bvp.b, cyn.b::a, bvs.c, cyn.b::b, bua.m, cyn.b::c, cyn.b::new);

      public boolean a(jo<bvp> $$0, ale $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public jo<bvp> a() {
         return this.c;
      }

      public bvs b() {
         return this.d;
      }

      public bua c() {
         return this.e;
      }
   }
}
