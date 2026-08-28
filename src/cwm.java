import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwm implements cpg {
   @Nullable
   private final String a;
   private final List<bsa> b;
   private cpj c = cpl.g;

   public cwm(bsa... $$0) {
      this(null, $$0);
   }

   public cwm(@Nullable String $$0, bsa... $$1) {
      this.a = $$0;
      this.b = List.of($$1);
   }

   public cwm a(cph... $$0) {
      this.c = cpl.e.a($$0);
      return this;
   }

   @Override
   public cpj i() {
      return this.c;
   }

   public static String a(Optional<ji<cwm>> $$0, String $$1) {
      if ($$0.isPresent()) {
         String $$2 = $$0.get().a().a;
         if ($$2 != null) {
            return $$1 + $$2;
         }
      }

      String $$3 = $$0.flatMap(ji::e).map($$0x -> $$0x.a().a()).orElse("empty");
      return $$1 + $$3;
   }

   public List<bsa> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         for (bsa $$0 : this.b) {
            if ($$0.c().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
