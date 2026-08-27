import javax.annotation.Nullable;

public class czs extends das {
   public czs(gu $$0, dcb $$1) {
      super(czp.J, $$0, $$1);
   }

   @Override
   public dgu.d c() {
      return new czs.a(this.p());
   }

   protected class a extends das.a {
      public a(gu $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(aif $$0, gu $$1, dgl $$2, @Nullable dgl.a $$3) {
         int $$4 = this.a($$0, this.c, czs.this.q());
         return $$4 != 0 && dgu.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(cmm $$0, gu $$1, dcb $$2) {
         ha $$3 = $$2.c(cpz.a).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
