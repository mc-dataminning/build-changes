import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class emp {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final tl h = tl.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   emp(UUID $$0, boolean $$1, boolean $$2, String $$3) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = $$3;
   }

   public boolean a() {
      return this.k;
   }

   public boolean b() {
      return this.j;
   }

   public UUID c() {
      return this.i;
   }

   public static List<emp> a(String $$0) {
      List<emp> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static emp a(JsonObject $$0) {
      UUID $$1 = epc.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = epc.a("dismissable", $$0, true);
         boolean $$3 = epc.a("seen", $$0, false);
         String $$4 = epc.a("type", $$0);
         emp $$5 = new emp($$1, $$2, $$3, $$4);

         return (emp)(switch ($$4) {
            case "visitUrl" -> emp.c.a($$5, $$0);
            case "infoPopup" -> emp.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends emp {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final emw e;
      private final emw f;
      private final aez g;
      @Nullable
      private final emp.b h;

      private a(emp $$0, emw $$1, emw $$2, aez $$3, @Nullable emp.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static emp.a a(emp $$0, JsonObject $$1) {
         emw $$2 = epc.a("title", $$1, emw::a);
         emw $$3 = epc.a("message", $$1, emw::a);
         aez $$4 = new aez(epc.a("image", $$1));
         emp.b $$5 = epc.b("urlButton", $$1, emp.b::a);
         return new emp.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public etm a(eye $$0, Consumer<UUID> $$1) {
         tl $$2 = this.e.a();
         if ($$2 == null) {
            emp.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            etm.a $$3 = new etm.a($$0, $$2).a(this.g).a(this.f.a(tk.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(emp.h), $$2x -> {
                  eqp $$3x = eqp.O();
                  $$3x.a(new ewx($$3xx -> {
                     if ($$3xx) {
                        ac.i().a(this.h.a);
                        $$3x.a($$0);
                     } else {
                        $$3x.a($$2x);
                     }
                  }, this.h.a, true));
                  $$1.accept(this.c());
               });
            }

            $$3.a(tk.h, $$1x -> {
               $$1x.az_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, emw b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static emp.b a(JsonObject $$0) {
         String $$1 = epc.a("url", $$0);
         emw $$2 = epc.a("urlText", $$0, emw::a);
         return new emp.b($$1, $$2);
      }
   }

   public static class c extends emp {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final emw e;
      private final emw f;

      private c(emp $$0, String $$1, emw $$2, emw $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static emp.c a(emp $$0, JsonObject $$1) {
         String $$2 = epc.a("url", $$1);
         emw $$3 = epc.a("buttonText", $$1, emw::a);
         emw $$4 = epc.a("message", $$1, emw::a);
         return new emp.c($$0, $$2, $$3, $$4);
      }

      public tl d() {
         return this.f.a(tl.c("mco.notification.visitUrl.message.default"));
      }

      public esk a(eye $$0) {
         tl $$1 = this.e.a(emp.h);
         return esk.a($$1, ewx.b(this.d, $$0, true)).a();
      }
   }
}
