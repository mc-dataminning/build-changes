import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import javax.annotation.Nullable;

public class coe {
   @Nullable
   private final String a;
   private final ImmutableList<bks> b;
   private final ie.c<coe> c = kb.i.f(this);

   public static coe a(String $$0) {
      return kb.i.a(agt.a($$0));
   }

   public coe(bks... $$0) {
      this(null, $$0);
   }

   public coe(@Nullable String $$0, bks... $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public String b(String $$0) {
      return $$0 + (this.a == null ? kb.i.b(this).a() : this.a);
   }

   public List<bks> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         UnmodifiableIterator var1 = this.b.iterator();

         while (var1.hasNext()) {
            bks $$0 = (bks)var1.next();
            if ($$0.c().a()) {
               return true;
            }
         }
      }

      return false;
   }

   @Deprecated
   public ie.c<coe> c() {
      return this.c;
   }
}
