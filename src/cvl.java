import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cvl extends cul {
   private static final Map<avz, cvl> a = Maps.newHashMap();
   private final int b;
   private final avz c;
   private final int j;

   protected cvl(int $$0, avz $$1, cul.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.j = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bqv a(cyd $$0) {
      dbz $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsd $$3 = $$1.a_($$2);
      if ($$3.a(dfc.dT) && !$$3.c(djd.b)) {
         cuq $$4 = $$0.n();
         if (!$$1.B) {
            cmy $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dqj $$6) {
               $$6.b($$4.s());
               $$1.a(dww.c, $$2, dww.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(awk.al);
            }
         }

         return bqv.a($$1.B);
      } else {
         return bqv.e;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<xp> $$2, cwj $$3) {
      $$2.add(this.k().a(n.h));
   }

   public yd k() {
      return xp.c(this.a() + ".desc");
   }

   @Nullable
   public static cvl a(avz $$0) {
      return a.get($$0);
   }

   public avz l() {
      return this.c;
   }

   public int m() {
      return this.j;
   }
}
