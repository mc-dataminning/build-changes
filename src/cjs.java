import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cjs extends civ {
   private static final Map<aoy, cjs> a = Maps.newHashMap();
   private final int b;
   private final aoy c;
   private final int d;

   protected cjs(int $$0, aoy $$1, civ.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.d = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bgt a(clk $$0) {
      cpq $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfe $$3 = $$1.a_($$2);
      if ($$3.a(csr.dT) && !$$3.c(cwq.a)) {
         cja $$4 = $$0.n();
         if (!$$1.B) {
            cbp $$5 = $$0.o();
            if ($$1.c_($$2) instanceof ddq $$6) {
               $$6.b($$4.p());
               $$1.a(djo.c, $$2, djo.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(apj.al);
            }
         }

         return bgt.a($$1.B);
      } else {
         return bgt.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cja $$0, @Nullable cpq $$1, List<ti> $$2, ckr $$3) {
      $$2.add(this.i().a(n.h));
   }

   public tv i() {
      return ti.c(this.a() + ".desc");
   }

   @Nullable
   public static cjs a(aoy $$0) {
      return a.get($$0);
   }

   public aoy x() {
      return this.c;
   }

   public int y() {
      return this.d;
   }
}
