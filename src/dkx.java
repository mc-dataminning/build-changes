import com.mojang.serialization.MapCodec;

public class dkx extends dlu implements dlx {
   public static final MapCodec<dkx> a = b(dkx::new);
   private static final feq b = dlu.b(8.0, 0.0, 12.0);

   @Override
   public MapCodec<dkx> a() {
      return a;
   }

   public dkx(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return b.a($$0.a($$2));
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if ($$3.a(3) == 0 && $$1.v($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return $$1.a_($$2.e()).a(axa.ax);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if (!$$0.a($$1, $$3)) {
         return dlw.a.m();
      } else {
         return $$4 == ja.b && $$6.a(dlw.nB) ? dlw.nB.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      return new cys(cyw.ef);
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      this.a($$0, $$2);
   }

   protected void a(dip $$0, iu $$1) {
      $$0.a($$1.d(), dlw.nB.m().b(dky.c, eaa.b), 3);
   }
}
