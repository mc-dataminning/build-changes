import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class cbg<T extends coj> extends cam {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public cbg(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cam.a.a));
   }

   @Override
   public boolean b() {
      return this.c.p() == null && !this.c.cS() && this.c.gC() && !this.c.gz().a() && !((aqu)this.c.dP()).c(this.c.dp());
   }

   @Override
   public boolean c() {
      return this.c.gC() && !this.c.gz().a() && this.c.dP() instanceof aqu && !((aqu)this.c.dP()).c(this.c.dp());
   }

   @Override
   public void a() {
      if (this.c.gC()) {
         coi $$0 = this.c.gz();
         if (this.c.ai > this.d) {
            this.d = this.c.ai + 20;
            this.a($$0);
         }

         if (!this.c.gh()) {
            exa $$1 = cej.a(this.c, 15, 4, exa.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.N().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(coi $$0) {
      if ($$0.u()) {
         Set<coj> $$1 = Sets.newHashSet();
         List<coj> $$2 = this.c.dP().a(coj.class, this.c.cL().g(16.0), $$1x -> !$$1x.gC() && cok.a($$1x, $$0));
         $$1.addAll($$2);

         for (coj $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
