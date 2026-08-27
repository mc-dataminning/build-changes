import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ckd extends cjg {
   private static final Map<apf, ckd> a = Maps.newHashMap();
   private final int b;
   private final apf c;
   private final int d;

   protected ckd(int $$0, apf $$1, cjg.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.d = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bhe a(clv $$0) {
      cqb $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfd $$3 = $$1.a_($$2);
      if ($$3.a(cte.dT) && !$$3.c(cxd.b)) {
         cjl $$4 = $$0.n();
         if (!$$1.B) {
            cca $$5 = $$0.o();
            if ($$1.c_($$2) instanceof ddz $$6) {
               $$6.a($$4.p());
               $$1.a(djn.c, $$2, djn.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(apq.al);
            }
         }

         return bhe.a($$1.B);
      } else {
         return bhe.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cjl $$0, @Nullable cqb $$1, List<tl> $$2, clc $$3) {
      $$2.add(this.i().a(n.h));
   }

   public tz i() {
      return tl.c(this.a() + ".desc");
   }

   @Nullable
   public static ckd a(apf $$0) {
      return a.get($$0);
   }

   public apf x() {
      return this.c;
   }

   public int y() {
      return this.d;
   }
}
