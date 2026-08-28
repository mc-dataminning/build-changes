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

public class fer {
   public static final fer.b a = Optional.ofNullable(System.getenv("realms.environment"))
      .or(() -> Optional.ofNullable(System.getProperty("realms.environment")))
      .flatMap(fer.b::a)
      .orElse(fer.b.a);
   private static final Logger b = LogUtils.getLogger();
   private final String c;
   private final String d;
   private final fji e;
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
   private static final fez W = new fez();

   public static fer a() {
      fji $$0 = fji.Q();
      return a($$0);
   }

   public static fer a(fji $$0) {
      String $$1 = $$0.X().c();
      String $$2 = $$0.X().a();
      return new fer($$2, $$1, $$0);
   }

   public fer(String $$0, String $$1, fji $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      fes.a($$2.Z());
   }

   public ffk b() throws fgc {
      String $$0 = this.c("worlds");
      if (fem.b()) {
         $$0 = $$0 + "/listUserWorldsOfType/any";
      }

      String $$1 = this.a(feu.a($$0));
      return ffk.a($$1);
   }

   public List<ffi> c() throws fgc {
      String $$0 = this.c("worlds/listPrereleaseEligibleWorlds");
      String $$1 = this.a(feu.a($$0));
      return ffk.a($$1).a;
   }

   public ffi a(Long $$0) throws fgc {
      String $$1 = String.valueOf($$0);
      String $$2 = this.c("worlds" + "/$PARENT_WORLD_ID/createPrereleaseRealm".replace("$PARENT_WORLD_ID", $$1));
      return ffi.c(this.a(feu.b($$2, $$1)));
   }

   public List<ffh> d() throws fgc {
      String $$0 = this.c("notifications");
      String $$1 = this.a(feu.a($$0));
      return ffh.a($$1);
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

   public void a(List<UUID> $$0) throws fgc {
      String $$1 = this.c("notifications/seen");
      this.a(feu.b($$1, W.a(c($$0))));
   }

   public void b(List<UUID> $$0) throws fgc {
      String $$1 = this.c("notifications/dismiss");
      this.a(feu.b($$1, W.a(c($$0))));
   }

   public ffi a(long $$0) throws fgc {
      String $$1 = this.c("worlds" + "/$ID".replace("$ID", String.valueOf($$0)));
      String $$2 = this.a(feu.a($$1));
      return ffi.c($$2);
   }

   public ffs b(long $$0) throws fgc {
      String $$1 = this.c("activities" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(feu.a($$1));
      return ffs.a($$2);
   }

   public ffl e() throws fgc {
      String $$0 = this.c("activities/liveplayerlist");
      String $$1 = this.a(feu.a($$0));
      return ffl.a($$1);
   }

   public ffj c(long $$0) throws fgc {
      String $$1 = this.c("worlds" + "/v1/$ID/join/pc".replace("$ID", $$0 + ""));
      String $$2 = this.a(feu.a($$1, 5000, 30000));
      return ffj.a($$2);
   }

   public void a(long $$0, String $$1, String $$2) throws fgc {
      fff $$3 = new fff($$1, $$2);
      String $$4 = this.c("worlds" + "/$WORLD_ID/initialize".replace("$WORLD_ID", String.valueOf($$0)));
      String $$5 = W.a($$3);
      this.a(feu.a($$4, $$5, 5000, 10000));
   }

   public boolean f() throws fgc {
      String $$0 = this.c("mco/available");
      String $$1 = this.a(feu.a($$0));
      return Boolean.parseBoolean($$1);
   }

   public fer.a g() throws fgc {
      String $$0 = this.c("mco/client/compatible");
      String $$1 = this.a(feu.a($$0));

      try {
         return fer.a.valueOf($$1);
      } catch (IllegalArgumentException var5) {
         throw new fgc(fet.b.a($$1));
      }
   }

   public void a(long $$0, UUID $$1) throws fgc {
      String $$2 = this.c("invites" + "/$WORLD_ID/invite/$UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$UUID", UndashedUuid.toString($$1)));
      this.a(feu.b($$2));
   }

   public void d(long $$0) throws fgc {
      String $$1 = this.c("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(feu.b($$1));
   }

   public ffi a(long $$0, String $$1) throws fgc {
      ffe $$2 = new ffe();
      $$2.a($$1);
      String $$3 = this.c("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(feu.b($$3, W.a($$2)));
      return ffi.c($$4);
   }

   public fey e(long $$0) throws fgc {
      String $$1 = this.c("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(feu.a($$1));
      return fey.a($$2);
   }

   public void b(long $$0, String $$1, String $$2) throws fgc {
      fff $$3 = new fff($$1, $$2);
      String $$4 = this.c("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(feu.b($$4, W.a($$3)));
   }

   public void a(long $$0, int $$1, ffn $$2) throws fgc {
      String $$3 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$4 = $$2.c();
      this.a(feu.b($$3, $$4));
   }

   public boolean a(long $$0, int $$1) throws fgc {
      String $$2 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$3 = this.a(feu.c($$2, ""));
      return Boolean.valueOf($$3);
   }

   public void b(long $$0, String $$1) throws fgc {
      String $$2 = this.a("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf($$0)), "backupId=" + $$1);
      this.a(feu.b($$2, "", 40000, 600000));
   }

   public ffy a(int $$0, int $$1, ffi.d $$2) throws fgc {
      String $$3 = this.a(
         "worlds" + "/templates/$WORLD_TYPE".replace("$WORLD_TYPE", $$2.toString()), String.format(Locale.ROOT, "page=%d&pageSize=%d", $$0, $$1)
      );
      String $$4 = this.a(feu.a($$3));
      return ffy.a($$4);
   }

   public Boolean c(long $$0, String $$1) throws fgc {
      String $$2 = "/minigames/$MINIGAME_ID/$WORLD_ID".replace("$MINIGAME_ID", $$1).replace("$WORLD_ID", String.valueOf($$0));
      String $$3 = this.c("worlds" + $$2);
      return Boolean.valueOf(this.a(feu.c($$3, "")));
   }

   public ffa b(long $$0, UUID $$1) throws fgc {
      String $$2 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$PROFILE_UUID", UndashedUuid.toString($$1));
      String $$3 = this.c("ops" + $$2);
      return ffa.a(this.a(feu.b($$3, "")));
   }

   public ffa c(long $$0, UUID $$1) throws fgc {
      String $$2 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$PROFILE_UUID", UndashedUuid.toString($$1));
      String $$3 = this.c("ops" + $$2);
      return ffa.a(this.a(feu.b($$3)));
   }

   public Boolean f(long $$0) throws fgc {
      String $$1 = this.c("worlds" + "/$WORLD_ID/open".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(feu.c($$1, ""));
      return Boolean.valueOf($$2);
   }

   public Boolean g(long $$0) throws fgc {
      String $$1 = this.c("worlds" + "/$WORLD_ID/close".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(feu.c($$1, ""));
      return Boolean.valueOf($$2);
   }

   public Boolean a(long $$0, fhz $$1) throws fgc {
      ffo $$2 = new ffo($$1.a(), -1L, $$1.b().b(), $$1.c(), $$1.d());
      String $$3 = this.c("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(feu.a($$3, W.a($$2), 30000, 80000));
      return Boolean.valueOf($$4);
   }

   public Boolean d(long $$0, String $$1) throws fgc {
      ffo $$2 = new ffo(null, Long.valueOf($$1), -1, false, Set.of());
      String $$3 = this.c("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(feu.a($$3, W.a($$2), 30000, 80000));
      return Boolean.valueOf($$4);
   }

   public fft h(long $$0) throws fgc {
      String $$1 = this.c("subscriptions" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(feu.a($$1));
      return fft.a($$2);
   }

   public int h() throws fgc {
      return this.i().a.size();
   }

   public ffc i() throws fgc {
      String $$0 = this.c("invites/pending");
      String $$1 = this.a(feu.a($$0));
      ffc $$2 = ffc.a($$1);
      $$2.a.removeIf(this::a);
      return $$2;
   }

   private boolean a(ffb $$0) {
      return this.e.aN().e($$0.d);
   }

   public void a(String $$0) throws fgc {
      String $$1 = this.c("invites" + "/accept/$INVITATION_ID".replace("$INVITATION_ID", $$0));
      this.a(feu.c($$1, ""));
   }

   public ffw b(long $$0, int $$1) throws fgc {
      String $$2 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID/download".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$3 = this.a(feu.a($$2));
      return ffw.a($$3);
   }

   @Nullable
   public ffu e(long $$0, @Nullable String $$1) throws fgc {
      String $$2 = this.c("worlds" + "/$WORLD_ID/backups/upload".replace("$WORLD_ID", String.valueOf($$0)));
      return ffu.a(this.a(feu.c($$2, ffu.b($$1))));
   }

   public void b(String $$0) throws fgc {
      String $$1 = this.c("invites" + "/reject/$INVITATION_ID".replace("$INVITATION_ID", $$0));
      this.a(feu.c($$1, ""));
   }

   public void j() throws fgc {
      String $$0 = this.c("mco/tos/agreed");
      this.a(feu.b($$0, ""));
   }

   public ffg k() throws fgc {
      String $$0 = this.c("mco/v1/news");
      String $$1 = this.a(feu.a($$0, 5000, 10000));
      return ffg.a($$1);
   }

   public void a(ffd $$0) throws fgc {
      String $$1 = this.c("regions/ping/stat");
      this.a(feu.b($$1, W.a($$0)));
   }

   public Boolean l() throws fgc {
      String $$0 = this.c("trial");
      String $$1 = this.a(feu.a($$0));
      return Boolean.valueOf($$1);
   }

   public void i(long $$0) throws fgc {
      String $$1 = this.c("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(feu.b($$1));
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

   private String a(feu<?> $$0) throws fgc {
      $$0.a("sid", this.c);
      $$0.a("user", this.d);
      $$0.a("version", ab.b().c());
      $$0.a(fem.b());

      try {
         int $$1 = $$0.b();
         if ($$1 != 503 && $$1 != 277) {
            String $$3 = $$0.c();
            if ($$1 >= 200 && $$1 < 300) {
               return $$3;
            } else if ($$1 == 401) {
               String $$4 = $$0.c("WWW-Authenticate");
               b.info("Could not authorize you against Realms server: {}", $$4);
               throw new fgc(new fet.a($$4));
            } else {
               fet $$5 = fet.a($$1, $$3);
               throw new fgc($$5);
            }
         } else {
            int $$2 = $$0.a();
            throw new fgd($$2, $$1);
         }
      } catch (fgb var5) {
         throw new fgc(fet.b.a(var5));
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

      public static Optional<fer.b> a(String $$0) {
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
