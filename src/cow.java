import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import javax.annotation.Nullable;

public class cow {
   @Nullable
   private final String a;
   private final ImmutableList<bli> b;
   private final ih.c<cow> c = kd.i.f(this);

   public static cow a(String $$0) {
      return kd.i.a(ahg.a($$0));
   }

   public cow(bli... $$0) {
      this(null, $$0);
   }

   public cow(@Nullable String $$0, bli... $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public String b(String $$0) {
      return $$0 + (this.a == null ? kd.i.b(this).a() : this.a);
   }

   public List<bli> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         UnmodifiableIterator var1 = this.b.iterator();

         while (var1.hasNext()) {
            bli $$0 = (bli)var1.next();
            if ($$0.c().a()) {
               return true;
            }
         }
      }

      return false;
   }

   @Deprecated
   public ih.c<cow> c() {
      return this.c;
   }
}
