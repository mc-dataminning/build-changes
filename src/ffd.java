import com.mojang.logging.LogUtils;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffd {
   private static final Logger k = LogUtils.getLogger();
   public String a;
   public String b;
   public sw c;
   public sw d;
   @Nullable
   public abt.b e;
   public long f;
   public int g = aa.b().e();
   public sw h = sw.b(aa.b().c());
   public boolean i;
   public List<sw> j = Collections.emptyList();
   private ffd.a l = ffd.a.c;
   @Nullable
   private byte[] m;
   private boolean n;
   private boolean o;

   public ffd(String $$0, String $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.n = $$2;
   }

   public qr a() {
      qr $$0 = new qr();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      if (this.m != null) {
         $$0.a("icon", Base64.getEncoder().encodeToString(this.m));
      }

      if (this.l == ffd.a.a) {
         $$0.a("acceptTextures", true);
      } else if (this.l == ffd.a.b) {
         $$0.a("acceptTextures", false);
      }

      return $$0;
   }

   public ffd.a b() {
      return this.l;
   }

   public void a(ffd.a $$0) {
      this.l = $$0;
   }

   public static ffd a(qr $$0) {
      ffd $$1 = new ffd($$0.l("name"), $$0.l("ip"), false);
      if ($$0.b("icon", 8)) {
         try {
            $$1.a(Base64.getDecoder().decode($$0.l("icon")));
         } catch (IllegalArgumentException var3) {
            k.warn("Malformed base64 server icon", var3);
         }
      }

      if ($$0.b("acceptTextures", 1)) {
         if ($$0.q("acceptTextures")) {
            $$1.a(ffd.a.a);
         } else {
            $$1.a(ffd.a.b);
         }
      } else {
         $$1.a(ffd.a.c);
      }

      return $$1;
   }

   @Nullable
   public byte[] c() {
      return this.m;
   }

   public void a(@Nullable byte[] $$0) {
      this.m = $$0;
   }

   public boolean d() {
      return this.n;
   }

   public void a(boolean $$0) {
      this.o = $$0;
   }

   public boolean e() {
      return this.o;
   }

   public void a(ffd $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.m = $$0.m;
   }

   public void b(ffd $$0) {
      this.a($$0);
      this.a($$0.b());
      this.n = $$0.n;
      this.o = $$0.o;
   }

   public static enum a {
      a("enabled"),
      b("disabled"),
      c("prompt");

      private final sw d;

      private a(String $$0) {
         this.d = sw.c("addServer.resourcePack." + $$0);
      }

      public sw a() {
         return this.d;
      }
   }
}
