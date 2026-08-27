import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cpr extends cou {
   private static final Map<atj, cpr> a = Maps.newHashMap();
   private final int b;
   private final atj c;
   private final int d;

   protected cpr(int $$0, atj $$1, cou.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.d = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public blu a(cri $$0) {
      cvn $$1 = $$0.q();
      hz $$2 = $$0.a();
      dlf $$3 = $$1.a_($$2);
      if ($$3.a(cyq.dT) && !$$3.c(dcq.b)) {
         coz $$4 = $$0.n();
         if (!$$1.B) {
            chh $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dju $$6) {
               $$6.b($$4.q());
               $$1.a(dpp.c, $$2, dpp.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(atu.al);
            }
         }

         return blu.a($$1.B);
      } else {
         return blu.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(coz $$0, @Nullable cvn $$1, List<vq> $$2, cqq $$3) {
      $$2.add(this.w().a(n.h));
   }

   public we w() {
      return vq.c(this.a() + ".desc");
   }

   @Nullable
   public static cpr a(atj $$0) {
      return a.get($$0);
   }

   public atj x() {
      return this.c;
   }

   public int y() {
      return this.d;
   }
}
