import com.google.gson.JsonObject;
import java.util.stream.Stream;

public class cmo implements cmn {
   private final aer a;
   final clx b;
   final clx c;
   final clx d;
   final cix e;

   public cmo(aer $$0, clx $$1, clx $$2, clx $$3, cix $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   @Override
   public boolean a(bgj $$0, cpl $$1) {
      return this.b.a($$0.a(0)) && this.c.a($$0.a(1)) && this.d.a($$0.a(2));
   }

   @Override
   public cix a(bgj $$0, hs $$1) {
      cix $$2 = this.e.p();
      qr $$3 = $$0.a(1).v();
      if ($$3 != null) {
         $$2.c($$3.h());
      }

      return $$2;
   }

   @Override
   public cix a(hs $$0) {
      return this.e;
   }

   @Override
   public boolean a(cix $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean b(cix $$0) {
      return this.c.a($$0);
   }

   @Override
   public boolean c(cix $$0) {
      return this.d.a($$0);
   }

   @Override
   public aer e() {
      return this.a;
   }

   @Override
   public cmc<?> ai_() {
      return cmc.u;
   }

   @Override
   public boolean j() {
      return Stream.of(this.b, this.c, this.d).anyMatch(clx::d);
   }

   public static class a implements cmc<cmo> {
      public cmo b(aer $$0, JsonObject $$1) {
         clx $$2 = clx.a(arg.h($$1, "template"));
         clx $$3 = clx.a(arg.h($$1, "base"));
         clx $$4 = clx.a(arg.h($$1, "addition"));
         cix $$5 = cmf.a(arg.u($$1, "result"));
         return new cmo($$0, $$2, $$3, $$4, $$5);
      }

      public cmo b(aer $$0, si $$1) {
         clx $$2 = clx.b($$1);
         clx $$3 = clx.b($$1);
         clx $$4 = clx.b($$1);
         cix $$5 = $$1.q();
         return new cmo($$0, $$2, $$3, $$4, $$5);
      }

      public void a(si $$0, cmo $$1) {
         $$1.b.a($$0);
         $$1.c.a($$0);
         $$1.d.a($$0);
         $$0.a($$1.e);
      }
   }
}
