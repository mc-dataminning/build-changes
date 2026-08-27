import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fjs(String a, @Nullable fjs.a b) {
   public static fjs a() {
      return a(null);
   }

   public static fjs a(String $$0) {
      return a(new fjs.a.b($$0));
   }

   public static fjs a(emq $$0) {
      return a(new fjs.a.a($$0));
   }

   public static fjs a(@Nullable fjs.a $$0) {
      return new fjs(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fjs.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fjs.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("23w40a");
      if (eqp.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fjs.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fjs.a {
         public a(emq $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fjs.a {
      }
   }
}
