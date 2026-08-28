import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class ddp {
   private static final float h = 0.05F;
   private static final float i = 0.26666668F;
   public static final float a = 0.4F;
   private static final float j = 0.93333334F;
   private static final float k = 0.1F;
   public static final float b = 0.56666666F;
   private static final float l = 0.7666667F;
   public static final float c = -0.11F;
   public static final float d = 0.03F;
   public static final float e = 0.3F;
   public static final float f = -0.78F;
   public static final float g = -0.375F;
   private static final float m = -0.225F;
   private static final float n = 0.9F;
   private final ddi.b o = ddi.b.a(-1.0F, 1.0F);
   private final ddi.b[] p = new ddi.b[]{ddi.b.a(-1.0F, -0.45F), ddi.b.a(-0.45F, -0.15F), ddi.b.a(-0.15F, 0.2F), ddi.b.a(0.2F, 0.55F), ddi.b.a(0.55F, 1.0F)};
   private final ddi.b[] q = new ddi.b[]{ddi.b.a(-1.0F, -0.35F), ddi.b.a(-0.35F, -0.1F), ddi.b.a(-0.1F, 0.1F), ddi.b.a(0.1F, 0.3F), ddi.b.a(0.3F, 1.0F)};
   private final ddi.b[] r = new ddi.b[]{
      ddi.b.a(-1.0F, -0.78F),
      ddi.b.a(-0.78F, -0.375F),
      ddi.b.a(-0.375F, -0.2225F),
      ddi.b.a(-0.2225F, 0.05F),
      ddi.b.a(0.05F, 0.45F),
      ddi.b.a(0.45F, 0.55F),
      ddi.b.a(0.55F, 1.0F)
   };
   private final ddi.b s = this.p[0];
   private final ddi.b t = ddi.b.a(this.p[1], this.p[4]);
   private final ddi.b u = ddi.b.a(-1.2F, -1.05F);
   private final ddi.b v = ddi.b.a(-1.05F, -0.455F);
   private final ddi.b w = ddi.b.a(-0.455F, -0.19F);
   private final ddi.b x = ddi.b.a(-0.19F, -0.11F);
   private final ddi.b y = ddi.b.a(-0.11F, 0.55F);
   private final ddi.b z = ddi.b.a(-0.11F, 0.03F);
   private final ddi.b A = ddi.b.a(0.03F, 0.3F);
   private final ddi.b B = ddi.b.a(0.3F, 1.0F);
   private final ale<dcz>[][] C = new ale[][]{{ddg.X, ddg.V, ddg.T, ddg.R, ddg.P}, {ddg.W, ddg.U, ddg.S, ddg.Q, ddg.P}};
   private final ale<dcz>[][] D = new ale[][]{
      {ddg.d, ddg.d, ddg.d, ddg.q, ddg.p},
      {ddg.b, ddg.b, ddg.i, ddg.p, ddg.o},
      {ddg.j, ddg.b, ddg.i, ddg.k, ddg.l},
      {ddg.r, ddg.r, ddg.i, ddg.x, ddg.x},
      {ddg.f, ddg.f, ddg.f, ddg.f, ddg.f}
   };
   private final ale<dcz>[][] E = new ale[][]{
      {ddg.e, null, ddg.q, null, null},
      {null, null, null, null, ddg.n},
      {ddg.c, null, null, ddg.m, null},
      {null, null, ddg.b, ddg.y, ddg.z},
      {null, null, null, null, null}
   };
   private final ale<dcz>[][] F = new ale[][]{
      {ddg.d, ddg.d, ddg.d, ddg.q, ddg.q},
      {ddg.D, ddg.D, ddg.i, ddg.p, ddg.o},
      {ddg.D, ddg.D, ddg.D, ddg.D, ddg.l},
      {ddg.s, ddg.s, ddg.i, ddg.i, ddg.x},
      {ddg.A, ddg.A, ddg.A, ddg.C, ddg.C}
   };
   private final ale<dcz>[][] G = new ale[][]{
      {ddg.e, null, null, null, null},
      {ddg.E, null, ddg.D, ddg.D, ddg.n},
      {ddg.E, ddg.E, ddg.i, ddg.k, null},
      {null, null, null, null, null},
      {ddg.B, ddg.B, null, null, null}
   };
   private final ale<dcz>[][] H = new ale[][]{
      {ddg.u, ddg.u, ddg.t, ddg.v, ddg.v},
      {ddg.u, ddg.u, ddg.t, ddg.v, ddg.v},
      {ddg.t, ddg.t, ddg.t, ddg.v, ddg.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<ddi.d> a() {
      ddi.b $$0 = ddi.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new ddi.d(this.o, this.o, ddi.b.a(this.y, this.o), this.o, $$0, ddi.b.a(-1.0F, -0.16F), 0L),
         new ddi.d(this.o, this.o, ddi.b.a(this.y, this.o), this.o, $$0, ddi.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<ddi.d, ale<dcz>>> $$0) {
      if (aa.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<ddi.d, ale<dcz>>> $$0) {
      jk.a $$1 = ph.a();
      jj<dxp> $$2 = $$1.b(lq.aD);
      dxq.w.a $$3 = new dxq.w.a($$2.b(dyd.d));
      dxq.w.a $$4 = new dxq.w.a($$2.b(dyd.e));
      dxq.w.a $$5 = new dxq.w.a($$2.b(dyd.g));
      $$0.accept(Pair.of(ddi.a(this.o, this.o, this.o, this.o, ddi.b.a(0.0F), this.o, 0.01F), ddg.b));
      if (rr.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, baa.a) instanceof aya.e<?, ?> $$7) {
         ale<dcz> $$8 = ddg.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(ddi.a(this.o, this.o, this.o, ddi.b.a($$9), ddi.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == ddg.f ? ddg.A : ddg.f;
         }
      }

      if (rr.a($$3, $$4, $$5, false) instanceof aya.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(ddi.a(this.o, this.o, ddi.b.a($$12), this.o, ddi.b.a(0.0F), this.o, 0.0F), ddg.q));
         }
      }
   }

   private void c(Consumer<Pair<ddi.d, ale<dcz>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, ddg.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         ddi.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<ddi.d, ale<dcz>>> $$0) {
      this.c($$0, ddi.b.a(-1.0F, -0.93333334F));
      this.b($$0, ddi.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, ddi.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, ddi.b.a(-0.56666666F, -0.4F));
      this.c($$0, ddi.b.a(-0.4F, -0.26666668F));
      this.d($$0, ddi.b.a(-0.26666668F, -0.05F));
      this.e($$0, ddi.b.a(-0.05F, 0.05F));
      this.d($$0, ddi.b.a(0.05F, 0.26666668F));
      this.c($$0, ddi.b.a(0.26666668F, 0.4F));
      this.b($$0, ddi.b.a(0.4F, 0.56666666F));
      this.a($$0, ddi.b.a(0.56666666F, 0.7666667F));
      this.b($$0, ddi.b.a(0.7666667F, 0.93333334F));
      this.c($$0, ddi.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<ddi.d, ale<dcz>>> $$0, ddi.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddi.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddi.b $$5 = this.q[$$4];
            ale<dcz> $$6 = this.a($$2, $$4, $$1);
            ale<dcz> $$7 = this.b($$2, $$4, $$1);
            ale<dcz> $$8 = this.c($$2, $$4, $$1);
            ale<dcz> $$9 = this.e($$2, $$4, $$1);
            ale<dcz> $$10 = this.h($$2, $$4, $$1);
            ale<dcz> $$11 = this.a($$2, $$4, $$1, $$10);
            ale<dcz> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddi.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddi.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddi.b.a(this.x, this.z), ddi.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddi.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddi.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddi.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<ddi.d, ale<dcz>>> $$0, ddi.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddi.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddi.b $$5 = this.q[$$4];
            ale<dcz> $$6 = this.a($$2, $$4, $$1);
            ale<dcz> $$7 = this.b($$2, $$4, $$1);
            ale<dcz> $$8 = this.c($$2, $$4, $$1);
            ale<dcz> $$9 = this.e($$2, $$4, $$1);
            ale<dcz> $$10 = this.h($$2, $$4, $$1);
            ale<dcz> $$11 = this.a($$2, $$4, $$1, $$6);
            ale<dcz> $$12 = this.g($$2, $$4, $$1);
            ale<dcz> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, ddi.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddi.b.a(this.x, this.z), ddi.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddi.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddi.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddi.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<ddi.d, ale<dcz>>> $$0, ddi.b $$1) {
      this.a($$0, this.o, this.o, this.x, ddi.b.a(this.r[0], this.r[2]), $$1, 0.0F, ddg.O);
      this.a($$0, ddi.b.a(this.p[1], this.p[2]), this.o, ddi.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddg.g);
      this.a($$0, ddi.b.a(this.p[3], this.p[4]), this.o, ddi.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddg.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddi.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddi.b $$5 = this.q[$$4];
            ale<dcz> $$6 = this.a($$2, $$4, $$1);
            ale<dcz> $$7 = this.b($$2, $$4, $$1);
            ale<dcz> $$8 = this.c($$2, $$4, $$1);
            ale<dcz> $$9 = this.h($$2, $$4, $$1);
            ale<dcz> $$10 = this.e($$2, $$4, $$1);
            ale<dcz> $$11 = this.a($$2, $$4);
            ale<dcz> $$12 = this.a($$2, $$4, $$1, $$6);
            ale<dcz> $$13 = this.d($$2, $$4, $$1);
            ale<dcz> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddi.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, ddi.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddi.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, ddi.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, ddi.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, ddi.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<ddi.d, ale<dcz>>> $$0, ddi.b $$1) {
      this.a($$0, this.o, this.o, this.x, ddi.b.a(this.r[0], this.r[2]), $$1, 0.0F, ddg.O);
      this.a($$0, ddi.b.a(this.p[1], this.p[2]), this.o, ddi.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddg.g);
      this.a($$0, ddi.b.a(this.p[3], this.p[4]), this.o, ddi.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddg.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddi.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddi.b $$5 = this.q[$$4];
            ale<dcz> $$6 = this.a($$2, $$4, $$1);
            ale<dcz> $$7 = this.b($$2, $$4, $$1);
            ale<dcz> $$8 = this.c($$2, $$4, $$1);
            ale<dcz> $$9 = this.a($$2, $$4);
            ale<dcz> $$10 = this.a($$2, $$4, $$1, $$6);
            ale<dcz> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, ddi.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), ddi.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, ddi.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), ddi.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, ddi.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddi.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, ddi.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<ddi.d, ale<dcz>>> $$0, ddi.b $$1) {
      this.a($$0, this.s, this.o, this.x, ddi.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? ddg.O : ddg.L);
      this.a($$0, this.t, this.o, this.x, ddi.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? ddg.O : ddg.K);
      this.a($$0, this.s, this.o, this.z, ddi.b.a(this.r[0], this.r[1]), $$1, 0.0F, ddg.L);
      this.a($$0, this.t, this.o, this.z, ddi.b.a(this.r[0], this.r[1]), $$1, 0.0F, ddg.K);
      this.a($$0, this.s, this.o, ddi.b.a(this.x, this.B), ddi.b.a(this.r[2], this.r[5]), $$1, 0.0F, ddg.L);
      this.a($$0, this.t, this.o, ddi.b.a(this.x, this.B), ddi.b.a(this.r[2], this.r[5]), $$1, 0.0F, ddg.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, ddg.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, ddg.K);
      this.a($$0, ddi.b.a(this.p[1], this.p[2]), this.o, ddi.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddg.g);
      this.a($$0, ddi.b.a(this.p[3], this.p[4]), this.o, ddi.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddg.h);
      this.a($$0, this.s, this.o, ddi.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddg.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddi.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddi.b $$5 = this.q[$$4];
            ale<dcz> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), ddi.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<ddi.d, ale<dcz>>> $$0) {
      this.b($$0, this.o, this.o, ddi.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, ddg.Z);
      this.b($$0, this.o, ddi.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, ddg.aa);
      this.c($$0, this.o, this.o, this.o, ddi.b.a(this.r[0], this.r[1]), this.o, 0.0F, ddg.ab);
   }

   private ale<dcz> a(int $$0, int $$1, ddi.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         ale<dcz> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private ale<dcz> b(int $$0, int $$1, ddi.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private ale<dcz> c(int $$0, int $$1, ddi.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private ale<dcz> a(int $$0, int $$1, ddi.b $$2, ale<dcz> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? ddg.w : $$3;
   }

   private ale<dcz> d(int $$0, int $$1, ddi.b $$2) {
      ale<dcz> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private ale<dcz> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return ddg.N;
      } else {
         return $$0 == 4 ? ddg.f : ddg.M;
      }
   }

   private ale<dcz> a(int $$0, ddi.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? ddg.A : ddg.B;
      } else {
         return $$0 < 3 ? ddg.A : ddg.C;
      }
   }

   private ale<dcz> e(int $$0, int $$1, ddi.b $$2) {
      if ($$2.b() >= 0L) {
         ale<dcz> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private ale<dcz> f(int $$0, int $$1, ddi.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? ddg.I : ddg.H;
      } else {
         return $$0 == 3 ? ddg.J : this.a($$1, $$2);
      }
   }

   private ale<dcz> g(int $$0, int $$1, ddi.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? ddg.G : ddg.F;
      }
   }

   private ale<dcz> h(int $$0, int $$1, ddi.b $$2) {
      ale<dcz> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<ddi.d, ale<dcz>>> $$0, ddi.b $$1, ddi.b $$2, ddi.b $$3, ddi.b $$4, ddi.b $$5, float $$6, ale<dcz> $$7) {
      $$0.accept(Pair.of(ddi.a($$1, $$2, $$3, $$4, ddi.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(ddi.a($$1, $$2, $$3, $$4, ddi.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<ddi.d, ale<dcz>>> $$0, ddi.b $$1, ddi.b $$2, ddi.b $$3, ddi.b $$4, ddi.b $$5, float $$6, ale<dcz> $$7) {
      $$0.accept(Pair.of(ddi.a($$1, $$2, $$3, $$4, ddi.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<ddi.d, ale<dcz>>> $$0, ddi.b $$1, ddi.b $$2, ddi.b $$3, ddi.b $$4, ddi.b $$5, float $$6, ale<dcz> $$7) {
      $$0.accept(Pair.of(ddi.a($$1, $$2, $$3, $$4, ddi.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dxp $$0, dxp $$1, dxp.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dyd.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dyd.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dyd.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dyd.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)ddi.a((float)$$0);
      if ($$1 < (double)this.u.b()) {
         return "Mushroom fields";
      } else if ($$1 < (double)this.v.b()) {
         return "Deep ocean";
      } else if ($$1 < (double)this.w.b()) {
         return "Ocean";
      } else if ($$1 < (double)this.x.b()) {
         return "Coast";
      } else if ($$1 < (double)this.z.b()) {
         return "Near inland";
      } else {
         return $$1 < (double)this.A.b() ? "Mid inland" : "Far inland";
      }
   }

   public String c(double $$0) {
      return a($$0, this.r);
   }

   public String d(double $$0) {
      return a($$0, this.p);
   }

   public String e(double $$0) {
      return a($$0, this.q);
   }

   private static String a(double $$0, ddi.b[] $$1) {
      double $$2 = (double)ddi.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bad
   public ddi.b[] b() {
      return this.p;
   }

   @bad
   public ddi.b[] c() {
      return this.q;
   }

   @bad
   public ddi.b[] d() {
      return this.r;
   }

   @bad
   public ddi.b[] e() {
      return new ddi.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @bad
   public ddi.b[] f() {
      return new ddi.b[]{
         ddi.b.a(-2.0F, dyd.a(0.05F)),
         ddi.b.a(dyd.a(0.05F), dyd.a(0.26666668F)),
         ddi.b.a(dyd.a(0.26666668F), dyd.a(0.4F)),
         ddi.b.a(dyd.a(0.4F), dyd.a(0.56666666F)),
         ddi.b.a(dyd.a(0.56666666F), 2.0F)
      };
   }

   @bad
   public ddi.b[] g() {
      return new ddi.b[]{ddi.b.a(-2.0F, 0.0F), ddi.b.a(0.0F, 2.0F)};
   }
}
