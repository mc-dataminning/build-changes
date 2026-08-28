import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class ccb<T extends cpj> extends cbh {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public ccb(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cbh.a.a));
   }

   @Override
   public boolean b() {
      return this.c.m() == null && !this.c.cV() && this.c.gG() && !this.c.gD().a() && !((arh)this.c.dS()).c(this.c.ds());
   }

   @Override
   public boolean c() {
      return this.c.gG() && !this.c.gD().a() && this.c.dS() instanceof arh && !((arh)this.c.dS()).c(this.c.ds());
   }

   @Override
   public void a() {
      if (this.c.gG()) {
         cpi $$0 = this.c.gD();
         if (this.c.ag > this.d) {
            this.d = this.c.ag + 20;
            this.a($$0);
         }

         if (!this.c.gl()) {
            eys $$1 = cfe.a(this.c, 15, 4, eys.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.P().a($$1.d, $$1.e, $$1.f, 1.0);
            }
         }
      }
   }

   private void a(cpi $$0) {
      if ($$0.u()) {
         Set<cpj> $$1 = Sets.newHashSet();
         List<cpj> $$2 = this.c.dS().a(cpj.class, this.c.cO().g(16.0), $$1x -> !$$1x.gG() && cpk.a($$1x, $$0));
         $$1.addAll($$2);

         for (cpj $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
