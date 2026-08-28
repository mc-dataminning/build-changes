import java.util.List;
import java.util.Optional;

public class cwv extends cxd {
   private static final wp a = wp.c("painting.random").a(n.h);
   private final bvi<? extends clo> b;

   public cwv(bvi<? extends clo> $$0, cxd.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bsy a(daz $$0) {
      ji $$1 = $$0.a();
      jn $$2 = $$0.k();
      ji $$3 = $$1.a($$2);
      cpr $$4 = $$0.o();
      cxh $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bsy.d;
      } else {
         dgz $$6 = $$0.q();
         clo $$8;
         if (this.b == bvi.aK) {
            Optional<clr> $$7 = clr.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bsy.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bvi.as) {
            $$8 = new clp($$6, $$3, $$2);
         } else {
            if (this.b != bvi.af) {
               return bsy.a;
            }

            $$8 = new cln($$6, $$3, $$2);
         }

         czo $$12 = $$5.a(kv.Y, czo.a);
         if (!$$12.c()) {
            bvi.a($$6, $$4, $$8, $$12);
         }

         if ($$8.g()) {
            if (!$$6.C) {
               $$8.v();
               $$6.a($$4, ecp.t, $$8.ds());
               $$6.b($$8);
            }

            $$5.h(1);
            return bsy.a;
         } else {
            return bsy.c;
         }
      }
   }

   protected boolean a(cpr $$0, jn $$1, cxh $$2, ji $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(cxh $$0, cxd.b $$1, List<wp> $$2, cyx $$3) {
      super.a($$0, $$1, $$2, $$3);
      jt.a $$4 = $$1.a();
      if ($$4 != null && this.b == bvi.aK) {
         czo $$5 = $$0.a(kv.Y, czo.a);
         if (!$$5.c()) {
            $$5.a($$4.a(ue.a), clr.d).result().ifPresentOrElse($$1x -> {
               ((cls)$$1x.a()).e().ifPresent($$2::add);
               ((cls)$$1x.a()).f().ifPresent($$2::add);
               $$2.add(wp.a("painting.dimensions", ((cls)$$1x.a()).b(), ((cls)$$1x.a()).c()));
            }, () -> $$2.add(a));
         } else if ($$3.b()) {
            $$2.add(a);
         }
      }
   }
}
