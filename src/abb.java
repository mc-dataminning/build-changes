import java.util.UUID;

public class abb {
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

   public static String a(biq $$0) {
      if ($$0 instanceof cbu) {
         return $$0.ac().getString();
      } else {
         tl $$1 = $$0.ae();
         return $$1 != null ? $$1.getString() : a($$0.cw());
      }
   }

   public static String a(UUID $$0) {
      asc $$1 = b($$0);
      return a($$1, a) + a($$1, b);
   }

   private static String a(asc $$0, String[] $$1) {
      return ac.a($$1, $$0);
   }

   private static asc b(UUID $$0) {
      return asc.a((long)($$0.hashCode() >> 2));
   }
}
