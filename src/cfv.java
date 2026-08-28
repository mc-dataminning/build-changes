import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class cfv<T extends ctz> extends cfb {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public cfv(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cfb.a.a));
   }

   @Override
   public boolean b() {
      return this.c.f() == null && !this.c.cX() && this.c.gI() && !this.c.gF().a() && !a(this.c.dV()).c(this.c.dv());
   }

   @Override
   public boolean c() {
      return this.c.gI() && !this.c.gF().a() && !a(this.c.dV()).c(this.c.dv());
   }

   @Override
   public void a() {
      if (this.c.gI()) {
         cty $$0 = this.c.gF();
         if (this.c.af > this.d) {
            this.d = this.c.af + 20;
            this.a($$0);
         }

         if (!this.c.gq()) {
            fgc $$1 = ciy.a(this.c, 15, 4, fgc.c($$0.q()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.O().a($$1.d, $$1.e, $$1.f, 1.0);
            }
         }
      }
   }

   private void a(cty $$0) {
      if ($$0.r()) {
         asb $$1 = a(this.c.dV());
         Set<ctz> $$2 = Sets.newHashSet();
         List<ctz> $$3 = $$1.a(ctz.class, this.c.cR().g(16.0), $$0x -> !$$0x.gI() && cua.a($$0x));
         $$2.addAll($$3);

         for (ctz $$4 : $$2) {
            $$0.a($$1, $$0.j(), $$4, null, true);
         }
      }
   }
}
