import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class ah {
   private final ag a;
   @Nullable
   private final ah b;
   private final Set<ah> c = new ReferenceOpenHashSet();

   @VisibleForTesting
   public ah(ag $$0, @Nullable ah $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public af a() {
      return this.a.b();
   }

   public ag b() {
      return this.a;
   }

   @Nullable
   public ah c() {
      return this.b;
   }

   public ah d() {
      return a(this);
   }

   public static ah a(ah $$0) {
      ah $$1 = $$0;

      while (true) {
         ah $$2 = $$1.c();
         if ($$2 == null) {
            return $$1;
         }

         $$1 = $$2;
      }
   }

   public Iterable<ah> e() {
      return this.c;
   }

   @VisibleForTesting
   public void b(ah $$0) {
      this.c.add($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ah $$1 && this.a.equals($$1.a)) {
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
