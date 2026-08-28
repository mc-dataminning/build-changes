import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckg extends ciy {
   private static final String b = "Johnny";
   static final Predicate<bqe> e = $$0 -> $$0 == bqe.c || $$0 == bqe.d;
   boolean ca;

   public ckg(bsn<? extends ckg> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new bzu(this));
      this.bU.a(1, new ckg.a(this));
      this.bU.a(2, new ciy.b(this));
      this.bU.a(3, new cnx.a(this, 10.0F));
      this.bU.a(4, new cak(this, 1.0, false));
      this.bV.a(1, new cbs(this, cnx.class).a());
      this.bV.a(2, new cbt<>(this, cml.class, true));
      this.bV.a(3, new cbt<>(this, clt.class, true));
      this.bV.a(3, new cbt<>(this, cfe.class, true));
      this.bV.a(4, new ckg.b(this));
      this.bU.a(8, new cax(this, 0.6));
      this.bU.a(9, new cai(this, cml.class, 3.0F, 1.0F));
      this.bU.a(10, new cai(this, bte.class, 8.0F));
   }

   @Override
   protected void Z() {
      if (!this.gc() && cdy.a(this)) {
         boolean $$0 = ((aqm)this.dR()).e(this.dr());
         ((ccn)this.J()).b($$0);
      }

      super.Z();
   }

   public static buj.a t() {
      return cjr.gt().a(buk.v, 0.35F).a(buk.m, 12.0).a(buk.s, 24.0).a(buk.c, 5.0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.ca) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public ciy.a s() {
      if (this.ge()) {
         return ciy.a.b;
      } else {
         return this.gG() ? ciy.a.g : ciy.a.a;
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
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      btv $$4 = super.a($$0, $$1, $$2, $$3);
      ((ccn)this.J()).b(true);
      ayo $$5 = $$0.E_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(ayo $$0, bqf $$1) {
      if (this.gB() == null) {
         this.a(bso.a, new cud(cug.pe));
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
   protected avg n_() {
      return avh.Bn;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.Bo;
   }

   @Override
   public void a(aqm $$0, int $$1, boolean $$2) {
      cud $$3 = new cud(cug.pe);
      cnw $$4 = this.gB();
      boolean $$5 = this.ah.i() <= $$4.v();
      if ($$5) {
         akj<dat> $$6 = $$1 > $$4.a(bqe.c) ? daz.f : daz.e;
         czo.a($$3, $$0.H_(), $$6, $$0.d_(this.dr()), this.ah);
      }

      this.a(bso.a, $$3);
   }

   static class a extends bzk {
      public a(bte $$0) {
         super($$0, 6, ckg.e);
         this.a(EnumSet.of(caa.a.a));
      }

      @Override
      public boolean b() {
         ckg $$0 = (ckg)this.d;
         return $$0.gE() && super.b();
      }

      @Override
      public boolean a() {
         ckg $$0 = (ckg)this.d;
         return $$0.gE() && $$0.ah.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.o(0);
      }
   }

   static class b extends cbt<btc> {
      public b(ckg $$0) {
         super($$0, btc.class, 0, true, true, btc::fF);
      }

      @Override
      public boolean a() {
         return ((ckg)this.e).ca && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.o(0);
      }
   }
}
