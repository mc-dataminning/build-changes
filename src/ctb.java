import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class ctb extends crn {
   public static final int a = 160;

   public ctb(crn.a $$0) {
      super($$0);
   }

   @Override
   public void a(crs $$0, @Nullable czg $$1, List<wi> $$2, cti $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bpm> $$4 = new ArrayList<>();
         cur $$5 = $$0.a(jr.y, cur.a);

         for (cur.a $$6 : $$5.a()) {
            $$4.add($$6.a());
         }

         ctq.a($$4, $$2::add, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }

   @Override
   public crs a(crs $$0, czg $$1, bqt $$2) {
      cur $$3 = $$0.a(jr.y, cur.a);

      for (cur.a $$4 : $$3.a()) {
         $$2.b($$4.a());
      }

      super.a($$0, $$1, $$2);
      return $$2.fM() ? $$0 : new crs(crv.pp);
   }
}
