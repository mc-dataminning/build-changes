import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class cai<T extends cnk> extends bzo {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public cai(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bzo.a.a));
   }

   @Override
   public boolean a() {
      return this.c.p() == null && !this.c.cR() && this.c.gG() && !this.c.gD().a() && !((aqn)this.c.dP()).c(this.c.dp());
   }

   @Override
   public boolean b() {
      return this.c.gG() && !this.c.gD().a() && this.c.dP() instanceof aqn && !((aqn)this.c.dP()).c(this.c.dp());
   }

   @Override
   public void e() {
      if (this.c.gG()) {
         cnj $$0 = this.c.gD();
         if (this.c.ai > this.d) {
            this.d = this.c.ai + 20;
            this.a($$0);
         }

         if (!this.c.gl()) {
            eum $$1 = cdl.a(this.c, 15, 4, eum.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.K().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(cnj $$0) {
      if ($$0.u()) {
         Set<cnk> $$1 = Sets.newHashSet();
         List<cnk> $$2 = this.c.dP().a(cnk.class, this.c.cK().g(16.0), $$1x -> !$$1x.gG() && cnl.a($$1x, $$0));
         $$1.addAll($$2);

         for (cnk $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
