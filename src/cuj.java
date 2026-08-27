import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cuj extends ctj {
   private static final Map<avg, cuj> a = Maps.newHashMap();
   private final int b;
   private final avg c;
   private final int j;

   protected cuj(int $$0, avg $$1, ctj.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.j = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bpu a(cxb $$0) {
      dax $$1 = $$0.q();
      io $$2 = $$0.a();
      drb $$3 = $$1.a_($$2);
      if ($$3.a(dea.dT) && !$$3.c(dib.b)) {
         cto $$4 = $$0.n();
         if (!$$1.B) {
            clw $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dph $$6) {
               $$6.b($$4.s());
               $$1.a(dvu.c, $$2, dvu.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(avr.al);
            }
         }

         return bpu.a($$1.B);
      } else {
         return bpu.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cto $$0, @Nullable dax $$1, List<wx> $$2, cvh $$3) {
      $$2.add(this.j().a(n.h));
   }

   public xl j() {
      return wx.c(this.a() + ".desc");
   }

   @Nullable
   public static cuj a(avg $$0) {
      return a.get($$0);
   }

   public avg k() {
      return this.c;
   }

   public int l() {
      return this.j;
   }
}
