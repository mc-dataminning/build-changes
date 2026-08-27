import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import javax.annotation.Nullable;

public class cop {
   @Nullable
   private final String a;
   private final ImmutableList<blc> b;
   private final ih.c<cop> c = kd.i.f(this);

   public static cop a(String $$0) {
      return kd.i.a(ahd.a($$0));
   }

   public cop(blc... $$0) {
      this(null, $$0);
   }

   public cop(@Nullable String $$0, blc... $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public String b(String $$0) {
      return $$0 + (this.a == null ? kd.i.b(this).a() : this.a);
   }

   public List<blc> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         UnmodifiableIterator var1 = this.b.iterator();

         while (var1.hasNext()) {
            blc $$0 = (blc)var1.next();
            if ($$0.c().a()) {
               return true;
            }
         }
      }

      return false;
   }

   @Deprecated
   public ih.c<cop> c() {
      return this.c;
   }
}
