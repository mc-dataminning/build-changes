import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class crc extends cqf {
   private static final Map<atx, crc> a = Maps.newHashMap();
   private final int b;
   private final atx c;
   private final int d;

   protected crc(int $$0, atx $$1, cqf.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.d = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bnc a(csu $$0) {
      cwz $$1 = $$0.q();
      ib $$2 = $$0.a();
      dmz $$3 = $$1.a_($$2);
      if ($$3.a(dac.dT) && !$$3.c(dec.b)) {
         cqk $$4 = $$0.n();
         if (!$$1.B) {
            cis $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dlh $$6) {
               $$6.a($$4.q());
               $$1.a(drn.c, $$2, drn.a.a($$5, $$3));
            }

            $$4.h(1);
            if ($$5 != null) {
               $$5.a(aui.al);
            }
         }

         return bnc.a($$1.B);
      } else {
         return bnc.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(cqk $$0, @Nullable cwz $$1, List<vu> $$2, csb $$3) {
      $$2.add(this.i().a(n.h));
   }

   public wi i() {
      return vu.c(this.a() + ".desc");
   }

   @Nullable
   public static crc a(atx $$0) {
      return a.get($$0);
   }

   public atx j() {
      return this.c;
   }

   public int y() {
      return this.d;
   }
}
