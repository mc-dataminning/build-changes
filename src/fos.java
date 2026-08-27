import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fos(String a, @Nullable fos.a b) {
   public static fos a() {
      return a(null);
   }

   public static fos a(String $$0) {
      return a(new fos.a.b($$0));
   }

   public static fos a(erh $$0) {
      return a(new fos.a.a($$0));
   }

   public static fos a(@Nullable fos.a $$0) {
      return new fos(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fos.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fos.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("1.20.3-pre2");
      if (evh.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fos.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fos.a {
         public a(erh $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fos.a {
      }
   }
}
