import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class cau<T extends cnx> extends caa {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public cau(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(caa.a.a));
   }

   @Override
   public boolean a() {
      return this.c.p() == null && !this.c.cT() && this.c.gE() && !this.c.gB().a() && !((aqm)this.c.dR()).c(this.c.dr());
   }

   @Override
   public boolean b() {
      return this.c.gE() && !this.c.gB().a() && this.c.dR() instanceof aqm && !((aqm)this.c.dR()).c(this.c.dr());
   }

   @Override
   public void e() {
      if (this.c.gE()) {
         cnw $$0 = this.c.gB();
         if (this.c.ai > this.d) {
            this.d = this.c.ai + 20;
            this.a($$0);
         }

         if (!this.c.gj()) {
            ewh $$1 = cdx.a(this.c, 15, 4, ewh.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.J().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(cnw $$0) {
      if ($$0.u()) {
         Set<cnx> $$1 = Sets.newHashSet();
         List<cnx> $$2 = this.c.dR().a(cnx.class, this.c.cM().g(16.0), $$1x -> !$$1x.gE() && cny.a($$1x, $$0));
         $$1.addAll($$2);

         for (cnx $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
