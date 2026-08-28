import java.util.List;

public class cwo extends cxd implements cyb {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cwo(cxd.a $$0) {
      super($$0);
   }

   @Override
   public bsy a(daz $$0) {
      dgz $$1 = $$0.q();
      if ($$1 instanceof ard $$2) {
         cxh $$3 = $$0.n();
         fbx $$4 = $$0.l();
         jn $$5 = $$0.k();
         cqk.a(new cqf($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return bsy.a;
   }

   @Override
   public bsy a(dgz $$0, cpr $$1, bsx $$2) {
      if ($$1.fL()) {
         cxh $$3 = $$1.b($$2);
         if ($$0 instanceof ard $$4) {
            cqk.a(new cqf($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(awk.c.b(this));
         }

         return bsy.a;
      } else {
         return bsy.e;
      }
   }

   @Override
   public void a(cxh $$0, cxd.b $$1, List<wp> $$2, cyx $$3) {
      czv $$4 = $$0.a(kv.ah);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cqk a(dgz $$0, kb $$1, cxh $$2, jn $$3) {
      return new cqf($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cyb.a b() {
      return cyb.a.a().a(cwo::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static fbx a(kz $$0, jn $$1) {
      return $$0.a().b((double)$$1.j() * 0.5000099999997474, (double)$$1.k() * 0.5000099999997474, (double)$$1.l() * 0.5000099999997474);
   }
}
