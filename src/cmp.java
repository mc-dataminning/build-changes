import com.google.gson.JsonObject;
import java.util.stream.Stream;

public class cmp implements cmo {
   private final aer a;
   final cly b;
   final cly c;
   final cly d;
   final ciy e;

   public cmp(aer $$0, cly $$1, cly $$2, cly $$3, ciy $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   @Override
   public boolean a(bgj $$0, cpm $$1) {
      return this.b.a($$0.a(0)) && this.c.a($$0.a(1)) && this.d.a($$0.a(2));
   }

   @Override
   public ciy a(bgj $$0, hs $$1) {
      ciy $$2 = this.e.p();
      qr $$3 = $$0.a(1).v();
      if ($$3 != null) {
         $$2.c($$3.h());
      }

      return $$2;
   }

   @Override
   public ciy a(hs $$0) {
      return this.e;
   }

   @Override
   public boolean a(ciy $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean b(ciy $$0) {
      return this.c.a($$0);
   }

   @Override
   public boolean c(ciy $$0) {
      return this.d.a($$0);
   }

   @Override
   public aer e() {
      return this.a;
   }

   @Override
   public cmd<?> aj_() {
      return cmd.u;
   }

   @Override
   public boolean j() {
      return Stream.of(this.b, this.c, this.d).anyMatch(cly::d);
   }

   public static class a implements cmd<cmp> {
      public cmp b(aer $$0, JsonObject $$1) {
         cly $$2 = cly.a(arg.h($$1, "template"));
         cly $$3 = cly.a(arg.h($$1, "base"));
         cly $$4 = cly.a(arg.h($$1, "addition"));
         ciy $$5 = cmg.a(arg.u($$1, "result"));
         return new cmp($$0, $$2, $$3, $$4, $$5);
      }

      public cmp b(aer $$0, si $$1) {
         cly $$2 = cly.b($$1);
         cly $$3 = cly.b($$1);
         cly $$4 = cly.b($$1);
         ciy $$5 = $$1.q();
         return new cmp($$0, $$2, $$3, $$4, $$5);
      }

      public void a(si $$0, cmp $$1) {
         $$1.b.a($$0);
         $$1.c.a($$0);
         $$1.d.a($$0);
         $$0.a($$1.e);
      }
   }
}
