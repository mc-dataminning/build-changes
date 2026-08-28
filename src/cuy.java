import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cuy extends cty {
   private static final Map<avg, cuy> a = Maps.newHashMap();
   private final int b;
   private final avg c;
   private final int j;

   protected cuy(int $$0, avg $$1, cty.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.j = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bqh a(cxp $$0) {
      dcg $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsl $$3 = $$1.a_($$2);
      if ($$3.a(dfk.dT) && !$$3.c(djl.b)) {
         cud $$4 = $$0.n();
         if (!$$1.B) {
            cml $$5 = $$0.o();
            cud $$6 = $$4.b(1, $$5);
            if ($$1.c_($$2) instanceof dqs $$7) {
               $$7.b($$6);
               $$1.a(dxh.c, $$2, dxh.a.a($$5, $$3));
            }

            if ($$5 != null) {
               $$5.a(avr.al);
            }
         }

         return bqh.a($$1.B);
      } else {
         return bqh.e;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cud $$0, cty.b $$1, List<wu> $$2, cvw $$3) {
      $$2.add(this.k().a(n.h));
   }

   public xi k() {
      return wu.c(this.a() + ".desc");
   }

   @Nullable
   public static cuy a(avg $$0) {
      return a.get($$0);
   }

   public avg l() {
      return this.c;
   }

   public int m() {
      return this.j;
   }
}
