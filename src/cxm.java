import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record cxm(List<cxm.b> e, boolean f) {
   public static final cxm a = new cxm(List.of(), true);
   private static final Codec<cxm> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(cxm.b.a.listOf().fieldOf("modifiers").forGetter(cxm::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxm::c))
            .apply($$0, cxm::new)
   );
   public static final Codec<cxm> b = Codec.withAlternative(g, cxm.b.a.listOf(), $$0 -> new cxm($$0, true));
   public static final zn<xa, cxm> c = zn.a(cxm.b.b.a(zl.a()), cxm::b, zl.b, cxm::c, cxm::new);
   public static final DecimalFormat d = ac.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public cxm a(boolean $$0) {
      return new cxm(this.e, $$0);
   }

   public static cxm.a a() {
      return new cxm.a();
   }

   public cxm a(ji<buu> $$0, bux $$1, bte $$2) {
      Builder<cxm.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (cxm.b $$4 : this.e) {
         if (!$$4.d.b().equals($$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new cxm.b($$0, $$1, $$2));
      return new cxm($$3.build(), this.f);
   }

   public void a(btd $$0, BiConsumer<ji<buu>, bux> $$1) {
      for (cxm.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, btd $$1) {
      double $$2 = $$0;

      for (cxm.b $$3 : this.e) {
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

   public List<cxm.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<cxm.b> a = ImmutableList.builder();

      a() {
      }

      public cxm.a a(ji<buu> $$0, bux $$1, bte $$2) {
         this.a.add(new cxm.b($$0, $$1, $$2));
         return this;
      }

      public cxm a() {
         return new cxm(this.a.build(), true);
      }
   }

   public static record b(ji<buu> c, bux d, bte e) {
      public static final Codec<cxm.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lp.u.r().fieldOf("type").forGetter(cxm.b::a), bux.a.forGetter(cxm.b::b), bte.l.optionalFieldOf("slot", bte.a).forGetter(cxm.b::c))
               .apply($$0, cxm.b::new)
      );
      public static final zn<xa, cxm.b> b = zn.a(zl.b(lq.c), cxm.b::a, bux.c, cxm.b::b, bte.m, cxm.b::c, cxm.b::new);

      public ji<buu> a() {
         return this.c;
      }

      public bux b() {
         return this.d;
      }

      public bte c() {
         return this.e;
      }
   }
}
