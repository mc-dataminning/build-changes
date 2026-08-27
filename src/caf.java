import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class caf<T extends cnn> extends bzl {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public caf(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bzl.a.a));
   }

   @Override
   public boolean a() {
      return this.c.p() == null && !this.c.cW() && this.c.gN() && !this.c.gM().a() && !((aqt)this.c.dU()).c(this.c.du());
   }

   @Override
   public boolean b() {
      return this.c.gN() && !this.c.gM().a() && this.c.dU() instanceof aqt && !((aqt)this.c.dU()).c(this.c.du());
   }

   @Override
   public void e() {
      if (this.c.gN()) {
         cnm $$0 = this.c.gM();
         if (this.c.am > this.d) {
            this.d = this.c.am + 20;
            this.a($$0);
         }

         if (!this.c.gu()) {
            ewu $$1 = cdi.a(this.c, 15, 4, ewu.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.J().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(cnm $$0) {
      if ($$0.u()) {
         Set<cnn> $$1 = Sets.newHashSet();
         List<cnn> $$2 = this.c.dU().a(cnn.class, this.c.cP().g(16.0), $$1x -> !$$1x.gN() && cno.a($$1x, $$0));
         $$1.addAll($$2);

         for (cnn $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
