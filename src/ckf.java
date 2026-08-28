import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckf extends cix {
   private static final String b = "Johnny";
   static final Predicate<bqd> e = $$0 -> $$0 == bqd.c || $$0 == bqd.d;
   boolean ca;

   public ckf(bsm<? extends ckf> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new bzt(this));
      this.bU.a(1, new ckf.a(this));
      this.bU.a(2, new cix.b(this));
      this.bU.a(3, new cnw.a(this, 10.0F));
      this.bU.a(4, new caj(this, 1.0, false));
      this.bV.a(1, new cbr(this, cnw.class).a());
      this.bV.a(2, new cbs<>(this, cmk.class, true));
      this.bV.a(3, new cbs<>(this, cls.class, true));
      this.bV.a(3, new cbs<>(this, cfd.class, true));
      this.bV.a(4, new ckf.b(this));
      this.bU.a(8, new caw(this, 0.6));
      this.bU.a(9, new cah(this, cmk.class, 3.0F, 1.0F));
      this.bU.a(10, new cah(this, btd.class, 8.0F));
   }

   @Override
   protected void Z() {
      if (!this.gd() && cdx.a(this)) {
         boolean $$0 = ((aqm)this.dQ()).e(this.dq());
         ((ccm)this.K()).b($$0);
      }

      super.Z();
   }

   public static bui.a u() {
      return cjq.gu().a(buj.v, 0.35F).a(buj.m, 12.0).a(buj.s, 24.0).a(buj.c, 5.0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.ca) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cix.a s() {
      if (this.gf()) {
         return cix.a.b;
      } else {
         return this.gH() ? cix.a.g : cix.a.a;
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.ca = $$0.q("Johnny");
      }
   }

   @Override
   public avg ae_() {
      return avh.Bm;
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      btu $$4 = super.a($$0, $$1, $$2, $$3);
      ((ccm)this.K()).b(true);
      ayo $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return $$4;
   }

   @Override
   protected void a(ayo $$0, bqe $$1) {
      if (this.gC() == null) {
         this.a(bsn.a, new cuc(cuf.pe));
      }
   }

   @Override
   public void b(@Nullable wu $$0) {
      super.b($$0);
      if (!this.ca && $$0 != null && $$0.getString().equals("Johnny")) {
         this.ca = true;
      }
   }

   @Override
   protected avg v() {
      return avh.Bl;
   }

   @Override
   protected avg o_() {
      return avh.Bn;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.Bo;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cuc $$2 = new cuc(cuf.pe);
      cnv $$3 = this.gC();
      boolean $$4 = this.ah.i() <= $$3.v();
      if ($$4) {
         akj<das> $$5 = $$0 > $$3.a(bqd.c) ? day.f : day.e;
         czn.a($$2, $$5, this.dQ(), this.dq(), this.ah);
      }

      this.a(bsn.a, $$2);
   }

   static class a extends bzj {
      public a(btd $$0) {
         super($$0, 6, ckf.e);
         this.a(EnumSet.of(bzz.a.a));
      }

      @Override
      public boolean b() {
         ckf $$0 = (ckf)this.d;
         return $$0.gF() && super.b();
      }

      @Override
      public boolean a() {
         ckf $$0 = (ckf)this.d;
         return $$0.gF() && $$0.ah.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.o(0);
      }
   }

   static class b extends cbs<btb> {
      public b(ckf $$0) {
         super($$0, btb.class, 0, true, true, btb::fE);
      }

      @Override
      public boolean a() {
         return ((ckf)this.e).ca && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.o(0);
      }
   }
}
