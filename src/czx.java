import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record czx(List<czx.b> e, boolean f) {
   public static final czx a = new czx(List.of(), true);
   private static final Codec<czx> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(czx.b.a.listOf().fieldOf("modifiers").forGetter(czx::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(czx::c))
            .apply($$0, czx::new)
   );
   public static final Codec<czx> b = Codec.withAlternative(g, czx.b.a.listOf(), $$0 -> new czx($$0, true));
   public static final zi<wv, czx> c = zi.a(czx.b.b.a(zg.a()), czx::b, zg.b, czx::c, czx::new);
   public static final DecimalFormat d = ae.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public czx a(boolean $$0) {
      return new czx(this.e, $$0);
   }

   public static czx.a a() {
      return new czx.a();
   }

   public czx a(jq<bxa> $$0, bxd $$1, bvk $$2) {
      Builder<czx.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (czx.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new czx.b($$0, $$1, $$2));
      return new czx($$3.build(), this.f);
   }

   public void a(bvk $$0, BiConsumer<jq<bxa>, bxd> $$1) {
      for (czx.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(bvj $$0, BiConsumer<jq<bxa>, bxd> $$1) {
      for (czx.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bvj $$1) {
      double $$2 = $$0;

      for (czx.b $$3 : this.e) {
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

   public List<czx.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<czx.b> a = ImmutableList.builder();

      a() {
      }

      public czx.a a(jq<bxa> $$0, bxd $$1, bvk $$2) {
         this.a.add(new czx.b($$0, $$1, $$2));
         return this;
      }

      public czx a() {
         return new czx(this.a.build(), true);
      }
   }

   public static record b(jq<bxa> c, bxd d, bvk e) {
      public static final Codec<czx.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bxa.a.fieldOf("type").forGetter(czx.b::a), bxd.a.forGetter(czx.b::b), bvk.l.optionalFieldOf("slot", bvk.a).forGetter(czx.b::c))
               .apply($$0, czx.b::new)
      );
      public static final zi<wv, czx.b> b = zi.a(bxa.b, czx.b::a, bxd.c, czx.b::b, bvk.m, czx.b::c, czx.b::new);

      public boolean a(jq<bxa> $$0, alp $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public jq<bxa> a() {
         return this.c;
      }

      public bxd b() {
         return this.d;
      }

      public bvk c() {
         return this.e;
      }
   }
}
