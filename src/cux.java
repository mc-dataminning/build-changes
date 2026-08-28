import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cux extends ctx {
   private static final Map<avg, cux> a = Maps.newHashMap();
   private final int b;
   private final avg c;
   private final int j;

   protected cux(int $$0, avg $$1, ctx.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.j = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bqg a(cxo $$0) {
      dcf $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsk $$3 = $$1.a_($$2);
      if ($$3.a(dfj.dT) && !$$3.c(djk.b)) {
         cuc $$4 = $$0.n();
         if (!$$1.B) {
            cmk $$5 = $$0.o();
            cuc $$6 = $$4.b(1, $$5);
            if ($$1.c_($$2) instanceof dqr $$7) {
               $$7.b($$6);
               $$1.a(dxg.c, $$2, dxg.a.a($$5, $$3));
            }

            if ($$5 != null) {
               $$5.a(avr.al);
            }
         }

         return bqg.a($$1.B);
      } else {
         return bqg.e;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cuc $$0, ctx.b $$1, List<wu> $$2, cvv $$3) {
      $$2.add(this.k().a(n.h));
   }

   public xi k() {
      return wu.c(this.a() + ".desc");
   }

   @Nullable
   public static cux a(avg $$0) {
      return a.get($$0);
   }

   public avg l() {
      return this.c;
   }

   public int m() {
      return this.j;
   }
}
