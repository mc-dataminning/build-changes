import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class cbe<T extends coh> extends cak {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public cbe(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cak.a.a));
   }

   @Override
   public boolean b() {
      return this.c.p() == null && !this.c.cS() && this.c.gD() && !this.c.gA().a() && !((aqt)this.c.dQ()).c(this.c.dq());
   }

   @Override
   public boolean c() {
      return this.c.gD() && !this.c.gA().a() && this.c.dQ() instanceof aqt && !((aqt)this.c.dQ()).c(this.c.dq());
   }

   @Override
   public void a() {
      if (this.c.gD()) {
         cog $$0 = this.c.gA();
         if (this.c.ai > this.d) {
            this.d = this.c.ai + 20;
            this.a($$0);
         }

         if (!this.c.gi()) {
            eww $$1 = ceh.a(this.c, 15, 4, eww.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.J().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(cog $$0) {
      if ($$0.u()) {
         Set<coh> $$1 = Sets.newHashSet();
         List<coh> $$2 = this.c.dQ().a(coh.class, this.c.cL().g(16.0), $$1x -> !$$1x.gD() && coi.a($$1x, $$0));
         $$1.addAll($$2);

         for (coh $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
