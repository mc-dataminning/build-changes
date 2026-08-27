import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ctf {
   @Nullable
   private final String a;
   private final List<bph> b;

   public ctf(bph... $$0) {
      this(null, $$0);
   }

   public ctf(@Nullable String $$0, bph... $$1) {
      this.a = $$0;
      this.b = List.of($$1);
   }

   public static String a(Optional<il<ctf>> $$0, String $$1) {
      if ($$0.isPresent()) {
         String $$2 = $$0.get().a().a;
         if ($$2 != null) {
            return $$1 + $$2;
         }
      }

      String $$3 = $$0.flatMap(il::e).map($$0x -> $$0x.a().a()).orElse("empty");
      return $$1 + $$3;
   }

   public List<bph> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         for (bph $$0 : this.b) {
            if ($$0.b().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
