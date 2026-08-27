import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class bwo<T extends cjk> extends bvu {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public bwo(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bvu.a.a));
   }

   @Override
   public boolean a() {
      return this.c.q() == null && !this.c.cL() && this.c.gA() && !this.c.gz().a() && !((apa)this.c.dJ()).c(this.c.dj());
   }

   @Override
   public boolean b() {
      return this.c.gA() && !this.c.gz().a() && this.c.dJ() instanceof apa && !((apa)this.c.dJ()).c(this.c.dj());
   }

   @Override
   public void e() {
      if (this.c.gA()) {
         cjj $$0 = this.c.gz();
         if (this.c.ag > this.d) {
            this.d = this.c.ag + 20;
            this.a($$0);
         }

         if (!this.c.gh()) {
            eov $$1 = bzr.a(this.c, 15, 4, eov.c($$0.t()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.N().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(cjj $$0) {
      if ($$0.v()) {
         Set<cjk> $$1 = Sets.newHashSet();
         List<cjk> $$2 = this.c.dJ().a(cjk.class, this.c.cE().g(16.0), $$1x -> !$$1x.gA() && cjl.a($$1x, $$0));
         $$1.addAll($$2);

         for (cjk $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
