import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cwi extends cwk {
   private final axf<cwh> a;

   public cwi(axf<cwh> $$0, cwk.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public void a(cwo $$0, cwk.b $$1, List<wp> $$2, cyg $$3) {
      super.a($$0, $$1, $$2, $$3);
      jt.a $$4 = $$1.a();
      if ($$4 != null) {
         Optional<jr<cwh>> $$5 = this.a($$0, $$4);
         if ($$5.isPresent()) {
            xd $$6 = $$5.get().a().d().f();
            ws.a($$6, xm.a.a(n.h));
            $$2.add($$6);
         }
      }
   }

   public static cwo a(cwk $$0, jr<cwh> $$1) {
      cwo $$2 = new cwo($$0);
      $$2.b(kv.Z, $$1);
      return $$2;
   }

   @Override
   public bsj a(dgh $$0, cow $$1, bsi $$2) {
      cwo $$3 = $$1.b($$2);
      Optional<? extends jr<cwh>> $$4 = this.a($$3, $$1.dX());
      if ($$4.isPresent()) {
         cwh $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gE().a($$3, ayz.d($$5.b() * 20.0F));
         $$1.b(awk.c.b(this));
         return bsj.c;
      } else {
         return bsj.d;
      }
   }

   @Override
   public int a(cwo $$0, bvg $$1) {
      Optional<jr<cwh>> $$2 = this.a($$0, $$1.dX());
      return $$2.<Integer>map($$0x -> ayz.d(((cwh)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<jr<cwh>> a(cwo $$0, jt.a $$1) {
      jr<cwh> $$2 = $$0.a(kv.Z);
      if ($$2 != null) {
         return Optional.of($$2);
      } else {
         Optional<jv.c<cwh>> $$3 = $$1.d(mc.I).a(this.a);
         if ($$3.isPresent()) {
            Iterator<jr<cwh>> $$4 = $$3.get().iterator();
            if ($$4.hasNext()) {
               return Optional.of($$4.next());
            }
         }

         return Optional.empty();
      }
   }

   @Override
   public cwq b(cwo $$0) {
      return cwq.i;
   }

   private static void a(dgh $$0, cow $$1, cwh $$2) {
      avz $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awb.c, $$4, 1.0F);
      $$0.a(ebs.B, $$1.dt(), ebs.a.a($$1));
   }
}
