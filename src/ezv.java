public class ezv {
   private static final aez a = new aez("minecraft", "alt");
   private static final ui b = ui.a.a(a);
   private static final ezv c = new ezv();
   private final ash d = ash.a();
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

   private ezv() {
   }

   public static ezv a() {
      return c;
   }

   public tq a(erx $$0, int $$1) {
      StringBuilder $$2 = new StringBuilder();
      int $$3 = this.d.a(2) + 3;

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         if ($$4 != 0) {
            $$2.append(" ");
         }

         $$2.append(ac.a(this.e, this.d));
      }

      return $$0.b().a(tl.b($$2.toString()).c(b), $$1, ui.a);
   }

   public void a(long $$0) {
      this.d.b($$0);
   }
}
