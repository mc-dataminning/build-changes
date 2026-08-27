import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record frg(String a, @Nullable frg.a b) {
   public static frg a() {
      return a(null);
   }

   public static frg a(String $$0) {
      return a(new frg.a.b($$0));
   }

   public static frg a(eto $$0) {
      return a(new frg.a.a($$0));
   }

   public static frg a(@Nullable frg.a $$0) {
      return new frg(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof frg.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof frg.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("24w04a");
      if (exo.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public frg.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements frg.a {
         public a(eto $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements frg.a {
      }
   }
}
