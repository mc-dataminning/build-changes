import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class ddl {
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
   private final dde.b o = dde.b.a(-1.0F, 1.0F);
   private final dde.b[] p = new dde.b[]{dde.b.a(-1.0F, -0.45F), dde.b.a(-0.45F, -0.15F), dde.b.a(-0.15F, 0.2F), dde.b.a(0.2F, 0.55F), dde.b.a(0.55F, 1.0F)};
   private final dde.b[] q = new dde.b[]{dde.b.a(-1.0F, -0.35F), dde.b.a(-0.35F, -0.1F), dde.b.a(-0.1F, 0.1F), dde.b.a(0.1F, 0.3F), dde.b.a(0.3F, 1.0F)};
   private final dde.b[] r = new dde.b[]{
      dde.b.a(-1.0F, -0.78F),
      dde.b.a(-0.78F, -0.375F),
      dde.b.a(-0.375F, -0.2225F),
      dde.b.a(-0.2225F, 0.05F),
      dde.b.a(0.05F, 0.45F),
      dde.b.a(0.45F, 0.55F),
      dde.b.a(0.55F, 1.0F)
   };
   private final dde.b s = this.p[0];
   private final dde.b t = dde.b.a(this.p[1], this.p[4]);
   private final dde.b u = dde.b.a(-1.2F, -1.05F);
   private final dde.b v = dde.b.a(-1.05F, -0.455F);
   private final dde.b w = dde.b.a(-0.455F, -0.19F);
   private final dde.b x = dde.b.a(-0.19F, -0.11F);
   private final dde.b y = dde.b.a(-0.11F, 0.55F);
   private final dde.b z = dde.b.a(-0.11F, 0.03F);
   private final dde.b A = dde.b.a(0.03F, 0.3F);
   private final dde.b B = dde.b.a(0.3F, 1.0F);
   private final ald<dcv>[][] C = new ald[][]{{ddc.X, ddc.V, ddc.T, ddc.R, ddc.P}, {ddc.W, ddc.U, ddc.S, ddc.Q, ddc.P}};
   private final ald<dcv>[][] D = new ald[][]{
      {ddc.d, ddc.d, ddc.d, ddc.q, ddc.p},
      {ddc.b, ddc.b, ddc.i, ddc.p, ddc.o},
      {ddc.j, ddc.b, ddc.i, ddc.k, ddc.l},
      {ddc.r, ddc.r, ddc.i, ddc.x, ddc.x},
      {ddc.f, ddc.f, ddc.f, ddc.f, ddc.f}
   };
   private final ald<dcv>[][] E = new ald[][]{
      {ddc.e, null, ddc.q, null, null},
      {null, null, null, null, ddc.n},
      {ddc.c, null, null, ddc.m, null},
      {null, null, ddc.b, ddc.y, ddc.z},
      {null, null, null, null, null}
   };
   private final ald<dcv>[][] F = new ald[][]{
      {ddc.d, ddc.d, ddc.d, ddc.q, ddc.q},
      {ddc.D, ddc.D, ddc.i, ddc.p, ddc.o},
      {ddc.D, ddc.D, ddc.D, ddc.D, ddc.l},
      {ddc.s, ddc.s, ddc.i, ddc.i, ddc.x},
      {ddc.A, ddc.A, ddc.A, ddc.C, ddc.C}
   };
   private final ald<dcv>[][] G = new ald[][]{
      {ddc.e, null, null, null, null},
      {ddc.E, null, ddc.D, ddc.D, ddc.n},
      {ddc.E, ddc.E, ddc.i, ddc.k, null},
      {null, null, null, null, null},
      {ddc.B, ddc.B, null, null, null}
   };
   private final ald<dcv>[][] H = new ald[][]{
      {ddc.u, ddc.u, ddc.t, ddc.v, ddc.v},
      {ddc.u, ddc.u, ddc.t, ddc.v, ddc.v},
      {ddc.t, ddc.t, ddc.t, ddc.v, ddc.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dde.d> a() {
      dde.b $$0 = dde.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dde.d(this.o, this.o, dde.b.a(this.y, this.o), this.o, $$0, dde.b.a(-1.0F, -0.16F), 0L),
         new dde.d(this.o, this.o, dde.b.a(this.y, this.o), this.o, $$0, dde.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dde.d, ald<dcv>>> $$0) {
      if (aa.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dde.d, ald<dcv>>> $$0) {
      jk.a $$1 = ph.a();
      jj<dxl> $$2 = $$1.b(lq.aD);
      dxm.w.a $$3 = new dxm.w.a($$2.b(dxz.d));
      dxm.w.a $$4 = new dxm.w.a($$2.b(dxz.e));
      dxm.w.a $$5 = new dxm.w.a($$2.b(dxz.g));
      $$0.accept(Pair.of(dde.a(this.o, this.o, this.o, this.o, dde.b.a(0.0F), this.o, 0.01F), ddc.b));
      if (rr.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, azy.a) instanceof axz.e<?, ?> $$7) {
         ald<dcv> $$8 = ddc.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dde.a(this.o, this.o, this.o, dde.b.a($$9), dde.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == ddc.f ? ddc.A : ddc.f;
         }
      }

      if (rr.a($$3, $$4, $$5, false) instanceof axz.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dde.a(this.o, this.o, dde.b.a($$12), this.o, dde.b.a(0.0F), this.o, 0.0F), ddc.q));
         }
      }
   }

   private void c(Consumer<Pair<dde.d, ald<dcv>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, ddc.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dde.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dde.d, ald<dcv>>> $$0) {
      this.c($$0, dde.b.a(-1.0F, -0.93333334F));
      this.b($$0, dde.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dde.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dde.b.a(-0.56666666F, -0.4F));
      this.c($$0, dde.b.a(-0.4F, -0.26666668F));
      this.d($$0, dde.b.a(-0.26666668F, -0.05F));
      this.e($$0, dde.b.a(-0.05F, 0.05F));
      this.d($$0, dde.b.a(0.05F, 0.26666668F));
      this.c($$0, dde.b.a(0.26666668F, 0.4F));
      this.b($$0, dde.b.a(0.4F, 0.56666666F));
      this.a($$0, dde.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dde.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dde.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dde.d, ald<dcv>>> $$0, dde.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dde.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dde.b $$5 = this.q[$$4];
            ald<dcv> $$6 = this.a($$2, $$4, $$1);
            ald<dcv> $$7 = this.b($$2, $$4, $$1);
            ald<dcv> $$8 = this.c($$2, $$4, $$1);
            ald<dcv> $$9 = this.e($$2, $$4, $$1);
            ald<dcv> $$10 = this.h($$2, $$4, $$1);
            ald<dcv> $$11 = this.a($$2, $$4, $$1, $$10);
            ald<dcv> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dde.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dde.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dde.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dde.b.a(this.x, this.z), dde.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dde.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dde.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dde.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dde.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dde.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dde.d, ald<dcv>>> $$0, dde.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dde.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dde.b $$5 = this.q[$$4];
            ald<dcv> $$6 = this.a($$2, $$4, $$1);
            ald<dcv> $$7 = this.b($$2, $$4, $$1);
            ald<dcv> $$8 = this.c($$2, $$4, $$1);
            ald<dcv> $$9 = this.e($$2, $$4, $$1);
            ald<dcv> $$10 = this.h($$2, $$4, $$1);
            ald<dcv> $$11 = this.a($$2, $$4, $$1, $$6);
            ald<dcv> $$12 = this.g($$2, $$4, $$1);
            ald<dcv> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dde.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dde.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dde.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dde.b.a(this.x, this.z), dde.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dde.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dde.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dde.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dde.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dde.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dde.d, ald<dcv>>> $$0, dde.b $$1) {
      this.a($$0, this.o, this.o, this.x, dde.b.a(this.r[0], this.r[2]), $$1, 0.0F, ddc.O);
      this.a($$0, dde.b.a(this.p[1], this.p[2]), this.o, dde.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddc.g);
      this.a($$0, dde.b.a(this.p[3], this.p[4]), this.o, dde.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddc.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dde.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dde.b $$5 = this.q[$$4];
            ald<dcv> $$6 = this.a($$2, $$4, $$1);
            ald<dcv> $$7 = this.b($$2, $$4, $$1);
            ald<dcv> $$8 = this.c($$2, $$4, $$1);
            ald<dcv> $$9 = this.h($$2, $$4, $$1);
            ald<dcv> $$10 = this.e($$2, $$4, $$1);
            ald<dcv> $$11 = this.a($$2, $$4);
            ald<dcv> $$12 = this.a($$2, $$4, $$1, $$6);
            ald<dcv> $$13 = this.d($$2, $$4, $$1);
            ald<dcv> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dde.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dde.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dde.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dde.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dde.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dde.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dde.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dde.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dde.d, ald<dcv>>> $$0, dde.b $$1) {
      this.a($$0, this.o, this.o, this.x, dde.b.a(this.r[0], this.r[2]), $$1, 0.0F, ddc.O);
      this.a($$0, dde.b.a(this.p[1], this.p[2]), this.o, dde.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddc.g);
      this.a($$0, dde.b.a(this.p[3], this.p[4]), this.o, dde.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddc.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dde.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dde.b $$5 = this.q[$$4];
            ald<dcv> $$6 = this.a($$2, $$4, $$1);
            ald<dcv> $$7 = this.b($$2, $$4, $$1);
            ald<dcv> $$8 = this.c($$2, $$4, $$1);
            ald<dcv> $$9 = this.a($$2, $$4);
            ald<dcv> $$10 = this.a($$2, $$4, $$1, $$6);
            ald<dcv> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dde.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dde.b.a(this.A, this.B), dde.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dde.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dde.b.a(this.A, this.B), dde.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dde.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dde.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dde.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dde.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dde.d, ald<dcv>>> $$0, dde.b $$1) {
      this.a($$0, this.s, this.o, this.x, dde.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? ddc.O : ddc.L);
      this.a($$0, this.t, this.o, this.x, dde.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? ddc.O : ddc.K);
      this.a($$0, this.s, this.o, this.z, dde.b.a(this.r[0], this.r[1]), $$1, 0.0F, ddc.L);
      this.a($$0, this.t, this.o, this.z, dde.b.a(this.r[0], this.r[1]), $$1, 0.0F, ddc.K);
      this.a($$0, this.s, this.o, dde.b.a(this.x, this.B), dde.b.a(this.r[2], this.r[5]), $$1, 0.0F, ddc.L);
      this.a($$0, this.t, this.o, dde.b.a(this.x, this.B), dde.b.a(this.r[2], this.r[5]), $$1, 0.0F, ddc.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, ddc.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, ddc.K);
      this.a($$0, dde.b.a(this.p[1], this.p[2]), this.o, dde.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddc.g);
      this.a($$0, dde.b.a(this.p[3], this.p[4]), this.o, dde.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddc.h);
      this.a($$0, this.s, this.o, dde.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddc.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dde.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dde.b $$5 = this.q[$$4];
            ald<dcv> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dde.b.a(this.A, this.B), dde.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dde.d, ald<dcv>>> $$0) {
      this.b($$0, this.o, this.o, dde.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, ddc.Z);
      this.b($$0, this.o, dde.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, ddc.aa);
      this.c($$0, this.o, this.o, this.o, dde.b.a(this.r[0], this.r[1]), this.o, 0.0F, ddc.ab);
   }

   private ald<dcv> a(int $$0, int $$1, dde.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         ald<dcv> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private ald<dcv> b(int $$0, int $$1, dde.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private ald<dcv> c(int $$0, int $$1, dde.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private ald<dcv> a(int $$0, int $$1, dde.b $$2, ald<dcv> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? ddc.w : $$3;
   }

   private ald<dcv> d(int $$0, int $$1, dde.b $$2) {
      ald<dcv> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private ald<dcv> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return ddc.N;
      } else {
         return $$0 == 4 ? ddc.f : ddc.M;
      }
   }

   private ald<dcv> a(int $$0, dde.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? ddc.A : ddc.B;
      } else {
         return $$0 < 3 ? ddc.A : ddc.C;
      }
   }

   private ald<dcv> e(int $$0, int $$1, dde.b $$2) {
      if ($$2.b() >= 0L) {
         ald<dcv> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private ald<dcv> f(int $$0, int $$1, dde.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? ddc.I : ddc.H;
      } else {
         return $$0 == 3 ? ddc.J : this.a($$1, $$2);
      }
   }

   private ald<dcv> g(int $$0, int $$1, dde.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? ddc.G : ddc.F;
      }
   }

   private ald<dcv> h(int $$0, int $$1, dde.b $$2) {
      ald<dcv> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dde.d, ald<dcv>>> $$0, dde.b $$1, dde.b $$2, dde.b $$3, dde.b $$4, dde.b $$5, float $$6, ald<dcv> $$7) {
      $$0.accept(Pair.of(dde.a($$1, $$2, $$3, $$4, dde.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dde.a($$1, $$2, $$3, $$4, dde.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dde.d, ald<dcv>>> $$0, dde.b $$1, dde.b $$2, dde.b $$3, dde.b $$4, dde.b $$5, float $$6, ald<dcv> $$7) {
      $$0.accept(Pair.of(dde.a($$1, $$2, $$3, $$4, dde.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dde.d, ald<dcv>>> $$0, dde.b $$1, dde.b $$2, dde.b $$3, dde.b $$4, dde.b $$5, float $$6, ald<dcv> $$7) {
      $$0.accept(Pair.of(dde.a($$1, $$2, $$3, $$4, dde.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dxl $$0, dxl $$1, dxl.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dxz.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dxz.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dxz.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dxz.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dde.a((float)$$0);
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

   private static String a(double $$0, dde.b[] $$1) {
      double $$2 = (double)dde.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bab
   public dde.b[] b() {
      return this.p;
   }

   @bab
   public dde.b[] c() {
      return this.q;
   }

   @bab
   public dde.b[] d() {
      return this.r;
   }

   @bab
   public dde.b[] e() {
      return new dde.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @bab
   public dde.b[] f() {
      return new dde.b[]{
         dde.b.a(-2.0F, dxz.a(0.05F)),
         dde.b.a(dxz.a(0.05F), dxz.a(0.26666668F)),
         dde.b.a(dxz.a(0.26666668F), dxz.a(0.4F)),
         dde.b.a(dxz.a(0.4F), dxz.a(0.56666666F)),
         dde.b.a(dxz.a(0.56666666F), 2.0F)
      };
   }

   @bab
   public dde.b[] g() {
      return new dde.b[]{dde.b.a(-2.0F, 0.0F), dde.b.a(0.0F, 2.0F)};
   }
}
