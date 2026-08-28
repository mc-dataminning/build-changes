import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import javax.annotation.Nullable;

public interface byb {
   @Nullable
   bwz<bxu> d();

   djx dV();

   @Nullable
   default bxu e() {
      return bwz.a(this.d(), this.dV(), bxu.class);
   }

   @Nullable
   default bxu T_() {
      Set<Object> $$0 = new ObjectArraySet();
      bxu $$1 = this.e();
      $$0.add(this);

      while ($$1 instanceof byb) {
         byb $$2 = (byb)$$1;
         bxu $$3 = $$2.e();
         if ($$0.contains($$3)) {
            return null;
         }

         $$0.add($$1);
         $$1 = $$2.e();
      }

      return $$1;
   }
}
