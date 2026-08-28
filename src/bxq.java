import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import javax.annotation.Nullable;

public interface bxq {
   @Nullable
   bwo<bxj> d();

   djh dU();

   @Nullable
   default bxj e() {
      return bwo.a(this.d(), this.dU(), bxj.class);
   }

   @Nullable
   default bxj P_() {
      Set<Object> $$0 = new ObjectArraySet();
      bxj $$1 = this.e();
      $$0.add(this);

      while ($$1 instanceof bxq) {
         bxq $$2 = (bxq)$$1;
         bxj $$3 = $$2.e();
         if ($$0.contains($$3)) {
            return null;
         }

         $$0.add($$1);
         $$1 = $$2.e();
      }

      return $$1;
   }
}
