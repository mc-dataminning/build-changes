import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class csk extends crn {
   private static final Map<aun, csk> a = Maps.newHashMap();
   private final int b;
   private final aun c;
   private final int j;

   protected csk(int $$0, aun $$1, crn.a $$2, int $$3) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
      this.j = $$3 * 20;
      a.put(this.c, this);
   }

   @Override
   public bof a(cuz $$0) {
      czg $$1 = $$0.q();
      id $$2 = $$0.a();
      dpi $$3 = $$1.a_($$2);
      if ($$3.a(dcj.dT) && !$$3.c(dgj.b)) {
         crs $$4 = $$0.n();
         if (!$$1.B) {
            cka $$5 = $$0.o();
            if ($$1.c_($$2) instanceof dnp $$6) {
               $$6.a($$4.r());
               $$1.a(dub.c, $$2, dub.a.a($$5, $$3));
            }

            $$4.g(1);
            if ($$5 != null) {
               $$5.a(auz.al);
            }
         }

         return bof.a($$1.B);
      } else {
         return bof.d;
      }
   }

   public int h() {
      return this.b;
   }

   @Override
   public void a(crs $$0, @Nullable czg $$1, List<wi> $$2, cti $$3) {
      $$2.add(this.i().a(n.h));
   }

   public ww i() {
      return wi.c(this.a() + ".desc");
   }

   @Nullable
   public static csk a(aun $$0) {
      return a.get($$0);
   }

   public aun j() {
      return this.c;
   }

   public int k() {
      return this.j;
   }
}
