import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record ftf(String a, @Nullable ftf.a b) {
   public static ftf a() {
      return a(null);
   }

   public static ftf a(String $$0) {
      return a(new ftf.a.b($$0));
   }

   public static ftf a(evi $$0) {
      return a(new ftf.a.a($$0));
   }

   public static ftf a(@Nullable ftf.a $$0) {
      return new ftf(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof ftf.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof ftf.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("24w07a");
      if (ezi.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public ftf.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements ftf.a {
         public a(evi $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements ftf.a {
      }
   }
}
