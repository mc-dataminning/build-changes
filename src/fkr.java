import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fkr(String a, @Nullable fkr.a b) {
   public static fkr a() {
      return a(null);
   }

   public static fkr a(String $$0) {
      return a(new fkr.a.b($$0));
   }

   public static fkr a(eno $$0) {
      return a(new fkr.a.a($$0));
   }

   public static fkr a(@Nullable fkr.a $$0) {
      return new fkr(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fkr.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fkr.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("23w41a");
      if (ero.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fkr.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fkr.a {
         public a(eno $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fkr.a {
      }
   }
}
