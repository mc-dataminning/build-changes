import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dav {
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
   private final dao.b o = dao.b.a(-1.0F, 1.0F);
   private final dao.b[] p = new dao.b[]{dao.b.a(-1.0F, -0.45F), dao.b.a(-0.45F, -0.15F), dao.b.a(-0.15F, 0.2F), dao.b.a(0.2F, 0.55F), dao.b.a(0.55F, 1.0F)};
   private final dao.b[] q = new dao.b[]{dao.b.a(-1.0F, -0.35F), dao.b.a(-0.35F, -0.1F), dao.b.a(-0.1F, 0.1F), dao.b.a(0.1F, 0.3F), dao.b.a(0.3F, 1.0F)};
   private final dao.b[] r = new dao.b[]{
      dao.b.a(-1.0F, -0.78F),
      dao.b.a(-0.78F, -0.375F),
      dao.b.a(-0.375F, -0.2225F),
      dao.b.a(-0.2225F, 0.05F),
      dao.b.a(0.05F, 0.45F),
      dao.b.a(0.45F, 0.55F),
      dao.b.a(0.55F, 1.0F)
   };
   private final dao.b s = this.p[0];
   private final dao.b t = dao.b.a(this.p[1], this.p[4]);
   private final dao.b u = dao.b.a(-1.2F, -1.05F);
   private final dao.b v = dao.b.a(-1.05F, -0.455F);
   private final dao.b w = dao.b.a(-0.455F, -0.19F);
   private final dao.b x = dao.b.a(-0.19F, -0.11F);
   private final dao.b y = dao.b.a(-0.11F, 0.55F);
   private final dao.b z = dao.b.a(-0.11F, 0.03F);
   private final dao.b A = dao.b.a(0.03F, 0.3F);
   private final dao.b B = dao.b.a(0.3F, 1.0F);
   private final aju<daf>[][] C = new aju[][]{{dam.X, dam.V, dam.T, dam.R, dam.P}, {dam.W, dam.U, dam.S, dam.Q, dam.P}};
   private final aju<daf>[][] D = new aju[][]{
      {dam.d, dam.d, dam.d, dam.q, dam.p},
      {dam.b, dam.b, dam.i, dam.p, dam.o},
      {dam.j, dam.b, dam.i, dam.k, dam.l},
      {dam.r, dam.r, dam.i, dam.x, dam.x},
      {dam.f, dam.f, dam.f, dam.f, dam.f}
   };
   private final aju<daf>[][] E = new aju[][]{
      {dam.e, null, dam.q, null, null},
      {null, null, null, null, dam.n},
      {dam.c, null, null, dam.m, null},
      {null, null, dam.b, dam.y, dam.z},
      {null, null, null, null, null}
   };
   private final aju<daf>[][] F = new aju[][]{
      {dam.d, dam.d, dam.d, dam.q, dam.q},
      {dam.D, dam.D, dam.i, dam.p, dam.o},
      {dam.D, dam.D, dam.D, dam.D, dam.l},
      {dam.s, dam.s, dam.i, dam.i, dam.x},
      {dam.A, dam.A, dam.A, dam.C, dam.C}
   };
   private final aju<daf>[][] G = new aju[][]{
      {dam.e, null, null, null, null},
      {dam.E, null, dam.D, dam.D, dam.n},
      {dam.E, dam.E, dam.i, dam.k, null},
      {null, null, null, null, null},
      {dam.B, dam.B, null, null, null}
   };
   private final aju<daf>[][] H = new aju[][]{
      {dam.u, dam.u, dam.t, dam.v, dam.v},
      {dam.u, dam.u, dam.t, dam.v, dam.v},
      {dam.t, dam.t, dam.t, dam.v, dam.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dao.d> a() {
      dao.b $$0 = dao.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dao.d(this.o, this.o, dao.b.a(this.y, this.o), this.o, $$0, dao.b.a(-1.0F, -0.16F), 0L),
         new dao.d(this.o, this.o, dao.b.a(this.y, this.o), this.o, $$0, dao.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dao.d, aju<daf>>> $$0) {
      if (aa.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dao.d, aju<daf>>> $$0) {
      ip.a $$1 = oj.a();
      io<dut> $$2 = $$1.b(ku.aA);
      duu.w.a $$3 = new duu.w.a($$2.b(dvh.d));
      duu.w.a $$4 = new duu.w.a($$2.b(dvh.e));
      duu.w.a $$5 = new duu.w.a($$2.b(dvh.g));
      $$0.accept(Pair.of(dao.a(this.o, this.o, this.o, this.o, dao.b.a(0.0F), this.o, 0.01F), dam.b));
      if (qo.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, aym.a) instanceof awo.e<?, ?> $$7) {
         aju<daf> $$8 = dam.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dao.a(this.o, this.o, this.o, dao.b.a($$9), dao.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dam.f ? dam.A : dam.f;
         }
      }

      if (qo.a($$3, $$4, $$5, false) instanceof awo.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dao.a(this.o, this.o, dao.b.a($$12), this.o, dao.b.a(0.0F), this.o, 0.0F), dam.q));
         }
      }
   }

   private void c(Consumer<Pair<dao.d, aju<daf>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dam.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dao.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dao.d, aju<daf>>> $$0) {
      this.c($$0, dao.b.a(-1.0F, -0.93333334F));
      this.b($$0, dao.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dao.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dao.b.a(-0.56666666F, -0.4F));
      this.c($$0, dao.b.a(-0.4F, -0.26666668F));
      this.d($$0, dao.b.a(-0.26666668F, -0.05F));
      this.e($$0, dao.b.a(-0.05F, 0.05F));
      this.d($$0, dao.b.a(0.05F, 0.26666668F));
      this.c($$0, dao.b.a(0.26666668F, 0.4F));
      this.b($$0, dao.b.a(0.4F, 0.56666666F));
      this.a($$0, dao.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dao.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dao.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dao.d, aju<daf>>> $$0, dao.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dao.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dao.b $$5 = this.q[$$4];
            aju<daf> $$6 = this.a($$2, $$4, $$1);
            aju<daf> $$7 = this.b($$2, $$4, $$1);
            aju<daf> $$8 = this.c($$2, $$4, $$1);
            aju<daf> $$9 = this.e($$2, $$4, $$1);
            aju<daf> $$10 = this.h($$2, $$4, $$1);
            aju<daf> $$11 = this.a($$2, $$4, $$1, $$10);
            aju<daf> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dao.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dao.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dao.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dao.b.a(this.x, this.z), dao.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dao.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dao.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dao.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dao.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dao.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dao.d, aju<daf>>> $$0, dao.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dao.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dao.b $$5 = this.q[$$4];
            aju<daf> $$6 = this.a($$2, $$4, $$1);
            aju<daf> $$7 = this.b($$2, $$4, $$1);
            aju<daf> $$8 = this.c($$2, $$4, $$1);
            aju<daf> $$9 = this.e($$2, $$4, $$1);
            aju<daf> $$10 = this.h($$2, $$4, $$1);
            aju<daf> $$11 = this.a($$2, $$4, $$1, $$6);
            aju<daf> $$12 = this.g($$2, $$4, $$1);
            aju<daf> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dao.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dao.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dao.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dao.b.a(this.x, this.z), dao.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dao.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dao.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dao.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dao.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dao.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dao.d, aju<daf>>> $$0, dao.b $$1) {
      this.a($$0, this.o, this.o, this.x, dao.b.a(this.r[0], this.r[2]), $$1, 0.0F, dam.O);
      this.a($$0, dao.b.a(this.p[1], this.p[2]), this.o, dao.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dam.g);
      this.a($$0, dao.b.a(this.p[3], this.p[4]), this.o, dao.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dam.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dao.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dao.b $$5 = this.q[$$4];
            aju<daf> $$6 = this.a($$2, $$4, $$1);
            aju<daf> $$7 = this.b($$2, $$4, $$1);
            aju<daf> $$8 = this.c($$2, $$4, $$1);
            aju<daf> $$9 = this.h($$2, $$4, $$1);
            aju<daf> $$10 = this.e($$2, $$4, $$1);
            aju<daf> $$11 = this.a($$2, $$4);
            aju<daf> $$12 = this.a($$2, $$4, $$1, $$6);
            aju<daf> $$13 = this.d($$2, $$4, $$1);
            aju<daf> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dao.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dao.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dao.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dao.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dao.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dao.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dao.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dao.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dao.d, aju<daf>>> $$0, dao.b $$1) {
      this.a($$0, this.o, this.o, this.x, dao.b.a(this.r[0], this.r[2]), $$1, 0.0F, dam.O);
      this.a($$0, dao.b.a(this.p[1], this.p[2]), this.o, dao.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dam.g);
      this.a($$0, dao.b.a(this.p[3], this.p[4]), this.o, dao.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dam.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dao.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dao.b $$5 = this.q[$$4];
            aju<daf> $$6 = this.a($$2, $$4, $$1);
            aju<daf> $$7 = this.b($$2, $$4, $$1);
            aju<daf> $$8 = this.c($$2, $$4, $$1);
            aju<daf> $$9 = this.a($$2, $$4);
            aju<daf> $$10 = this.a($$2, $$4, $$1, $$6);
            aju<daf> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dao.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dao.b.a(this.A, this.B), dao.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dao.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dao.b.a(this.A, this.B), dao.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dao.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dao.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dao.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dao.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dao.d, aju<daf>>> $$0, dao.b $$1) {
      this.a($$0, this.s, this.o, this.x, dao.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dam.O : dam.L);
      this.a($$0, this.t, this.o, this.x, dao.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dam.O : dam.K);
      this.a($$0, this.s, this.o, this.z, dao.b.a(this.r[0], this.r[1]), $$1, 0.0F, dam.L);
      this.a($$0, this.t, this.o, this.z, dao.b.a(this.r[0], this.r[1]), $$1, 0.0F, dam.K);
      this.a($$0, this.s, this.o, dao.b.a(this.x, this.B), dao.b.a(this.r[2], this.r[5]), $$1, 0.0F, dam.L);
      this.a($$0, this.t, this.o, dao.b.a(this.x, this.B), dao.b.a(this.r[2], this.r[5]), $$1, 0.0F, dam.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dam.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dam.K);
      this.a($$0, dao.b.a(this.p[1], this.p[2]), this.o, dao.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dam.g);
      this.a($$0, dao.b.a(this.p[3], this.p[4]), this.o, dao.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dam.h);
      this.a($$0, this.s, this.o, dao.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dam.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dao.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dao.b $$5 = this.q[$$4];
            aju<daf> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dao.b.a(this.A, this.B), dao.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dao.d, aju<daf>>> $$0) {
      this.b($$0, this.o, this.o, dao.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dam.Z);
      this.b($$0, this.o, dao.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dam.aa);
      this.c($$0, this.o, this.o, this.o, dao.b.a(this.r[0], this.r[1]), this.o, 0.0F, dam.ab);
   }

   private aju<daf> a(int $$0, int $$1, dao.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         aju<daf> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private aju<daf> b(int $$0, int $$1, dao.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private aju<daf> c(int $$0, int $$1, dao.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private aju<daf> a(int $$0, int $$1, dao.b $$2, aju<daf> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dam.w : $$3;
   }

   private aju<daf> d(int $$0, int $$1, dao.b $$2) {
      aju<daf> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private aju<daf> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dam.N;
      } else {
         return $$0 == 4 ? dam.f : dam.M;
      }
   }

   private aju<daf> a(int $$0, dao.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dam.A : dam.B;
      } else {
         return $$0 < 3 ? dam.A : dam.C;
      }
   }

   private aju<daf> e(int $$0, int $$1, dao.b $$2) {
      if ($$2.b() >= 0L) {
         aju<daf> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private aju<daf> f(int $$0, int $$1, dao.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dam.I : dam.H;
      } else {
         return $$0 == 3 ? dam.J : this.a($$1, $$2);
      }
   }

   private aju<daf> g(int $$0, int $$1, dao.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dam.G : dam.F;
      }
   }

   private aju<daf> h(int $$0, int $$1, dao.b $$2) {
      aju<daf> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dao.d, aju<daf>>> $$0, dao.b $$1, dao.b $$2, dao.b $$3, dao.b $$4, dao.b $$5, float $$6, aju<daf> $$7) {
      $$0.accept(Pair.of(dao.a($$1, $$2, $$3, $$4, dao.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dao.a($$1, $$2, $$3, $$4, dao.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dao.d, aju<daf>>> $$0, dao.b $$1, dao.b $$2, dao.b $$3, dao.b $$4, dao.b $$5, float $$6, aju<daf> $$7) {
      $$0.accept(Pair.of(dao.a($$1, $$2, $$3, $$4, dao.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dao.d, aju<daf>>> $$0, dao.b $$1, dao.b $$2, dao.b $$3, dao.b $$4, dao.b $$5, float $$6, aju<daf> $$7) {
      $$0.accept(Pair.of(dao.a($$1, $$2, $$3, $$4, dao.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dut $$0, dut $$1, dut.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dvh.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dvh.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dvh.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dvh.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dao.a((float)$$0);
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

   private static String a(double $$0, dao.b[] $$1) {
      double $$2 = (double)dao.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @ayp
   public dao.b[] b() {
      return this.p;
   }

   @ayp
   public dao.b[] c() {
      return this.q;
   }

   @ayp
   public dao.b[] d() {
      return this.r;
   }

   @ayp
   public dao.b[] e() {
      return new dao.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @ayp
   public dao.b[] f() {
      return new dao.b[]{
         dao.b.a(-2.0F, dvh.a(0.05F)),
         dao.b.a(dvh.a(0.05F), dvh.a(0.26666668F)),
         dao.b.a(dvh.a(0.26666668F), dvh.a(0.4F)),
         dao.b.a(dvh.a(0.4F), dvh.a(0.56666666F)),
         dao.b.a(dvh.a(0.56666666F), 2.0F)
      };
   }

   @ayp
   public dao.b[] g() {
      return new dao.b[]{dao.b.a(-2.0F, 0.0F), dao.b.a(0.0F, 2.0F)};
   }
}
