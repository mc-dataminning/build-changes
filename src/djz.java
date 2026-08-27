import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class djz {
   final String a;

   public djz(String $$0) {
      this.a = $$0;
   }

   public static ajh a(ajg<djz> $$0, boolean $$1) {
      String $$2 = $$1 ? "banner" : "shield";
      return $$0.a().d("entity/" + $$2 + "/");
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public static il<djz> a(String $$0) {
      return ki.am.h().filter($$1 -> $$1.a().a.equals($$0)).findAny().orElse(null);
   }

   public static class a {
      private final List<Pair<il<djz>, cpd>> a = Lists.newArrayList();

      public djz.a a(ajg<djz> $$0, cpd $$1) {
         return this.a(ki.am.g($$0), $$1);
      }

      public djz.a a(il<djz> $$0, cpd $$1) {
         return this.a(Pair.of($$0, $$1));
      }

      public djz.a a(Pair<il<djz>, cpd> $$0) {
         this.a.add($$0);
         return this;
      }

      public tg a() {
         tg $$0 = new tg();

         for (Pair<il<djz>, cpd> $$1 : this.a) {
            ta $$2 = new ta();
            $$2.a("Pattern", ((djz)((il)$$1.getFirst()).a()).a);
            $$2.a("Color", ((cpd)$$1.getSecond()).a());
            $$0.add($$2);
         }

         return $$0;
      }
   }
}
