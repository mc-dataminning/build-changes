import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class bqo<T extends ccv> extends bpu {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public bqo(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bpu.a.a));
   }

   @Override
   public boolean a() {
      return this.c.j() == null && !this.c.cO() && this.c.go() && !this.c.gn().a() && !((akk)this.c.dK()).b(this.c.dk());
   }

   @Override
   public boolean b() {
      return this.c.go() && !this.c.gn().a() && this.c.dK() instanceof akk && !((akk)this.c.dK()).b(this.c.dk());
   }

   @Override
   public void e() {
      if (this.c.go()) {
         ccu $$0 = this.c.gn();
         if (this.c.ah > this.d) {
            this.d = this.c.ah + 20;
            this.a($$0);
         }

         if (!this.c.fV()) {
            ehe $$1 = btp.a(this.c, 15, 4, ehe.c($$0.t()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.H().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(ccu $$0) {
      if ($$0.v()) {
         Set<ccv> $$1 = Sets.newHashSet();
         List<ccv> $$2 = this.c.dK().a(ccv.class, this.c.cG().g(16.0), $$1x -> !$$1x.go() && ccw.a($$1x, $$0));
         $$1.addAll($$2);

         for (ccv $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
