import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class cpk implements cpi {
   final coq a;
   final coq b;
   final coq c;

   cpk(coq $$0, coq $$1, coq $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(biu $$0, csf $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public clo a(biu $$0, it $$1) {
      clo $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<ig.c<cnr>> $$3 = cns.a($$1, $$0.a(2));
         Optional<ig.c<cnt>> $$4 = cnu.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            Optional<cnq> $$5 = cnq.a($$1, $$2, false);
            if ($$5.isPresent() && $$5.get().a($$4.get(), $$3.get())) {
               return clo.b;
            }

            clo $$6 = $$2.p();
            $$6.f(1);
            cnq $$7 = new cnq($$3.get(), $$4.get());
            if (cnq.a($$1, $$6, $$7)) {
               return $$6;
            }
         }
      }

      return clo.b;
   }

   @Override
   public clo a(it $$0) {
      clo $$1 = new clo(clr.pE);
      Optional<ig.c<cnt>> $$2 = $$0.d(kd.aG).h().findFirst();
      if ($$2.isPresent()) {
         Optional<ig.c<cnr>> $$3 = $$0.d(kd.aF).b(cns.d);
         if ($$3.isPresent()) {
            cnq $$4 = new cnq($$3.get(), $$2.get());
            cnq.a($$0, $$1, $$4);
         }
      }

      return $$1;
   }

   @Override
   public boolean a(clo $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(clo $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(clo $$0) {
      return this.c.a($$0);
   }

   @Override
   public cox<?> as_() {
      return cox.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(coq::c);
   }

   public static class a implements cox<cpk> {
      private static final Codec<cpk> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  coq.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  coq.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  coq.b.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, cpk::new)
      );

      @Override
      public Codec<cpk> a() {
         return x;
      }

      public cpk b(ty $$0) {
         coq $$1 = coq.b($$0);
         coq $$2 = coq.b($$0);
         coq $$3 = coq.b($$0);
         return new cpk($$1, $$2, $$3);
      }

      public void a(ty $$0, cpk $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
      }
   }
}
