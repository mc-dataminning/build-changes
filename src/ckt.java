import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckt extends cjl {
   private static final String b = "Johnny";
   static final Predicate<bqs> e = $$0 -> $$0 == bqs.c || $$0 == bqs.d;
   boolean bY;

   public ckt(btb<? extends ckt> $$0, dbz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new cai(this));
      this.bS.a(1, new ckt.a(this));
      this.bS.a(2, new cjl.b(this));
      this.bS.a(3, new cok.a(this, 10.0F));
      this.bS.a(4, new cay(this, 1.0, false));
      this.bT.a(1, new ccg(this, cok.class).a());
      this.bT.a(2, new cch<>(this, cmy.class, true));
      this.bT.a(3, new cch<>(this, cmg.class, true));
      this.bT.a(3, new cch<>(this, cfs.class, true));
      this.bT.a(4, new ckt.b(this));
      this.bS.a(8, new cbl(this, 0.6));
      this.bS.a(9, new caw(this, cmy.class, 3.0F, 1.0F));
      this.bS.a(10, new caw(this, bts.class, 8.0F));
   }

   @Override
   protected void Z() {
      if (!this.gg() && cem.a(this)) {
         boolean $$0 = ((arf)this.dP()).e(this.dp());
         ((cdb)this.K()).b($$0);
      }

      super.Z();
   }

   public static bux.a u() {
      return cke.gw().a(buy.r, 0.35F).a(buy.k, 12.0).a(buy.q, 24.0).a(buy.c, 5.0);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      if (this.bY) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cjl.a s() {
      if (this.gi()) {
         return cjl.a.b;
      } else {
         return this.gJ() ? cjl.a.g : cjl.a.a;
      }
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bY = $$0.q("Johnny");
      }
   }

   @Override
   public avz ae_() {
      return awa.Bj;
   }

   @Nullable
   @Override
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      buj $$4 = super.a($$0, $$1, $$2, $$3);
      ((cdb)this.K()).b(true);
      azh $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azh $$0, bqt $$1) {
      if (this.gE() == null) {
         this.a(btc.a, new cuq(cut.pd));
      }
   }

   @Override
   public void b(@Nullable xp $$0) {
      super.b($$0);
      if (!this.bY && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bY = true;
      }
   }

   @Override
   protected avz v() {
      return awa.Bi;
   }

   @Override
   protected avz o_() {
      return awa.Bk;
   }

   @Override
   protected avz d(bro $$0) {
      return awa.Bl;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cuq $$2 = new cuq(cut.pd);
      coj $$3 = this.gE();
      int $$4 = 1;
      if ($$0 > $$3.a(bqs.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ah.i() <= $$3.v();
      if ($$5) {
         $$2.a(dae.n, $$4);
      }

      this.a(btc.a, $$2);
   }

   static class a extends bzy {
      public a(bts $$0) {
         super($$0, 6, ckt.e);
         this.a(EnumSet.of(cao.a.a));
      }

      @Override
      public boolean b() {
         ckt $$0 = (ckt)this.d;
         return $$0.gH() && super.b();
      }

      @Override
      public boolean a() {
         ckt $$0 = (ckt)this.d;
         return $$0.gH() && $$0.ah.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.p(0);
      }
   }

   static class b extends cch<btq> {
      public b(ckt $$0) {
         super($$0, btq.class, 0, true, true, btq::fH);
      }

      @Override
      public boolean a() {
         return ((ckt)this.e).bY && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.p(0);
      }
   }
}
