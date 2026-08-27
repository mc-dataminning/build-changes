import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import javax.annotation.Nullable;

public class ckv {
   @Nullable
   private final String a;
   private final ImmutableList<bhv> b;
   private final he.c<ckv> c = jb.j.f(this);

   public static ckv a(String $$0) {
      return jb.j.a(aer.a($$0));
   }

   public ckv(bhv... $$0) {
      this(null, $$0);
   }

   public ckv(@Nullable String $$0, bhv... $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public String b(String $$0) {
      return $$0 + (this.a == null ? jb.j.b(this).a() : this.a);
   }

   public List<bhv> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         UnmodifiableIterator var1 = this.b.iterator();

         while (var1.hasNext()) {
            bhv $$0 = (bhv)var1.next();
            if ($$0.c().a()) {
               return true;
            }
         }
      }

      return false;
   }

   @Deprecated
   public he.c<ckv> c() {
      return this.c;
   }
}
