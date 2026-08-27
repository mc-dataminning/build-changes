import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class css extends cre {
   public static final int a = 160;

   public css(cre.a $$0) {
      super($$0);
   }

   @Override
   public void a(crj $$0, @Nullable cyx $$1, List<wg> $$2, csz $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bph> $$4 = new ArrayList<>();
         cui $$5 = $$0.a(jp.y, cui.a);

         for (cui.a $$6 : $$5.a()) {
            $$4.add($$6.a());
         }

         cth.a($$4, $$2::add, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }

   @Override
   public crj a(crj $$0, cyx $$1, bqo $$2) {
      crj $$3 = super.a($$0, $$1, $$2);
      cui $$4 = $$0.a(jp.y, cui.a);

      for (cui.a $$5 : $$4.a()) {
         $$2.b($$5.a());
      }

      return $$2.fM() ? $$3 : new crj(crm.pp);
   }
}
