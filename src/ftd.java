import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record ftd(String a, @Nullable ftd.a b) {
   public static ftd a() {
      return a(null);
   }

   public static ftd a(String $$0) {
      return a(new ftd.a.b($$0));
   }

   public static ftd a(evg $$0) {
      return a(new ftd.a.a($$0));
   }

   public static ftd a(@Nullable ftd.a $$0) {
      return new ftd(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof ftd.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof ftd.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("24w06a");
      if (ezg.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public ftd.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements ftd.a {
         public a(evg $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements ftd.a {
      }
   }
}
