import com.mojang.serialization.MapCodec;

public class dar extends cwq implements czi, czy {
   public static final MapCodec<dar> a = b(dar::new);
   public static final dkf<ie> b = djx.T;

   @Override
   public MapCodec<dar> a() {
      return a;
   }

   protected dar(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.k));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public djh a(cph $$0) {
      ic $$1 = $$0.k();
      ic $$2;
      if ($$1.o() == ic.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = ic.b;
      }

      return this.o().a(b, ie.a($$1, $$2));
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dhv($$0, $$1);
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      dgv $$6 = $$1.c_($$2);
      if ($$6 instanceof dhv && $$3.gp()) {
         $$3.a((dhv)$$6);
         return bkb.a($$1.B);
      } else {
         return bkb.d;
      }
   }

   public static boolean a(edg.c $$0, edg.c $$1) {
      ic $$2 = h($$0.b());
      ic $$3 = h($$1.b());
      ic $$4 = n($$0.b());
      ic $$5 = n($$1.b());
      dhv.a $$6 = dhv.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dhv.a.b : dhv.a.a);
      boolean $$7 = $$6 == dhv.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static ic h(djh $$0) {
      return $$0.c(b).a();
   }

   public static ic n(djh $$0) {
      return $$0.c(b).b();
   }
}
