import com.google.common.collect.Lists;
import java.util.Collection;

public class fnm implements fnd.a {
   private static final int a = 160;
   private static final float b = 0.04F;
   private final enn c;
   private Collection<gu> d = Lists.newArrayList();

   public fnm(enn $$0) {
      this.c = $$0;
   }

   public void a(Collection<gu> $$0) {
      this.d = $$0;
   }

   @Override
   public void a(eij $$0, fjx $$1, double $$2, double $$3, double $$4) {
      gu $$5 = this.b().c();

      for (gu $$6 : this.d) {
         if ($$5.a($$6, 160.0)) {
            a($$0, $$1, $$6);
         }
      }
   }

   private static void a(eij $$0, fjx $$1, gu $$2) {
      fnd.a($$0, $$1, $$2.b(-1, -1, -1), $$2.b(1, 1, 1), 1.0F, 0.0F, 0.0F, 0.15F);
      int $$3 = -65536;
      a($$0, $$1, "Raid center", $$2, -65536);
   }

   private static void a(eij $$0, fjx $$1, String $$2, gu $$3, int $$4) {
      double $$5 = (double)$$3.u() + 0.5;
      double $$6 = (double)$$3.v() + 1.3;
      double $$7 = (double)$$3.w() + 0.5;
      fnd.a($$0, $$1, $$2, $$5, $$6, $$7, $$4, 0.04F, true, 0.0F, true);
   }

   private emz b() {
      return this.c.j.m();
   }
}
