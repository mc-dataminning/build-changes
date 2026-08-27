public enum dgk implements asp {
   a("harp", ape.qp, dgk.a.a),
   b("basedrum", ape.qj, dgk.a.a),
   c("snare", ape.qs, dgk.a.a),
   d("hat", ape.qq, dgk.a.a),
   e("bass", ape.qk, dgk.a.a),
   f("flute", ape.qn, dgk.a.a),
   g("bell", ape.ql, dgk.a.a),
   h("guitar", ape.qo, dgk.a.a),
   i("chime", ape.qm, dgk.a.a),
   j("xylophone", ape.qt, dgk.a.a),
   k("iron_xylophone", ape.qu, dgk.a.a),
   l("cow_bell", ape.qv, dgk.a.a),
   m("didgeridoo", ape.qw, dgk.a.a),
   n("bit", ape.qx, dgk.a.a),
   o("banjo", ape.qy, dgk.a.a),
   p("pling", ape.qr, dgk.a.a),
   q("zombie", ape.qz, dgk.a.b),
   r("skeleton", ape.qA, dgk.a.b),
   s("creeper", ape.qB, dgk.a.b),
   t("dragon", ape.qC, dgk.a.b),
   u("wither_skeleton", ape.qD, dgk.a.b),
   v("piglin", ape.qE, dgk.a.b),
   w("custom_head", ape.yu, dgk.a.c);

   private final String x;
   private final hg<apd> y;
   private final dgk.a z;

   private dgk(String $$0, hg<apd> $$1, dgk.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public hg<apd> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dgk.a.a;
   }

   public boolean d() {
      return this.z == dgk.a.c;
   }

   public boolean e() {
      return this.z != dgk.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
