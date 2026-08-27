import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record flw(String a, @Nullable flw.a b) {
   public static flw a() {
      return a(null);
   }

   public static flw a(String $$0) {
      return a(new flw.a.b($$0));
   }

   public static flw a(eor $$0) {
      return a(new flw.a.a($$0));
   }

   public static flw a(@Nullable flw.a $$0) {
      return new flw(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof flw.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof flw.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("23w42a");
      if (esr.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public flw.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements flw.a {
         public a(eor $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements flw.a {
      }
   }
}
