import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class cep<T extends csi> extends cdv {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public cep(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cdv.a.a));
   }

   @Override
   public boolean b() {
      return this.c.f() == null && !this.c.cX() && this.c.gE() && !this.c.gB().a() && !((aro)this.c.dV()).c(this.c.dv());
   }

   @Override
   public boolean c() {
      return this.c.gE() && !this.c.gB().a() && this.c.dV() instanceof aro && !((aro)this.c.dV()).c(this.c.dv());
   }

   @Override
   public void a() {
      if (this.c.gE()) {
         csh $$0 = this.c.gB();
         if (this.c.af > this.d) {
            this.d = this.c.af + 20;
            this.a($$0);
         }

         if (!this.c.gm()) {
            fdw $$1 = chs.a(this.c, 15, 4, fdw.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.O().a($$1.d, $$1.e, $$1.f, 1.0);
            }
         }
      }
   }

   private void a(csh $$0) {
      if ($$0.u()) {
         Set<csi> $$1 = Sets.newHashSet();
         List<csi> $$2 = this.c.dV().a(csi.class, this.c.cR().g(16.0), $$1x -> !$$1x.gE() && csj.a($$1x, $$0));
         $$1.addAll($$2);

         for (csi $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
