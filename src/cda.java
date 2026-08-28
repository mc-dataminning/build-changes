import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class cda<T extends cqm> extends ccg {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public cda(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(ccg.a.a));
   }

   @Override
   public boolean b() {
      return this.c.O_() == null && !this.c.cX() && this.c.gI() && !this.c.gF().a() && !((ard)this.c.dV()).c(this.c.dv());
   }

   @Override
   public boolean c() {
      return this.c.gI() && !this.c.gF().a() && this.c.dV() instanceof ard && !((ard)this.c.dV()).c(this.c.dv());
   }

   @Override
   public void a() {
      if (this.c.gI()) {
         cql $$0 = this.c.gF();
         if (this.c.af > this.d) {
            this.d = this.c.af + 20;
            this.a($$0);
         }

         if (!this.c.go()) {
            fbb $$1 = cgd.a(this.c, 15, 4, fbb.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.P().a($$1.d, $$1.e, $$1.f, 1.0);
            }
         }
      }
   }

   private void a(cql $$0) {
      if ($$0.u()) {
         Set<cqm> $$1 = Sets.newHashSet();
         List<cqm> $$2 = this.c.dV().a(cqm.class, this.c.cR().g(16.0), $$1x -> !$$1x.gI() && cqn.a($$1x, $$0));
         $$1.addAll($$2);

         for (cqm $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
