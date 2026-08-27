import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import javax.annotation.Nullable;

public class cov {
   @Nullable
   private final String a;
   private final ImmutableList<blh> b;
   private final ih.c<cov> c = kd.i.f(this);

   public static cov a(String $$0) {
      return kd.i.a(ahg.a($$0));
   }

   public cov(blh... $$0) {
      this(null, $$0);
   }

   public cov(@Nullable String $$0, blh... $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public String b(String $$0) {
      return $$0 + (this.a == null ? kd.i.b(this).a() : this.a);
   }

   public List<blh> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         UnmodifiableIterator var1 = this.b.iterator();

         while (var1.hasNext()) {
            blh $$0 = (blh)var1.next();
            if ($$0.c().a()) {
               return true;
            }
         }
      }

      return false;
   }

   @Deprecated
   public ih.c<cov> c() {
      return this.c;
   }
}
