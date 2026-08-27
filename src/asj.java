import com.mojang.util.UndashedUuid;
import java.util.UUID;

public class asj {
   public static final String a = "https://aka.ms/MinecraftGDPR";
   public static final String b = "https://aka.ms/MinecraftEULA";
   public static final String c = "http://go.microsoft.com/fwlink/?LinkId=521839";
   public static final String d = "https://aka.ms/MinecraftJavaAttribution";
   public static final String e = "https://aka.ms/MinecraftJavaLicenses";
   public static final String f = "https://aka.ms/BuyMinecraftJava";
   public static final String g = "https://aka.ms/JavaAccountSettings";
   public static final String h = "https://aka.ms/snapshotfeedback?ref=game";
   public static final String i = "https://aka.ms/javafeedback?ref=game";
   public static final String j = "https://aka.ms/snapshotbugs?ref=game";
   public static final String k = "https://aka.ms/Minecraft-Support";
   public static final String l = "https://aka.ms/MinecraftJavaAccessibility";
   public static final String m = "https://aka.ms/aboutjavareporting";
   public static final String n = "https://aka.ms/mcjavamoderation";
   public static final String o = "https://aka.ms/javablocking";
   public static final String p = "https://aka.ms/MinecraftSymLinks";
   public static final String q = "https://aka.ms/startjavarealmstrial";
   public static final String r = "https://aka.ms/BuyJavaRealms";
   public static final String s = "https://aka.ms/MinecraftRealmsTerms";
   public static final String t = "https://aka.ms/MinecraftRealmsContentCreator";

   public static String a(String $$0, UUID $$1, boolean $$2) {
      return a($$0, $$1) + "&ref=" + ($$2 ? "expiredTrial" : "expiredRealm");
   }

   public static String a(String $$0, UUID $$1) {
      return "https://aka.ms/ExtendJavaRealms?subscriptionId=" + $$0 + "&profileId=" + UndashedUuid.toString($$1);
   }
}
