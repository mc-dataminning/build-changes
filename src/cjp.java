import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cjp extends cis {
   private static final Map<aov, cjp> a = Maps.newHashMap();
   private final int b;
   private final aov c;
   private final int d;

   protected cjp(int $$0, aov $$1, cis.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.d = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bgq a(clh $$0) {
      cpl $$1 = $$0.q();
      gu $$2 = $$0.a();
      dez $$3 = $$1.a_($$2);
      if ($$3.a(csm.dT) && !$$3.c(cwl.a)) {
         cix $$4 = $$0.n();
         if (!$$1.B) {
            cbm $$5 = $$0.o();
            if ($$1.c_($$2) instanceof ddl $$6) {
               $$6.b($$4.p());
               $$1.a(djj.c, $$2, djj.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(apg.al);
            }
         }

         return bgq.a($$1.B);
      } else {
         return bgq.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cix $$0, @Nullable cpl $$1, List<tf> $$2, cko $$3) {
      $$2.add(this.i().a(n.h));
   }

   public ts i() {
      return tf.c(this.a() + ".desc");
   }

   @Nullable
   public static cjp a(aov $$0) {
      return a.get($$0);
   }

   public aov x() {
      return this.c;
   }

   public int y() {
      return this.d;
   }
}
