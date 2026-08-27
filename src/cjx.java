import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cjx extends cja {
   private static final Map<apc, cjx> a = Maps.newHashMap();
   private final int b;
   private final apc c;
   private final int d;

   protected cjx(int $$0, apc $$1, cja.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.d = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bgy a(clp $$0) {
      cpv $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfj $$3 = $$1.a_($$2);
      if ($$3.a(csw.dT) && !$$3.c(cwv.a)) {
         cjf $$4 = $$0.n();
         if (!$$1.B) {
            cbu $$5 = $$0.o();
            if ($$1.c_($$2) instanceof ddv $$6) {
               $$6.b($$4.p());
               $$1.a(djt.c, $$2, djt.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(apn.al);
            }
         }

         return bgy.a($$1.B);
      } else {
         return bgy.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cjf $$0, @Nullable cpv $$1, List<tl> $$2, ckw $$3) {
      $$2.add(this.i().a(n.h));
   }

   public ty i() {
      return tl.c(this.a() + ".desc");
   }

   @Nullable
   public static cjx a(apc $$0) {
      return a.get($$0);
   }

   public apc x() {
      return this.c;
   }

   public int y() {
      return this.d;
   }
}
