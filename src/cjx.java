import java.util.UUID;
import javax.annotation.Nullable;

public class cjx extends cjv implements bsu {
   private static final brx c = bsa.bx.n().a(0.5F).b(0.97F);
   private static final UUID d = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final btu cb = new btu(d, "Attacking speed boost", 0.05, btu.a.a);
   private static final bpf cc = azc.a(0, 1);
   private int cd;
   private static final bpf ce = azc.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;
   private static final int ch = 10;
   private static final bpf ci = azc.a(4, 6);
   private int cj;

   public cjx(bsa<? extends cjx> $$0, dax $$1) {
      super($$0, $$1);
      this.a(enl.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cg = $$0;
   }

   @Override
   protected void u() {
      this.bS.a(2, new cbb(this, 1.0, false));
      this.bS.a(7, new caz(this, 1.0));
      this.bT.a(1, new cbe(this).a());
      this.bT.a(2, new cbf<>(this, clw.class, 10, true, false, this::a_));
      this.bT.a(3, new cbl<>(this, true));
   }

   public static btv.a gz() {
      return cjv.gt().a(btw.u, 0.0).a(btw.r, 0.23F).a(btw.c, 5.0);
   }

   @Override
   public brx e(bta $$0) {
      return this.p_() ? c : super.e($$0);
   }

   @Override
   protected boolean gr() {
      return false;
   }

   @Override
   protected void Y() {
      bts $$0 = this.f(btw.r);
      if (this.Z_()) {
         if (!this.p_() && !$$0.a(cb)) {
            $$0.c(cb);
         }

         this.gA();
      } else if ($$0.a(cb)) {
         $$0.b(cb.b());
      }

      this.a((aqm)this.dP(), true);
      if (this.p() != null) {
         this.gB();
      }

      if (this.Z_()) {
         this.be = this.ai;
      }

      super.Y();
   }

   private void gA() {
      if (this.cd > 0) {
         this.cd--;
         if (this.cd == 0) {
            this.gD();
         }
      }
   }

   private void gB() {
      if (this.cj > 0) {
         this.cj--;
      } else {
         if (this.M().a(this.p())) {
            this.gC();
         }

         this.cj = ci.a(this.ah);
      }
   }

   private void gC() {
      double $$0 = this.g(btw.k);
      euf $$1 = euf.a(this.dn()).c($$0, 10.0, $$0);
      this.dP()
         .a(cjx.class, $$1, brz.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.p() == null)
         .filter($$0x -> !$$0x.s(this.p()))
         .forEach($$0x -> $$0x.h(this.p()));
   }

   private void gD() {
      this.a(avh.DC, this.fe() * 2.0F, this.ff() * 1.8F);
   }

   @Override
   public void h(@Nullable bso $$0) {
      if (this.p() == null && $$0 != null) {
         this.cd = cc.a(this.ah);
         this.cj = ci.a(this.ah);
      }

      if ($$0 instanceof clw) {
         this.c((clw)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(ce.a(this.ah));
   }

   public static boolean b(bsa<cjx> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      return $$1.ak() != bpr.a && !$$1.a_($$3.d()).a(dea.kK);
   }

   @Override
   public boolean a(dba $$0) {
      return $$0.f(this) && !$$0.d(this.cK());
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.a(this.dP(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.cf = $$0;
   }

   @Override
   public int a() {
      return this.cf;
   }

   @Override
   protected avg v() {
      return this.Z_() ? avh.DC : avh.DB;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.DE;
   }

   @Override
   protected avg o_() {
      return avh.DD;
   }

   @Override
   protected void a(ayk $$0, bps $$1) {
      this.a(bsb.a, new cto(ctr.oV));
   }

   @Override
   protected cto gq() {
      return cto.i;
   }

   @Override
   protected void gy() {
      this.f(btw.u).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cg;
   }

   @Override
   public boolean f(clw $$0) {
      return this.a_((bso)$$0);
   }

   @Override
   public boolean k(cto $$0) {
      return this.j($$0);
   }
}
