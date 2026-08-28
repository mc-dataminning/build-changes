import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class aj {
   private final ai a;
   @Nullable
   private final aj b;
   private final Set<aj> c = new ReferenceOpenHashSet();

   @VisibleForTesting
   public aj(ai $$0, @Nullable aj $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ah a() {
      return this.a.b();
   }

   public ai b() {
      return this.a;
   }

   @Nullable
   public aj c() {
      return this.b;
   }

   public aj d() {
      return a(this);
   }

   public static aj a(aj $$0) {
      aj $$1 = $$0;

      while (true) {
         aj $$2 = $$1.c();
         if ($$2 == null) {
            return $$1;
         }

         $$1 = $$2;
      }
   }

   public Iterable<aj> e() {
      return this.c;
   }

   @VisibleForTesting
   public void b(aj $$0) {
      this.c.add($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof aj $$1 && this.a.equals($$1.a)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public String toString() {
      return this.a.a().toString();
   }
}
