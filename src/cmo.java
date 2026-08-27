import com.google.gson.JsonObject;
import java.util.Optional;
import java.util.stream.Stream;

public class cmo implements cmm {
   private final aep a;
   final clw b;
   final clw c;
   final clw d;

   public cmo(aep $$0, clw $$1, clw $$2, clw $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bgh $$0, cpk $$1) {
      return this.b.a($$0.a(0)) && this.c.a($$0.a(1)) && this.d.a($$0.a(2));
   }

   @Override
   public ciw a(bgh $$0, ht $$1) {
      ciw $$2 = $$0.a(1);
      if (this.c.a($$2)) {
         Optional<hf.c<ckz>> $$3 = cla.a($$1, $$0.a(2));
         Optional<hf.c<clb>> $$4 = clc.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            Optional<cky> $$5 = cky.a($$1, $$2, false);
            if ($$5.isPresent() && $$5.get().a($$4.get(), $$3.get())) {
               return ciw.b;
            }

            ciw $$6 = $$2.p();
            $$6.f(1);
            cky $$7 = new cky($$3.get(), $$4.get());
            if (cky.a($$1, $$6, $$7)) {
               return $$6;
            }
         }
      }

      return ciw.b;
   }

   @Override
   public ciw a(ht $$0) {
      ciw $$1 = new ciw(ciz.oT);
      Optional<hf.c<clb>> $$2 = $$0.d(jd.aE).h().findFirst();
      if ($$2.isPresent()) {
         Optional<hf.c<ckz>> $$3 = $$0.d(jd.aD).b(cla.d);
         if ($$3.isPresent()) {
            cky $$4 = new cky($$3.get(), $$2.get());
            cky.a($$0, $$1, $$4);
         }
      }

      return $$1;
   }

   @Override
   public boolean a(ciw $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean b(ciw $$0) {
      return this.c.a($$0);
   }

   @Override
   public boolean c(ciw $$0) {
      return this.d.a($$0);
   }

   @Override
   public aep e() {
      return this.a;
   }

   @Override
   public cmb<?> aj_() {
      return cmb.v;
   }

   @Override
   public boolean j() {
      return Stream.of(this.b, this.c, this.d).anyMatch(clw::d);
   }

   public static class a implements cmb<cmo> {
      public cmo b(aep $$0, JsonObject $$1) {
         clw $$2 = clw.a(arf.h($$1, "template"));
         clw $$3 = clw.a(arf.h($$1, "base"));
         clw $$4 = clw.a(arf.h($$1, "addition"));
         return new cmo($$0, $$2, $$3, $$4);
      }

      public cmo b(aep $$0, sh $$1) {
         clw $$2 = clw.b($$1);
         clw $$3 = clw.b($$1);
         clw $$4 = clw.b($$1);
         return new cmo($$0, $$2, $$3, $$4);
      }

      public void a(sh $$0, cmo $$1) {
         $$1.b.a($$0);
         $$1.c.a($$0);
         $$1.d.a($$0);
      }
   }
}
