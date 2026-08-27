import java.util.List;
import javax.annotation.Nullable;

public class ctt extends cpw {
   public ctt(cry.a $$0) {
      super($$0);
   }

   @Override
   public csd x() {
      csd $$0 = super.x();
      $$0.b(jz.x, new cuc(cud.C));
      return $$0;
   }

   @Override
   public void a(csd $$0, @Nullable czu $$1, List<ws> $$2, ctu $$3) {
      cuc $$4 = $$0.a(jz.x);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }

   @Override
   public String i(csd $$0) {
      return cua.a($$0.a(jz.x, cuc.a).f(), this.a() + ".effect.");
   }
}
