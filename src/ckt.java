import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import javax.annotation.Nullable;

public class ckt {
   @Nullable
   private final String a;
   private final ImmutableList<bht> b;

   public static ckt a(String $$0) {
      return jc.j.a(aep.a($$0));
   }

   public ckt(bht... $$0) {
      this(null, $$0);
   }

   public ckt(@Nullable String $$0, bht... $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public String b(String $$0) {
      return $$0 + (this.a == null ? jc.j.b(this).a() : this.a);
   }

   public List<bht> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         UnmodifiableIterator var1 = this.b.iterator();

         while (var1.hasNext()) {
            bht $$0 = (bht)var1.next();
            if ($$0.c().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
