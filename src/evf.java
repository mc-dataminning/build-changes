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

public class evf {
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

   evf(UUID $$0, boolean $$1, boolean $$2, String $$3) {
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

   public static List<evf> a(String $$0) {
      List<evf> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : JsonParser.parseString($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static evf a(JsonObject $$0) {
      UUID $$1 = exs.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = exs.a("dismissable", $$0, true);
         boolean $$3 = exs.a("seen", $$0, false);
         String $$4 = exs.a("type", $$0);
         evf $$5 = new evf($$1, $$2, $$3, $$4);

         return (evf)(switch ($$4) {
            case "visitUrl" -> evf.c.a($$5, $$0);
            case "infoPopup" -> evf.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends evf {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final evm e;
      private final evm f;
      private final ajh g;
      @Nullable
      private final evf.b h;

      private a(evf $$0, evm $$1, evm $$2, ajh $$3, @Nullable evf.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static evf.a a(evf $$0, JsonObject $$1) {
         evm $$2 = exs.a("title", $$1, evm::a);
         evm $$3 = exs.a("message", $$1, evm::a);
         ajh $$4 = new ajh(exs.a("image", $$1));
         evf.b $$5 = exs.b("urlButton", $$1, evf.b::a);
         return new evf.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fci a(fhf $$0, Consumer<UUID> $$1) {
         vu $$2 = this.e.a();
         if ($$2 == null) {
            evf.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fci.a $$3 = new fci.a($$0, $$2).a(this.g).a(this.f.a(vt.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(evf.h), $$2x -> {
                  ezg $$3x = ezg.Q();
                  $$3x.a(new ffw($$3xx -> {
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

   static record b(String a, evm b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static evf.b a(JsonObject $$0) {
         String $$1 = exs.a("url", $$0);
         evm $$2 = exs.a("urlText", $$0, evm::a);
         return new evf.b($$1, $$2);
      }
   }

   public static class c extends evf {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final evm e;
      private final evm f;

      private c(evf $$0, String $$1, evm $$2, evm $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static evf.c a(evf $$0, JsonObject $$1) {
         String $$2 = exs.a("url", $$1);
         evm $$3 = exs.a("buttonText", $$1, evm::a);
         evm $$4 = exs.a("message", $$1, evm::a);
         return new evf.c($$0, $$2, $$3, $$4);
      }

      public vu d() {
         return this.f.a(vu.c("mco.notification.visitUrl.message.default"));
      }

      public fbg a(fhf $$0) {
         vu $$1 = this.e.a(evf.h);
         return fbg.a($$1, ffw.b($$0, this.d)).a();
      }
   }
}
