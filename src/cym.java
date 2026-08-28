import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record cym(List<cym.b> e, boolean f) {
   public static final cym a = new cym(List.of(), true);
   private static final Codec<cym> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(cym.b.a.listOf().fieldOf("modifiers").forGetter(cym::b), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cym::c))
            .apply($$0, cym::new)
   );
   public static final Codec<cym> b = Codec.withAlternative(g, cym.b.a.listOf(), $$0 -> new cym($$0, true));
   public static final zf<ws, cym> c = zf.a(cym.b.b.a(zd.a()), cym::b, zd.b, cym::c, cym::new);
   public static final DecimalFormat d = ad.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public cym a(boolean $$0) {
      return new cym(this.e, $$0);
   }

   public static cym.a a() {
      return new cym.a();
   }

   public cym a(jp<bvy> $$0, bwb $$1, bui $$2) {
      Builder<cym.b> $$3 = ImmutableList.builderWithExpectedSize(this.e.size() + 1);

      for (cym.b $$4 : this.e) {
         if (!$$4.a($$0, $$1.b())) {
            $$3.add($$4);
         }
      }

      $$3.add(new cym.b($$0, $$1, $$2));
      return new cym($$3.build(), this.f);
   }

   public void a(bui $$0, BiConsumer<jp<bvy>, bwb> $$1) {
      for (cym.b $$2 : this.e) {
         if ($$2.e.equals($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public void a(buh $$0, BiConsumer<jp<bvy>, bwb> $$1) {
      for (cym.b $$2 : this.e) {
         if ($$2.e.b($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, buh $$1) {
      double $$2 = $$0;

      for (cym.b $$3 : this.e) {
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

   public List<cym.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<cym.b> a = ImmutableList.builder();

      a() {
      }

      public cym.a a(jp<bvy> $$0, bwb $$1, bui $$2) {
         this.a.add(new cym.b($$0, $$1, $$2));
         return this;
      }

      public cym a() {
         return new cym(this.a.build(), true);
      }
   }

   public static record b(jp<bvy> c, bwb d, bui e) {
      public static final Codec<cym.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bvy.a.fieldOf("type").forGetter(cym.b::a), bwb.a.forGetter(cym.b::b), bui.l.optionalFieldOf("slot", bui.a).forGetter(cym.b::c))
               .apply($$0, cym.b::new)
      );
      public static final zf<ws, cym.b> b = zf.a(bvy.b, cym.b::a, bwb.c, cym.b::b, bui.m, cym.b::c, cym.b::new);

      public boolean a(jp<bvy> $$0, alh $$1) {
         return $$0.equals(this.c) && this.d.a($$1);
      }

      public jp<bvy> a() {
         return this.c;
      }

      public bwb b() {
         return this.d;
      }

      public bui c() {
         return this.e;
      }
   }
}
