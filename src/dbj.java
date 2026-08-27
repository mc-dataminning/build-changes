import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dbj {
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
   private final dbc.b o = dbc.b.a(-1.0F, 1.0F);
   private final dbc.b[] p = new dbc.b[]{dbc.b.a(-1.0F, -0.45F), dbc.b.a(-0.45F, -0.15F), dbc.b.a(-0.15F, 0.2F), dbc.b.a(0.2F, 0.55F), dbc.b.a(0.55F, 1.0F)};
   private final dbc.b[] q = new dbc.b[]{dbc.b.a(-1.0F, -0.35F), dbc.b.a(-0.35F, -0.1F), dbc.b.a(-0.1F, 0.1F), dbc.b.a(0.1F, 0.3F), dbc.b.a(0.3F, 1.0F)};
   private final dbc.b[] r = new dbc.b[]{
      dbc.b.a(-1.0F, -0.78F),
      dbc.b.a(-0.78F, -0.375F),
      dbc.b.a(-0.375F, -0.2225F),
      dbc.b.a(-0.2225F, 0.05F),
      dbc.b.a(0.05F, 0.45F),
      dbc.b.a(0.45F, 0.55F),
      dbc.b.a(0.55F, 1.0F)
   };
   private final dbc.b s = this.p[0];
   private final dbc.b t = dbc.b.a(this.p[1], this.p[4]);
   private final dbc.b u = dbc.b.a(-1.2F, -1.05F);
   private final dbc.b v = dbc.b.a(-1.05F, -0.455F);
   private final dbc.b w = dbc.b.a(-0.455F, -0.19F);
   private final dbc.b x = dbc.b.a(-0.19F, -0.11F);
   private final dbc.b y = dbc.b.a(-0.11F, 0.55F);
   private final dbc.b z = dbc.b.a(-0.11F, 0.03F);
   private final dbc.b A = dbc.b.a(0.03F, 0.3F);
   private final dbc.b B = dbc.b.a(0.3F, 1.0F);
   private final ake<dat>[][] C = new ake[][]{{dba.X, dba.V, dba.T, dba.R, dba.P}, {dba.W, dba.U, dba.S, dba.Q, dba.P}};
   private final ake<dat>[][] D = new ake[][]{
      {dba.d, dba.d, dba.d, dba.q, dba.p},
      {dba.b, dba.b, dba.i, dba.p, dba.o},
      {dba.j, dba.b, dba.i, dba.k, dba.l},
      {dba.r, dba.r, dba.i, dba.x, dba.x},
      {dba.f, dba.f, dba.f, dba.f, dba.f}
   };
   private final ake<dat>[][] E = new ake[][]{
      {dba.e, null, dba.q, null, null},
      {null, null, null, null, dba.n},
      {dba.c, null, null, dba.m, null},
      {null, null, dba.b, dba.y, dba.z},
      {null, null, null, null, null}
   };
   private final ake<dat>[][] F = new ake[][]{
      {dba.d, dba.d, dba.d, dba.q, dba.q},
      {dba.D, dba.D, dba.i, dba.p, dba.o},
      {dba.D, dba.D, dba.D, dba.D, dba.l},
      {dba.s, dba.s, dba.i, dba.i, dba.x},
      {dba.A, dba.A, dba.A, dba.C, dba.C}
   };
   private final ake<dat>[][] G = new ake[][]{
      {dba.e, null, null, null, null},
      {dba.E, null, dba.D, dba.D, dba.n},
      {dba.E, dba.E, dba.i, dba.k, null},
      {null, null, null, null, null},
      {dba.B, dba.B, null, null, null}
   };
   private final ake<dat>[][] H = new ake[][]{
      {dba.u, dba.u, dba.t, dba.v, dba.v},
      {dba.u, dba.u, dba.t, dba.v, dba.v},
      {dba.t, dba.t, dba.t, dba.v, dba.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dbc.d> a() {
      dbc.b $$0 = dbc.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dbc.d(this.o, this.o, dbc.b.a(this.y, this.o), this.o, $$0, dbc.b.a(-1.0F, -0.16F), 0L),
         new dbc.d(this.o, this.o, dbc.b.a(this.y, this.o), this.o, $$0, dbc.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dbc.d, ake<dat>>> $$0) {
      if (aa.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dbc.d, ake<dat>>> $$0) {
      ix.a $$1 = os.a();
      iw<dvj> $$2 = $$1.b(ld.aC);
      dvk.w.a $$3 = new dvk.w.a($$2.b(dvx.d));
      dvk.w.a $$4 = new dvk.w.a($$2.b(dvx.e));
      dvk.w.a $$5 = new dvk.w.a($$2.b(dvx.g));
      $$0.accept(Pair.of(dbc.a(this.o, this.o, this.o, this.o, dbc.b.a(0.0F), this.o, 0.01F), dba.b));
      if (qy.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, ayw.a) instanceof awy.e<?, ?> $$7) {
         ake<dat> $$8 = dba.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dbc.a(this.o, this.o, this.o, dbc.b.a($$9), dbc.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dba.f ? dba.A : dba.f;
         }
      }

      if (qy.a($$3, $$4, $$5, false) instanceof awy.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dbc.a(this.o, this.o, dbc.b.a($$12), this.o, dbc.b.a(0.0F), this.o, 0.0F), dba.q));
         }
      }
   }

   private void c(Consumer<Pair<dbc.d, ake<dat>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dba.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dbc.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dbc.d, ake<dat>>> $$0) {
      this.c($$0, dbc.b.a(-1.0F, -0.93333334F));
      this.b($$0, dbc.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dbc.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dbc.b.a(-0.56666666F, -0.4F));
      this.c($$0, dbc.b.a(-0.4F, -0.26666668F));
      this.d($$0, dbc.b.a(-0.26666668F, -0.05F));
      this.e($$0, dbc.b.a(-0.05F, 0.05F));
      this.d($$0, dbc.b.a(0.05F, 0.26666668F));
      this.c($$0, dbc.b.a(0.26666668F, 0.4F));
      this.b($$0, dbc.b.a(0.4F, 0.56666666F));
      this.a($$0, dbc.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dbc.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dbc.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dbc.d, ake<dat>>> $$0, dbc.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dbc.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dbc.b $$5 = this.q[$$4];
            ake<dat> $$6 = this.a($$2, $$4, $$1);
            ake<dat> $$7 = this.b($$2, $$4, $$1);
            ake<dat> $$8 = this.c($$2, $$4, $$1);
            ake<dat> $$9 = this.e($$2, $$4, $$1);
            ake<dat> $$10 = this.h($$2, $$4, $$1);
            ake<dat> $$11 = this.a($$2, $$4, $$1, $$10);
            ake<dat> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dbc.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dbc.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dbc.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dbc.b.a(this.x, this.z), dbc.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dbc.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dbc.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dbc.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dbc.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dbc.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dbc.d, ake<dat>>> $$0, dbc.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dbc.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dbc.b $$5 = this.q[$$4];
            ake<dat> $$6 = this.a($$2, $$4, $$1);
            ake<dat> $$7 = this.b($$2, $$4, $$1);
            ake<dat> $$8 = this.c($$2, $$4, $$1);
            ake<dat> $$9 = this.e($$2, $$4, $$1);
            ake<dat> $$10 = this.h($$2, $$4, $$1);
            ake<dat> $$11 = this.a($$2, $$4, $$1, $$6);
            ake<dat> $$12 = this.g($$2, $$4, $$1);
            ake<dat> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dbc.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dbc.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dbc.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dbc.b.a(this.x, this.z), dbc.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dbc.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dbc.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dbc.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dbc.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dbc.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dbc.d, ake<dat>>> $$0, dbc.b $$1) {
      this.a($$0, this.o, this.o, this.x, dbc.b.a(this.r[0], this.r[2]), $$1, 0.0F, dba.O);
      this.a($$0, dbc.b.a(this.p[1], this.p[2]), this.o, dbc.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dba.g);
      this.a($$0, dbc.b.a(this.p[3], this.p[4]), this.o, dbc.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dba.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dbc.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dbc.b $$5 = this.q[$$4];
            ake<dat> $$6 = this.a($$2, $$4, $$1);
            ake<dat> $$7 = this.b($$2, $$4, $$1);
            ake<dat> $$8 = this.c($$2, $$4, $$1);
            ake<dat> $$9 = this.h($$2, $$4, $$1);
            ake<dat> $$10 = this.e($$2, $$4, $$1);
            ake<dat> $$11 = this.a($$2, $$4);
            ake<dat> $$12 = this.a($$2, $$4, $$1, $$6);
            ake<dat> $$13 = this.d($$2, $$4, $$1);
            ake<dat> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dbc.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dbc.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dbc.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dbc.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dbc.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dbc.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dbc.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dbc.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dbc.d, ake<dat>>> $$0, dbc.b $$1) {
      this.a($$0, this.o, this.o, this.x, dbc.b.a(this.r[0], this.r[2]), $$1, 0.0F, dba.O);
      this.a($$0, dbc.b.a(this.p[1], this.p[2]), this.o, dbc.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dba.g);
      this.a($$0, dbc.b.a(this.p[3], this.p[4]), this.o, dbc.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dba.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dbc.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dbc.b $$5 = this.q[$$4];
            ake<dat> $$6 = this.a($$2, $$4, $$1);
            ake<dat> $$7 = this.b($$2, $$4, $$1);
            ake<dat> $$8 = this.c($$2, $$4, $$1);
            ake<dat> $$9 = this.a($$2, $$4);
            ake<dat> $$10 = this.a($$2, $$4, $$1, $$6);
            ake<dat> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dbc.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dbc.b.a(this.A, this.B), dbc.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dbc.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dbc.b.a(this.A, this.B), dbc.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dbc.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dbc.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dbc.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dbc.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dbc.d, ake<dat>>> $$0, dbc.b $$1) {
      this.a($$0, this.s, this.o, this.x, dbc.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dba.O : dba.L);
      this.a($$0, this.t, this.o, this.x, dbc.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dba.O : dba.K);
      this.a($$0, this.s, this.o, this.z, dbc.b.a(this.r[0], this.r[1]), $$1, 0.0F, dba.L);
      this.a($$0, this.t, this.o, this.z, dbc.b.a(this.r[0], this.r[1]), $$1, 0.0F, dba.K);
      this.a($$0, this.s, this.o, dbc.b.a(this.x, this.B), dbc.b.a(this.r[2], this.r[5]), $$1, 0.0F, dba.L);
      this.a($$0, this.t, this.o, dbc.b.a(this.x, this.B), dbc.b.a(this.r[2], this.r[5]), $$1, 0.0F, dba.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dba.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dba.K);
      this.a($$0, dbc.b.a(this.p[1], this.p[2]), this.o, dbc.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dba.g);
      this.a($$0, dbc.b.a(this.p[3], this.p[4]), this.o, dbc.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dba.h);
      this.a($$0, this.s, this.o, dbc.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dba.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dbc.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dbc.b $$5 = this.q[$$4];
            ake<dat> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dbc.b.a(this.A, this.B), dbc.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dbc.d, ake<dat>>> $$0) {
      this.b($$0, this.o, this.o, dbc.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dba.Z);
      this.b($$0, this.o, dbc.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dba.aa);
      this.c($$0, this.o, this.o, this.o, dbc.b.a(this.r[0], this.r[1]), this.o, 0.0F, dba.ab);
   }

   private ake<dat> a(int $$0, int $$1, dbc.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         ake<dat> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private ake<dat> b(int $$0, int $$1, dbc.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private ake<dat> c(int $$0, int $$1, dbc.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private ake<dat> a(int $$0, int $$1, dbc.b $$2, ake<dat> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dba.w : $$3;
   }

   private ake<dat> d(int $$0, int $$1, dbc.b $$2) {
      ake<dat> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private ake<dat> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dba.N;
      } else {
         return $$0 == 4 ? dba.f : dba.M;
      }
   }

   private ake<dat> a(int $$0, dbc.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dba.A : dba.B;
      } else {
         return $$0 < 3 ? dba.A : dba.C;
      }
   }

   private ake<dat> e(int $$0, int $$1, dbc.b $$2) {
      if ($$2.b() >= 0L) {
         ake<dat> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private ake<dat> f(int $$0, int $$1, dbc.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dba.I : dba.H;
      } else {
         return $$0 == 3 ? dba.J : this.a($$1, $$2);
      }
   }

   private ake<dat> g(int $$0, int $$1, dbc.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dba.G : dba.F;
      }
   }

   private ake<dat> h(int $$0, int $$1, dbc.b $$2) {
      ake<dat> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dbc.d, ake<dat>>> $$0, dbc.b $$1, dbc.b $$2, dbc.b $$3, dbc.b $$4, dbc.b $$5, float $$6, ake<dat> $$7) {
      $$0.accept(Pair.of(dbc.a($$1, $$2, $$3, $$4, dbc.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dbc.a($$1, $$2, $$3, $$4, dbc.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dbc.d, ake<dat>>> $$0, dbc.b $$1, dbc.b $$2, dbc.b $$3, dbc.b $$4, dbc.b $$5, float $$6, ake<dat> $$7) {
      $$0.accept(Pair.of(dbc.a($$1, $$2, $$3, $$4, dbc.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dbc.d, ake<dat>>> $$0, dbc.b $$1, dbc.b $$2, dbc.b $$3, dbc.b $$4, dbc.b $$5, float $$6, ake<dat> $$7) {
      $$0.accept(Pair.of(dbc.a($$1, $$2, $$3, $$4, dbc.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dvj $$0, dvj $$1, dvj.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dvx.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dvx.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dvx.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dvx.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dbc.a((float)$$0);
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

   private static String a(double $$0, dbc.b[] $$1) {
      double $$2 = (double)dbc.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @ayz
   public dbc.b[] b() {
      return this.p;
   }

   @ayz
   public dbc.b[] c() {
      return this.q;
   }

   @ayz
   public dbc.b[] d() {
      return this.r;
   }

   @ayz
   public dbc.b[] e() {
      return new dbc.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @ayz
   public dbc.b[] f() {
      return new dbc.b[]{
         dbc.b.a(-2.0F, dvx.a(0.05F)),
         dbc.b.a(dvx.a(0.05F), dvx.a(0.26666668F)),
         dbc.b.a(dvx.a(0.26666668F), dvx.a(0.4F)),
         dbc.b.a(dvx.a(0.4F), dvx.a(0.56666666F)),
         dbc.b.a(dvx.a(0.56666666F), 2.0F)
      };
   }

   @ayz
   public dbc.b[] g() {
      return new dbc.b[]{dbc.b.a(-2.0F, 0.0F), dbc.b.a(0.0F, 2.0F)};
   }
}
