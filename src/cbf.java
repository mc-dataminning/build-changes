import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class cbf<T extends coh> extends cal {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public cbf(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cal.a.a));
   }

   @Override
   public boolean a() {
      return this.c.p() == null && !this.c.cR() && this.c.gH() && !this.c.gE().a() && !((are)this.c.dP()).c(this.c.dp());
   }

   @Override
   public boolean b() {
      return this.c.gH() && !this.c.gE().a() && this.c.dP() instanceof are && !((are)this.c.dP()).c(this.c.dp());
   }

   @Override
   public void e() {
      if (this.c.gH()) {
         cog $$0 = this.c.gE();
         if (this.c.ai > this.d) {
            this.d = this.c.ai + 20;
            this.a($$0);
         }

         if (!this.c.gm()) {
            evp $$1 = cei.a(this.c, 15, 4, evp.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.K().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(cog $$0) {
      if ($$0.u()) {
         Set<coh> $$1 = Sets.newHashSet();
         List<coh> $$2 = this.c.dP().a(coh.class, this.c.cK().g(16.0), $$1x -> !$$1x.gH() && coi.a($$1x, $$0));
         $$1.addAll($$2);

         for (coh $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
