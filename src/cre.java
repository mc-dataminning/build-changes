import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cre extends cqh {
   private static final Map<atx, cre> a = Maps.newHashMap();
   private final int b;
   private final atx c;
   private final int d;

   protected cre(int $$0, atx $$1, cqh.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.d = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bnd a(csw $$0) {
      cxb $$1 = $$0.q();
      ib $$2 = $$0.a();
      dnb $$3 = $$1.a_($$2);
      if ($$3.a(dae.dT) && !$$3.c(dee.b)) {
         cqm $$4 = $$0.n();
         if (!$$1.B) {
            ciu $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dlj $$6) {
               $$6.a($$4.q());
               $$1.a(drp.c, $$2, drp.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(aui.al);
            }
         }

         return bnd.a($$1.B);
      } else {
         return bnd.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cqm $$0, @Nullable cxb $$1, List<vu> $$2, csd $$3) {
      $$2.add(this.i().a(n.h));
   }

   public wi i() {
      return vu.c(this.a() + ".desc");
   }

   @Nullable
   public static cre a(atx $$0) {
      return a.get($$0);
   }

   public atx j() {
      return this.c;
   }

   public int y() {
      return this.d;
   }
}
