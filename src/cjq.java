import com.google.gson.JsonObject;
import java.util.stream.Stream;

public class cjq implements cjp {
   private final acq a;
   final ciz b;
   final ciz c;
   final ciz d;
   final cfz e;

   public cjq(acq $$0, ciz $$1, ciz $$2, ciz $$3, cfz $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   @Override
   public boolean a(bdq $$0, cmm $$1) {
      return this.b.a($$0.a(0)) && this.c.a($$0.a(1)) && this.d.a($$0.a(2));
   }

   @Override
   public cfz a(bdq $$0, hs $$1) {
      cfz $$2 = this.e.p();
      qr $$3 = $$0.a(1).v();
      if ($$3 != null) {
         $$2.c($$3.h());
      }

      return $$2;
   }

   @Override
   public cfz a(hs $$0) {
      return this.e;
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
      return cje.u;
   }

   @Override
   public boolean j() {
      return Stream.of(this.b, this.c, this.d).anyMatch(ciz::d);
   }

   public static class a implements cje<cjq> {
      public cjq b(acq $$0, JsonObject $$1) {
         ciz $$2 = ciz.a(aor.h($$1, "template"));
         ciz $$3 = ciz.a(aor.h($$1, "base"));
         ciz $$4 = ciz.a(aor.h($$1, "addition"));
         cfz $$5 = cjh.a(aor.u($$1, "result"));
         return new cjq($$0, $$2, $$3, $$4, $$5);
      }

      public cjq b(acq $$0, sf $$1) {
         ciz $$2 = ciz.b($$1);
         ciz $$3 = ciz.b($$1);
         ciz $$4 = ciz.b($$1);
         cfz $$5 = $$1.r();
         return new cjq($$0, $$2, $$3, $$4, $$5);
      }

      public void a(sf $$0, cjq $$1) {
         $$1.b.a($$0);
         $$1.c.a($$0);
         $$1.d.a($$0);
         $$0.a($$1.e);
      }
   }
}
