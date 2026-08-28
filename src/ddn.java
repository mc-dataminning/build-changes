import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class ddn {
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
   private final ddg.b o = ddg.b.a(-1.0F, 1.0F);
   private final ddg.b[] p = new ddg.b[]{ddg.b.a(-1.0F, -0.45F), ddg.b.a(-0.45F, -0.15F), ddg.b.a(-0.15F, 0.2F), ddg.b.a(0.2F, 0.55F), ddg.b.a(0.55F, 1.0F)};
   private final ddg.b[] q = new ddg.b[]{ddg.b.a(-1.0F, -0.35F), ddg.b.a(-0.35F, -0.1F), ddg.b.a(-0.1F, 0.1F), ddg.b.a(0.1F, 0.3F), ddg.b.a(0.3F, 1.0F)};
   private final ddg.b[] r = new ddg.b[]{
      ddg.b.a(-1.0F, -0.78F),
      ddg.b.a(-0.78F, -0.375F),
      ddg.b.a(-0.375F, -0.2225F),
      ddg.b.a(-0.2225F, 0.05F),
      ddg.b.a(0.05F, 0.45F),
      ddg.b.a(0.45F, 0.55F),
      ddg.b.a(0.55F, 1.0F)
   };
   private final ddg.b s = this.p[0];
   private final ddg.b t = ddg.b.a(this.p[1], this.p[4]);
   private final ddg.b u = ddg.b.a(-1.2F, -1.05F);
   private final ddg.b v = ddg.b.a(-1.05F, -0.455F);
   private final ddg.b w = ddg.b.a(-0.455F, -0.19F);
   private final ddg.b x = ddg.b.a(-0.19F, -0.11F);
   private final ddg.b y = ddg.b.a(-0.11F, 0.55F);
   private final ddg.b z = ddg.b.a(-0.11F, 0.03F);
   private final ddg.b A = ddg.b.a(0.03F, 0.3F);
   private final ddg.b B = ddg.b.a(0.3F, 1.0F);
   private final ale<dcx>[][] C = new ale[][]{{dde.X, dde.V, dde.T, dde.R, dde.P}, {dde.W, dde.U, dde.S, dde.Q, dde.P}};
   private final ale<dcx>[][] D = new ale[][]{
      {dde.d, dde.d, dde.d, dde.q, dde.p},
      {dde.b, dde.b, dde.i, dde.p, dde.o},
      {dde.j, dde.b, dde.i, dde.k, dde.l},
      {dde.r, dde.r, dde.i, dde.x, dde.x},
      {dde.f, dde.f, dde.f, dde.f, dde.f}
   };
   private final ale<dcx>[][] E = new ale[][]{
      {dde.e, null, dde.q, null, null},
      {null, null, null, null, dde.n},
      {dde.c, null, null, dde.m, null},
      {null, null, dde.b, dde.y, dde.z},
      {null, null, null, null, null}
   };
   private final ale<dcx>[][] F = new ale[][]{
      {dde.d, dde.d, dde.d, dde.q, dde.q},
      {dde.D, dde.D, dde.i, dde.p, dde.o},
      {dde.D, dde.D, dde.D, dde.D, dde.l},
      {dde.s, dde.s, dde.i, dde.i, dde.x},
      {dde.A, dde.A, dde.A, dde.C, dde.C}
   };
   private final ale<dcx>[][] G = new ale[][]{
      {dde.e, null, null, null, null},
      {dde.E, null, dde.D, dde.D, dde.n},
      {dde.E, dde.E, dde.i, dde.k, null},
      {null, null, null, null, null},
      {dde.B, dde.B, null, null, null}
   };
   private final ale<dcx>[][] H = new ale[][]{
      {dde.u, dde.u, dde.t, dde.v, dde.v},
      {dde.u, dde.u, dde.t, dde.v, dde.v},
      {dde.t, dde.t, dde.t, dde.v, dde.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<ddg.d> a() {
      ddg.b $$0 = ddg.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new ddg.d(this.o, this.o, ddg.b.a(this.y, this.o), this.o, $$0, ddg.b.a(-1.0F, -0.16F), 0L),
         new ddg.d(this.o, this.o, ddg.b.a(this.y, this.o), this.o, $$0, ddg.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<ddg.d, ale<dcx>>> $$0) {
      if (aa.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<ddg.d, ale<dcx>>> $$0) {
      jk.a $$1 = ph.a();
      jj<dxn> $$2 = $$1.b(lq.aD);
      dxo.w.a $$3 = new dxo.w.a($$2.b(dyb.d));
      dxo.w.a $$4 = new dxo.w.a($$2.b(dyb.e));
      dxo.w.a $$5 = new dxo.w.a($$2.b(dyb.g));
      $$0.accept(Pair.of(ddg.a(this.o, this.o, this.o, this.o, ddg.b.a(0.0F), this.o, 0.01F), dde.b));
      if (rr.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, baa.a) instanceof aya.e<?, ?> $$7) {
         ale<dcx> $$8 = dde.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(ddg.a(this.o, this.o, this.o, ddg.b.a($$9), ddg.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dde.f ? dde.A : dde.f;
         }
      }

      if (rr.a($$3, $$4, $$5, false) instanceof aya.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(ddg.a(this.o, this.o, ddg.b.a($$12), this.o, ddg.b.a(0.0F), this.o, 0.0F), dde.q));
         }
      }
   }

   private void c(Consumer<Pair<ddg.d, ale<dcx>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dde.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         ddg.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<ddg.d, ale<dcx>>> $$0) {
      this.c($$0, ddg.b.a(-1.0F, -0.93333334F));
      this.b($$0, ddg.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, ddg.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, ddg.b.a(-0.56666666F, -0.4F));
      this.c($$0, ddg.b.a(-0.4F, -0.26666668F));
      this.d($$0, ddg.b.a(-0.26666668F, -0.05F));
      this.e($$0, ddg.b.a(-0.05F, 0.05F));
      this.d($$0, ddg.b.a(0.05F, 0.26666668F));
      this.c($$0, ddg.b.a(0.26666668F, 0.4F));
      this.b($$0, ddg.b.a(0.4F, 0.56666666F));
      this.a($$0, ddg.b.a(0.56666666F, 0.7666667F));
      this.b($$0, ddg.b.a(0.7666667F, 0.93333334F));
      this.c($$0, ddg.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<ddg.d, ale<dcx>>> $$0, ddg.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddg.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddg.b $$5 = this.q[$$4];
            ale<dcx> $$6 = this.a($$2, $$4, $$1);
            ale<dcx> $$7 = this.b($$2, $$4, $$1);
            ale<dcx> $$8 = this.c($$2, $$4, $$1);
            ale<dcx> $$9 = this.e($$2, $$4, $$1);
            ale<dcx> $$10 = this.h($$2, $$4, $$1);
            ale<dcx> $$11 = this.a($$2, $$4, $$1, $$10);
            ale<dcx> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddg.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddg.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, ddg.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddg.b.a(this.x, this.z), ddg.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddg.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddg.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddg.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, ddg.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddg.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<ddg.d, ale<dcx>>> $$0, ddg.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddg.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddg.b $$5 = this.q[$$4];
            ale<dcx> $$6 = this.a($$2, $$4, $$1);
            ale<dcx> $$7 = this.b($$2, $$4, $$1);
            ale<dcx> $$8 = this.c($$2, $$4, $$1);
            ale<dcx> $$9 = this.e($$2, $$4, $$1);
            ale<dcx> $$10 = this.h($$2, $$4, $$1);
            ale<dcx> $$11 = this.a($$2, $$4, $$1, $$6);
            ale<dcx> $$12 = this.g($$2, $$4, $$1);
            ale<dcx> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, ddg.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddg.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, ddg.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddg.b.a(this.x, this.z), ddg.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddg.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddg.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddg.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, ddg.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddg.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<ddg.d, ale<dcx>>> $$0, ddg.b $$1) {
      this.a($$0, this.o, this.o, this.x, ddg.b.a(this.r[0], this.r[2]), $$1, 0.0F, dde.O);
      this.a($$0, ddg.b.a(this.p[1], this.p[2]), this.o, ddg.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dde.g);
      this.a($$0, ddg.b.a(this.p[3], this.p[4]), this.o, ddg.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dde.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddg.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddg.b $$5 = this.q[$$4];
            ale<dcx> $$6 = this.a($$2, $$4, $$1);
            ale<dcx> $$7 = this.b($$2, $$4, $$1);
            ale<dcx> $$8 = this.c($$2, $$4, $$1);
            ale<dcx> $$9 = this.h($$2, $$4, $$1);
            ale<dcx> $$10 = this.e($$2, $$4, $$1);
            ale<dcx> $$11 = this.a($$2, $$4);
            ale<dcx> $$12 = this.a($$2, $$4, $$1, $$6);
            ale<dcx> $$13 = this.d($$2, $$4, $$1);
            ale<dcx> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddg.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, ddg.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddg.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddg.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, ddg.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, ddg.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddg.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, ddg.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<ddg.d, ale<dcx>>> $$0, ddg.b $$1) {
      this.a($$0, this.o, this.o, this.x, ddg.b.a(this.r[0], this.r[2]), $$1, 0.0F, dde.O);
      this.a($$0, ddg.b.a(this.p[1], this.p[2]), this.o, ddg.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dde.g);
      this.a($$0, ddg.b.a(this.p[3], this.p[4]), this.o, ddg.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dde.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddg.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddg.b $$5 = this.q[$$4];
            ale<dcx> $$6 = this.a($$2, $$4, $$1);
            ale<dcx> $$7 = this.b($$2, $$4, $$1);
            ale<dcx> $$8 = this.c($$2, $$4, $$1);
            ale<dcx> $$9 = this.a($$2, $$4);
            ale<dcx> $$10 = this.a($$2, $$4, $$1, $$6);
            ale<dcx> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, ddg.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, ddg.b.a(this.A, this.B), ddg.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, ddg.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddg.b.a(this.A, this.B), ddg.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, ddg.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddg.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddg.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, ddg.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<ddg.d, ale<dcx>>> $$0, ddg.b $$1) {
      this.a($$0, this.s, this.o, this.x, ddg.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dde.O : dde.L);
      this.a($$0, this.t, this.o, this.x, ddg.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dde.O : dde.K);
      this.a($$0, this.s, this.o, this.z, ddg.b.a(this.r[0], this.r[1]), $$1, 0.0F, dde.L);
      this.a($$0, this.t, this.o, this.z, ddg.b.a(this.r[0], this.r[1]), $$1, 0.0F, dde.K);
      this.a($$0, this.s, this.o, ddg.b.a(this.x, this.B), ddg.b.a(this.r[2], this.r[5]), $$1, 0.0F, dde.L);
      this.a($$0, this.t, this.o, ddg.b.a(this.x, this.B), ddg.b.a(this.r[2], this.r[5]), $$1, 0.0F, dde.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dde.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dde.K);
      this.a($$0, ddg.b.a(this.p[1], this.p[2]), this.o, ddg.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dde.g);
      this.a($$0, ddg.b.a(this.p[3], this.p[4]), this.o, ddg.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dde.h);
      this.a($$0, this.s, this.o, ddg.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dde.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddg.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddg.b $$5 = this.q[$$4];
            ale<dcx> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddg.b.a(this.A, this.B), ddg.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<ddg.d, ale<dcx>>> $$0) {
      this.b($$0, this.o, this.o, ddg.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dde.Z);
      this.b($$0, this.o, ddg.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dde.aa);
      this.c($$0, this.o, this.o, this.o, ddg.b.a(this.r[0], this.r[1]), this.o, 0.0F, dde.ab);
   }

   private ale<dcx> a(int $$0, int $$1, ddg.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         ale<dcx> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private ale<dcx> b(int $$0, int $$1, ddg.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private ale<dcx> c(int $$0, int $$1, ddg.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private ale<dcx> a(int $$0, int $$1, ddg.b $$2, ale<dcx> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dde.w : $$3;
   }

   private ale<dcx> d(int $$0, int $$1, ddg.b $$2) {
      ale<dcx> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private ale<dcx> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dde.N;
      } else {
         return $$0 == 4 ? dde.f : dde.M;
      }
   }

   private ale<dcx> a(int $$0, ddg.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dde.A : dde.B;
      } else {
         return $$0 < 3 ? dde.A : dde.C;
      }
   }

   private ale<dcx> e(int $$0, int $$1, ddg.b $$2) {
      if ($$2.b() >= 0L) {
         ale<dcx> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private ale<dcx> f(int $$0, int $$1, ddg.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dde.I : dde.H;
      } else {
         return $$0 == 3 ? dde.J : this.a($$1, $$2);
      }
   }

   private ale<dcx> g(int $$0, int $$1, ddg.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dde.G : dde.F;
      }
   }

   private ale<dcx> h(int $$0, int $$1, ddg.b $$2) {
      ale<dcx> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<ddg.d, ale<dcx>>> $$0, ddg.b $$1, ddg.b $$2, ddg.b $$3, ddg.b $$4, ddg.b $$5, float $$6, ale<dcx> $$7) {
      $$0.accept(Pair.of(ddg.a($$1, $$2, $$3, $$4, ddg.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(ddg.a($$1, $$2, $$3, $$4, ddg.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<ddg.d, ale<dcx>>> $$0, ddg.b $$1, ddg.b $$2, ddg.b $$3, ddg.b $$4, ddg.b $$5, float $$6, ale<dcx> $$7) {
      $$0.accept(Pair.of(ddg.a($$1, $$2, $$3, $$4, ddg.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<ddg.d, ale<dcx>>> $$0, ddg.b $$1, ddg.b $$2, ddg.b $$3, ddg.b $$4, ddg.b $$5, float $$6, ale<dcx> $$7) {
      $$0.accept(Pair.of(ddg.a($$1, $$2, $$3, $$4, ddg.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dxn $$0, dxn $$1, dxn.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dyb.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dyb.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dyb.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dyb.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)ddg.a((float)$$0);
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

   private static String a(double $$0, ddg.b[] $$1) {
      double $$2 = (double)ddg.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bad
   public ddg.b[] b() {
      return this.p;
   }

   @bad
   public ddg.b[] c() {
      return this.q;
   }

   @bad
   public ddg.b[] d() {
      return this.r;
   }

   @bad
   public ddg.b[] e() {
      return new ddg.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @bad
   public ddg.b[] f() {
      return new ddg.b[]{
         ddg.b.a(-2.0F, dyb.a(0.05F)),
         ddg.b.a(dyb.a(0.05F), dyb.a(0.26666668F)),
         ddg.b.a(dyb.a(0.26666668F), dyb.a(0.4F)),
         ddg.b.a(dyb.a(0.4F), dyb.a(0.56666666F)),
         ddg.b.a(dyb.a(0.56666666F), 2.0F)
      };
   }

   @bad
   public ddg.b[] g() {
      return new ddg.b[]{ddg.b.a(-2.0F, 0.0F), ddg.b.a(0.0F, 2.0F)};
   }
}
