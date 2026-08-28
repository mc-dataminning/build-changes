import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cxb extends cxd {
   private final axf<cxa> a;

   public cxb(axf<cxa> $$0, cxd.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public void a(cxh $$0, cxd.b $$1, List<wp> $$2, cyx $$3) {
      super.a($$0, $$1, $$2, $$3);
      jt.a $$4 = $$1.a();
      if ($$4 != null) {
         Optional<jr<cxa>> $$5 = this.a($$0, $$4);
         if ($$5.isPresent()) {
            xd $$6 = $$5.get().a().d().f();
            ws.a($$6, xm.a.a(n.h));
            $$2.add($$6);
         }
      }
   }

   public static cxh a(cxd $$0, jr<cxa> $$1) {
      cxh $$2 = new cxh($$0);
      $$2.b(kv.ab, $$1);
      return $$2;
   }

   @Override
   public bsy a(dgz $$0, cpr $$1, bsx $$2) {
      cxh $$3 = $$1.b($$2);
      Optional<? extends jr<cxa>> $$4 = this.a($$3, $$1.dW());
      if ($$4.isPresent()) {
         cxa $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gH().a($$3, ayz.d($$5.b() * 20.0F));
         $$1.b(awk.c.b(this));
         return bsy.c;
      } else {
         return bsy.d;
      }
   }

   @Override
   public int a(cxh $$0, bvy $$1) {
      Optional<jr<cxa>> $$2 = this.a($$0, $$1.dW());
      return $$2.<Integer>map($$0x -> ayz.d(((cxa)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<jr<cxa>> a(cxh $$0, jt.a $$1) {
      jr<cxa> $$2 = $$0.a(kv.ab);
      if ($$2 != null) {
         return Optional.of($$2);
      } else {
         Optional<jv.c<cxa>> $$3 = $$1.d(mc.I).a(this.a);
         if ($$3.isPresent()) {
            Iterator<jr<cxa>> $$4 = $$3.get().iterator();
            if ($$4.hasNext()) {
               return Optional.of($$4.next());
            }
         }

         return Optional.empty();
      }
   }

   @Override
   public cxj b(cxh $$0) {
      return cxj.i;
   }

   private static void a(dgz $$0, cpr $$1, cxa $$2) {
      avz $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awb.c, $$4, 1.0F);
      $$0.a(ecp.B, $$1.ds(), ecp.a.a($$1));
   }
}
