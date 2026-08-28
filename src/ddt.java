import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class ddt {
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
   private final ddm.b o = ddm.b.a(-1.0F, 1.0F);
   private final ddm.b[] p = new ddm.b[]{ddm.b.a(-1.0F, -0.45F), ddm.b.a(-0.45F, -0.15F), ddm.b.a(-0.15F, 0.2F), ddm.b.a(0.2F, 0.55F), ddm.b.a(0.55F, 1.0F)};
   private final ddm.b[] q = new ddm.b[]{ddm.b.a(-1.0F, -0.35F), ddm.b.a(-0.35F, -0.1F), ddm.b.a(-0.1F, 0.1F), ddm.b.a(0.1F, 0.3F), ddm.b.a(0.3F, 1.0F)};
   private final ddm.b[] r = new ddm.b[]{
      ddm.b.a(-1.0F, -0.78F),
      ddm.b.a(-0.78F, -0.375F),
      ddm.b.a(-0.375F, -0.2225F),
      ddm.b.a(-0.2225F, 0.05F),
      ddm.b.a(0.05F, 0.45F),
      ddm.b.a(0.45F, 0.55F),
      ddm.b.a(0.55F, 1.0F)
   };
   private final ddm.b s = this.p[0];
   private final ddm.b t = ddm.b.a(this.p[1], this.p[4]);
   private final ddm.b u = ddm.b.a(-1.2F, -1.05F);
   private final ddm.b v = ddm.b.a(-1.05F, -0.455F);
   private final ddm.b w = ddm.b.a(-0.455F, -0.19F);
   private final ddm.b x = ddm.b.a(-0.19F, -0.11F);
   private final ddm.b y = ddm.b.a(-0.11F, 0.55F);
   private final ddm.b z = ddm.b.a(-0.11F, 0.03F);
   private final ddm.b A = ddm.b.a(0.03F, 0.3F);
   private final ddm.b B = ddm.b.a(0.3F, 1.0F);
   private final akj<ddd>[][] C = new akj[][]{{ddk.X, ddk.V, ddk.T, ddk.R, ddk.P}, {ddk.W, ddk.U, ddk.S, ddk.Q, ddk.P}};
   private final akj<ddd>[][] D = new akj[][]{
      {ddk.d, ddk.d, ddk.d, ddk.q, ddk.p},
      {ddk.b, ddk.b, ddk.i, ddk.p, ddk.o},
      {ddk.j, ddk.b, ddk.i, ddk.k, ddk.l},
      {ddk.r, ddk.r, ddk.i, ddk.x, ddk.x},
      {ddk.f, ddk.f, ddk.f, ddk.f, ddk.f}
   };
   private final akj<ddd>[][] E = new akj[][]{
      {ddk.e, null, ddk.q, null, null},
      {null, null, null, null, ddk.n},
      {ddk.c, null, null, ddk.m, null},
      {null, null, ddk.b, ddk.y, ddk.z},
      {null, null, null, null, null}
   };
   private final akj<ddd>[][] F = new akj[][]{
      {ddk.d, ddk.d, ddk.d, ddk.q, ddk.q},
      {ddk.D, ddk.D, ddk.i, ddk.p, ddk.o},
      {ddk.D, ddk.D, ddk.D, ddk.D, ddk.l},
      {ddk.s, ddk.s, ddk.i, ddk.i, ddk.x},
      {ddk.A, ddk.A, ddk.A, ddk.C, ddk.C}
   };
   private final akj<ddd>[][] G = new akj[][]{
      {ddk.e, null, null, null, null},
      {ddk.E, null, ddk.D, ddk.D, ddk.n},
      {ddk.E, ddk.E, ddk.i, ddk.k, null},
      {null, null, null, null, null},
      {ddk.B, ddk.B, null, null, null}
   };
   private final akj<ddd>[][] H = new akj[][]{
      {ddk.u, ddk.u, ddk.t, ddk.v, ddk.v},
      {ddk.u, ddk.u, ddk.t, ddk.v, ddk.v},
      {ddk.t, ddk.t, ddk.t, ddk.v, ddk.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<ddm.d> a() {
      ddm.b $$0 = ddm.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new ddm.d(this.o, this.o, ddm.b.a(this.y, this.o), this.o, $$0, ddm.b.a(-1.0F, -0.16F), 0L),
         new ddm.d(this.o, this.o, ddm.b.a(this.y, this.o), this.o, $$0, ddm.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<ddm.d, akj<ddd>>> $$0) {
      if (aa.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<ddm.d, akj<ddd>>> $$0) {
      jl.a $$1 = oz.a();
      jk<dxs> $$2 = $$1.b(lr.aI);
      dxt.w.a $$3 = new dxt.w.a($$2.b(dyg.d));
      dxt.w.a $$4 = new dxt.w.a($$2.b(dyg.e));
      dxt.w.a $$5 = new dxt.w.a($$2.b(dyg.g));
      $$0.accept(Pair.of(ddm.a(this.o, this.o, this.o, this.o, ddm.b.a(0.0F), this.o, 0.01F), ddk.b));
      if (rb.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, azf.a) instanceof axf.e<?, ?> $$7) {
         akj<ddd> $$8 = ddk.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(ddm.a(this.o, this.o, this.o, ddm.b.a($$9), ddm.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == ddk.f ? ddk.A : ddk.f;
         }
      }

      if (rb.a($$3, $$4, $$5, false) instanceof axf.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(ddm.a(this.o, this.o, ddm.b.a($$12), this.o, ddm.b.a(0.0F), this.o, 0.0F), ddk.q));
         }
      }
   }

   private void c(Consumer<Pair<ddm.d, akj<ddd>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, ddk.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         ddm.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<ddm.d, akj<ddd>>> $$0) {
      this.c($$0, ddm.b.a(-1.0F, -0.93333334F));
      this.b($$0, ddm.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, ddm.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, ddm.b.a(-0.56666666F, -0.4F));
      this.c($$0, ddm.b.a(-0.4F, -0.26666668F));
      this.d($$0, ddm.b.a(-0.26666668F, -0.05F));
      this.e($$0, ddm.b.a(-0.05F, 0.05F));
      this.d($$0, ddm.b.a(0.05F, 0.26666668F));
      this.c($$0, ddm.b.a(0.26666668F, 0.4F));
      this.b($$0, ddm.b.a(0.4F, 0.56666666F));
      this.a($$0, ddm.b.a(0.56666666F, 0.7666667F));
      this.b($$0, ddm.b.a(0.7666667F, 0.93333334F));
      this.c($$0, ddm.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<ddm.d, akj<ddd>>> $$0, ddm.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddm.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddm.b $$5 = this.q[$$4];
            akj<ddd> $$6 = this.a($$2, $$4, $$1);
            akj<ddd> $$7 = this.b($$2, $$4, $$1);
            akj<ddd> $$8 = this.c($$2, $$4, $$1);
            akj<ddd> $$9 = this.e($$2, $$4, $$1);
            akj<ddd> $$10 = this.h($$2, $$4, $$1);
            akj<ddd> $$11 = this.a($$2, $$4, $$1, $$10);
            akj<ddd> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddm.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddm.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, ddm.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddm.b.a(this.x, this.z), ddm.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddm.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddm.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddm.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, ddm.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddm.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<ddm.d, akj<ddd>>> $$0, ddm.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddm.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddm.b $$5 = this.q[$$4];
            akj<ddd> $$6 = this.a($$2, $$4, $$1);
            akj<ddd> $$7 = this.b($$2, $$4, $$1);
            akj<ddd> $$8 = this.c($$2, $$4, $$1);
            akj<ddd> $$9 = this.e($$2, $$4, $$1);
            akj<ddd> $$10 = this.h($$2, $$4, $$1);
            akj<ddd> $$11 = this.a($$2, $$4, $$1, $$6);
            akj<ddd> $$12 = this.g($$2, $$4, $$1);
            akj<ddd> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, ddm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddm.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, ddm.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddm.b.a(this.x, this.z), ddm.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddm.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddm.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddm.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, ddm.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddm.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<ddm.d, akj<ddd>>> $$0, ddm.b $$1) {
      this.a($$0, this.o, this.o, this.x, ddm.b.a(this.r[0], this.r[2]), $$1, 0.0F, ddk.O);
      this.a($$0, ddm.b.a(this.p[1], this.p[2]), this.o, ddm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddk.g);
      this.a($$0, ddm.b.a(this.p[3], this.p[4]), this.o, ddm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddk.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddm.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddm.b $$5 = this.q[$$4];
            akj<ddd> $$6 = this.a($$2, $$4, $$1);
            akj<ddd> $$7 = this.b($$2, $$4, $$1);
            akj<ddd> $$8 = this.c($$2, $$4, $$1);
            akj<ddd> $$9 = this.h($$2, $$4, $$1);
            akj<ddd> $$10 = this.e($$2, $$4, $$1);
            akj<ddd> $$11 = this.a($$2, $$4);
            akj<ddd> $$12 = this.a($$2, $$4, $$1, $$6);
            akj<ddd> $$13 = this.d($$2, $$4, $$1);
            akj<ddd> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddm.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, ddm.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddm.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddm.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, ddm.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, ddm.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddm.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, ddm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<ddm.d, akj<ddd>>> $$0, ddm.b $$1) {
      this.a($$0, this.o, this.o, this.x, ddm.b.a(this.r[0], this.r[2]), $$1, 0.0F, ddk.O);
      this.a($$0, ddm.b.a(this.p[1], this.p[2]), this.o, ddm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddk.g);
      this.a($$0, ddm.b.a(this.p[3], this.p[4]), this.o, ddm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddk.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddm.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddm.b $$5 = this.q[$$4];
            akj<ddd> $$6 = this.a($$2, $$4, $$1);
            akj<ddd> $$7 = this.b($$2, $$4, $$1);
            akj<ddd> $$8 = this.c($$2, $$4, $$1);
            akj<ddd> $$9 = this.a($$2, $$4);
            akj<ddd> $$10 = this.a($$2, $$4, $$1, $$6);
            akj<ddd> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, ddm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, ddm.b.a(this.A, this.B), ddm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, ddm.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddm.b.a(this.A, this.B), ddm.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, ddm.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddm.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddm.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, ddm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<ddm.d, akj<ddd>>> $$0, ddm.b $$1) {
      this.a($$0, this.s, this.o, this.x, ddm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? ddk.O : ddk.L);
      this.a($$0, this.t, this.o, this.x, ddm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? ddk.O : ddk.K);
      this.a($$0, this.s, this.o, this.z, ddm.b.a(this.r[0], this.r[1]), $$1, 0.0F, ddk.L);
      this.a($$0, this.t, this.o, this.z, ddm.b.a(this.r[0], this.r[1]), $$1, 0.0F, ddk.K);
      this.a($$0, this.s, this.o, ddm.b.a(this.x, this.B), ddm.b.a(this.r[2], this.r[5]), $$1, 0.0F, ddk.L);
      this.a($$0, this.t, this.o, ddm.b.a(this.x, this.B), ddm.b.a(this.r[2], this.r[5]), $$1, 0.0F, ddk.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, ddk.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, ddk.K);
      this.a($$0, ddm.b.a(this.p[1], this.p[2]), this.o, ddm.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddk.g);
      this.a($$0, ddm.b.a(this.p[3], this.p[4]), this.o, ddm.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddk.h);
      this.a($$0, this.s, this.o, ddm.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddk.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddm.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddm.b $$5 = this.q[$$4];
            akj<ddd> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddm.b.a(this.A, this.B), ddm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<ddm.d, akj<ddd>>> $$0) {
      this.b($$0, this.o, this.o, ddm.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, ddk.Z);
      this.b($$0, this.o, ddm.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, ddk.aa);
      this.c($$0, this.o, this.o, this.o, ddm.b.a(this.r[0], this.r[1]), this.o, 0.0F, ddk.ab);
   }

   private akj<ddd> a(int $$0, int $$1, ddm.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         akj<ddd> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private akj<ddd> b(int $$0, int $$1, ddm.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private akj<ddd> c(int $$0, int $$1, ddm.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private akj<ddd> a(int $$0, int $$1, ddm.b $$2, akj<ddd> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? ddk.w : $$3;
   }

   private akj<ddd> d(int $$0, int $$1, ddm.b $$2) {
      akj<ddd> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private akj<ddd> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return ddk.N;
      } else {
         return $$0 == 4 ? ddk.f : ddk.M;
      }
   }

   private akj<ddd> a(int $$0, ddm.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? ddk.A : ddk.B;
      } else {
         return $$0 < 3 ? ddk.A : ddk.C;
      }
   }

   private akj<ddd> e(int $$0, int $$1, ddm.b $$2) {
      if ($$2.b() >= 0L) {
         akj<ddd> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private akj<ddd> f(int $$0, int $$1, ddm.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? ddk.I : ddk.H;
      } else {
         return $$0 == 3 ? ddk.J : this.a($$1, $$2);
      }
   }

   private akj<ddd> g(int $$0, int $$1, ddm.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? ddk.G : ddk.F;
      }
   }

   private akj<ddd> h(int $$0, int $$1, ddm.b $$2) {
      akj<ddd> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<ddm.d, akj<ddd>>> $$0, ddm.b $$1, ddm.b $$2, ddm.b $$3, ddm.b $$4, ddm.b $$5, float $$6, akj<ddd> $$7) {
      $$0.accept(Pair.of(ddm.a($$1, $$2, $$3, $$4, ddm.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(ddm.a($$1, $$2, $$3, $$4, ddm.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<ddm.d, akj<ddd>>> $$0, ddm.b $$1, ddm.b $$2, ddm.b $$3, ddm.b $$4, ddm.b $$5, float $$6, akj<ddd> $$7) {
      $$0.accept(Pair.of(ddm.a($$1, $$2, $$3, $$4, ddm.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<ddm.d, akj<ddd>>> $$0, ddm.b $$1, ddm.b $$2, ddm.b $$3, ddm.b $$4, ddm.b $$5, float $$6, akj<ddd> $$7) {
      $$0.accept(Pair.of(ddm.a($$1, $$2, $$3, $$4, ddm.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dxs $$0, dxs $$1, dxs.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dyg.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dyg.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dyg.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dyg.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)ddm.a((float)$$0);
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

   private static String a(double $$0, ddm.b[] $$1) {
      double $$2 = (double)ddm.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @azi
   public ddm.b[] b() {
      return this.p;
   }

   @azi
   public ddm.b[] c() {
      return this.q;
   }

   @azi
   public ddm.b[] d() {
      return this.r;
   }

   @azi
   public ddm.b[] e() {
      return new ddm.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @azi
   public ddm.b[] f() {
      return new ddm.b[]{
         ddm.b.a(-2.0F, dyg.a(0.05F)),
         ddm.b.a(dyg.a(0.05F), dyg.a(0.26666668F)),
         ddm.b.a(dyg.a(0.26666668F), dyg.a(0.4F)),
         ddm.b.a(dyg.a(0.4F), dyg.a(0.56666666F)),
         ddm.b.a(dyg.a(0.56666666F), 2.0F)
      };
   }

   @azi
   public ddm.b[] g() {
      return new ddm.b[]{ddm.b.a(-2.0F, 0.0F), ddm.b.a(0.0F, 2.0F)};
   }
}
