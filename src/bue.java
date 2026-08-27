import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class bue<T extends cgz> extends btk {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public bue(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(btk.a.a));
   }

   @Override
   public boolean a() {
      return this.c.q() == null && !this.c.cO() && this.c.gu() && !this.c.gt().a() && !((ane)this.c.dL()).c(this.c.dl());
   }

   @Override
   public boolean b() {
      return this.c.gu() && !this.c.gt().a() && this.c.dL() instanceof ane && !((ane)this.c.dL()).c(this.c.dl());
   }

   @Override
   public void e() {
      if (this.c.gu()) {
         cgy $$0 = this.c.gt();
         if (this.c.ah > this.d) {
            this.d = this.c.ah + 20;
            this.a($$0);
         }

         if (!this.c.gb()) {
            emc $$1 = bxh.a(this.c, 15, 4, emc.c($$0.t()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.N().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(cgy $$0) {
      if ($$0.v()) {
         Set<cgz> $$1 = Sets.newHashSet();
         List<cgz> $$2 = this.c.dL().a(cgz.class, this.c.cH().g(16.0), $$1x -> !$$1x.gu() && cha.a($$1x, $$0));
         $$1.addAll($$2);

         for (cgz $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
