import javax.annotation.Nullable;

public class cah extends cat {
   private static final int i = 10;
   private static final int j = 7;

   public cah(bth $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      aqk $$0 = (aqk)this.b.dP();
      ja $$1 = this.b.dp();
      return $$0.c($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected evz h() {
      aqk $$0 = (aqk)this.b.dP();
      ja $$1 = this.b.dp();
      kc $$2 = kc.a($$1);
      kc $$3 = but.a($$0, $$2, 2);
      return $$3 != $$2 ? cdt.a(this.b, 10, 7, evz.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
