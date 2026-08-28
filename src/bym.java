import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import javax.annotation.Nullable;

public interface bym {
   @Nullable
   bxk<byf> d();

   dkj dV();

   @Nullable
   default byf T_() {
      return bxk.a(this.d(), this.dV(), byf.class);
   }

   @Nullable
   default byf U_() {
      Set<Object> $$0 = new ObjectArraySet();
      byf $$1 = this.T_();
      $$0.add(this);

      while ($$1 instanceof bym) {
         bym $$2 = (bym)$$1;
         byf $$3 = $$2.T_();
         if ($$0.contains($$3)) {
            return null;
         }

         $$0.add($$1);
         $$1 = $$2.T_();
      }

      return $$1;
   }
}
