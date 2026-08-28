import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class cdx<T extends crk> extends cdd {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public cdx(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cdd.a.a));
   }

   @Override
   public boolean b() {
      return this.c.O_() == null && !this.c.cY() && this.c.gC() && !this.c.gz().a() && !((ash)this.c.dV()).c(this.c.dv());
   }

   @Override
   public boolean c() {
      return this.c.gC() && !this.c.gz().a() && this.c.dV() instanceof ash && !((ash)this.c.dV()).c(this.c.dv());
   }

   @Override
   public void a() {
      if (this.c.gC()) {
         crj $$0 = this.c.gz();
         if (this.c.af > this.d) {
            this.d = this.c.af + 20;
            this.a($$0);
         }

         if (!this.c.gi()) {
            fbx $$1 = cha.a(this.c, 15, 4, fbx.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.L().a($$1.d, $$1.e, $$1.f, 1.0);
            }
         }
      }
   }

   private void a(crj $$0) {
      if ($$0.u()) {
         Set<crk> $$1 = Sets.newHashSet();
         List<crk> $$2 = this.c.dV().a(crk.class, this.c.cR().g(16.0), $$1x -> !$$1x.gC() && crl.a($$1x, $$0));
         $$1.addAll($$2);

         for (crk $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
