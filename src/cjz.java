import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cjz extends cjc {
   private static final Map<ape, cjz> a = Maps.newHashMap();
   private final int b;
   private final ape c;
   private final int d;

   protected cjz(int $$0, ape $$1, cjc.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.d = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bha a(clr $$0) {
      cpx $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfl $$3 = $$1.a_($$2);
      if ($$3.a(csy.dT) && !$$3.c(cwx.a)) {
         cjh $$4 = $$0.n();
         if (!$$1.B) {
            cbw $$5 = $$0.o();
            if ($$1.c_($$2) instanceof ddx $$6) {
               $$6.b($$4.p());
               $$1.a(djv.c, $$2, djv.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(app.al);
            }
         }

         return bha.a($$1.B);
      } else {
         return bha.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cjh $$0, @Nullable cpx $$1, List<tn> $$2, cky $$3) {
      $$2.add(this.i().a(n.h));
   }

   public ua i() {
      return tn.c(this.a() + ".desc");
   }

   @Nullable
   public static cjz a(ape $$0) {
      return a.get($$0);
   }

   public ape x() {
      return this.c;
   }

   public int y() {
      return this.d;
   }
}
