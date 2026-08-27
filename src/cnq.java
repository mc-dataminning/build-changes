import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cnq extends cmt {
   private static final Map<arr, cnq> a = Maps.newHashMap();
   private final int b;
   private final arr c;
   private final int d;

   protected cnq(int $$0, arr $$1, cmt.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.d = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bkb a(cpj $$0) {
      ctp $$1 = $$0.q();
      hx $$2 = $$0.a();
      djh $$3 = $$1.a_($$2);
      if ($$3.a(cws.dT) && !$$3.c(das.b)) {
         cmy $$4 = $$0.n();
         if (!$$1.B) {
            cfi $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dhw $$6) {
               $$6.b($$4.p());
               $$1.a(dnr.c, $$2, dnr.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(asc.al);
            }
         }

         return bkb.a($$1.B);
      } else {
         return bkb.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cmy $$0, @Nullable ctp $$1, List<vf> $$2, coq $$3) {
      $$2.add(this.i().a(n.h));
   }

   public vt i() {
      return vf.c(this.a() + ".desc");
   }

   @Nullable
   public static cnq a(arr $$0) {
      return a.get($$0);
   }

   public arr x() {
      return this.c;
   }

   public int y() {
      return this.d;
   }
}
