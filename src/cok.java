import javax.annotation.Nullable;

public class cok extends coi implements bym {
   private static final int a = 50;
   private static final int b = 70;
   private static final akn<Boolean> c = akr.a(cok.class, akp.k);
   private static final String d = "sheared";
   private static final boolean e = false;

   public static bzb.a gu() {
      return coi.j().a(bzc.s, 16.0);
   }

   public cok(bxe<? extends cok> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("sheared", this.gv());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.b("sheared", false));
   }

   public boolean gv() {
      return this.al.a(c);
   }

   public void w(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   protected but b(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      if ($$2.a(dae.td) && this.a()) {
         if (this.dV() instanceof aru $$3) {
            this.a($$3, aws.h, $$2);
            this.a(egg.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return but.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awq u() {
      return awr.cn;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.cp;
   }

   @Override
   protected awq l_() {
      return awr.co;
   }

   @Override
   protected awq m() {
      return awr.cr;
   }

   @Override
   protected csh a(daa $$0, float $$1, @Nullable daa $$2) {
      csh $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof csk $$4) {
         $$4.a(new bvz(bwb.s, 100));
      }

      return $$3;
   }

   @Override
   protected int q() {
      return 50;
   }

   @Override
   protected int t() {
      return 70;
   }

   @Override
   public void a(aru $$0, aws $$1, daa $$2) {
      $$0.a(null, this, awr.cq, $$1, 1.0F, 1.0F);
      this.d($$0, $$2);
      this.w(true);
   }

   private void d(aru $$0, daa $$1) {
      this.a($$0, faf.aQ, $$1, ($$0x, $$1x) -> this.a($$0x, $$1x, this.dr()));
   }

   @Override
   public boolean a() {
      return !this.gv() && this.bJ();
   }
}
