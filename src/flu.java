import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flu {
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 1024;
   public String a;
   public String b;
   public ur c;
   public ur d;
   @Nullable
   public afj.b e;
   public long f;
   public int g = aa.b().e();
   public ur h = ur.b(aa.b().c());
   public boolean i;
   public List<ur> j = Collections.emptyList();
   private flu.a m = flu.a.c;
   @Nullable
   private byte[] n;
   private flu.b o;
   private boolean p;

   public flu(String $$0, String $$1, flu.b $$2) {
      this.a = $$0;
      this.b = $$1;
      this.o = $$2;
   }

   public rz a() {
      rz $$0 = new rz();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      if (this.n != null) {
         $$0.a("icon", Base64.getEncoder().encodeToString(this.n));
      }

      if (this.m == flu.a.a) {
         $$0.a("acceptTextures", true);
      } else if (this.m == flu.a.b) {
         $$0.a("acceptTextures", false);
      }

      return $$0;
   }

   public flu.a b() {
      return this.m;
   }

   public void a(flu.a $$0) {
      this.m = $$0;
   }

   public static flu a(rz $$0) {
      flu $$1 = new flu($$0.l("name"), $$0.l("ip"), flu.b.c);
      if ($$0.b("icon", 8)) {
         try {
            byte[] $$2 = Base64.getDecoder().decode($$0.l("icon"));
            $$1.a(b($$2));
         } catch (IllegalArgumentException var3) {
            k.warn("Malformed base64 server icon", var3);
         }
      }

      if ($$0.b("acceptTextures", 1)) {
         if ($$0.q("acceptTextures")) {
            $$1.a(flu.a.a);
         } else {
            $$1.a(flu.a.b);
         }
      } else {
         $$1.a(flu.a.c);
      }

      return $$1;
   }

   @Nullable
   public byte[] c() {
      return this.n;
   }

   public void a(@Nullable byte[] $$0) {
      this.n = $$0;
   }

   public boolean d() {
      return this.o == flu.b.a;
   }

   public boolean e() {
      return this.o == flu.b.b;
   }

   public void a(boolean $$0) {
      this.p = $$0;
   }

   public boolean f() {
      return this.p;
   }

   public void a(flu $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.n = $$0.n;
   }

   public void b(flu $$0) {
      this.a($$0);
      this.a($$0.b());
      this.o = $$0.o;
      this.p = $$0.p;
   }

   @Nullable
   public static byte[] b(@Nullable byte[] $$0) {
      if ($$0 != null) {
         try {
            atq $$1 = atq.a($$0);
            if ($$1.a() <= 1024 && $$1.b() <= 1024) {
               return $$0;
            }
         } catch (IOException var2) {
            k.warn("Failed to decode server icon", var2);
         }
      }

      return null;
   }

   public static enum a {
      a("enabled"),
      b("disabled"),
      c("prompt");

      private final ur d;

      private a(String $$0) {
         this.d = ur.c("addServer.resourcePack." + $$0);
      }

      public ur a() {
         return this.d;
      }
   }

   public static enum b {
      a,
      b,
      c;
   }
}
