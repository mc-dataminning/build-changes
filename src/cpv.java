import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cpv extends coy {
   private static final Map<atk, cpv> a = Maps.newHashMap();
   private final int b;
   private final atk c;
   private final int d;

   protected cpv(int $$0, atk $$1, coy.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.d = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public blw a(crm $$0) {
      cvr $$1 = $$0.q();
      hz $$2 = $$0.a();
      dlj $$3 = $$1.a_($$2);
      if ($$3.a(cyu.dT) && !$$3.c(dcu.b)) {
         cpd $$4 = $$0.n();
         if (!$$1.B) {
            chl $$5 = $$0.o();
            if ($$1.c_($$2) instanceof djy $$6) {
               $$6.b($$4.q());
               $$1.a(dpw.c, $$2, dpw.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(atv.al);
            }
         }

         return blw.a($$1.B);
      } else {
         return blw.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cpd $$0, @Nullable cvr $$1, List<vq> $$2, cqu $$3) {
      $$2.add(this.w().a(n.h));
   }

   public we w() {
      return vq.c(this.a() + ".desc");
   }

   @Nullable
   public static cpv a(atk $$0) {
      return a.get($$0);
   }

   public atk x() {
      return this.c;
   }

   public int y() {
      return this.d;
   }
}
