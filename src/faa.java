public class faa {
   private static final aew a = new aew("minecraft", "alt");
   private static final uh b = uh.a.a(a);
   private static final faa c = new faa();
   private final asc d = asc.a();
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

   private faa() {
   }

   public static faa a() {
      return c;
   }

   public tp a(esd $$0, int $$1) {
      StringBuilder $$2 = new StringBuilder();
      int $$3 = this.d.a(2) + 3;

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         if ($$4 != 0) {
            $$2.append(" ");
         }

         $$2.append(ac.a(this.e, this.d));
      }

      return $$0.b().a(tl.b($$2.toString()).c(b), $$1, uh.a);
   }

   public void a(long $$0) {
      this.d.b($$0);
   }
}
