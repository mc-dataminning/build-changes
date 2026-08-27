public class fdu {
   private static final agt a = new agt("minecraft", "alt");
   private static final vy b = vy.a.a(a);
   private static final fdu c = new fdu();
   private final auf d = auf.a();
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

   private fdu() {
   }

   public static fdu a() {
      return c;
   }

   public vg a(evu $$0, int $$1) {
      StringBuilder $$2 = new StringBuilder();
      int $$3 = this.d.a(2) + 3;

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         if ($$4 != 0) {
            $$2.append(" ");
         }

         $$2.append(ac.a(this.e, this.d));
      }

      return $$0.b().a(vb.b($$2.toString()).c(b), $$1, vy.a);
   }

   public void a(long $$0) {
      this.d.b($$0);
   }
}
