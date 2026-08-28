import com.mojang.serialization.Codec;
import java.util.List;

public class cxu implements cqx {
   public static final Codec<jp<cxu>> a = lx.h.r();
   public static final zf<ws, jp<cxu>> b = zd.b(ly.ad);
   private final String c;
   private final List<bte> d;
   private cra e = crc.h;

   public cxu(String $$0, bte... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public cxu a(cqy... $$0) {
      this.e = crc.f.a($$0);
      return this;
   }

   @Override
   public cra i() {
      return this.e;
   }

   public List<bte> a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   public boolean c() {
      for (bte $$0 : this.d) {
         if ($$0.c().a().a()) {
            return true;
         }
      }

      return false;
   }
}
