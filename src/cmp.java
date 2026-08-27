import com.google.gson.JsonObject;
import java.util.Optional;
import java.util.stream.Stream;

public class cmp implements cmn {
   private final aer a;
   final clx b;
   final clx c;
   final clx d;

   public cmp(aer $$0, clx $$1, clx $$2, clx $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bgj $$0, cpl $$1) {
      return this.b.a($$0.a(0)) && this.c.a($$0.a(1)) && this.d.a($$0.a(2));
   }

   @Override
   public cix a(bgj $$0, hs $$1) {
      cix $$2 = $$0.a(1);
      if (this.c.a($$2)) {
         Optional<he.c<cla>> $$3 = clb.a($$1, $$0.a(2));
         Optional<he.c<clc>> $$4 = cld.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            Optional<ckz> $$5 = ckz.a($$1, $$2, false);
            if ($$5.isPresent() && $$5.get().a($$4.get(), $$3.get())) {
               return cix.b;
            }

            cix $$6 = $$2.p();
            $$6.f(1);
            ckz $$7 = new ckz($$3.get(), $$4.get());
            if (ckz.a($$1, $$6, $$7)) {
               return $$6;
            }
         }
      }

      return cix.b;
   }

   @Override
   public cix a(hs $$0) {
      cix $$1 = new cix(cja.oT);
      Optional<he.c<clc>> $$2 = $$0.d(jc.aE).h().findFirst();
      if ($$2.isPresent()) {
         Optional<he.c<cla>> $$3 = $$0.d(jc.aD).b(clb.d);
         if ($$3.isPresent()) {
            ckz $$4 = new ckz($$3.get(), $$2.get());
            ckz.a($$0, $$1, $$4);
         }
      }

      return $$1;
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
      return cmc.v;
   }

   @Override
   public boolean j() {
      return Stream.of(this.b, this.c, this.d).anyMatch(clx::d);
   }

   public static class a implements cmc<cmp> {
      public cmp b(aer $$0, JsonObject $$1) {
         clx $$2 = clx.a(arg.h($$1, "template"));
         clx $$3 = clx.a(arg.h($$1, "base"));
         clx $$4 = clx.a(arg.h($$1, "addition"));
         return new cmp($$0, $$2, $$3, $$4);
      }

      public cmp b(aer $$0, si $$1) {
         clx $$2 = clx.b($$1);
         clx $$3 = clx.b($$1);
         clx $$4 = clx.b($$1);
         return new cmp($$0, $$2, $$3, $$4);
      }

      public void a(si $$0, cmp $$1) {
         $$1.b.a($$0);
         $$1.c.a($$0);
         $$1.d.a($$0);
      }
   }
}
