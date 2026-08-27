import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fop {
   private static final Logger j = LogUtils.getLogger();
   private static final int k = 1024;
   public String a;
   public String b;
   public vg c;
   public vg d;
   @Nullable
   public agi.b e;
   public long f;
   public int g = aa.b().e();
   public vg h = vg.b(aa.b().c());
   public List<vg> i = Collections.emptyList();
   private fop.a l = fop.a.c;
   @Nullable
   private byte[] m;
   private fop.c n;
   private fop.b o = fop.b.a;
   private boolean p;

   public fop(String $$0, String $$1, fop.c $$2) {
      this.a = $$0;
      this.b = $$1;
      this.n = $$2;
   }

   public so a() {
      so $$0 = new so();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      if (this.m != null) {
         $$0.a("icon", Base64.getEncoder().encodeToString(this.m));
      }

      if (this.l == fop.a.a) {
         $$0.a("acceptTextures", true);
      } else if (this.l == fop.a.b) {
         $$0.a("acceptTextures", false);
      }

      return $$0;
   }

   public fop.a b() {
      return this.l;
   }

   public void a(fop.a $$0) {
      this.l = $$0;
   }

   public static fop a(so $$0) {
      fop $$1 = new fop($$0.l("name"), $$0.l("ip"), fop.c.c);
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
            $$1.a(fop.a.a);
         } else {
            $$1.a(fop.a.b);
         }
      } else {
         $$1.a(fop.a.c);
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
      return this.n == fop.c.a;
   }

   public boolean e() {
      return this.n == fop.c.b;
   }

   public fop.c f() {
      return this.n;
   }

   public void a(boolean $$0) {
      this.p = $$0;
   }

   public boolean g() {
      return this.p;
   }

   public void a(fop $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.m = $$0.m;
   }

   public void b(fop $$0) {
      this.a($$0);
      this.a($$0.b());
      this.n = $$0.n;
      this.p = $$0.p;
   }

   public fop.b h() {
      return this.o;
   }

   public void a(fop.b $$0) {
      this.o = $$0;
   }

   @Nullable
   public static byte[] b(@Nullable byte[] $$0) {
      if ($$0 != null) {
         try {
            aut $$1 = aut.a($$0);
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

      private final vg d;

      private a(String $$0) {
         this.d = vg.c("addServer.resourcePack." + $$0);
      }

      public vg a() {
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
