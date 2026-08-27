import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import javax.annotation.Nullable;

public class ckx {
   @Nullable
   private final String a;
   private final ImmutableList<bhy> b;
   private final hg.c<ckx> c = jd.j.f(this);

   public static ckx a(String $$0) {
      return jd.j.a(aeu.a($$0));
   }

   public ckx(bhy... $$0) {
      this(null, $$0);
   }

   public ckx(@Nullable String $$0, bhy... $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public String b(String $$0) {
      return $$0 + (this.a == null ? jd.j.b(this).a() : this.a);
   }

   public List<bhy> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         UnmodifiableIterator var1 = this.b.iterator();

         while (var1.hasNext()) {
            bhy $$0 = (bhy)var1.next();
            if ($$0.c().a()) {
               return true;
            }
         }
      }

      return false;
   }

   @Deprecated
   public hg.c<ckx> c() {
      return this.c;
   }
}
