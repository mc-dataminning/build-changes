import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvq extends czm {
   public static final MapCodec<cvq> a = b(cvq::new);
   public static final dkb b = dal.aE;
   private static final emm c = cwq.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final emm d = cwq.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final emm e = cwq.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final emm f = cwq.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final emm g = cwq.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final emm h = cwq.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final emm i = cwq.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final emm j = emj.a(c, d, e, f);
   private static final emm k = emj.a(c, g, h, i);
   private static final vf l = vf.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<cvq> a() {
      return a;
   }

   public cvq(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c));
   }

   @Override
   public djh a(cph $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.B) {
         return bkb.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(asc.aC);
         return bkb.b;
      }
   }

   @Nullable
   @Override
   public bke b(djh $$0, ctp $$1, hx $$2) {
      return new bkk(($$2x, $$3, $$4) -> new cid($$2x, $$3, cim.a($$1, $$2)), l);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      ic $$4 = $$0.c(b);
      return $$4.o() == ic.a.a ? j : k;
   }

   @Override
   protected void a(cbt $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, djh $$3, cbt $$4) {
      if (!$$4.aU()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(ctp $$0, hx $$1, cbt $$2) {
      if (!$$2.aU()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bkt a(blv $$0) {
      return $$0.dN().b($$0);
   }

   @Nullable
   public static djh e(djh $$0) {
      if ($$0.a(cws.gS)) {
         return cws.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(cws.gT) ? cws.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }

   @Override
   public int b(djh $$0, csv $$1, hx $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
