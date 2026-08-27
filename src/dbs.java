import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dbs {
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
   private final dbl.b o = dbl.b.a(-1.0F, 1.0F);
   private final dbl.b[] p = new dbl.b[]{dbl.b.a(-1.0F, -0.45F), dbl.b.a(-0.45F, -0.15F), dbl.b.a(-0.15F, 0.2F), dbl.b.a(0.2F, 0.55F), dbl.b.a(0.55F, 1.0F)};
   private final dbl.b[] q = new dbl.b[]{dbl.b.a(-1.0F, -0.35F), dbl.b.a(-0.35F, -0.1F), dbl.b.a(-0.1F, 0.1F), dbl.b.a(0.1F, 0.3F), dbl.b.a(0.3F, 1.0F)};
   private final dbl.b[] r = new dbl.b[]{
      dbl.b.a(-1.0F, -0.78F),
      dbl.b.a(-0.78F, -0.375F),
      dbl.b.a(-0.375F, -0.2225F),
      dbl.b.a(-0.2225F, 0.05F),
      dbl.b.a(0.05F, 0.45F),
      dbl.b.a(0.45F, 0.55F),
      dbl.b.a(0.55F, 1.0F)
   };
   private final dbl.b s = this.p[0];
   private final dbl.b t = dbl.b.a(this.p[1], this.p[4]);
   private final dbl.b u = dbl.b.a(-1.2F, -1.05F);
   private final dbl.b v = dbl.b.a(-1.05F, -0.455F);
   private final dbl.b w = dbl.b.a(-0.455F, -0.19F);
   private final dbl.b x = dbl.b.a(-0.19F, -0.11F);
   private final dbl.b y = dbl.b.a(-0.11F, 0.55F);
   private final dbl.b z = dbl.b.a(-0.11F, 0.03F);
   private final dbl.b A = dbl.b.a(0.03F, 0.3F);
   private final dbl.b B = dbl.b.a(0.3F, 1.0F);
   private final akg<dbc>[][] C = new akg[][]{{dbj.X, dbj.V, dbj.T, dbj.R, dbj.P}, {dbj.W, dbj.U, dbj.S, dbj.Q, dbj.P}};
   private final akg<dbc>[][] D = new akg[][]{
      {dbj.d, dbj.d, dbj.d, dbj.q, dbj.p},
      {dbj.b, dbj.b, dbj.i, dbj.p, dbj.o},
      {dbj.j, dbj.b, dbj.i, dbj.k, dbj.l},
      {dbj.r, dbj.r, dbj.i, dbj.x, dbj.x},
      {dbj.f, dbj.f, dbj.f, dbj.f, dbj.f}
   };
   private final akg<dbc>[][] E = new akg[][]{
      {dbj.e, null, dbj.q, null, null},
      {null, null, null, null, dbj.n},
      {dbj.c, null, null, dbj.m, null},
      {null, null, dbj.b, dbj.y, dbj.z},
      {null, null, null, null, null}
   };
   private final akg<dbc>[][] F = new akg[][]{
      {dbj.d, dbj.d, dbj.d, dbj.q, dbj.q},
      {dbj.D, dbj.D, dbj.i, dbj.p, dbj.o},
      {dbj.D, dbj.D, dbj.D, dbj.D, dbj.l},
      {dbj.s, dbj.s, dbj.i, dbj.i, dbj.x},
      {dbj.A, dbj.A, dbj.A, dbj.C, dbj.C}
   };
   private final akg<dbc>[][] G = new akg[][]{
      {dbj.e, null, null, null, null},
      {dbj.E, null, dbj.D, dbj.D, dbj.n},
      {dbj.E, dbj.E, dbj.i, dbj.k, null},
      {null, null, null, null, null},
      {dbj.B, dbj.B, null, null, null}
   };
   private final akg<dbc>[][] H = new akg[][]{
      {dbj.u, dbj.u, dbj.t, dbj.v, dbj.v},
      {dbj.u, dbj.u, dbj.t, dbj.v, dbj.v},
      {dbj.t, dbj.t, dbj.t, dbj.v, dbj.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dbl.d> a() {
      dbl.b $$0 = dbl.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dbl.d(this.o, this.o, dbl.b.a(this.y, this.o), this.o, $$0, dbl.b.a(-1.0F, -0.16F), 0L),
         new dbl.d(this.o, this.o, dbl.b.a(this.y, this.o), this.o, $$0, dbl.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dbl.d, akg<dbc>>> $$0) {
      if (aa.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dbl.d, akg<dbc>>> $$0) {
      iy.a $$1 = ot.a();
      ix<dvs> $$2 = $$1.b(le.aD);
      dvt.w.a $$3 = new dvt.w.a($$2.b(dwg.d));
      dvt.w.a $$4 = new dvt.w.a($$2.b(dwg.e));
      dvt.w.a $$5 = new dvt.w.a($$2.b(dwg.g));
      $$0.accept(Pair.of(dbl.a(this.o, this.o, this.o, this.o, dbl.b.a(0.0F), this.o, 0.01F), dbj.b));
      if (ra.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, ayz.a) instanceof axb.e<?, ?> $$7) {
         akg<dbc> $$8 = dbj.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dbl.a(this.o, this.o, this.o, dbl.b.a($$9), dbl.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dbj.f ? dbj.A : dbj.f;
         }
      }

      if (ra.a($$3, $$4, $$5, false) instanceof axb.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dbl.a(this.o, this.o, dbl.b.a($$12), this.o, dbl.b.a(0.0F), this.o, 0.0F), dbj.q));
         }
      }
   }

   private void c(Consumer<Pair<dbl.d, akg<dbc>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dbj.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dbl.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dbl.d, akg<dbc>>> $$0) {
      this.c($$0, dbl.b.a(-1.0F, -0.93333334F));
      this.b($$0, dbl.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dbl.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dbl.b.a(-0.56666666F, -0.4F));
      this.c($$0, dbl.b.a(-0.4F, -0.26666668F));
      this.d($$0, dbl.b.a(-0.26666668F, -0.05F));
      this.e($$0, dbl.b.a(-0.05F, 0.05F));
      this.d($$0, dbl.b.a(0.05F, 0.26666668F));
      this.c($$0, dbl.b.a(0.26666668F, 0.4F));
      this.b($$0, dbl.b.a(0.4F, 0.56666666F));
      this.a($$0, dbl.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dbl.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dbl.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dbl.d, akg<dbc>>> $$0, dbl.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dbl.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dbl.b $$5 = this.q[$$4];
            akg<dbc> $$6 = this.a($$2, $$4, $$1);
            akg<dbc> $$7 = this.b($$2, $$4, $$1);
            akg<dbc> $$8 = this.c($$2, $$4, $$1);
            akg<dbc> $$9 = this.e($$2, $$4, $$1);
            akg<dbc> $$10 = this.h($$2, $$4, $$1);
            akg<dbc> $$11 = this.a($$2, $$4, $$1, $$10);
            akg<dbc> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dbl.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dbl.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dbl.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dbl.b.a(this.x, this.z), dbl.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dbl.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dbl.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dbl.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dbl.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dbl.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dbl.d, akg<dbc>>> $$0, dbl.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dbl.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dbl.b $$5 = this.q[$$4];
            akg<dbc> $$6 = this.a($$2, $$4, $$1);
            akg<dbc> $$7 = this.b($$2, $$4, $$1);
            akg<dbc> $$8 = this.c($$2, $$4, $$1);
            akg<dbc> $$9 = this.e($$2, $$4, $$1);
            akg<dbc> $$10 = this.h($$2, $$4, $$1);
            akg<dbc> $$11 = this.a($$2, $$4, $$1, $$6);
            akg<dbc> $$12 = this.g($$2, $$4, $$1);
            akg<dbc> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dbl.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dbl.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dbl.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dbl.b.a(this.x, this.z), dbl.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dbl.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dbl.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dbl.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dbl.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dbl.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dbl.d, akg<dbc>>> $$0, dbl.b $$1) {
      this.a($$0, this.o, this.o, this.x, dbl.b.a(this.r[0], this.r[2]), $$1, 0.0F, dbj.O);
      this.a($$0, dbl.b.a(this.p[1], this.p[2]), this.o, dbl.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dbj.g);
      this.a($$0, dbl.b.a(this.p[3], this.p[4]), this.o, dbl.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dbj.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dbl.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dbl.b $$5 = this.q[$$4];
            akg<dbc> $$6 = this.a($$2, $$4, $$1);
            akg<dbc> $$7 = this.b($$2, $$4, $$1);
            akg<dbc> $$8 = this.c($$2, $$4, $$1);
            akg<dbc> $$9 = this.h($$2, $$4, $$1);
            akg<dbc> $$10 = this.e($$2, $$4, $$1);
            akg<dbc> $$11 = this.a($$2, $$4);
            akg<dbc> $$12 = this.a($$2, $$4, $$1, $$6);
            akg<dbc> $$13 = this.d($$2, $$4, $$1);
            akg<dbc> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dbl.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dbl.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dbl.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dbl.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dbl.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dbl.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dbl.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dbl.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dbl.d, akg<dbc>>> $$0, dbl.b $$1) {
      this.a($$0, this.o, this.o, this.x, dbl.b.a(this.r[0], this.r[2]), $$1, 0.0F, dbj.O);
      this.a($$0, dbl.b.a(this.p[1], this.p[2]), this.o, dbl.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dbj.g);
      this.a($$0, dbl.b.a(this.p[3], this.p[4]), this.o, dbl.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dbj.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dbl.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dbl.b $$5 = this.q[$$4];
            akg<dbc> $$6 = this.a($$2, $$4, $$1);
            akg<dbc> $$7 = this.b($$2, $$4, $$1);
            akg<dbc> $$8 = this.c($$2, $$4, $$1);
            akg<dbc> $$9 = this.a($$2, $$4);
            akg<dbc> $$10 = this.a($$2, $$4, $$1, $$6);
            akg<dbc> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dbl.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dbl.b.a(this.A, this.B), dbl.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dbl.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dbl.b.a(this.A, this.B), dbl.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dbl.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dbl.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dbl.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dbl.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dbl.d, akg<dbc>>> $$0, dbl.b $$1) {
      this.a($$0, this.s, this.o, this.x, dbl.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dbj.O : dbj.L);
      this.a($$0, this.t, this.o, this.x, dbl.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dbj.O : dbj.K);
      this.a($$0, this.s, this.o, this.z, dbl.b.a(this.r[0], this.r[1]), $$1, 0.0F, dbj.L);
      this.a($$0, this.t, this.o, this.z, dbl.b.a(this.r[0], this.r[1]), $$1, 0.0F, dbj.K);
      this.a($$0, this.s, this.o, dbl.b.a(this.x, this.B), dbl.b.a(this.r[2], this.r[5]), $$1, 0.0F, dbj.L);
      this.a($$0, this.t, this.o, dbl.b.a(this.x, this.B), dbl.b.a(this.r[2], this.r[5]), $$1, 0.0F, dbj.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dbj.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dbj.K);
      this.a($$0, dbl.b.a(this.p[1], this.p[2]), this.o, dbl.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dbj.g);
      this.a($$0, dbl.b.a(this.p[3], this.p[4]), this.o, dbl.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dbj.h);
      this.a($$0, this.s, this.o, dbl.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dbj.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dbl.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dbl.b $$5 = this.q[$$4];
            akg<dbc> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dbl.b.a(this.A, this.B), dbl.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dbl.d, akg<dbc>>> $$0) {
      this.b($$0, this.o, this.o, dbl.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dbj.Z);
      this.b($$0, this.o, dbl.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dbj.aa);
      this.c($$0, this.o, this.o, this.o, dbl.b.a(this.r[0], this.r[1]), this.o, 0.0F, dbj.ab);
   }

   private akg<dbc> a(int $$0, int $$1, dbl.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         akg<dbc> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private akg<dbc> b(int $$0, int $$1, dbl.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private akg<dbc> c(int $$0, int $$1, dbl.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private akg<dbc> a(int $$0, int $$1, dbl.b $$2, akg<dbc> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dbj.w : $$3;
   }

   private akg<dbc> d(int $$0, int $$1, dbl.b $$2) {
      akg<dbc> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private akg<dbc> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dbj.N;
      } else {
         return $$0 == 4 ? dbj.f : dbj.M;
      }
   }

   private akg<dbc> a(int $$0, dbl.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dbj.A : dbj.B;
      } else {
         return $$0 < 3 ? dbj.A : dbj.C;
      }
   }

   private akg<dbc> e(int $$0, int $$1, dbl.b $$2) {
      if ($$2.b() >= 0L) {
         akg<dbc> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private akg<dbc> f(int $$0, int $$1, dbl.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dbj.I : dbj.H;
      } else {
         return $$0 == 3 ? dbj.J : this.a($$1, $$2);
      }
   }

   private akg<dbc> g(int $$0, int $$1, dbl.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dbj.G : dbj.F;
      }
   }

   private akg<dbc> h(int $$0, int $$1, dbl.b $$2) {
      akg<dbc> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dbl.d, akg<dbc>>> $$0, dbl.b $$1, dbl.b $$2, dbl.b $$3, dbl.b $$4, dbl.b $$5, float $$6, akg<dbc> $$7) {
      $$0.accept(Pair.of(dbl.a($$1, $$2, $$3, $$4, dbl.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dbl.a($$1, $$2, $$3, $$4, dbl.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dbl.d, akg<dbc>>> $$0, dbl.b $$1, dbl.b $$2, dbl.b $$3, dbl.b $$4, dbl.b $$5, float $$6, akg<dbc> $$7) {
      $$0.accept(Pair.of(dbl.a($$1, $$2, $$3, $$4, dbl.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dbl.d, akg<dbc>>> $$0, dbl.b $$1, dbl.b $$2, dbl.b $$3, dbl.b $$4, dbl.b $$5, float $$6, akg<dbc> $$7) {
      $$0.accept(Pair.of(dbl.a($$1, $$2, $$3, $$4, dbl.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dvs $$0, dvs $$1, dvs.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dwg.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dwg.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dwg.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dwg.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dbl.a((float)$$0);
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

   private static String a(double $$0, dbl.b[] $$1) {
      double $$2 = (double)dbl.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @azc
   public dbl.b[] b() {
      return this.p;
   }

   @azc
   public dbl.b[] c() {
      return this.q;
   }

   @azc
   public dbl.b[] d() {
      return this.r;
   }

   @azc
   public dbl.b[] e() {
      return new dbl.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @azc
   public dbl.b[] f() {
      return new dbl.b[]{
         dbl.b.a(-2.0F, dwg.a(0.05F)),
         dbl.b.a(dwg.a(0.05F), dwg.a(0.26666668F)),
         dbl.b.a(dwg.a(0.26666668F), dwg.a(0.4F)),
         dbl.b.a(dwg.a(0.4F), dwg.a(0.56666666F)),
         dbl.b.a(dwg.a(0.56666666F), 2.0F)
      };
   }

   @azc
   public dbl.b[] g() {
      return new dbl.b[]{dbl.b.a(-2.0F, 0.0F), dbl.b.a(0.0F, 2.0F)};
   }
}
