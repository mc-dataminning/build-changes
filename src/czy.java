import java.util.Optional;
import java.util.function.Consumer;

public class czy extends dag {
   private static final xg a = xg.c("painting.random").a(o.h);
   private final bxn<? extends cof> b;

   public czy(bxn<? extends cof> $$0, dag.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bvc a(def $$0) {
      iw $$1 = $$0.a();
      jc $$2 = $$0.k();
      iw $$3 = $$1.a($$2);
      csi $$4 = $$0.o();
      dak $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bvc.d;
      } else {
         dkj $$6 = $$0.q();
         cof $$8;
         if (this.b == bxn.aL) {
            Optional<coi> $$7 = coi.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bvc.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bxn.at) {
            $$8 = new cog($$6, $$3, $$2);
         } else {
            if (this.b != bxn.ag) {
               return bvc.a;
            }

            $$8 = new coe($$6, $$3, $$2);
         }

         bxn.<cof>a($$6, $$5, $$4).accept($$8);
         if ($$8.f()) {
            if (!$$6.C) {
               $$8.u();
               $$6.a($$4, egq.t, $$8.dt());
               $$6.b($$8);
            }

            $$5.h(1);
            return bvc.a;
         } else {
            return bvc.c;
         }
      }
   }

   protected boolean a(csi $$0, jc $$1, dak $$2, iw $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(dak $$0, dag.b $$1, ddo $$2, Consumer<xg> $$3, dbz $$4) {
      if (this.b == bxn.aL && $$2.a(kl.aM)) {
         jg<coj> $$5 = $$0.a(kl.aM);
         if ($$5 != null) {
            $$5.a().e().ifPresent($$3);
            $$5.a().f().ifPresent($$3);
            $$3.accept(xg.a("painting.dimensions", $$5.a().b(), $$5.a().c()));
         } else if ($$4.b()) {
            $$3.accept(a);
         }
      }
   }
}
