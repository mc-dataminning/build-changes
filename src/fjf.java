import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fjf(String a, @Nullable fjf.a b) {
   public static fjf a() {
      return a(null);
   }

   public static fjf a(String $$0) {
      return a(new fjf.a.b($$0));
   }

   public static fjf a(emn $$0) {
      return a(new fjf.a.a($$0));
   }

   public static fjf a(@Nullable fjf.a $$0) {
      return new fjf(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fjf.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fjf.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("23w32a");
      if (eqm.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fjf.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fjf.a {
         public a(emn $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fjf.a {
      }
   }
}
