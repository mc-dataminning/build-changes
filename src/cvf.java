import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cvf extends cuf {
   private static final Map<avv, cvf> a = Maps.newHashMap();
   private final int b;
   private final avv c;
   private final int j;

   protected cvf(int $$0, avv $$1, cuf.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.j = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bqp a(cxx $$0) {
      dbt $$1 = $$0.q();
      iz $$2 = $$0.a();
      drx $$3 = $$1.a_($$2);
      if ($$3.a(dew.dT) && !$$3.c(dix.b)) {
         cuk $$4 = $$0.n();
         if (!$$1.B) {
            cms $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dqd $$6) {
               $$6.b($$4.s());
               $$1.a(dwq.c, $$2, dwq.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(awg.al);
            }
         }

         return bqp.a($$1.B);
      } else {
         return bqp.e;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cuk $$0, cuf.b $$1, List<xl> $$2, cwd $$3) {
      $$2.add(this.k().a(n.h));
   }

   public xz k() {
      return xl.c(this.a() + ".desc");
   }

   @Nullable
   public static cvf a(avv $$0) {
      return a.get($$0);
   }

   public avv l() {
      return this.c;
   }

   public int m() {
      return this.j;
   }
}
