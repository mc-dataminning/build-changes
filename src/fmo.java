import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fmo(String a, @Nullable fmo.a b) {
   public static fmo a() {
      return a(null);
   }

   public static fmo a(String $$0) {
      return a(new fmo.a.b($$0));
   }

   public static fmo a(epi $$0) {
      return a(new fmo.a.a($$0));
   }

   public static fmo a(@Nullable fmo.a $$0) {
      return new fmo(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fmo.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fmo.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("23w44a");
      if (eti.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fmo.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fmo.a {
         public a(epi $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fmo.a {
      }
   }
}
