import com.mojang.serialization.Codec;
import java.util.List;

public class cym implements crq {
   public static final Codec<jr<cym>> a = mb.h.r();
   public static final ym<vz, jr<cym>> b = yk.b(mc.ad);
   private final String c;
   private final List<btp> d;
   private crt e = crv.g;

   public cym(String $$0, btp... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public cym a(crr... $$0) {
      this.e = crv.e.a($$0);
      return this;
   }

   @Override
   public crt i() {
      return this.e;
   }

   public List<btp> a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   public boolean c() {
      for (btp $$0 : this.d) {
         if ($$0.c().a().a()) {
            return true;
         }
      }

      return false;
   }
}
