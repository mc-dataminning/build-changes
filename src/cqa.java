import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cqa extends cpp implements dab.b {
   private static final int bG = 5;
   @Nullable
   private jj bH;
   private int bI;

   public cqa(bwb<? extends cqa> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bB.a(0, new cdh(this));
      this.bB.a(0, new cey<>(this, czu.a(cyc.tm, czv.g), awk.Cw, $$0 -> this.dV().W() && !$$0.cp()));
      this.bB.a(0, new cey<>(this, new cxy(cyc.rp), awk.CB, $$0 -> this.dV().V() && $$0.cp()));
      this.bB.a(1, new cew(this));
      this.bB.a(1, new ccu<>(this, coc.class, 8.0F, 0.5, 0.5));
      this.bB.a(1, new ccu<>(this, cnc.class, 12.0F, 0.5, 0.5));
      this.bB.a(1, new ccu<>(this, cny.class, 8.0F, 0.5, 0.5));
      this.bB.a(1, new ccu<>(this, cnx.class, 8.0F, 0.5, 0.5));
      this.bB.a(1, new ccu<>(this, cnm.class, 15.0F, 0.5, 0.5));
      this.bB.a(1, new ccu<>(this, cnh.class, 12.0F, 0.5, 0.5));
      this.bB.a(1, new ccu<>(this, cob.class, 10.0F, 0.5, 0.5));
      this.bB.a(1, new ceg(this, 0.5));
      this.bB.a(1, new cdw(this));
      this.bB.a(2, new cqa.a(this, 2.0, 0.35));
      this.bB.a(4, new ceb(this, 0.35));
      this.bB.a(8, new cfa(this, 0.35));
      this.bB.a(9, new cdq(this, cqi.class, 3.0F, 1.0F));
      this.bB.a(10, new cdv(this, bwt.class, 8.0F));
   }

   @Nullable
   @Override
   public bvi a(arn $$0, bvi $$1) {
      return null;
   }

   @Override
   public boolean gs() {
      return false;
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      if (!$$2.a(cyc.uK) && this.bK() && !this.gq() && !this.n_()) {
         if ($$1 == btp.a) {
            $$0.a(awu.S);
         }

         if (!this.dV().C) {
            if (this.gr().isEmpty()) {
               return btq.c;
            }

            this.a($$0);
            this.a($$0, this.m_(), 1);
         }

         return btq.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gw() {
      if (this.dV().K().b(ctg.b)) {
         this.gz();
      } else {
         cpy.g[] $$0 = (cpy.g[])cpy.b.get(1);
         cpy.g[] $$1 = (cpy.g[])cpy.b.get(2);
         if ($$0 != null && $$1 != null) {
            dgo $$2 = this.gr();
            this.a($$2, $$0, 5);
            int $$3 = this.ae.a($$1.length);
            cpy.g $$4 = $$1[$$3];
            dgn $$5 = $$4.a(this, this.ae);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gz() {
      dgo $$0 = this.gr();

      for (Pair<cpy.g[], Integer> $$1 : cpy.d) {
         cpy.g[] $$2 = (cpy.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bI);
      if (this.bH != null) {
         $$0.a("wander_target", ul.a(this.bH));
      }
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bI = $$0.h("DespawnDelay");
      }

      ul.a($$0, "wander_target").ifPresent($$0x -> this.bH = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(dgn $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ae.a(4);
         this.dV().b(new bwg(this.dV(), this.dA(), this.dC() + 0.5, this.dG(), $$1));
      }
   }

   @Override
   protected awj u() {
      return this.gq() ? awk.CC : awk.Cu;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.Cz;
   }

   @Override
   protected awj l_() {
      return awk.Cv;
   }

   @Override
   public awj k(cxy $$0) {
      return $$0.a(cyc.rp) ? awk.Cx : awk.Cy;
   }

   @Override
   protected awj w(boolean $$0) {
      return $$0 ? awk.CD : awk.CA;
   }

   @Override
   public awj gt() {
      return awk.CD;
   }

   public void t(int $$0) {
      this.bI = $$0;
   }

   public int gy() {
      return this.bI;
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C) {
         this.gA();
      }
   }

   private void gA() {
      if (this.bI > 0 && !this.gq() && --this.bI == 0) {
         this.at();
      }
   }

   public void i(@Nullable jj $$0) {
      this.bH = $$0;
   }

   @Nullable
   jj gC() {
      return this.bH;
   }

   class a extends cdn {
      final cqa a;
      final double b;
      final double c;

      a(final cqa $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(cdn.a.a));
      }

      @Override
      public void e() {
         this.a.i(null);
         cqa.this.bA.m();
      }

      @Override
      public boolean b() {
         jj $$0 = this.a.gC();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         jj $$0 = this.a.gC();
         if ($$0 != null && cqa.this.bA.k()) {
            if (this.a($$0, 10.0)) {
               fcu $$1 = new fcu((double)$$0.u() - this.a.dA(), (double)$$0.v() - this.a.dC(), (double)$$0.w() - this.a.dG()).d();
               fcu $$2 = $$1.c(10.0).b(this.a.dA(), this.a.dC(), this.a.dG());
               cqa.this.bA.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               cqa.this.bA.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(jj $$0, double $$1) {
         return !$$0.a(this.a.dt(), $$1);
      }
   }
}
