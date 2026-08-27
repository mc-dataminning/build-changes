import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzx extends byq {
   private static final String b = "Johnny";
   static final Predicate<bgv> e = $$0 -> $$0 == bgv.c || $$0 == bgv.d;
   boolean bT;

   public bzx(biu<? extends bzx> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bpv(this));
      this.bO.a(1, new bzx.a(this));
      this.bO.a(2, new byq.b(this));
      this.bO.a(3, new cdc.a(this, 10.0F));
      this.bO.a(4, new bql(this, 1.0, false));
      this.bP.a(1, new brt(this, cdc.class).a());
      this.bP.a(2, new bru<>(this, cbu.class, true));
      this.bP.a(3, new bru<>(this, cbc.class, true));
      this.bP.a(3, new bru<>(this, bvd.class, true));
      this.bP.a(4, new bzx.b(this));
      this.bO.a(8, new bqy(this, 0.6));
      this.bO.a(9, new bqj(this, cbu.class, 3.0F, 1.0F));
      this.bO.a(10, new bqj(this, bji.class, 8.0F));
   }

   @Override
   protected void X() {
      if (!this.fT() && btx.a(this)) {
         boolean $$0 = ((akq)this.dL()).d(this.dl());
         ((bso)this.L()).b($$0);
      }

      super.X();
   }

   public static bkl.a t() {
      return bzi.gj().a(bkm.d, 0.35F).a(bkm.b, 12.0).a(bkm.a, 24.0).a(bkm.f, 5.0);
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      if (this.bT) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public byq.a s() {
      if (this.fV()) {
         return byq.a.b;
      } else {
         return this.gu() ? byq.a.g : byq.a.a;
      }
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bT = $$0.q("Johnny");
      }
   }

   @Override
   public apc ac_() {
      return apd.zc;
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qw $$4) {
      bjz $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      ((bso)this.L()).b(true);
      asc $$6 = $$0.D_();
      this.a($$6, $$1);
      this.b($$6, $$1);
      return $$5;
   }

   @Override
   protected void a(asc $$0, bgw $$1) {
      if (this.gr() == null) {
         this.a(biv.a, new cjf(cji.op));
      }
   }

   @Override
   public boolean s(biq $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bjg && ((bjg)$$0).eR() == bjl.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   public void b(@Nullable tl $$0) {
      super.b($$0);
      if (!this.bT && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bT = true;
      }
   }

   @Override
   protected apc w() {
      return apd.zb;
   }

   @Override
   protected apc l_() {
      return apd.zd;
   }

   @Override
   protected apc d(bho $$0) {
      return apd.ze;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cjf $$2 = new cjf(cji.op);
      cdb $$3 = this.gr();
      int $$4 = 1;
      if ($$0 > $$3.a(bgv.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ag.i() <= $$3.w();
      if ($$5) {
         Map<cno, Integer> $$6 = Maps.newHashMap();
         $$6.put(cns.n, $$4);
         cnq.a($$6, $$2);
      }

      this.a(biv.a, $$2);
   }

   static class a extends bpl {
      public a(bji $$0) {
         super($$0, 6, bzx.e);
         this.a(EnumSet.of(bqb.a.a));
      }

      @Override
      public boolean b() {
         bzx $$0 = (bzx)this.d;
         return $$0.gs() && super.b();
      }

      @Override
      public boolean a() {
         bzx $$0 = (bzx)this.d;
         return $$0.gs() && $$0.ag.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.o(0);
      }
   }

   static class b extends bru<bjg> {
      public b(bzx $$0) {
         super($$0, bjg.class, 0, true, true, bjg::fy);
      }

      @Override
      public boolean a() {
         return ((bzx)this.e).bT && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.o(0);
      }
   }
}
