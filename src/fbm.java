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

public class fbm {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final wu h = wu.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   fbm(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<fbm> a(String $$0) {
      List<fbm> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fbm a(JsonObject $$0) {
      UUID $$1 = fdz.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fdz.a("dismissable", $$0, true);
         boolean $$3 = fdz.a("seen", $$0, false);
         String $$4 = fdz.a("type", $$0);
         fbm $$5 = new fbm($$1, $$2, $$3, $$4);

         return (fbm)(switch ($$4) {
            case "visitUrl" -> fbm.c.a($$5, $$0);
            case "infoPopup" -> fbm.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fbm {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fbt e;
      private final fbt f;
      private final akk g;
      @Nullable
      private final fbm.b h;

      private a(fbm $$0, fbt $$1, fbt $$2, akk $$3, @Nullable fbm.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fbm.a a(fbm $$0, JsonObject $$1) {
         fbt $$2 = fdz.a("title", $$1, fbt::a);
         fbt $$3 = fdz.a("message", $$1, fbt::a);
         akk $$4 = new akk(fdz.a("image", $$1));
         fbm.b $$5 = fdz.b("urlButton", $$1, fbm.b::a);
         return new fbm.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fio a(fnd $$0, Consumer<UUID> $$1) {
         wu $$2 = this.e.a();
         if ($$2 == null) {
            fbm.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fio.a $$3 = new fio.a($$0, $$2).a(this.g).a(this.f.a(wt.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fbm.h), $$2x -> {
                  ffn $$3x = ffn.Q();
                  $$3x.a(new fma($$3xx -> {
                     if ($$3xx) {
                        ac.k().a(this.h.a);
                        $$3x.a($$0);
                     } else {
                        $$3x.a($$2x);
                     }
                  }, this.h.a, true));
                  $$1.accept(this.c());
               });
            }

            $$3.a(wt.h, $$1x -> {
               $$1x.d();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   static record b(String a, fbt b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fbm.b a(JsonObject $$0) {
         String $$1 = fdz.a("url", $$0);
         fbt $$2 = fdz.a("urlText", $$0, fbt::a);
         return new fbm.b($$1, $$2);
      }
   }

   public static class c extends fbm {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fbt e;
      private final fbt f;

      private c(fbm $$0, String $$1, fbt $$2, fbt $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fbm.c a(fbm $$0, JsonObject $$1) {
         String $$2 = fdz.a("url", $$1);
         fbt $$3 = fdz.a("buttonText", $$1, fbt::a);
         fbt $$4 = fdz.a("message", $$1, fbt::a);
         return new fbm.c($$0, $$2, $$3, $$4);
      }

      public wu d() {
         return this.f.a(wu.c("mco.notification.visitUrl.message.default"));
      }

      public fhm a(fnd $$0) {
         wu $$1 = this.e.a(fbm.h);
         return fhm.a($$1, fma.b($$0, this.d)).a();
      }
   }
}
