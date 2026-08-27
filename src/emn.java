import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;

public class emn {
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

   emn(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<emn> a(String $$0) {
      List<emn> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static emn a(JsonObject $$0) {
      UUID $$1 = epa.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = epa.a("dismissable", $$0, true);
         boolean $$3 = epa.a("seen", $$0, false);
         String $$4 = epa.a("type", $$0);
         emn $$5 = new emn($$1, $$2, $$3, $$4);
         return (emn)("visitUrl".equals($$4) ? emn.a.a($$5, $$0) : $$5);
      }
   }

   public static class a extends emn {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final emu e;
      private final emu f;

      private a(emn $$0, String $$1, emu $$2, emu $$3) {
         super($$0.g, $$0.h, $$0.i, $$0.j);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static emn.a a(emn $$0, JsonObject $$1) {
         String $$2 = epa.a("url", $$1);
         emu $$3 = epa.a("buttonText", $$1, emu::a);
         emu $$4 = epa.a("message", $$1, emu::a);
         return new emn.a($$0, $$2, $$3, $$4);
      }

      public te d() {
         return this.f.a(te.c("mco.notification.visitUrl.message.default"));
      }

      public esi a(exv $$0) {
         te $$1 = this.e.a(te.c("mco.notification.visitUrl.buttonText.default"));
         return esi.a($$1, ewn.b(this.d, $$0, true)).a();
      }
   }
}
