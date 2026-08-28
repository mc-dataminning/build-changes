import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cuv extends ctv {
   private static final Map<ave, cuv> a = Maps.newHashMap();
   private final int b;
   private final ave c;
   private final int j;

   protected cuv(int $$0, ave $$1, ctv.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.j = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bqd a(cxm $$0) {
      dcd $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsh $$3 = $$1.a_($$2);
      if ($$3.a(dfh.dT) && !$$3.c(dji.b)) {
         cua $$4 = $$0.n();
         if (!$$1.B) {
            cmh $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dqo $$6) {
               $$6.b($$4.s());
               $$1.a(dxa.c, $$2, dxa.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(avp.al);
            }
         }

         return bqd.a($$1.B);
      } else {
         return bqd.e;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cua $$0, ctv.b $$1, List<wu> $$2, cvt $$3) {
      $$2.add(this.k().a(n.h));
   }

   public xi k() {
      return wu.c(this.a() + ".desc");
   }

   @Nullable
   public static cuv a(ave $$0) {
      return a.get($$0);
   }

   public ave l() {
      return this.c;
   }

   public int m() {
      return this.j;
   }
}
