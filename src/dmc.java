import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dmc {
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
   private final dlv.b o = dlv.b.a(-1.0F, 1.0F);
   private final dlv.b[] p = new dlv.b[]{dlv.b.a(-1.0F, -0.45F), dlv.b.a(-0.45F, -0.15F), dlv.b.a(-0.15F, 0.2F), dlv.b.a(0.2F, 0.55F), dlv.b.a(0.55F, 1.0F)};
   private final dlv.b[] q = new dlv.b[]{dlv.b.a(-1.0F, -0.35F), dlv.b.a(-0.35F, -0.1F), dlv.b.a(-0.1F, 0.1F), dlv.b.a(0.1F, 0.3F), dlv.b.a(0.3F, 1.0F)};
   private final dlv.b[] r = new dlv.b[]{
      dlv.b.a(-1.0F, -0.78F),
      dlv.b.a(-0.78F, -0.375F),
      dlv.b.a(-0.375F, -0.2225F),
      dlv.b.a(-0.2225F, 0.05F),
      dlv.b.a(0.05F, 0.45F),
      dlv.b.a(0.45F, 0.55F),
      dlv.b.a(0.55F, 1.0F)
   };
   private final dlv.b s = this.p[0];
   private final dlv.b t = dlv.b.a(this.p[1], this.p[4]);
   private final dlv.b u = dlv.b.a(-1.2F, -1.05F);
   private final dlv.b v = dlv.b.a(-1.05F, -0.455F);
   private final dlv.b w = dlv.b.a(-0.455F, -0.19F);
   private final dlv.b x = dlv.b.a(-0.19F, -0.11F);
   private final dlv.b y = dlv.b.a(-0.11F, 0.55F);
   private final dlv.b z = dlv.b.a(-0.11F, 0.03F);
   private final dlv.b A = dlv.b.a(0.03F, 0.3F);
   private final dlv.b B = dlv.b.a(0.3F, 1.0F);
   private final alq<dlm>[][] C = new alq[][]{{dlt.Y, dlt.W, dlt.U, dlt.S, dlt.Q}, {dlt.X, dlt.V, dlt.T, dlt.R, dlt.Q}};
   private final alq<dlm>[][] D = new alq[][]{
      {dlt.d, dlt.d, dlt.d, dlt.r, dlt.q},
      {dlt.b, dlt.b, dlt.i, dlt.q, dlt.p},
      {dlt.j, dlt.b, dlt.i, dlt.k, dlt.l},
      {dlt.s, dlt.s, dlt.i, dlt.y, dlt.y},
      {dlt.f, dlt.f, dlt.f, dlt.f, dlt.f}
   };
   private final alq<dlm>[][] E = new alq[][]{
      {dlt.e, null, dlt.r, null, null},
      {null, null, null, null, dlt.o},
      {dlt.c, null, null, dlt.n, null},
      {null, null, dlt.b, dlt.z, dlt.A},
      {null, null, null, null, null}
   };
   private final alq<dlm>[][] F = new alq[][]{
      {dlt.d, dlt.d, dlt.d, dlt.r, dlt.r},
      {dlt.E, dlt.E, dlt.i, dlt.q, dlt.p},
      {dlt.E, dlt.E, dlt.E, dlt.E, dlt.m},
      {dlt.t, dlt.t, dlt.i, dlt.i, dlt.y},
      {dlt.B, dlt.B, dlt.B, dlt.D, dlt.D}
   };
   private final alq<dlm>[][] G = new alq[][]{
      {dlt.e, null, null, null, null},
      {dlt.F, null, dlt.E, dlt.E, dlt.o},
      {dlt.F, dlt.F, dlt.i, dlt.k, null},
      {null, null, null, null, null},
      {dlt.C, dlt.C, null, null, null}
   };
   private final alq<dlm>[][] H = new alq[][]{
      {dlt.v, dlt.v, dlt.u, dlt.w, dlt.w},
      {dlt.v, dlt.v, dlt.u, dlt.w, dlt.w},
      {dlt.u, dlt.u, dlt.u, dlt.w, dlt.w},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dlv.d> a() {
      dlv.b $$0 = dlv.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dlv.d(this.o, this.o, dlv.b.a(this.y, this.o), this.o, $$0, dlv.b.a(-1.0F, -0.16F), 0L),
         new dlv.d(this.o, this.o, dlv.b.a(this.y, this.o), this.o, $$0, dlv.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dlv.d, alq<dlm>>> $$0) {
      if (ac.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dlv.d, alq<dlm>>> $$0) {
      ji.a $$1 = ox.a();
      jh<ehi> $$2 = $$1.e(mi.aO);
      ehj.w.a $$3 = new ehj.w.a($$2.b(ehw.d));
      ehj.w.a $$4 = new ehj.w.a($$2.b(ehw.e));
      ehj.w.a $$5 = new ehj.w.a($$2.b(ehw.g));
      $$0.accept(Pair.of(dlv.a(this.o, this.o, this.o, this.o, dlv.b.a(0.0F), this.o, 0.01F), dlt.b));
      if (qx.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, bbe.a) instanceof ayz.e<?, ?> $$7) {
         alq<dlm> $$8 = dlt.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dlv.a(this.o, this.o, this.o, dlv.b.a($$9), dlv.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dlt.f ? dlt.B : dlt.f;
         }
      }

      if (qx.a($$3, $$4, $$5, false) instanceof ayz.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dlv.a(this.o, this.o, dlv.b.a($$12), this.o, dlv.b.a(0.0F), this.o, 0.0F), dlt.r));
         }
      }
   }

   private void c(Consumer<Pair<dlv.d, alq<dlm>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dlt.Z);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dlv.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dlv.d, alq<dlm>>> $$0) {
      this.c($$0, dlv.b.a(-1.0F, -0.93333334F));
      this.b($$0, dlv.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dlv.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dlv.b.a(-0.56666666F, -0.4F));
      this.c($$0, dlv.b.a(-0.4F, -0.26666668F));
      this.d($$0, dlv.b.a(-0.26666668F, -0.05F));
      this.e($$0, dlv.b.a(-0.05F, 0.05F));
      this.d($$0, dlv.b.a(0.05F, 0.26666668F));
      this.c($$0, dlv.b.a(0.26666668F, 0.4F));
      this.b($$0, dlv.b.a(0.4F, 0.56666666F));
      this.a($$0, dlv.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dlv.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dlv.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dlv.d, alq<dlm>>> $$0, dlv.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dlv.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dlv.b $$5 = this.q[$$4];
            alq<dlm> $$6 = this.a($$2, $$4, $$1);
            alq<dlm> $$7 = this.b($$2, $$4, $$1);
            alq<dlm> $$8 = this.c($$2, $$4, $$1);
            alq<dlm> $$9 = this.e($$2, $$4, $$1);
            alq<dlm> $$10 = this.h($$2, $$4, $$1);
            alq<dlm> $$11 = this.a($$2, $$4, $$1, $$10);
            alq<dlm> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dlv.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dlv.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dlv.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dlv.b.a(this.x, this.z), dlv.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dlv.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dlv.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dlv.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dlv.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dlv.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dlv.d, alq<dlm>>> $$0, dlv.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dlv.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dlv.b $$5 = this.q[$$4];
            alq<dlm> $$6 = this.a($$2, $$4, $$1);
            alq<dlm> $$7 = this.b($$2, $$4, $$1);
            alq<dlm> $$8 = this.c($$2, $$4, $$1);
            alq<dlm> $$9 = this.e($$2, $$4, $$1);
            alq<dlm> $$10 = this.h($$2, $$4, $$1);
            alq<dlm> $$11 = this.a($$2, $$4, $$1, $$6);
            alq<dlm> $$12 = this.g($$2, $$4, $$1);
            alq<dlm> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dlv.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dlv.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dlv.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dlv.b.a(this.x, this.z), dlv.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dlv.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dlv.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dlv.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dlv.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dlv.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dlv.d, alq<dlm>>> $$0, dlv.b $$1) {
      this.a($$0, this.o, this.o, this.x, dlv.b.a(this.r[0], this.r[2]), $$1, 0.0F, dlt.P);
      this.a($$0, dlv.b.a(this.p[1], this.p[2]), this.o, dlv.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dlt.g);
      this.a($$0, dlv.b.a(this.p[3], this.p[4]), this.o, dlv.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dlt.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dlv.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dlv.b $$5 = this.q[$$4];
            alq<dlm> $$6 = this.a($$2, $$4, $$1);
            alq<dlm> $$7 = this.b($$2, $$4, $$1);
            alq<dlm> $$8 = this.c($$2, $$4, $$1);
            alq<dlm> $$9 = this.h($$2, $$4, $$1);
            alq<dlm> $$10 = this.e($$2, $$4, $$1);
            alq<dlm> $$11 = this.a($$2, $$4);
            alq<dlm> $$12 = this.a($$2, $$4, $$1, $$6);
            alq<dlm> $$13 = this.d($$2, $$4, $$1);
            alq<dlm> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dlv.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dlv.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dlv.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dlv.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dlv.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dlv.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dlv.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dlv.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dlv.d, alq<dlm>>> $$0, dlv.b $$1) {
      this.a($$0, this.o, this.o, this.x, dlv.b.a(this.r[0], this.r[2]), $$1, 0.0F, dlt.P);
      this.a($$0, dlv.b.a(this.p[1], this.p[2]), this.o, dlv.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dlt.g);
      this.a($$0, dlv.b.a(this.p[3], this.p[4]), this.o, dlv.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dlt.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dlv.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dlv.b $$5 = this.q[$$4];
            alq<dlm> $$6 = this.a($$2, $$4, $$1);
            alq<dlm> $$7 = this.b($$2, $$4, $$1);
            alq<dlm> $$8 = this.c($$2, $$4, $$1);
            alq<dlm> $$9 = this.a($$2, $$4);
            alq<dlm> $$10 = this.a($$2, $$4, $$1, $$6);
            alq<dlm> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dlv.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dlv.b.a(this.A, this.B), dlv.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dlv.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dlv.b.a(this.A, this.B), dlv.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dlv.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dlv.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dlv.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dlv.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dlv.d, alq<dlm>>> $$0, dlv.b $$1) {
      this.a($$0, this.s, this.o, this.x, dlv.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dlt.P : dlt.M);
      this.a($$0, this.t, this.o, this.x, dlv.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dlt.P : dlt.L);
      this.a($$0, this.s, this.o, this.z, dlv.b.a(this.r[0], this.r[1]), $$1, 0.0F, dlt.M);
      this.a($$0, this.t, this.o, this.z, dlv.b.a(this.r[0], this.r[1]), $$1, 0.0F, dlt.L);
      this.a($$0, this.s, this.o, dlv.b.a(this.x, this.B), dlv.b.a(this.r[2], this.r[5]), $$1, 0.0F, dlt.M);
      this.a($$0, this.t, this.o, dlv.b.a(this.x, this.B), dlv.b.a(this.r[2], this.r[5]), $$1, 0.0F, dlt.L);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dlt.M);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dlt.L);
      this.a($$0, dlv.b.a(this.p[1], this.p[2]), this.o, dlv.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dlt.g);
      this.a($$0, dlv.b.a(this.p[3], this.p[4]), this.o, dlv.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dlt.h);
      this.a($$0, this.s, this.o, dlv.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dlt.M);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dlv.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dlv.b $$5 = this.q[$$4];
            alq<dlm> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dlv.b.a(this.A, this.B), dlv.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dlv.d, alq<dlm>>> $$0) {
      this.b($$0, this.o, this.o, dlv.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dlt.aa);
      this.b($$0, this.o, dlv.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dlt.ab);
      this.c($$0, this.o, this.o, this.o, dlv.b.a(this.r[0], this.r[1]), this.o, 0.0F, dlt.ac);
   }

   private alq<dlm> a(int $$0, int $$1, dlv.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         alq<dlm> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private alq<dlm> b(int $$0, int $$1, dlv.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private alq<dlm> c(int $$0, int $$1, dlv.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private alq<dlm> a(int $$0, int $$1, dlv.b $$2, alq<dlm> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dlt.x : $$3;
   }

   private alq<dlm> d(int $$0, int $$1, dlv.b $$2) {
      alq<dlm> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private alq<dlm> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dlt.O;
      } else {
         return $$0 == 4 ? dlt.f : dlt.N;
      }
   }

   private alq<dlm> a(int $$0, dlv.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dlt.B : dlt.C;
      } else {
         return $$0 < 3 ? dlt.B : dlt.D;
      }
   }

   private alq<dlm> e(int $$0, int $$1, dlv.b $$2) {
      if ($$2.b() >= 0L) {
         alq<dlm> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private alq<dlm> f(int $$0, int $$1, dlv.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dlt.J : dlt.I;
      } else {
         return $$0 == 3 ? dlt.K : this.a($$1, $$2);
      }
   }

   private alq<dlm> g(int $$0, int $$1, dlv.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dlt.H : dlt.G;
      }
   }

   private alq<dlm> h(int $$0, int $$1, dlv.b $$2) {
      alq<dlm> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dlv.d, alq<dlm>>> $$0, dlv.b $$1, dlv.b $$2, dlv.b $$3, dlv.b $$4, dlv.b $$5, float $$6, alq<dlm> $$7) {
      $$0.accept(Pair.of(dlv.a($$1, $$2, $$3, $$4, dlv.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dlv.a($$1, $$2, $$3, $$4, dlv.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dlv.d, alq<dlm>>> $$0, dlv.b $$1, dlv.b $$2, dlv.b $$3, dlv.b $$4, dlv.b $$5, float $$6, alq<dlm> $$7) {
      $$0.accept(Pair.of(dlv.a($$1, $$2, $$3, $$4, dlv.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dlv.d, alq<dlm>>> $$0, dlv.b $$1, dlv.b $$2, dlv.b $$3, dlv.b $$4, dlv.b $$5, float $$6, alq<dlm> $$7) {
      $$0.accept(Pair.of(dlv.a($$1, $$2, $$3, $$4, dlv.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(ehi $$0, ehi $$1, ehi.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)ehw.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)ehw.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)ehw.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)ehw.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dlv.a((float)$$0);
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

   private static String a(double $$0, dlv.b[] $$1) {
      double $$2 = (double)dlv.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bbi
   public dlv.b[] b() {
      return this.p;
   }

   @bbi
   public dlv.b[] c() {
      return this.q;
   }

   @bbi
   public dlv.b[] d() {
      return this.r;
   }

   @bbi
   public dlv.b[] e() {
      return new dlv.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @bbi
   public dlv.b[] f() {
      return new dlv.b[]{
         dlv.b.a(-2.0F, ehw.a(0.05F)),
         dlv.b.a(ehw.a(0.05F), ehw.a(0.26666668F)),
         dlv.b.a(ehw.a(0.26666668F), ehw.a(0.4F)),
         dlv.b.a(ehw.a(0.4F), ehw.a(0.56666666F)),
         dlv.b.a(ehw.a(0.56666666F), 2.0F)
      };
   }

   @bbi
   public dlv.b[] g() {
      return new dlv.b[]{dlv.b.a(-2.0F, 0.0F), dlv.b.a(0.0F, 2.0F)};
   }
}
