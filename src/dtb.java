public enum dtb implements azs {
   a("harp", avz.rV, dtb.a.a),
   b("basedrum", avz.rP, dtb.a.a),
   c("snare", avz.rY, dtb.a.a),
   d("hat", avz.rW, dtb.a.a),
   e("bass", avz.rQ, dtb.a.a),
   f("flute", avz.rT, dtb.a.a),
   g("bell", avz.rR, dtb.a.a),
   h("guitar", avz.rU, dtb.a.a),
   i("chime", avz.rS, dtb.a.a),
   j("xylophone", avz.rZ, dtb.a.a),
   k("iron_xylophone", avz.sa, dtb.a.a),
   l("cow_bell", avz.sb, dtb.a.a),
   m("didgeridoo", avz.sc, dtb.a.a),
   n("bit", avz.sd, dtb.a.a),
   o("banjo", avz.se, dtb.a.a),
   p("pling", avz.rX, dtb.a.a),
   q("zombie", avz.sf, dtb.a.b),
   r("skeleton", avz.sg, dtb.a.b),
   s("creeper", avz.sh, dtb.a.b),
   t("dragon", avz.si, dtb.a.b),
   u("wither_skeleton", avz.sj, dtb.a.b),
   v("piglin", avz.sk, dtb.a.b),
   w("custom_head", avz.Ao, dtb.a.c);

   private final String x;
   private final ji<avy> y;
   private final dtb.a z;

   private dtb(final String $$0, final ji<avy> $$1, final dtb.a $$2) {
      this.x = $$0;
      this.y = $$1;
      this.z = $$2;
   }

   @Override
   public String c() {
      return this.x;
   }

   public ji<avy> a() {
      return this.y;
   }

   public boolean b() {
      return this.z == dtb.a.a;
   }

   public boolean d() {
      return this.z == dtb.a.c;
   }

   public boolean e() {
      return this.z != dtb.a.a;
   }

   static enum a {
      a,
      b,
      c;
   }
}
