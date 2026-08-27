import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cmg extends clj {
   private static final Map<aqu, cmg> a = Maps.newHashMap();
   private final int b;
   private final aqu c;
   private final int d;

   protected cmg(int $$0, aqu $$1, clj.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.d = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bjb a(cny $$0) {
      csf $$1 = $$0.q();
      hx $$2 = $$0.a();
      dhn $$3 = $$1.a_($$2);
      if ($$3.a(cvh.dT) && !$$3.c(czh.b)) {
         clo $$4 = $$0.n();
         if (!$$1.B) {
            cdz $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dgj $$6) {
               $$6.b($$4.p());
               $$1.a(dlx.c, $$2, dlx.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(arf.al);
            }
         }

         return bjb.a($$1.B);
      } else {
         return bjb.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(clo $$0, @Nullable csf $$1, List<uv> $$2, cnf $$3) {
      $$2.add(this.i().a(n.h));
   }

   public vj i() {
      return uv.c(this.a() + ".desc");
   }

   @Nullable
   public static cmg a(aqu $$0) {
      return a.get($$0);
   }

   public aqu x() {
      return this.c;
   }

   public int y() {
      return this.d;
   }
}
