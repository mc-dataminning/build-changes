import com.google.gson.JsonArray;
import com.mojang.logging.LogUtils;
import com.mojang.util.UndashedUuid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhh {
   public static final fhh.b a = Optional.ofNullable(System.getenv("realms.environment"))
      .or(() -> Optional.ofNullable(System.getProperty("realms.environment")))
      .flatMap(fhh.b::a)
      .orElse(fhh.b.a);
   private static final Logger b = LogUtils.getLogger();
   private final String c;
   private final String d;
   private final fmf e;
   private static final String f = "worlds";
   private static final String g = "invites";
   private static final String h = "mco";
   private static final String i = "subscriptions";
   private static final String j = "activities";
   private static final String k = "ops";
   private static final String l = "regions/ping/stat";
   private static final String m = "trial";
   private static final String n = "notifications";
   private static final String o = "/listUserWorldsOfType/any";
   private static final String p = "/$PARENT_WORLD_ID/createPrereleaseRealm";
   private static final String q = "/listPrereleaseEligibleWorlds";
   private static final String r = "/$WORLD_ID/initialize";
   private static final String s = "/$WORLD_ID";
   private static final String t = "/liveplayerlist";
   private static final String u = "/$WORLD_ID";
   private static final String v = "/$WORLD_ID/$PROFILE_UUID";
   private static final String w = "/minigames/$MINIGAME_ID/$WORLD_ID";
   private static final String x = "/available";
   private static final String y = "/templates/$WORLD_TYPE";
   private static final String z = "/v1/$ID/join/pc";
   private static final String A = "/$ID";
   private static final String B = "/$WORLD_ID";
   private static final String C = "/$WORLD_ID/invite/$UUID";
   private static final String D = "/count/pending";
   private static final String E = "/pending";
   private static final String F = "/accept/$INVITATION_ID";
   private static final String G = "/reject/$INVITATION_ID";
   private static final String H = "/$WORLD_ID";
   private static final String I = "/$WORLD_ID";
   private static final String J = "/$WORLD_ID/slot/$SLOT_ID";
   private static final String K = "/$WORLD_ID/open";
   private static final String L = "/$WORLD_ID/close";
   private static final String M = "/$WORLD_ID/reset";
   private static final String N = "/$WORLD_ID";
   private static final String O = "/$WORLD_ID/backups";
   private static final String P = "/$WORLD_ID/slot/$SLOT_ID/download";
   private static final String Q = "/$WORLD_ID/backups/upload";
   private static final String R = "/client/compatible";
   private static final String S = "/tos/agreed";
   private static final String T = "/v1/news";
   private static final String U = "/seen";
   private static final String V = "/dismiss";
   private static final fhz W = new fhz();

   public static fhh a() {
      fmf $$0 = fmf.Q();
      return a($$0);
   }

   public static fhh a(fmf $$0) {
      String $$1 = $$0.X().c();
      String $$2 = $$0.X().a();
      return new fhh($$2, $$1, $$0);
   }

   public fhh(String $$0, String $$1, fmf $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      fhi.a($$2.Z());
   }

   public fik b() throws fjd {
      String $$0 = this.c("worlds");
      if (fhc.b()) {
         $$0 = $$0 + "/listUserWorldsOfType/any";
      }

      String $$1 = this.a(fhk.a($$0));
      return fik.a($$1);
   }

   public List<fii> c() throws fjd {
      String $$0 = this.c("worlds/listPrereleaseEligibleWorlds");
      String $$1 = this.a(fhk.a($$0));
      return fik.a($$1).a;
   }

   public fii a(Long $$0) throws fjd {
      String $$1 = String.valueOf($$0);
      String $$2 = this.c("worlds" + "/$PARENT_WORLD_ID/createPrereleaseRealm".replace("$PARENT_WORLD_ID", $$1));
      return fii.c(this.a(fhk.b($$2, $$1)));
   }

   public List<fih> d() throws fjd {
      String $$0 = this.c("notifications");
      String $$1 = this.a(fhk.a($$0));
      return fih.a($$1);
   }

   private static JsonArray c(List<UUID> $$0) {
      JsonArray $$1 = new JsonArray();

      for (UUID $$2 : $$0) {
         if ($$2 != null) {
            $$1.add($$2.toString());
         }
      }

      return $$1;
   }

   public void a(List<UUID> $$0) throws fjd {
      String $$1 = this.c("notifications/seen");
      this.a(fhk.b($$1, W.a(c($$0))));
   }

   public void b(List<UUID> $$0) throws fjd {
      String $$1 = this.c("notifications/dismiss");
      this.a(fhk.b($$1, W.a(c($$0))));
   }

   public fii a(long $$0) throws fjd {
      String $$1 = this.c("worlds" + "/$ID".replace("$ID", String.valueOf($$0)));
      String $$2 = this.a(fhk.a($$1));
      return fii.c($$2);
   }

   public fit b(long $$0) throws fjd {
      String $$1 = this.c("activities" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fhk.a($$1));
      return fit.a($$2);
   }

   public fil e() throws fjd {
      String $$0 = this.c("activities/liveplayerlist");
      String $$1 = this.a(fhk.a($$0));
      return fil.a($$1);
   }

   public fij c(long $$0) throws fjd {
      String $$1 = this.c("worlds" + "/v1/$ID/join/pc".replace("$ID", $$0 + ""));
      String $$2 = this.a(fhk.a($$1, 5000, 30000));
      return fij.a($$2);
   }

   public void a(long $$0, String $$1, String $$2) throws fjd {
      fif $$3 = new fif($$1, $$2);
      String $$4 = this.c("worlds" + "/$WORLD_ID/initialize".replace("$WORLD_ID", String.valueOf($$0)));
      String $$5 = W.a($$3);
      this.a(fhk.a($$4, $$5, 5000, 10000));
   }

   public boolean f() throws fjd {
      String $$0 = this.c("mco/available");
      String $$1 = this.a(fhk.a($$0));
      return Boolean.parseBoolean($$1);
   }

   public fhh.a g() throws fjd {
      String $$0 = this.c("mco/client/compatible");
      String $$1 = this.a(fhk.a($$0));

      try {
         return fhh.a.valueOf($$1);
      } catch (IllegalArgumentException var5) {
         throw new fjd(fhj.b.a($$1));
      }
   }

   public void a(long $$0, UUID $$1) throws fjd {
      String $$2 = this.c("invites" + "/$WORLD_ID/invite/$UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$UUID", UndashedUuid.toString($$1)));
      this.a(fhk.b($$2));
   }

   public void d(long $$0) throws fjd {
      String $$1 = this.c("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(fhk.b($$1));
   }

   public fii a(long $$0, String $$1) throws fjd {
      fie $$2 = new fie();
      $$2.a($$1);
      String $$3 = this.c("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(fhk.b($$3, W.a($$2)));
      return fii.c($$4);
   }

   public fhy e(long $$0) throws fjd {
      String $$1 = this.c("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fhk.a($$1));
      return fhy.a($$2);
   }

   public void b(long $$0, String $$1, String $$2) throws fjd {
      fif $$3 = new fif($$1, $$2);
      String $$4 = this.c("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(fhk.b($$4, W.a($$3)));
   }

   public void a(long $$0, int $$1, fio $$2) throws fjd {
      String $$3 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$4 = $$2.c();
      this.a(fhk.b($$3, $$4));
   }

   public boolean a(long $$0, int $$1) throws fjd {
      String $$2 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$3 = this.a(fhk.c($$2, ""));
      return Boolean.valueOf($$3);
   }

   public void b(long $$0, String $$1) throws fjd {
      String $$2 = this.a("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf($$0)), "backupId=" + $$1);
      this.a(fhk.b($$2, "", 40000, 600000));
   }

   public fiz a(int $$0, int $$1, fii.d $$2) throws fjd {
      String $$3 = this.a(
         "worlds" + "/templates/$WORLD_TYPE".replace("$WORLD_TYPE", $$2.toString()), String.format(Locale.ROOT, "page=%d&pageSize=%d", $$0, $$1)
      );
      String $$4 = this.a(fhk.a($$3));
      return fiz.a($$4);
   }

   public Boolean c(long $$0, String $$1) throws fjd {
      String $$2 = "/minigames/$MINIGAME_ID/$WORLD_ID".replace("$MINIGAME_ID", $$1).replace("$WORLD_ID", String.valueOf($$0));
      String $$3 = this.c("worlds" + $$2);
      return Boolean.valueOf(this.a(fhk.c($$3, "")));
   }

   public fia b(long $$0, UUID $$1) throws fjd {
      String $$2 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$PROFILE_UUID", UndashedUuid.toString($$1));
      String $$3 = this.c("ops" + $$2);
      return fia.a(this.a(fhk.b($$3, "")));
   }

   public fia c(long $$0, UUID $$1) throws fjd {
      String $$2 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$PROFILE_UUID", UndashedUuid.toString($$1));
      String $$3 = this.c("ops" + $$2);
      return fia.a(this.a(fhk.b($$3)));
   }

   public Boolean f(long $$0) throws fjd {
      String $$1 = this.c("worlds" + "/$WORLD_ID/open".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fhk.c($$1, ""));
      return Boolean.valueOf($$2);
   }

   public Boolean g(long $$0) throws fjd {
      String $$1 = this.c("worlds" + "/$WORLD_ID/close".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fhk.c($$1, ""));
      return Boolean.valueOf($$2);
   }

   public Boolean d(long $$0, String $$1) throws fjd {
      fip $$2 = new fip(null, Long.valueOf($$1), -1, false, Set.of());
      String $$3 = this.c("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(fhk.a($$3, W.a($$2), 30000, 80000));
      return Boolean.valueOf($$4);
   }

   public fiu h(long $$0) throws fjd {
      String $$1 = this.c("subscriptions" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fhk.a($$1));
      return fiu.a($$2);
   }

   public int h() throws fjd {
      return this.i().a.size();
   }

   public fic i() throws fjd {
      String $$0 = this.c("invites/pending");
      String $$1 = this.a(fhk.a($$0));
      fic $$2 = fic.a($$1);
      $$2.a.removeIf(this::a);
      return $$2;
   }

   private boolean a(fib $$0) {
      return this.e.aN().e($$0.d);
   }

   public void a(String $$0) throws fjd {
      String $$1 = this.c("invites" + "/accept/$INVITATION_ID".replace("$INVITATION_ID", $$0));
      this.a(fhk.c($$1, ""));
   }

   public fix b(long $$0, int $$1) throws fjd {
      String $$2 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID/download".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$3 = this.a(fhk.a($$2));
      return fix.a($$3);
   }

   @Nullable
   public fiv i(long $$0) throws fjd {
      String $$1 = this.c("worlds" + "/$WORLD_ID/backups/upload".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = fky.a($$0);
      fiv $$3 = fiv.a(this.a(fhk.c($$1, fiv.b($$2))));
      if ($$3 != null) {
         fky.a($$0, $$3.a());
      }

      return $$3;
   }

   public void b(String $$0) throws fjd {
      String $$1 = this.c("invites" + "/reject/$INVITATION_ID".replace("$INVITATION_ID", $$0));
      this.a(fhk.c($$1, ""));
   }

   public void j() throws fjd {
      String $$0 = this.c("mco/tos/agreed");
      this.a(fhk.b($$0, ""));
   }

   public fig k() throws fjd {
      String $$0 = this.c("mco/v1/news");
      String $$1 = this.a(fhk.a($$0, 5000, 10000));
      return fig.a($$1);
   }

   public void a(fid $$0) throws fjd {
      String $$1 = this.c("regions/ping/stat");
      this.a(fhk.b($$1, W.a($$0)));
   }

   public Boolean l() throws fjd {
      String $$0 = this.c("trial");
      String $$1 = this.a(fhk.a($$0));
      return Boolean.valueOf($$1);
   }

   public void j(long $$0) throws fjd {
      String $$1 = this.c("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(fhk.b($$1));
   }

   private String c(String $$0) {
      return this.a($$0, null);
   }

   private String a(String $$0, @Nullable String $$1) {
      try {
         return new URI(a.e, a.d, "/" + $$0, $$1, null).toASCIIString();
      } catch (URISyntaxException var4) {
         throw new IllegalArgumentException($$0, var4);
      }
   }

   private String a(fhk<?> $$0) throws fjd {
      $$0.a("sid", this.c);
      $$0.a("user", this.d);
      $$0.a("version", ab.b().c());
      $$0.a(fhc.b());

      try {
         int $$1 = $$0.b();
         if ($$1 != 503 && $$1 != 277) {
            String $$3 = $$0.c();
            if ($$1 >= 200 && $$1 < 300) {
               return $$3;
            } else if ($$1 == 401) {
               String $$4 = $$0.c("WWW-Authenticate");
               b.info("Could not authorize you against Realms server: {}", $$4);
               throw new fjd(new fhj.a($$4));
            } else {
               fhj $$5 = fhj.a($$1, $$3);
               throw new fjd($$5);
            }
         } else {
            int $$2 = $$0.a();
            throw new fje($$2, $$1);
         }
      } catch (fjc var5) {
         throw new fjd(fhj.b.a(var5));
      }
   }

   public static enum a {
      a,
      b,
      c;
   }

   public static enum b {
      a("pc.realms.minecraft.net", "https"),
      b("pc-stage.realms.minecraft.net", "https"),
      c("localhost:8080", "http");

      public final String d;
      public final String e;

      private b(final String $$0, final String $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public static Optional<fhh.b> a(String $$0) {
         String var1 = $$0.toLowerCase(Locale.ROOT);

         return switch (var1) {
            case "production" -> Optional.of(a);
            case "local" -> Optional.of(c);
            case "stage", "staging" -> Optional.of(b);
            default -> Optional.empty();
         };
      }
   }
}
