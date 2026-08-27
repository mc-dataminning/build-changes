import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public record cvs(List<cvs.b> e, boolean f) {
   public static final cvs a = new cvs(List.of(), true);
   private static final Codec<cvs> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(cvs.b.a.listOf().fieldOf("modifiers").forGetter(cvs::b), axh.a(Codec.BOOL, "show_in_tooltip", true).forGetter(cvs::c))
            .apply($$0, cvs::new)
   );
   public static final Codec<cvs> b = axh.a(g, cvs.b.a.listOf(), $$0 -> new cvs($$0, true));
   public static final ys<wf, cvs> c = ys.a(cvs.b.b.a(yq.a()), cvs::b, yq.b, cvs::c, cvs::new);
   public static final DecimalFormat d = ac.a(new DecimalFormat("#.##"), $$0 -> $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));

   public cvs a(boolean $$0) {
      return new cvs(this.e, $$0);
   }

   public static cvs.a a() {
      return new cvs.a();
   }

   public cvs a(iw<btc> $$0, btf $$1, brp $$2) {
      return new cvs(ac.a(this.e, new cvs.b($$0, $$1, $$2)), this.f);
   }

   public void a(bro $$0, BiConsumer<iw<btc>, btf> $$1) {
      for (cvs.b $$2 : this.e) {
         if ($$2.e.a($$0)) {
            $$1.accept($$2.c, $$2.d);
         }
      }
   }

   public double a(double $$0, bro $$1) {
      double $$2 = $$0;

      for (cvs.b $$3 : this.e) {
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

   public List<cvs.b> b() {
      return this.e;
   }

   public boolean c() {
      return this.f;
   }

   public static class a {
      private final Builder<cvs.b> a = ImmutableList.builder();

      a() {
      }

      public cvs.a a(iw<btc> $$0, btf $$1, brp $$2) {
         this.a.add(new cvs.b($$0, $$1, $$2));
         return this;
      }

      public cvs a() {
         return new cvs(this.a.build(), true);
      }
   }

   public static record b(iw<btc> c, btf d, brp e) {
      public static final Codec<cvs.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ld.u.r().fieldOf("type").forGetter(cvs.b::a), btf.a.forGetter(cvs.b::b), axh.a(brp.k, "slot", brp.a).forGetter(cvs.b::c))
               .apply($$0, cvs.b::new)
      );
      public static final ys<wf, cvs.b> b = ys.a(yq.b(le.c), cvs.b::a, btf.c, cvs.b::b, brp.l, cvs.b::c, cvs.b::new);

      public iw<btc> a() {
         return this.c;
      }

      public btf b() {
         return this.d;
      }

      public brp c() {
         return this.e;
      }
   }
}
