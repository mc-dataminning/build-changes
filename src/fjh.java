import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjh {
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 1024;
   public String a;
   public String b;
   public tl c;
   public tl d;
   @Nullable
   public adz.b e;
   public long f;
   public int g = aa.b().e();
   public tl h = tl.b(aa.b().c());
   public boolean i;
   public List<tl> j = Collections.emptyList();
   private fjh.a m = fjh.a.c;
   @Nullable
   private byte[] n;
   private fjh.b o;
   private boolean p;

   public fjh(String $$0, String $$1, fjh.b $$2) {
      this.a = $$0;
      this.b = $$1;
      this.o = $$2;
   }

   public qw a() {
      qw $$0 = new qw();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      if (this.n != null) {
         $$0.a("icon", Base64.getEncoder().encodeToString(this.n));
      }

      if (this.m == fjh.a.a) {
         $$0.a("acceptTextures", true);
      } else if (this.m == fjh.a.b) {
         $$0.a("acceptTextures", false);
      }

      return $$0;
   }

   public fjh.a b() {
      return this.m;
   }

   public void a(fjh.a $$0) {
      this.m = $$0;
   }

   public static fjh a(qw $$0) {
      fjh $$1 = new fjh($$0.l("name"), $$0.l("ip"), fjh.b.c);
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
            $$1.a(fjh.a.a);
         } else {
            $$1.a(fjh.a.b);
         }
      } else {
         $$1.a(fjh.a.c);
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
      return this.o == fjh.b.a;
   }

   public boolean e() {
      return this.o == fjh.b.b;
   }

   public void a(boolean $$0) {
      this.p = $$0;
   }

   public boolean f() {
      return this.p;
   }

   public void a(fjh $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.n = $$0.n;
   }

   public void b(fjh $$0) {
      this.a($$0);
      this.a($$0.b());
      this.o = $$0.o;
      this.p = $$0.p;
   }

   @Nullable
   public static byte[] b(@Nullable byte[] $$0) {
      if ($$0 != null) {
         try {
            asa $$1 = asa.a($$0);
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

      private final tl d;

      private a(String $$0) {
         this.d = tl.c("addServer.resourcePack." + $$0);
      }

      public tl a() {
         return this.d;
      }
   }

   public static enum b {
      a,
      b,
      c;
   }
}
