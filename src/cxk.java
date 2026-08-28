import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record cxk(List<cxk.b> e, boolean f) {
   public static final cxk a = new cxk(List.of(), true);
   private static final Codec<cxk> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(cxk.b.a.listOf().fieldOf("modifiers").forGetter(cxk::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxk::c))
            .apply($$0, cxk::new)
   );
   public static final Codec<cxk> b = Codec.withAlternative(g, cxk.b.a.listOf(), $$0 -> new cxk($$0, true));
   public static final zn<xa, cxk> c = zn.a(cxk.b.b.a(zl.a()), cxk::b, zl.b, cxk::c, cxk::new);
   public static final DecimalFormat d = ac.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public cxk a(boolean $$0) {
      return new cxk(this.e, $$0);
   }

   public static cxk.a a() {
      return new cxk.a();
   }

   public cxk a(ji<bus> $$0, buv $$1, btc $$2) {
      Builder<cxk.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (cxk.b $$4 : this.e) {
         if (!$$4.d.b().equals($$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new cxk.b($$0, $$1, $$2));
      return new cxk($$3.build(), this.f);
   }

   public void a(btb $$0, BiConsumer<ji<bus>, buv> $$1) {
      for (cxk.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, btb $$1) {
      double $$2 = $$0;

      for (cxk.b $$3 : this.e) {
         if ($$3.e.b($$1)) {
            double $$4 = $$3.d.d();

            $$2 += switch ($$3.d.e()) {
               case a -> $$4;
               case b -> $$4 * $$0;
               case c -> $$4 * $$2;
            };
         }
      }

      return $$2;
   }

   public List<cxk.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<cxk.b> a = ImmutableList.builder();

      a() {
      }

      public cxk.a a(ji<bus> $$0, buv $$1, btc $$2) {
         this.a.add(new cxk.b($$0, $$1, $$2));
         return this;
      }

      public cxk a() {
         return new cxk(this.a.build(), true);
      }
   }

   public static record b(ji<bus> c, buv d, btc e) {
      public static final Codec<cxk.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lp.u.r().fieldOf("type").forGetter(cxk.b::a), buv.a.forGetter(cxk.b::b), btc.l.optionalFieldOf("slot", btc.a).forGetter(cxk.b::c))
               .apply($$0, cxk.b::new)
      );
      public static final zn<xa, cxk.b> b = zn.a(zl.b(lq.c), cxk.b::a, buv.c, cxk.b::b, btc.m, cxk.b::c, cxk.b::new);

      public ji<bus> a() {
         return this.c;
      }

      public buv b() {
         return this.d;
      }

      public btc c() {
         return this.e;
      }
   }
}
