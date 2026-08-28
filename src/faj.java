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

public class faj {
   public static final faj.b a = Optional.ofNullable(System.getenv("realms.environment"))
      .or(() -> Optional.ofNullable(System.getProperty("realms.environment")))
      .flatMap(faj.b::a)
      .orElse(faj.b.a);
   private static final Logger b = LogUtils.getLogger();
   private final String c;
   private final String d;
   private final ffa e;
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
   private static final far W = new far();

   public static faj a() {
      ffa $$0 = ffa.Q();
      return a($$0);
   }

   public static faj a(ffa $$0) {
      String $$1 = $$0.X().c();
      String $$2 = $$0.X().a();
      return new faj($$2, $$1, $$0);
   }

   public faj(String $$0, String $$1, ffa $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      fak.a($$2.Z());
   }

   public fbc b() throws fbw {
      String $$0 = this.c("worlds");
      if (fae.b()) {
         $$0 = $$0 + "/listUserWorldsOfType/any";
      }

      String $$1 = this.a(fam.a($$0));
      return fbc.a($$1);
   }

   public List<fba> c() throws fbw {
      String $$0 = this.c("worlds/listPrereleaseEligibleWorlds");
      String $$1 = this.a(fam.a($$0));
      return fbc.a($$1).a;
   }

   public fba a(Long $$0) throws fbw {
      String $$1 = String.valueOf($$0);
      String $$2 = this.c("worlds" + "/$PARENT_WORLD_ID/createPrereleaseRealm".replace("$PARENT_WORLD_ID", $$1));
      return fba.c(this.a(fam.b($$2, $$1)));
   }

   public List<faz> d() throws fbw {
      String $$0 = this.c("notifications");
      String $$1 = this.a(fam.a($$0));
      return faz.a($$1);
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

   public void a(List<UUID> $$0) throws fbw {
      String $$1 = this.c("notifications/seen");
      this.a(fam.b($$1, W.a(c($$0))));
   }

   public void b(List<UUID> $$0) throws fbw {
      String $$1 = this.c("notifications/dismiss");
      this.a(fam.b($$1, W.a(c($$0))));
   }

   public fba a(long $$0) throws fbw {
      String $$1 = this.c("worlds" + "/$ID".replace("$ID", String.valueOf($$0)));
      String $$2 = this.a(fam.a($$1));
      return fba.c($$2);
   }

   public fbm b(long $$0) throws fbw {
      String $$1 = this.c("activities" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fam.a($$1));
      return fbm.a($$2);
   }

   public fbf e() throws fbw {
      String $$0 = this.c("activities/liveplayerlist");
      String $$1 = this.a(fam.a($$0));
      return fbf.a($$1);
   }

   public fbb c(long $$0) throws fbw {
      String $$1 = this.c("worlds" + "/v1/$ID/join/pc".replace("$ID", $$0 + ""));
      String $$2 = this.a(fam.a($$1, 5000, 30000));
      return fbb.a($$2);
   }

   public void a(long $$0, String $$1, String $$2) throws fbw {
      fax $$3 = new fax($$1, $$2);
      String $$4 = this.c("worlds" + "/$WORLD_ID/initialize".replace("$WORLD_ID", String.valueOf($$0)));
      String $$5 = W.a($$3);
      this.a(fam.a($$4, $$5, 5000, 10000));
   }

   public boolean f() throws fbw {
      String $$0 = this.c("mco/available");
      String $$1 = this.a(fam.a($$0));
      return Boolean.parseBoolean($$1);
   }

   public faj.a g() throws fbw {
      String $$0 = this.c("mco/client/compatible");
      String $$1 = this.a(fam.a($$0));

      try {
         return faj.a.valueOf($$1);
      } catch (IllegalArgumentException var5) {
         throw new fbw(fal.b.a($$1));
      }
   }

   public void a(long $$0, UUID $$1) throws fbw {
      String $$2 = this.c("invites" + "/$WORLD_ID/invite/$UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$UUID", UndashedUuid.toString($$1)));
      this.a(fam.b($$2));
   }

   public void d(long $$0) throws fbw {
      String $$1 = this.c("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(fam.b($$1));
   }

   public fba a(long $$0, String $$1) throws fbw {
      faw $$2 = new faw();
      $$2.a($$1);
      String $$3 = this.c("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(fam.b($$3, W.a($$2)));
      return fba.c($$4);
   }

   public faq e(long $$0) throws fbw {
      String $$1 = this.c("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fam.a($$1));
      return faq.a($$2);
   }

   public void b(long $$0, String $$1, String $$2) throws fbw {
      fax $$3 = new fax($$1, $$2);
      String $$4 = this.c("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(fam.b($$4, W.a($$3)));
   }

   public void a(long $$0, int $$1, fbh $$2) throws fbw {
      String $$3 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$4 = $$2.c();
      this.a(fam.b($$3, $$4));
   }

   public boolean a(long $$0, int $$1) throws fbw {
      String $$2 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$3 = this.a(fam.c($$2, ""));
      return Boolean.valueOf($$3);
   }

   public void b(long $$0, String $$1) throws fbw {
      String $$2 = this.a("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf($$0)), "backupId=" + $$1);
      this.a(fam.b($$2, "", 40000, 600000));
   }

   public fbs a(int $$0, int $$1, fba.d $$2) throws fbw {
      String $$3 = this.a(
         "worlds" + "/templates/$WORLD_TYPE".replace("$WORLD_TYPE", $$2.toString()), String.format(Locale.ROOT, "page=%d&pageSize=%d", $$0, $$1)
      );
      String $$4 = this.a(fam.a($$3));
      return fbs.a($$4);
   }

   public Boolean c(long $$0, String $$1) throws fbw {
      String $$2 = "/minigames/$MINIGAME_ID/$WORLD_ID".replace("$MINIGAME_ID", $$1).replace("$WORLD_ID", String.valueOf($$0));
      String $$3 = this.c("worlds" + $$2);
      return Boolean.valueOf(this.a(fam.c($$3, "")));
   }

   public fas b(long $$0, UUID $$1) throws fbw {
      String $$2 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$PROFILE_UUID", UndashedUuid.toString($$1));
      String $$3 = this.c("ops" + $$2);
      return fas.a(this.a(fam.b($$3, "")));
   }

   public fas c(long $$0, UUID $$1) throws fbw {
      String $$2 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$PROFILE_UUID", UndashedUuid.toString($$1));
      String $$3 = this.c("ops" + $$2);
      return fas.a(this.a(fam.b($$3)));
   }

   public Boolean f(long $$0) throws fbw {
      String $$1 = this.c("worlds" + "/$WORLD_ID/open".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fam.c($$1, ""));
      return Boolean.valueOf($$2);
   }

   public Boolean g(long $$0) throws fbw {
      String $$1 = this.c("worlds" + "/$WORLD_ID/close".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fam.c($$1, ""));
      return Boolean.valueOf($$2);
   }

   public Boolean a(long $$0, fdt $$1) throws fbw {
      fbi $$2 = new fbi($$1.a(), -1L, $$1.b().b(), $$1.c(), $$1.d());
      String $$3 = this.c("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(fam.a($$3, W.a($$2), 30000, 80000));
      return Boolean.valueOf($$4);
   }

   public Boolean d(long $$0, String $$1) throws fbw {
      fbi $$2 = new fbi(null, Long.valueOf($$1), -1, false, Set.of());
      String $$3 = this.c("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(fam.a($$3, W.a($$2), 30000, 80000));
      return Boolean.valueOf($$4);
   }

   public fbn h(long $$0) throws fbw {
      String $$1 = this.c("subscriptions" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fam.a($$1));
      return fbn.a($$2);
   }

   public int h() throws fbw {
      return this.i().a.size();
   }

   public fau i() throws fbw {
      String $$0 = this.c("invites/pending");
      String $$1 = this.a(fam.a($$0));
      fau $$2 = fau.a($$1);
      $$2.a.removeIf(this::a);
      return $$2;
   }

   private boolean a(fat $$0) {
      return this.e.aM().e($$0.d);
   }

   public void a(String $$0) throws fbw {
      String $$1 = this.c("invites" + "/accept/$INVITATION_ID".replace("$INVITATION_ID", $$0));
      this.a(fam.c($$1, ""));
   }

   public fbq b(long $$0, int $$1) throws fbw {
      String $$2 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID/download".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$3 = this.a(fam.a($$2));
      return fbq.a($$3);
   }

   @Nullable
   public fbo e(long $$0, @Nullable String $$1) throws fbw {
      String $$2 = this.c("worlds" + "/$WORLD_ID/backups/upload".replace("$WORLD_ID", String.valueOf($$0)));
      return fbo.a(this.a(fam.c($$2, fbo.b($$1))));
   }

   public void b(String $$0) throws fbw {
      String $$1 = this.c("invites" + "/reject/$INVITATION_ID".replace("$INVITATION_ID", $$0));
      this.a(fam.c($$1, ""));
   }

   public void j() throws fbw {
      String $$0 = this.c("mco/tos/agreed");
      this.a(fam.b($$0, ""));
   }

   public fay k() throws fbw {
      String $$0 = this.c("mco/v1/news");
      String $$1 = this.a(fam.a($$0, 5000, 10000));
      return fay.a($$1);
   }

   public void a(fav $$0) throws fbw {
      String $$1 = this.c("regions/ping/stat");
      this.a(fam.b($$1, W.a($$0)));
   }

   public Boolean l() throws fbw {
      String $$0 = this.c("trial");
      String $$1 = this.a(fam.a($$0));
      return Boolean.valueOf($$1);
   }

   public void i(long $$0) throws fbw {
      String $$1 = this.c("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(fam.b($$1));
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

   private String a(fam<?> $$0) throws fbw {
      $$0.a("sid", this.c);
      $$0.a("user", this.d);
      $$0.a("version", aa.b().c());
      $$0.a(fae.b());

      try {
         int $$1 = $$0.b();
         if ($$1 != 503 && $$1 != 277) {
            String $$3 = $$0.c();
            if ($$1 >= 200 && $$1 < 300) {
               return $$3;
            } else if ($$1 == 401) {
               String $$4 = $$0.c("WWW-Authenticate");
               b.info("Could not authorize you against Realms server: {}", $$4);
               throw new fbw(new fal.a($$4));
            } else {
               fal $$5 = fal.a($$1, $$3);
               throw new fbw($$5);
            }
         } else {
            int $$2 = $$0.a();
            throw new fbx($$2, $$1);
         }
      } catch (fbv var5) {
         throw new fbw(fal.b.a(var5));
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

      public static Optional<faj.b> a(String $$0) {
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
