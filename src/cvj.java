import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cvj extends cuj {
   private static final Map<avy, cvj> a = Maps.newHashMap();
   private final int b;
   private final avy c;
   private final int j;

   protected cvj(int $$0, avy $$1, cuj.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.j = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bqt a(cyb $$0) {
      dbx $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsb $$3 = $$1.a_($$2);
      if ($$3.a(dfa.dT) && !$$3.c(djb.b)) {
         cuo $$4 = $$0.n();
         if (!$$1.B) {
            cmw $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dqh $$6) {
               $$6.b($$4.s());
               $$1.a(dwu.c, $$2, dwu.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(awj.al);
            }
         }

         return bqt.a($$1.B);
      } else {
         return bqt.e;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<xo> $$2, cwh $$3) {
      $$2.add(this.k().a(n.h));
   }

   public yc k() {
      return xo.c(this.a() + ".desc");
   }

   @Nullable
   public static cvj a(avy $$0) {
      return a.get($$0);
   }

   public avy l() {
      return this.c;
   }

   public int m() {
      return this.j;
   }
}
