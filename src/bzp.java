import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzp extends byi {
   private static final String b = "Johnny";
   static final Predicate<bgn> e = $$0 -> $$0 == bgn.c || $$0 == bgn.d;
   boolean bT;

   public bzp(bim<? extends bzp> $$0, cpl $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpn(this));
      this.bO.a(1, new bzp.a(this));
      this.bO.a(2, new byi.b(this));
      this.bO.a(3, new ccu.a(this, 10.0F));
      this.bO.a(4, new bqd(this, 1.0, false));
      this.bP.a(1, new brl(this, ccu.class).a());
      this.bP.a(2, new brm<>(this, cbm.class, true));
      this.bP.a(3, new brm<>(this, cau.class, true));
      this.bP.a(3, new brm<>(this, buv.class, true));
      this.bP.a(4, new bzp.b(this));
      this.bO.a(8, new bqq(this, 0.6));
      this.bO.a(9, new bqb(this, cbm.class, 3.0F, 1.0F));
      this.bO.a(10, new bqb(this, bja.class, 8.0F));
   }

   @Override
   protected void V() {
      if (!this.fQ() && btp.a(this)) {
         boolean $$0 = ((akk)this.dK()).d(this.dk());
         ((bsg)this.H()).b($$0);
      }

      super.V();
   }

   public static bkd.a q() {
      return bza.gg().a(bke.d, 0.35F).a(bke.b, 12.0).a(bke.a, 24.0).a(bke.f, 5.0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      if (this.bT) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public byi.a p() {
      if (this.fS()) {
         return byi.a.b;
      } else {
         return this.gr() ? byi.a.g : byi.a.a;
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bT = $$0.q("Johnny");
      }
   }

   @Override
   public aov X_() {
      return aow.zc;
   }

   @Nullable
   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      bjr $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      ((bsg)this.H()).b(true);
      aru $$6 = $$0.y_();
      this.a($$6, $$1);
      this.b($$6, $$1);
      return $$5;
   }

   @Override
   protected void a(aru $$0, bgo $$1) {
      if (this.go() == null) {
         this.a(bin.a, new cix(cja.op));
      }
   }

   @Override
   public boolean s(bii $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof biy && ((biy)$$0).eQ() == bjd.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   public void b(@Nullable tf $$0) {
      super.b($$0);
      if (!this.bT && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bT = true;
      }
   }

   @Override
   protected aov r() {
      return aow.zb;
   }

   @Override
   protected aov h_() {
      return aow.zd;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.ze;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cix $$2 = new cix(cja.op);
      cct $$3 = this.go();
      int $$4 = 1;
      if ($$0 > $$3.a(bgn.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ag.i() <= $$3.w();
      if ($$5) {
         Map<cne, Integer> $$6 = Maps.newHashMap();
         $$6.put(cni.n, $$4);
         cng.a($$6, $$2);
      }

      this.a(bin.a, $$2);
   }

   static class a extends bpd {
      public a(bja $$0) {
         super($$0, 6, bzp.e);
         this.a(EnumSet.of(bpt.a.a));
      }

      @Override
      public boolean b() {
         bzp $$0 = (bzp)this.d;
         return $$0.gp() && super.b();
      }

      @Override
      public boolean a() {
         bzp $$0 = (bzp)this.d;
         return $$0.gp() && $$0.ag.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.o(0);
      }
   }

   static class b extends brm<biy> {
      public b(bzp $$0) {
         super($$0, biy.class, 0, true, true, biy::fx);
      }

      @Override
      public boolean a() {
         return ((bzp)this.e).bT && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.o(0);
      }
   }
}
