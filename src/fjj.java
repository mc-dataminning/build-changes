import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjj {
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 1024;
   public String a;
   public String b;
   public tn c;
   public tn d;
   @Nullable
   public aeb.b e;
   public long f;
   public int g = aa.b().e();
   public tn h = tn.b(aa.b().c());
   public boolean i;
   public List<tn> j = Collections.emptyList();
   private fjj.a m = fjj.a.c;
   @Nullable
   private byte[] n;
   private fjj.b o;
   private boolean p;

   public fjj(String $$0, String $$1, fjj.b $$2) {
      this.a = $$0;
      this.b = $$1;
      this.o = $$2;
   }

   public qy a() {
      qy $$0 = new qy();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      if (this.n != null) {
         $$0.a("icon", Base64.getEncoder().encodeToString(this.n));
      }

      if (this.m == fjj.a.a) {
         $$0.a("acceptTextures", true);
      } else if (this.m == fjj.a.b) {
         $$0.a("acceptTextures", false);
      }

      return $$0;
   }

   public fjj.a b() {
      return this.m;
   }

   public void a(fjj.a $$0) {
      this.m = $$0;
   }

   public static fjj a(qy $$0) {
      fjj $$1 = new fjj($$0.l("name"), $$0.l("ip"), fjj.b.c);
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
            $$1.a(fjj.a.a);
         } else {
            $$1.a(fjj.a.b);
         }
      } else {
         $$1.a(fjj.a.c);
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
      return this.o == fjj.b.a;
   }

   public boolean e() {
      return this.o == fjj.b.b;
   }

   public void a(boolean $$0) {
      this.p = $$0;
   }

   public boolean f() {
      return this.p;
   }

   public void a(fjj $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.n = $$0.n;
   }

   public void b(fjj $$0) {
      this.a($$0);
      this.a($$0.b());
      this.o = $$0.o;
      this.p = $$0.p;
   }

   @Nullable
   public static byte[] b(@Nullable byte[] $$0) {
      if ($$0 != null) {
         try {
            asc $$1 = asc.a($$0);
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

      private final tn d;

      private a(String $$0) {
         this.d = tn.c("addServer.resourcePack." + $$0);
      }

      public tn a() {
         return this.d;
      }
   }

   public static enum b {
      a,
      b,
      c;
   }
}
