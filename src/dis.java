import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dis {
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
   private final dis.a o;
   private final dil.b p = dil.b.a(-1.0F, 1.0F);
   private final dil.b[] q = new dil.b[]{dil.b.a(-1.0F, -0.45F), dil.b.a(-0.45F, -0.15F), dil.b.a(-0.15F, 0.2F), dil.b.a(0.2F, 0.55F), dil.b.a(0.55F, 1.0F)};
   private final dil.b[] r = new dil.b[]{dil.b.a(-1.0F, -0.35F), dil.b.a(-0.35F, -0.1F), dil.b.a(-0.1F, 0.1F), dil.b.a(0.1F, 0.3F), dil.b.a(0.3F, 1.0F)};
   private final dil.b[] s = new dil.b[]{
      dil.b.a(-1.0F, -0.78F),
      dil.b.a(-0.78F, -0.375F),
      dil.b.a(-0.375F, -0.2225F),
      dil.b.a(-0.2225F, 0.05F),
      dil.b.a(0.05F, 0.45F),
      dil.b.a(0.45F, 0.55F),
      dil.b.a(0.55F, 1.0F)
   };
   private final dil.b t = this.q[0];
   private final dil.b u = dil.b.a(this.q[1], this.q[4]);
   private final dil.b v = dil.b.a(-1.2F, -1.05F);
   private final dil.b w = dil.b.a(-1.05F, -0.455F);
   private final dil.b x = dil.b.a(-0.455F, -0.19F);
   private final dil.b y = dil.b.a(-0.19F, -0.11F);
   private final dil.b z = dil.b.a(-0.11F, 0.55F);
   private final dil.b A = dil.b.a(-0.11F, 0.03F);
   private final dil.b B = dil.b.a(0.03F, 0.3F);
   private final dil.b C = dil.b.a(0.3F, 1.0F);
   private final aly<dic>[][] D = new aly[][]{{dij.X, dij.V, dij.T, dij.R, dij.P}, {dij.W, dij.U, dij.S, dij.Q, dij.P}};
   private final aly<dic>[][] E = new aly[][]{
      {dij.d, dij.d, dij.d, dij.q, dij.p},
      {dij.b, dij.b, dij.i, dij.p, dij.o},
      {dij.j, dij.b, dij.i, dij.k, dij.l},
      {dij.r, dij.r, dij.i, dij.x, dij.x},
      {dij.f, dij.f, dij.f, dij.f, dij.f}
   };
   private final aly<dic>[][] F = new aly[][]{
      {dij.e, null, dij.q, null, null},
      {null, null, null, null, dij.n},
      {dij.c, null, null, dij.m, null},
      {null, null, dij.b, dij.y, dij.z},
      {null, null, null, null, null}
   };
   private final aly<dic>[][] G = new aly[][]{
      {dij.d, dij.d, dij.d, dij.q, dij.q},
      {dij.D, dij.D, dij.i, dij.p, dij.o},
      {dij.D, dij.D, dij.D, dij.D, dij.l},
      {dij.s, dij.s, dij.i, dij.i, dij.x},
      {dij.A, dij.A, dij.A, dij.C, dij.C}
   };
   private final aly<dic>[][] H = new aly[][]{
      {dij.e, null, null, null, null},
      {dij.E, null, dij.D, dij.D, dij.n},
      {dij.E, dij.E, dij.i, dij.k, null},
      {null, null, null, null, null},
      {dij.B, dij.B, null, null, null}
   };
   private final aly<dic>[][] I = new aly[][]{
      {dij.e, null, null, null, null},
      {dij.E, null, dij.D, dij.D, dij.n},
      {dij.E, dij.E, dij.i, dij.k, sd.a},
      {null, null, null, null, null},
      {dij.B, dij.B, null, null, null}
   };
   private final aly<dic>[][] J = new aly[][]{
      {dij.u, dij.u, dij.t, dij.v, dij.v},
      {dij.u, dij.u, dij.t, dij.v, dij.v},
      {dij.t, dij.t, dij.t, dij.v, dij.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public dis() {
      this(dis.a.a);
   }

   public dis(dis.a $$0) {
      this.o = $$0;
   }

   public List<dil.d> a() {
      dil.b $$0 = dil.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dil.d(this.p, this.p, dil.b.a(this.z, this.p), this.p, $$0, dil.b.a(-1.0F, -0.16F), 0L),
         new dil.d(this.p, this.p, dil.b.a(this.z, this.p), this.p, $$0, dil.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dil.d, aly<dic>>> $$0) {
      if (ab.ar) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dil.d, aly<dic>>> $$0) {
      js.a $$1 = ps.a();
      jr<edb> $$2 = $$1.d(mb.aL);
      edc.w.a $$3 = new edc.w.a($$2.b(edp.d));
      edc.w.a $$4 = new edc.w.a($$2.b(edp.e));
      edc.w.a $$5 = new edc.w.a($$2.b(edp.g));
      $$0.accept(Pair.of(dil.a(this.p, this.p, this.p, this.p, dil.b.a(0.0F), this.p, 0.01F), dij.b));
      if (rz.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, bbh.a) instanceof azg.e<?, ?> $$7) {
         aly<dic> $$8 = dij.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dil.a(this.p, this.p, this.p, dil.b.a($$9), dil.b.a(0.0F), this.p, 0.0F), $$8));
            $$8 = $$8 == dij.f ? dij.A : dij.f;
         }
      }

      if (rz.a($$3, $$4, $$5, false) instanceof azg.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dil.a(this.p, this.p, dil.b.a($$12), this.p, dil.b.a(0.0F), this.p, 0.0F), dij.q));
         }
      }
   }

   private void c(Consumer<Pair<dil.d, aly<dic>>> $$0) {
      this.a($$0, this.p, this.p, this.v, this.p, this.p, 0.0F, dij.Y);

      for (int $$1 = 0; $$1 < this.q.length; $$1++) {
         dil.b $$2 = this.q[$$1];
         this.a($$0, $$2, this.p, this.w, this.p, this.p, 0.0F, this.D[0][$$1]);
         this.a($$0, $$2, this.p, this.x, this.p, this.p, 0.0F, this.D[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dil.d, aly<dic>>> $$0) {
      this.c($$0, dil.b.a(-1.0F, -0.93333334F));
      this.b($$0, dil.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dil.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dil.b.a(-0.56666666F, -0.4F));
      this.c($$0, dil.b.a(-0.4F, -0.26666668F));
      this.d($$0, dil.b.a(-0.26666668F, -0.05F));
      this.e($$0, dil.b.a(-0.05F, 0.05F));
      this.d($$0, dil.b.a(0.05F, 0.26666668F));
      this.c($$0, dil.b.a(0.26666668F, 0.4F));
      this.b($$0, dil.b.a(0.4F, 0.56666666F));
      this.a($$0, dil.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dil.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dil.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dil.d, aly<dic>>> $$0, dil.b $$1) {
      for (int $$2 = 0; $$2 < this.q.length; $$2++) {
         dil.b $$3 = this.q[$$2];

         for (int $$4 = 0; $$4 < this.r.length; $$4++) {
            dil.b $$5 = this.r[$$4];
            aly<dic> $$6 = this.a($$2, $$4, $$1);
            aly<dic> $$7 = this.b($$2, $$4, $$1);
            aly<dic> $$8 = this.c($$2, $$4, $$1);
            aly<dic> $$9 = this.e($$2, $$4, $$1);
            aly<dic> $$10 = this.h($$2, $$4, $$1);
            aly<dic> $$11 = this.a($$2, $$4, $$1, $$10);
            aly<dic> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dil.b.a(this.y, this.C), this.s[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dil.b.a(this.y, this.A), this.s[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dil.b.a(this.B, this.C), this.s[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dil.b.a(this.y, this.A), dil.b.a(this.s[2], this.s[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dil.b.a(this.B, this.C), this.s[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.B, this.s[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.C, this.s[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dil.b.a(this.y, this.C), this.s[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dil.b.a(this.y, this.A), this.s[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dil.b.a(this.B, this.C), this.s[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dil.b.a(this.y, this.C), this.s[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dil.d, aly<dic>>> $$0, dil.b $$1) {
      for (int $$2 = 0; $$2 < this.q.length; $$2++) {
         dil.b $$3 = this.q[$$2];

         for (int $$4 = 0; $$4 < this.r.length; $$4++) {
            dil.b $$5 = this.r[$$4];
            aly<dic> $$6 = this.a($$2, $$4, $$1);
            aly<dic> $$7 = this.b($$2, $$4, $$1);
            aly<dic> $$8 = this.c($$2, $$4, $$1);
            aly<dic> $$9 = this.e($$2, $$4, $$1);
            aly<dic> $$10 = this.h($$2, $$4, $$1);
            aly<dic> $$11 = this.a($$2, $$4, $$1, $$6);
            aly<dic> $$12 = this.g($$2, $$4, $$1);
            aly<dic> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.y, dil.b.a(this.s[0], this.s[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.s[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dil.b.a(this.B, this.C), this.s[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.A, this.s[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dil.b.a(this.B, this.C), this.s[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dil.b.a(this.y, this.A), dil.b.a(this.s[2], this.s[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dil.b.a(this.B, this.C), this.s[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.B, this.s[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.C, this.s[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dil.b.a(this.y, this.C), this.s[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dil.b.a(this.y, this.A), this.s[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dil.b.a(this.B, this.C), this.s[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dil.b.a(this.y, this.C), this.s[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dil.d, aly<dic>>> $$0, dil.b $$1) {
      this.a($$0, this.p, this.p, this.y, dil.b.a(this.s[0], this.s[2]), $$1, 0.0F, dij.O);
      this.a($$0, dil.b.a(this.q[1], this.q[2]), this.p, dil.b.a(this.A, this.C), this.s[6], $$1, 0.0F, dij.g);
      this.a($$0, dil.b.a(this.q[3], this.q[4]), this.p, dil.b.a(this.A, this.C), this.s[6], $$1, 0.0F, dij.h);

      for (int $$2 = 0; $$2 < this.q.length; $$2++) {
         dil.b $$3 = this.q[$$2];

         for (int $$4 = 0; $$4 < this.r.length; $$4++) {
            dil.b $$5 = this.r[$$4];
            aly<dic> $$6 = this.a($$2, $$4, $$1);
            aly<dic> $$7 = this.b($$2, $$4, $$1);
            aly<dic> $$8 = this.c($$2, $$4, $$1);
            aly<dic> $$9 = this.h($$2, $$4, $$1);
            aly<dic> $$10 = this.e($$2, $$4, $$1);
            aly<dic> $$11 = this.a($$2, $$4);
            aly<dic> $$12 = this.a($$2, $$4, $$1, $$6);
            aly<dic> $$13 = this.d($$2, $$4, $$1);
            aly<dic> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dil.b.a(this.A, this.C), this.s[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dil.b.a(this.A, this.B), this.s[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.C, this.s[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.A, this.s[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.B, this.s[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.C, this.s[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dil.b.a(this.y, this.A), this.s[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dil.b.a(this.B, this.C), this.s[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.y, this.s[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dil.b.a(this.A, this.C), this.s[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dil.b.a(this.y, this.C), this.s[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.y, this.s[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.A, this.s[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dil.b.a(this.B, this.C), this.s[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.y, this.s[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.y, this.s[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dil.b.a(this.A, this.C), this.s[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dil.d, aly<dic>>> $$0, dil.b $$1) {
      this.a($$0, this.p, this.p, this.y, dil.b.a(this.s[0], this.s[2]), $$1, 0.0F, dij.O);
      this.a($$0, dil.b.a(this.q[1], this.q[2]), this.p, dil.b.a(this.A, this.C), this.s[6], $$1, 0.0F, dij.g);
      this.a($$0, dil.b.a(this.q[3], this.q[4]), this.p, dil.b.a(this.A, this.C), this.s[6], $$1, 0.0F, dij.h);

      for (int $$2 = 0; $$2 < this.q.length; $$2++) {
         dil.b $$3 = this.q[$$2];

         for (int $$4 = 0; $$4 < this.r.length; $$4++) {
            dil.b $$5 = this.r[$$4];
            aly<dic> $$6 = this.a($$2, $$4, $$1);
            aly<dic> $$7 = this.b($$2, $$4, $$1);
            aly<dic> $$8 = this.c($$2, $$4, $$1);
            aly<dic> $$9 = this.a($$2, $$4);
            aly<dic> $$10 = this.a($$2, $$4, $$1, $$6);
            aly<dic> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.A, dil.b.a(this.s[0], this.s[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dil.b.a(this.B, this.C), dil.b.a(this.s[0], this.s[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.A, dil.b.a(this.s[2], this.s[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dil.b.a(this.B, this.C), dil.b.a(this.s[2], this.s[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.y, dil.b.a(this.s[3], this.s[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dil.b.a(this.A, this.C), this.s[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.y, this.s[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.A, this.s[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dil.b.a(this.B, this.C), this.s[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.y, this.s[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dil.b.a(this.A, this.C), this.s[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dil.d, aly<dic>>> $$0, dil.b $$1) {
      this.a($$0, this.t, this.p, this.y, dil.b.a(this.s[0], this.s[1]), $$1, 0.0F, $$1.b() < 0L ? dij.O : dij.L);
      this.a($$0, this.u, this.p, this.y, dil.b.a(this.s[0], this.s[1]), $$1, 0.0F, $$1.b() < 0L ? dij.O : dij.K);
      this.a($$0, this.t, this.p, this.A, dil.b.a(this.s[0], this.s[1]), $$1, 0.0F, dij.L);
      this.a($$0, this.u, this.p, this.A, dil.b.a(this.s[0], this.s[1]), $$1, 0.0F, dij.K);
      this.a($$0, this.t, this.p, dil.b.a(this.y, this.C), dil.b.a(this.s[2], this.s[5]), $$1, 0.0F, dij.L);
      this.a($$0, this.u, this.p, dil.b.a(this.y, this.C), dil.b.a(this.s[2], this.s[5]), $$1, 0.0F, dij.K);
      this.a($$0, this.t, this.p, this.y, this.s[6], $$1, 0.0F, dij.L);
      this.a($$0, this.u, this.p, this.y, this.s[6], $$1, 0.0F, dij.K);
      this.a($$0, dil.b.a(this.q[1], this.q[2]), this.p, dil.b.a(this.z, this.C), this.s[6], $$1, 0.0F, dij.g);
      this.a($$0, dil.b.a(this.q[3], this.q[4]), this.p, dil.b.a(this.z, this.C), this.s[6], $$1, 0.0F, dij.h);
      this.a($$0, this.t, this.p, dil.b.a(this.z, this.C), this.s[6], $$1, 0.0F, dij.L);

      for (int $$2 = 0; $$2 < this.q.length; $$2++) {
         dil.b $$3 = this.q[$$2];

         for (int $$4 = 0; $$4 < this.r.length; $$4++) {
            dil.b $$5 = this.r[$$4];
            aly<dic> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dil.b.a(this.B, this.C), dil.b.a(this.s[0], this.s[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dil.d, aly<dic>>> $$0) {
      this.b($$0, this.p, this.p, dil.b.a(0.8F, 1.0F), this.p, this.p, 0.0F, dij.Z);
      this.b($$0, this.p, dil.b.a(0.7F, 1.0F), this.p, this.p, this.p, 0.0F, dij.aa);
      this.c($$0, this.p, this.p, this.p, dil.b.a(this.s[0], this.s[1]), this.p, 0.0F, dij.ab);
   }

   private aly<dic> a(int $$0, int $$1, dil.b $$2) {
      if ($$2.b() < 0L) {
         return this.E[$$0][$$1];
      } else {
         aly<dic> $$3 = this.F[$$0][$$1];
         return $$3 == null ? this.E[$$0][$$1] : $$3;
      }
   }

   private aly<dic> b(int $$0, int $$1, dil.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private aly<dic> c(int $$0, int $$1, dil.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private aly<dic> a(int $$0, int $$1, dil.b $$2, aly<dic> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dij.w : $$3;
   }

   private aly<dic> d(int $$0, int $$1, dil.b $$2) {
      aly<dic> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private aly<dic> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dij.N;
      } else {
         return $$0 == 4 ? dij.f : dij.M;
      }
   }

   private aly<dic> a(int $$0, dil.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dij.A : dij.B;
      } else {
         return $$0 < 3 ? dij.A : dij.C;
      }
   }

   private aly<dic> e(int $$0, int $$1, dil.b $$2) {
      if ($$2.b() >= 0L) {
         aly<dic> $$3 = (this.o == dis.a.b ? this.I : this.H)[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.G[$$0][$$1];
   }

   private aly<dic> f(int $$0, int $$1, dil.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dij.I : dij.H;
      } else {
         return $$0 == 3 ? dij.J : this.a($$1, $$2);
      }
   }

   private aly<dic> g(int $$0, int $$1, dil.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dij.G : dij.F;
      }
   }

   private aly<dic> h(int $$0, int $$1, dil.b $$2) {
      aly<dic> $$3 = this.J[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dil.d, aly<dic>>> $$0, dil.b $$1, dil.b $$2, dil.b $$3, dil.b $$4, dil.b $$5, float $$6, aly<dic> $$7) {
      $$0.accept(Pair.of(dil.a($$1, $$2, $$3, $$4, dil.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dil.a($$1, $$2, $$3, $$4, dil.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dil.d, aly<dic>>> $$0, dil.b $$1, dil.b $$2, dil.b $$3, dil.b $$4, dil.b $$5, float $$6, aly<dic> $$7) {
      $$0.accept(Pair.of(dil.a($$1, $$2, $$3, $$4, dil.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dil.d, aly<dic>>> $$0, dil.b $$1, dil.b $$2, dil.b $$3, dil.b $$4, dil.b $$5, float $$6, aly<dic> $$7) {
      $$0.accept(Pair.of(dil.a($$1, $$2, $$3, $$4, dil.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(edb $$0, edb $$1, edb.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)edp.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)edp.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)edp.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)edp.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dil.a((float)$$0);
      if ($$1 < (double)this.v.b()) {
         return "Mushroom fields";
      } else if ($$1 < (double)this.w.b()) {
         return "Deep ocean";
      } else if ($$1 < (double)this.x.b()) {
         return "Ocean";
      } else if ($$1 < (double)this.y.b()) {
         return "Coast";
      } else if ($$1 < (double)this.A.b()) {
         return "Near inland";
      } else {
         return $$1 < (double)this.B.b() ? "Mid inland" : "Far inland";
      }
   }

   public String c(double $$0) {
      return a($$0, this.s);
   }

   public String d(double $$0) {
      return a($$0, this.q);
   }

   public String e(double $$0) {
      return a($$0, this.r);
   }

   private static String a(double $$0, dil.b[] $$1) {
      double $$2 = (double)dil.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bbl
   public dil.b[] b() {
      return this.q;
   }

   @bbl
   public dil.b[] c() {
      return this.r;
   }

   @bbl
   public dil.b[] d() {
      return this.s;
   }

   @bbl
   public dil.b[] e() {
      return new dil.b[]{this.v, this.w, this.x, this.y, this.A, this.B, this.C};
   }

   @bbl
   public dil.b[] f() {
      return new dil.b[]{
         dil.b.a(-2.0F, edp.a(0.05F)),
         dil.b.a(edp.a(0.05F), edp.a(0.26666668F)),
         dil.b.a(edp.a(0.26666668F), edp.a(0.4F)),
         dil.b.a(edp.a(0.4F), edp.a(0.56666666F)),
         dil.b.a(edp.a(0.56666666F), 2.0F)
      };
   }

   @bbl
   public dil.b[] g() {
      return new dil.b[]{dil.b.a(-2.0F, 0.0F), dil.b.a(0.0F, 2.0F)};
   }

   public static enum a {
      a,
      b;
   }
}
