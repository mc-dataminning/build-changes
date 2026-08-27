import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record foq(String a, @Nullable foq.a b) {
   public static foq a() {
      return a(null);
   }

   public static foq a(String $$0) {
      return a(new foq.a.b($$0));
   }

   public static foq a(erg $$0) {
      return a(new foq.a.a($$0));
   }

   public static foq a(@Nullable foq.a $$0) {
      return new foq(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof foq.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof foq.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("1.20.3-pre1");
      if (evg.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public foq.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements foq.a {
         public a(erg $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements foq.a {
      }
   }
}
