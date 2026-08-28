import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwo implements cpi {
   @Nullable
   private final String a;
   private final List<bsc> b;
   private cpl c = cpn.g;

   public cwo(bsc... $$0) {
      this(null, $$0);
   }

   public cwo(@Nullable String $$0, bsc... $$1) {
      this.a = $$0;
      this.b = List.of($$1);
   }

   public cwo a(cpj... $$0) {
      this.c = cpn.e.a($$0);
      return this;
   }

   @Override
   public cpl i() {
      return this.c;
   }

   public static String a(Optional<ji<cwo>> $$0, String $$1) {
      if ($$0.isPresent()) {
         String $$2 = $$0.get().a().a;
         if ($$2 != null) {
            return $$1 + $$2;
         }
      }

      String $$3 = $$0.flatMap(ji::e).map($$0x -> $$0x.a().a()).orElse("empty");
      return $$1 + $$3;
   }

   public List<bsc> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         for (bsc $$0 : this.b) {
            if ($$0.c().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
