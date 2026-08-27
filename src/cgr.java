import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cgr extends cfu {
   private static final Map<amg, cgr> a = Maps.newHashMap();
   private final int b;
   private final amg c;
   private final int d;

   protected cgr(int $$0, amg $$1, cfu.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.d = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bdx a(cij $$0) {
      cmm $$1 = $$0.q();
      gu $$2 = $$0.a();
      dcb $$3 = $$1.a_($$2);
      if ($$3.a(cpo.dT) && !$$3.c(ctn.a)) {
         cfz $$4 = $$0.n();
         if (!$$1.B) {
            byo $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dan $$6) {
               $$6.b($$4.p());
               $$1.a(dgl.c, $$2, dgl.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(amr.al);
            }
         }

         return bdx.a($$1.B);
      } else {
         return bdx.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cfz $$0, @Nullable cmm $$1, List<sw> $$2, chq $$3) {
      $$2.add(this.i().a(n.h));
   }

   public tj i() {
      return sw.c(this.a() + ".desc");
   }

   @Nullable
   public static cgr a(amg $$0) {
      return a.get($$0);
   }

   public amg x() {
      return this.c;
   }

   public int y() {
      return this.d;
   }
}
