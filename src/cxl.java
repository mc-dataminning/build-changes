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
      $$0 -> $$0.group(cxl.b.a.listOf().fieldOf("modifiers").forGetter(cxl::b), axu.a(Codec.BOOL, "show_in_tooltip", true).forGetter(cxl::c))
            .apply($$0, cxl::new)
   );
   public static final Codec<cxl> b = axu.a(g, cxl.b.a.listOf(), $$0 -> new cxl($$0, true));
   public static final zc<wp, cxl> c = zc.a(cxl.b.b.a(za.a()), cxl::b, za.b, cxl::c, cxl::new);
   public static final DecimalFormat d = ad.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public cxl a(boolean $$0) {
      return new cxl(this.e, $$0);
   }

   public static cxl.a a() {
      return new cxl.a();
   }

   public cxl a(ja<btq> $$0, btt $$1, bsd $$2) {
      return new cxl(ad.a(this.e, new cxl.b($$0, $$1, $$2)), this.f);
   }

   public void a(bsc $$0, BiConsumer<ja<btq>, btt> $$1) {
      for (cxl.b $$2 : this.e) {
         if ($$2.e.a($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bsc $$1) {
      double $$2 = $$0;

      for (cxl.b $$3 : this.e) {
         if ($$3.e.a($$1)) {
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

      public cxl.a a(ja<btq> $$0, btt $$1, bsd $$2) {
         this.a.add(new cxl.b($$0, $$1, $$2));
         return this;
      }

      public cxl a() {
         return new cxl(this.a.build(), true);
      }
   }

   public static record b(ja<btq> c, btt d, bsd e) {
      public static final Codec<cxl.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lh.u.r().fieldOf("type").forGetter(cxl.b::a), btt.a.forGetter(cxl.b::b), axu.a(bsd.k, "slot", bsd.a).forGetter(cxl.b::c))
               .apply($$0, cxl.b::new)
      );
      public static final zc<wp, cxl.b> b = zc.a(za.b(li.c), cxl.b::a, btt.c, cxl.b::b, bsd.l, cxl.b::c, cxl.b::new);

      public ja<btq> a() {
         return this.c;
      }

      public btt b() {
         return this.d;
      }

      public bsd c() {
         return this.e;
      }
   }
}
