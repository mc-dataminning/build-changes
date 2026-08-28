import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwq implements cpg {
   public static final Codec<jm<cwq>> a = lt.h.s();
   public static final yw<wj, jm<cwq>> b = yu.b(lu.ad);
   @Nullable
   private final String c;
   private final List<bry> d;
   private cpj e = cpl.f;

   public cwq(bry... $$0) {
      this(null, $$0);
   }

   public cwq(@Nullable String $$0, bry... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public cwq a(cph... $$0) {
      this.e = cpl.d.a($$0);
      return this;
   }

   @Override
   public cpj i() {
      return this.e;
   }

   public static String a(Optional<jm<cwq>> $$0, String $$1) {
      if ($$0.isPresent()) {
         String $$2 = $$0.get().a().c;
         if ($$2 != null) {
            return $$1 + $$2;
         }
      }

      String $$3 = $$0.flatMap(jm::e).map($$0x -> $$0x.a().a()).orElse("empty");
      return $$1 + $$3;
   }

   public List<bry> a() {
      return this.d;
   }

   public boolean b() {
      if (!this.d.isEmpty()) {
         for (bry $$0 : this.d) {
            if ($$0.c().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
