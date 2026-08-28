import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class ccw<T extends cqf> extends ccc {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public ccw(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(ccc.a.a));
   }

   @Override
   public boolean b() {
      return this.c.m() == null && !this.c.da() && this.c.gM() && !this.c.gJ().a() && !((arq)this.c.dY()).c(this.c.dy());
   }

   @Override
   public boolean c() {
      return this.c.gM() && !this.c.gJ().a() && this.c.dY() instanceof arq && !((arq)this.c.dY()).c(this.c.dy());
   }

   @Override
   public void a() {
      if (this.c.gM()) {
         cqe $$0 = this.c.gJ();
         if (this.c.ag > this.d) {
            this.d = this.c.ag + 20;
            this.a($$0);
         }

         if (!this.c.gr()) {
            ezr $$1 = cfz.a(this.c, 15, 4, ezr.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.P().a($$1.d, $$1.e, $$1.f, 1.0);
            }
         }
      }
   }

   private void a(cqe $$0) {
      if ($$0.u()) {
         Set<cqf> $$1 = Sets.newHashSet();
         List<cqf> $$2 = this.c.dY().a(cqf.class, this.c.cT().g(16.0), $$1x -> !$$1x.gM() && cqg.a($$1x, $$0));
         $$1.addAll($$2);

         for (cqf $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
