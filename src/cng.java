import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import javax.annotation.Nullable;

public class cng {
   @Nullable
   private final String a;
   private final ImmutableList<bkd> b;
   private final ib.c<cng> c = jy.j.f(this);

   public static cng a(String $$0) {
      return jy.j.a(agi.a($$0));
   }

   public cng(bkd... $$0) {
      this(null, $$0);
   }

   public cng(@Nullable String $$0, bkd... $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public String b(String $$0) {
      return $$0 + (this.a == null ? jy.j.b(this).a() : this.a);
   }

   public List<bkd> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         UnmodifiableIterator var1 = this.b.iterator();

         while (var1.hasNext()) {
            bkd $$0 = (bkd)var1.next();
            if ($$0.c().a()) {
               return true;
            }
         }
      }

      return false;
   }

   @Deprecated
   public ib.c<cng> c() {
      return this.c;
   }
}
