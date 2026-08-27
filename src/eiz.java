import com.google.gson.JsonArray;
import com.mojang.logging.LogUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eiz {
   public static eiz.b a = eiz.b.a;
   private static boolean b;
   private static final Logger c = LogUtils.getLogger();
   private final String d;
   private final String e;
   private final enn f;
   private static final String g = "worlds";
   private static final String h = "invites";
   private static final String i = "mco";
   private static final String j = "subscriptions";
   private static final String k = "activities";
   private static final String l = "ops";
   private static final String m = "regions/ping/stat";
   private static final String n = "trial";
   private static final String o = "notifications";
   private static final String p = "/$WORLD_ID/initialize";
   private static final String q = "/$WORLD_ID";
   private static final String r = "/liveplayerlist";
   private static final String s = "/$WORLD_ID";
   private static final String t = "/$WORLD_ID/$PROFILE_UUID";
   private static final String u = "/minigames/$MINIGAME_ID/$WORLD_ID";
   private static final String v = "/available";
   private static final String w = "/templates/$WORLD_TYPE";
   private static final String x = "/v1/$ID/join/pc";
   private static final String y = "/$ID";
   private static final String z = "/$WORLD_ID";
   private static final String A = "/$WORLD_ID/invite/$UUID";
   private static final String B = "/count/pending";
   private static final String C = "/pending";
   private static final String D = "/accept/$INVITATION_ID";
   private static final String E = "/reject/$INVITATION_ID";
   private static final String F = "/$WORLD_ID";
   private static final String G = "/$WORLD_ID";
   private static final String H = "/$WORLD_ID/slot/$SLOT_ID";
   private static final String I = "/$WORLD_ID/open";
   private static final String J = "/$WORLD_ID/close";
   private static final String K = "/$WORLD_ID/reset";
   private static final String L = "/$WORLD_ID";
   private static final String M = "/$WORLD_ID/backups";
   private static final String N = "/$WORLD_ID/slot/$SLOT_ID/download";
   private static final String O = "/$WORLD_ID/backups/upload";
   private static final String P = "/client/compatible";
   private static final String Q = "/tos/agreed";
   private static final String R = "/v1/news";
   private static final String S = "/seen";
   private static final String T = "/dismiss";
   private static final String U = "/stageAvailable";
   private static final ejh V = new ejh();

   public static eiz a() {
      enn $$0 = enn.N();
      return a($$0);
   }

   public static eiz a(enn $$0) {
      String $$1 = $$0.U().c();
      String $$2 = $$0.U().a();
      if (!b) {
         b = true;
         Optional<String> $$3 = Optional.ofNullable(System.getenv("realms.environment"))
            .or(() -> Optional.ofNullable(System.getProperty("realms.environment")));
         $$3.flatMap(eiz.b::a).ifPresent($$0x -> a = $$0x);
      }

      return new eiz($$2, $$1, $$0);
   }

   public static void b() {
      a = eiz.b.b;
   }

   public static void c() {
      a = eiz.b.a;
   }

   public static void d() {
      a = eiz.b.c;
   }

   public eiz(String $$0, String $$1, enn $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      eja.a($$2.W());
   }

   public ejs e() throws ekm {
      String $$0 = this.c("worlds");
      String $$1 = this.a(ejc.a($$0));
      return ejs.a($$1);
   }

   public List<ejp> f() throws ekm {
      String $$0 = this.c("notifications");
      String $$1 = this.a(ejc.a($$0));
      List<ejp> $$2 = ejp.a($$1);
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

   public void a(List<UUID> $$0) throws ekm {
      String $$1 = this.c("notifications/seen");
      this.a(ejc.c($$1, V.a(c($$0))));
   }

   public void b(List<UUID> $$0) throws ekm {
      String $$1 = this.c("notifications/dismiss");
      this.a(ejc.c($$1, V.a(c($$0))));
   }

   public ejq a(long $$0) throws ekm {
      String $$1 = this.c("worlds" + "/$ID".replace("$ID", String.valueOf($$0)));
      String $$2 = this.a(ejc.a($$1));
      return ejq.c($$2);
   }

   public ekc b(long $$0) throws ekm {
      String $$1 = this.c("activities" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(ejc.a($$1));
      return ekc.a($$2);
   }

   public ejv g() throws ekm {
      String $$0 = this.c("activities/liveplayerlist");
      String $$1 = this.a(ejc.a($$0));
      return ejv.a($$1);
   }

   public ejr c(long $$0) throws ekm {
      String $$1 = this.c("worlds" + "/v1/$ID/join/pc".replace("$ID", $$0 + ""));
      String $$2 = this.a(ejc.a($$1, 5000, 30000));
      return ejr.a($$2);
   }

   public void a(long $$0, String $$1, String $$2) throws ekm {
      ejn $$3 = new ejn($$1, $$2);
      String $$4 = this.c("worlds" + "/$WORLD_ID/initialize".replace("$WORLD_ID", String.valueOf($$0)));
      String $$5 = V.a($$3);
      this.a(ejc.a($$4, $$5, 5000, 10000));
   }

   public Boolean h() throws ekm {
      String $$0 = this.c("mco/available");
      String $$1 = this.a(ejc.a($$0));
      return Boolean.valueOf($$1);
   }

   public Boolean i() throws ekm {
      String $$0 = this.c("mco/stageAvailable");
      String $$1 = this.a(ejc.a($$0));
      return Boolean.valueOf($$1);
   }

   public eiz.a j() throws ekm {
      String $$0 = this.c("mco/client/compatible");
      String $$1 = this.a(ejc.a($$0));

      try {
         return eiz.a.valueOf($$1);
      } catch (IllegalArgumentException var5) {
         throw new ekm(500, "Could not check compatible version, got response: " + $$1);
      }
   }

   public void a(long $$0, String $$1) throws ekm {
      String $$2 = this.c("invites" + "/$WORLD_ID/invite/$UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$UUID", $$1));
      this.a(ejc.b($$2));
   }

   public void d(long $$0) throws ekm {
      String $$1 = this.c("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(ejc.b($$1));
   }

   public ejq b(long $$0, String $$1) throws ekm {
      ejm $$2 = new ejm();
      $$2.a($$1);
      String $$3 = this.c("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(ejc.c($$3, V.a($$2)));
      return ejq.c($$4);
   }

   public ejg e(long $$0) throws ekm {
      String $$1 = this.c("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(ejc.a($$1));
      return ejg.a($$2);
   }

   public void b(long $$0, String $$1, String $$2) throws ekm {
      ejn $$3 = new ejn($$1, $$2);
      String $$4 = this.c("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(ejc.c($$4, V.a($$3)));
   }

   public void a(long $$0, int $$1, ejx $$2) throws ekm {
      String $$3 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$4 = $$2.c();
      this.a(ejc.c($$3, $$4));
   }

   public boolean a(long $$0, int $$1) throws ekm {
      String $$2 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$3 = this.a(ejc.d($$2, ""));
      return Boolean.valueOf($$3);
   }

   public void c(long $$0, String $$1) throws ekm {
      String $$2 = this.a("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf($$0)), "backupId=" + $$1);
      this.a(ejc.b($$2, "", 40000, 600000));
   }

   public eki a(int $$0, int $$1, ejq.c $$2) throws ekm {
      String $$3 = this.a(
         "worlds" + "/templates/$WORLD_TYPE".replace("$WORLD_TYPE", $$2.toString()), String.format(Locale.ROOT, "page=%d&pageSize=%d", $$0, $$1)
      );
      String $$4 = this.a(ejc.a($$3));
      return eki.a($$4);
   }

   public Boolean d(long $$0, String $$1) throws ekm {
      String $$2 = "/minigames/$MINIGAME_ID/$WORLD_ID".replace("$MINIGAME_ID", $$1).replace("$WORLD_ID", String.valueOf($$0));
      String $$3 = this.c("worlds" + $$2);
      return Boolean.valueOf(this.a(ejc.d($$3, "")));
   }

   public eji e(long $$0, String $$1) throws ekm {
      String $$2 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$PROFILE_UUID", $$1);
      String $$3 = this.c("ops" + $$2);
      return eji.a(this.a(ejc.c($$3, "")));
   }

   public eji f(long $$0, String $$1) throws ekm {
      String $$2 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$PROFILE_UUID", $$1);
      String $$3 = this.c("ops" + $$2);
      return eji.a(this.a(ejc.b($$3)));
   }

   public Boolean f(long $$0) throws ekm {
      String $$1 = this.c("worlds" + "/$WORLD_ID/open".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(ejc.d($$1, ""));
      return Boolean.valueOf($$2);
   }

   public Boolean g(long $$0) throws ekm {
      String $$1 = this.c("worlds" + "/$WORLD_ID/close".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(ejc.d($$1, ""));
      return Boolean.valueOf($$2);
   }

   public Boolean a(long $$0, emi $$1) throws ekm {
      ejy $$2 = new ejy($$1.a(), -1L, $$1.b().b(), $$1.c());
      String $$3 = this.c("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(ejc.a($$3, V.a($$2), 30000, 80000));
      return Boolean.valueOf($$4);
   }

   public Boolean g(long $$0, String $$1) throws ekm {
      ejy $$2 = new ejy(null, Long.valueOf($$1), -1, false);
      String $$3 = this.c("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(ejc.a($$3, V.a($$2), 30000, 80000));
      return Boolean.valueOf($$4);
   }

   public ekd h(long $$0) throws ekm {
      String $$1 = this.c("subscriptions" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(ejc.a($$1));
      return ekd.a($$2);
   }

   public int k() throws ekm {
      return this.l().a.size();
   }

   public ejk l() throws ekm {
      String $$0 = this.c("invites/pending");
      String $$1 = this.a(ejc.a($$0));
      ejk $$2 = ejk.a($$1);
      $$2.a.removeIf(this::a);
      return $$2;
   }

   private boolean a(ejj $$0) {
      try {
         UUID $$1 = UUID.fromString($$0.d);
         return this.f.aK().e($$1);
      } catch (IllegalArgumentException var3) {
         return false;
      }
   }

   public void a(String $$0) throws ekm {
      String $$1 = this.c("invites" + "/accept/$INVITATION_ID".replace("$INVITATION_ID", $$0));
      this.a(ejc.d($$1, ""));
   }

   public ekg b(long $$0, int $$1) throws ekm {
      String $$2 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID/download".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$3 = this.a(ejc.a($$2));
      return ekg.a($$3);
   }

   @Nullable
   public eke h(long $$0, @Nullable String $$1) throws ekm {
      String $$2 = this.c("worlds" + "/$WORLD_ID/backups/upload".replace("$WORLD_ID", String.valueOf($$0)));
      return eke.a(this.a(ejc.d($$2, eke.b($$1))));
   }

   public void b(String $$0) throws ekm {
      String $$1 = this.c("invites" + "/reject/$INVITATION_ID".replace("$INVITATION_ID", $$0));
      this.a(ejc.d($$1, ""));
   }

   public void m() throws ekm {
      String $$0 = this.c("mco/tos/agreed");
      this.a(ejc.c($$0, ""));
   }

   public ejo n() throws ekm {
      String $$0 = this.c("mco/v1/news");
      String $$1 = this.a(ejc.a($$0, 5000, 10000));
      return ejo.a($$1);
   }

   public void a(ejl $$0) throws ekm {
      String $$1 = this.c("regions/ping/stat");
      this.a(ejc.c($$1, V.a($$0)));
   }

   public Boolean o() throws ekm {
      String $$0 = this.c("trial");
      String $$1 = this.a(ejc.a($$0));
      return Boolean.valueOf($$1);
   }

   public void i(long $$0) throws ekm {
      String $$1 = this.c("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(ejc.b($$1));
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

   private String a(ejc<?> $$0) throws ekm {
      $$0.a("sid", this.d);
      $$0.a("user", this.e);
      $$0.a("version", aa.b().c());

      try {
         int $$1 = $$0.b();
         if ($$1 != 503 && $$1 != 277) {
            String $$3 = $$0.c();
            if ($$1 >= 200 && $$1 < 300) {
               return $$3;
            } else if ($$1 == 401) {
               String $$4 = $$0.c("WWW-Authenticate");
               c.info("Could not authorize you against Realms server: {}", $$4);
               throw new ekm($$1, $$4);
            } else {
               ejb $$5 = ejb.a($$3);
               if ($$5 != null) {
                  c.error("Realms http code: {} -  error code: {} -  message: {} - raw body: {}", new Object[]{$$1, $$5.b(), $$5.a(), $$3});
                  throw new ekm($$1, $$3, $$5);
               } else {
                  c.error("Realms http code: {} - raw body (message failed to parse): {}", $$1, $$3);
                  String $$6 = a($$1);
                  throw new ekm($$1, $$6);
               }
            }
         } else {
            int $$2 = $$0.a();
            throw new ekn($$2, $$1);
         }
      } catch (ekl var6) {
         throw new ekm(500, "Could not connect to Realms: " + var6.getMessage());
      }
   }

   private static String a(int $$0) {
      return switch ($$0) {
         case 429 -> fvz.a("mco.errorMessage.serviceBusy");
         default -> "Unknown error";
      };
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

      public String d;
      public String e;

      private b(String $$0, String $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public static Optional<eiz.b> a(String $$0) {
         String var1 = $$0.toLowerCase(Locale.ROOT);

         return switch (var1) {
            case "production" -> Optional.of(a);
            case "local" -> Optional.of(c);
            case "stage" -> Optional.of(b);
            default -> Optional.empty();
         };
      }
   }
}
