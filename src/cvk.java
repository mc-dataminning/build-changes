import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cvk extends cuk {
   private static final Map<avz, cvk> a = Maps.newHashMap();
   private final int b;
   private final avz c;
   private final int j;

   protected cvk(int $$0, avz $$1, cuk.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.j = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bqu a(cyc $$0) {
      dby $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsc $$3 = $$1.a_($$2);
      if ($$3.a(dfb.dT) && !$$3.c(djc.b)) {
         cup $$4 = $$0.n();
         if (!$$1.B) {
            cmx $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dqi $$6) {
               $$6.b($$4.s());
               $$1.a(dwv.c, $$2, dwv.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(awk.al);
            }
         }

         return bqu.a($$1.B);
      } else {
         return bqu.e;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cup $$0, cuk.b $$1, List<xp> $$2, cwi $$3) {
      $$2.add(this.k().a(n.h));
   }

   public yd k() {
      return xp.c(this.a() + ".desc");
   }

   @Nullable
   public static cvk a(avz $$0) {
      return a.get($$0);
   }

   public avz l() {
      return this.c;
   }

   public int m() {
      return this.j;
   }
}
