import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import javax.annotation.Nullable;

public class cli {
   @Nullable
   private final String a;
   private final ImmutableList<bij> b;
   private final he.c<cli> c = jb.j.f(this);

   public static cli a(String $$0) {
      return jb.j.a(aez.a($$0));
   }

   public cli(bij... $$0) {
      this(null, $$0);
   }

   public cli(@Nullable String $$0, bij... $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public String b(String $$0) {
      return $$0 + (this.a == null ? jb.j.b(this).a() : this.a);
   }

   public List<bij> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         UnmodifiableIterator var1 = this.b.iterator();

         while (var1.hasNext()) {
            bij $$0 = (bij)var1.next();
            if ($$0.c().a()) {
               return true;
            }
         }
      }

      return false;
   }

   @Deprecated
   public he.c<cli> c() {
      return this.c;
   }
}
