import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class cuh implements cuf {
   final ctm a;
   final ctm b;
   final ctm c;

   public cuh(ctm $$0, ctm $$1, ctm $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bmw $$0, cxb $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cqm a(bmw $$0, iz $$1) {
      cqm $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<il.c<csp>> $$3 = csq.a($$1, $$0.a(2));
         Optional<il.c<csr>> $$4 = css.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            Optional<cso> $$5 = cso.a($$1, $$2, false);
            if ($$5.isPresent() && $$5.get().a($$4.get(), $$3.get())) {
               return cqm.h;
            }

            cqm $$6 = $$2.q();
            $$6.f(1);
            cso $$7 = new cso($$3.get(), $$4.get());
            if (cso.a($$1, $$6, $$7)) {
               return $$6;
            }
         }
      }

      return cqm.h;
   }

   @Override
   public cqm a(iz $$0) {
      cqm $$1 = new cqm(cqp.pG);
      Optional<il.c<csr>> $$2 = $$0.d(kj.aK).h().findFirst();
      if ($$2.isPresent()) {
         Optional<il.c<csp>> $$3 = $$0.d(kj.aJ).b(csq.d);
         if ($$3.isPresent()) {
            cso $$4 = new cso($$3.get(), $$2.get());
            cso.a($$0, $$1, $$4);
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cqm $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cqm $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cqm $$0) {
      return this.c.a($$0);
   }

   @Override
   public ctt<?> ar_() {
      return ctt.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(ctm::c);
   }

   public static class a implements ctt<cuh> {
      private static final Codec<cuh> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ctm.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  ctm.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  ctm.c.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, cuh::new)
      );
      public static final xs<vf, cuh> x = xs.a(cuh.a::a, cuh.a::a);

      @Override
      public Codec<cuh> a() {
         return y;
      }

      @Override
      public xs<vf, cuh> b() {
         return x;
      }

      private static cuh a(vf $$0) {
         ctm $$1 = ctm.b.decode($$0);
         ctm $$2 = ctm.b.decode($$0);
         ctm $$3 = ctm.b.decode($$0);
         return new cuh($$1, $$2, $$3);
      }

      private static void a(vf $$0, cuh $$1) {
         ctm.b.encode($$0, $$1.a);
         ctm.b.encode($$0, $$1.b);
         ctm.b.encode($$0, $$1.c);
      }
   }
}
