import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fnv {
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 1024;
   public String a;
   public String b;
   public vd c;
   public vd d;
   @Nullable
   public age.b e;
   public long f;
   public int g = aa.b().e();
   public vd h = vd.b(aa.b().c());
   public boolean i;
   public List<vd> j = Collections.emptyList();
   private fnv.a m = fnv.a.c;
   @Nullable
   private byte[] n;
   private fnv.b o;
   private boolean p;

   public fnv(String $$0, String $$1, fnv.b $$2) {
      this.a = $$0;
      this.b = $$1;
      this.o = $$2;
   }

   public sl a() {
      sl $$0 = new sl();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      if (this.n != null) {
         $$0.a("icon", Base64.getEncoder().encodeToString(this.n));
      }

      if (this.m == fnv.a.a) {
         $$0.a("acceptTextures", true);
      } else if (this.m == fnv.a.b) {
         $$0.a("acceptTextures", false);
      }

      return $$0;
   }

   public fnv.a b() {
      return this.m;
   }

   public void a(fnv.a $$0) {
      this.m = $$0;
   }

   public static fnv a(sl $$0) {
      fnv $$1 = new fnv($$0.l("name"), $$0.l("ip"), fnv.b.c);
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
            $$1.a(fnv.a.a);
         } else {
            $$1.a(fnv.a.b);
         }
      } else {
         $$1.a(fnv.a.c);
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
      return this.o == fnv.b.a;
   }

   public boolean e() {
      return this.o == fnv.b.b;
   }

   public void a(boolean $$0) {
      this.p = $$0;
   }

   public boolean f() {
      return this.p;
   }

   public void a(fnv $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.n = $$0.n;
   }

   public void b(fnv $$0) {
      this.a($$0);
      this.a($$0.b());
      this.o = $$0.o;
      this.p = $$0.p;
   }

   @Nullable
   public static byte[] b(@Nullable byte[] $$0) {
      if ($$0 != null) {
         try {
            aum $$1 = aum.a($$0);
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

      private final vd d;

      private a(String $$0) {
         this.d = vd.c("addServer.resourcePack." + $$0);
      }

      public vd a() {
         return this.d;
      }
   }

   public static enum b {
      a,
      b,
      c;
   }
}
