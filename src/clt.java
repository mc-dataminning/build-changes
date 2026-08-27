import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class clt extends ckw {
   private static final Map<aqm, clt> a = Maps.newHashMap();
   private final int b;
   private final aqm c;
   private final int d;

   protected clt(int $$0, aqm $$1, ckw.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.d = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public biq a(cnl $$0) {
      crs $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgw $$3 = $$1.a_($$2);
      if ($$3.a(cuv.dT) && !$$3.c(cyv.b)) {
         clb $$4 = $$0.n();
         if (!$$1.B) {
            cdm $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dfs $$6) {
               $$6.b($$4.p());
               $$1.a(dlg.c, $$2, dlg.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(aqx.al);
            }
         }

         return biq.a($$1.B);
      } else {
         return biq.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(clb $$0, @Nullable crs $$1, List<ur> $$2, cms $$3) {
      $$2.add(this.i().a(n.h));
   }

   public vf i() {
      return ur.c(this.a() + ".desc");
   }

   @Nullable
   public static clt a(aqm $$0) {
      return a.get($$0);
   }

   public aqm x() {
      return this.c;
   }

   public int y() {
      return this.d;
   }
}
