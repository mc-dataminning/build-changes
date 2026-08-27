import com.google.gson.JsonObject;
import java.util.Optional;
import java.util.stream.Stream;

public class cjr implements cjp {
   private final acq a;
   final ciz b;
   final ciz c;
   final ciz d;

   public cjr(acq $$0, ciz $$1, ciz $$2, ciz $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bdq $$0, cmm $$1) {
      return this.b.a($$0.a(0)) && this.c.a($$0.a(1)) && this.d.a($$0.a(2));
   }

   @Override
   public cfz a(bdq $$0, hs $$1) {
      cfz $$2 = $$0.a(1);
      if (this.c.a($$2)) {
         Optional<he.c<cic>> $$3 = cid.a($$1, $$0.a(2));
         Optional<he.c<cie>> $$4 = cif.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            Optional<cib> $$5 = cib.a($$1, $$2);
            if ($$5.isPresent() && $$5.get().a($$4.get(), $$3.get())) {
               return cfz.b;
            }

            cfz $$6 = $$2.p();
            $$6.f(1);
            cib $$7 = new cib($$3.get(), $$4.get());
            if (cib.a($$1, $$6, $$7)) {
               return $$6;
            }
         }
      }

      return cfz.b;
   }

   @Override
   public cfz a(hs $$0) {
      cfz $$1 = new cfz(cgc.oT);
      Optional<he.c<cie>> $$2 = $$0.d(jc.aE).h().findFirst();
      if ($$2.isPresent()) {
         Optional<he.c<cic>> $$3 = $$0.d(jc.aD).b(cid.d);
         if ($$3.isPresent()) {
            cib $$4 = new cib($$3.get(), $$2.get());
            cib.a($$0, $$1, $$4);
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cfz $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean b(cfz $$0) {
      return this.c.a($$0);
   }

   @Override
   public boolean c(cfz $$0) {
      return this.d.a($$0);
   }

   @Override
   public acq e() {
      return this.a;
   }

   @Override
   public cje<?> aj_() {
      return cje.v;
   }

   @Override
   public boolean j() {
      return Stream.of(this.b, this.c, this.d).anyMatch(ciz::d);
   }

   public static class a implements cje<cjr> {
      public cjr b(acq $$0, JsonObject $$1) {
         ciz $$2 = ciz.a(aor.h($$1, "template"));
         ciz $$3 = ciz.a(aor.h($$1, "base"));
         ciz $$4 = ciz.a(aor.h($$1, "addition"));
         return new cjr($$0, $$2, $$3, $$4);
      }

      public cjr b(acq $$0, sf $$1) {
         ciz $$2 = ciz.b($$1);
         ciz $$3 = ciz.b($$1);
         ciz $$4 = ciz.b($$1);
         return new cjr($$0, $$2, $$3, $$4);
      }

      public void a(sf $$0, cjr $$1) {
         $$1.b.a($$0);
         $$1.c.a($$0);
         $$1.d.a($$0);
      }
   }
}
