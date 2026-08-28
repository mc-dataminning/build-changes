public enum eap implements bai {
   a("harp", awl.sG, eap.a.a),
   b("basedrum", awl.sA, eap.a.a),
   c("snare", awl.sJ, eap.a.a),
   d("hat", awl.sH, eap.a.a),
   e("bass", awl.sB, eap.a.a),
   f("flute", awl.sE, eap.a.a),
   g("bell", awl.sC, eap.a.a),
   h("guitar", awl.sF, eap.a.a),
   i("chime", awl.sD, eap.a.a),
   j("xylophone", awl.sK, eap.a.a),
   k("iron_xylophone", awl.sL, eap.a.a),
   l("cow_bell", awl.sM, eap.a.a),
   m("didgeridoo", awl.sN, eap.a.a),
   n("bit", awl.sO, eap.a.a),
   o("banjo", awl.sP, eap.a.a),
   p("pling", awl.sI, eap.a.a),
   q("zombie", awl.sQ, eap.a.b),
   r("skeleton", awl.sR, eap.a.b),
   s("creeper", awl.sS, eap.a.b),
   t("dragon", awl.sT, eap.a.b),
   u("wither_skeleton", awl.sU, eap.a.b),
   v("piglin", awl.sV, eap.a.b),
   w("custom_head", awl.Bp, eap.a.c);

   private final String x;
   private final je<awk> y;
   private final eap.a z;

   private eap(final String $$0, final je<awk> $$1, final eap.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public je<awk> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == eap.a.a;
   }

   public boolean d() {
      return this.z == eap.a.c;
   }

   public boolean e() {
      return this.z != eap.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
