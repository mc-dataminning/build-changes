import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record czw(List<czw.b> e, boolean f) {
   public static final czw a = new czw(List.of(), true);
   private static final Codec<czw> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(czw.b.a.listOf().fieldOf("modifiers").forGetter(czw::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(czw::c))
            .apply($$0, czw::new)
   );
   public static final Codec<czw> b = Codec.withAlternative(g, czw.b.a.listOf(), $$0 -> new czw($$0, true));
   public static final yn<wa, czw> c = yn.a(czw.b.b.a(yl.a()), czw::b, yl.b, czw::c, czw::new);
   public static final DecimalFormat d = af.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public czw a(boolean $$0) {
      return new czw(this.e, $$0);
   }

   public static czw.a a() {
      return new czw.a();
   }

   public czw a(jr<bxb> $$0, bxe $$1, bvk $$2) {
      Builder<czw.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (czw.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new czw.b($$0, $$1, $$2));
      return new czw($$3.build(), this.f);
   }

   public void a(bvk $$0, BiConsumer<jr<bxb>, bxe> $$1) {
      for (czw.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(bvj $$0, BiConsumer<jr<bxb>, bxe> $$1) {
      for (czw.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bvj $$1) {
      double $$2 = $$0;

      for (czw.b $$3 : this.e) {
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

   public List<czw.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<czw.b> a = ImmutableList.builder();

      a() {
      }

      public czw.a a(jr<bxb> $$0, bxe $$1, bvk $$2) {
         this.a.add(new czw.b($$0, $$1, $$2));
         return this;
      }

      public czw a() {
         return new czw(this.a.build(), true);
      }
   }

   public static record b(jr<bxb> c, bxe d, bvk e) {
      public static final Codec<czw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bxb.a.fieldOf("type").forGetter(czw.b::a), bxe.a.forGetter(czw.b::b), bvk.l.optionalFieldOf("slot", bvk.a).forGetter(czw.b::c))
               .apply($$0, czw.b::new)
      );
      public static final yn<wa, czw.b> b = yn.a(bxb.b, czw.b::a, bxe.c, czw.b::b, bvk.m, czw.b::c, czw.b::new);

      public boolean a(jr<bxb> $$0, aku $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public jr<bxb> a() {
         return this.c;
      }

      public bxe b() {
         return this.d;
      }

      public bvk c() {
         return this.e;
      }
   }
}
