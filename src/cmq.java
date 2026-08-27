import com.google.gson.JsonObject;
import java.util.Optional;
import java.util.stream.Stream;

public class cmq implements cmo {
   private final aer a;
   final cly b;
   final cly c;
   final cly d;

   public cmq(aer $$0, cly $$1, cly $$2, cly $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bgj $$0, cpm $$1) {
      return this.b.a($$0.a(0)) && this.c.a($$0.a(1)) && this.d.a($$0.a(2));
   }

   @Override
   public ciy a(bgj $$0, hs $$1) {
      ciy $$2 = $$0.a(1);
      if (this.c.a($$2)) {
         Optional<he.c<clb>> $$3 = clc.a($$1, $$0.a(2));
         Optional<he.c<cld>> $$4 = cle.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            Optional<cla> $$5 = cla.a($$1, $$2, false);
            if ($$5.isPresent() && $$5.get().a($$4.get(), $$3.get())) {
               return ciy.b;
            }

            ciy $$6 = $$2.p();
            $$6.f(1);
            cla $$7 = new cla($$3.get(), $$4.get());
            if (cla.a($$1, $$6, $$7)) {
               return $$6;
            }
         }
      }

      return ciy.b;
   }

   @Override
   public ciy a(hs $$0) {
      ciy $$1 = new ciy(cjb.oT);
      Optional<he.c<cld>> $$2 = $$0.d(jc.aE).h().findFirst();
      if ($$2.isPresent()) {
         Optional<he.c<clb>> $$3 = $$0.d(jc.aD).b(clc.d);
         if ($$3.isPresent()) {
            cla $$4 = new cla($$3.get(), $$2.get());
            cla.a($$0, $$1, $$4);
         }
      }

      return $$1;
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
      return cmd.v;
   }

   @Override
   public boolean j() {
      return Stream.of(this.b, this.c, this.d).anyMatch(cly::d);
   }

   public static class a implements cmd<cmq> {
      public cmq b(aer $$0, JsonObject $$1) {
         cly $$2 = cly.a(arg.h($$1, "template"));
         cly $$3 = cly.a(arg.h($$1, "base"));
         cly $$4 = cly.a(arg.h($$1, "addition"));
         return new cmq($$0, $$2, $$3, $$4);
      }

      public cmq b(aer $$0, si $$1) {
         cly $$2 = cly.b($$1);
         cly $$3 = cly.b($$1);
         cly $$4 = cly.b($$1);
         return new cmq($$0, $$2, $$3, $$4);
      }

      public void a(si $$0, cmq $$1) {
         $$1.b.a($$0);
         $$1.c.a($$0);
         $$1.d.a($$0);
      }
   }
}
