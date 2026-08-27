import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fmj(String a, @Nullable fmj.a b) {
   public static fmj a() {
      return a(null);
   }

   public static fmj a(String $$0) {
      return a(new fmj.a.b($$0));
   }

   public static fmj a(epd $$0) {
      return a(new fmj.a.a($$0));
   }

   public static fmj a(@Nullable fmj.a $$0) {
      return new fmj(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fmj.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fmj.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("23w43b");
      if (etd.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fmj.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fmj.a {
         public a(epd $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fmj.a {
      }
   }
}
