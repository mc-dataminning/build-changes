import com.mojang.util.UndashedUuid;
import java.net.URI;
import java.util.UUID;

public class ayg {
   public static final URI a = URI.create("https://aka.ms/MinecraftGDPR");
   public static final URI b = URI.create("https://aka.ms/MinecraftEULA");
   public static final URI c = URI.create("http://go.microsoft.com/fwlink/?LinkId=521839");
   public static final URI d = URI.create("https://aka.ms/MinecraftJavaAttribution");
   public static final URI e = URI.create("https://aka.ms/MinecraftJavaLicenses");
   public static final URI f = URI.create("https://aka.ms/BuyMinecraftJava");
   public static final URI g = URI.create("https://aka.ms/JavaAccountSettings");
   public static final URI h = URI.create("https://aka.ms/snapshotfeedback?ref=game");
   public static final URI i = URI.create("https://aka.ms/javafeedback?ref=game");
   public static final URI j = URI.create("https://aka.ms/snapshotbugs?ref=game");
   public static final URI k = URI.create("https://aka.ms/Minecraft-Support");
   public static final URI l = URI.create("https://aka.ms/MinecraftJavaAccessibility");
   public static final URI m = URI.create("https://aka.ms/aboutjavareporting");
   public static final URI n = URI.create("https://aka.ms/mcjavamoderation");
   public static final URI o = URI.create("https://aka.ms/javablocking");
   public static final URI p = URI.create("https://aka.ms/MinecraftSymLinks");
   public static final URI q = URI.create("https://aka.ms/startjavarealmstrial");
   public static final URI r = URI.create("https://aka.ms/BuyJavaRealms");
   public static final URI s = URI.create("https://aka.ms/MinecraftRealmsTerms");
   public static final URI t = URI.create("https://aka.ms/MinecraftRealmsContentCreator");

   public static String a(String $$0, UUID $$1, boolean $$2) {
      return a($$0, $$1) + "&ref=" + ($$2 ? "expiredTrial" : "expiredRealm");
   }

   public static String a(String $$0, UUID $$1) {
      return "https://aka.ms/ExtendJavaRealms?subscriptionId=" + $$0 + "&profileId=" + UndashedUuid.toString($$1);
   }
}
