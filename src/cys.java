import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record cys(List<cys.b> e, boolean f) {
   public static final cys a = new cys(List.of(), true);
   private static final Codec<cys> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(cys.b.a.listOf().fieldOf("modifiers").forGetter(cys::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cys::c))
            .apply($$0, cys::new)
   );
   public static final Codec<cys> b = Codec.withAlternative(g, cys.b.a.listOf(), $$0 -> new cys($$0, true));
   public static final zg<wt, cys> c = zg.a(cys.b.b.a(ze.a()), cys::b, ze.b, cys::c, cys::new);
   public static final DecimalFormat d = ae.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public cys a(boolean $$0) {
      return new cys(this.e, $$0);
   }

   public static cys.a a() {
      return new cys.a();
   }

   public cys a(jq<bwd> $$0, bwg $$1, bun $$2) {
      Builder<cys.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (cys.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new cys.b($$0, $$1, $$2));
      return new cys($$3.build(), this.f);
   }

   public void a(bun $$0, BiConsumer<jq<bwd>, bwg> $$1) {
      for (cys.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(bum $$0, BiConsumer<jq<bwd>, bwg> $$1) {
      for (cys.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bum $$1) {
      double $$2 = $$0;

      for (cys.b $$3 : this.e) {
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

   public List<cys.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<cys.b> a = ImmutableList.builder();

      a() {
      }

      public cys.a a(jq<bwd> $$0, bwg $$1, bun $$2) {
         this.a.add(new cys.b($$0, $$1, $$2));
         return this;
      }

      public cys a() {
         return new cys(this.a.build(), true);
      }
   }

   public static record b(jq<bwd> c, bwg d, bun e) {
      public static final Codec<cys.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bwd.a.fieldOf("type").forGetter(cys.b::a), bwg.a.forGetter(cys.b::b), bun.l.optionalFieldOf("slot", bun.a).forGetter(cys.b::c))
               .apply($$0, cys.b::new)
      );
      public static final zg<wt, cys.b> b = zg.a(bwd.b, cys.b::a, bwg.c, cys.b::b, bun.m, cys.b::c, cys.b::new);

      public boolean a(jq<bwd> $$0, ali $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public jq<bwd> a() {
         return this.c;
      }

      public bwg b() {
         return this.d;
      }

      public bun c() {
         return this.e;
      }
   }
}
