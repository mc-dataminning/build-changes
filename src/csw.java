import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class csw extends cry {
   private static final Map<auy, csw> a = Maps.newHashMap();
   private final int b;
   private final auy c;
   private final int j;

   protected csw(int $$0, auy $$1, cry.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.j = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public boq a(cvn $$0) {
      czu $$1 = $$0.q();
      im $$2 = $$0.a();
      dpy $$3 = $$1.a_($$2);
      if ($$3.a(dcx.dT) && !$$3.c(dgy.b)) {
         csd $$4 = $$0.n();
         if (!$$1.B) {
            ckl $$5 = $$0.o();
            if ($$1.c_($$2) instanceof doe $$6) {
               $$6.a($$4.r());
               $$1.a(dur.c, $$2, dur.a.a($$5, $$3));
            }

            $$4.g(1);
            if ($$5 != null) {
               $$5.a(avj.al);
            }
         }

         return boq.a($$1.B);
      } else {
         return boq.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(csd $$0, @Nullable czu $$1, List<ws> $$2, ctu $$3) {
      $$2.add(this.i().a(n.h));
   }

   public xg i() {
      return ws.c(this.a() + ".desc");
   }

   @Nullable
   public static csw a(auy $$0) {
      return a.get($$0);
   }

   public auy j() {
      return this.c;
   }

   public int k() {
      return this.j;
   }
}
