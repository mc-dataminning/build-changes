import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class clb extends cke {
   private static final Map<aqc, clb> a = Maps.newHashMap();
   private final int b;
   private final aqc c;
   private final int d;

   protected clb(int $$0, aqc $$1, cke.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.d = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bib a(cmt $$0) {
      cqz $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgb $$3 = $$1.a_($$2);
      if ($$3.a(cuc.dT) && !$$3.c(cyb.b)) {
         ckj $$4 = $$0.n();
         if (!$$1.B) {
            ccx $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dex $$6) {
               $$6.b($$4.p());
               $$1.a(dkl.c, $$2, dkl.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(aqn.al);
            }
         }

         return bib.a($$1.B);
      } else {
         return bib.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(ckj $$0, @Nullable cqz $$1, List<ui> $$2, cma $$3) {
      $$2.add(this.i().a(n.h));
   }

   public uw i() {
      return ui.c(this.a() + ".desc");
   }

   @Nullable
   public static clb a(aqc $$0) {
      return a.get($$0);
   }

   public aqc x() {
      return this.c;
   }

   public int y() {
      return this.d;
   }
}
