import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fjm(String a, @Nullable fjm.a b) {
   public static fjm a() {
      return a(null);
   }

   public static fjm a(String $$0) {
      return a(new fjm.a.b($$0));
   }

   public static fjm a(emm $$0) {
      return a(new fjm.a.a($$0));
   }

   public static fjm a(@Nullable fjm.a $$0) {
      return new fjm(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fjm.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fjm.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("23w33a");
      if (eql.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fjm.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fjm.a {
         public a(emm $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fjm.a {
      }
   }
}
