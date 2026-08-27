import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fpf(String a, @Nullable fpf.a b) {
   public static fpf a() {
      return a(null);
   }

   public static fpf a(String $$0) {
      return a(new fpf.a.b($$0));
   }

   public static fpf a(err $$0) {
      return a(new fpf.a.a($$0));
   }

   public static fpf a(@Nullable fpf.a $$0) {
      return new fpf(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fpf.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fpf.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("23w51b");
      if (evr.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fpf.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fpf.a {
         public a(err $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fpf.a {
      }
   }
}
