public class fcm {
   private static final agi a = new agi("minecraft", "alt");
   private static final vo b = vo.a.a(a);
   private static final fcm c = new fcm();
   private final ats d = ats.a();
   private final String[] e = new String[]{
      "the",
      "elder",
      "scrolls",
      "klaatu",
      "berata",
      "niktu",
      "xyzzy",
      "bless",
      "curse",
      "light",
      "darkness",
      "fire",
      "air",
      "earth",
      "water",
      "hot",
      "dry",
      "cold",
      "wet",
      "ignite",
      "snuff",
      "embiggen",
      "twist",
      "shorten",
      "stretch",
      "fiddle",
      "destroy",
      "imbue",
      "galvanize",
      "enchant",
      "free",
      "limited",
      "range",
      "of",
      "towards",
      "inside",
      "sphere",
      "cube",
      "self",
      "other",
      "ball",
      "mental",
      "physical",
      "grow",
      "shrink",
      "demon",
      "elemental",
      "spirit",
      "animal",
      "creature",
      "beast",
      "humanoid",
      "undead",
      "fresh",
      "stale",
      "phnglui",
      "mglwnafh",
      "cthulhu",
      "rlyeh",
      "wgahnagl",
      "fhtagn",
      "baguette"
   };

   private fcm() {
   }

   public static fcm a() {
      return c;
   }

   public uw a(eum $$0, int $$1) {
      StringBuilder $$2 = new StringBuilder();
      int $$3 = this.d.a(2) + 3;

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         if ($$4 != 0) {
            $$2.append(" ");
         }

         $$2.append(ac.a(this.e, this.d));
      }

      return $$0.b().a(ur.b($$2.toString()).c(b), $$1, vo.a);
   }

   public void a(long $$0) {
      this.d.b($$0);
   }
}
