import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fsd(String a, @Nullable fsd.a b) {
   public static fsd a() {
      return a(null);
   }

   public static fsd a(String $$0) {
      return a(new fsd.a.b($$0));
   }

   public static fsd a(euk $$0) {
      return a(new fsd.a.a($$0));
   }

   public static fsd a(@Nullable fsd.a $$0) {
      return new fsd(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fsd.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fsd.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("24w04a");
      if (eyk.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fsd.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fsd.a {
         public a(euk $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fsd.a {
      }
   }
}
