import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record cxl(List<cxl.b> e, boolean f) {
   public static final cxl a = new cxl(List.of(), true);
   private static final Codec<cxl> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(cxl.b.a.listOf().fieldOf("modifiers").forGetter(cxl::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxl::c))
            .apply($$0, cxl::new)
   );
   public static final Codec<cxl> b = Codec.withAlternative(g, cxl.b.a.listOf(), $$0 -> new cxl($$0, true));
   public static final yw<wj, cxl> c = yw.a(cxl.b.b.a(yu.a()), cxl::b, yu.b, cxl::c, cxl::new);
   public static final DecimalFormat d = ad.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public cxl a(boolean $$0) {
      return new cxl(this.e, $$0);
   }

   public static cxl.a a() {
      return new cxl.a();
   }

   public cxl a(jm<bup> $$0, bus $$1, bsy $$2) {
      Builder<cxl.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (cxl.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new cxl.b($$0, $$1, $$2));
      return new cxl($$3.build(), this.f);
   }

   public void a(bsy $$0, BiConsumer<jm<bup>, bus> $$1) {
      for (cxl.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(bsx $$0, BiConsumer<jm<bup>, bus> $$1) {
      for (cxl.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bsx $$1) {
      double $$2 = $$0;

      for (cxl.b $$3 : this.e) {
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

   public List<cxl.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<cxl.b> a = ImmutableList.builder();

      a() {
      }

      public cxl.a a(jm<bup> $$0, bus $$1, bsy $$2) {
         this.a.add(new cxl.b($$0, $$1, $$2));
         return this;
      }

      public cxl a() {
         return new cxl(this.a.build(), true);
      }
   }

   public static record b(jm<bup> c, bus d, bsy e) {
      public static final Codec<cxl.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bup.a.fieldOf("type").forGetter(cxl.b::a), bus.a.forGetter(cxl.b::b), bsy.l.optionalFieldOf("slot", bsy.a).forGetter(cxl.b::c))
               .apply($$0, cxl.b::new)
      );
      public static final yw<wj, cxl.b> b = yw.a(bup.b, cxl.b::a, bus.c, cxl.b::b, bsy.m, cxl.b::c, cxl.b::new);

      public boolean a(jm<bup> $$0, akq $$1) {
         return $$0.equals(this.c) && $$1.equals(this.d);
      }

      public jm<bup> a() {
         return this.c;
      }

      public bus b() {
         return this.d;
      }

      public bsy c() {
         return this.e;
      }
   }
}
