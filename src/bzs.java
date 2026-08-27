import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzs extends byl {
   private static final String b = "Johnny";
   static final Predicate<bgq> e = $$0 -> $$0 == bgq.c || $$0 == bgq.d;
   boolean bT;

   public bzs(bip<? extends bzs> $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpq(this));
      this.bO.a(1, new bzs.a(this));
      this.bO.a(2, new byl.b(this));
      this.bO.a(3, new ccx.a(this, 10.0F));
      this.bO.a(4, new bqg(this, 1.0, false));
      this.bP.a(1, new bro(this, ccx.class).a());
      this.bP.a(2, new brp<>(this, cbp.class, true));
      this.bP.a(3, new brp<>(this, cax.class, true));
      this.bP.a(3, new brp<>(this, buy.class, true));
      this.bP.a(4, new bzs.b(this));
      this.bO.a(8, new bqt(this, 0.6));
      this.bO.a(9, new bqe(this, cbp.class, 3.0F, 1.0F));
      this.bO.a(10, new bqe(this, bjd.class, 8.0F));
   }

   @Override
   protected void V() {
      if (!this.fQ() && bts.a(this)) {
         boolean $$0 = ((akn)this.dK()).d(this.dk());
         ((bsj)this.H()).b($$0);
      }

      super.V();
   }

   public static bkg.a q() {
      return bzd.gg().a(bkh.d, 0.35F).a(bkh.b, 12.0).a(bkh.a, 24.0).a(bkh.f, 5.0);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      if (this.bT) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public byl.a p() {
      if (this.fS()) {
         return byl.a.b;
      } else {
         return this.gr() ? byl.a.g : byl.a.a;
      }
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bT = $$0.q("Johnny");
      }
   }

   @Override
   public aoy X_() {
      return aoz.zc;
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      bju $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      ((bsj)this.H()).b(true);
      arx $$6 = $$0.y_();
      this.a($$6, $$1);
      this.b($$6, $$1);
      return $$5;
   }

   @Override
   protected void a(arx $$0, bgr $$1) {
      if (this.go() == null) {
         this.a(biq.a, new cja(cjd.op));
      }
   }

   @Override
   public boolean s(bil $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bjb && ((bjb)$$0).eQ() == bjg.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   public void b(@Nullable ti $$0) {
      super.b($$0);
      if (!this.bT && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bT = true;
      }
   }

   @Override
   protected aoy r() {
      return aoz.zb;
   }

   @Override
   protected aoy h_() {
      return aoz.zd;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.ze;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cja $$2 = new cja(cjd.op);
      ccw $$3 = this.go();
      int $$4 = 1;
      if ($$0 > $$3.a(bgq.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ag.i() <= $$3.w();
      if ($$5) {
         Map<cnj, Integer> $$6 = Maps.newHashMap();
         $$6.put(cnn.n, $$4);
         cnl.a($$6, $$2);
      }

      this.a(biq.a, $$2);
   }

   static class a extends bpg {
      public a(bjd $$0) {
         super($$0, 6, bzs.e);
         this.a(EnumSet.of(bpw.a.a));
      }

      @Override
      public boolean b() {
         bzs $$0 = (bzs)this.d;
         return $$0.gp() && super.b();
      }

      @Override
      public boolean a() {
         bzs $$0 = (bzs)this.d;
         return $$0.gp() && $$0.ag.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.o(0);
      }
   }

   static class b extends brp<bjb> {
      public b(bzs $$0) {
         super($$0, bjb.class, 0, true, true, bjb::fx);
      }

      @Override
      public boolean a() {
         return ((bzs)this.e).bT && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.o(0);
      }
   }
}
