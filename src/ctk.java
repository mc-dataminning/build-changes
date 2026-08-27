import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class ctk implements cti {
   final csp a;
   final csp b;
   final csp c;

   public ctk(csp $$0, csp $$1, csp $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bme $$0, cwe $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cpq a(bme $$0, iy $$1) {
      cpq $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<il.c<crs>> $$3 = crt.a($$1, $$0.a(2));
         Optional<il.c<cru>> $$4 = crv.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            Optional<crr> $$5 = crr.a($$1, $$2, false);
            if ($$5.isPresent() && $$5.get().a($$4.get(), $$3.get())) {
               return cpq.h;
            }

            cpq $$6 = $$2.q();
            $$6.f(1);
            crr $$7 = new crr($$3.get(), $$4.get());
            if (crr.a($$1, $$6, $$7)) {
               return $$6;
            }
         }
      }

      return cpq.h;
   }

   @Override
   public cpq a(iy $$0) {
      cpq $$1 = new cpq(cpt.pG);
      Optional<il.c<cru>> $$2 = $$0.d(ki.aK).h().findFirst();
      if ($$2.isPresent()) {
         Optional<il.c<crs>> $$3 = $$0.d(ki.aJ).b(crt.d);
         if ($$3.isPresent()) {
            crr $$4 = new crr($$3.get(), $$2.get());
            crr.a($$0, $$1, $$4);
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cpq $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cpq $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cpq $$0) {
      return this.c.a($$0);
   }

   @Override
   public csw<?> as_() {
      return csw.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(csp::c);
   }

   public static class a implements csw<ctk> {
      private static final Codec<ctk> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  csp.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  csp.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  csp.c.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, ctk::new)
      );
      public static final xq<vd, ctk> x = xq.a(ctk.a::a, ctk.a::a);

      @Override
      public Codec<ctk> a() {
         return y;
      }

      @Override
      public xq<vd, ctk> b() {
         return x;
      }

      private static ctk a(vd $$0) {
         csp $$1 = csp.b.decode($$0);
         csp $$2 = csp.b.decode($$0);
         csp $$3 = csp.b.decode($$0);
         return new ctk($$1, $$2, $$3);
      }

      private static void a(vd $$0, ctk $$1) {
         csp.b.encode($$0, $$1.a);
         csp.b.encode($$0, $$1.b);
         csp.b.encode($$0, $$1.c);
      }
   }
}
