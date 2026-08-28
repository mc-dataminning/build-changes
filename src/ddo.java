import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class ddo {
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
   private final ddh.b o = ddh.b.a(-1.0F, 1.0F);
   private final ddh.b[] p = new ddh.b[]{ddh.b.a(-1.0F, -0.45F), ddh.b.a(-0.45F, -0.15F), ddh.b.a(-0.15F, 0.2F), ddh.b.a(0.2F, 0.55F), ddh.b.a(0.55F, 1.0F)};
   private final ddh.b[] q = new ddh.b[]{ddh.b.a(-1.0F, -0.35F), ddh.b.a(-0.35F, -0.1F), ddh.b.a(-0.1F, 0.1F), ddh.b.a(0.1F, 0.3F), ddh.b.a(0.3F, 1.0F)};
   private final ddh.b[] r = new ddh.b[]{
      ddh.b.a(-1.0F, -0.78F),
      ddh.b.a(-0.78F, -0.375F),
      ddh.b.a(-0.375F, -0.2225F),
      ddh.b.a(-0.2225F, 0.05F),
      ddh.b.a(0.05F, 0.45F),
      ddh.b.a(0.45F, 0.55F),
      ddh.b.a(0.55F, 1.0F)
   };
   private final ddh.b s = this.p[0];
   private final ddh.b t = ddh.b.a(this.p[1], this.p[4]);
   private final ddh.b u = ddh.b.a(-1.2F, -1.05F);
   private final ddh.b v = ddh.b.a(-1.05F, -0.455F);
   private final ddh.b w = ddh.b.a(-0.455F, -0.19F);
   private final ddh.b x = ddh.b.a(-0.19F, -0.11F);
   private final ddh.b y = ddh.b.a(-0.11F, 0.55F);
   private final ddh.b z = ddh.b.a(-0.11F, 0.03F);
   private final ddh.b A = ddh.b.a(0.03F, 0.3F);
   private final ddh.b B = ddh.b.a(0.3F, 1.0F);
   private final ale<dcy>[][] C = new ale[][]{{ddf.X, ddf.V, ddf.T, ddf.R, ddf.P}, {ddf.W, ddf.U, ddf.S, ddf.Q, ddf.P}};
   private final ale<dcy>[][] D = new ale[][]{
      {ddf.d, ddf.d, ddf.d, ddf.q, ddf.p},
      {ddf.b, ddf.b, ddf.i, ddf.p, ddf.o},
      {ddf.j, ddf.b, ddf.i, ddf.k, ddf.l},
      {ddf.r, ddf.r, ddf.i, ddf.x, ddf.x},
      {ddf.f, ddf.f, ddf.f, ddf.f, ddf.f}
   };
   private final ale<dcy>[][] E = new ale[][]{
      {ddf.e, null, ddf.q, null, null},
      {null, null, null, null, ddf.n},
      {ddf.c, null, null, ddf.m, null},
      {null, null, ddf.b, ddf.y, ddf.z},
      {null, null, null, null, null}
   };
   private final ale<dcy>[][] F = new ale[][]{
      {ddf.d, ddf.d, ddf.d, ddf.q, ddf.q},
      {ddf.D, ddf.D, ddf.i, ddf.p, ddf.o},
      {ddf.D, ddf.D, ddf.D, ddf.D, ddf.l},
      {ddf.s, ddf.s, ddf.i, ddf.i, ddf.x},
      {ddf.A, ddf.A, ddf.A, ddf.C, ddf.C}
   };
   private final ale<dcy>[][] G = new ale[][]{
      {ddf.e, null, null, null, null},
      {ddf.E, null, ddf.D, ddf.D, ddf.n},
      {ddf.E, ddf.E, ddf.i, ddf.k, null},
      {null, null, null, null, null},
      {ddf.B, ddf.B, null, null, null}
   };
   private final ale<dcy>[][] H = new ale[][]{
      {ddf.u, ddf.u, ddf.t, ddf.v, ddf.v},
      {ddf.u, ddf.u, ddf.t, ddf.v, ddf.v},
      {ddf.t, ddf.t, ddf.t, ddf.v, ddf.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<ddh.d> a() {
      ddh.b $$0 = ddh.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new ddh.d(this.o, this.o, ddh.b.a(this.y, this.o), this.o, $$0, ddh.b.a(-1.0F, -0.16F), 0L),
         new ddh.d(this.o, this.o, ddh.b.a(this.y, this.o), this.o, $$0, ddh.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<ddh.d, ale<dcy>>> $$0) {
      if (aa.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<ddh.d, ale<dcy>>> $$0) {
      jk.a $$1 = ph.a();
      jj<dxo> $$2 = $$1.b(lq.aD);
      dxp.w.a $$3 = new dxp.w.a($$2.b(dyc.d));
      dxp.w.a $$4 = new dxp.w.a($$2.b(dyc.e));
      dxp.w.a $$5 = new dxp.w.a($$2.b(dyc.g));
      $$0.accept(Pair.of(ddh.a(this.o, this.o, this.o, this.o, ddh.b.a(0.0F), this.o, 0.01F), ddf.b));
      if (rr.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, baa.a) instanceof aya.e<?, ?> $$7) {
         ale<dcy> $$8 = ddf.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(ddh.a(this.o, this.o, this.o, ddh.b.a($$9), ddh.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == ddf.f ? ddf.A : ddf.f;
         }
      }

      if (rr.a($$3, $$4, $$5, false) instanceof aya.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(ddh.a(this.o, this.o, ddh.b.a($$12), this.o, ddh.b.a(0.0F), this.o, 0.0F), ddf.q));
         }
      }
   }

   private void c(Consumer<Pair<ddh.d, ale<dcy>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, ddf.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         ddh.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<ddh.d, ale<dcy>>> $$0) {
      this.c($$0, ddh.b.a(-1.0F, -0.93333334F));
      this.b($$0, ddh.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, ddh.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, ddh.b.a(-0.56666666F, -0.4F));
      this.c($$0, ddh.b.a(-0.4F, -0.26666668F));
      this.d($$0, ddh.b.a(-0.26666668F, -0.05F));
      this.e($$0, ddh.b.a(-0.05F, 0.05F));
      this.d($$0, ddh.b.a(0.05F, 0.26666668F));
      this.c($$0, ddh.b.a(0.26666668F, 0.4F));
      this.b($$0, ddh.b.a(0.4F, 0.56666666F));
      this.a($$0, ddh.b.a(0.56666666F, 0.7666667F));
      this.b($$0, ddh.b.a(0.7666667F, 0.93333334F));
      this.c($$0, ddh.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<ddh.d, ale<dcy>>> $$0, ddh.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddh.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddh.b $$5 = this.q[$$4];
            ale<dcy> $$6 = this.a($$2, $$4, $$1);
            ale<dcy> $$7 = this.b($$2, $$4, $$1);
            ale<dcy> $$8 = this.c($$2, $$4, $$1);
            ale<dcy> $$9 = this.e($$2, $$4, $$1);
            ale<dcy> $$10 = this.h($$2, $$4, $$1);
            ale<dcy> $$11 = this.a($$2, $$4, $$1, $$10);
            ale<dcy> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddh.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddh.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, ddh.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddh.b.a(this.x, this.z), ddh.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddh.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddh.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddh.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, ddh.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddh.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<ddh.d, ale<dcy>>> $$0, ddh.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddh.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddh.b $$5 = this.q[$$4];
            ale<dcy> $$6 = this.a($$2, $$4, $$1);
            ale<dcy> $$7 = this.b($$2, $$4, $$1);
            ale<dcy> $$8 = this.c($$2, $$4, $$1);
            ale<dcy> $$9 = this.e($$2, $$4, $$1);
            ale<dcy> $$10 = this.h($$2, $$4, $$1);
            ale<dcy> $$11 = this.a($$2, $$4, $$1, $$6);
            ale<dcy> $$12 = this.g($$2, $$4, $$1);
            ale<dcy> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, ddh.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddh.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, ddh.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddh.b.a(this.x, this.z), ddh.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddh.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddh.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddh.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, ddh.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddh.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<ddh.d, ale<dcy>>> $$0, ddh.b $$1) {
      this.a($$0, this.o, this.o, this.x, ddh.b.a(this.r[0], this.r[2]), $$1, 0.0F, ddf.O);
      this.a($$0, ddh.b.a(this.p[1], this.p[2]), this.o, ddh.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddf.g);
      this.a($$0, ddh.b.a(this.p[3], this.p[4]), this.o, ddh.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddf.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddh.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddh.b $$5 = this.q[$$4];
            ale<dcy> $$6 = this.a($$2, $$4, $$1);
            ale<dcy> $$7 = this.b($$2, $$4, $$1);
            ale<dcy> $$8 = this.c($$2, $$4, $$1);
            ale<dcy> $$9 = this.h($$2, $$4, $$1);
            ale<dcy> $$10 = this.e($$2, $$4, $$1);
            ale<dcy> $$11 = this.a($$2, $$4);
            ale<dcy> $$12 = this.a($$2, $$4, $$1, $$6);
            ale<dcy> $$13 = this.d($$2, $$4, $$1);
            ale<dcy> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddh.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, ddh.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddh.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddh.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, ddh.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, ddh.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddh.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, ddh.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<ddh.d, ale<dcy>>> $$0, ddh.b $$1) {
      this.a($$0, this.o, this.o, this.x, ddh.b.a(this.r[0], this.r[2]), $$1, 0.0F, ddf.O);
      this.a($$0, ddh.b.a(this.p[1], this.p[2]), this.o, ddh.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddf.g);
      this.a($$0, ddh.b.a(this.p[3], this.p[4]), this.o, ddh.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddf.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddh.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddh.b $$5 = this.q[$$4];
            ale<dcy> $$6 = this.a($$2, $$4, $$1);
            ale<dcy> $$7 = this.b($$2, $$4, $$1);
            ale<dcy> $$8 = this.c($$2, $$4, $$1);
            ale<dcy> $$9 = this.a($$2, $$4);
            ale<dcy> $$10 = this.a($$2, $$4, $$1, $$6);
            ale<dcy> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, ddh.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, ddh.b.a(this.A, this.B), ddh.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, ddh.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddh.b.a(this.A, this.B), ddh.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, ddh.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddh.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddh.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, ddh.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<ddh.d, ale<dcy>>> $$0, ddh.b $$1) {
      this.a($$0, this.s, this.o, this.x, ddh.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? ddf.O : ddf.L);
      this.a($$0, this.t, this.o, this.x, ddh.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? ddf.O : ddf.K);
      this.a($$0, this.s, this.o, this.z, ddh.b.a(this.r[0], this.r[1]), $$1, 0.0F, ddf.L);
      this.a($$0, this.t, this.o, this.z, ddh.b.a(this.r[0], this.r[1]), $$1, 0.0F, ddf.K);
      this.a($$0, this.s, this.o, ddh.b.a(this.x, this.B), ddh.b.a(this.r[2], this.r[5]), $$1, 0.0F, ddf.L);
      this.a($$0, this.t, this.o, ddh.b.a(this.x, this.B), ddh.b.a(this.r[2], this.r[5]), $$1, 0.0F, ddf.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, ddf.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, ddf.K);
      this.a($$0, ddh.b.a(this.p[1], this.p[2]), this.o, ddh.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddf.g);
      this.a($$0, ddh.b.a(this.p[3], this.p[4]), this.o, ddh.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddf.h);
      this.a($$0, this.s, this.o, ddh.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddf.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddh.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddh.b $$5 = this.q[$$4];
            ale<dcy> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddh.b.a(this.A, this.B), ddh.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<ddh.d, ale<dcy>>> $$0) {
      this.b($$0, this.o, this.o, ddh.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, ddf.Z);
      this.b($$0, this.o, ddh.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, ddf.aa);
      this.c($$0, this.o, this.o, this.o, ddh.b.a(this.r[0], this.r[1]), this.o, 0.0F, ddf.ab);
   }

   private ale<dcy> a(int $$0, int $$1, ddh.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         ale<dcy> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private ale<dcy> b(int $$0, int $$1, ddh.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private ale<dcy> c(int $$0, int $$1, ddh.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private ale<dcy> a(int $$0, int $$1, ddh.b $$2, ale<dcy> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? ddf.w : $$3;
   }

   private ale<dcy> d(int $$0, int $$1, ddh.b $$2) {
      ale<dcy> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private ale<dcy> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return ddf.N;
      } else {
         return $$0 == 4 ? ddf.f : ddf.M;
      }
   }

   private ale<dcy> a(int $$0, ddh.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? ddf.A : ddf.B;
      } else {
         return $$0 < 3 ? ddf.A : ddf.C;
      }
   }

   private ale<dcy> e(int $$0, int $$1, ddh.b $$2) {
      if ($$2.b() >= 0L) {
         ale<dcy> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private ale<dcy> f(int $$0, int $$1, ddh.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? ddf.I : ddf.H;
      } else {
         return $$0 == 3 ? ddf.J : this.a($$1, $$2);
      }
   }

   private ale<dcy> g(int $$0, int $$1, ddh.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? ddf.G : ddf.F;
      }
   }

   private ale<dcy> h(int $$0, int $$1, ddh.b $$2) {
      ale<dcy> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<ddh.d, ale<dcy>>> $$0, ddh.b $$1, ddh.b $$2, ddh.b $$3, ddh.b $$4, ddh.b $$5, float $$6, ale<dcy> $$7) {
      $$0.accept(Pair.of(ddh.a($$1, $$2, $$3, $$4, ddh.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(ddh.a($$1, $$2, $$3, $$4, ddh.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<ddh.d, ale<dcy>>> $$0, ddh.b $$1, ddh.b $$2, ddh.b $$3, ddh.b $$4, ddh.b $$5, float $$6, ale<dcy> $$7) {
      $$0.accept(Pair.of(ddh.a($$1, $$2, $$3, $$4, ddh.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<ddh.d, ale<dcy>>> $$0, ddh.b $$1, ddh.b $$2, ddh.b $$3, ddh.b $$4, ddh.b $$5, float $$6, ale<dcy> $$7) {
      $$0.accept(Pair.of(ddh.a($$1, $$2, $$3, $$4, ddh.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dxo $$0, dxo $$1, dxo.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dyc.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dyc.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dyc.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dyc.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)ddh.a((float)$$0);
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

   private static String a(double $$0, ddh.b[] $$1) {
      double $$2 = (double)ddh.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bad
   public ddh.b[] b() {
      return this.p;
   }

   @bad
   public ddh.b[] c() {
      return this.q;
   }

   @bad
   public ddh.b[] d() {
      return this.r;
   }

   @bad
   public ddh.b[] e() {
      return new ddh.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @bad
   public ddh.b[] f() {
      return new ddh.b[]{
         ddh.b.a(-2.0F, dyc.a(0.05F)),
         ddh.b.a(dyc.a(0.05F), dyc.a(0.26666668F)),
         ddh.b.a(dyc.a(0.26666668F), dyc.a(0.4F)),
         ddh.b.a(dyc.a(0.4F), dyc.a(0.56666666F)),
         ddh.b.a(dyc.a(0.56666666F), 2.0F)
      };
   }

   @bad
   public ddh.b[] g() {
      return new ddh.b[]{ddh.b.a(-2.0F, 0.0F), ddh.b.a(0.0F, 2.0F)};
   }
}
