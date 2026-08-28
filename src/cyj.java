import com.mojang.serialization.Codec;
import java.util.List;

public class cyj implements crn {
   public static final Codec<jq<cyj>> a = lz.h.r();
   public static final zh<wu, jq<cyj>> b = zf.b(ma.ad);
   private final String c;
   private final List<btq> d;
   private crq e = crs.g;

   public cyj(String $$0, btq... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public cyj a(cro... $$0) {
      this.e = crs.e.a($$0);
      return this;
   }

   @Override
   public crq i() {
      return this.e;
   }

   public List<btq> a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   public boolean c() {
      for (btq $$0 : this.d) {
         if ($$0.c().a().a()) {
            return true;
         }
      }

      return false;
   }
}
