import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import javax.annotation.Nullable;

public class chw {
   @Nullable
   private final String a;
   private final ImmutableList<bfa> b;

   public static chw a(String $$0) {
      return jb.j.a(acq.a($$0));
   }

   public chw(bfa... $$0) {
      this(null, $$0);
   }

   public chw(@Nullable String $$0, bfa... $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public String b(String $$0) {
      return $$0 + (this.a == null ? jb.j.b(this).a() : this.a);
   }

   public List<bfa> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         UnmodifiableIterator var1 = this.b.iterator();

         while (var1.hasNext()) {
            bfa $$0 = (bfa)var1.next();
            if ($$0.c().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
