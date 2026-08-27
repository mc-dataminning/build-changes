import java.util.List;

public class cvi extends crj {
   public cvi(ctl.a $$0) {
      super($$0);
   }

   @Override
   public ctq w() {
      ctq $$0 = super.w();
      $$0.b(kb.F, new cvr(cvs.C));
      return $$0;
   }

   @Override
   public void a(ctq $$0, ctl.b $$1, List<wx> $$2, cvj $$3) {
      cvr $$4 = $$0.a(kb.F);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public String i(ctq $$0) {
      return cvp.a($$0.a(kb.F, cvr.a).f(), this.a() + ".effect.");
   }
}
