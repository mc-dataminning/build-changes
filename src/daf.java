import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record daf(List<daf.b> e, boolean f) {
   public static final daf a = new daf(List.of(), true);
   private static final Codec<daf> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(daf.b.a.listOf().fieldOf("modifiers").forGetter(daf::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(daf::c))
            .apply($$0, daf::new)
   );
   public static final Codec<daf> b = Codec.withAlternative(g, daf.b.a.listOf(), $$0 -> new daf($$0, true));
   public static final zt<xg, daf> c = zt.a(daf.b.b.a(zr.a()), daf::b, zr.b, daf::c, daf::new);
   public static final DecimalFormat d = ae.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public daf a(boolean $$0) {
      return new daf(this.e, $$0);
   }

   public static daf.a a() {
      return new daf.a();
   }

   public daf a(jq<bxi> $$0, bxl $$1, bvs $$2) {
      Builder<daf.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (daf.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new daf.b($$0, $$1, $$2));
      return new daf($$3.build(), this.f);
   }

   public void a(bvs $$0, BiConsumer<jq<bxi>, bxl> $$1) {
      for (daf.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(bvr $$0, BiConsumer<jq<bxi>, bxl> $$1) {
      for (daf.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bvr $$1) {
      double $$2 = $$0;

      for (daf.b $$3 : this.e) {
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

   public List<daf.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<daf.b> a = ImmutableList.builder();

      a() {
      }

      public daf.a a(jq<bxi> $$0, bxl $$1, bvs $$2) {
         this.a.add(new daf.b($$0, $$1, $$2));
         return this;
      }

      public daf a() {
         return new daf(this.a.build(), true);
      }
   }

   public static record b(jq<bxi> c, bxl d, bvs e) {
      public static final Codec<daf.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bxi.a.fieldOf("type").forGetter(daf.b::a), bxl.a.forGetter(daf.b::b), bvs.l.optionalFieldOf("slot", bvs.a).forGetter(daf.b::c))
               .apply($$0, daf.b::new)
      );
      public static final zt<xg, daf.b> b = zt.a(bxi.b, daf.b::a, bxl.c, daf.b::b, bvs.m, daf.b::c, daf.b::new);

      public boolean a(jq<bxi> $$0, alz $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public jq<bxi> a() {
         return this.c;
      }

      public bxl b() {
         return this.d;
      }

      public bvs c() {
         return this.e;
      }
   }
}
