import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import com.mojang.util.UndashedUuid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmd {
   public static final fmd.b a = Optional.ofNullable(System.getenv("realms.environment"))
      .or(() -> Optional.ofNullable(System.getProperty("realms.environment")))
      .flatMap(fmd.b::a)
      .orElse(fmd.b.a);
   private static final Logger b = LogUtils.getLogger();
   @Nullable
   private static volatile fmd c = null;
   private final CompletableFuture<Set<String>> d;
   private final String e;
   private final String f;
   private final frd g;
   private static final String h = "worlds";
   private static final String i = "invites";
   private static final String j = "mco";
   private static final String k = "subscriptions";
   private static final String l = "activities";
   private static final String m = "ops";
   private static final String n = "regions/ping/stat";
   private static final String o = "trial";
   private static final String p = "notifications";
   private static final String q = "feature/v1";
   private static final String r = "/listUserWorldsOfType/any";
   private static final String s = "/$PARENT_WORLD_ID/createPrereleaseRealm";
   private static final String t = "/listPrereleaseEligibleWorlds";
   private static final String u = "/$WORLD_ID/initialize";
   private static final String v = "/$WORLD_ID";
   private static final String w = "/liveplayerlist";
   private static final String x = "/$WORLD_ID";
   private static final String y = "/$WORLD_ID/$PROFILE_UUID";
   private static final String z = "/minigames/$MINIGAME_ID/$WORLD_ID";
   private static final String A = "/available";
   private static final String B = "/templates/$WORLD_TYPE";
   private static final String C = "/v1/$ID/join/pc";
   private static final String D = "/$ID";
   private static final String E = "/$WORLD_ID";
   private static final String F = "/$WORLD_ID/invite/$UUID";
   private static final String G = "/count/pending";
   private static final String H = "/pending";
   private static final String I = "/accept/$INVITATION_ID";
   private static final String J = "/reject/$INVITATION_ID";
   private static final String K = "/$WORLD_ID";
   private static final String L = "/$WORLD_ID";
   private static final String M = "/$WORLD_ID/slot/$SLOT_ID";
   private static final String N = "/$WORLD_ID/open";
   private static final String O = "/$WORLD_ID/close";
   private static final String P = "/$WORLD_ID/reset";
   private static final String Q = "/$WORLD_ID";
   private static final String R = "/$WORLD_ID/backups";
   private static final String S = "/$WORLD_ID/slot/$SLOT_ID/download";
   private static final String T = "/$WORLD_ID/backups/upload";
   private static final String U = "/client/compatible";
   private static final String V = "/tos/agreed";
   private static final String W = "/v1/news";
   private static final String X = "/seen";
   private static final String Y = "/dismiss";
   private static final fmv Z = new fmv();

   public static fmd a() {
      frd $$0 = frd.Q();
      return a($$0);
   }

   public static fmd a(frd $$0) {
      String $$1 = $$0.X().c();
      String $$2 = $$0.X().a();
      fmd $$3 = c;
      if ($$3 != null) {
         return $$3;
      } else {
         synchronized (fmd.class) {
            fmd $$4 = c;
            if ($$4 != null) {
               return $$4;
            } else {
               $$4 = new fmd($$2, $$1, $$0);
               c = $$4;
               return $$4;
            }
         }
      }
   }

   private fmd(String $$0, String $$1, frd $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      fme.a($$2.Z());
      this.d = CompletableFuture.supplyAsync(this::n, ag.j());
   }

   public Set<String> b() {
      return this.d.join();
   }

   private Set<String> n() {
      String $$0 = a("feature/v1", null, false);

      try {
         String $$1 = this.a(fmg.a($$0, 5000, 10000));
         JsonArray $$2 = JsonParser.parseString($$1).getAsJsonArray();
         Set<String> $$3 = $$2.asList().stream().<String>map(JsonElement::getAsString).collect(Collectors.toSet());
         b.debug("Fetched Realms feature flags: {}", $$3);
         return $$3;
      } catch (fnz var5) {
         b.error("Failed to fetch Realms feature flags", var5);
      } catch (Exception var6) {
         b.error("Could not parse Realms feature flags", var6);
      }

      return Set.of();
   }

   public fng c() throws fnz {
      String $$0 = this.c("worlds");
      if (fly.b()) {
         $$0 = $$0 + "/listUserWorldsOfType/any";
      }

      String $$1 = this.a(fmg.a($$0));
      return fng.a($$1);
   }

   public List<fne> d() throws fnz {
      String $$0 = this.c("worlds/listPrereleaseEligibleWorlds");
      String $$1 = this.a(fmg.a($$0));
      return fng.a($$1).a;
   }

   public fne a(Long $$0) throws fnz {
      String $$1 = String.valueOf($$0);
      String $$2 = this.c("worlds" + "/$PARENT_WORLD_ID/createPrereleaseRealm".replace("$PARENT_WORLD_ID", $$1));
      return fne.c(this.a(fmg.b($$2, $$1)));
   }

   public List<fnd> e() throws fnz {
      String $$0 = this.c("notifications");
      String $$1 = this.a(fmg.a($$0));
      return fnd.a($$1);
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

   public void a(List<UUID> $$0) throws fnz {
      String $$1 = this.c("notifications/seen");
      this.a(fmg.b($$1, Z.a(c($$0))));
   }

   public void b(List<UUID> $$0) throws fnz {
      String $$1 = this.c("notifications/dismiss");
      this.a(fmg.b($$1, Z.a(c($$0))));
   }

   public fne a(long $$0) throws fnz {
      String $$1 = this.c("worlds" + "/$ID".replace("$ID", String.valueOf($$0)));
      String $$2 = this.a(fmg.a($$1));
      return fne.c($$2);
   }

   public fnp b(long $$0) throws fnz {
      String $$1 = this.c("activities" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fmg.a($$1));
      return fnp.a($$2);
   }

   public fnh f() throws fnz {
      String $$0 = this.c("activities/liveplayerlist");
      String $$1 = this.a(fmg.a($$0));
      return fnh.a($$1);
   }

   public fnf c(long $$0) throws fnz {
      String $$1 = this.c("worlds" + "/v1/$ID/join/pc".replace("$ID", $$0 + ""));
      String $$2 = this.a(fmg.a($$1, 5000, 30000));
      return fnf.a($$2);
   }

   public void a(long $$0, String $$1, String $$2) throws fnz {
      fnb $$3 = new fnb($$1, $$2);
      String $$4 = this.c("worlds" + "/$WORLD_ID/initialize".replace("$WORLD_ID", String.valueOf($$0)));
      String $$5 = Z.a($$3);
      this.a(fmg.a($$4, $$5, 5000, 10000));
   }

   public boolean g() throws fnz {
      String $$0 = this.c("mco/available");
      String $$1 = this.a(fmg.a($$0));
      return Boolean.parseBoolean($$1);
   }

   public fmd.a h() throws fnz {
      String $$0 = this.c("mco/client/compatible");
      String $$1 = this.a(fmg.a($$0));

      try {
         return fmd.a.valueOf($$1);
      } catch (IllegalArgumentException var5) {
         throw new fnz(fmf.b.a($$1));
      }
   }

   public void a(long $$0, UUID $$1) throws fnz {
      String $$2 = this.c("invites" + "/$WORLD_ID/invite/$UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$UUID", UndashedUuid.toString($$1)));
      this.a(fmg.b($$2));
   }

   public void d(long $$0) throws fnz {
      String $$1 = this.c("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(fmg.b($$1));
   }

   public fne a(long $$0, String $$1) throws fnz {
      fna $$2 = new fna();
      $$2.a($$1);
      String $$3 = this.c("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(fmg.b($$3, Z.a($$2)));
      return fne.c($$4);
   }

   public fmu e(long $$0) throws fnz {
      String $$1 = this.c("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fmg.a($$1));
      return fmu.a($$2);
   }

   public void b(long $$0, String $$1, String $$2) throws fnz {
      fnb $$3 = new fnb($$1, $$2);
      String $$4 = this.c("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(fmg.b($$4, Z.a($$3)));
   }

   public void a(long $$0, int $$1, fnk $$2) throws fnz {
      String $$3 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$4 = $$2.c();
      this.a(fmg.b($$3, $$4));
   }

   public boolean a(long $$0, int $$1) throws fnz {
      String $$2 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$3 = this.a(fmg.c($$2, ""));
      return Boolean.valueOf($$3);
   }

   public void b(long $$0, String $$1) throws fnz {
      String $$2 = this.a("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf($$0)), "backupId=" + $$1);
      this.a(fmg.b($$2, "", 40000, 600000));
   }

   public fnv a(int $$0, int $$1, fne.d $$2) throws fnz {
      String $$3 = this.a(
         "worlds" + "/templates/$WORLD_TYPE".replace("$WORLD_TYPE", $$2.toString()), String.format(Locale.ROOT, "page=%d&pageSize=%d", $$0, $$1)
      );
      String $$4 = this.a(fmg.a($$3));
      return fnv.a($$4);
   }

   public Boolean c(long $$0, String $$1) throws fnz {
      String $$2 = "/minigames/$MINIGAME_ID/$WORLD_ID".replace("$MINIGAME_ID", $$1).replace("$WORLD_ID", String.valueOf($$0));
      String $$3 = this.c("worlds" + $$2);
      return Boolean.valueOf(this.a(fmg.c($$3, "")));
   }

   public fmw b(long $$0, UUID $$1) throws fnz {
      String $$2 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$PROFILE_UUID", UndashedUuid.toString($$1));
      String $$3 = this.c("ops" + $$2);
      return fmw.a(this.a(fmg.b($$3, "")));
   }

   public fmw c(long $$0, UUID $$1) throws fnz {
      String $$2 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$PROFILE_UUID", UndashedUuid.toString($$1));
      String $$3 = this.c("ops" + $$2);
      return fmw.a(this.a(fmg.b($$3)));
   }

   public Boolean f(long $$0) throws fnz {
      String $$1 = this.c("worlds" + "/$WORLD_ID/open".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fmg.c($$1, ""));
      return Boolean.valueOf($$2);
   }

   public Boolean g(long $$0) throws fnz {
      String $$1 = this.c("worlds" + "/$WORLD_ID/close".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fmg.c($$1, ""));
      return Boolean.valueOf($$2);
   }

   public Boolean d(long $$0, String $$1) throws fnz {
      fnl $$2 = new fnl(null, Long.valueOf($$1), -1, false, Set.of());
      String $$3 = this.c("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(fmg.a($$3, Z.a($$2), 30000, 80000));
      return Boolean.valueOf($$4);
   }

   public fnq h(long $$0) throws fnz {
      String $$1 = this.c("subscriptions" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fmg.a($$1));
      return fnq.a($$2);
   }

   public int i() throws fnz {
      return this.j().a.size();
   }

   public fmy j() throws fnz {
      String $$0 = this.c("invites/pending");
      String $$1 = this.a(fmg.a($$0));
      fmy $$2 = fmy.a($$1);
      $$2.a.removeIf(this::a);
      return $$2;
   }

   private boolean a(fmx $$0) {
      return this.g.aN().e($$0.d);
   }

   public void a(String $$0) throws fnz {
      String $$1 = this.c("invites" + "/accept/$INVITATION_ID".replace("$INVITATION_ID", $$0));
      this.a(fmg.c($$1, ""));
   }

   public fnt b(long $$0, int $$1) throws fnz {
      String $$2 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID/download".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$3 = this.a(fmg.a($$2));
      return fnt.a($$3);
   }

   @Nullable
   public fnr i(long $$0) throws fnz {
      String $$1 = this.c("worlds" + "/$WORLD_ID/backups/upload".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = fpv.a($$0);
      fnr $$3 = fnr.a(this.a(fmg.c($$1, fnr.b($$2))));
      if ($$3 != null) {
         fpv.a($$0, $$3.a());
      }

      return $$3;
   }

   public void b(String $$0) throws fnz {
      String $$1 = this.c("invites" + "/reject/$INVITATION_ID".replace("$INVITATION_ID", $$0));
      this.a(fmg.c($$1, ""));
   }

   public void k() throws fnz {
      String $$0 = this.c("mco/tos/agreed");
      this.a(fmg.b($$0, ""));
   }

   public fnc l() throws fnz {
      String $$0 = this.c("mco/v1/news");
      String $$1 = this.a(fmg.a($$0, 5000, 10000));
      return fnc.a($$1);
   }

   public void a(fmz $$0) throws fnz {
      String $$1 = this.c("regions/ping/stat");
      this.a(fmg.b($$1, Z.a($$0)));
   }

   public Boolean m() throws fnz {
      String $$0 = this.c("trial");
      String $$1 = this.a(fmg.a($$0));
      return Boolean.valueOf($$1);
   }

   public void j(long $$0) throws fnz {
      String $$1 = this.c("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(fmg.b($$1));
   }

   private String c(String $$0) throws fnz {
      return this.a($$0, null);
   }

   private String a(String $$0, @Nullable String $$1) throws fnz {
      return a($$0, $$1, this.b().contains("realms_in_aks"));
   }

   private static String a(String $$0, @Nullable String $$1, boolean $$2) {
      try {
         return new URI(a.f, $$2 ? a.e : a.d, "/" + $$0, $$1, null).toASCIIString();
      } catch (URISyntaxException var4) {
         throw new IllegalArgumentException($$0, var4);
      }
   }

   private String a(fmg<?> $$0) throws fnz {
      $$0.a("sid", this.e);
      $$0.a("user", this.f);
      $$0.a("version", ac.b().c());
      $$0.a(fly.b());

      try {
         int $$1 = $$0.b();
         if ($$1 != 503 && $$1 != 277) {
            String $$3 = $$0.c();
            if ($$1 >= 200 && $$1 < 300) {
               return $$3;
            } else if ($$1 == 401) {
               String $$4 = $$0.c("WWW-Authenticate");
               b.info("Could not authorize you against Realms server: {}", $$4);
               throw new fnz(new fmf.a($$4));
            } else {
               fmf $$5 = fmf.a($$1, $$3);
               throw new fnz($$5);
            }
         } else {
            int $$2 = $$0.a();
            throw new foa($$2, $$1);
         }
      } catch (fny var5) {
         throw new fnz(fmf.b.a(var5));
      }
   }

   public static enum a {
      a,
      b,
      c;
   }

   public static enum b {
      a("pc.realms.minecraft.net", "java.frontendlegacy.realms.minecraft-services.net", "https"),
      b("pc-stage.realms.minecraft.net", "java.frontendlegacy.stage-c2a40e62.realms.minecraft-services.net", "https"),
      c("localhost:8080", "localhost:8080", "http");

      public final String d;
      public final String e;
      public final String f;

      private b(final String $$0, final String $$1, final String $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public static Optional<fmd.b> a(String $$0) {
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
