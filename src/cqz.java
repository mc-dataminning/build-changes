import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class cqz {
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
   private final cqs.b o = cqs.b.a(-1.0F, 1.0F);
   private final cqs.b[] p = new cqs.b[]{cqs.b.a(-1.0F, -0.45F), cqs.b.a(-0.45F, -0.15F), cqs.b.a(-0.15F, 0.2F), cqs.b.a(0.2F, 0.55F), cqs.b.a(0.55F, 1.0F)};
   private final cqs.b[] q = new cqs.b[]{cqs.b.a(-1.0F, -0.35F), cqs.b.a(-0.35F, -0.1F), cqs.b.a(-0.1F, 0.1F), cqs.b.a(0.1F, 0.3F), cqs.b.a(0.3F, 1.0F)};
   private final cqs.b[] r = new cqs.b[]{
      cqs.b.a(-1.0F, -0.78F),
      cqs.b.a(-0.78F, -0.375F),
      cqs.b.a(-0.375F, -0.2225F),
      cqs.b.a(-0.2225F, 0.05F),
      cqs.b.a(0.05F, 0.45F),
      cqs.b.a(0.45F, 0.55F),
      cqs.b.a(0.55F, 1.0F)
   };
   private final cqs.b s = this.p[0];
   private final cqs.b t = cqs.b.a(this.p[1], this.p[4]);
   private final cqs.b u = cqs.b.a(-1.2F, -1.05F);
   private final cqs.b v = cqs.b.a(-1.05F, -0.455F);
   private final cqs.b w = cqs.b.a(-0.455F, -0.19F);
   private final cqs.b x = cqs.b.a(-0.19F, -0.11F);
   private final cqs.b y = cqs.b.a(-0.11F, 0.55F);
   private final cqs.b z = cqs.b.a(-0.11F, 0.03F);
   private final cqs.b A = cqs.b.a(0.03F, 0.3F);
   private final cqs.b B = cqs.b.a(0.3F, 1.0F);
   private final aeq<cqj>[][] C = new aeq[][]{{cqq.X, cqq.V, cqq.T, cqq.R, cqq.P}, {cqq.W, cqq.U, cqq.S, cqq.Q, cqq.P}};
   private final aeq<cqj>[][] D = new aeq[][]{
      {cqq.d, cqq.d, cqq.d, cqq.q, cqq.p},
      {cqq.b, cqq.b, cqq.i, cqq.p, cqq.o},
      {cqq.j, cqq.b, cqq.i, cqq.k, cqq.l},
      {cqq.r, cqq.r, cqq.i, cqq.x, cqq.x},
      {cqq.f, cqq.f, cqq.f, cqq.f, cqq.f}
   };
   private final aeq<cqj>[][] E = new aeq[][]{
      {cqq.e, null, cqq.q, null, null},
      {null, null, null, null, cqq.n},
      {cqq.c, null, null, cqq.m, null},
      {null, null, cqq.b, cqq.y, cqq.z},
      {null, null, null, null, null}
   };
   private final aeq<cqj>[][] F = new aeq[][]{
      {cqq.d, cqq.d, cqq.d, cqq.q, cqq.q},
      {cqq.D, cqq.D, cqq.i, cqq.p, cqq.o},
      {cqq.D, cqq.D, cqq.D, cqq.D, cqq.l},
      {cqq.s, cqq.s, cqq.i, cqq.i, cqq.x},
      {cqq.A, cqq.A, cqq.A, cqq.C, cqq.C}
   };
   private final aeq<cqj>[][] G = new aeq[][]{
      {cqq.e, null, null, null, null},
      {cqq.E, null, cqq.D, cqq.D, cqq.n},
      {cqq.E, cqq.E, cqq.i, cqq.k, null},
      {null, null, null, null, null},
      {cqq.B, cqq.B, null, null, null}
   };
   private final aeq<cqj>[][] H = new aeq[][]{
      {cqq.u, cqq.u, cqq.t, cqq.v, cqq.v},
      {cqq.u, cqq.u, cqq.t, cqq.v, cqq.v},
      {cqq.t, cqq.t, cqq.t, cqq.v, cqq.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<cqs.d> a() {
      cqs.b $$0 = cqs.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new cqs.d(this.o, this.o, cqs.b.a(this.y, this.o), this.o, $$0, cqs.b.a(-1.0F, -0.16F), 0L),
         new cqs.d(this.o, this.o, cqs.b.a(this.y, this.o), this.o, $$0, cqs.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<cqs.d, aeq<cqj>>> $$0) {
      if (aa.ap) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<cqs.d, aeq<cqj>>> $$0) {
      hg.b $$1 = me.a();
      hf<dkb> $$2 = $$1.b(jc.at);
      dkc.w.a $$3 = new dkc.w.a($$2.b(dkp.d));
      dkc.w.a $$4 = new dkc.w.a($$2.b(dkp.e));
      dkc.w.a $$5 = new dkc.w.a($$2.b(dkp.g));
      $$0.accept(Pair.of(cqs.a(this.o, this.o, this.o, this.o, cqs.b.a(0.0F), this.o, 0.01F), cqq.b));
      if (ob.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, asn.a) instanceof aqt.e<?, ?> $$7) {
         aeq<cqj> $$8 = cqq.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(cqs.a(this.o, this.o, this.o, cqs.b.a($$9), cqs.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == cqq.f ? cqq.A : cqq.f;
         }
      }

      if (ob.a($$3, $$4, $$5, false) instanceof aqt.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(cqs.a(this.o, this.o, cqs.b.a($$12), this.o, cqs.b.a(0.0F), this.o, 0.0F), cqq.q));
         }
      }
   }

   private void c(Consumer<Pair<cqs.d, aeq<cqj>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, cqq.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         cqs.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<cqs.d, aeq<cqj>>> $$0) {
      this.c($$0, cqs.b.a(-1.0F, -0.93333334F));
      this.b($$0, cqs.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, cqs.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, cqs.b.a(-0.56666666F, -0.4F));
      this.c($$0, cqs.b.a(-0.4F, -0.26666668F));
      this.d($$0, cqs.b.a(-0.26666668F, -0.05F));
      this.e($$0, cqs.b.a(-0.05F, 0.05F));
      this.d($$0, cqs.b.a(0.05F, 0.26666668F));
      this.c($$0, cqs.b.a(0.26666668F, 0.4F));
      this.b($$0, cqs.b.a(0.4F, 0.56666666F));
      this.a($$0, cqs.b.a(0.56666666F, 0.7666667F));
      this.b($$0, cqs.b.a(0.7666667F, 0.93333334F));
      this.c($$0, cqs.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<cqs.d, aeq<cqj>>> $$0, cqs.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cqs.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cqs.b $$5 = this.q[$$4];
            aeq<cqj> $$6 = this.a($$2, $$4, $$1);
            aeq<cqj> $$7 = this.b($$2, $$4, $$1);
            aeq<cqj> $$8 = this.c($$2, $$4, $$1);
            aeq<cqj> $$9 = this.e($$2, $$4, $$1);
            aeq<cqj> $$10 = this.h($$2, $$4, $$1);
            aeq<cqj> $$11 = this.a($$2, $$4, $$1, $$10);
            aeq<cqj> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cqs.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cqs.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cqs.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cqs.b.a(this.x, this.z), cqs.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqs.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cqs.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqs.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cqs.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cqs.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<cqs.d, aeq<cqj>>> $$0, cqs.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cqs.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cqs.b $$5 = this.q[$$4];
            aeq<cqj> $$6 = this.a($$2, $$4, $$1);
            aeq<cqj> $$7 = this.b($$2, $$4, $$1);
            aeq<cqj> $$8 = this.c($$2, $$4, $$1);
            aeq<cqj> $$9 = this.e($$2, $$4, $$1);
            aeq<cqj> $$10 = this.h($$2, $$4, $$1);
            aeq<cqj> $$11 = this.a($$2, $$4, $$1, $$6);
            aeq<cqj> $$12 = this.g($$2, $$4, $$1);
            aeq<cqj> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, cqs.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cqs.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cqs.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cqs.b.a(this.x, this.z), cqs.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqs.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cqs.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqs.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cqs.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cqs.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<cqs.d, aeq<cqj>>> $$0, cqs.b $$1) {
      this.a($$0, this.o, this.o, this.x, cqs.b.a(this.r[0], this.r[2]), $$1, 0.0F, cqq.O);
      this.a($$0, cqs.b.a(this.p[1], this.p[2]), this.o, cqs.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cqq.g);
      this.a($$0, cqs.b.a(this.p[3], this.p[4]), this.o, cqs.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cqq.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cqs.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cqs.b $$5 = this.q[$$4];
            aeq<cqj> $$6 = this.a($$2, $$4, $$1);
            aeq<cqj> $$7 = this.b($$2, $$4, $$1);
            aeq<cqj> $$8 = this.c($$2, $$4, $$1);
            aeq<cqj> $$9 = this.h($$2, $$4, $$1);
            aeq<cqj> $$10 = this.e($$2, $$4, $$1);
            aeq<cqj> $$11 = this.a($$2, $$4);
            aeq<cqj> $$12 = this.a($$2, $$4, $$1, $$6);
            aeq<cqj> $$13 = this.d($$2, $$4, $$1);
            aeq<cqj> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cqs.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, cqs.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cqs.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqs.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, cqs.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, cqs.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cqs.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cqs.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<cqs.d, aeq<cqj>>> $$0, cqs.b $$1) {
      this.a($$0, this.o, this.o, this.x, cqs.b.a(this.r[0], this.r[2]), $$1, 0.0F, cqq.O);
      this.a($$0, cqs.b.a(this.p[1], this.p[2]), this.o, cqs.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cqq.g);
      this.a($$0, cqs.b.a(this.p[3], this.p[4]), this.o, cqs.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cqq.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cqs.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cqs.b $$5 = this.q[$$4];
            aeq<cqj> $$6 = this.a($$2, $$4, $$1);
            aeq<cqj> $$7 = this.b($$2, $$4, $$1);
            aeq<cqj> $$8 = this.c($$2, $$4, $$1);
            aeq<cqj> $$9 = this.a($$2, $$4);
            aeq<cqj> $$10 = this.a($$2, $$4, $$1, $$6);
            aeq<cqj> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, cqs.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, cqs.b.a(this.A, this.B), cqs.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, cqs.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqs.b.a(this.A, this.B), cqs.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, cqs.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cqs.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cqs.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cqs.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<cqs.d, aeq<cqj>>> $$0, cqs.b $$1) {
      this.a($$0, this.s, this.o, this.x, cqs.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cqq.O : cqq.L);
      this.a($$0, this.t, this.o, this.x, cqs.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cqq.O : cqq.K);
      this.a($$0, this.s, this.o, this.z, cqs.b.a(this.r[0], this.r[1]), $$1, 0.0F, cqq.L);
      this.a($$0, this.t, this.o, this.z, cqs.b.a(this.r[0], this.r[1]), $$1, 0.0F, cqq.K);
      this.a($$0, this.s, this.o, cqs.b.a(this.x, this.B), cqs.b.a(this.r[2], this.r[5]), $$1, 0.0F, cqq.L);
      this.a($$0, this.t, this.o, cqs.b.a(this.x, this.B), cqs.b.a(this.r[2], this.r[5]), $$1, 0.0F, cqq.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, cqq.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, cqq.K);
      this.a($$0, cqs.b.a(this.p[1], this.p[2]), this.o, cqs.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cqq.g);
      this.a($$0, cqs.b.a(this.p[3], this.p[4]), this.o, cqs.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cqq.h);
      this.a($$0, this.s, this.o, cqs.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cqq.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cqs.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cqs.b $$5 = this.q[$$4];
            aeq<cqj> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cqs.b.a(this.A, this.B), cqs.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<cqs.d, aeq<cqj>>> $$0) {
      this.b($$0, this.o, this.o, cqs.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, cqq.Z);
      this.b($$0, this.o, cqs.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, cqq.aa);
      this.c($$0, this.o, this.o, this.o, cqs.b.a(this.r[0], this.r[1]), this.o, 0.0F, cqq.ab);
   }

   private aeq<cqj> a(int $$0, int $$1, cqs.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         aeq<cqj> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private aeq<cqj> b(int $$0, int $$1, cqs.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private aeq<cqj> c(int $$0, int $$1, cqs.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private aeq<cqj> a(int $$0, int $$1, cqs.b $$2, aeq<cqj> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? cqq.w : $$3;
   }

   private aeq<cqj> d(int $$0, int $$1, cqs.b $$2) {
      aeq<cqj> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private aeq<cqj> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return cqq.N;
      } else {
         return $$0 == 4 ? cqq.f : cqq.M;
      }
   }

   private aeq<cqj> a(int $$0, cqs.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? cqq.A : cqq.B;
      } else {
         return $$0 < 3 ? cqq.A : cqq.C;
      }
   }

   private aeq<cqj> e(int $$0, int $$1, cqs.b $$2) {
      if ($$2.b() >= 0L) {
         aeq<cqj> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private aeq<cqj> f(int $$0, int $$1, cqs.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? cqq.I : cqq.H;
      } else {
         return $$0 == 3 ? cqq.J : this.a($$1, $$2);
      }
   }

   private aeq<cqj> g(int $$0, int $$1, cqs.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? cqq.G : cqq.F;
      }
   }

   private aeq<cqj> h(int $$0, int $$1, cqs.b $$2) {
      aeq<cqj> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<cqs.d, aeq<cqj>>> $$0, cqs.b $$1, cqs.b $$2, cqs.b $$3, cqs.b $$4, cqs.b $$5, float $$6, aeq<cqj> $$7) {
      $$0.accept(Pair.of(cqs.a($$1, $$2, $$3, $$4, cqs.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(cqs.a($$1, $$2, $$3, $$4, cqs.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<cqs.d, aeq<cqj>>> $$0, cqs.b $$1, cqs.b $$2, cqs.b $$3, cqs.b $$4, cqs.b $$5, float $$6, aeq<cqj> $$7) {
      $$0.accept(Pair.of(cqs.a($$1, $$2, $$3, $$4, cqs.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<cqs.d, aeq<cqj>>> $$0, cqs.b $$1, cqs.b $$2, cqs.b $$3, cqs.b $$4, cqs.b $$5, float $$6, aeq<cqj> $$7) {
      $$0.accept(Pair.of(cqs.a($$1, $$2, $$3, $$4, cqs.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dkb $$0, dkb $$1, dkb.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dkp.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dkp.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dkp.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dkp.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)cqs.a((float)$$0);
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

   private static String a(double $$0, cqs.b[] $$1) {
      double $$2 = (double)cqs.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @asq
   public cqs.b[] b() {
      return this.p;
   }

   @asq
   public cqs.b[] c() {
      return this.q;
   }

   @asq
   public cqs.b[] d() {
      return this.r;
   }

   @asq
   public cqs.b[] e() {
      return new cqs.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @asq
   public cqs.b[] f() {
      return new cqs.b[]{
         cqs.b.a(-2.0F, dkp.a(0.05F)),
         cqs.b.a(dkp.a(0.05F), dkp.a(0.26666668F)),
         cqs.b.a(dkp.a(0.26666668F), dkp.a(0.4F)),
         cqs.b.a(dkp.a(0.4F), dkp.a(0.56666666F)),
         cqs.b.a(dkp.a(0.56666666F), 2.0F)
      };
   }

   @asq
   public cqs.b[] g() {
      return new cqs.b[]{cqs.b.a(-2.0F, 0.0F), cqs.b.a(0.0F, 2.0F)};
   }
}
