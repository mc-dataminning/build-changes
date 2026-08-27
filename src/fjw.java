import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fjw(String a, @Nullable fjw.a b) {
   public static fjw a() {
      return a(null);
   }

   public static fjw a(String $$0) {
      return a(new fjw.a.b($$0));
   }

   public static fjw a(emw $$0) {
      return a(new fjw.a.a($$0));
   }

   public static fjw a(@Nullable fjw.a $$0) {
      return new fjw(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fjw.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fjw.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("1.20.2-rc2");
      if (eqv.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fjw.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fjw.a {
         public a(emw $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fjw.a {
      }
   }
}
