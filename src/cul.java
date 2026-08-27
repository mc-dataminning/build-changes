import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cul extends ctl {
   private static final Map<avh, cul> a = Maps.newHashMap();
   private final int b;
   private final avh c;
   private final int j;

   protected cul(int $$0, avh $$1, ctl.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.j = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bpw a(cxd $$0) {
      daz $$1 = $$0.q();
      io $$2 = $$0.a();
      drd $$3 = $$1.a_($$2);
      if ($$3.a(dec.dT) && !$$3.c(did.b)) {
         ctq $$4 = $$0.n();
         if (!$$1.B) {
            cly $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dpj $$6) {
               $$6.b($$4.s());
               $$1.a(dvw.c, $$2, dvw.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(avs.al);
            }
         }

         return bpw.a($$1.B);
      } else {
         return bpw.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(ctq $$0, ctl.b $$1, List<wx> $$2, cvj $$3) {
      $$2.add(this.k().a(n.h));
   }

   public xl k() {
      return wx.c(this.a() + ".desc");
   }

   @Nullable
   public static cul a(avh $$0) {
      return a.get($$0);
   }

   public avh l() {
      return this.c;
   }

   public int m() {
      return this.j;
   }
}
