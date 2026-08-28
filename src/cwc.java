import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwc implements cow {
   public static final Codec<jj<cwc>> a = lq.h.s();
   public static final ys<wf, jj<cwc>> b = yq.b(lr.ac);
   @Nullable
   private final String c;
   private final List<brp> d;
   private coz e = cpb.f;

   public cwc(brp... $$0) {
      this(null, $$0);
   }

   public cwc(@Nullable String $$0, brp... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public cwc a(cox... $$0) {
      this.e = cpb.d.a($$0);
      return this;
   }

   @Override
   public coz i() {
      return this.e;
   }

   public static String a(Optional<jj<cwc>> $$0, String $$1) {
      if ($$0.isPresent()) {
         String $$2 = $$0.get().a().c;
         if ($$2 != null) {
            return $$1 + $$2;
         }
      }

      String $$3 = $$0.flatMap(jj::e).map($$0x -> $$0x.a().a()).orElse("empty");
      return $$1 + $$3;
   }

   public List<brp> a() {
      return this.d;
   }

   public boolean b() {
      if (!this.d.isEmpty()) {
         for (brp $$0 : this.d) {
            if ($$0.c().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
