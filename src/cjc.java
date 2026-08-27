import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjc extends chu {
   private static final String b = "Johnny";
   static final Predicate<bpj> e = $$0 -> $$0 == bpj.c || $$0 == bpj.d;
   boolean bY;

   public cjc(brn<? extends cjc> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new byr(this));
      this.bS.a(1, new cjc.a(this));
      this.bS.a(2, new chu.b(this));
      this.bS.a(3, new cmt.a(this, 10.0F));
      this.bS.a(4, new bzh(this, 1.0, false));
      this.bT.a(1, new cap(this, cmt.class).a());
      this.bT.a(2, new caq<>(this, clh.class, true));
      this.bT.a(3, new caq<>(this, ckp.class, true));
      this.bT.a(3, new caq<>(this, ceb.class, true));
      this.bT.a(4, new cjc.b(this));
      this.bS.a(8, new bzu(this, 0.6));
      this.bS.a(9, new bzf(this, clh.class, 3.0F, 1.0F));
      this.bS.a(10, new bzf(this, bsc.class, 8.0F));
   }

   @Override
   protected void Y() {
      if (!this.gf() && ccv.a(this)) {
         boolean $$0 = ((aqh)this.dN()).e(this.dn());
         ((cbk)this.K()).b($$0);
      }

      super.Y();
   }

   public static btg.a u() {
      return cin.gv().a(bth.r, 0.35F).a(bth.k, 12.0).a(bth.q, 24.0).a(bth.c, 5.0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      if (this.bY) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public chu.a r() {
      if (this.gh()) {
         return chu.a.b;
      } else {
         return this.gG() ? chu.a.g : chu.a.a;
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bY = $$0.q("Johnny");
      }
   }

   @Override
   public avb ae_() {
      return avc.AY;
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      bss $$4 = super.a($$0, $$1, $$2, $$3);
      ((cbk)this.K()).b(true);
      ayg $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return $$4;
   }

   @Override
   protected void a(ayg $$0, bpk $$1) {
      if (this.gD() == null) {
         this.a(bro.a, new csz(ctc.pd));
      }
   }

   @Override
   public void b(@Nullable wu $$0) {
      super.b($$0);
      if (!this.bY && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bY = true;
      }
   }

   @Override
   protected avb v() {
      return avc.AX;
   }

   @Override
   protected avb o_() {
      return avc.AZ;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.Ba;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      csz $$2 = new csz(ctc.pd);
      cms $$3 = this.gD();
      int $$4 = 1;
      if ($$0 > $$3.a(bpj.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ah.i() <= $$3.v();
      if ($$5) {
         $$2.a(cyj.n, $$4);
      }

      this.a(bro.a, $$2);
   }

   static class a extends byh {
      public a(bsc $$0) {
         super($$0, 6, cjc.e);
         this.a(EnumSet.of(byx.a.a));
      }

      @Override
      public boolean b() {
         cjc $$0 = (cjc)this.d;
         return $$0.gE() && super.b();
      }

      @Override
      public boolean a() {
         cjc $$0 = (cjc)this.d;
         return $$0.gE() && $$0.ah.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.p(0);
      }
   }

   static class b extends caq<bsa> {
      public b(cjc $$0) {
         super($$0, bsa.class, 0, true, true, bsa::fF);
      }

      @Override
      public boolean a() {
         return ((cjc)this.e).bY && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.p(0);
      }
   }
}
