import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class cwk implements cwi {
   final cvp a;
   final cvp b;
   final cvp c;

   public cwk(cvp $$0, cvp $$1, cvp $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bny $$0, czg $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public crs a(bny $$0, jb $$1) {
      crs $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<in.c<ctu>> $$3 = ctv.a($$1, $$0.a(2));
         Optional<in.c<ctw>> $$4 = ctx.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            ctt $$5 = $$2.a(jr.B);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return crs.i;
            }

            crs $$6 = $$2.c(1);
            $$6.b(jr.B, new ctt($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return crs.i;
   }

   @Override
   public crs a(jb $$0) {
      crs $$1 = new crs(crv.pG);
      Optional<in.c<ctw>> $$2 = $$0.d(ku.aM).h().findFirst();
      Optional<in.c<ctu>> $$3 = $$0.d(ku.aL).b(ctv.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(jr.B, new ctt($$3.get(), $$2.get()));
      }

      return $$1;
   }

   @Override
   public boolean a(crs $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(crs $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(crs $$0) {
      return this.c.a($$0);
   }

   @Override
   public cvw<?> ao_() {
      return cvw.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cvp::c);
   }

   public static class a implements cvw<cwk> {
      private static final Codec<cwk> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cvp.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cvp.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cvp.c.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, cwk::new)
      );
      public static final yg<vt, cwk> x = yg.a(cwk.a::a, cwk.a::a);

      @Override
      public Codec<cwk> a() {
         return y;
      }

      @Override
      public yg<vt, cwk> b() {
         return x;
      }

      private static cwk a(vt $$0) {
         cvp $$1 = cvp.b.decode($$0);
         cvp $$2 = cvp.b.decode($$0);
         cvp $$3 = cvp.b.decode($$0);
         return new cwk($$1, $$2, $$3);
      }

      private static void a(vt $$0, cwk $$1) {
         cvp.b.encode($$0, $$1.a);
         cvp.b.encode($$0, $$1.b);
         cvp.b.encode($$0, $$1.c);
      }
   }
}
