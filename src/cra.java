import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class cra {
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
   private final cqt.b o = cqt.b.a(-1.0F, 1.0F);
   private final cqt.b[] p = new cqt.b[]{cqt.b.a(-1.0F, -0.45F), cqt.b.a(-0.45F, -0.15F), cqt.b.a(-0.15F, 0.2F), cqt.b.a(0.2F, 0.55F), cqt.b.a(0.55F, 1.0F)};
   private final cqt.b[] q = new cqt.b[]{cqt.b.a(-1.0F, -0.35F), cqt.b.a(-0.35F, -0.1F), cqt.b.a(-0.1F, 0.1F), cqt.b.a(0.1F, 0.3F), cqt.b.a(0.3F, 1.0F)};
   private final cqt.b[] r = new cqt.b[]{
      cqt.b.a(-1.0F, -0.78F),
      cqt.b.a(-0.78F, -0.375F),
      cqt.b.a(-0.375F, -0.2225F),
      cqt.b.a(-0.2225F, 0.05F),
      cqt.b.a(0.05F, 0.45F),
      cqt.b.a(0.45F, 0.55F),
      cqt.b.a(0.55F, 1.0F)
   };
   private final cqt.b s = this.p[0];
   private final cqt.b t = cqt.b.a(this.p[1], this.p[4]);
   private final cqt.b u = cqt.b.a(-1.2F, -1.05F);
   private final cqt.b v = cqt.b.a(-1.05F, -0.455F);
   private final cqt.b w = cqt.b.a(-0.455F, -0.19F);
   private final cqt.b x = cqt.b.a(-0.19F, -0.11F);
   private final cqt.b y = cqt.b.a(-0.11F, 0.55F);
   private final cqt.b z = cqt.b.a(-0.11F, 0.03F);
   private final cqt.b A = cqt.b.a(0.03F, 0.3F);
   private final cqt.b B = cqt.b.a(0.3F, 1.0F);
   private final aeq<cqk>[][] C = new aeq[][]{{cqr.X, cqr.V, cqr.T, cqr.R, cqr.P}, {cqr.W, cqr.U, cqr.S, cqr.Q, cqr.P}};
   private final aeq<cqk>[][] D = new aeq[][]{
      {cqr.d, cqr.d, cqr.d, cqr.q, cqr.p},
      {cqr.b, cqr.b, cqr.i, cqr.p, cqr.o},
      {cqr.j, cqr.b, cqr.i, cqr.k, cqr.l},
      {cqr.r, cqr.r, cqr.i, cqr.x, cqr.x},
      {cqr.f, cqr.f, cqr.f, cqr.f, cqr.f}
   };
   private final aeq<cqk>[][] E = new aeq[][]{
      {cqr.e, null, cqr.q, null, null},
      {null, null, null, null, cqr.n},
      {cqr.c, null, null, cqr.m, null},
      {null, null, cqr.b, cqr.y, cqr.z},
      {null, null, null, null, null}
   };
   private final aeq<cqk>[][] F = new aeq[][]{
      {cqr.d, cqr.d, cqr.d, cqr.q, cqr.q},
      {cqr.D, cqr.D, cqr.i, cqr.p, cqr.o},
      {cqr.D, cqr.D, cqr.D, cqr.D, cqr.l},
      {cqr.s, cqr.s, cqr.i, cqr.i, cqr.x},
      {cqr.A, cqr.A, cqr.A, cqr.C, cqr.C}
   };
   private final aeq<cqk>[][] G = new aeq[][]{
      {cqr.e, null, null, null, null},
      {cqr.E, null, cqr.D, cqr.D, cqr.n},
      {cqr.E, cqr.E, cqr.i, cqr.k, null},
      {null, null, null, null, null},
      {cqr.B, cqr.B, null, null, null}
   };
   private final aeq<cqk>[][] H = new aeq[][]{
      {cqr.u, cqr.u, cqr.t, cqr.v, cqr.v},
      {cqr.u, cqr.u, cqr.t, cqr.v, cqr.v},
      {cqr.t, cqr.t, cqr.t, cqr.v, cqr.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<cqt.d> a() {
      cqt.b $$0 = cqt.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new cqt.d(this.o, this.o, cqt.b.a(this.y, this.o), this.o, $$0, cqt.b.a(-1.0F, -0.16F), 0L),
         new cqt.d(this.o, this.o, cqt.b.a(this.y, this.o), this.o, $$0, cqt.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<cqt.d, aeq<cqk>>> $$0) {
      if (aa.ap) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<cqt.d, aeq<cqk>>> $$0) {
      hg.b $$1 = me.a();
      hf<dkc> $$2 = $$1.b(jc.at);
      dkd.w.a $$3 = new dkd.w.a($$2.b(dkq.d));
      dkd.w.a $$4 = new dkd.w.a($$2.b(dkq.e));
      dkd.w.a $$5 = new dkd.w.a($$2.b(dkq.g));
      $$0.accept(Pair.of(cqt.a(this.o, this.o, this.o, this.o, cqt.b.a(0.0F), this.o, 0.01F), cqr.b));
      if (ob.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, asn.a) instanceof aqt.e<?, ?> $$7) {
         aeq<cqk> $$8 = cqr.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(cqt.a(this.o, this.o, this.o, cqt.b.a($$9), cqt.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == cqr.f ? cqr.A : cqr.f;
         }
      }

      if (ob.a($$3, $$4, $$5, false) instanceof aqt.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(cqt.a(this.o, this.o, cqt.b.a($$12), this.o, cqt.b.a(0.0F), this.o, 0.0F), cqr.q));
         }
      }
   }

   private void c(Consumer<Pair<cqt.d, aeq<cqk>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, cqr.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         cqt.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<cqt.d, aeq<cqk>>> $$0) {
      this.c($$0, cqt.b.a(-1.0F, -0.93333334F));
      this.b($$0, cqt.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, cqt.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, cqt.b.a(-0.56666666F, -0.4F));
      this.c($$0, cqt.b.a(-0.4F, -0.26666668F));
      this.d($$0, cqt.b.a(-0.26666668F, -0.05F));
      this.e($$0, cqt.b.a(-0.05F, 0.05F));
      this.d($$0, cqt.b.a(0.05F, 0.26666668F));
      this.c($$0, cqt.b.a(0.26666668F, 0.4F));
      this.b($$0, cqt.b.a(0.4F, 0.56666666F));
      this.a($$0, cqt.b.a(0.56666666F, 0.7666667F));
      this.b($$0, cqt.b.a(0.7666667F, 0.93333334F));
      this.c($$0, cqt.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<cqt.d, aeq<cqk>>> $$0, cqt.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cqt.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cqt.b $$5 = this.q[$$4];
            aeq<cqk> $$6 = this.a($$2, $$4, $$1);
            aeq<cqk> $$7 = this.b($$2, $$4, $$1);
            aeq<cqk> $$8 = this.c($$2, $$4, $$1);
            aeq<cqk> $$9 = this.e($$2, $$4, $$1);
            aeq<cqk> $$10 = this.h($$2, $$4, $$1);
            aeq<cqk> $$11 = this.a($$2, $$4, $$1, $$10);
            aeq<cqk> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cqt.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cqt.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cqt.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cqt.b.a(this.x, this.z), cqt.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqt.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cqt.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqt.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cqt.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cqt.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<cqt.d, aeq<cqk>>> $$0, cqt.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cqt.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cqt.b $$5 = this.q[$$4];
            aeq<cqk> $$6 = this.a($$2, $$4, $$1);
            aeq<cqk> $$7 = this.b($$2, $$4, $$1);
            aeq<cqk> $$8 = this.c($$2, $$4, $$1);
            aeq<cqk> $$9 = this.e($$2, $$4, $$1);
            aeq<cqk> $$10 = this.h($$2, $$4, $$1);
            aeq<cqk> $$11 = this.a($$2, $$4, $$1, $$6);
            aeq<cqk> $$12 = this.g($$2, $$4, $$1);
            aeq<cqk> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, cqt.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cqt.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cqt.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cqt.b.a(this.x, this.z), cqt.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqt.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cqt.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqt.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cqt.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cqt.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<cqt.d, aeq<cqk>>> $$0, cqt.b $$1) {
      this.a($$0, this.o, this.o, this.x, cqt.b.a(this.r[0], this.r[2]), $$1, 0.0F, cqr.O);
      this.a($$0, cqt.b.a(this.p[1], this.p[2]), this.o, cqt.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cqr.g);
      this.a($$0, cqt.b.a(this.p[3], this.p[4]), this.o, cqt.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cqr.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cqt.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cqt.b $$5 = this.q[$$4];
            aeq<cqk> $$6 = this.a($$2, $$4, $$1);
            aeq<cqk> $$7 = this.b($$2, $$4, $$1);
            aeq<cqk> $$8 = this.c($$2, $$4, $$1);
            aeq<cqk> $$9 = this.h($$2, $$4, $$1);
            aeq<cqk> $$10 = this.e($$2, $$4, $$1);
            aeq<cqk> $$11 = this.a($$2, $$4);
            aeq<cqk> $$12 = this.a($$2, $$4, $$1, $$6);
            aeq<cqk> $$13 = this.d($$2, $$4, $$1);
            aeq<cqk> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cqt.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, cqt.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cqt.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqt.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, cqt.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, cqt.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cqt.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cqt.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<cqt.d, aeq<cqk>>> $$0, cqt.b $$1) {
      this.a($$0, this.o, this.o, this.x, cqt.b.a(this.r[0], this.r[2]), $$1, 0.0F, cqr.O);
      this.a($$0, cqt.b.a(this.p[1], this.p[2]), this.o, cqt.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cqr.g);
      this.a($$0, cqt.b.a(this.p[3], this.p[4]), this.o, cqt.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cqr.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cqt.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cqt.b $$5 = this.q[$$4];
            aeq<cqk> $$6 = this.a($$2, $$4, $$1);
            aeq<cqk> $$7 = this.b($$2, $$4, $$1);
            aeq<cqk> $$8 = this.c($$2, $$4, $$1);
            aeq<cqk> $$9 = this.a($$2, $$4);
            aeq<cqk> $$10 = this.a($$2, $$4, $$1, $$6);
            aeq<cqk> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, cqt.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, cqt.b.a(this.A, this.B), cqt.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, cqt.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqt.b.a(this.A, this.B), cqt.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, cqt.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cqt.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cqt.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cqt.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<cqt.d, aeq<cqk>>> $$0, cqt.b $$1) {
      this.a($$0, this.s, this.o, this.x, cqt.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cqr.O : cqr.L);
      this.a($$0, this.t, this.o, this.x, cqt.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cqr.O : cqr.K);
      this.a($$0, this.s, this.o, this.z, cqt.b.a(this.r[0], this.r[1]), $$1, 0.0F, cqr.L);
      this.a($$0, this.t, this.o, this.z, cqt.b.a(this.r[0], this.r[1]), $$1, 0.0F, cqr.K);
      this.a($$0, this.s, this.o, cqt.b.a(this.x, this.B), cqt.b.a(this.r[2], this.r[5]), $$1, 0.0F, cqr.L);
      this.a($$0, this.t, this.o, cqt.b.a(this.x, this.B), cqt.b.a(this.r[2], this.r[5]), $$1, 0.0F, cqr.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, cqr.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, cqr.K);
      this.a($$0, cqt.b.a(this.p[1], this.p[2]), this.o, cqt.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cqr.g);
      this.a($$0, cqt.b.a(this.p[3], this.p[4]), this.o, cqt.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cqr.h);
      this.a($$0, this.s, this.o, cqt.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cqr.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cqt.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cqt.b $$5 = this.q[$$4];
            aeq<cqk> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cqt.b.a(this.A, this.B), cqt.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<cqt.d, aeq<cqk>>> $$0) {
      this.b($$0, this.o, this.o, cqt.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, cqr.Z);
      this.b($$0, this.o, cqt.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, cqr.aa);
      this.c($$0, this.o, this.o, this.o, cqt.b.a(this.r[0], this.r[1]), this.o, 0.0F, cqr.ab);
   }

   private aeq<cqk> a(int $$0, int $$1, cqt.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         aeq<cqk> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private aeq<cqk> b(int $$0, int $$1, cqt.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private aeq<cqk> c(int $$0, int $$1, cqt.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private aeq<cqk> a(int $$0, int $$1, cqt.b $$2, aeq<cqk> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? cqr.w : $$3;
   }

   private aeq<cqk> d(int $$0, int $$1, cqt.b $$2) {
      aeq<cqk> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private aeq<cqk> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return cqr.N;
      } else {
         return $$0 == 4 ? cqr.f : cqr.M;
      }
   }

   private aeq<cqk> a(int $$0, cqt.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? cqr.A : cqr.B;
      } else {
         return $$0 < 3 ? cqr.A : cqr.C;
      }
   }

   private aeq<cqk> e(int $$0, int $$1, cqt.b $$2) {
      if ($$2.b() >= 0L) {
         aeq<cqk> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private aeq<cqk> f(int $$0, int $$1, cqt.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? cqr.I : cqr.H;
      } else {
         return $$0 == 3 ? cqr.J : this.a($$1, $$2);
      }
   }

   private aeq<cqk> g(int $$0, int $$1, cqt.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? cqr.G : cqr.F;
      }
   }

   private aeq<cqk> h(int $$0, int $$1, cqt.b $$2) {
      aeq<cqk> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<cqt.d, aeq<cqk>>> $$0, cqt.b $$1, cqt.b $$2, cqt.b $$3, cqt.b $$4, cqt.b $$5, float $$6, aeq<cqk> $$7) {
      $$0.accept(Pair.of(cqt.a($$1, $$2, $$3, $$4, cqt.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(cqt.a($$1, $$2, $$3, $$4, cqt.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<cqt.d, aeq<cqk>>> $$0, cqt.b $$1, cqt.b $$2, cqt.b $$3, cqt.b $$4, cqt.b $$5, float $$6, aeq<cqk> $$7) {
      $$0.accept(Pair.of(cqt.a($$1, $$2, $$3, $$4, cqt.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<cqt.d, aeq<cqk>>> $$0, cqt.b $$1, cqt.b $$2, cqt.b $$3, cqt.b $$4, cqt.b $$5, float $$6, aeq<cqk> $$7) {
      $$0.accept(Pair.of(cqt.a($$1, $$2, $$3, $$4, cqt.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dkc $$0, dkc $$1, dkc.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dkq.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dkq.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dkq.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dkq.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)cqt.a((float)$$0);
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

   private static String a(double $$0, cqt.b[] $$1) {
      double $$2 = (double)cqt.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @asq
   public cqt.b[] b() {
      return this.p;
   }

   @asq
   public cqt.b[] c() {
      return this.q;
   }

   @asq
   public cqt.b[] d() {
      return this.r;
   }

   @asq
   public cqt.b[] e() {
      return new cqt.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @asq
   public cqt.b[] f() {
      return new cqt.b[]{
         cqt.b.a(-2.0F, dkq.a(0.05F)),
         cqt.b.a(dkq.a(0.05F), dkq.a(0.26666668F)),
         cqt.b.a(dkq.a(0.26666668F), dkq.a(0.4F)),
         cqt.b.a(dkq.a(0.4F), dkq.a(0.56666666F)),
         cqt.b.a(dkq.a(0.56666666F), 2.0F)
      };
   }

   @asq
   public cqt.b[] g() {
      return new cqt.b[]{cqt.b.a(-2.0F, 0.0F), cqt.b.a(0.0F, 2.0F)};
   }
}
