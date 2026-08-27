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

public class etn {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final vq h = vq.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   etn(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<etn> a(String $$0) {
      List<etn> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static etn a(JsonObject $$0) {
      UUID $$1 = ewa.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = ewa.a("dismissable", $$0, true);
         boolean $$3 = ewa.a("seen", $$0, false);
         String $$4 = ewa.a("type", $$0);
         etn $$5 = new etn($$1, $$2, $$3, $$4);

         return (etn)(switch ($$4) {
            case "visitUrl" -> etn.c.a($$5, $$0);
            case "infoPopup" -> etn.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends etn {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final etu e;
      private final etu f;
      private final aiy g;
      @Nullable
      private final etn.b h;

      private a(etn $$0, etu $$1, etu $$2, aiy $$3, @Nullable etn.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static etn.a a(etn $$0, JsonObject $$1) {
         etu $$2 = ewa.a("title", $$1, etu::a);
         etu $$3 = ewa.a("message", $$1, etu::a);
         aiy $$4 = new aiy(ewa.a("image", $$1));
         etn.b $$5 = ewa.b("urlButton", $$1, etn.b::a);
         return new etn.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public faq a(ffl $$0, Consumer<UUID> $$1) {
         vq $$2 = this.e.a();
         if ($$2 == null) {
            etn.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            faq.a $$3 = new faq.a($$0, $$2).a(this.g).a(this.f.a(vp.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(etn.h), $$2x -> {
                  exo $$3x = exo.P();
                  $$3x.a(new fed($$3xx -> {
                     if ($$3xx) {
                        ac.j().a(this.h.a);
                        $$3x.a($$0);
                     } else {
                        $$3x.a($$2x);
                     }
                  }, this.h.a, true));
                  $$1.accept(this.c());
               });
            }

            $$3.a(vp.h, $$1x -> {
               $$1x.d();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, etu b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static etn.b a(JsonObject $$0) {
         String $$1 = ewa.a("url", $$0);
         etu $$2 = ewa.a("urlText", $$0, etu::a);
         return new etn.b($$1, $$2);
      }
   }

   public static class c extends etn {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final etu e;
      private final etu f;

      private c(etn $$0, String $$1, etu $$2, etu $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static etn.c a(etn $$0, JsonObject $$1) {
         String $$2 = ewa.a("url", $$1);
         etu $$3 = ewa.a("buttonText", $$1, etu::a);
         etu $$4 = ewa.a("message", $$1, etu::a);
         return new etn.c($$0, $$2, $$3, $$4);
      }

      public vq d() {
         return this.f.a(vq.c("mco.notification.visitUrl.message.default"));
      }

      public ezo a(ffl $$0) {
         vq $$1 = this.e.a(etn.h);
         return ezo.a($$1, fed.b($$0, this.d)).a();
      }
   }
}
