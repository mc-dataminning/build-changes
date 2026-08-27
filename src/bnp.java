import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class bnp<T extends bzw> extends bmv {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public bnp(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bmv.a.a));
   }

   @Override
   public boolean a() {
      return this.c.j() == null && !this.c.bN() && this.c.gn() && !this.c.gm().a() && !((aif)this.c.dI()).b(this.c.di());
   }

   @Override
   public boolean b() {
      return this.c.gn() && !this.c.gm().a() && this.c.dI() instanceof aif && !((aif)this.c.dI()).b(this.c.di());
   }

   @Override
   public void e() {
      if (this.c.gn()) {
         bzv $$0 = this.c.gm();
         if (this.c.ag > this.d) {
            this.d = this.c.ag + 20;
            this.a($$0);
         }

         if (!this.c.fV()) {
            eei $$1 = bqq.a(this.c, 15, 4, eei.c($$0.t()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.J().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(bzv $$0) {
      if ($$0.v()) {
         Set<bzw> $$1 = Sets.newHashSet();
         List<bzw> $$2 = this.c.dI().a(bzw.class, this.c.cE().g(16.0), $$1x -> !$$1x.gn() && bzx.a($$1x, $$0));
         $$1.addAll($$2);

         for (bzw $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
