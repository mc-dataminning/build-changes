public enum dfz implements asf {
   a("harp", aou.qp, dfz.a.a),
   b("basedrum", aou.qj, dfz.a.a),
   c("snare", aou.qs, dfz.a.a),
   d("hat", aou.qq, dfz.a.a),
   e("bass", aou.qk, dfz.a.a),
   f("flute", aou.qn, dfz.a.a),
   g("bell", aou.ql, dfz.a.a),
   h("guitar", aou.qo, dfz.a.a),
   i("chime", aou.qm, dfz.a.a),
   j("xylophone", aou.qt, dfz.a.a),
   k("iron_xylophone", aou.qu, dfz.a.a),
   l("cow_bell", aou.qv, dfz.a.a),
   m("didgeridoo", aou.qw, dfz.a.a),
   n("bit", aou.qx, dfz.a.a),
   o("banjo", aou.qy, dfz.a.a),
   p("pling", aou.qr, dfz.a.a),
   q("zombie", aou.qz, dfz.a.b),
   r("skeleton", aou.qA, dfz.a.b),
   s("creeper", aou.qB, dfz.a.b),
   t("dragon", aou.qC, dfz.a.b),
   u("wither_skeleton", aou.qD, dfz.a.b),
   v("piglin", aou.qE, dfz.a.b),
   w("custom_head", aou.yp, dfz.a.c);

   private final String x;
   private final hf<aot> y;
   private final dfz.a z;

   private dfz(String $$0, hf<aot> $$1, dfz.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public hf<aot> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dfz.a.a;
   }

   public boolean d() {
      return this.z == dfz.a.c;
   }

   public boolean e() {
      return this.z != dfz.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
