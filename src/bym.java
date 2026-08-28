import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import javax.annotation.Nullable;

public interface bym {
   @Nullable
   bxk<byf> d();

   dkj dV();

   @Nullable
   default byf e() {
      return bxk.a(this.d(), this.dV(), byf.class);
   }

   @Nullable
   default byf U_() {
      Set<Object> $$0 = new ObjectArraySet();
      byf $$1 = this.e();
      $$0.add(this);

      while ($$1 instanceof bym) {
         bym $$2 = (bym)$$1;
         byf $$3 = $$2.e();
         if ($$0.contains($$3)) {
            return null;
         }

         $$0.add($$1);
         $$1 = $$2.e();
      }

      return $$1;
   }
}
