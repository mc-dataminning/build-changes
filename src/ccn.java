import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class ccn<T extends cpw> extends cbt {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public ccn(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cbt.a.a));
   }

   @Override
   public boolean b() {
      return this.c.m() == null && !this.c.cZ() && this.c.gM() && !this.c.gJ().a() && !((arm)this.c.dX()).c(this.c.dx());
   }

   @Override
   public boolean c() {
      return this.c.gM() && !this.c.gJ().a() && this.c.dX() instanceof arm && !((arm)this.c.dX()).c(this.c.dx());
   }

   @Override
   public void a() {
      if (this.c.gM()) {
         cpv $$0 = this.c.gJ();
         if (this.c.ag > this.d) {
            this.d = this.c.ag + 20;
            this.a($$0);
         }

         if (!this.c.gr()) {
            ezh $$1 = cfq.a(this.c, 15, 4, ezh.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.P().a($$1.d, $$1.e, $$1.f, 1.0);
            }
         }
      }
   }

   private void a(cpv $$0) {
      if ($$0.u()) {
         Set<cpw> $$1 = Sets.newHashSet();
         List<cpw> $$2 = this.c.dX().a(cpw.class, this.c.cS().g(16.0), $$1x -> !$$1x.gM() && cpx.a($$1x, $$0));
         $$1.addAll($$2);

         for (cpw $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
