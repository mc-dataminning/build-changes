import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvz implements cos {
   @Nullable
   private final String a;
   private final List<brl> b;
   private cov c = cox.f;

   public cvz(brl... $$0) {
      this(null, $$0);
   }

   public cvz(@Nullable String $$0, brl... $$1) {
      this.a = $$0;
      this.b = List.of($$1);
   }

   public cvz a(cot... $$0) {
      this.c = cox.d.a($$0);
      return this;
   }

   @Override
   public cov i() {
      return this.c;
   }

   public static String a(Optional<jj<cvz>> $$0, String $$1) {
      if ($$0.isPresent()) {
         String $$2 = $$0.get().a().a;
         if ($$2 != null) {
            return $$1 + $$2;
         }
      }

      String $$3 = $$0.flatMap(jj::e).map($$0x -> $$0x.a().a()).orElse("empty");
      return $$1 + $$3;
   }

   public List<brl> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         for (brl $$0 : this.b) {
            if ($$0.c().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
