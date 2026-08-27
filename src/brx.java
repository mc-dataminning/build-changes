import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class brx extends brj implements bgg {
   protected static final aby<Byte> c = acb.a(brx.class, aca.a);
   private static final int d = 25;
   private int e;
   private int bT;
   private static final bdi bU = apw.a(20, 39);
   private int bV;
   @Nullable
   private UUID bW;

   public brx(bfn<? extends brx> $$0, cmm $$1) {
      super($$0, $$1);
      this.r(1.0F);
   }

   @Override
   protected void x() {
      this.bO.a(1, new bnf(this, 1.0, true));
      this.bO.a(2, new bnk(this, 0.9, 32.0F));
      this.bO.a(2, new bng(this, 0.6, false));
      this.bO.a(4, new bmx(this, 0.6));
      this.bO.a(5, new bnm(this));
      this.bO.a(7, new bnd(this, byo.class, 6.0F));
      this.bO.a(8, new bnq(this));
      this.bP.a(1, new bom(this));
      this.bP.a(2, new bon(this));
      this.bP.a(3, new boo<>(this, byo.class, 10, true, false, this::a_));
      this.bP.a(3, new boo<>(this, bgb.class, 5, false, false, $$0 -> $$0 instanceof bvu && !($$0 instanceof bvo)));
      this.bP.a(4, new bou<>(this, false));
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(c, (byte)0);
   }

   public static bhf.a q() {
      return bgb.y().a(bhg.a, 100.0).a(bhg.d, 0.25).a(bhg.c, 1.0).a(bhg.f, 15.0);
   }

   @Override
   protected int m(int $$0) {
      return $$0;
   }

   @Override
   protected void A(bfj $$0) {
      if ($$0 instanceof bvu && !($$0 instanceof bvo) && this.ec().a(20) == 0) {
         this.h((bfz)$$0);
      }

      super.A($$0);
   }

   @Override
   public void b_() {
      super.b_();
      if (this.e > 0) {
         this.e--;
      }

      if (this.bT > 0) {
         this.bT--;
      }

      if (!this.dI().B) {
         this.a((aif)this.dI(), true);
      }
   }

   @Override
   public boolean bg() {
      return this.dl().i() > 2.5000003E-7F && this.af.a(5) == 0;
   }

   @Override
   public boolean a(bfn<?> $$0) {
      if (this.fZ() && $$0 == bfn.bt) {
         return false;
      } else {
         return $$0 == bfn.u ? false : super.a($$0);
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.fZ());
      this.c($$0);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.x($$0.q("PlayerCreated"));
      this.a(this.dI(), $$0);
   }

   @Override
   public void c() {
      this.a(bU.a(this.af));
   }

   @Override
   public void a(int $$0) {
      this.bV = $$0;
   }

   @Override
   public int a() {
      return this.bV;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bW = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bW;
   }

   private float ga() {
      return (float)this.b(bhg.f);
   }

   @Override
   public boolean z(bfj $$0) {
      this.e = 10;
      this.dI().a(this, (byte)4);
      float $$1 = this.ga();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.af.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dJ().b((bfz)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof bfz $$4 ? $$4.b(bhg.c) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.f($$0.dl().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(amh.lM, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      brx.a $$2 = this.r();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.r() != $$2) {
         this.a(amh.lN, 1.0F, 1.0F);
      }

      return $$3;
   }

   public brx.a r() {
      return brx.a.a(this.er() / this.eI());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(amh.lM, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.bT = 400;
      } else if ($$0 == 34) {
         this.bT = 0;
      } else {
         super.b($$0);
      }
   }

   public int w() {
      return this.e;
   }

   public void w(boolean $$0) {
      if ($$0) {
         this.bT = 400;
         this.dI().a(this, (byte)11);
      } else {
         this.bT = 0;
         this.dI().a(this, (byte)34);
      }
   }

   @Override
   protected amg d(ben $$0) {
      return amh.lP;
   }

   @Override
   protected amg g_() {
      return amh.lO;
   }

   @Override
   protected bdx b(byo $$0, bdw $$1) {
      cfz $$2 = $$0.b($$1);
      if (!$$2.a(cgc.nQ)) {
         return bdx.d;
      } else {
         float $$3 = this.er();
         this.s(25.0F);
         if (this.er() == $$3) {
            return bdx.d;
         } else {
            float $$4 = 1.0F + (this.af.i() - this.af.i()) * 0.2F;
            this.a(amh.lQ, 1.0F, $$4);
            if (!$$0.fO().d) {
               $$2.h(1);
            }

            return bdx.a(this.dI().B);
         }
      }
   }

   @Override
   protected void b(gu $$0, dcb $$1) {
      this.a(amh.lR, 1.0F, 1.0F);
   }

   public int fY() {
      return this.bT;
   }

   public boolean fZ() {
      return (this.am.b(c) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.am.b(c);
      if ($$0) {
         this.am.b(c, (byte)($$1 | 1));
      } else {
         this.am.b(c, (byte)($$1 & -2));
      }
   }

   @Override
   public void a(ben $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(cmp $$0) {
      gu $$1 = this.di();
      gu $$2 = $$1.d();
      dcb $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            gu $$5 = $$1.b($$4);
            dcb $$6 = $$0.a_($$5);
            if (!cmx.a($$0, $$5, $$6, $$6.u(), bfn.ac)) {
               return false;
            }
         }

         return cmx.a($$0, $$1, $$0.a_($$1), dxf.a.g(), bfn.ac) && $$0.f(this);
      }
   }

   @Override
   public eei cG() {
      return new eei(0.0, (double)(0.875F * this.cF()), (double)(this.dd() * 0.4F));
   }

   public static enum a {
      a(1.0F),
      b(0.75F),
      c(0.5F),
      d(0.25F);

      private static final List<brx.a> e = Stream.of(values())
         .sorted(Comparator.comparingDouble($$0 -> (double)$$0.f))
         .collect(ImmutableList.toImmutableList());
      private final float f;

      private a(float $$0) {
         this.f = $$0;
      }

      public static brx.a a(float $$0) {
         for (brx.a $$1 : e) {
            if ($$0 < $$1.f) {
               return $$1;
            }
         }

         return a;
      }
   }
}
