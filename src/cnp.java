import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cnp extends cms {
   private static final Map<arq, cnp> a = Maps.newHashMap();
   private final int b;
   private final arq c;
   private final int d;

   protected cnp(int $$0, arq $$1, cms.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.d = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bka a(cpi $$0) {
      cto $$1 = $$0.q();
      hx $$2 = $$0.a();
      djg $$3 = $$1.a_($$2);
      if ($$3.a(cwr.dT) && !$$3.c(dar.b)) {
         cmx $$4 = $$0.n();
         if (!$$1.B) {
            cfh $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dhv $$6) {
               $$6.b($$4.p());
               $$1.a(dnq.c, $$2, dnq.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(asb.al);
            }
         }

         return bka.a($$1.B);
      } else {
         return bka.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cmx $$0, @Nullable cto $$1, List<vf> $$2, cop $$3) {
      $$2.add(this.i().a(n.h));
   }

   public vt i() {
      return vf.c(this.a() + ".desc");
   }

   @Nullable
   public static cnp a(arq $$0) {
      return a.get($$0);
   }

   public arq x() {
      return this.c;
   }

   public int y() {
      return this.d;
   }
}
