import javax.annotation.Nullable;

public class cnh extends cmw {
   private static final alc<Byte> a = alg.a(cnh.class, ale.a);
   private static final float b = 0.1F;

   public cnh(bvq<? extends cnh> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(1, new ccx(this));
      this.bT.a(2, new cck<>(this, cjf.class, 6.0F, 1.0, 1.2, $$0 -> !((cjf)$$0).t()));
      this.bT.a(3, new cdj(this, 0.4F));
      this.bT.a(4, new cnh.a(this));
      this.bT.a(5, new ceq(this, 0.8));
      this.bT.a(6, new cdl(this, cpw.class, 8.0F));
      this.bT.a(6, new cdy(this));
      this.bU.a(1, new cev(this));
      this.bU.a(2, new cnh.c<>(this, cpw.class));
      this.bU.a(3, new cnh.c<>(this, cii.class));
   }

   @Override
   protected cfr b(dhh $$0) {
      return new cfs(this, $$0);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   public void h() {
      super.h();
      if (!this.dV().C) {
         this.x(this.P);
      }
   }

   public static bxm.a p() {
      return cmw.gr().a(bxn.s, 16.0).a(bxn.v, 0.3F);
   }

   @Override
   protected axe u() {
      return axf.zk;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.zm;
   }

   @Override
   protected axe o_() {
      return axf.zl;
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
      this.a(axf.zn, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.t();
   }

   @Override
   public void a(dxu $$0, fbx $$1) {
      if (!$$0.a(dkn.bz)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean b(buo $$0) {
      return $$0.a(buq.s) ? false : super.b($$0);
   }

   public boolean t() {
      return (this.al.a(a) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.al.a(a);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.al.a(a, $$1);
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      bam $$4 = $$0.H_();
      if ($$4.a(100) == 0) {
         cne $$5 = bvq.bf.a(this.dV(), bvp.g);
         if ($$5 != null) {
            $$5.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cnh.b();
         if ($$0.al() == btf.d && $$4.i() < 0.1F * $$1.d()) {
            ((cnh.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cnh.b $$6) {
         jq<bum> $$7 = $$6.a;
         if ($$7 != null) {
            this.a(new buo($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public fbx l(bvj $$0) {
      return $$0.dq() <= this.dq() ? new fbx(0.0, 0.3125 * (double)this.ej(), 0.0) : super.l($$0);
   }

   static class a extends cdn {
      public a(cnh $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean b() {
         return super.b() && !this.a.ca();
      }

      @Override
      public boolean c() {
         float $$0 = this.a.by();
         if ($$0 >= 0.5F && this.a.dY().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.c();
         }
      }
   }

   public static class b implements bwy {
      @Nullable
      public jq<bum> a;

      public void a(bam $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = buq.a;
         } else if ($$1 <= 2) {
            this.a = buq.e;
         } else if ($$1 <= 3) {
            this.a = buq.j;
         } else if ($$1 <= 4) {
            this.a = buq.n;
         }
      }
   }

   static class c<T extends bwf> extends cew<T> {
      public c(cnh $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.by();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
