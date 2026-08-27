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

public class eyd {
   public static final eyd.b a = Optional.ofNullable(System.getenv("realms.environment"))
      .or(() -> Optional.ofNullable(System.getProperty("realms.environment")))
      .flatMap(eyd.b::a)
      .orElse(eyd.b.a);
   private static final Logger b = LogUtils.getLogger();
   private final String c;
   private final String d;
   private final fcu e;
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
   private static final eyl W = new eyl();

   public static eyd a() {
      fcu $$0 = fcu.Q();
      return a($$0);
   }

   public static eyd a(fcu $$0) {
      String $$1 = $$0.X().c();
      String $$2 = $$0.X().a();
      return new eyd($$2, $$1, $$0);
   }

   public eyd(String $$0, String $$1, fcu $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      eye.a($$2.Z());
   }

   public eyw b() throws ezq {
      String $$0 = this.c("worlds");
      if (exy.b()) {
         $$0 = $$0 + "/listUserWorldsOfType/any";
      }

      String $$1 = this.a(eyg.a($$0));
      return eyw.a($$1);
   }

   public List<eyu> c() throws ezq {
      String $$0 = this.c("worlds/listPrereleaseEligibleWorlds");
      String $$1 = this.a(eyg.a($$0));
      return eyw.a($$1).a;
   }

   public eyu a(Long $$0) throws ezq {
      String $$1 = String.valueOf($$0);
      String $$2 = this.c("worlds" + "/$PARENT_WORLD_ID/createPrereleaseRealm".replace("$PARENT_WORLD_ID", $$1));
      return eyu.c(this.a(eyg.b($$2, $$1)));
   }

   public List<eyt> d() throws ezq {
      String $$0 = this.c("notifications");
      String $$1 = this.a(eyg.a($$0));
      return eyt.a($$1);
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

   public void a(List<UUID> $$0) throws ezq {
      String $$1 = this.c("notifications/seen");
      this.a(eyg.b($$1, W.a(c($$0))));
   }

   public void b(List<UUID> $$0) throws ezq {
      String $$1 = this.c("notifications/dismiss");
      this.a(eyg.b($$1, W.a(c($$0))));
   }

   public eyu a(long $$0) throws ezq {
      String $$1 = this.c("worlds" + "/$ID".replace("$ID", String.valueOf($$0)));
      String $$2 = this.a(eyg.a($$1));
      return eyu.c($$2);
   }

   public ezg b(long $$0) throws ezq {
      String $$1 = this.c("activities" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(eyg.a($$1));
      return ezg.a($$2);
   }

   public eyz e() throws ezq {
      String $$0 = this.c("activities/liveplayerlist");
      String $$1 = this.a(eyg.a($$0));
      return eyz.a($$1);
   }

   public eyv c(long $$0) throws ezq {
      String $$1 = this.c("worlds" + "/v1/$ID/join/pc".replace("$ID", $$0 + ""));
      String $$2 = this.a(eyg.a($$1, 5000, 30000));
      return eyv.a($$2);
   }

   public void a(long $$0, String $$1, String $$2) throws ezq {
      eyr $$3 = new eyr($$1, $$2);
      String $$4 = this.c("worlds" + "/$WORLD_ID/initialize".replace("$WORLD_ID", String.valueOf($$0)));
      String $$5 = W.a($$3);
      this.a(eyg.a($$4, $$5, 5000, 10000));
   }

   public boolean f() throws ezq {
      String $$0 = this.c("mco/available");
      String $$1 = this.a(eyg.a($$0));
      return Boolean.parseBoolean($$1);
   }

   public eyd.a g() throws ezq {
      String $$0 = this.c("mco/client/compatible");
      String $$1 = this.a(eyg.a($$0));

      try {
         return eyd.a.valueOf($$1);
      } catch (IllegalArgumentException var5) {
         throw new ezq(eyf.b.a($$1));
      }
   }

   public void a(long $$0, UUID $$1) throws ezq {
      String $$2 = this.c("invites" + "/$WORLD_ID/invite/$UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$UUID", UndashedUuid.toString($$1)));
      this.a(eyg.b($$2));
   }

   public void d(long $$0) throws ezq {
      String $$1 = this.c("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(eyg.b($$1));
   }

   public eyu a(long $$0, String $$1) throws ezq {
      eyq $$2 = new eyq();
      $$2.a($$1);
      String $$3 = this.c("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(eyg.b($$3, W.a($$2)));
      return eyu.c($$4);
   }

   public eyk e(long $$0) throws ezq {
      String $$1 = this.c("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(eyg.a($$1));
      return eyk.a($$2);
   }

   public void b(long $$0, String $$1, String $$2) throws ezq {
      eyr $$3 = new eyr($$1, $$2);
      String $$4 = this.c("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(eyg.b($$4, W.a($$3)));
   }

   public void a(long $$0, int $$1, ezb $$2) throws ezq {
      String $$3 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$4 = $$2.c();
      this.a(eyg.b($$3, $$4));
   }

   public boolean a(long $$0, int $$1) throws ezq {
      String $$2 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$3 = this.a(eyg.c($$2, ""));
      return Boolean.valueOf($$3);
   }

   public void b(long $$0, String $$1) throws ezq {
      String $$2 = this.a("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf($$0)), "backupId=" + $$1);
      this.a(eyg.b($$2, "", 40000, 600000));
   }

   public ezm a(int $$0, int $$1, eyu.d $$2) throws ezq {
      String $$3 = this.a(
         "worlds" + "/templates/$WORLD_TYPE".replace("$WORLD_TYPE", $$2.toString()), String.format(Locale.ROOT, "page=%d&pageSize=%d", $$0, $$1)
      );
      String $$4 = this.a(eyg.a($$3));
      return ezm.a($$4);
   }

   public Boolean c(long $$0, String $$1) throws ezq {
      String $$2 = "/minigames/$MINIGAME_ID/$WORLD_ID".replace("$MINIGAME_ID", $$1).replace("$WORLD_ID", String.valueOf($$0));
      String $$3 = this.c("worlds" + $$2);
      return Boolean.valueOf(this.a(eyg.c($$3, "")));
   }

   public eym b(long $$0, UUID $$1) throws ezq {
      String $$2 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$PROFILE_UUID", UndashedUuid.toString($$1));
      String $$3 = this.c("ops" + $$2);
      return eym.a(this.a(eyg.b($$3, "")));
   }

   public eym c(long $$0, UUID $$1) throws ezq {
      String $$2 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$PROFILE_UUID", UndashedUuid.toString($$1));
      String $$3 = this.c("ops" + $$2);
      return eym.a(this.a(eyg.b($$3)));
   }

   public Boolean f(long $$0) throws ezq {
      String $$1 = this.c("worlds" + "/$WORLD_ID/open".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(eyg.c($$1, ""));
      return Boolean.valueOf($$2);
   }

   public Boolean g(long $$0) throws ezq {
      String $$1 = this.c("worlds" + "/$WORLD_ID/close".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(eyg.c($$1, ""));
      return Boolean.valueOf($$2);
   }

   public Boolean a(long $$0, fbn $$1) throws ezq {
      ezc $$2 = new ezc($$1.a(), -1L, $$1.b().b(), $$1.c(), $$1.d());
      String $$3 = this.c("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(eyg.a($$3, W.a($$2), 30000, 80000));
      return Boolean.valueOf($$4);
   }

   public Boolean d(long $$0, String $$1) throws ezq {
      ezc $$2 = new ezc(null, Long.valueOf($$1), -1, false, Set.of());
      String $$3 = this.c("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(eyg.a($$3, W.a($$2), 30000, 80000));
      return Boolean.valueOf($$4);
   }

   public ezh h(long $$0) throws ezq {
      String $$1 = this.c("subscriptions" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(eyg.a($$1));
      return ezh.a($$2);
   }

   public int h() throws ezq {
      return this.i().a.size();
   }

   public eyo i() throws ezq {
      String $$0 = this.c("invites/pending");
      String $$1 = this.a(eyg.a($$0));
      eyo $$2 = eyo.a($$1);
      $$2.a.removeIf(this::a);
      return $$2;
   }

   private boolean a(eyn $$0) {
      return this.e.aM().e($$0.d);
   }

   public void a(String $$0) throws ezq {
      String $$1 = this.c("invites" + "/accept/$INVITATION_ID".replace("$INVITATION_ID", $$0));
      this.a(eyg.c($$1, ""));
   }

   public ezk b(long $$0, int $$1) throws ezq {
      String $$2 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID/download".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$3 = this.a(eyg.a($$2));
      return ezk.a($$3);
   }

   @Nullable
   public ezi e(long $$0, @Nullable String $$1) throws ezq {
      String $$2 = this.c("worlds" + "/$WORLD_ID/backups/upload".replace("$WORLD_ID", String.valueOf($$0)));
      return ezi.a(this.a(eyg.c($$2, ezi.b($$1))));
   }

   public void b(String $$0) throws ezq {
      String $$1 = this.c("invites" + "/reject/$INVITATION_ID".replace("$INVITATION_ID", $$0));
      this.a(eyg.c($$1, ""));
   }

   public void j() throws ezq {
      String $$0 = this.c("mco/tos/agreed");
      this.a(eyg.b($$0, ""));
   }

   public eys k() throws ezq {
      String $$0 = this.c("mco/v1/news");
      String $$1 = this.a(eyg.a($$0, 5000, 10000));
      return eys.a($$1);
   }

   public void a(eyp $$0) throws ezq {
      String $$1 = this.c("regions/ping/stat");
      this.a(eyg.b($$1, W.a($$0)));
   }

   public Boolean l() throws ezq {
      String $$0 = this.c("trial");
      String $$1 = this.a(eyg.a($$0));
      return Boolean.valueOf($$1);
   }

   public void i(long $$0) throws ezq {
      String $$1 = this.c("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(eyg.b($$1));
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

   private String a(eyg<?> $$0) throws ezq {
      $$0.a("sid", this.c);
      $$0.a("user", this.d);
      $$0.a("version", aa.b().c());
      $$0.a(exy.b());

      try {
         int $$1 = $$0.b();
         if ($$1 != 503 && $$1 != 277) {
            String $$3 = $$0.c();
            if ($$1 >= 200 && $$1 < 300) {
               return $$3;
            } else if ($$1 == 401) {
               String $$4 = $$0.c("WWW-Authenticate");
               b.info("Could not authorize you against Realms server: {}", $$4);
               throw new ezq(new eyf.a($$4));
            } else {
               eyf $$5 = eyf.a($$1, $$3);
               throw new ezq($$5);
            }
         } else {
            int $$2 = $$0.a();
            throw new ezr($$2, $$1);
         }
      } catch (ezp var5) {
         throw new ezq(eyf.b.a(var5));
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

      private b(String $$0, String $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public static Optional<eyd.b> a(String $$0) {
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
