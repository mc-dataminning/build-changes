import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class cst implements csr {
   final cry a;
   final cry b;
   final cry c;

   public cst(cry $$0, cry $$1, cry $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bln $$0, cvn $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public coz a(bln $$0, iw $$1) {
      coz $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<ij.c<crb>> $$3 = crc.a($$1, $$0.a(2));
         Optional<ij.c<crd>> $$4 = cre.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            Optional<cra> $$5 = cra.a($$1, $$2, false);
            if ($$5.isPresent() && $$5.get().a($$4.get(), $$3.get())) {
               return coz.h;
            }

            coz $$6 = $$2.q();
            $$6.f(1);
            cra $$7 = new cra($$3.get(), $$4.get());
            if (cra.a($$1, $$6, $$7)) {
               return $$6;
            }
         }
      }

      return coz.h;
   }

   @Override
   public coz a(iw $$0) {
      coz $$1 = new coz(cpc.pG);
      Optional<ij.c<crd>> $$2 = $$0.d(kg.aJ).h().findFirst();
      if ($$2.isPresent()) {
         Optional<ij.c<crb>> $$3 = $$0.d(kg.aI).b(crc.d);
         if ($$3.isPresent()) {
            cra $$4 = new cra($$3.get(), $$2.get());
            cra.a($$0, $$1, $$4);
         }
      }

      return $$1;
   }

   @Override
   public boolean a(coz $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(coz $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(coz $$0) {
      return this.c.a($$0);
   }

   @Override
   public csf<?> at_() {
      return csf.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cry::c);
   }

   public static class a implements csf<cst> {
      private static final Codec<cst> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cry.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cry.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cry.c.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, cst::new)
      );
      public static final xo<vb, cst> x = xo.a(cst.a::a, cst.a::a);

      @Override
      public Codec<cst> a() {
         return y;
      }

      @Override
      public xo<vb, cst> b() {
         return x;
      }

      private static cst a(vb $$0) {
         cry $$1 = cry.b.decode($$0);
         cry $$2 = cry.b.decode($$0);
         cry $$3 = cry.b.decode($$0);
         return new cst($$1, $$2, $$3);
      }

      private static void a(vb $$0, cst $$1) {
         cry.b.encode($$0, $$1.a);
         cry.b.encode($$0, $$1.b);
         cry.b.encode($$0, $$1.c);
      }
   }
}
