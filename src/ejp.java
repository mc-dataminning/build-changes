import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;

public class ejp {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   final UUID g;
   final boolean h;
   final boolean i;
   final String j;

   ejp(UUID $$0, boolean $$1, boolean $$2, String $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
   }

   public boolean a() {
      return this.i;
   }

   public boolean b() {
      return this.h;
   }

   public UUID c() {
      return this.g;
   }

   public static List<ejp> a(String $$0) {
      List<ejp> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static ejp a(JsonObject $$0) {
      UUID $$1 = emb.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = emb.a("dismissable", $$0, true);
         boolean $$3 = emb.a("seen", $$0, false);
         String $$4 = emb.a("type", $$0);
         ejp $$5 = new ejp($$1, $$2, $$3, $$4);
         return (ejp)("visitUrl".equals($$4) ? ejp.a.a($$5, $$0) : $$5);
      }
   }

   public static class a extends ejp {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final ejw e;
      private final ejw f;

      private a(ejp $$0, String $$1, ejw $$2, ejw $$3) {
         super($$0.g, $$0.h, $$0.i, $$0.j);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static ejp.a a(ejp $$0, JsonObject $$1) {
         String $$2 = emb.a("url", $$1);
         ejw $$3 = emb.a("buttonText", $$1, ejw::a);
         ejw $$4 = emb.a("message", $$1, ejw::a);
         return new ejp.a($$0, $$2, $$3, $$4);
      }

      public sw d() {
         return this.f.a(sw.c("mco.notification.visitUrl.message.default"));
      }

      public epi a(euq $$0) {
         sw $$1 = this.e.a(sw.c("mco.notification.visitUrl.buttonText.default"));
         return epi.a($$1, etj.b(this.d, $$0, true)).a();
      }
   }
}
