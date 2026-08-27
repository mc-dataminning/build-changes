import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class csb extends cre {
   private static final Map<aul, csb> a = Maps.newHashMap();
   private final int b;
   private final aul c;
   private final int j;

   protected csb(int $$0, aul $$1, cre.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.j = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public boa a(cuq $$0) {
      cyx $$1 = $$0.q();
      ib $$2 = $$0.a();
      doz $$3 = $$1.a_($$2);
      if ($$3.a(dca.dT) && !$$3.c(dga.b)) {
         crj $$4 = $$0.n();
         if (!$$1.B) {
            cjt $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dng $$6) {
               $$6.a($$4.r());
               $$1.a(dts.c, $$2, dts.a.a($$5, $$3));
            }

            $$4.g(1);
            if ($$5 != null) {
               $$5.a(auw.al);
            }
         }

         return boa.a($$1.B);
      } else {
         return boa.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(crj $$0, @Nullable cyx $$1, List<wg> $$2, csz $$3) {
      $$2.add(this.i().a(n.h));
   }

   public wu i() {
      return wg.c(this.a() + ".desc");
   }

   @Nullable
   public static csb a(aul $$0) {
      return a.get($$0);
   }

   public aul j() {
      return this.c;
   }

   public int k() {
      return this.j;
   }
}
