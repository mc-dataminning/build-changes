import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvp extends czl {
   public static final MapCodec<cvp> a = b(cvp::new);
   public static final dka b = dak.aE;
   private static final eml c = cwp.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final eml d = cwp.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final eml e = cwp.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final eml f = cwp.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final eml g = cwp.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final eml h = cwp.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final eml i = cwp.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final eml j = emi.a(c, d, e, f);
   private static final eml k = emi.a(c, g, h, i);
   private static final vf l = vf.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<cvp> a() {
      return a;
   }

   public cvp(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c));
   }

   @Override
   public djg a(cpg $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$1.B) {
         return bka.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(asb.aC);
         return bka.b;
      }
   }

   @Nullable
   @Override
   public bkd b(djg $$0, cto $$1, hx $$2) {
      return new bkj(($$2x, $$3, $$4) -> new cic($$2x, $$3, cil.a($$1, $$2)), l);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      ic $$4 = $$0.c(b);
      return $$4.o() == ic.a.a ? j : k;
   }

   @Override
   protected void a(cbs $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, djg $$3, cbs $$4) {
      if (!$$4.aU()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(cto $$0, hx $$1, cbs $$2) {
      if (!$$2.aU()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bks a(blu $$0) {
      return $$0.dN().b($$0);
   }

   @Nullable
   public static djg e(djg $$0) {
      if ($$0.a(cwr.gS)) {
         return cwr.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(cwr.gT) ? cwr.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }

   @Override
   public int b(djg $$0, csu $$1, hx $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
