import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record ffq(String a, @Nullable ffq.a b) {
   public static ffq a() {
      return a(null);
   }

   public static ffq a(String $$0) {
      return a(new ffq.a.b($$0));
   }

   public static ffq a(ejq $$0) {
      return a(new ffq.a.a($$0));
   }

   public static ffq a(@Nullable ffq.a $$0) {
      return new ffq(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof ffq.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof ffq.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("1.20.1-rc1");
      if (enn.d().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public ffq.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements ffq.a {
         public a(ejq $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements ffq.a {
      }
   }
}
