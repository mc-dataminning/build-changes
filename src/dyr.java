public enum dyr implements azv {
   a("harp", awa.sG, dyr.a.a),
   b("basedrum", awa.sA, dyr.a.a),
   c("snare", awa.sJ, dyr.a.a),
   d("hat", awa.sH, dyr.a.a),
   e("bass", awa.sB, dyr.a.a),
   f("flute", awa.sE, dyr.a.a),
   g("bell", awa.sC, dyr.a.a),
   h("guitar", awa.sF, dyr.a.a),
   i("chime", awa.sD, dyr.a.a),
   j("xylophone", awa.sK, dyr.a.a),
   k("iron_xylophone", awa.sL, dyr.a.a),
   l("cow_bell", awa.sM, dyr.a.a),
   m("didgeridoo", awa.sN, dyr.a.a),
   n("bit", awa.sO, dyr.a.a),
   o("banjo", awa.sP, dyr.a.a),
   p("pling", awa.sI, dyr.a.a),
   q("zombie", awa.sQ, dyr.a.b),
   r("skeleton", awa.sR, dyr.a.b),
   s("creeper", awa.sS, dyr.a.b),
   t("dragon", awa.sT, dyr.a.b),
   u("wither_skeleton", awa.sU, dyr.a.b),
   v("piglin", awa.sV, dyr.a.b),
   w("custom_head", awa.Bp, dyr.a.c);

   private final String x;
   private final jr<avz> y;
   private final dyr.a z;

   private dyr(final String $$0, final jr<avz> $$1, final dyr.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public jr<avz> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dyr.a.a;
   }

   public boolean d() {
      return this.z == dyr.a.c;
   }

   public boolean e() {
      return this.z != dyr.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
