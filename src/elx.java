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

public class elx {
   public static final elx.b a = Optional.ofNullable(System.getenv("realms.environment"))
      .or(() -> Optional.ofNullable(System.getProperty("realms.environment")))
      .flatMap(elx.b::a)
      .orElse(elx.b.a);
   private static final Logger b = LogUtils.getLogger();
   private final String c;
   private final String d;
   private final eqn e;
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
   private static final emf T = new emf();

   public static elx a() {
      eqn $$0 = eqn.N();
      return a($$0);
   }

   public static elx a(eqn $$0) {
      String $$1 = $$0.U().c();
      String $$2 = $$0.U().a();
      return new elx($$2, $$1, $$0);
   }

   public elx(String $$0, String $$1, eqn $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      ely.a($$2.W());
   }

   public emq b() throws enk {
      String $$0 = this.c("worlds");
      String $$1 = this.a(ema.a($$0));
      return emq.a($$1);
   }

   public List<emn> c() throws enk {
      String $$0 = this.c("notifications");
      String $$1 = this.a(ema.a($$0));
      List<emn> $$2 = emn.a($$1);
      return $$2.size() > 1 ? List.of($$2.get(0)) : $$2;
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

   public void a(List<UUID> $$0) throws enk {
      String $$1 = this.c("notifications/seen");
      this.a(ema.c($$1, T.a(c($$0))));
   }

   public void b(List<UUID> $$0) throws enk {
      String $$1 = this.c("notifications/dismiss");
      this.a(ema.c($$1, T.a(c($$0))));
   }

   public emo a(long $$0) throws enk {
      String $$1 = this.c("worlds" + "/$ID".replace("$ID", String.valueOf($$0)));
      String $$2 = this.a(ema.a($$1));
      return emo.c($$2);
   }

   public ena b(long $$0) throws enk {
      String $$1 = this.c("activities" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(ema.a($$1));
      return ena.a($$2);
   }

   public emt d() throws enk {
      String $$0 = this.c("activities/liveplayerlist");
      String $$1 = this.a(ema.a($$0));
      return emt.a($$1);
   }

   public emp c(long $$0) throws enk {
      String $$1 = this.c("worlds" + "/v1/$ID/join/pc".replace("$ID", $$0 + ""));
      String $$2 = this.a(ema.a($$1, 5000, 30000));
      return emp.a($$2);
   }

   public void a(long $$0, String $$1, String $$2) throws enk {
      eml $$3 = new eml($$1, $$2);
      String $$4 = this.c("worlds" + "/$WORLD_ID/initialize".replace("$WORLD_ID", String.valueOf($$0)));
      String $$5 = T.a($$3);
      this.a(ema.a($$4, $$5, 5000, 10000));
   }

   public boolean e() throws enk {
      String $$0 = this.c("mco/available");
      String $$1 = this.a(ema.a($$0));
      return Boolean.parseBoolean($$1);
   }

   public elx.a f() throws enk {
      String $$0 = this.c("mco/client/compatible");
      String $$1 = this.a(ema.a($$0));

      try {
         return elx.a.valueOf($$1);
      } catch (IllegalArgumentException var5) {
         throw new enk(elz.b.a($$1));
      }
   }

   public void a(long $$0, UUID $$1) throws enk {
      String $$2 = this.c("invites" + "/$WORLD_ID/invite/$UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$UUID", UndashedUuid.toString($$1)));
      this.a(ema.b($$2));
   }

   public void d(long $$0) throws enk {
      String $$1 = this.c("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(ema.b($$1));
   }

   public emo a(long $$0, String $$1) throws enk {
      emk $$2 = new emk();
      $$2.a($$1);
      String $$3 = this.c("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(ema.c($$3, T.a($$2)));
      return emo.c($$4);
   }

   public eme e(long $$0) throws enk {
      String $$1 = this.c("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(ema.a($$1));
      return eme.a($$2);
   }

   public void b(long $$0, String $$1, String $$2) throws enk {
      eml $$3 = new eml($$1, $$2);
      String $$4 = this.c("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(ema.c($$4, T.a($$3)));
   }

   public void a(long $$0, int $$1, emv $$2) throws enk {
      String $$3 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$4 = $$2.c();
      this.a(ema.c($$3, $$4));
   }

   public boolean a(long $$0, int $$1) throws enk {
      String $$2 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$3 = this.a(ema.d($$2, ""));
      return Boolean.valueOf($$3);
   }

   public void b(long $$0, String $$1) throws enk {
      String $$2 = this.a("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf($$0)), "backupId=" + $$1);
      this.a(ema.b($$2, "", 40000, 600000));
   }

   public eng a(int $$0, int $$1, emo.c $$2) throws enk {
      String $$3 = this.a(
         "worlds" + "/templates/$WORLD_TYPE".replace("$WORLD_TYPE", $$2.toString()), String.format(Locale.ROOT, "page=%d&pageSize=%d", $$0, $$1)
      );
      String $$4 = this.a(ema.a($$3));
      return eng.a($$4);
   }

   public Boolean c(long $$0, String $$1) throws enk {
      String $$2 = "/minigames/$MINIGAME_ID/$WORLD_ID".replace("$MINIGAME_ID", $$1).replace("$WORLD_ID", String.valueOf($$0));
      String $$3 = this.c("worlds" + $$2);
      return Boolean.valueOf(this.a(ema.d($$3, "")));
   }

   public emg b(long $$0, UUID $$1) throws enk {
      String $$2 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$PROFILE_UUID", UndashedUuid.toString($$1));
      String $$3 = this.c("ops" + $$2);
      return emg.a(this.a(ema.c($$3, "")));
   }

   public emg c(long $$0, UUID $$1) throws enk {
      String $$2 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$PROFILE_UUID", UndashedUuid.toString($$1));
      String $$3 = this.c("ops" + $$2);
      return emg.a(this.a(ema.b($$3)));
   }

   public Boolean f(long $$0) throws enk {
      String $$1 = this.c("worlds" + "/$WORLD_ID/open".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(ema.d($$1, ""));
      return Boolean.valueOf($$2);
   }

   public Boolean g(long $$0) throws enk {
      String $$1 = this.c("worlds" + "/$WORLD_ID/close".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(ema.d($$1, ""));
      return Boolean.valueOf($$2);
   }

   public Boolean a(long $$0, eph $$1) throws enk {
      emw $$2 = new emw($$1.a(), -1L, $$1.b().b(), $$1.c());
      String $$3 = this.c("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(ema.a($$3, T.a($$2), 30000, 80000));
      return Boolean.valueOf($$4);
   }

   public Boolean d(long $$0, String $$1) throws enk {
      emw $$2 = new emw(null, Long.valueOf($$1), -1, false);
      String $$3 = this.c("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(ema.a($$3, T.a($$2), 30000, 80000));
      return Boolean.valueOf($$4);
   }

   public enb h(long $$0) throws enk {
      String $$1 = this.c("subscriptions" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(ema.a($$1));
      return enb.a($$2);
   }

   public int g() throws enk {
      return this.h().a.size();
   }

   public emi h() throws enk {
      String $$0 = this.c("invites/pending");
      String $$1 = this.a(ema.a($$0));
      emi $$2 = emi.a($$1);
      $$2.a.removeIf(this::a);
      return $$2;
   }

   private boolean a(emh $$0) {
      return this.e.aK().e($$0.d);
   }

   public void a(String $$0) throws enk {
      String $$1 = this.c("invites" + "/accept/$INVITATION_ID".replace("$INVITATION_ID", $$0));
      this.a(ema.d($$1, ""));
   }

   public ene b(long $$0, int $$1) throws enk {
      String $$2 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID/download".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$3 = this.a(ema.a($$2));
      return ene.a($$3);
   }

   @Nullable
   public enc e(long $$0, @Nullable String $$1) throws enk {
      String $$2 = this.c("worlds" + "/$WORLD_ID/backups/upload".replace("$WORLD_ID", String.valueOf($$0)));
      return enc.a(this.a(ema.d($$2, enc.b($$1))));
   }

   public void b(String $$0) throws enk {
      String $$1 = this.c("invites" + "/reject/$INVITATION_ID".replace("$INVITATION_ID", $$0));
      this.a(ema.d($$1, ""));
   }

   public void i() throws enk {
      String $$0 = this.c("mco/tos/agreed");
      this.a(ema.c($$0, ""));
   }

   public emm j() throws enk {
      String $$0 = this.c("mco/v1/news");
      String $$1 = this.a(ema.a($$0, 5000, 10000));
      return emm.a($$1);
   }

   public void a(emj $$0) throws enk {
      String $$1 = this.c("regions/ping/stat");
      this.a(ema.c($$1, T.a($$0)));
   }

   public Boolean k() throws enk {
      String $$0 = this.c("trial");
      String $$1 = this.a(ema.a($$0));
      return Boolean.valueOf($$1);
   }

   public void i(long $$0) throws enk {
      String $$1 = this.c("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(ema.b($$1));
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

   private String a(ema<?> $$0) throws enk {
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
               throw new enk(new elz.a($$4));
            } else {
               elz $$5 = elz.a($$1, $$3);
               throw new enk($$5);
            }
         } else {
            int $$2 = $$0.a();
            throw new enl($$2, $$1);
         }
      } catch (enj var5) {
         throw new enk(elz.b.a(var5));
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

      public static Optional<elx.b> a(String $$0) {
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
