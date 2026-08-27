import com.mojang.logging.LogUtils;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjc {
   private static final Logger k = LogUtils.getLogger();
   public String a;
   public String b;
   public ti c;
   public ti d;
   @Nullable
   public adx.b e;
   public long f;
   public int g = aa.b().e();
   public ti h = ti.b(aa.b().c());
   public boolean i;
   public List<ti> j = Collections.emptyList();
   private fjc.a l = fjc.a.c;
   @Nullable
   private byte[] m;
   private fjc.b n;
   private boolean o;

   public fjc(String $$0, String $$1, fjc.b $$2) {
      this.a = $$0;
      this.b = $$1;
      this.n = $$2;
   }

   public qu a() {
      qu $$0 = new qu();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      if (this.m != null) {
         $$0.a("icon", Base64.getEncoder().encodeToString(this.m));
      }

      if (this.l == fjc.a.a) {
         $$0.a("acceptTextures", true);
      } else if (this.l == fjc.a.b) {
         $$0.a("acceptTextures", false);
      }

      return $$0;
   }

   public fjc.a b() {
      return this.l;
   }

   public void a(fjc.a $$0) {
      this.l = $$0;
   }

   public static fjc a(qu $$0) {
      fjc $$1 = new fjc($$0.l("name"), $$0.l("ip"), fjc.b.c);
      if ($$0.b("icon", 8)) {
         try {
            $$1.a(Base64.getDecoder().decode($$0.l("icon")));
         } catch (IllegalArgumentException var3) {
            k.warn("Malformed base64 server icon", var3);
         }
      }

      if ($$0.b("acceptTextures", 1)) {
         if ($$0.q("acceptTextures")) {
            $$1.a(fjc.a.a);
         } else {
            $$1.a(fjc.a.b);
         }
      } else {
         $$1.a(fjc.a.c);
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
      return this.n == fjc.b.a;
   }

   public boolean e() {
      return this.n == fjc.b.b;
   }

   public void a(boolean $$0) {
      this.o = $$0;
   }

   public boolean f() {
      return this.o;
   }

   public void a(fjc $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.m = $$0.m;
   }

   public void b(fjc $$0) {
      this.a($$0);
      this.a($$0.b());
      this.n = $$0.n;
      this.o = $$0.o;
   }

   public static enum a {
      a("enabled"),
      b("disabled"),
      c("prompt");

      private final ti d;

      private a(String $$0) {
         this.d = ti.c("addServer.resourcePack." + $$0);
      }

      public ti a() {
         return this.d;
      }
   }

   public static enum b {
      a,
      b,
      c;
   }
}
