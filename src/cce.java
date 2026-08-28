import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class cce<T extends cpm> extends cbk {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public cce(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cbk.a.a));
   }

   @Override
   public boolean b() {
      return this.c.m() == null && !this.c.cV() && this.c.gF() && !this.c.gC().a() && !((arj)this.c.dS()).c(this.c.ds());
   }

   @Override
   public boolean c() {
      return this.c.gF() && !this.c.gC().a() && this.c.dS() instanceof arj && !((arj)this.c.dS()).c(this.c.ds());
   }

   @Override
   public void a() {
      if (this.c.gF()) {
         cpl $$0 = this.c.gC();
         if (this.c.ag > this.d) {
            this.d = this.c.ag + 20;
            this.a($$0);
         }

         if (!this.c.gk()) {
            eyw $$1 = cfh.a(this.c, 15, 4, eyw.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.P().a($$1.d, $$1.e, $$1.f, 1.0);
            }
         }
      }
   }

   private void a(cpl $$0) {
      if ($$0.u()) {
         Set<cpm> $$1 = Sets.newHashSet();
         List<cpm> $$2 = this.c.dS().a(cpm.class, this.c.cO().g(16.0), $$1x -> !$$1x.gF() && cpn.a($$1x, $$0));
         $$1.addAll($$2);

         for (cpm $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
