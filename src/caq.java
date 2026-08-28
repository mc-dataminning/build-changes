import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class caq<T extends cnt> extends bzw {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public caq(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bzw.a.a));
   }

   @Override
   public boolean a() {
      return this.c.p() == null && !this.c.cR() && this.c.gE() && !this.c.gB().a() && !((aqk)this.c.dP()).c(this.c.dp());
   }

   @Override
   public boolean b() {
      return this.c.gE() && !this.c.gB().a() && this.c.dP() instanceof aqk && !((aqk)this.c.dP()).c(this.c.dp());
   }

   @Override
   public void e() {
      if (this.c.gE()) {
         cns $$0 = this.c.gB();
         if (this.c.ai > this.d) {
            this.d = this.c.ai + 20;
            this.a($$0);
         }

         if (!this.c.gj()) {
            evz $$1 = cdt.a(this.c, 15, 4, evz.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.K().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(cns $$0) {
      if ($$0.u()) {
         Set<cnt> $$1 = Sets.newHashSet();
         List<cnt> $$2 = this.c.dP().a(cnt.class, this.c.cK().g(16.0), $$1x -> !$$1x.gE() && cnu.a($$1x, $$0));
         $$1.addAll($$2);

         for (cnt $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
