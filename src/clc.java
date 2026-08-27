import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import javax.annotation.Nullable;

public class clc {
   @Nullable
   private final String a;
   private final ImmutableList<bid> b;
   private final hg.c<clc> c = jd.j.f(this);

   public static clc a(String $$0) {
      return jd.j.a(aex.a($$0));
   }

   public clc(bid... $$0) {
      this(null, $$0);
   }

   public clc(@Nullable String $$0, bid... $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public String b(String $$0) {
      return $$0 + (this.a == null ? jd.j.b(this).a() : this.a);
   }

   public List<bid> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         UnmodifiableIterator var1 = this.b.iterator();

         while (var1.hasNext()) {
            bid $$0 = (bid)var1.next();
            if ($$0.c().a()) {
               return true;
            }
         }
      }

      return false;
   }

   @Deprecated
   public hg.c<clc> c() {
      return this.c;
   }
}
