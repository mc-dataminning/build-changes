import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqq {
   private static final Logger j = LogUtils.getLogger();
   private static final int k = 1024;
   public String a;
   public String b;
   public vq c;
   public vq d;
   @Nullable
   public ahy.b e;
   public long f;
   public int g = aa.b().e();
   public vq h = vq.b(aa.b().c());
   public List<vq> i = Collections.emptyList();
   private fqq.a l = fqq.a.c;
   @Nullable
   private byte[] m;
   private fqq.c n;
   private fqq.b o = fqq.b.a;

   public fqq(String $$0, String $$1, fqq.c $$2) {
      this.a = $$0;
      this.b = $$1;
      this.n = $$2;
   }

   public sw a() {
      sw $$0 = new sw();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      if (this.m != null) {
         $$0.a("icon", Base64.getEncoder().encodeToString(this.m));
      }

      if (this.l == fqq.a.a) {
         $$0.a("acceptTextures", true);
      } else if (this.l == fqq.a.b) {
         $$0.a("acceptTextures", false);
      }

      return $$0;
   }

   public fqq.a b() {
      return this.l;
   }

   public void a(fqq.a $$0) {
      this.l = $$0;
   }

   public static fqq a(sw $$0) {
      fqq $$1 = new fqq($$0.l("name"), $$0.l("ip"), fqq.c.c);
      if ($$0.b("icon", 8)) {
         try {
            byte[] $$2 = Base64.getDecoder().decode($$0.l("icon"));
            $$1.a(b($$2));
         } catch (IllegalArgumentException var3) {
            j.warn("Malformed base64 server icon", var3);
         }
      }

      if ($$0.b("acceptTextures", 1)) {
         if ($$0.q("acceptTextures")) {
            $$1.a(fqq.a.a);
         } else {
            $$1.a(fqq.a.b);
         }
      } else {
         $$1.a(fqq.a.c);
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
      return this.n == fqq.c.a;
   }

   public boolean e() {
      return this.n == fqq.c.b;
   }

   public fqq.c f() {
      return this.n;
   }

   public void a(fqq $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.m = $$0.m;
   }

   public void b(fqq $$0) {
      this.a($$0);
      this.a($$0.b());
      this.n = $$0.n;
   }

   public fqq.b g() {
      return this.o;
   }

   public void a(fqq.b $$0) {
      this.o = $$0;
   }

   @Nullable
   public static byte[] b(@Nullable byte[] $$0) {
      if ($$0 != null) {
         try {
            awm $$1 = awm.a($$0);
            if ($$1.a() <= 1024 && $$1.b() <= 1024) {
               return $$0;
            }
         } catch (IOException var2) {
            j.warn("Failed to decode server icon", var2);
         }
      }

      return null;
   }

   public static enum a {
      a("enabled"),
      b("disabled"),
      c("prompt");

      private final vq d;

      private a(String $$0) {
         this.d = vq.c("addServer.resourcePack." + $$0);
      }

      public vq a() {
         return this.d;
      }
   }

   public static enum b {
      a,
      b,
      c,
      d,
      e;
   }

   public static enum c {
      a,
      b,
      c;
   }
}
