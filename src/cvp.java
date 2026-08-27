import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvp implements coi {
   @Nullable
   private final String a;
   private final List<bre> b;
   private col c = coo.g;

   public cvp(bre... $$0) {
      this(null, $$0);
   }

   public cvp(@Nullable String $$0, bre... $$1) {
      this.a = $$0;
      this.b = List.of($$1);
   }

   public cvp a(coj... $$0) {
      this.c = coo.e.a($$0);
      return this;
   }

   @Override
   public col i() {
      return this.c;
   }

   public static String a(Optional<ix<cvp>> $$0, String $$1) {
      if ($$0.isPresent()) {
         String $$2 = $$0.get().a().a;
         if ($$2 != null) {
            return $$1 + $$2;
         }
      }

      String $$3 = $$0.flatMap(ix::e).map($$0x -> $$0x.a().a()).orElse("empty");
      return $$1 + $$3;
   }

   public List<bre> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         for (bre $$0 : this.b) {
            if ($$0.c().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
