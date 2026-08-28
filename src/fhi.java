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

public class fhi {
   public static final fhi.b a = Optional.ofNullable(System.getenv("realms.environment"))
      .or(() -> Optional.ofNullable(System.getProperty("realms.environment")))
      .flatMap(fhi.b::a)
      .orElse(fhi.b.a);
   private static final Logger b = LogUtils.getLogger();
   private final String c;
   private final String d;
   private final fmg e;
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
   private static final fia W = new fia();

   public static fhi a() {
      fmg $$0 = fmg.Q();
      return a($$0);
   }

   public static fhi a(fmg $$0) {
      String $$1 = $$0.X().c();
      String $$2 = $$0.X().a();
      return new fhi($$2, $$1, $$0);
   }

   public fhi(String $$0, String $$1, fmg $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      fhj.a($$2.Z());
   }

   public fil b() throws fje {
      String $$0 = this.c("worlds");
      if (fhd.b()) {
         $$0 = $$0 + "/listUserWorldsOfType/any";
      }

      String $$1 = this.a(fhl.a($$0));
      return fil.a($$1);
   }

   public List<fij> c() throws fje {
      String $$0 = this.c("worlds/listPrereleaseEligibleWorlds");
      String $$1 = this.a(fhl.a($$0));
      return fil.a($$1).a;
   }

   public fij a(Long $$0) throws fje {
      String $$1 = String.valueOf($$0);
      String $$2 = this.c("worlds" + "/$PARENT_WORLD_ID/createPrereleaseRealm".replace("$PARENT_WORLD_ID", $$1));
      return fij.c(this.a(fhl.b($$2, $$1)));
   }

   public List<fii> d() throws fje {
      String $$0 = this.c("notifications");
      String $$1 = this.a(fhl.a($$0));
      return fii.a($$1);
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

   public void a(List<UUID> $$0) throws fje {
      String $$1 = this.c("notifications/seen");
      this.a(fhl.b($$1, W.a(c($$0))));
   }

   public void b(List<UUID> $$0) throws fje {
      String $$1 = this.c("notifications/dismiss");
      this.a(fhl.b($$1, W.a(c($$0))));
   }

   public fij a(long $$0) throws fje {
      String $$1 = this.c("worlds" + "/$ID".replace("$ID", String.valueOf($$0)));
      String $$2 = this.a(fhl.a($$1));
      return fij.c($$2);
   }

   public fiu b(long $$0) throws fje {
      String $$1 = this.c("activities" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fhl.a($$1));
      return fiu.a($$2);
   }

   public fim e() throws fje {
      String $$0 = this.c("activities/liveplayerlist");
      String $$1 = this.a(fhl.a($$0));
      return fim.a($$1);
   }

   public fik c(long $$0) throws fje {
      String $$1 = this.c("worlds" + "/v1/$ID/join/pc".replace("$ID", $$0 + ""));
      String $$2 = this.a(fhl.a($$1, 5000, 30000));
      return fik.a($$2);
   }

   public void a(long $$0, String $$1, String $$2) throws fje {
      fig $$3 = new fig($$1, $$2);
      String $$4 = this.c("worlds" + "/$WORLD_ID/initialize".replace("$WORLD_ID", String.valueOf($$0)));
      String $$5 = W.a($$3);
      this.a(fhl.a($$4, $$5, 5000, 10000));
   }

   public boolean f() throws fje {
      String $$0 = this.c("mco/available");
      String $$1 = this.a(fhl.a($$0));
      return Boolean.parseBoolean($$1);
   }

   public fhi.a g() throws fje {
      String $$0 = this.c("mco/client/compatible");
      String $$1 = this.a(fhl.a($$0));

      try {
         return fhi.a.valueOf($$1);
      } catch (IllegalArgumentException var5) {
         throw new fje(fhk.b.a($$1));
      }
   }

   public void a(long $$0, UUID $$1) throws fje {
      String $$2 = this.c("invites" + "/$WORLD_ID/invite/$UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$UUID", UndashedUuid.toString($$1)));
      this.a(fhl.b($$2));
   }

   public void d(long $$0) throws fje {
      String $$1 = this.c("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(fhl.b($$1));
   }

   public fij a(long $$0, String $$1) throws fje {
      fif $$2 = new fif();
      $$2.a($$1);
      String $$3 = this.c("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(fhl.b($$3, W.a($$2)));
      return fij.c($$4);
   }

   public fhz e(long $$0) throws fje {
      String $$1 = this.c("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fhl.a($$1));
      return fhz.a($$2);
   }

   public void b(long $$0, String $$1, String $$2) throws fje {
      fig $$3 = new fig($$1, $$2);
      String $$4 = this.c("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(fhl.b($$4, W.a($$3)));
   }

   public void a(long $$0, int $$1, fip $$2) throws fje {
      String $$3 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$4 = $$2.c();
      this.a(fhl.b($$3, $$4));
   }

   public boolean a(long $$0, int $$1) throws fje {
      String $$2 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$3 = this.a(fhl.c($$2, ""));
      return Boolean.valueOf($$3);
   }

   public void b(long $$0, String $$1) throws fje {
      String $$2 = this.a("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf($$0)), "backupId=" + $$1);
      this.a(fhl.b($$2, "", 40000, 600000));
   }

   public fja a(int $$0, int $$1, fij.d $$2) throws fje {
      String $$3 = this.a(
         "worlds" + "/templates/$WORLD_TYPE".replace("$WORLD_TYPE", $$2.toString()), String.format(Locale.ROOT, "page=%d&pageSize=%d", $$0, $$1)
      );
      String $$4 = this.a(fhl.a($$3));
      return fja.a($$4);
   }

   public Boolean c(long $$0, String $$1) throws fje {
      String $$2 = "/minigames/$MINIGAME_ID/$WORLD_ID".replace("$MINIGAME_ID", $$1).replace("$WORLD_ID", String.valueOf($$0));
      String $$3 = this.c("worlds" + $$2);
      return Boolean.valueOf(this.a(fhl.c($$3, "")));
   }

   public fib b(long $$0, UUID $$1) throws fje {
      String $$2 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$PROFILE_UUID", UndashedUuid.toString($$1));
      String $$3 = this.c("ops" + $$2);
      return fib.a(this.a(fhl.b($$3, "")));
   }

   public fib c(long $$0, UUID $$1) throws fje {
      String $$2 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$PROFILE_UUID", UndashedUuid.toString($$1));
      String $$3 = this.c("ops" + $$2);
      return fib.a(this.a(fhl.b($$3)));
   }

   public Boolean f(long $$0) throws fje {
      String $$1 = this.c("worlds" + "/$WORLD_ID/open".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fhl.c($$1, ""));
      return Boolean.valueOf($$2);
   }

   public Boolean g(long $$0) throws fje {
      String $$1 = this.c("worlds" + "/$WORLD_ID/close".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fhl.c($$1, ""));
      return Boolean.valueOf($$2);
   }

   public Boolean d(long $$0, String $$1) throws fje {
      fiq $$2 = new fiq(null, Long.valueOf($$1), -1, false, Set.of());
      String $$3 = this.c("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(fhl.a($$3, W.a($$2), 30000, 80000));
      return Boolean.valueOf($$4);
   }

   public fiv h(long $$0) throws fje {
      String $$1 = this.c("subscriptions" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fhl.a($$1));
      return fiv.a($$2);
   }

   public int h() throws fje {
      return this.i().a.size();
   }

   public fid i() throws fje {
      String $$0 = this.c("invites/pending");
      String $$1 = this.a(fhl.a($$0));
      fid $$2 = fid.a($$1);
      $$2.a.removeIf(this::a);
      return $$2;
   }

   private boolean a(fic $$0) {
      return this.e.aN().e($$0.d);
   }

   public void a(String $$0) throws fje {
      String $$1 = this.c("invites" + "/accept/$INVITATION_ID".replace("$INVITATION_ID", $$0));
      this.a(fhl.c($$1, ""));
   }

   public fiy b(long $$0, int $$1) throws fje {
      String $$2 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID/download".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$3 = this.a(fhl.a($$2));
      return fiy.a($$3);
   }

   @Nullable
   public fiw i(long $$0) throws fje {
      String $$1 = this.c("worlds" + "/$WORLD_ID/backups/upload".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = fkz.a($$0);
      fiw $$3 = fiw.a(this.a(fhl.c($$1, fiw.b($$2))));
      if ($$3 != null) {
         fkz.a($$0, $$3.a());
      }

      return $$3;
   }

   public void b(String $$0) throws fje {
      String $$1 = this.c("invites" + "/reject/$INVITATION_ID".replace("$INVITATION_ID", $$0));
      this.a(fhl.c($$1, ""));
   }

   public void j() throws fje {
      String $$0 = this.c("mco/tos/agreed");
      this.a(fhl.b($$0, ""));
   }

   public fih k() throws fje {
      String $$0 = this.c("mco/v1/news");
      String $$1 = this.a(fhl.a($$0, 5000, 10000));
      return fih.a($$1);
   }

   public void a(fie $$0) throws fje {
      String $$1 = this.c("regions/ping/stat");
      this.a(fhl.b($$1, W.a($$0)));
   }

   public Boolean l() throws fje {
      String $$0 = this.c("trial");
      String $$1 = this.a(fhl.a($$0));
      return Boolean.valueOf($$1);
   }

   public void j(long $$0) throws fje {
      String $$1 = this.c("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(fhl.b($$1));
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

   private String a(fhl<?> $$0) throws fje {
      $$0.a("sid", this.c);
      $$0.a("user", this.d);
      $$0.a("version", ab.b().c());
      $$0.a(fhd.b());

      try {
         int $$1 = $$0.b();
         if ($$1 != 503 && $$1 != 277) {
            String $$3 = $$0.c();
            if ($$1 >= 200 && $$1 < 300) {
               return $$3;
            } else if ($$1 == 401) {
               String $$4 = $$0.c("WWW-Authenticate");
               b.info("Could not authorize you against Realms server: {}", $$4);
               throw new fje(new fhk.a($$4));
            } else {
               fhk $$5 = fhk.a($$1, $$3);
               throw new fje($$5);
            }
         } else {
            int $$2 = $$0.a();
            throw new fjf($$2, $$1);
         }
      } catch (fjd var5) {
         throw new fje(fhk.b.a(var5));
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

      public static Optional<fhi.b> a(String $$0) {
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
