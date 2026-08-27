import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class cve {
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
   private final cux.b o = cux.b.a(-1.0F, 1.0F);
   private final cux.b[] p = new cux.b[]{cux.b.a(-1.0F, -0.45F), cux.b.a(-0.45F, -0.15F), cux.b.a(-0.15F, 0.2F), cux.b.a(0.2F, 0.55F), cux.b.a(0.55F, 1.0F)};
   private final cux.b[] q = new cux.b[]{cux.b.a(-1.0F, -0.35F), cux.b.a(-0.35F, -0.1F), cux.b.a(-0.1F, 0.1F), cux.b.a(0.1F, 0.3F), cux.b.a(0.3F, 1.0F)};
   private final cux.b[] r = new cux.b[]{
      cux.b.a(-1.0F, -0.78F),
      cux.b.a(-0.78F, -0.375F),
      cux.b.a(-0.375F, -0.2225F),
      cux.b.a(-0.2225F, 0.05F),
      cux.b.a(0.05F, 0.45F),
      cux.b.a(0.45F, 0.55F),
      cux.b.a(0.55F, 1.0F)
   };
   private final cux.b s = this.p[0];
   private final cux.b t = cux.b.a(this.p[1], this.p[4]);
   private final cux.b u = cux.b.a(-1.2F, -1.05F);
   private final cux.b v = cux.b.a(-1.05F, -0.455F);
   private final cux.b w = cux.b.a(-0.455F, -0.19F);
   private final cux.b x = cux.b.a(-0.19F, -0.11F);
   private final cux.b y = cux.b.a(-0.11F, 0.55F);
   private final cux.b z = cux.b.a(-0.11F, 0.03F);
   private final cux.b A = cux.b.a(0.03F, 0.3F);
   private final cux.b B = cux.b.a(0.3F, 1.0F);
   private final ahf<cuo>[][] C = new ahf[][]{{cuv.X, cuv.V, cuv.T, cuv.R, cuv.P}, {cuv.W, cuv.U, cuv.S, cuv.Q, cuv.P}};
   private final ahf<cuo>[][] D = new ahf[][]{
      {cuv.d, cuv.d, cuv.d, cuv.q, cuv.p},
      {cuv.b, cuv.b, cuv.i, cuv.p, cuv.o},
      {cuv.j, cuv.b, cuv.i, cuv.k, cuv.l},
      {cuv.r, cuv.r, cuv.i, cuv.x, cuv.x},
      {cuv.f, cuv.f, cuv.f, cuv.f, cuv.f}
   };
   private final ahf<cuo>[][] E = new ahf[][]{
      {cuv.e, null, cuv.q, null, null},
      {null, null, null, null, cuv.n},
      {cuv.c, null, null, cuv.m, null},
      {null, null, cuv.b, cuv.y, cuv.z},
      {null, null, null, null, null}
   };
   private final ahf<cuo>[][] F = new ahf[][]{
      {cuv.d, cuv.d, cuv.d, cuv.q, cuv.q},
      {cuv.D, cuv.D, cuv.i, cuv.p, cuv.o},
      {cuv.D, cuv.D, cuv.D, cuv.D, cuv.l},
      {cuv.s, cuv.s, cuv.i, cuv.i, cuv.x},
      {cuv.A, cuv.A, cuv.A, cuv.C, cuv.C}
   };
   private final ahf<cuo>[][] G = new ahf[][]{
      {cuv.e, null, null, null, null},
      {cuv.E, null, cuv.D, cuv.D, cuv.n},
      {cuv.E, cuv.E, cuv.i, cuv.k, null},
      {null, null, null, null, null},
      {cuv.B, cuv.B, null, null, null}
   };
   private final ahf<cuo>[][] H = new ahf[][]{
      {cuv.u, cuv.u, cuv.t, cuv.v, cuv.v},
      {cuv.u, cuv.u, cuv.t, cuv.v, cuv.v},
      {cuv.t, cuv.t, cuv.t, cuv.v, cuv.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<cux.d> a() {
      cux.b $$0 = cux.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new cux.d(this.o, this.o, cux.b.a(this.y, this.o), this.o, $$0, cux.b.a(-1.0F, -0.16F), 0L),
         new cux.d(this.o, this.o, cux.b.a(this.y, this.o), this.o, $$0, cux.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<cux.d, ahf<cuo>>> $$0) {
      if (aa.at) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<cux.d, ahf<cuo>>> $$0) {
      ij.b $$1 = np.a();
      ii<doj> $$2 = $$1.b(ke.ax);
      dok.w.a $$3 = new dok.w.a($$2.b(dox.d));
      dok.w.a $$4 = new dok.w.a($$2.b(dox.e));
      dok.w.a $$5 = new dok.w.a($$2.b(dox.g));
      $$0.accept(Pair.of(cux.a(this.o, this.o, this.o, this.o, cux.b.a(0.0F), this.o, 0.01F), cuv.b));
      if (pt.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, avq.a) instanceof atq.e<?, ?> $$7) {
         ahf<cuo> $$8 = cuv.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(cux.a(this.o, this.o, this.o, cux.b.a($$9), cux.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == cuv.f ? cuv.A : cuv.f;
         }
      }

      if (pt.a($$3, $$4, $$5, false) instanceof atq.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(cux.a(this.o, this.o, cux.b.a($$12), this.o, cux.b.a(0.0F), this.o, 0.0F), cuv.q));
         }
      }
   }

   private void c(Consumer<Pair<cux.d, ahf<cuo>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, cuv.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         cux.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<cux.d, ahf<cuo>>> $$0) {
      this.c($$0, cux.b.a(-1.0F, -0.93333334F));
      this.b($$0, cux.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, cux.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, cux.b.a(-0.56666666F, -0.4F));
      this.c($$0, cux.b.a(-0.4F, -0.26666668F));
      this.d($$0, cux.b.a(-0.26666668F, -0.05F));
      this.e($$0, cux.b.a(-0.05F, 0.05F));
      this.d($$0, cux.b.a(0.05F, 0.26666668F));
      this.c($$0, cux.b.a(0.26666668F, 0.4F));
      this.b($$0, cux.b.a(0.4F, 0.56666666F));
      this.a($$0, cux.b.a(0.56666666F, 0.7666667F));
      this.b($$0, cux.b.a(0.7666667F, 0.93333334F));
      this.c($$0, cux.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<cux.d, ahf<cuo>>> $$0, cux.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cux.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cux.b $$5 = this.q[$$4];
            ahf<cuo> $$6 = this.a($$2, $$4, $$1);
            ahf<cuo> $$7 = this.b($$2, $$4, $$1);
            ahf<cuo> $$8 = this.c($$2, $$4, $$1);
            ahf<cuo> $$9 = this.e($$2, $$4, $$1);
            ahf<cuo> $$10 = this.h($$2, $$4, $$1);
            ahf<cuo> $$11 = this.a($$2, $$4, $$1, $$10);
            ahf<cuo> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cux.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cux.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cux.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cux.b.a(this.x, this.z), cux.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cux.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cux.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cux.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cux.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cux.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<cux.d, ahf<cuo>>> $$0, cux.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cux.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cux.b $$5 = this.q[$$4];
            ahf<cuo> $$6 = this.a($$2, $$4, $$1);
            ahf<cuo> $$7 = this.b($$2, $$4, $$1);
            ahf<cuo> $$8 = this.c($$2, $$4, $$1);
            ahf<cuo> $$9 = this.e($$2, $$4, $$1);
            ahf<cuo> $$10 = this.h($$2, $$4, $$1);
            ahf<cuo> $$11 = this.a($$2, $$4, $$1, $$6);
            ahf<cuo> $$12 = this.g($$2, $$4, $$1);
            ahf<cuo> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, cux.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cux.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cux.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cux.b.a(this.x, this.z), cux.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cux.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cux.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cux.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cux.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cux.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<cux.d, ahf<cuo>>> $$0, cux.b $$1) {
      this.a($$0, this.o, this.o, this.x, cux.b.a(this.r[0], this.r[2]), $$1, 0.0F, cuv.O);
      this.a($$0, cux.b.a(this.p[1], this.p[2]), this.o, cux.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cuv.g);
      this.a($$0, cux.b.a(this.p[3], this.p[4]), this.o, cux.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cuv.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cux.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cux.b $$5 = this.q[$$4];
            ahf<cuo> $$6 = this.a($$2, $$4, $$1);
            ahf<cuo> $$7 = this.b($$2, $$4, $$1);
            ahf<cuo> $$8 = this.c($$2, $$4, $$1);
            ahf<cuo> $$9 = this.h($$2, $$4, $$1);
            ahf<cuo> $$10 = this.e($$2, $$4, $$1);
            ahf<cuo> $$11 = this.a($$2, $$4);
            ahf<cuo> $$12 = this.a($$2, $$4, $$1, $$6);
            ahf<cuo> $$13 = this.d($$2, $$4, $$1);
            ahf<cuo> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cux.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, cux.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cux.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cux.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, cux.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, cux.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cux.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cux.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<cux.d, ahf<cuo>>> $$0, cux.b $$1) {
      this.a($$0, this.o, this.o, this.x, cux.b.a(this.r[0], this.r[2]), $$1, 0.0F, cuv.O);
      this.a($$0, cux.b.a(this.p[1], this.p[2]), this.o, cux.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cuv.g);
      this.a($$0, cux.b.a(this.p[3], this.p[4]), this.o, cux.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cuv.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cux.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cux.b $$5 = this.q[$$4];
            ahf<cuo> $$6 = this.a($$2, $$4, $$1);
            ahf<cuo> $$7 = this.b($$2, $$4, $$1);
            ahf<cuo> $$8 = this.c($$2, $$4, $$1);
            ahf<cuo> $$9 = this.a($$2, $$4);
            ahf<cuo> $$10 = this.a($$2, $$4, $$1, $$6);
            ahf<cuo> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, cux.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, cux.b.a(this.A, this.B), cux.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, cux.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cux.b.a(this.A, this.B), cux.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, cux.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cux.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cux.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cux.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<cux.d, ahf<cuo>>> $$0, cux.b $$1) {
      this.a($$0, this.s, this.o, this.x, cux.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cuv.O : cuv.L);
      this.a($$0, this.t, this.o, this.x, cux.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cuv.O : cuv.K);
      this.a($$0, this.s, this.o, this.z, cux.b.a(this.r[0], this.r[1]), $$1, 0.0F, cuv.L);
      this.a($$0, this.t, this.o, this.z, cux.b.a(this.r[0], this.r[1]), $$1, 0.0F, cuv.K);
      this.a($$0, this.s, this.o, cux.b.a(this.x, this.B), cux.b.a(this.r[2], this.r[5]), $$1, 0.0F, cuv.L);
      this.a($$0, this.t, this.o, cux.b.a(this.x, this.B), cux.b.a(this.r[2], this.r[5]), $$1, 0.0F, cuv.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, cuv.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, cuv.K);
      this.a($$0, cux.b.a(this.p[1], this.p[2]), this.o, cux.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cuv.g);
      this.a($$0, cux.b.a(this.p[3], this.p[4]), this.o, cux.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cuv.h);
      this.a($$0, this.s, this.o, cux.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cuv.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cux.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cux.b $$5 = this.q[$$4];
            ahf<cuo> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cux.b.a(this.A, this.B), cux.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<cux.d, ahf<cuo>>> $$0) {
      this.b($$0, this.o, this.o, cux.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, cuv.Z);
      this.b($$0, this.o, cux.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, cuv.aa);
      this.c($$0, this.o, this.o, this.o, cux.b.a(this.r[0], this.r[1]), this.o, 0.0F, cuv.ab);
   }

   private ahf<cuo> a(int $$0, int $$1, cux.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         ahf<cuo> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private ahf<cuo> b(int $$0, int $$1, cux.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private ahf<cuo> c(int $$0, int $$1, cux.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private ahf<cuo> a(int $$0, int $$1, cux.b $$2, ahf<cuo> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? cuv.w : $$3;
   }

   private ahf<cuo> d(int $$0, int $$1, cux.b $$2) {
      ahf<cuo> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private ahf<cuo> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return cuv.N;
      } else {
         return $$0 == 4 ? cuv.f : cuv.M;
      }
   }

   private ahf<cuo> a(int $$0, cux.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? cuv.A : cuv.B;
      } else {
         return $$0 < 3 ? cuv.A : cuv.C;
      }
   }

   private ahf<cuo> e(int $$0, int $$1, cux.b $$2) {
      if ($$2.b() >= 0L) {
         ahf<cuo> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private ahf<cuo> f(int $$0, int $$1, cux.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? cuv.I : cuv.H;
      } else {
         return $$0 == 3 ? cuv.J : this.a($$1, $$2);
      }
   }

   private ahf<cuo> g(int $$0, int $$1, cux.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? cuv.G : cuv.F;
      }
   }

   private ahf<cuo> h(int $$0, int $$1, cux.b $$2) {
      ahf<cuo> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<cux.d, ahf<cuo>>> $$0, cux.b $$1, cux.b $$2, cux.b $$3, cux.b $$4, cux.b $$5, float $$6, ahf<cuo> $$7) {
      $$0.accept(Pair.of(cux.a($$1, $$2, $$3, $$4, cux.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(cux.a($$1, $$2, $$3, $$4, cux.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<cux.d, ahf<cuo>>> $$0, cux.b $$1, cux.b $$2, cux.b $$3, cux.b $$4, cux.b $$5, float $$6, ahf<cuo> $$7) {
      $$0.accept(Pair.of(cux.a($$1, $$2, $$3, $$4, cux.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<cux.d, ahf<cuo>>> $$0, cux.b $$1, cux.b $$2, cux.b $$3, cux.b $$4, cux.b $$5, float $$6, ahf<cuo> $$7) {
      $$0.accept(Pair.of(cux.a($$1, $$2, $$3, $$4, cux.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(doj $$0, doj $$1, doj.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dox.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dox.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dox.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dox.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)cux.a((float)$$0);
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

   private static String a(double $$0, cux.b[] $$1) {
      double $$2 = (double)cux.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @avt
   public cux.b[] b() {
      return this.p;
   }

   @avt
   public cux.b[] c() {
      return this.q;
   }

   @avt
   public cux.b[] d() {
      return this.r;
   }

   @avt
   public cux.b[] e() {
      return new cux.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @avt
   public cux.b[] f() {
      return new cux.b[]{
         cux.b.a(-2.0F, dox.a(0.05F)),
         cux.b.a(dox.a(0.05F), dox.a(0.26666668F)),
         cux.b.a(dox.a(0.26666668F), dox.a(0.4F)),
         cux.b.a(dox.a(0.4F), dox.a(0.56666666F)),
         cux.b.a(dox.a(0.56666666F), 2.0F)
      };
   }

   @avt
   public cux.b[] g() {
      return new cux.b[]{cux.b.a(-2.0F, 0.0F), cux.b.a(0.0F, 2.0F)};
   }
}
