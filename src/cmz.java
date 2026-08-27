import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cmz extends cmc {
   private static final Map<arb, cmz> a = Maps.newHashMap();
   private final int b;
   private final arb c;
   private final int d;

   protected cmz(int $$0, arb $$1, cmc.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.d = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bjl a(cos $$0) {
      csy $$1 = $$0.q();
      hv $$2 = $$0.a();
      dip $$3 = $$1.a_($$2);
      if ($$3.a(cwb.dT) && !$$3.c(dab.b)) {
         cmh $$4 = $$0.n();
         if (!$$1.B) {
            cer $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dhe $$6) {
               $$6.b($$4.p());
               $$1.a(dmz.c, $$2, dmz.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(arm.al);
            }
         }

         return bjl.a($$1.B);
      } else {
         return bjl.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cmh $$0, @Nullable csy $$1, List<vb> $$2, cny $$3) {
      $$2.add(this.i().a(n.h));
   }

   public vp i() {
      return vb.c(this.a() + ".desc");
   }

   @Nullable
   public static cmz a(arb $$0) {
      return a.get($$0);
   }

   public arb x() {
      return this.c;
   }

   public int y() {
      return this.d;
   }
}
