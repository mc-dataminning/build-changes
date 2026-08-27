import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cts extends csu {
   private static final Map<avb, cts> a = Maps.newHashMap();
   private final int b;
   private final avb c;
   private final int j;

   protected cts(int $$0, avb $$1, csu.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.j = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bpm a(cwk $$0) {
      dad $$1 = $$0.q();
      in $$2 = $$0.a();
      dqh $$3 = $$1.a_($$2);
      if ($$3.a(ddg.dT) && !$$3.c(dhh.b)) {
         csz $$4 = $$0.n();
         if (!$$1.B) {
            clh $$5 = $$0.o();
            if ($$1.c_($$2) instanceof don $$6) {
               $$6.b($$4.r());
               $$1.a(dva.c, $$2, dva.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(avm.al);
            }
         }

         return bpm.a($$1.B);
      } else {
         return bpm.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(csz $$0, @Nullable dad $$1, List<wu> $$2, cuq $$3) {
      $$2.add(this.i().a(n.h));
   }

   public xi i() {
      return wu.c(this.a() + ".desc");
   }

   @Nullable
   public static cts a(avb $$0) {
      return a.get($$0);
   }

   public avb j() {
      return this.c;
   }

   public int k() {
      return this.j;
   }
}
