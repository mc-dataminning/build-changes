import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cvk extends cuc {
   private static final Map<avn, cvk> a = Maps.newHashMap();
   private final int b;
   private final avn c;
   private final int j;

   protected cvk(int $$0, avn $$1, cuc.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.j = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bqa a(cyf $$0) {
      dca $$1 = $$0.q();
      ir $$2 = $$0.a();
      dtc $$3 = $$1.a_($$2);
      if ($$3.a(dfe.eH) && !$$3.c(djj.b)) {
         cuh $$4 = $$0.n();
         if (!$$1.C) {
            cly $$5 = $$0.o();
            if ($$1.c_($$2) instanceof drf $$6) {
               $$6.b($$4.r());
               $$1.a(dxv.c, $$2, dxv.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(avz.am);
            }
         }

         return bqa.a($$1.C);
      } else {
         return bqa.d;
      }
   }

   public int d() {
      return this.b;
   }

   @Override
   public void a(cuh $$0, @Nullable dca $$1, List<xe> $$2, cwi $$3) {
      $$2.add(this.h().a(n.h));
   }

   public xs h() {
      return xe.c(this.a() + ".desc");
   }

   @Nullable
   public static cvk a(avn $$0) {
      return a.get($$0);
   }

   public avn i() {
      return this.c;
   }

   public int j() {
      return this.j;
   }
}
