import java.util.UUID;
import javax.annotation.Nullable;

public class cjz extends cjx implements bsu {
   private static final bry c = bsb.bC.n().a(0.5F).b(0.97F);
   private static final UUID d = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final btt ck = new btt(d, "Attacking speed boost", 0.05, btt.a.a);
   private static final bpl cl = azl.a(0, 1);
   private int cm;
   private static final bpl cn = azl.a(20, 39);
   private int co;
   @Nullable
   private UUID cp;
   private static final int cq = 10;
   private static final bpl cr = azl.a(4, 6);
   private int cs;

   public cjz(bsb<? extends cjz> $$0, dca $$1) {
      super($$0, $$1);
      this.a(epv.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cp = $$0;
   }

   @Override
   protected void t() {
      this.cb.a(2, new cba<>(this, 1.0, false));
      this.cb.a(7, new cay(this, 1.0));
      this.cc.a(1, new cbd(this).a());
      this.cc.a(2, new cbe<>(this, cly.class, 10, true, false, this::a_));
      this.cc.a(3, new cbk<>(this, true));
   }

   public static btu.a gC() {
      return cjx.gD().a(btv.u, 0.0).a(btv.r, 0.23F).a(btv.c, 5.0);
   }

   @Override
   public bry e(bsz $$0) {
      return this.o_() ? c : super.e($$0);
   }

   @Override
   protected boolean gA() {
      return false;
   }

   @Override
   protected void Y() {
      btr $$0 = this.f(btv.r);
      if (this.aa_()) {
         if (!this.o_() && !$$0.a(ck)) {
            $$0.c(ck);
         }

         this.gL();
      } else if ($$0.a(ck)) {
         $$0.b(ck.b());
      }

      this.a_((aqt)this.dU(), true);
      if (this.p() != null) {
         this.gM();
      }

      if (this.aa_()) {
         this.bo = this.am;
      }

      super.Y();
   }

   private void gL() {
      if (this.cm > 0) {
         this.cm--;
         if (this.cm == 0) {
            this.gO();
         }
      }
   }

   private void gM() {
      if (this.cs > 0) {
         this.cs--;
      } else {
         if (this.K().a(this.p())) {
            this.gN();
         }

         this.cs = cr.a(this.al);
      }
   }

   private void gN() {
      double $$0 = this.g(btv.k);
      ewp $$1 = ewp.a(this.ds()).c($$0, 10.0, $$0);
      this.dU()
         .a(cjz.class, $$1, bsa.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.p() == null)
         .filter($$0x -> !$$0x.s(this.p()))
         .forEach($$0x -> $$0x.h(this.p()));
   }

   private void gO() {
      this.a(avo.Eg, this.fn() * 2.0F, this.fo() * 1.8F);
   }

   @Override
   public void h(@Nullable bso $$0) {
      if (this.p() == null && $$0 != null) {
         this.cm = cl.a(this.al);
         this.cs = cr.a(this.al);
      }

      if ($$0 instanceof cly) {
         this.c((cly)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(cn.a(this.al));
   }

   public static boolean b(bsb<cjz> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      return $$1.al() != bpx.a && !$$1.a_($$3.d()).a(dfe.lI);
   }

   @Override
   public boolean a(dcd $$0) {
      return $$0.f(this) && !$$0.d(this.cP());
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a(this.dU(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.co = $$0;
   }

   @Override
   public int a() {
      return this.co;
   }

   @Override
   protected avn u() {
      return this.aa_() ? avo.Eg : avo.Ef;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.Ei;
   }

   @Override
   protected avn n_() {
      return avo.Eh;
   }

   @Override
   protected void a(ayt $$0, bpy $$1) {
      this.a(bsc.a, new cuh(cuk.qo));
   }

   @Override
   protected cuh gz() {
      return cuh.i;
   }

   @Override
   protected void gK() {
      this.f(btv.u).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cp;
   }

   @Override
   public boolean f(cly $$0) {
      return this.a_((bso)$$0);
   }

   @Override
   public boolean k(cuh $$0) {
      return this.j($$0);
   }
}
