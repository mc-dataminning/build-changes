import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.microsoft.aad.msal4j.ClientCredentialFactory;
import com.microsoft.aad.msal4j.ClientCredentialParameters;
import com.microsoft.aad.msal4j.ConfidentialClientApplication;
import com.microsoft.aad.msal4j.IAuthenticationResult;
import com.microsoft.aad.msal4j.IClientCertificate;
import com.microsoft.aad.msal4j.ConfidentialClientApplication.Builder;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import javax.annotation.Nullable;

public class asl extends asu {
   private final ConfidentialClientApplication b;
   private final ClientCredentialParameters c;
   private final Set<String> d;
   private final int e;

   private asl(URL $$0, asu.b $$1, asu.a $$2, ExecutorService $$3, ConfidentialClientApplication $$4, ClientCredentialParameters $$5, Set<String> $$6, int $$7) {
      super($$0, $$1, $$2, $$3);
      this.b = $$4;
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
   }

   @Nullable
   public static asu a(String $$0) {
      JsonObject $$1 = ayz.a($$0);
      URI $$2 = URI.create(ayz.i($$1, "apiServer"));
      String $$3 = ayz.i($$1, "apiPath");
      String $$4 = ayz.i($$1, "scope");
      String $$5 = ayz.a($$1, "serverId", "");
      String $$6 = ayz.i($$1, "applicationId");
      String $$7 = ayz.i($$1, "tenantId");
      String $$8 = ayz.a($$1, "roomId", "Java:Chat");
      String $$9 = ayz.i($$1, "certificatePath");
      String $$10 = ayz.a($$1, "certificatePassword", "");
      int $$11 = ayz.a($$1, "hashesToDrop", -1);
      int $$12 = ayz.a($$1, "maxConcurrentRequests", 7);
      JsonArray $$13 = ayz.v($$1, "fullyFilteredEvents");
      Set<String> $$14 = new HashSet<>();
      $$13.forEach($$1x -> $$14.add(ayz.a($$1x, "filteredEvent")));
      int $$15 = ayz.a($$1, "connectionReadTimeoutMs", 2000);

      URL $$16;
      try {
         $$16 = $$2.resolve($$3).toURL();
      } catch (MalformedURLException var26) {
         throw new RuntimeException(var26);
      }

      asu.b $$19 = ($$2x, $$3x) -> {
         JsonObject $$4x = new JsonObject();
         $$4x.addProperty("userId", $$2x.getId().toString());
         $$4x.addProperty("userDisplayName", $$2x.getName());
         $$4x.addProperty("server", $$5);
         $$4x.addProperty("room", $$8);
         $$4x.addProperty("area", "JavaChatRealms");
         $$4x.addProperty("data", $$3x);
         $$4x.addProperty("language", "*");
         return $$4x;
      };
      asu.a $$20 = asu.a.select($$11);
      ExecutorService $$21 = a($$12);

      IClientCertificate $$23;
      try (InputStream $$22 = Files.newInputStream(Path.of($$9))) {
         $$23 = ClientCredentialFactory.createFromCertificate($$22, $$10);
      } catch (Exception var28) {
         a.warn("Failed to open certificate file");
         return null;
      }

      ConfidentialClientApplication $$27;
      try {
         $$27 = ((Builder)((Builder)ConfidentialClientApplication.builder($$6, $$23).sendX5c(true).executorService($$21))
               .authority(String.format(Locale.ROOT, "https://login.microsoftonline.com/%s/", $$7)))
            .build();
      } catch (Exception var25) {
         a.warn("Failed to create confidential client application");
         return null;
      }

      ClientCredentialParameters $$30 = ClientCredentialParameters.builder(Set.of($$4)).build();
      return new asl($$16, $$19, $$20, $$21, $$27, $$30, $$14, $$15);
   }

   private IAuthenticationResult b() {
      return (IAuthenticationResult)this.b.acquireToken(this.c).join();
   }

   @Override
   protected void a(HttpURLConnection $$0) {
      IAuthenticationResult $$1 = this.b();
      $$0.setRequestProperty("Authorization", "Bearer " + $$1.accessToken());
   }

   @Override
   protected asf a(String $$0, asu.a $$1, JsonObject $$2) {
      JsonObject $$3 = ayz.a($$2, "result", null);
      if ($$3 == null) {
         return asf.b($$0);
      } else {
         boolean $$4 = ayz.a($$3, "filtered", true);
         if (!$$4) {
            return asf.a($$0);
         } else {
            for (JsonElement $$6 : ayz.a($$3, "events", new JsonArray())) {
               JsonObject $$7 = $$6.getAsJsonObject();
               String $$8 = ayz.a($$7, "id", "");
               if (this.d.contains($$8)) {
                  return asf.b($$0);
               }
            }

            JsonArray $$9 = ayz.a($$3, "redactedTextIndex", new JsonArray());
            return new asf($$0, this.a($$0, $$9, $$1));
         }
      }
   }

   @Override
   protected int a() {
      return this.e;
   }
}
