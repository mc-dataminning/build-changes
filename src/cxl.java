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
   public static final zn<xa, cxl> c = zn.a(cxl.b.b.a(zl.a()), cxl::b, zl.b, cxl::c, cxl::new);
   public static final DecimalFormat d = ac.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public cxl a(boolean $$0) {
      return new cxl(this.e, $$0);
   }

   public static cxl.a a() {
      return new cxl.a();
   }

   public cxl a(ji<but> $$0, buw $$1, btd $$2) {
      Builder<cxl.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (cxl.b $$4 : this.e) {
         if (!$$4.d.b().equals($$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new cxl.b($$0, $$1, $$2));
      return new cxl($$3.build(), this.f);
   }

   public void a(btc $$0, BiConsumer<ji<but>, buw> $$1) {
      for (cxl.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, btc $$1) {
      double $$2 = $$0;

      for (cxl.b $$3 : this.e) {
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

      public cxl.a a(ji<but> $$0, buw $$1, btd $$2) {
         this.a.add(new cxl.b($$0, $$1, $$2));
         return this;
      }

      public cxl a() {
         return new cxl(this.a.build(), true);
      }
   }

   public static record b(ji<but> c, buw d, btd e) {
      public static final Codec<cxl.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lp.u.r().fieldOf("type").forGetter(cxl.b::a), buw.a.forGetter(cxl.b::b), btd.l.optionalFieldOf("slot", btd.a).forGetter(cxl.b::c))
               .apply($$0, cxl.b::new)
      );
      public static final zn<xa, cxl.b> b = zn.a(zl.b(lq.c), cxl.b::a, buw.c, cxl.b::b, btd.m, cxl.b::c, cxl.b::new);

      public ji<but> a() {
         return this.c;
      }

      public buw b() {
         return this.d;
      }

      public btd c() {
         return this.e;
      }
   }
}
