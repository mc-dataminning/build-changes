import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class ak {
   private final aj a;
   @Nullable
   private final ak b;
   private final Set<ak> c = new ReferenceOpenHashSet();

   @VisibleForTesting
   public ak(aj $$0, @Nullable ak $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ai a() {
      return this.a.b();
   }

   public aj b() {
      return this.a;
   }

   @Nullable
   public ak c() {
      return this.b;
   }

   public ak d() {
      return a(this);
   }

   public static ak a(ak $$0) {
      ak $$1 = $$0;

      while (true) {
         ak $$2 = $$1.c();
         if ($$2 == null) {
            return $$1;
         }

         $$1 = $$2;
      }
   }

   public Iterable<ak> e() {
      return this.c;
   }

   @VisibleForTesting
   public void b(ak $$0) {
      this.c.add($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ak $$1 && this.a.equals($$1.a)) {
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
