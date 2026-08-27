import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public class crm {
   @Nullable
   private final String a;
   private final List<bns> b;

   public static il<crm> a(String $$0) {
      ajc $$1 = ajc.a($$0);
      return $$1 == null ? crp.b : kh.i.c($$1).map(Function.identity()).orElse(crp.b);
   }

   public crm(bns... $$0) {
      this(null, $$0);
   }

   public crm(@Nullable String $$0, bns... $$1) {
      this.a = $$0;
      this.b = List.of($$1);
   }

   public static String a(il<crm> $$0, String $$1) {
      String $$2 = $$0.a().a;
      if ($$2 != null) {
         return $$1 + $$2;
      } else {
         ajb<crm> $$3 = $$0.e().orElse(crp.a);
         return $$1 + $$3.a().a();
      }
   }

   public List<bns> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         for (bns $$0 : this.b) {
            if ($$0.b().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
