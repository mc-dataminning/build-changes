import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import javax.annotation.Nullable;

public class cmg {
   @Nullable
   private final String a;
   private final ImmutableList<bjg> b;
   private final ib.c<cmg> c = jy.j.f(this);

   public static cmg a(String $$0) {
      return jy.j.a(afw.a($$0));
   }

   public cmg(bjg... $$0) {
      this(null, $$0);
   }

   public cmg(@Nullable String $$0, bjg... $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public String b(String $$0) {
      return $$0 + (this.a == null ? jy.j.b(this).a() : this.a);
   }

   public List<bjg> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         UnmodifiableIterator var1 = this.b.iterator();

         while (var1.hasNext()) {
            bjg $$0 = (bjg)var1.next();
            if ($$0.c().a()) {
               return true;
            }
         }
      }

      return false;
   }

   @Deprecated
   public ib.c<cmg> c() {
      return this.c;
   }
}
