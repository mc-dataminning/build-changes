import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cmb extends cle {
   private static final Map<aqq, cmb> a = Maps.newHashMap();
   private final int b;
   private final aqq c;
   private final int d;

   protected cmb(int $$0, aqq $$1, cle.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.d = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bix a(cnt $$0) {
      csa $$1 = $$0.q();
      ht $$2 = $$0.a();
      dhi $$3 = $$1.a_($$2);
      if ($$3.a(cvc.dT) && !$$3.c(czc.b)) {
         clj $$4 = $$0.n();
         if (!$$1.B) {
            cdu $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dge $$6) {
               $$6.b($$4.p());
               $$1.a(dls.c, $$2, dls.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(arb.al);
            }
         }

         return bix.a($$1.B);
      } else {
         return bix.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(clj $$0, @Nullable csa $$1, List<ur> $$2, cna $$3) {
      $$2.add(this.i().a(n.h));
   }

   public vf i() {
      return ur.c(this.a() + ".desc");
   }

   @Nullable
   public static cmb a(aqq $$0) {
      return a.get($$0);
   }

   public aqq x() {
      return this.c;
   }

   public int y() {
      return this.d;
   }
}
