import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvn implements cog {
   @Nullable
   private final String a;
   private final List<brc> b;
   private coj c = col.g;

   public cvn(brc... $$0) {
      this(null, $$0);
   }

   public cvn(@Nullable String $$0, brc... $$1) {
      this.a = $$0;
      this.b = List.of($$1);
   }

   public cvn a(coh... $$0) {
      this.c = col.e.a($$0);
      return this;
   }

   @Override
   public coj i() {
      return this.c;
   }

   public static String a(Optional<ix<cvn>> $$0, String $$1) {
      if ($$0.isPresent()) {
         String $$2 = $$0.get().a().a;
         if ($$2 != null) {
            return $$1 + $$2;
         }
      }

      String $$3 = $$0.flatMap(ix::e).map($$0x -> $$0x.a().a()).orElse("empty");
      return $$1 + $$3;
   }

   public List<brc> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         for (brc $$0 : this.b) {
            if ($$0.c().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
