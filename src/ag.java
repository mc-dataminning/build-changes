import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class ag {
   private final af a;
   @Nullable
   private final ag b;
   private final Set<ag> c = new ReferenceOpenHashSet();

   @VisibleForTesting
   public ag(af $$0, @Nullable ag $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ae a() {
      return this.a.b();
   }

   public af b() {
      return this.a;
   }

   @Nullable
   public ag c() {
      return this.b;
   }

   public ag d() {
      return a(this);
   }

   public static ag a(ag $$0) {
      ag $$1 = $$0;

      while (true) {
         ag $$2 = $$1.c();
         if ($$2 == null) {
            return $$1;
         }

         $$1 = $$2;
      }
   }

   public Iterable<ag> e() {
      return this.c;
   }

   @VisibleForTesting
   public void b(ag $$0) {
      this.c.add($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ag $$1 && this.a.equals($$1.a)) {
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
