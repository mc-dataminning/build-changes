import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cjo extends cir {
   private static final Map<aot, cjo> a = Maps.newHashMap();
   private final int b;
   private final aot c;
   private final int d;

   protected cjo(int $$0, aot $$1, cir.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.d = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bgo a(clg $$0) {
      cpk $$1 = $$0.q();
      gv $$2 = $$0.a();
      dey $$3 = $$1.a_($$2);
      if ($$3.a(csl.dT) && !$$3.c(cwk.a)) {
         ciw $$4 = $$0.n();
         if (!$$1.B) {
            cbl $$5 = $$0.o();
            if ($$1.c_($$2) instanceof ddk $$6) {
               $$6.b($$4.p());
               $$1.a(dji.c, $$2, dji.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(ape.al);
            }
         }

         return bgo.a($$1.B);
      } else {
         return bgo.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(ciw $$0, @Nullable cpk $$1, List<te> $$2, ckn $$3) {
      $$2.add(this.i().a(n.h));
   }

   public tr i() {
      return te.c(this.a() + ".desc");
   }

   @Nullable
   public static cjo a(aot $$0) {
      return a.get($$0);
   }

   public aot x() {
      return this.c;
   }

   public int y() {
      return this.d;
   }
}
