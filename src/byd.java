import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import javax.annotation.Nullable;

public interface byd {
   @Nullable
   bxb<bxw> d();

   djz dV();

   @Nullable
   default bxw e() {
      return bxb.a(this.d(), this.dV(), bxw.class);
   }

   @Nullable
   default bxw T_() {
      Set<Object> $$0 = new ObjectArraySet();
      bxw $$1 = this.e();
      $$0.add(this);

      while ($$1 instanceof byd) {
         byd $$2 = (byd)$$1;
         bxw $$3 = $$2.e();
         if ($$0.contains($$3)) {
            return null;
         }

         $$0.add($$1);
         $$1 = $$2.e();
      }

      return $$1;
   }
}
