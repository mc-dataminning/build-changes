import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfg extends cdz {
   private static final String b = "Johnny";
   static final Predicate<blt> e = $$0 -> $$0 == blt.c || $$0 == blt.d;
   boolean bT;

   public cfg(bnw<? extends cfg> $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new buz(this));
      this.bO.a(1, new cfg.a(this));
      this.bO.a(2, new cdz.b(this));
      this.bO.a(3, new civ.a(this, 10.0F));
      this.bO.a(4, new bvp(this, 1.0, false));
      this.bP.a(1, new bwx(this, civ.class).a());
      this.bP.a(2, new bwy<>(this, chl.class, true));
      this.bP.a(3, new bwy<>(this, cgt.class, true));
      this.bP.a(3, new bwy<>(this, caj.class, true));
      this.bP.a(4, new cfg.b(this));
      this.bO.a(8, new bwc(this, 0.6));
      this.bO.a(9, new bvn(this, chl.class, 3.0F, 1.0F));
      this.bO.a(10, new bvn(this, bok.class, 8.0F));
   }

   @Override
   protected void aa() {
      if (!this.fW() && bzd.a(this)) {
         boolean $$0 = ((aow)this.dM()).e(this.dm());
         ((bxs)this.N()).b($$0);
      }

      super.aa();
   }

   public static bpo.a w() {
      return cer.gm().a(bpp.o, 0.35F).a(bpp.i, 12.0).a(bpp.n, 24.0).a(bpp.c, 5.0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      if (this.bT) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cdz.a u() {
      if (this.fY()) {
         return cdz.a.b;
      } else {
         return this.gx() ? cdz.a.g : cdz.a.a;
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bT = $$0.q("Johnny");
      }
   }

   @Override
   public atk ag_() {
      return atl.As;
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      bpa $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      ((bxs)this.N()).b(true);
      awp $$6 = $$0.F_();
      this.a($$6, $$1);
      this.b($$6, $$1);
      return $$5;
   }

   @Override
   protected void a(awp $$0, blu $$1) {
      if (this.gu() == null) {
         this.a(bnx.a, new cpd(cpg.pc));
      }
   }

   @Override
   public void b(@Nullable vq $$0) {
      super.b($$0);
      if (!this.bT && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bT = true;
      }
   }

   @Override
   protected atk y() {
      return atl.Ar;
   }

   @Override
   protected atk n_() {
      return atl.At;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.Au;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cpd $$2 = new cpd(cpg.pc);
      ciu $$3 = this.gu();
      int $$4 = 1;
      if ($$0 > $$3.a(blt.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.af.i() <= $$3.w();
      if ($$5) {
         Map<ctm, Integer> $$6 = Maps.newHashMap();
         $$6.put(ctp.n, $$4);
         ctn.a($$6, $$2);
      }

      this.a(bnx.a, $$2);
   }

   static class a extends bup {
      public a(bok $$0) {
         super($$0, 6, cfg.e);
         this.a(EnumSet.of(bvf.a.a));
      }

      @Override
      public boolean b() {
         cfg $$0 = (cfg)this.d;
         return $$0.gv() && super.b();
      }

      @Override
      public boolean a() {
         cfg $$0 = (cfg)this.d;
         return $$0.gv() && $$0.af.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.p(0);
      }
   }

   static class b extends bwy<boi> {
      public b(cfg $$0) {
         super($$0, boi.class, 0, true, true, boi::fz);
      }

      @Override
      public boolean a() {
         return ((cfg)this.e).bT && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.p(0);
      }
   }
}
