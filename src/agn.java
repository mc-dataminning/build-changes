import java.util.UUID;

public class agn {
   private static final String[] a = new String[]{
      "Slim",
      "Far",
      "River",
      "Silly",
      "Fat",
      "Thin",
      "Fish",
      "Bat",
      "Dark",
      "Oak",
      "Sly",
      "Bush",
      "Zen",
      "Bark",
      "Cry",
      "Slack",
      "Soup",
      "Grim",
      "Hook",
      "Dirt",
      "Mud",
      "Sad",
      "Hard",
      "Crook",
      "Sneak",
      "Stink",
      "Weird",
      "Fire",
      "Soot",
      "Soft",
      "Rough",
      "Cling",
      "Scar"
   };
   private static final String[] b = new String[]{
      "Fox",
      "Tail",
      "Jaw",
      "Whisper",
      "Twig",
      "Root",
      "Finder",
      "Nose",
      "Brow",
      "Blade",
      "Fry",
      "Seek",
      "Wart",
      "Tooth",
      "Foot",
      "Leaf",
      "Stone",
      "Fall",
      "Face",
      "Tongue",
      "Voice",
      "Lip",
      "Mouth",
      "Snail",
      "Toe",
      "Ear",
      "Hair",
      "Beard",
      "Shirt",
      "Fist"
   };

   public static String a(btr $$0) {
      if ($$0 instanceof cnx) {
         return $$0.aj().getString();
      } else {
         xe $$1 = $$0.al();
         return $$1 != null ? $$1.getString() : a($$0.cD());
      }
   }

   public static String a(UUID $$0) {
      azn $$1 = b($$0);
      return a($$1, a) + a($$1, b);
   }

   private static String a(azn $$0, String[] $$1) {
      return ad.a($$1, $$0);
   }

   private static azn b(UUID $$0) {
      return azn.a((long)($$0.hashCode() >> 2));
   }
}
