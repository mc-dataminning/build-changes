import java.util.List;

public class czl extends cwa {
   public czl(cxu.a $$0) {
      super($$0);
   }

   @Override
   public cxy n() {
      cxy $$0 = super.n();
      $$0.b(kx.R, new czu(czv.C));
      return $$0;
   }

   @Override
   public void a(cxy $$0, cxu.b $$1, List<wv> $$2, czn $$3) {
      czu $$4 = $$0.a(kx.R);
      if ($$4 != null) {
         $$4.a($$2::add, $$0.a(kx.S, 1.0F), $$1.b());
      }
   }

   @Override
   public wv a(cxy $$0) {
      czu $$1 = $$0.a(kx.R);
      return $$1 != null ? $$1.a(this.m + ".effect.") : super.a($$0);
   }
}
