import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwn implements cph {
   @Nullable
   private final String a;
   private final List<bsb> b;
   private cpk c = cpm.g;

   public cwn(bsb... $$0) {
      this(null, $$0);
   }

   public cwn(@Nullable String $$0, bsb... $$1) {
      this.a = $$0;
      this.b = List.of($$1);
   }

   public cwn a(cpi... $$0) {
      this.c = cpm.e.a($$0);
      return this;
   }

   @Override
   public cpk i() {
      return this.c;
   }

   public static String a(Optional<ji<cwn>> $$0, String $$1) {
      if ($$0.isPresent()) {
         String $$2 = $$0.get().a().a;
         if ($$2 != null) {
            return $$1 + $$2;
         }
      }

      String $$3 = $$0.flatMap(ji::e).map($$0x -> $$0x.a().a()).orElse("empty");
      return $$1 + $$3;
   }

   public List<bsb> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         for (bsb $$0 : this.b) {
            if ($$0.c().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
