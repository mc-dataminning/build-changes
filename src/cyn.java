import com.mojang.serialization.Codec;
import java.util.List;

public class cyn implements crr {
   public static final Codec<jr<cyn>> a = mb.h.r();
   public static final yn<wa, jr<cyn>> b = yl.b(mc.ad);
   private final String c;
   private final List<btr> d;
   private cru e = crw.g;

   public cyn(String $$0, btr... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public cyn a(crs... $$0) {
      this.e = crw.e.a($$0);
      return this;
   }

   @Override
   public cru i() {
      return this.e;
   }

   public List<btr> a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   public boolean c() {
      for (btr $$0 : this.d) {
         if ($$0.c().a().a()) {
            return true;
         }
      }

      return false;
   }
}
