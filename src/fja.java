import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fja(String a, @Nullable fja.a b) {
   public static fja a() {
      return a(null);
   }

   public static fja a(String $$0) {
      return a(new fja.a.b($$0));
   }

   public static fja a(emo $$0) {
      return a(new fja.a.a($$0));
   }

   public static fja a(@Nullable fja.a $$0) {
      return new fja(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fja.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fja.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("23w31a");
      if (eqn.d().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fja.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fja.a {
         public a(emo $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fja.a {
      }
   }
}
