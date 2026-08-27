public record buq(aeu l) {
   public static final aet<buq> a = a("tabby");
   public static final aet<buq> b = a("black");
   public static final aet<buq> c = a("red");
   public static final aet<buq> d = a("siamese");
   public static final aet<buq> e = a("british_shorthair");
   public static final aet<buq> f = a("calico");
   public static final aet<buq> g = a("persian");
   public static final aet<buq> h = a("ragdoll");
   public static final aet<buq> i = a("white");
   public static final aet<buq> j = a("jellie");
   public static final aet<buq> k = a("all_black");

   private static aet<buq> a(String $$0) {
      return aet.a(je.j, new aeu($$0));
   }

   public static buq a(ht<buq> $$0) {
      a($$0, a, "textures/entity/cat/tabby.png");
      a($$0, b, "textures/entity/cat/black.png");
      a($$0, c, "textures/entity/cat/red.png");
      a($$0, d, "textures/entity/cat/siamese.png");
      a($$0, e, "textures/entity/cat/british_shorthair.png");
      a($$0, f, "textures/entity/cat/calico.png");
      a($$0, g, "textures/entity/cat/persian.png");
      a($$0, h, "textures/entity/cat/ragdoll.png");
      a($$0, i, "textures/entity/cat/white.png");
      a($$0, j, "textures/entity/cat/jellie.png");
      return a($$0, k, "textures/entity/cat/all_black.png");
   }

   private static buq a(ht<buq> $$0, aet<buq> $$1, String $$2) {
      return ht.a($$0, $$1, new buq(new aeu($$2)));
   }

   public aeu a() {
      return this.l;
   }
}
