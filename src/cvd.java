import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class cvd {
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
   private final cuw.b o = cuw.b.a(-1.0F, 1.0F);
   private final cuw.b[] p = new cuw.b[]{cuw.b.a(-1.0F, -0.45F), cuw.b.a(-0.45F, -0.15F), cuw.b.a(-0.15F, 0.2F), cuw.b.a(0.2F, 0.55F), cuw.b.a(0.55F, 1.0F)};
   private final cuw.b[] q = new cuw.b[]{cuw.b.a(-1.0F, -0.35F), cuw.b.a(-0.35F, -0.1F), cuw.b.a(-0.1F, 0.1F), cuw.b.a(0.1F, 0.3F), cuw.b.a(0.3F, 1.0F)};
   private final cuw.b[] r = new cuw.b[]{
      cuw.b.a(-1.0F, -0.78F),
      cuw.b.a(-0.78F, -0.375F),
      cuw.b.a(-0.375F, -0.2225F),
      cuw.b.a(-0.2225F, 0.05F),
      cuw.b.a(0.05F, 0.45F),
      cuw.b.a(0.45F, 0.55F),
      cuw.b.a(0.55F, 1.0F)
   };
   private final cuw.b s = this.p[0];
   private final cuw.b t = cuw.b.a(this.p[1], this.p[4]);
   private final cuw.b u = cuw.b.a(-1.2F, -1.05F);
   private final cuw.b v = cuw.b.a(-1.05F, -0.455F);
   private final cuw.b w = cuw.b.a(-0.455F, -0.19F);
   private final cuw.b x = cuw.b.a(-0.19F, -0.11F);
   private final cuw.b y = cuw.b.a(-0.11F, 0.55F);
   private final cuw.b z = cuw.b.a(-0.11F, 0.03F);
   private final cuw.b A = cuw.b.a(0.03F, 0.3F);
   private final cuw.b B = cuw.b.a(0.3F, 1.0F);
   private final ahf<cun>[][] C = new ahf[][]{{cuu.X, cuu.V, cuu.T, cuu.R, cuu.P}, {cuu.W, cuu.U, cuu.S, cuu.Q, cuu.P}};
   private final ahf<cun>[][] D = new ahf[][]{
      {cuu.d, cuu.d, cuu.d, cuu.q, cuu.p},
      {cuu.b, cuu.b, cuu.i, cuu.p, cuu.o},
      {cuu.j, cuu.b, cuu.i, cuu.k, cuu.l},
      {cuu.r, cuu.r, cuu.i, cuu.x, cuu.x},
      {cuu.f, cuu.f, cuu.f, cuu.f, cuu.f}
   };
   private final ahf<cun>[][] E = new ahf[][]{
      {cuu.e, null, cuu.q, null, null},
      {null, null, null, null, cuu.n},
      {cuu.c, null, null, cuu.m, null},
      {null, null, cuu.b, cuu.y, cuu.z},
      {null, null, null, null, null}
   };
   private final ahf<cun>[][] F = new ahf[][]{
      {cuu.d, cuu.d, cuu.d, cuu.q, cuu.q},
      {cuu.D, cuu.D, cuu.i, cuu.p, cuu.o},
      {cuu.D, cuu.D, cuu.D, cuu.D, cuu.l},
      {cuu.s, cuu.s, cuu.i, cuu.i, cuu.x},
      {cuu.A, cuu.A, cuu.A, cuu.C, cuu.C}
   };
   private final ahf<cun>[][] G = new ahf[][]{
      {cuu.e, null, null, null, null},
      {cuu.E, null, cuu.D, cuu.D, cuu.n},
      {cuu.E, cuu.E, cuu.i, cuu.k, null},
      {null, null, null, null, null},
      {cuu.B, cuu.B, null, null, null}
   };
   private final ahf<cun>[][] H = new ahf[][]{
      {cuu.u, cuu.u, cuu.t, cuu.v, cuu.v},
      {cuu.u, cuu.u, cuu.t, cuu.v, cuu.v},
      {cuu.t, cuu.t, cuu.t, cuu.v, cuu.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<cuw.d> a() {
      cuw.b $$0 = cuw.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new cuw.d(this.o, this.o, cuw.b.a(this.y, this.o), this.o, $$0, cuw.b.a(-1.0F, -0.16F), 0L),
         new cuw.d(this.o, this.o, cuw.b.a(this.y, this.o), this.o, $$0, cuw.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<cuw.d, ahf<cun>>> $$0) {
      if (aa.at) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<cuw.d, ahf<cun>>> $$0) {
      ij.b $$1 = np.a();
      ii<doi> $$2 = $$1.b(ke.ax);
      doj.w.a $$3 = new doj.w.a($$2.b(dow.d));
      doj.w.a $$4 = new doj.w.a($$2.b(dow.e));
      doj.w.a $$5 = new doj.w.a($$2.b(dow.g));
      $$0.accept(Pair.of(cuw.a(this.o, this.o, this.o, this.o, cuw.b.a(0.0F), this.o, 0.01F), cuu.b));
      if (pt.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, avp.a) instanceof atp.e<?, ?> $$7) {
         ahf<cun> $$8 = cuu.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(cuw.a(this.o, this.o, this.o, cuw.b.a($$9), cuw.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == cuu.f ? cuu.A : cuu.f;
         }
      }

      if (pt.a($$3, $$4, $$5, false) instanceof atp.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(cuw.a(this.o, this.o, cuw.b.a($$12), this.o, cuw.b.a(0.0F), this.o, 0.0F), cuu.q));
         }
      }
   }

   private void c(Consumer<Pair<cuw.d, ahf<cun>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, cuu.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         cuw.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<cuw.d, ahf<cun>>> $$0) {
      this.c($$0, cuw.b.a(-1.0F, -0.93333334F));
      this.b($$0, cuw.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, cuw.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, cuw.b.a(-0.56666666F, -0.4F));
      this.c($$0, cuw.b.a(-0.4F, -0.26666668F));
      this.d($$0, cuw.b.a(-0.26666668F, -0.05F));
      this.e($$0, cuw.b.a(-0.05F, 0.05F));
      this.d($$0, cuw.b.a(0.05F, 0.26666668F));
      this.c($$0, cuw.b.a(0.26666668F, 0.4F));
      this.b($$0, cuw.b.a(0.4F, 0.56666666F));
      this.a($$0, cuw.b.a(0.56666666F, 0.7666667F));
      this.b($$0, cuw.b.a(0.7666667F, 0.93333334F));
      this.c($$0, cuw.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<cuw.d, ahf<cun>>> $$0, cuw.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cuw.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cuw.b $$5 = this.q[$$4];
            ahf<cun> $$6 = this.a($$2, $$4, $$1);
            ahf<cun> $$7 = this.b($$2, $$4, $$1);
            ahf<cun> $$8 = this.c($$2, $$4, $$1);
            ahf<cun> $$9 = this.e($$2, $$4, $$1);
            ahf<cun> $$10 = this.h($$2, $$4, $$1);
            ahf<cun> $$11 = this.a($$2, $$4, $$1, $$10);
            ahf<cun> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cuw.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cuw.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cuw.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cuw.b.a(this.x, this.z), cuw.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cuw.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cuw.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cuw.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cuw.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cuw.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<cuw.d, ahf<cun>>> $$0, cuw.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cuw.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cuw.b $$5 = this.q[$$4];
            ahf<cun> $$6 = this.a($$2, $$4, $$1);
            ahf<cun> $$7 = this.b($$2, $$4, $$1);
            ahf<cun> $$8 = this.c($$2, $$4, $$1);
            ahf<cun> $$9 = this.e($$2, $$4, $$1);
            ahf<cun> $$10 = this.h($$2, $$4, $$1);
            ahf<cun> $$11 = this.a($$2, $$4, $$1, $$6);
            ahf<cun> $$12 = this.g($$2, $$4, $$1);
            ahf<cun> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, cuw.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cuw.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cuw.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cuw.b.a(this.x, this.z), cuw.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cuw.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cuw.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cuw.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cuw.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cuw.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<cuw.d, ahf<cun>>> $$0, cuw.b $$1) {
      this.a($$0, this.o, this.o, this.x, cuw.b.a(this.r[0], this.r[2]), $$1, 0.0F, cuu.O);
      this.a($$0, cuw.b.a(this.p[1], this.p[2]), this.o, cuw.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cuu.g);
      this.a($$0, cuw.b.a(this.p[3], this.p[4]), this.o, cuw.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cuu.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cuw.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cuw.b $$5 = this.q[$$4];
            ahf<cun> $$6 = this.a($$2, $$4, $$1);
            ahf<cun> $$7 = this.b($$2, $$4, $$1);
            ahf<cun> $$8 = this.c($$2, $$4, $$1);
            ahf<cun> $$9 = this.h($$2, $$4, $$1);
            ahf<cun> $$10 = this.e($$2, $$4, $$1);
            ahf<cun> $$11 = this.a($$2, $$4);
            ahf<cun> $$12 = this.a($$2, $$4, $$1, $$6);
            ahf<cun> $$13 = this.d($$2, $$4, $$1);
            ahf<cun> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cuw.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, cuw.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cuw.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cuw.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, cuw.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, cuw.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cuw.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cuw.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<cuw.d, ahf<cun>>> $$0, cuw.b $$1) {
      this.a($$0, this.o, this.o, this.x, cuw.b.a(this.r[0], this.r[2]), $$1, 0.0F, cuu.O);
      this.a($$0, cuw.b.a(this.p[1], this.p[2]), this.o, cuw.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cuu.g);
      this.a($$0, cuw.b.a(this.p[3], this.p[4]), this.o, cuw.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cuu.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cuw.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cuw.b $$5 = this.q[$$4];
            ahf<cun> $$6 = this.a($$2, $$4, $$1);
            ahf<cun> $$7 = this.b($$2, $$4, $$1);
            ahf<cun> $$8 = this.c($$2, $$4, $$1);
            ahf<cun> $$9 = this.a($$2, $$4);
            ahf<cun> $$10 = this.a($$2, $$4, $$1, $$6);
            ahf<cun> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, cuw.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, cuw.b.a(this.A, this.B), cuw.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, cuw.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cuw.b.a(this.A, this.B), cuw.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, cuw.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cuw.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cuw.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cuw.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<cuw.d, ahf<cun>>> $$0, cuw.b $$1) {
      this.a($$0, this.s, this.o, this.x, cuw.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cuu.O : cuu.L);
      this.a($$0, this.t, this.o, this.x, cuw.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cuu.O : cuu.K);
      this.a($$0, this.s, this.o, this.z, cuw.b.a(this.r[0], this.r[1]), $$1, 0.0F, cuu.L);
      this.a($$0, this.t, this.o, this.z, cuw.b.a(this.r[0], this.r[1]), $$1, 0.0F, cuu.K);
      this.a($$0, this.s, this.o, cuw.b.a(this.x, this.B), cuw.b.a(this.r[2], this.r[5]), $$1, 0.0F, cuu.L);
      this.a($$0, this.t, this.o, cuw.b.a(this.x, this.B), cuw.b.a(this.r[2], this.r[5]), $$1, 0.0F, cuu.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, cuu.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, cuu.K);
      this.a($$0, cuw.b.a(this.p[1], this.p[2]), this.o, cuw.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cuu.g);
      this.a($$0, cuw.b.a(this.p[3], this.p[4]), this.o, cuw.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cuu.h);
      this.a($$0, this.s, this.o, cuw.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cuu.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cuw.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cuw.b $$5 = this.q[$$4];
            ahf<cun> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cuw.b.a(this.A, this.B), cuw.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<cuw.d, ahf<cun>>> $$0) {
      this.b($$0, this.o, this.o, cuw.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, cuu.Z);
      this.b($$0, this.o, cuw.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, cuu.aa);
      this.c($$0, this.o, this.o, this.o, cuw.b.a(this.r[0], this.r[1]), this.o, 0.0F, cuu.ab);
   }

   private ahf<cun> a(int $$0, int $$1, cuw.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         ahf<cun> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private ahf<cun> b(int $$0, int $$1, cuw.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private ahf<cun> c(int $$0, int $$1, cuw.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private ahf<cun> a(int $$0, int $$1, cuw.b $$2, ahf<cun> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? cuu.w : $$3;
   }

   private ahf<cun> d(int $$0, int $$1, cuw.b $$2) {
      ahf<cun> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private ahf<cun> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return cuu.N;
      } else {
         return $$0 == 4 ? cuu.f : cuu.M;
      }
   }

   private ahf<cun> a(int $$0, cuw.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? cuu.A : cuu.B;
      } else {
         return $$0 < 3 ? cuu.A : cuu.C;
      }
   }

   private ahf<cun> e(int $$0, int $$1, cuw.b $$2) {
      if ($$2.b() >= 0L) {
         ahf<cun> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private ahf<cun> f(int $$0, int $$1, cuw.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? cuu.I : cuu.H;
      } else {
         return $$0 == 3 ? cuu.J : this.a($$1, $$2);
      }
   }

   private ahf<cun> g(int $$0, int $$1, cuw.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? cuu.G : cuu.F;
      }
   }

   private ahf<cun> h(int $$0, int $$1, cuw.b $$2) {
      ahf<cun> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<cuw.d, ahf<cun>>> $$0, cuw.b $$1, cuw.b $$2, cuw.b $$3, cuw.b $$4, cuw.b $$5, float $$6, ahf<cun> $$7) {
      $$0.accept(Pair.of(cuw.a($$1, $$2, $$3, $$4, cuw.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(cuw.a($$1, $$2, $$3, $$4, cuw.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<cuw.d, ahf<cun>>> $$0, cuw.b $$1, cuw.b $$2, cuw.b $$3, cuw.b $$4, cuw.b $$5, float $$6, ahf<cun> $$7) {
      $$0.accept(Pair.of(cuw.a($$1, $$2, $$3, $$4, cuw.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<cuw.d, ahf<cun>>> $$0, cuw.b $$1, cuw.b $$2, cuw.b $$3, cuw.b $$4, cuw.b $$5, float $$6, ahf<cun> $$7) {
      $$0.accept(Pair.of(cuw.a($$1, $$2, $$3, $$4, cuw.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(doi $$0, doi $$1, doi.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dow.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dow.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dow.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dow.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)cuw.a((float)$$0);
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

   private static String a(double $$0, cuw.b[] $$1) {
      double $$2 = (double)cuw.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @avs
   public cuw.b[] b() {
      return this.p;
   }

   @avs
   public cuw.b[] c() {
      return this.q;
   }

   @avs
   public cuw.b[] d() {
      return this.r;
   }

   @avs
   public cuw.b[] e() {
      return new cuw.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @avs
   public cuw.b[] f() {
      return new cuw.b[]{
         cuw.b.a(-2.0F, dow.a(0.05F)),
         cuw.b.a(dow.a(0.05F), dow.a(0.26666668F)),
         cuw.b.a(dow.a(0.26666668F), dow.a(0.4F)),
         cuw.b.a(dow.a(0.4F), dow.a(0.56666666F)),
         cuw.b.a(dow.a(0.56666666F), 2.0F)
      };
   }

   @avs
   public cuw.b[] g() {
      return new cuw.b[]{cuw.b.a(-2.0F, 0.0F), cuw.b.a(0.0F, 2.0F)};
   }
}
