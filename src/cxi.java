import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record cxi(List<cxi.b> e, boolean f) {
   public static final cxi a = new cxi(List.of(), true);
   private static final Codec<cxi> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(cxi.b.a.listOf().fieldOf("modifiers").forGetter(cxi::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxi::c))
            .apply($$0, cxi::new)
   );
   public static final Codec<cxi> b = Codec.withAlternative(g, cxi.b.a.listOf(), $$0 -> new cxi($$0, true));
   public static final zm<wz, cxi> c = zm.a(cxi.b.b.a(zk.a()), cxi::b, zk.b, cxi::c, cxi::new);
   public static final DecimalFormat d = ac.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public cxi a(boolean $$0) {
      return new cxi(this.e, $$0);
   }

   public static cxi.a a() {
      return new cxi.a();
   }

   public cxi a(ji<buq> $$0, but $$1, bta $$2) {
      Builder<cxi.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (cxi.b $$4 : this.e) {
         if (!$$4.d.b().equals($$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new cxi.b($$0, $$1, $$2));
      return new cxi($$3.build(), this.f);
   }

   public void a(bsz $$0, BiConsumer<ji<buq>, but> $$1) {
      for (cxi.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bsz $$1) {
      double $$2 = $$0;

      for (cxi.b $$3 : this.e) {
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

   public List<cxi.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<cxi.b> a = ImmutableList.builder();

      a() {
      }

      public cxi.a a(ji<buq> $$0, but $$1, bta $$2) {
         this.a.add(new cxi.b($$0, $$1, $$2));
         return this;
      }

      public cxi a() {
         return new cxi(this.a.build(), true);
      }
   }

   public static record b(ji<buq> c, but d, bta e) {
      public static final Codec<cxi.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lp.u.r().fieldOf("type").forGetter(cxi.b::a), but.a.forGetter(cxi.b::b), bta.l.optionalFieldOf("slot", bta.a).forGetter(cxi.b::c))
               .apply($$0, cxi.b::new)
      );
      public static final zm<wz, cxi.b> b = zm.a(zk.b(lq.c), cxi.b::a, but.c, cxi.b::b, bta.m, cxi.b::c, cxi.b::new);

      public ji<buq> a() {
         return this.c;
      }

      public but b() {
         return this.d;
      }

      public bta c() {
         return this.e;
      }
   }
}
