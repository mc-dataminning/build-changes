import com.mojang.serialization.MapCodec;

public class cxm extends dae implements cws, cxl {
   public static final MapCodec<cxm> c = b(cxm::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<cxm> a() {
      return c;
   }

   public cxm(djf.d $$0) {
      super($$0, ic.a, s_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(t_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(auu $$0) {
      return 1;
   }

   @Override
   protected boolean g(djg $$0) {
      return $$0.i();
   }

   @Override
   protected cwp b() {
      return cwr.sw;
   }

   @Override
   protected djg a(djg $$0, djg $$1) {
      return $$1.a(t_, $$0.c(t_));
   }

   @Override
   protected djg a(djg $$0, auu $$1) {
      return super.a($$0, $$1).a(t_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public cmx a(ctr $$0, hx $$1, djg $$2) {
      return new cmx(cna.wj);
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      return cxl.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      super.a($$0);
      $$0.a(t_);
   }

   @Override
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      return !$$2.c(t_);
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      $$0.a($$2, $$3.a(t_, Boolean.valueOf(true)), 2);
   }
}
