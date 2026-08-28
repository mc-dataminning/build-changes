public enum dzn implements bag {
   a("harp", awk.sG, dzn.a.a),
   b("basedrum", awk.sA, dzn.a.a),
   c("snare", awk.sJ, dzn.a.a),
   d("hat", awk.sH, dzn.a.a),
   e("bass", awk.sB, dzn.a.a),
   f("flute", awk.sE, dzn.a.a),
   g("bell", awk.sC, dzn.a.a),
   h("guitar", awk.sF, dzn.a.a),
   i("chime", awk.sD, dzn.a.a),
   j("xylophone", awk.sK, dzn.a.a),
   k("iron_xylophone", awk.sL, dzn.a.a),
   l("cow_bell", awk.sM, dzn.a.a),
   m("didgeridoo", awk.sN, dzn.a.a),
   n("bit", awk.sO, dzn.a.a),
   o("banjo", awk.sP, dzn.a.a),
   p("pling", awk.sI, dzn.a.a),
   q("zombie", awk.sQ, dzn.a.b),
   r("skeleton", awk.sR, dzn.a.b),
   s("creeper", awk.sS, dzn.a.b),
   t("dragon", awk.sT, dzn.a.b),
   u("wither_skeleton", awk.sU, dzn.a.b),
   v("piglin", awk.sV, dzn.a.b),
   w("custom_head", awk.Bp, dzn.a.c);

   private final String x;
   private final js<awj> y;
   private final dzn.a z;

   private dzn(final String $$0, final js<awj> $$1, final dzn.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public js<awj> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dzn.a.a;
   }

   public boolean d() {
      return this.z == dzn.a.c;
   }

   public boolean e() {
      return this.z != dzn.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
