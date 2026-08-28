import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record cxj(List<cxj.b> e, boolean f) {
   public static final cxj a = new cxj(List.of(), true);
   private static final Codec<cxj> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(cxj.b.a.listOf().fieldOf("modifiers").forGetter(cxj::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxj::c))
            .apply($$0, cxj::new)
   );
   public static final Codec<cxj> b = Codec.withAlternative(g, cxj.b.a.listOf(), $$0 -> new cxj($$0, true));
   public static final zm<wz, cxj> c = zm.a(cxj.b.b.a(zk.a()), cxj::b, zk.b, cxj::c, cxj::new);
   public static final DecimalFormat d = ac.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public cxj a(boolean $$0) {
      return new cxj(this.e, $$0);
   }

   public static cxj.a a() {
      return new cxj.a();
   }

   public cxj a(ji<bur> $$0, buu $$1, btb $$2) {
      Builder<cxj.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (cxj.b $$4 : this.e) {
         if (!$$4.d.b().equals($$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new cxj.b($$0, $$1, $$2));
      return new cxj($$3.build(), this.f);
   }

   public void a(bta $$0, BiConsumer<ji<bur>, buu> $$1) {
      for (cxj.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bta $$1) {
      double $$2 = $$0;

      for (cxj.b $$3 : this.e) {
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

   public List<cxj.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<cxj.b> a = ImmutableList.builder();

      a() {
      }

      public cxj.a a(ji<bur> $$0, buu $$1, btb $$2) {
         this.a.add(new cxj.b($$0, $$1, $$2));
         return this;
      }

      public cxj a() {
         return new cxj(this.a.build(), true);
      }
   }

   public static record b(ji<bur> c, buu d, btb e) {
      public static final Codec<cxj.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lp.u.r().fieldOf("type").forGetter(cxj.b::a), buu.a.forGetter(cxj.b::b), btb.l.optionalFieldOf("slot", btb.a).forGetter(cxj.b::c))
               .apply($$0, cxj.b::new)
      );
      public static final zm<wz, cxj.b> b = zm.a(zk.b(lq.c), cxj.b::a, buu.c, cxj.b::b, btb.m, cxj.b::c, cxj.b::new);

      public ji<bur> a() {
         return this.c;
      }

      public buu b() {
         return this.d;
      }

      public btb c() {
         return this.e;
      }
   }
}
