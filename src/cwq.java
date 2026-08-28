import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwq implements cpk {
   @Nullable
   private final String a;
   private final List<bse> b;
   private cpn c = cpp.g;

   public cwq(bse... $$0) {
      this(null, $$0);
   }

   public cwq(@Nullable String $$0, bse... $$1) {
      this.a = $$0;
      this.b = List.of($$1);
   }

   public cwq a(cpl... $$0) {
      this.c = cpp.e.a($$0);
      return this;
   }

   @Override
   public cpn i() {
      return this.c;
   }

   public static String a(Optional<ji<cwq>> $$0, String $$1) {
      if ($$0.isPresent()) {
         String $$2 = $$0.get().a().a;
         if ($$2 != null) {
            return $$1 + $$2;
         }
      }

      String $$3 = $$0.flatMap(ji::e).map($$0x -> $$0x.a().a()).orElse("empty");
      return $$1 + $$3;
   }

   public List<bse> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         for (bse $$0 : this.b) {
            if ($$0.c().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
