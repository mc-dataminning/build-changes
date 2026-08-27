import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class cqy {
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
   private final cqr.b o = cqr.b.a(-1.0F, 1.0F);
   private final cqr.b[] p = new cqr.b[]{cqr.b.a(-1.0F, -0.45F), cqr.b.a(-0.45F, -0.15F), cqr.b.a(-0.15F, 0.2F), cqr.b.a(0.2F, 0.55F), cqr.b.a(0.55F, 1.0F)};
   private final cqr.b[] q = new cqr.b[]{cqr.b.a(-1.0F, -0.35F), cqr.b.a(-0.35F, -0.1F), cqr.b.a(-0.1F, 0.1F), cqr.b.a(0.1F, 0.3F), cqr.b.a(0.3F, 1.0F)};
   private final cqr.b[] r = new cqr.b[]{
      cqr.b.a(-1.0F, -0.78F),
      cqr.b.a(-0.78F, -0.375F),
      cqr.b.a(-0.375F, -0.2225F),
      cqr.b.a(-0.2225F, 0.05F),
      cqr.b.a(0.05F, 0.45F),
      cqr.b.a(0.45F, 0.55F),
      cqr.b.a(0.55F, 1.0F)
   };
   private final cqr.b s = this.p[0];
   private final cqr.b t = cqr.b.a(this.p[1], this.p[4]);
   private final cqr.b u = cqr.b.a(-1.2F, -1.05F);
   private final cqr.b v = cqr.b.a(-1.05F, -0.455F);
   private final cqr.b w = cqr.b.a(-0.455F, -0.19F);
   private final cqr.b x = cqr.b.a(-0.19F, -0.11F);
   private final cqr.b y = cqr.b.a(-0.11F, 0.55F);
   private final cqr.b z = cqr.b.a(-0.11F, 0.03F);
   private final cqr.b A = cqr.b.a(0.03F, 0.3F);
   private final cqr.b B = cqr.b.a(0.3F, 1.0F);
   private final aeo<cqi>[][] C = new aeo[][]{{cqp.X, cqp.V, cqp.T, cqp.R, cqp.P}, {cqp.W, cqp.U, cqp.S, cqp.Q, cqp.P}};
   private final aeo<cqi>[][] D = new aeo[][]{
      {cqp.d, cqp.d, cqp.d, cqp.q, cqp.p},
      {cqp.b, cqp.b, cqp.i, cqp.p, cqp.o},
      {cqp.j, cqp.b, cqp.i, cqp.k, cqp.l},
      {cqp.r, cqp.r, cqp.i, cqp.x, cqp.x},
      {cqp.f, cqp.f, cqp.f, cqp.f, cqp.f}
   };
   private final aeo<cqi>[][] E = new aeo[][]{
      {cqp.e, null, cqp.q, null, null},
      {null, null, null, null, cqp.n},
      {cqp.c, null, null, cqp.m, null},
      {null, null, cqp.b, cqp.y, cqp.z},
      {null, null, null, null, null}
   };
   private final aeo<cqi>[][] F = new aeo[][]{
      {cqp.d, cqp.d, cqp.d, cqp.q, cqp.q},
      {cqp.D, cqp.D, cqp.i, cqp.p, cqp.o},
      {cqp.D, cqp.D, cqp.D, cqp.D, cqp.l},
      {cqp.s, cqp.s, cqp.i, cqp.i, cqp.x},
      {cqp.A, cqp.A, cqp.A, cqp.C, cqp.C}
   };
   private final aeo<cqi>[][] G = new aeo[][]{
      {cqp.e, null, null, null, null},
      {cqp.E, null, cqp.D, cqp.D, cqp.n},
      {cqp.E, cqp.E, cqp.i, cqp.k, null},
      {null, null, null, null, null},
      {cqp.B, cqp.B, null, null, null}
   };
   private final aeo<cqi>[][] H = new aeo[][]{
      {cqp.u, cqp.u, cqp.t, cqp.v, cqp.v},
      {cqp.u, cqp.u, cqp.t, cqp.v, cqp.v},
      {cqp.t, cqp.t, cqp.t, cqp.v, cqp.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<cqr.d> a() {
      cqr.b $$0 = cqr.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new cqr.d(this.o, this.o, cqr.b.a(this.y, this.o), this.o, $$0, cqr.b.a(-1.0F, -0.16F), 0L),
         new cqr.d(this.o, this.o, cqr.b.a(this.y, this.o), this.o, $$0, cqr.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<cqr.d, aeo<cqi>>> $$0) {
      if (aa.ap) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<cqr.d, aeo<cqi>>> $$0) {
      hh.b $$1 = mf.a();
      hg<dka> $$2 = $$1.b(jd.at);
      dkb.w.a $$3 = new dkb.w.a($$2.b(dko.d));
      dkb.w.a $$4 = new dkb.w.a($$2.b(dko.e));
      dkb.w.a $$5 = new dkb.w.a($$2.b(dko.g));
      $$0.accept(Pair.of(cqr.a(this.o, this.o, this.o, this.o, cqr.b.a(0.0F), this.o, 0.01F), cqp.b));
      if (oc.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, asl.a) instanceof aqr.e<?, ?> $$7) {
         aeo<cqi> $$8 = cqp.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(cqr.a(this.o, this.o, this.o, cqr.b.a($$9), cqr.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == cqp.f ? cqp.A : cqp.f;
         }
      }

      if (oc.a($$3, $$4, $$5, false) instanceof aqr.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(cqr.a(this.o, this.o, cqr.b.a($$12), this.o, cqr.b.a(0.0F), this.o, 0.0F), cqp.q));
         }
      }
   }

   private void c(Consumer<Pair<cqr.d, aeo<cqi>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, cqp.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         cqr.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<cqr.d, aeo<cqi>>> $$0) {
      this.c($$0, cqr.b.a(-1.0F, -0.93333334F));
      this.b($$0, cqr.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, cqr.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, cqr.b.a(-0.56666666F, -0.4F));
      this.c($$0, cqr.b.a(-0.4F, -0.26666668F));
      this.d($$0, cqr.b.a(-0.26666668F, -0.05F));
      this.e($$0, cqr.b.a(-0.05F, 0.05F));
      this.d($$0, cqr.b.a(0.05F, 0.26666668F));
      this.c($$0, cqr.b.a(0.26666668F, 0.4F));
      this.b($$0, cqr.b.a(0.4F, 0.56666666F));
      this.a($$0, cqr.b.a(0.56666666F, 0.7666667F));
      this.b($$0, cqr.b.a(0.7666667F, 0.93333334F));
      this.c($$0, cqr.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<cqr.d, aeo<cqi>>> $$0, cqr.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cqr.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cqr.b $$5 = this.q[$$4];
            aeo<cqi> $$6 = this.a($$2, $$4, $$1);
            aeo<cqi> $$7 = this.b($$2, $$4, $$1);
            aeo<cqi> $$8 = this.c($$2, $$4, $$1);
            aeo<cqi> $$9 = this.e($$2, $$4, $$1);
            aeo<cqi> $$10 = this.h($$2, $$4, $$1);
            aeo<cqi> $$11 = this.a($$2, $$4, $$1, $$10);
            aeo<cqi> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cqr.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cqr.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cqr.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cqr.b.a(this.x, this.z), cqr.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqr.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cqr.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqr.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cqr.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cqr.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<cqr.d, aeo<cqi>>> $$0, cqr.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cqr.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cqr.b $$5 = this.q[$$4];
            aeo<cqi> $$6 = this.a($$2, $$4, $$1);
            aeo<cqi> $$7 = this.b($$2, $$4, $$1);
            aeo<cqi> $$8 = this.c($$2, $$4, $$1);
            aeo<cqi> $$9 = this.e($$2, $$4, $$1);
            aeo<cqi> $$10 = this.h($$2, $$4, $$1);
            aeo<cqi> $$11 = this.a($$2, $$4, $$1, $$6);
            aeo<cqi> $$12 = this.g($$2, $$4, $$1);
            aeo<cqi> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, cqr.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cqr.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cqr.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cqr.b.a(this.x, this.z), cqr.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqr.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cqr.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqr.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cqr.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cqr.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<cqr.d, aeo<cqi>>> $$0, cqr.b $$1) {
      this.a($$0, this.o, this.o, this.x, cqr.b.a(this.r[0], this.r[2]), $$1, 0.0F, cqp.O);
      this.a($$0, cqr.b.a(this.p[1], this.p[2]), this.o, cqr.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cqp.g);
      this.a($$0, cqr.b.a(this.p[3], this.p[4]), this.o, cqr.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cqp.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cqr.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cqr.b $$5 = this.q[$$4];
            aeo<cqi> $$6 = this.a($$2, $$4, $$1);
            aeo<cqi> $$7 = this.b($$2, $$4, $$1);
            aeo<cqi> $$8 = this.c($$2, $$4, $$1);
            aeo<cqi> $$9 = this.h($$2, $$4, $$1);
            aeo<cqi> $$10 = this.e($$2, $$4, $$1);
            aeo<cqi> $$11 = this.a($$2, $$4);
            aeo<cqi> $$12 = this.a($$2, $$4, $$1, $$6);
            aeo<cqi> $$13 = this.d($$2, $$4, $$1);
            aeo<cqi> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cqr.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, cqr.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cqr.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqr.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, cqr.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, cqr.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cqr.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cqr.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<cqr.d, aeo<cqi>>> $$0, cqr.b $$1) {
      this.a($$0, this.o, this.o, this.x, cqr.b.a(this.r[0], this.r[2]), $$1, 0.0F, cqp.O);
      this.a($$0, cqr.b.a(this.p[1], this.p[2]), this.o, cqr.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cqp.g);
      this.a($$0, cqr.b.a(this.p[3], this.p[4]), this.o, cqr.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cqp.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cqr.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cqr.b $$5 = this.q[$$4];
            aeo<cqi> $$6 = this.a($$2, $$4, $$1);
            aeo<cqi> $$7 = this.b($$2, $$4, $$1);
            aeo<cqi> $$8 = this.c($$2, $$4, $$1);
            aeo<cqi> $$9 = this.a($$2, $$4);
            aeo<cqi> $$10 = this.a($$2, $$4, $$1, $$6);
            aeo<cqi> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, cqr.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, cqr.b.a(this.A, this.B), cqr.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, cqr.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqr.b.a(this.A, this.B), cqr.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, cqr.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cqr.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cqr.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cqr.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<cqr.d, aeo<cqi>>> $$0, cqr.b $$1) {
      this.a($$0, this.s, this.o, this.x, cqr.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cqp.O : cqp.L);
      this.a($$0, this.t, this.o, this.x, cqr.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cqp.O : cqp.K);
      this.a($$0, this.s, this.o, this.z, cqr.b.a(this.r[0], this.r[1]), $$1, 0.0F, cqp.L);
      this.a($$0, this.t, this.o, this.z, cqr.b.a(this.r[0], this.r[1]), $$1, 0.0F, cqp.K);
      this.a($$0, this.s, this.o, cqr.b.a(this.x, this.B), cqr.b.a(this.r[2], this.r[5]), $$1, 0.0F, cqp.L);
      this.a($$0, this.t, this.o, cqr.b.a(this.x, this.B), cqr.b.a(this.r[2], this.r[5]), $$1, 0.0F, cqp.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, cqp.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, cqp.K);
      this.a($$0, cqr.b.a(this.p[1], this.p[2]), this.o, cqr.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cqp.g);
      this.a($$0, cqr.b.a(this.p[3], this.p[4]), this.o, cqr.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cqp.h);
      this.a($$0, this.s, this.o, cqr.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cqp.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cqr.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cqr.b $$5 = this.q[$$4];
            aeo<cqi> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cqr.b.a(this.A, this.B), cqr.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<cqr.d, aeo<cqi>>> $$0) {
      this.b($$0, this.o, this.o, cqr.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, cqp.Z);
      this.b($$0, this.o, cqr.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, cqp.aa);
      this.c($$0, this.o, this.o, this.o, cqr.b.a(this.r[0], this.r[1]), this.o, 0.0F, cqp.ab);
   }

   private aeo<cqi> a(int $$0, int $$1, cqr.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         aeo<cqi> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private aeo<cqi> b(int $$0, int $$1, cqr.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private aeo<cqi> c(int $$0, int $$1, cqr.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private aeo<cqi> a(int $$0, int $$1, cqr.b $$2, aeo<cqi> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? cqp.w : $$3;
   }

   private aeo<cqi> d(int $$0, int $$1, cqr.b $$2) {
      aeo<cqi> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private aeo<cqi> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return cqp.N;
      } else {
         return $$0 == 4 ? cqp.f : cqp.M;
      }
   }

   private aeo<cqi> a(int $$0, cqr.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? cqp.A : cqp.B;
      } else {
         return $$0 < 3 ? cqp.A : cqp.C;
      }
   }

   private aeo<cqi> e(int $$0, int $$1, cqr.b $$2) {
      if ($$2.b() >= 0L) {
         aeo<cqi> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private aeo<cqi> f(int $$0, int $$1, cqr.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? cqp.I : cqp.H;
      } else {
         return $$0 == 3 ? cqp.J : this.a($$1, $$2);
      }
   }

   private aeo<cqi> g(int $$0, int $$1, cqr.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? cqp.G : cqp.F;
      }
   }

   private aeo<cqi> h(int $$0, int $$1, cqr.b $$2) {
      aeo<cqi> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<cqr.d, aeo<cqi>>> $$0, cqr.b $$1, cqr.b $$2, cqr.b $$3, cqr.b $$4, cqr.b $$5, float $$6, aeo<cqi> $$7) {
      $$0.accept(Pair.of(cqr.a($$1, $$2, $$3, $$4, cqr.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(cqr.a($$1, $$2, $$3, $$4, cqr.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<cqr.d, aeo<cqi>>> $$0, cqr.b $$1, cqr.b $$2, cqr.b $$3, cqr.b $$4, cqr.b $$5, float $$6, aeo<cqi> $$7) {
      $$0.accept(Pair.of(cqr.a($$1, $$2, $$3, $$4, cqr.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<cqr.d, aeo<cqi>>> $$0, cqr.b $$1, cqr.b $$2, cqr.b $$3, cqr.b $$4, cqr.b $$5, float $$6, aeo<cqi> $$7) {
      $$0.accept(Pair.of(cqr.a($$1, $$2, $$3, $$4, cqr.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dka $$0, dka $$1, dka.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dko.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dko.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dko.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dko.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)cqr.a((float)$$0);
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

   private static String a(double $$0, cqr.b[] $$1) {
      double $$2 = (double)cqr.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @aso
   public cqr.b[] b() {
      return this.p;
   }

   @aso
   public cqr.b[] c() {
      return this.q;
   }

   @aso
   public cqr.b[] d() {
      return this.r;
   }

   @aso
   public cqr.b[] e() {
      return new cqr.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @aso
   public cqr.b[] f() {
      return new cqr.b[]{
         cqr.b.a(-2.0F, dko.a(0.05F)),
         cqr.b.a(dko.a(0.05F), dko.a(0.26666668F)),
         cqr.b.a(dko.a(0.26666668F), dko.a(0.4F)),
         cqr.b.a(dko.a(0.4F), dko.a(0.56666666F)),
         cqr.b.a(dko.a(0.56666666F), 2.0F)
      };
   }

   @aso
   public cqr.b[] g() {
      return new cqr.b[]{cqr.b.a(-2.0F, 0.0F), cqr.b.a(0.0F, 2.0F)};
   }
}
