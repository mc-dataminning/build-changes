import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ctj implements cti {
   final csp a;
   final csp b;
   final csp c;
   final cpq d;

   public ctj(csp $$0, csp $$1, csp $$2, cpq $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bme $$0, cwe $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cpq a(bme $$0, iy $$1) {
      return $$0.a(1).a(this.d.d(), this.d.M());
   }

   @Override
   public cpq a(iy $$0) {
      return this.d;
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
      return csw.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(csp::c);
   }

   public static class a implements csw<ctj> {
      private static final Codec<ctj> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  csp.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  csp.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  csp.c.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cpq.c.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, ctj::new)
      );
      public static final xq<vd, ctj> x = xq.a(ctj.a::a, ctj.a::a);

      @Override
      public Codec<ctj> a() {
         return y;
      }

      @Override
      public xq<vd, ctj> b() {
         return x;
      }

      private static ctj a(vd $$0) {
         csp $$1 = csp.b.decode($$0);
         csp $$2 = csp.b.decode($$0);
         csp $$3 = csp.b.decode($$0);
         cpq $$4 = cpq.f.decode($$0);
         return new ctj($$1, $$2, $$3, $$4);
      }

      private static void a(vd $$0, ctj $$1) {
         csp.b.encode($$0, $$1.a);
         csp.b.encode($$0, $$1.b);
         csp.b.encode($$0, $$1.c);
         cpq.f.encode($$0, $$1.d);
      }
   }
}
