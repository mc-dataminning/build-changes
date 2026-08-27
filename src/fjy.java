import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fjy(String a, @Nullable fjy.a b) {
   public static fjy a() {
      return a(null);
   }

   public static fjy a(String $$0) {
      return a(new fjy.a.b($$0));
   }

   public static fjy a(emy $$0) {
      return a(new fjy.a.a($$0));
   }

   public static fjy a(@Nullable fjy.a $$0) {
      return new fjy(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fjy.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fjy.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("1.20.2-pre3");
      if (eqx.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fjy.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fjy.a {
         public a(emy $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fjy.a {
      }
   }
}
