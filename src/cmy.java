import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import javax.annotation.Nullable;

public class cmy {
   @Nullable
   private final String a;
   private final ImmutableList<bjv> b;
   private final ib.c<cmy> c = jy.j.f(this);

   public static cmy a(String $$0) {
      return jy.j.a(agg.a($$0));
   }

   public cmy(bjv... $$0) {
      this(null, $$0);
   }

   public cmy(@Nullable String $$0, bjv... $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
   }

   public String b(String $$0) {
      return $$0 + (this.a == null ? jy.j.b(this).a() : this.a);
   }

   public List<bjv> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         UnmodifiableIterator var1 = this.b.iterator();

         while (var1.hasNext()) {
            bjv $$0 = (bjv)var1.next();
            if ($$0.c().a()) {
               return true;
            }
         }
      }

      return false;
   }

   @Deprecated
   public ib.c<cmy> c() {
      return this.c;
   }
}
