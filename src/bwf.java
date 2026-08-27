import javax.annotation.Nullable;

public class bwf extends bwr {
   private static final int i = 10;
   private static final int j = 7;

   public bwf(bpf $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      apa $$0 = (apa)this.b.dJ();
      ib $$1 = this.b.dj();
      return $$0.c($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected eov h() {
      apa $$0 = (apa)this.b.dJ();
      ib $$1 = this.b.dj();
      jd $$2 = jd.a($$1);
      jd $$3 = bqr.a($$0, $$2, 2);
      return $$3 != $$2 ? bzr.a(this.b, 10, 7, eov.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
