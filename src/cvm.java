import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cvm extends cum {
   private static final Map<avz, cvm> a = Maps.newHashMap();
   private final int b;
   private final avz c;
   private final int j;

   protected cvm(int $$0, avz $$1, cum.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.j = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bqw a(cye $$0) {
      dca $$1 = $$0.q();
      iz $$2 = $$0.a();
      dse $$3 = $$1.a_($$2);
      if ($$3.a(dfd.dT) && !$$3.c(dje.b)) {
         cur $$4 = $$0.n();
         if (!$$1.B) {
            cmz $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dqk $$6) {
               $$6.b($$4.s());
               $$1.a(dwx.c, $$2, dwx.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(awk.al);
            }
         }

         return bqw.a($$1.B);
      } else {
         return bqw.e;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cur $$0, cum.b $$1, List<xp> $$2, cwk $$3) {
      $$2.add(this.k().a(n.h));
   }

   public yd k() {
      return xp.c(this.a() + ".desc");
   }

   @Nullable
   public static cvm a(avz $$0) {
      return a.get($$0);
   }

   public avz l() {
      return this.c;
   }

   public int m() {
      return this.j;
   }
}
