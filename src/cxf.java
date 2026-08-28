import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record cxf(List<cxf.b> e, boolean f) {
   public static final cxf a = new cxf(List.of(), true);
   private static final Codec<cxf> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(cxf.b.a.listOf().fieldOf("modifiers").forGetter(cxf::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxf::c))
            .apply($$0, cxf::new)
   );
   public static final Codec<cxf> b = Codec.withAlternative(g, cxf.b.a.listOf(), $$0 -> new cxf($$0, true));
   public static final zj<ww, cxf> c = zj.a(cxf.b.b.a(zh.a()), cxf::b, zh.b, cxf::c, cxf::new);
   public static final DecimalFormat d = ac.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public cxf a(boolean $$0) {
      return new cxf(this.e, $$0);
   }

   public static cxf.a a() {
      return new cxf.a();
   }

   public cxf a(ji<bun> $$0, buq $$1, bsx $$2) {
      Builder<cxf.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (cxf.b $$4 : this.e) {
         if (!$$4.d.b().equals($$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new cxf.b($$0, $$1, $$2));
      return new cxf($$3.build(), this.f);
   }

   public void a(bsw $$0, BiConsumer<ji<bun>, buq> $$1) {
      for (cxf.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bsw $$1) {
      double $$2 = $$0;

      for (cxf.b $$3 : this.e) {
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

   public List<cxf.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<cxf.b> a = ImmutableList.builder();

      a() {
      }

      public cxf.a a(ji<bun> $$0, buq $$1, bsx $$2) {
         this.a.add(new cxf.b($$0, $$1, $$2));
         return this;
      }

      public cxf a() {
         return new cxf(this.a.build(), true);
      }
   }

   public static record b(ji<bun> c, buq d, bsx e) {
      public static final Codec<cxf.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lp.u.r().fieldOf("type").forGetter(cxf.b::a), buq.a.forGetter(cxf.b::b), bsx.l.optionalFieldOf("slot", bsx.a).forGetter(cxf.b::c))
               .apply($$0, cxf.b::new)
      );
      public static final zj<ww, cxf.b> b = zj.a(zh.b(lq.c), cxf.b::a, buq.c, cxf.b::b, bsx.m, cxf.b::c, cxf.b::new);

      public ji<bun> a() {
         return this.c;
      }

      public buq b() {
         return this.d;
      }

      public bsx c() {
         return this.e;
      }
   }
}
