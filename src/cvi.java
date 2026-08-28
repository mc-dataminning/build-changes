import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cvi extends cui {
   private static final Map<avy, cvi> a = Maps.newHashMap();
   private final int b;
   private final avy c;
   private final int j;

   protected cvi(int $$0, avy $$1, cui.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.j = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bqs a(cya $$0) {
      dbw $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsa $$3 = $$1.a_($$2);
      if ($$3.a(dez.dT) && !$$3.c(dja.b)) {
         cun $$4 = $$0.n();
         if (!$$1.B) {
            cmv $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dqg $$6) {
               $$6.b($$4.s());
               $$1.a(dwt.c, $$2, dwt.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(awj.al);
            }
         }

         return bqs.a($$1.B);
      } else {
         return bqs.e;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cun $$0, cui.b $$1, List<xo> $$2, cwg $$3) {
      $$2.add(this.k().a(n.h));
   }

   public yc k() {
      return xo.c(this.a() + ".desc");
   }

   @Nullable
   public static cvi a(avy $$0) {
      return a.get($$0);
   }

   public avy l() {
      return this.c;
   }

   public int m() {
      return this.j;
   }
}
