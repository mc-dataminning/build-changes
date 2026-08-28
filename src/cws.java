import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cws implements cpi {
   public static final Codec<jm<cws>> a = lt.h.s();
   public static final yx<wk, jm<cws>> b = yv.b(lu.ad);
   @Nullable
   private final String c;
   private final List<brz> d;
   private cpl e = cpn.f;

   public cws(brz... $$0) {
      this(null, $$0);
   }

   public cws(@Nullable String $$0, brz... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public cws a(cpj... $$0) {
      this.e = cpn.d.a($$0);
      return this;
   }

   @Override
   public cpl i() {
      return this.e;
   }

   public static String a(Optional<jm<cws>> $$0, String $$1) {
      if ($$0.isPresent()) {
         String $$2 = $$0.get().a().c;
         if ($$2 != null) {
            return $$1 + $$2;
         }
      }

      String $$3 = $$0.flatMap(jm::e).map($$0x -> $$0x.a().a()).orElse("empty");
      return $$1 + $$3;
   }

   public List<brz> a() {
      return this.d;
   }

   public boolean b() {
      if (!this.d.isEmpty()) {
         for (brz $$0 : this.d) {
            if ($$0.c().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
