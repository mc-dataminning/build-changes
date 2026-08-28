import java.util.List;

public class cvs extends crt {
   public cvs(ctv.a $$0) {
      super($$0);
   }

   @Override
   public cua w() {
      cua $$0 = super.w();
      $$0.b(kn.G, new cwb(cwc.C));
      return $$0;
   }

   @Override
   public void a(cua $$0, ctv.b $$1, List<wu> $$2, cvt $$3) {
      cwb $$4 = $$0.a(kn.G);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public String h(cua $$0) {
      return cvz.a($$0.a(kn.G, cwb.a).e(), this.a() + ".effect.");
   }
}
