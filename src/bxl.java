import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import javax.annotation.Nullable;

public interface bxl {
   @Nullable
   bwl<bxe> d();

   dja dV();

   @Nullable
   default bxe e() {
      return bwl.a(this.d(), this.dV(), bxe.class);
   }

   @Nullable
   default bxe P_() {
      Set<Object> $$0 = new ObjectArraySet();
      bxe $$1 = this.e();
      $$0.add(this);

      while ($$1 instanceof bxl) {
         bxl $$2 = (bxl)$$1;
         bxe $$3 = $$2.e();
         if ($$0.contains($$3)) {
            return null;
         }

         $$0.add($$1);
         $$1 = $$2.e();
      }

      return $$1;
   }
}
