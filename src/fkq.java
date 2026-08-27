import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fkq extends fkm<cms> {
   private static final ajt A = new ajt("textures/gui/container/beacon.png");
   static final ajt B = new ajt("container/beacon/button_disabled");
   static final ajt C = new ajt("container/beacon/button_selected");
   static final ajt D = new ajt("container/beacon/button_highlighted");
   static final ajt E = new ajt("container/beacon/button");
   static final ajt F = new ajt("container/beacon/confirm");
   static final ajt G = new ajt("container/beacon/cancel");
   private static final wg H = wg.c("block.minecraft.beacon.primary");
   private static final wg I = wg.c("block.minecraft.beacon.secondary");
   private final List<fkq.a> J = Lists.newArrayList();
   @Nullable
   il<bpf> K;
   @Nullable
   il<bpf> L;

   public fkq(final cms $$0, cjs $$1, wg $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.d = 219;
      $$0.a(new cnb() {
         @Override
         public void a(cmp $$0x, int $$1, crj $$2) {
         }

         @Override
         public void a(cmp $$0x, int $$1, int $$2) {
            fkq.this.K = $$0.m();
            fkq.this.L = $$0.n();
         }
      });
   }

   private <T extends fdn & fkq.a> void a(T $$0) {
      this.c($$0);
      this.J.add($$0);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.J.clear();
      this.a(new fkq.c(this.w + 164, this.x + 107));
      this.a(new fkq.b(this.w + 190, this.x + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dma.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            il<bpf> $$4 = dma.a.get($$0).get($$3);
            fkq.d $$5 = new fkq.d(this.w + 76 + $$3 * 24 - $$2 / 2, this.x + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dma.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         il<bpf> $$10 = dma.a.get(3).get($$9);
         fkq.d $$11 = new fkq.d(this.w + 167 + $$9 * 24 - $$8 / 2, this.x + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      il<bpf> $$12 = dma.a.get(0).get(0);
      fkq.d $$13 = new fkq.g(this.w + 167 + ($$7 - 1) * 24 - $$8 / 2, this.x + 47, $$12);
      $$13.k = false;
      this.a($$13);
   }

   @Override
   public void C() {
      super.C();
      this.E();
   }

   void E() {
      int $$0 = this.s.l();
      this.J.forEach($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(fdc $$0, int $$1, int $$2) {
      $$0.a(this.m, H, 62, 10, 14737632);
      $$0.a(this.m, I, 169, 10, 14737632);
   }

   @Override
   protected void a(fdc $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.k - this.c) / 2;
      int $$5 = (this.l - this.d) / 2;
      $$0.a(A, $$4, $$5, 0, 0, this.c, this.d);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new crj(crm.oI), $$4 + 20, $$5 + 109);
      $$0.a(new crj(crm.oy), $$4 + 41, $$5 + 109);
      $$0.a(new crj(crm.ox), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new crj(crm.oH), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new crj(crm.oD), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fkq.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, fkq.G, wf.e);
      }

      @Override
      public void b() {
         fkq.this.j.s.r();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fkq.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, fkq.F, wf.d);
      }

      @Override
      public void b() {
         fkq.this.j.L().b(new agw(Optional.ofNullable(fkq.this.K), Optional.ofNullable(fkq.this.L)));
         fkq.this.j.s.r();
      }

      @Override
      public void a(int $$0) {
         this.j = fkq.this.s.o() && fkq.this.K != null;
      }
   }

   class d extends fkq.e {
      private final boolean c;
      protected final int a;
      private il<bpf> d;
      private glj f;

      public d(int $$0, int $$1, il<bpf> $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(il<bpf> $$0) {
         this.d = $$0;
         this.f = fbp.Q().aG().a($$0);
         this.a(ffa.a(this.b($$0), null));
      }

      protected wu b(il<bpf> $$0) {
         return wg.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fkq.this.K = this.d;
            } else {
               fkq.this.L = this.d;
            }

            fkq.this.E();
         }
      }

      @Override
      protected void a(fdc $$0) {
         $$0.a(this.C() + 2, this.D() + 2, 0, 18, 18, this.f);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fkq.this.K : fkq.this.L));
      }

      @Override
      protected wu aL_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fdg implements fkq.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, wf.a);
      }

      protected e(int $$0, int $$1, wg $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fdc $$0, int $$1, int $$2, float $$3) {
         ajt $$4;
         if (!this.j) {
            $$4 = fkq.B;
         } else if (this.a) {
            $$4 = fkq.C;
         } else if (this.A()) {
            $$4 = fkq.D;
         } else {
            $$4 = fkq.E;
         }

         $$0.a($$4, this.C(), this.D(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fdc var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fhl $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fkq.e {
      private final ajt a;

      protected f(int $$0, int $$1, ajt $$2, wg $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fdc $$0) {
         $$0.a(this.a, this.C() + 2, this.D() + 2, 18, 18);
      }
   }

   class g extends fkq.d {
      public g(int $$0, int $$1, il<bpf> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected wu b(il<bpf> $$0) {
         return wg.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fkq.this.K != null) {
            this.k = true;
            this.a(fkq.this.K);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
