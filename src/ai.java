import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class ai {
   private final ah a;
   @Nullable
   private final ai b;
   private final Set<ai> c = new ReferenceOpenHashSet();

   @VisibleForTesting
   public ai(ah $$0, @Nullable ai $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ag a() {
      return this.a.b();
   }

   public ah b() {
      return this.a;
   }

   @Nullable
   public ai c() {
      return this.b;
   }

   public ai d() {
      return a(this);
   }

   public static ai a(ai $$0) {
      ai $$1 = $$0;

      while (true) {
         ai $$2 = $$1.c();
         if ($$2 == null) {
            return $$1;
         }

         $$1 = $$2;
      }
   }

   public Iterable<ai> e() {
      return this.c;
   }

   @VisibleForTesting
   public void b(ai $$0) {
      this.c.add($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ai $$1 && this.a.equals($$1.a)) {
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
