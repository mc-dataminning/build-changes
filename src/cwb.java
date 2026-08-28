import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwb implements cov {
   @Nullable
   private final String a;
   private final List<bro> b;
   private coy c = cpa.f;

   public cwb(bro... $$0) {
      this(null, $$0);
   }

   public cwb(@Nullable String $$0, bro... $$1) {
      this.a = $$0;
      this.b = List.of($$1);
   }

   public cwb a(cow... $$0) {
      this.c = cpa.d.a($$0);
      return this;
   }

   @Override
   public coy i() {
      return this.c;
   }

   public static String a(Optional<jj<cwb>> $$0, String $$1) {
      if ($$0.isPresent()) {
         String $$2 = $$0.get().a().a;
         if ($$2 != null) {
            return $$1 + $$2;
         }
      }

      String $$3 = $$0.flatMap(jj::e).map($$0x -> $$0x.a().a()).orElse("empty");
      return $$1 + $$3;
   }

   public List<bro> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         for (bro $$0 : this.b) {
            if ($$0.c().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
