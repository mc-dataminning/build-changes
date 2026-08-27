import com.google.gson.JsonObject;
import java.util.stream.Stream;

public class cmn implements cmm {
   private final aep a;
   final clw b;
   final clw c;
   final clw d;
   final ciw e;

   public cmn(aep $$0, clw $$1, clw $$2, clw $$3, ciw $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   @Override
   public boolean a(bgh $$0, cpk $$1) {
      return this.b.a($$0.a(0)) && this.c.a($$0.a(1)) && this.d.a($$0.a(2));
   }

   @Override
   public ciw a(bgh $$0, ht $$1) {
      ciw $$2 = this.e.p();
      qs $$3 = $$0.a(1).v();
      if ($$3 != null) {
         $$2.c($$3.h());
      }

      return $$2;
   }

   @Override
   public ciw a(ht $$0) {
      return this.e;
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
      return cmb.u;
   }

   @Override
   public boolean j() {
      return Stream.of(this.b, this.c, this.d).anyMatch(clw::d);
   }

   public static class a implements cmb<cmn> {
      public cmn b(aep $$0, JsonObject $$1) {
         clw $$2 = clw.a(arf.h($$1, "template"));
         clw $$3 = clw.a(arf.h($$1, "base"));
         clw $$4 = clw.a(arf.h($$1, "addition"));
         ciw $$5 = cme.a(arf.u($$1, "result"));
         return new cmn($$0, $$2, $$3, $$4, $$5);
      }

      public cmn b(aep $$0, sh $$1) {
         clw $$2 = clw.b($$1);
         clw $$3 = clw.b($$1);
         clw $$4 = clw.b($$1);
         ciw $$5 = $$1.q();
         return new cmn($$0, $$2, $$3, $$4, $$5);
      }

      public void a(sh $$0, cmn $$1) {
         $$1.b.a($$0);
         $$1.c.a($$0);
         $$1.d.a($$0);
         $$0.a($$1.e);
      }
   }
}
