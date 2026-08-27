import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dec extends czg implements cxb, ddy {
   public static final MapCodec<dec> c = b(dec::new);
   private static final dkg g = dkf.C;
   public static final dkj d = dkf.R;
   protected static final float e = 6.0F;
   protected static final emv f = cwy.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dec> a() {
      return c;
   }

   public dec(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dkl.b).a(g, Boolean.valueOf(false)).a(d, ic.c));
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return f;
   }

   @Override
   protected boolean b(djp $$0, ctd $$1, hx $$2) {
      return $$0.a(asi.bw) || $$1.b_($$2.c()).a(efa.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      djp $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, bmo $$3, cng $$4) {
      if (!$$0.y_()) {
         hx $$5 = $$1.c();
         djp $$6 = czg.c($$0, $$5, this.o().a(b, dkl.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(g) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      if ($$0.c(b) == dkl.a) {
         return super.a($$0, $$1, $$2);
      } else {
         hx $$3 = $$2.d();
         djp $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      return true;
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return true;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      if ($$3.c(czg.b) == dkl.b) {
         hx $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         cwv.a($$0, $$1, $$2, $$3.c(d));
      } else {
         hx $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public float ay_() {
      return 0.1F;
   }
}
