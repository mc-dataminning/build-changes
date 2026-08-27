import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class ctn extends cry {
   public static final int a = 160;

   public ctn(cry.a $$0) {
      super($$0);
   }

   @Override
   public void a(csd $$0, @Nullable czu $$1, List<ws> $$2, ctu $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bpx> $$4 = new ArrayList<>();
         cvf $$5 = $$0.a(jz.y, cvf.a);

         for (cvf.a $$6 : $$5.a()) {
            $$4.add($$6.a());
         }

         cuc.a($$4, $$2::add, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }

   @Override
   public csd a(csd $$0, czu $$1, bre $$2) {
      cvf $$3 = $$0.a(jz.y, cvf.a);

      for (cvf.a $$4 : $$3.a()) {
         $$2.b($$4.a());
      }

      super.a($$0, $$1, $$2);
      return $$2.fN() ? $$0 : new csd(csg.pq);
   }
}
