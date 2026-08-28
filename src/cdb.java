import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cdb extends cdk {
   private final cgp a;
   @Nullable
   private bun b;
   private final cfd c = cfd.a().a(64.0);

   public cdb(cgp $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(cbk.a.d));
   }

   @Override
   public boolean b() {
      eyr $$0 = this.a.cO().c(10.0, 8.0, 10.0);
      List<? extends bun> $$1 = this.a.dS().a(cnk.class, this.c, this.a, $$0);
      List<cnx> $$2 = this.a.dS().a(this.c, this.a, $$0);

      for (bun $$3 : $$1) {
         cnk $$4 = (cnk)$$3;

         for (cnx $$5 : $$2) {
            int $$6 = $$4.f($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cnx) || !this.b.Q_() && !((cnx)this.b).f();
   }

   @Override
   public void d() {
      this.a.h(this.b);
      super.d();
   }
}
