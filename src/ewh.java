public class ewh {
   private static final acq a = new acq("minecraft", "alt");
   private static final ts b = ts.a.a(a);
   private static final ewh c = new ewh();
   private final apf d = apf.a();
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

   private ewh() {
   }

   public static ewh a() {
      return c;
   }

   public ta a(eov $$0, int $$1) {
      StringBuilder $$2 = new StringBuilder();
      int $$3 = this.d.a(2) + 3;

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         if ($$4 != 0) {
            $$2.append(" ");
         }

         $$2.append(ac.a(this.e, this.d));
      }

      return $$0.b().a(sw.b($$2.toString()).c(b), $$1, ts.a);
   }

   public void a(long $$0) {
      this.d.b($$0);
   }
}
