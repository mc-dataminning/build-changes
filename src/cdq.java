import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class cdq<T extends crf> extends ccw {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public cdq(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(ccw.a.a));
   }

   @Override
   public boolean b() {
      return this.c.f() == null && !this.c.cW() && this.c.gG() && !this.c.gD().a() && !((ard)this.c.dU()).c(this.c.du());
   }

   @Override
   public boolean c() {
      return this.c.gG() && !this.c.gD().a() && this.c.dU() instanceof ard && !((ard)this.c.dU()).c(this.c.du());
   }

   @Override
   public void a() {
      if (this.c.gG()) {
         cre $$0 = this.c.gD();
         if (this.c.af > this.d) {
            this.d = this.c.af + 20;
            this.a($$0);
         }

         if (!this.c.go()) {
            fbx $$1 = cgt.a(this.c, 15, 4, fbx.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.O().a($$1.d, $$1.e, $$1.f, 1.0);
            }
         }
      }
   }

   private void a(cre $$0) {
      if ($$0.u()) {
         Set<crf> $$1 = Sets.newHashSet();
         List<crf> $$2 = this.c.dU().a(crf.class, this.c.cQ().g(16.0), $$1x -> !$$1x.gG() && crg.a($$1x, $$0));
         $$1.addAll($$2);

         for (crf $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
