import com.mojang.logging.LogUtils;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fin {
   private static final Logger k = LogUtils.getLogger();
   public String a;
   public String b;
   public te c;
   public te d;
   @Nullable
   public ads.b e;
   public long f;
   public int g = aa.b().e();
   public te h = te.b(aa.b().c());
   public boolean i;
   public List<te> j = Collections.emptyList();
   private fin.a l = fin.a.c;
   @Nullable
   private byte[] m;
   private fin.b n;
   private boolean o;

   public fin(String $$0, String $$1, fin.b $$2) {
      this.a = $$0;
      this.b = $$1;
      this.n = $$2;
   }

   public qs a() {
      qs $$0 = new qs();
      $$0.a("name", this.a);
      $$0.a("ip", this.b);
      if (this.m != null) {
         $$0.a("icon", Base64.getEncoder().encodeToString(this.m));
      }

      if (this.l == fin.a.a) {
         $$0.a("acceptTextures", true);
      } else if (this.l == fin.a.b) {
         $$0.a("acceptTextures", false);
      }

      return $$0;
   }

   public fin.a b() {
      return this.l;
   }

   public void a(fin.a $$0) {
      this.l = $$0;
   }

   public static fin a(qs $$0) {
      fin $$1 = new fin($$0.l("name"), $$0.l("ip"), fin.b.c);
      if ($$0.b("icon", 8)) {
         try {
            $$1.a(Base64.getDecoder().decode($$0.l("icon")));
         } catch (IllegalArgumentException var3) {
            k.warn("Malformed base64 server icon", var3);
         }
      }

      if ($$0.b("acceptTextures", 1)) {
         if ($$0.q("acceptTextures")) {
            $$1.a(fin.a.a);
         } else {
            $$1.a(fin.a.b);
         }
      } else {
         $$1.a(fin.a.c);
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
      return this.n == fin.b.a;
   }

   public boolean e() {
      return this.n == fin.b.b;
   }

   public void a(boolean $$0) {
      this.o = $$0;
   }

   public boolean f() {
      return this.o;
   }

   public void a(fin $$0) {
      this.b = $$0.b;
      this.a = $$0.a;
      this.m = $$0.m;
   }

   public void b(fin $$0) {
      this.a($$0);
      this.a($$0.b());
      this.n = $$0.n;
      this.o = $$0.o;
   }

   public static enum a {
      a("enabled"),
      b("disabled"),
      c("prompt");

      private final te d;

      private a(String $$0) {
         this.d = te.c("addServer.resourcePack." + $$0);
      }

      public te a() {
         return this.d;
      }
   }

   public static enum b {
      a,
      b,
      c;
   }
}
