import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwj implements cpd {
   @Nullable
   private final String a;
   private final List<brx> b;
   private cpg c = cpi.g;

   public cwj(brx... $$0) {
      this(null, $$0);
   }

   public cwj(@Nullable String $$0, brx... $$1) {
      this.a = $$0;
      this.b = List.of($$1);
   }

   public cwj a(cpe... $$0) {
      this.c = cpi.e.a($$0);
      return this;
   }

   @Override
   public cpg i() {
      return this.c;
   }

   public static String a(Optional<ji<cwj>> $$0, String $$1) {
      if ($$0.isPresent()) {
         String $$2 = $$0.get().a().a;
         if ($$2 != null) {
            return $$1 + $$2;
         }
      }

      String $$3 = $$0.flatMap(ji::e).map($$0x -> $$0x.a().a()).orElse("empty");
      return $$1 + $$3;
   }

   public List<brx> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         for (brx $$0 : this.b) {
            if ($$0.c().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
