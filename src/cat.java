import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class cat<T extends cnw> extends bzz {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public cat(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bzz.a.a));
   }

   @Override
   public boolean a() {
      return this.c.p() == null && !this.c.cS() && this.c.gF() && !this.c.gC().a() && !((aqm)this.c.dQ()).c(this.c.dq());
   }

   @Override
   public boolean b() {
      return this.c.gF() && !this.c.gC().a() && this.c.dQ() instanceof aqm && !((aqm)this.c.dQ()).c(this.c.dq());
   }

   @Override
   public void e() {
      if (this.c.gF()) {
         cnv $$0 = this.c.gC();
         if (this.c.ai > this.d) {
            this.d = this.c.ai + 20;
            this.a($$0);
         }

         if (!this.c.gk()) {
            ewf $$1 = cdw.a(this.c, 15, 4, ewf.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.K().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(cnv $$0) {
      if ($$0.u()) {
         Set<cnw> $$1 = Sets.newHashSet();
         List<cnw> $$2 = this.c.dQ().a(cnw.class, this.c.cL().g(16.0), $$1x -> !$$1x.gF() && cnx.a($$1x, $$0));
         $$1.addAll($$2);

         for (cnw $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
