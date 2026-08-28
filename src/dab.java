import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record dab(List<dab.b> e, boolean f) {
   public static final dab a = new dab(List.of(), true);
   private static final Codec<dab> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(dab.b.a.listOf().fieldOf("modifiers").forGetter(dab::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(dab::c))
            .apply($$0, dab::new)
   );
   public static final Codec<dab> b = Codec.withAlternative(g, dab.b.a.listOf(), $$0 -> new dab($$0, true));
   public static final zt<xg, dab> c = zt.a(dab.b.b.a(zr.a()), dab::b, zr.b, dab::c, dab::new);
   public static final DecimalFormat d = ae.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public dab a(boolean $$0) {
      return new dab(this.e, $$0);
   }

   public static dab.a a() {
      return new dab.a();
   }

   public dab a(jq<bxe> $$0, bxh $$1, bvo $$2) {
      Builder<dab.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (dab.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new dab.b($$0, $$1, $$2));
      return new dab($$3.build(), this.f);
   }

   public void a(bvo $$0, BiConsumer<jq<bxe>, bxh> $$1) {
      for (dab.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(bvn $$0, BiConsumer<jq<bxe>, bxh> $$1) {
      for (dab.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bvn $$1) {
      double $$2 = $$0;

      for (dab.b $$3 : this.e) {
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

   public List<dab.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<dab.b> a = ImmutableList.builder();

      a() {
      }

      public dab.a a(jq<bxe> $$0, bxh $$1, bvo $$2) {
         this.a.add(new dab.b($$0, $$1, $$2));
         return this;
      }

      public dab a() {
         return new dab(this.a.build(), true);
      }
   }

   public static record b(jq<bxe> c, bxh d, bvo e) {
      public static final Codec<dab.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bxe.a.fieldOf("type").forGetter(dab.b::a), bxh.a.forGetter(dab.b::b), bvo.l.optionalFieldOf("slot", bvo.a).forGetter(dab.b::c))
               .apply($$0, dab.b::new)
      );
      public static final zt<xg, dab.b> b = zt.a(bxe.b, dab.b::a, bxh.c, dab.b::b, bvo.m, dab.b::c, dab.b::new);

      public boolean a(jq<bxe> $$0, alz $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public jq<bxe> a() {
         return this.c;
      }

      public bxh b() {
         return this.d;
      }

      public bvo c() {
         return this.e;
      }
   }
}
