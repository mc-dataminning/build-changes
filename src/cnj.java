import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cnj extends cmm {
   private static final Map<arl, cnj> a = Maps.newHashMap();
   private final int b;
   private final arl c;
   private final int d;

   protected cnj(int $$0, arl $$1, cmm.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.d = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bjv a(cpc $$0) {
      cti $$1 = $$0.q();
      hx $$2 = $$0.a();
      dja $$3 = $$1.a_($$2);
      if ($$3.a(cwl.dT) && !$$3.c(dal.b)) {
         cmr $$4 = $$0.n();
         if (!$$1.B) {
            cfb $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dhp $$6) {
               $$6.b($$4.p());
               $$1.a(dnk.c, $$2, dnk.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(arw.al);
            }
         }

         return bjv.a($$1.B);
      } else {
         return bjv.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cmr $$0, @Nullable cti $$1, List<vd> $$2, coi $$3) {
      $$2.add(this.i().a(n.h));
   }

   public vr i() {
      return vd.c(this.a() + ".desc");
   }

   @Nullable
   public static cnj a(arl $$0) {
      return a.get($$0);
   }

   public arl x() {
      return this.c;
   }

   public int y() {
      return this.d;
   }
}
