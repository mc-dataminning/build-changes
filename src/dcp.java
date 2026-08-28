import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record dcp(List<dcp.b> e) {
   public static final dcp a = new dcp(List.of());
   public static final Codec<dcp> b = dcp.b.a.listOf().xmap(dcp::new, dcp::b);
   public static final yy<wl, dcp> c = yy.a(dcp.b.b.a(yw.a()), dcp::b, dcp::new);
   public static final DecimalFormat d = ag.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public static dcp.a a() {
      return new dcp.a();
   }

   public dcp a(jf<byv> $$0, byy $$1, bxe $$2) {
      Builder<dcp.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (dcp.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.a())) {
            $$3.add($$4);
         }
      }

      $$3.add(new dcp.b($$0, $$1, $$2));
      return new dcp($$3.build());
   }

   public void a(bxe $$0, BiConsumer<jf<byv>, byy> $$1) {
      for (dcp.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(bxd $$0, BiConsumer<jf<byv>, byy> $$1) {
      for (dcp.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bxd $$1) {
      double $$2 = $$0;

      for (dcp.b $$3 : this.e) {
         if ($$3.e.b($$1)) {
            double $$4 = $$3.d.b();

            $$2 += switch ($$3.d.c()) {
               case a -> $$4;
               case b -> $$4 * $$0;
               case c -> $$4 * $$2;
            };
         }
      }

      return $$2;
   }

   public List<dcp.b> b() {
      return this.e;
   }

   public static class a {
      private final Builder<dcp.b> a = ImmutableList.builder();

      a() {
      }

      public dcp.a a(jf<byv> $$0, byy $$1, bxe $$2) {
         this.a.add(new dcp.b($$0, $$1, $$2));
         return this;
      }

      public dcp a() {
         return new dcp(this.a.build());
      }
   }

   public static record b(jf<byv> c, byy d, bxe e) {
      public static final Codec<dcp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(byv.a.fieldOf("type").forGetter(dcp.b::a), byy.a.forGetter(dcp.b::b), bxe.m.optionalFieldOf("slot", bxe.a).forGetter(dcp.b::c))
               .apply($$0, dcp.b::new)
      );
      public static final yy<wl, dcp.b> b = yy.a(byv.b, dcp.b::a, byy.c, dcp.b::b, bxe.n, dcp.b::c, dcp.b::new);

      public boolean a(jf<byv> $$0, ali $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public jf<byv> a() {
         return this.c;
      }

      public byy b() {
         return this.d;
      }

      public bxe c() {
         return this.e;
      }
   }
}
