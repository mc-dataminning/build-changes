import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cto {
   @Nullable
   private final String a;
   private final List<bpm> b;

   public cto(bpm... $$0) {
      this(null, $$0);
   }

   public cto(@Nullable String $$0, bpm... $$1) {
      this.a = $$0;
      this.b = List.of($$1);
   }

   public static String a(Optional<in<cto>> $$0, String $$1) {
      if ($$0.isPresent()) {
         String $$2 = $$0.get().a().a;
         if ($$2 != null) {
            return $$1 + $$2;
         }
      }

      String $$3 = $$0.flatMap(in::e).map($$0x -> $$0x.a().a()).orElse("empty");
      return $$1 + $$3;
   }

   public List<bpm> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         for (bpm $$0 : this.b) {
            if ($$0.b().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
