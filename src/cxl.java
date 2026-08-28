import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxl implements cqe {
   public static final Codec<jn<cxl>> a = lu.h.r();
   public static final zb<wo, jn<cxl>> b = yz.b(lv.ad);
   @Nullable
   private final String c;
   private final List<bsq> d;
   private cqh e = cqj.h;

   public cxl(bsq... $$0) {
      this(null, $$0);
   }

   public cxl(@Nullable String $$0, bsq... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public cxl a(cqf... $$0) {
      this.e = cqj.f.a($$0);
      return this;
   }

   @Override
   public cqh i() {
      return this.e;
   }

   public static String a(Optional<jn<cxl>> $$0, String $$1) {
      if ($$0.isPresent()) {
         String $$2 = $$0.get().a().c;
         if ($$2 != null) {
            return $$1 + $$2;
         }
      }

      String $$3 = $$0.flatMap(jn::e).map($$0x -> $$0x.a().a()).orElse("empty");
      return $$1 + $$3;
   }

   public List<bsq> a() {
      return this.d;
   }

   public boolean b() {
      if (!this.d.isEmpty()) {
         for (bsq $$0 : this.d) {
            if ($$0.c().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
