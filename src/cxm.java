import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxm implements cqk {
   public static final Codec<jn<cxm>> a = lu.h.r();
   public static final zb<wo, jn<cxm>> b = yz.b(lv.ad);
   @Nullable
   private final String c;
   private final List<bsv> d;
   private cqn e = cqp.h;

   public cxm(bsv... $$0) {
      this(null, $$0);
   }

   public cxm(@Nullable String $$0, bsv... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public cxm a(cql... $$0) {
      this.e = cqp.f.a($$0);
      return this;
   }

   @Override
   public cqn i() {
      return this.e;
   }

   public static String a(Optional<jn<cxm>> $$0, String $$1) {
      if ($$0.isPresent()) {
         String $$2 = $$0.get().a().c;
         if ($$2 != null) {
            return $$1 + $$2;
         }
      }

      String $$3 = $$0.flatMap(jn::e).map($$0x -> $$0x.a().a()).orElse("empty");
      return $$1 + $$3;
   }

   public List<bsv> a() {
      return this.d;
   }

   public boolean b() {
      if (!this.d.isEmpty()) {
         for (bsv $$0 : this.d) {
            if ($$0.c().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
