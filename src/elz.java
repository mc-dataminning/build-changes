import com.google.gson.JsonArray;
import com.mojang.logging.LogUtils;
import com.mojang.util.UndashedUuid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class elz {
   public static final elz.b a = Optional.ofNullable(System.getenv("realms.environment"))
      .or(() -> Optional.ofNullable(System.getProperty("realms.environment")))
      .flatMap(elz.b::a)
      .orElse(elz.b.a);
   private static final Logger b = LogUtils.getLogger();
   private final String c;
   private final String d;
   private final eqp e;
   private static final String f = "worlds";
   private static final String g = "invites";
   private static final String h = "mco";
   private static final String i = "subscriptions";
   private static final String j = "activities";
   private static final String k = "ops";
   private static final String l = "regions/ping/stat";
   private static final String m = "trial";
   private static final String n = "notifications";
   private static final String o = "/$WORLD_ID/initialize";
   private static final String p = "/$WORLD_ID";
   private static final String q = "/liveplayerlist";
   private static final String r = "/$WORLD_ID";
   private static final String s = "/$WORLD_ID/$PROFILE_UUID";
   private static final String t = "/minigames/$MINIGAME_ID/$WORLD_ID";
   private static final String u = "/available";
   private static final String v = "/templates/$WORLD_TYPE";
   private static final String w = "/v1/$ID/join/pc";
   private static final String x = "/$ID";
   private static final String y = "/$WORLD_ID";
   private static final String z = "/$WORLD_ID/invite/$UUID";
   private static final String A = "/count/pending";
   private static final String B = "/pending";
   private static final String C = "/accept/$INVITATION_ID";
   private static final String D = "/reject/$INVITATION_ID";
   private static final String E = "/$WORLD_ID";
   private static final String F = "/$WORLD_ID";
   private static final String G = "/$WORLD_ID/slot/$SLOT_ID";
   private static final String H = "/$WORLD_ID/open";
   private static final String I = "/$WORLD_ID/close";
   private static final String J = "/$WORLD_ID/reset";
   private static final String K = "/$WORLD_ID";
   private static final String L = "/$WORLD_ID/backups";
   private static final String M = "/$WORLD_ID/slot/$SLOT_ID/download";
   private static final String N = "/$WORLD_ID/backups/upload";
   private static final String O = "/client/compatible";
   private static final String P = "/tos/agreed";
   private static final String Q = "/v1/news";
   private static final String R = "/seen";
   private static final String S = "/dismiss";
   private static final emh T = new emh();

   public static elz a() {
      eqp $$0 = eqp.O();
      return a($$0);
   }

   public static elz a(eqp $$0) {
      String $$1 = $$0.V().c();
      String $$2 = $$0.V().a();
      return new elz($$2, $$1, $$0);
   }

   public elz(String $$0, String $$1, eqp $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      ema.a($$2.X());
   }

   public ems b() throws enm {
      String $$0 = this.c("worlds");
      String $$1 = this.a(emc.a($$0));
      return ems.a($$1);
   }

   public List<emp> c() throws enm {
      String $$0 = this.c("notifications");
      String $$1 = this.a(emc.a($$0));
      return emp.a($$1);
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

   public void a(List<UUID> $$0) throws enm {
      String $$1 = this.c("notifications/seen");
      this.a(emc.c($$1, T.a(c($$0))));
   }

   public void b(List<UUID> $$0) throws enm {
      String $$1 = this.c("notifications/dismiss");
      this.a(emc.c($$1, T.a(c($$0))));
   }

   public emq a(long $$0) throws enm {
      String $$1 = this.c("worlds" + "/$ID".replace("$ID", String.valueOf($$0)));
      String $$2 = this.a(emc.a($$1));
      return emq.c($$2);
   }

   public enc b(long $$0) throws enm {
      String $$1 = this.c("activities" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(emc.a($$1));
      return enc.a($$2);
   }

   public emv d() throws enm {
      String $$0 = this.c("activities/liveplayerlist");
      String $$1 = this.a(emc.a($$0));
      return emv.a($$1);
   }

   public emr c(long $$0) throws enm {
      String $$1 = this.c("worlds" + "/v1/$ID/join/pc".replace("$ID", $$0 + ""));
      String $$2 = this.a(emc.a($$1, 5000, 30000));
      return emr.a($$2);
   }

   public void a(long $$0, String $$1, String $$2) throws enm {
      emn $$3 = new emn($$1, $$2);
      String $$4 = this.c("worlds" + "/$WORLD_ID/initialize".replace("$WORLD_ID", String.valueOf($$0)));
      String $$5 = T.a($$3);
      this.a(emc.a($$4, $$5, 5000, 10000));
   }

   public boolean e() throws enm {
      String $$0 = this.c("mco/available");
      String $$1 = this.a(emc.a($$0));
      return Boolean.parseBoolean($$1);
   }

   public elz.a f() throws enm {
      String $$0 = this.c("mco/client/compatible");
      String $$1 = this.a(emc.a($$0));

      try {
         return elz.a.valueOf($$1);
      } catch (IllegalArgumentException var5) {
         throw new enm(emb.b.a($$1));
      }
   }

   public void a(long $$0, UUID $$1) throws enm {
      String $$2 = this.c("invites" + "/$WORLD_ID/invite/$UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$UUID", UndashedUuid.toString($$1)));
      this.a(emc.b($$2));
   }

   public void d(long $$0) throws enm {
      String $$1 = this.c("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(emc.b($$1));
   }

   public emq a(long $$0, String $$1) throws enm {
      emm $$2 = new emm();
      $$2.a($$1);
      String $$3 = this.c("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(emc.c($$3, T.a($$2)));
      return emq.c($$4);
   }

   public emg e(long $$0) throws enm {
      String $$1 = this.c("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(emc.a($$1));
      return emg.a($$2);
   }

   public void b(long $$0, String $$1, String $$2) throws enm {
      emn $$3 = new emn($$1, $$2);
      String $$4 = this.c("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(emc.c($$4, T.a($$3)));
   }

   public void a(long $$0, int $$1, emx $$2) throws enm {
      String $$3 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$4 = $$2.c();
      this.a(emc.c($$3, $$4));
   }

   public boolean a(long $$0, int $$1) throws enm {
      String $$2 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$3 = this.a(emc.d($$2, ""));
      return Boolean.valueOf($$3);
   }

   public void b(long $$0, String $$1) throws enm {
      String $$2 = this.a("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf($$0)), "backupId=" + $$1);
      this.a(emc.b($$2, "", 40000, 600000));
   }

   public eni a(int $$0, int $$1, emq.c $$2) throws enm {
      String $$3 = this.a(
         "worlds" + "/templates/$WORLD_TYPE".replace("$WORLD_TYPE", $$2.toString()), String.format(Locale.ROOT, "page=%d&pageSize=%d", $$0, $$1)
      );
      String $$4 = this.a(emc.a($$3));
      return eni.a($$4);
   }

   public Boolean c(long $$0, String $$1) throws enm {
      String $$2 = "/minigames/$MINIGAME_ID/$WORLD_ID".replace("$MINIGAME_ID", $$1).replace("$WORLD_ID", String.valueOf($$0));
      String $$3 = this.c("worlds" + $$2);
      return Boolean.valueOf(this.a(emc.d($$3, "")));
   }

   public emi b(long $$0, UUID $$1) throws enm {
      String $$2 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$PROFILE_UUID", UndashedUuid.toString($$1));
      String $$3 = this.c("ops" + $$2);
      return emi.a(this.a(emc.c($$3, "")));
   }

   public emi c(long $$0, UUID $$1) throws enm {
      String $$2 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$PROFILE_UUID", UndashedUuid.toString($$1));
      String $$3 = this.c("ops" + $$2);
      return emi.a(this.a(emc.b($$3)));
   }

   public Boolean f(long $$0) throws enm {
      String $$1 = this.c("worlds" + "/$WORLD_ID/open".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(emc.d($$1, ""));
      return Boolean.valueOf($$2);
   }

   public Boolean g(long $$0) throws enm {
      String $$1 = this.c("worlds" + "/$WORLD_ID/close".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(emc.d($$1, ""));
      return Boolean.valueOf($$2);
   }

   public Boolean a(long $$0, epj $$1) throws enm {
      emy $$2 = new emy($$1.a(), -1L, $$1.b().b(), $$1.c());
      String $$3 = this.c("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(emc.a($$3, T.a($$2), 30000, 80000));
      return Boolean.valueOf($$4);
   }

   public Boolean d(long $$0, String $$1) throws enm {
      emy $$2 = new emy(null, Long.valueOf($$1), -1, false);
      String $$3 = this.c("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(emc.a($$3, T.a($$2), 30000, 80000));
      return Boolean.valueOf($$4);
   }

   public end h(long $$0) throws enm {
      String $$1 = this.c("subscriptions" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(emc.a($$1));
      return end.a($$2);
   }

   public int g() throws enm {
      return this.h().a.size();
   }

   public emk h() throws enm {
      String $$0 = this.c("invites/pending");
      String $$1 = this.a(emc.a($$0));
      emk $$2 = emk.a($$1);
      $$2.a.removeIf(this::a);
      return $$2;
   }

   private boolean a(emj $$0) {
      return this.e.aK().e($$0.d);
   }

   public void a(String $$0) throws enm {
      String $$1 = this.c("invites" + "/accept/$INVITATION_ID".replace("$INVITATION_ID", $$0));
      this.a(emc.d($$1, ""));
   }

   public eng b(long $$0, int $$1) throws enm {
      String $$2 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID/download".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$3 = this.a(emc.a($$2));
      return eng.a($$3);
   }

   @Nullable
   public ene e(long $$0, @Nullable String $$1) throws enm {
      String $$2 = this.c("worlds" + "/$WORLD_ID/backups/upload".replace("$WORLD_ID", String.valueOf($$0)));
      return ene.a(this.a(emc.d($$2, ene.b($$1))));
   }

   public void b(String $$0) throws enm {
      String $$1 = this.c("invites" + "/reject/$INVITATION_ID".replace("$INVITATION_ID", $$0));
      this.a(emc.d($$1, ""));
   }

   public void i() throws enm {
      String $$0 = this.c("mco/tos/agreed");
      this.a(emc.c($$0, ""));
   }

   public emo j() throws enm {
      String $$0 = this.c("mco/v1/news");
      String $$1 = this.a(emc.a($$0, 5000, 10000));
      return emo.a($$1);
   }

   public void a(eml $$0) throws enm {
      String $$1 = this.c("regions/ping/stat");
      this.a(emc.c($$1, T.a($$0)));
   }

   public Boolean k() throws enm {
      String $$0 = this.c("trial");
      String $$1 = this.a(emc.a($$0));
      return Boolean.valueOf($$1);
   }

   public void i(long $$0) throws enm {
      String $$1 = this.c("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(emc.b($$1));
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

   private String a(emc<?> $$0) throws enm {
      $$0.a("sid", this.c);
      $$0.a("user", this.d);
      $$0.a("version", aa.b().c());

      try {
         int $$1 = $$0.b();
         if ($$1 != 503 && $$1 != 277) {
            String $$3 = $$0.c();
            if ($$1 >= 200 && $$1 < 300) {
               return $$3;
            } else if ($$1 == 401) {
               String $$4 = $$0.c("WWW-Authenticate");
               b.info("Could not authorize you against Realms server: {}", $$4);
               throw new enm(new emb.a($$4));
            } else {
               emb $$5 = emb.a($$1, $$3);
               throw new enm($$5);
            }
         } else {
            int $$2 = $$0.a();
            throw new enn($$2, $$1);
         }
      } catch (enl var5) {
         throw new enm(emb.b.a(var5));
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

      public static Optional<elz.b> a(String $$0) {
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
