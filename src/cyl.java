import com.mojang.serialization.Codec;
import java.util.List;

public class cyl implements crp {
   public static final Codec<jr<cyl>> a = mb.h.r();
   public static final yn<wa, jr<cyl>> b = yl.b(mc.ad);
   private final String c;
   private final List<btp> d;
   private crs e = cru.g;

   public cyl(String $$0, btp... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public cyl a(crq... $$0) {
      this.e = cru.e.a($$0);
      return this;
   }

   @Override
   public crs i() {
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
