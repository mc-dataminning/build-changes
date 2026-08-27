import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fok(String a, @Nullable fok.a b) {
   public static fok a() {
      return a(null);
   }

   public static fok a(String $$0) {
      return a(new fok.a.b($$0));
   }

   public static fok a(era $$0) {
      return a(new fok.a.a($$0));
   }

   public static fok a(@Nullable fok.a $$0) {
      return new fok(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fok.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fok.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("23w46a");
      if (eva.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fok.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fok.a {
         public a(era $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fok.a {
      }
   }
}
