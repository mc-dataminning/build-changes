import javax.annotation.Nullable;

public class bvq extends bwc {
   private static final int i = 10;
   private static final int j = 7;

   public bvq(boq $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      aow $$0 = (aow)this.b.dM();
      hz $$1 = this.b.dm();
      return $$0.c($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected enz h() {
      aow $$0 = (aow)this.b.dM();
      hz $$1 = this.b.dm();
      jb $$2 = jb.a($$1);
      jb $$3 = bqc.a($$0, $$2, 2);
      return $$3 != $$2 ? bzc.a(this.b, 10, 7, enz.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
