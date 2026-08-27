import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fqy(String a, @Nullable fqy.a b) {
   public static fqy a() {
      return a(null);
   }

   public static fqy a(String $$0) {
      return a(new fqy.a.b($$0));
   }

   public static fqy a(eth $$0) {
      return a(new fqy.a.a($$0));
   }

   public static fqy a(@Nullable fqy.a $$0) {
      return new fqy(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fqy.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fqy.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("24w03a");
      if (exh.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fqy.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fqy.a {
         public a(eth $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fqy.a {
      }
   }
}
