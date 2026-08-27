import com.mojang.logging.LogUtils;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjh {
   private static final Logger k = LogUtils.getLogger();
   public String a;
   public String b;
   public tl c;
   public tl d;
   @Nullable
   public aea.b e;
   public long f;
   public int g = aa.b().e();
   public tl h = tl.b(aa.b().c());
   public boolean i;
   public List<tl> j = Collections.emptyList();
   private fjh.a l = fjh.a.c;
   @Nullable
   private byte[] m;
   private fjh.b n;
   private boolean o;

   public fjh(String $$0, String $$1, fjh.b $$2) {
      this.a = $$0;
      this.b = $$1;
      this.n = $$2;
   }

   public qx a() {
      qx $$0 = new qx();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      if (this.m != null) {
         $$0.a("icon", Base64.getEncoder().encodeToString(this.m));
      }

      if (this.l == fjh.a.a) {
         $$0.a("acceptTextures", true);
      } else if (this.l == fjh.a.b) {
         $$0.a("acceptTextures", false);
      }

      return $$0;
   }

   public fjh.a b() {
      return this.l;
   }

   public void a(fjh.a $$0) {
      this.l = $$0;
   }

   public static fjh a(qx $$0) {
      fjh $$1 = new fjh($$0.l("name"), $$0.l("ip"), fjh.b.c);
      if ($$0.b("icon", 8)) {
         try {
            $$1.a(Base64.getDecoder().decode($$0.l("icon")));
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
      return this.m;
   }

   public void a(@Nullable byte[] $$0) {
      this.m = $$0;
   }

   public boolean d() {
      return this.n == fjh.b.a;
   }

   public boolean e() {
      return this.n == fjh.b.b;
   }

   public void a(boolean $$0) {
      this.o = $$0;
   }

   public boolean f() {
      return this.o;
   }

   public void a(fjh $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.m = $$0.m;
   }

   public void b(fjh $$0) {
      this.a($$0);
      this.a($$0.b());
      this.n = $$0.n;
      this.o = $$0.o;
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
