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

public class evh {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final vu h = vu.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   evh(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<evh> a(String $$0) {
      List<evh> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static evh a(JsonObject $$0) {
      UUID $$1 = exu.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = exu.a("dismissable", $$0, true);
         boolean $$3 = exu.a("seen", $$0, false);
         String $$4 = exu.a("type", $$0);
         evh $$5 = new evh($$1, $$2, $$3, $$4);

         return (evh)(switch ($$4) {
            case "visitUrl" -> evh.c.a($$5, $$0);
            case "infoPopup" -> evh.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends evh {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final evo e;
      private final evo f;
      private final ajh g;
      @Nullable
      private final evh.b h;

      private a(evh $$0, evo $$1, evo $$2, ajh $$3, @Nullable evh.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static evh.a a(evh $$0, JsonObject $$1) {
         evo $$2 = exu.a("title", $$1, evo::a);
         evo $$3 = exu.a("message", $$1, evo::a);
         ajh $$4 = new ajh(exu.a("image", $$1));
         evh.b $$5 = exu.b("urlButton", $$1, evh.b::a);
         return new evh.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fck a(fhh $$0, Consumer<UUID> $$1) {
         vu $$2 = this.e.a();
         if ($$2 == null) {
            evh.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fck.a $$3 = new fck.a($$0, $$2).a(this.g).a(this.f.a(vt.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(evh.h), $$2x -> {
                  ezi $$3x = ezi.Q();
                  $$3x.a(new ffy($$3xx -> {
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

            $$3.a(vt.h, $$1x -> {
               $$1x.d();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, evo b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static evh.b a(JsonObject $$0) {
         String $$1 = exu.a("url", $$0);
         evo $$2 = exu.a("urlText", $$0, evo::a);
         return new evh.b($$1, $$2);
      }
   }

   public static class c extends evh {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final evo e;
      private final evo f;

      private c(evh $$0, String $$1, evo $$2, evo $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static evh.c a(evh $$0, JsonObject $$1) {
         String $$2 = exu.a("url", $$1);
         evo $$3 = exu.a("buttonText", $$1, evo::a);
         evo $$4 = exu.a("message", $$1, evo::a);
         return new evh.c($$0, $$2, $$3, $$4);
      }

      public vu d() {
         return this.f.a(vu.c("mco.notification.visitUrl.message.default"));
      }

      public fbi a(fhh $$0) {
         vu $$1 = this.e.a(evh.h);
         return fbi.a($$1, ffy.b($$0, this.d)).a();
      }
   }
}
