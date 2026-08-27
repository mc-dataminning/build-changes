import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cqi extends cpl {
   private static final Map<ato, cqi> a = Maps.newHashMap();
   private final int b;
   private final ato c;
   private final int d;

   protected cqi(int $$0, ato $$1, cpl.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.d = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bml a(crz $$0) {
      cwe $$1 = $$0.q();
      ib $$2 = $$0.a();
      dme $$3 = $$1.a_($$2);
      if ($$3.a(czh.dT) && !$$3.c(ddh.b)) {
         cpq $$4 = $$0.n();
         if (!$$1.B) {
            cia $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dkm $$6) {
               $$6.a($$4.q());
               $$1.a(dqr.c, $$2, dqr.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(atz.al);
            }
         }

         return bml.a($$1.B);
      } else {
         return bml.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cpq $$0, @Nullable cwe $$1, List<vs> $$2, crh $$3) {
      $$2.add(this.i().a(n.h));
   }

   public wg i() {
      return vs.c(this.a() + ".desc");
   }

   @Nullable
   public static cqi a(ato $$0) {
      return a.get($$0);
   }

   public ato j() {
      return this.c;
   }

   public int y() {
      return this.d;
   }
}
