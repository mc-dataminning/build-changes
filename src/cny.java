import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cny extends cnb {
   private static final Map<ars, cny> a = Maps.newHashMap();
   private final int b;
   private final ars c;
   private final int d;

   protected cny(int $$0, ars $$1, cnb.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.d = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bkc a(cpr $$0) {
      ctx $$1 = $$0.q();
      hx $$2 = $$0.a();
      djp $$3 = $$1.a_($$2);
      if ($$3.a(cxa.dT) && !$$3.c(dba.b)) {
         cng $$4 = $$0.n();
         if (!$$1.B) {
            cfq $$5 = $$0.o();
            if ($$1.c_($$2) instanceof die $$6) {
               $$6.b($$4.p());
               $$1.a(dnz.c, $$2, dnz.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(asd.al);
            }
         }

         return bkc.a($$1.B);
      } else {
         return bkc.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cng $$0, @Nullable ctx $$1, List<vg> $$2, coy $$3) {
      $$2.add(this.w().a(n.h));
   }

   public vu w() {
      return vg.c(this.a() + ".desc");
   }

   @Nullable
   public static cny a(ars $$0) {
      return a.get($$0);
   }

   public ars x() {
      return this.c;
   }

   public int y() {
      return this.d;
   }
}
