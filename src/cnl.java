import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import javax.annotation.Nullable;

public class cnl {
   @Nullable
   private final String a;
   private final ImmutableList<bki> b;
   private final ig.c<cnl> c = kc.j.f(this);

   public static cnl a(String $$0) {
      return kc.j.a(agm.a($$0));
   }

   public cnl(bki... $$0) {
      this(null, $$0);
   }

   public cnl(@Nullable String $$0, bki... $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public String b(String $$0) {
      return $$0 + (this.a == null ? kc.j.b(this).a() : this.a);
   }

   public List<bki> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         UnmodifiableIterator var1 = this.b.iterator();

         while (var1.hasNext()) {
            bki $$0 = (bki)var1.next();
            if ($$0.c().a()) {
               return true;
            }
         }
      }

      return false;
   }

   @Deprecated
   public ig.c<cnl> c() {
      return this.c;
   }
}
