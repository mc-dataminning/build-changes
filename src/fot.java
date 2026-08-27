import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fot(String a, @Nullable fot.a b) {
   public static fot a() {
      return a(null);
   }

   public static fot a(String $$0) {
      return a(new fot.a.b($$0));
   }

   public static fot a(eri $$0) {
      return a(new fot.a.a($$0));
   }

   public static fot a(@Nullable fot.a $$0) {
      return new fot(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fot.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fot.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("1.20.4-rc1");
      if (evi.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fot.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fot.a {
         public a(eri $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fot.a {
      }
   }
}
