import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record cxn(List<cxn.b> e, boolean f) {
   public static final cxn a = new cxn(List.of(), true);
   private static final Codec<cxn> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(cxn.b.a.listOf().fieldOf("modifiers").forGetter(cxn::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxn::c))
            .apply($$0, cxn::new)
   );
   public static final Codec<cxn> b = Codec.withAlternative(g, cxn.b.a.listOf(), $$0 -> new cxn($$0, true));
   public static final yx<wk, cxn> c = yx.a(cxn.b.b.a(yv.a()), cxn::b, yv.b, cxn::c, cxn::new);
   public static final DecimalFormat d = ad.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public cxn a(boolean $$0) {
      return new cxn(this.e, $$0);
   }

   public static cxn.a a() {
      return new cxn.a();
   }

   public cxn a(jm<bur> $$0, buu $$1, bsz $$2) {
      Builder<cxn.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (cxn.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new cxn.b($$0, $$1, $$2));
      return new cxn($$3.build(), this.f);
   }

   public void a(bsz $$0, BiConsumer<jm<bur>, buu> $$1) {
      for (cxn.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(bsy $$0, BiConsumer<jm<bur>, buu> $$1) {
      for (cxn.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bsy $$1) {
      double $$2 = $$0;

      for (cxn.b $$3 : this.e) {
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

   public List<cxn.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<cxn.b> a = ImmutableList.builder();

      a() {
      }

      public cxn.a a(jm<bur> $$0, buu $$1, bsz $$2) {
         this.a.add(new cxn.b($$0, $$1, $$2));
         return this;
      }

      public cxn a() {
         return new cxn(this.a.build(), true);
      }
   }

   public static record b(jm<bur> c, buu d, bsz e) {
      public static final Codec<cxn.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bur.a.fieldOf("type").forGetter(cxn.b::a), buu.a.forGetter(cxn.b::b), bsz.l.optionalFieldOf("slot", bsz.a).forGetter(cxn.b::c))
               .apply($$0, cxn.b::new)
      );
      public static final yx<wk, cxn.b> b = yx.a(bur.b, cxn.b::a, buu.c, cxn.b::b, bsz.m, cxn.b::c, cxn.b::new);

      public boolean a(jm<bur> $$0, akr $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public jm<bur> a() {
         return this.c;
      }

      public buu b() {
         return this.d;
      }

      public bsz c() {
         return this.e;
      }
   }
}
