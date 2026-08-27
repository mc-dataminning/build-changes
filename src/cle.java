import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import javax.annotation.Nullable;

public class cle {
   @Nullable
   private final String a;
   private final ImmutableList<bif> b;
   private final hg.c<cle> c = jd.j.f(this);

   public static cle a(String $$0) {
      return jd.j.a(aey.a($$0));
   }

   public cle(bif... $$0) {
      this(null, $$0);
   }

   public cle(@Nullable String $$0, bif... $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public String b(String $$0) {
      return $$0 + (this.a == null ? jd.j.b(this).a() : this.a);
   }

   public List<bif> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         UnmodifiableIterator var1 = this.b.iterator();

         while (var1.hasNext()) {
            bif $$0 = (bif)var1.next();
            if ($$0.c().a()) {
               return true;
            }
         }
      }

      return false;
   }

   @Deprecated
   public hg.c<cle> c() {
      return this.c;
   }
}
