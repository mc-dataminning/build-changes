import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwp implements cpj {
   @Nullable
   private final String a;
   private final List<bsd> b;
   private cpm c = cpo.g;

   public cwp(bsd... $$0) {
      this(null, $$0);
   }

   public cwp(@Nullable String $$0, bsd... $$1) {
      this.a = $$0;
      this.b = List.of($$1);
   }

   public cwp a(cpk... $$0) {
      this.c = cpo.e.a($$0);
      return this;
   }

   @Override
   public cpm i() {
      return this.c;
   }

   public static String a(Optional<ji<cwp>> $$0, String $$1) {
      if ($$0.isPresent()) {
         String $$2 = $$0.get().a().a;
         if ($$2 != null) {
            return $$1 + $$2;
         }
      }

      String $$3 = $$0.flatMap(ji::e).map($$0x -> $$0x.a().a()).orElse("empty");
      return $$1 + $$3;
   }

   public List<bsd> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         for (bsd $$0 : this.b) {
            if ($$0.c().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
