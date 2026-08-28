import java.util.UUID;
import javax.annotation.Nullable;

public class ckm extends ckk implements bti {
   private static final bsk c = bsn.bx.n().a(0.5F).b(0.97F);
   private static final UUID d = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bui cd = new bui(d, "Attacking speed boost", 0.05, bui.a.a);
   private static final bps ce = azh.a(0, 1);
   private int cf;
   private static final bps cg = azh.a(20, 39);
   private int ch;
   @Nullable
   private UUID ci;
   private static final int cj = 10;
   private static final bps ck = azh.a(4, 6);
   private int cl;

   public ckm(bsn<? extends ckm> $$0, dcg $$1) {
      super($$0, $$1);
      this.a(epa.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ci = $$0;
   }

   @Override
   protected void t() {
      this.bU.a(2, new cbp(this, 1.0, false));
      this.bU.a(7, new cbn(this, 1.0));
      this.bV.a(1, new cbs(this).a());
      this.bV.a(2, new cbt<>(this, cml.class, 10, true, false, this::a_));
      this.bV.a(3, new cbz<>(this, true));
   }

   public static buj.a gx() {
      return ckk.gr().a(buk.A, 0.0).a(buk.v, 0.23F).a(buk.c, 5.0);
   }

   @Override
   public bsk e(bto $$0) {
      return this.o_() ? c : super.e($$0);
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   protected void Z() {
      bug $$0 = this.f(buk.v);
      if (this.Z_()) {
         if (!this.o_() && !$$0.a(cd)) {
            $$0.c(cd);
         }

         this.gy();
      } else if ($$0.a(cd)) {
         $$0.b(cd.b());
      }

      this.a((aqm)this.dR(), true);
      if (this.p() != null) {
         this.gz();
      }

      if (this.Z_()) {
         this.be = this.ai;
      }

      super.Z();
   }

   private void gy() {
      if (this.cf > 0) {
         this.cf--;
         if (this.cf == 0) {
            this.gB();
         }
      }
   }

   private void gz() {
      if (this.cl > 0) {
         this.cl--;
      } else {
         if (this.L().a(this.p())) {
            this.gA();
         }

         this.cl = ck.a(this.ah);
      }
   }

   private void gA() {
      double $$0 = this.g(buk.m);
      ewc $$1 = ewc.a(this.dp()).c($$0, 10.0, $$0);
      this.dR()
         .a(ckm.class, $$1, bsm.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.p() == null)
         .filter($$0x -> !$$0x.s(this.p()))
         .forEach($$0x -> $$0x.h(this.p()));
   }

   private void gB() {
      this.a(avh.DF, this.fc() * 2.0F, this.fd() * 1.8F);
   }

   @Override
   public void h(@Nullable btc $$0) {
      if (this.p() == null && $$0 != null) {
         this.cf = ce.a(this.ah);
         this.cl = ck.a(this.ah);
      }

      if ($$0 instanceof cml) {
         this.c((cml)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(cg.a(this.ah));
   }

   public static boolean b(bsn<ckm> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      return $$1.al() != bqe.a && !$$1.a_($$3.d()).a(dfk.kK);
   }

   @Override
   public boolean a(dcj $$0) {
      return $$0.f(this) && !$$0.d(this.cM());
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(this.dR(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.ch = $$0;
   }

   @Override
   public int a() {
      return this.ch;
   }

   @Override
   protected avg v() {
      return this.Z_() ? avh.DF : avh.DE;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.DH;
   }

   @Override
   protected avg n_() {
      return avh.DG;
   }

   @Override
   protected void a(ayo $$0, bqf $$1) {
      this.a(bso.a, new cud(cug.oW));
   }

   @Override
   protected cud go() {
      return cud.l;
   }

   @Override
   protected void gw() {
      this.f(buk.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ci;
   }

   @Override
   public boolean f(cml $$0) {
      return this.a_((btc)$$0);
   }

   @Override
   public boolean k(cud $$0) {
      return this.j($$0);
   }
}
