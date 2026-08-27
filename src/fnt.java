import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import javax.annotation.Nullable;

public record fnt(String a, @Nullable fnt.a b) {
   public static fnt a() {
      return a(null);
   }

   public static fnt a(String $$0) {
      return a(new fnt.a.b($$0));
   }

   public static fnt a(eqk $$0) {
      return a(new fnt.a.a($$0));
   }

   public static fnt a(@Nullable fnt.a $$0) {
      return new fnt(g(), $$0);
   }

   public ClientInfo b() {
      return new ClientInfo(this.a, Locale.getDefault().toLanguageTag());
   }

   @Nullable
   public ThirdPartyServerInfo c() {
      return this.b instanceof fnt.a.b $$0 ? new ThirdPartyServerInfo($$0.a) : null;
   }

   @Nullable
   public RealmInfo d() {
      return this.b instanceof fnt.a.a $$0 ? new RealmInfo(String.valueOf($$0.a()), $$0.b()) : null;
   }

   private static String g() {
      StringBuilder $$0 = new StringBuilder();
      $$0.append("23w45a");
      if (euk.e().a()) {
         $$0.append(" (modded)");
      }

      return $$0.toString();
   }

   public String e() {
      return this.a;
   }

   @Nullable
   public fnt.a f() {
      return this.b;
   }

   public interface a {
      public static record a(long a, int b) implements fnt.a {
         public a(eqk $$0) {
            this($$0.a, $$0.n);
         }
      }

      public static record b(String a) implements fnt.a {
      }
   }
}
