import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dfj {
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
   private final dfc.b o = dfc.b.a(-1.0F, 1.0F);
   private final dfc.b[] p = new dfc.b[]{dfc.b.a(-1.0F, -0.45F), dfc.b.a(-0.45F, -0.15F), dfc.b.a(-0.15F, 0.2F), dfc.b.a(0.2F, 0.55F), dfc.b.a(0.55F, 1.0F)};
   private final dfc.b[] q = new dfc.b[]{dfc.b.a(-1.0F, -0.35F), dfc.b.a(-0.35F, -0.1F), dfc.b.a(-0.1F, 0.1F), dfc.b.a(0.1F, 0.3F), dfc.b.a(0.3F, 1.0F)};
   private final dfc.b[] r = new dfc.b[]{
      dfc.b.a(-1.0F, -0.78F),
      dfc.b.a(-0.78F, -0.375F),
      dfc.b.a(-0.375F, -0.2225F),
      dfc.b.a(-0.2225F, 0.05F),
      dfc.b.a(0.05F, 0.45F),
      dfc.b.a(0.45F, 0.55F),
      dfc.b.a(0.55F, 1.0F)
   };
   private final dfc.b s = this.p[0];
   private final dfc.b t = dfc.b.a(this.p[1], this.p[4]);
   private final dfc.b u = dfc.b.a(-1.2F, -1.05F);
   private final dfc.b v = dfc.b.a(-1.05F, -0.455F);
   private final dfc.b w = dfc.b.a(-0.455F, -0.19F);
   private final dfc.b x = dfc.b.a(-0.19F, -0.11F);
   private final dfc.b y = dfc.b.a(-0.11F, 0.55F);
   private final dfc.b z = dfc.b.a(-0.11F, 0.03F);
   private final dfc.b A = dfc.b.a(0.03F, 0.3F);
   private final dfc.b B = dfc.b.a(0.3F, 1.0F);
   private final ala<det>[][] C = new ala[][]{{dfa.X, dfa.V, dfa.T, dfa.R, dfa.P}, {dfa.W, dfa.U, dfa.S, dfa.Q, dfa.P}};
   private final ala<det>[][] D = new ala[][]{
      {dfa.d, dfa.d, dfa.d, dfa.q, dfa.p},
      {dfa.b, dfa.b, dfa.i, dfa.p, dfa.o},
      {dfa.j, dfa.b, dfa.i, dfa.k, dfa.l},
      {dfa.r, dfa.r, dfa.i, dfa.x, dfa.x},
      {dfa.f, dfa.f, dfa.f, dfa.f, dfa.f}
   };
   private final ala<det>[][] E = new ala[][]{
      {dfa.e, null, dfa.q, null, null},
      {null, null, null, null, dfa.n},
      {dfa.c, null, null, dfa.m, null},
      {null, null, dfa.b, dfa.y, dfa.z},
      {null, null, null, null, null}
   };
   private final ala<det>[][] F = new ala[][]{
      {dfa.d, dfa.d, dfa.d, dfa.q, dfa.q},
      {dfa.D, dfa.D, dfa.i, dfa.p, dfa.o},
      {dfa.D, dfa.D, dfa.D, dfa.D, dfa.l},
      {dfa.s, dfa.s, dfa.i, dfa.i, dfa.x},
      {dfa.A, dfa.A, dfa.A, dfa.C, dfa.C}
   };
   private final ala<det>[][] G = new ala[][]{
      {dfa.e, null, null, null, null},
      {dfa.E, null, dfa.D, dfa.D, dfa.n},
      {dfa.E, dfa.E, dfa.i, dfa.k, null},
      {null, null, null, null, null},
      {dfa.B, dfa.B, null, null, null}
   };
   private final ala<det>[][] H = new ala[][]{
      {dfa.u, dfa.u, dfa.t, dfa.v, dfa.v},
      {dfa.u, dfa.u, dfa.t, dfa.v, dfa.v},
      {dfa.t, dfa.t, dfa.t, dfa.v, dfa.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dfc.d> a() {
      dfc.b $$0 = dfc.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dfc.d(this.o, this.o, dfc.b.a(this.y, this.o), this.o, $$0, dfc.b.a(-1.0F, -0.16F), 0L),
         new dfc.d(this.o, this.o, dfc.b.a(this.y, this.o), this.o, $$0, dfc.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dfc.d, ala<det>>> $$0) {
      if (ab.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dfc.d, ala<det>>> $$0) {
      jp.a $$1 = pg.a();
      jo<dzp> $$2 = $$1.b(lv.aJ);
      dzq.w.a $$3 = new dzq.w.a($$2.b(ead.d));
      dzq.w.a $$4 = new dzq.w.a($$2.b(ead.e));
      dzq.w.a $$5 = new dzq.w.a($$2.b(ead.g));
      $$0.accept(Pair.of(dfc.a(this.o, this.o, this.o, this.o, dfc.b.a(0.0F), this.o, 0.01F), dfa.b));
      if (ri.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, bae.a) instanceof aye.e<?, ?> $$7) {
         ala<det> $$8 = dfa.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dfc.a(this.o, this.o, this.o, dfc.b.a($$9), dfc.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dfa.f ? dfa.A : dfa.f;
         }
      }

      if (ri.a($$3, $$4, $$5, false) instanceof aye.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dfc.a(this.o, this.o, dfc.b.a($$12), this.o, dfc.b.a(0.0F), this.o, 0.0F), dfa.q));
         }
      }
   }

   private void c(Consumer<Pair<dfc.d, ala<det>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dfa.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dfc.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dfc.d, ala<det>>> $$0) {
      this.c($$0, dfc.b.a(-1.0F, -0.93333334F));
      this.b($$0, dfc.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dfc.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dfc.b.a(-0.56666666F, -0.4F));
      this.c($$0, dfc.b.a(-0.4F, -0.26666668F));
      this.d($$0, dfc.b.a(-0.26666668F, -0.05F));
      this.e($$0, dfc.b.a(-0.05F, 0.05F));
      this.d($$0, dfc.b.a(0.05F, 0.26666668F));
      this.c($$0, dfc.b.a(0.26666668F, 0.4F));
      this.b($$0, dfc.b.a(0.4F, 0.56666666F));
      this.a($$0, dfc.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dfc.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dfc.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dfc.d, ala<det>>> $$0, dfc.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dfc.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dfc.b $$5 = this.q[$$4];
            ala<det> $$6 = this.a($$2, $$4, $$1);
            ala<det> $$7 = this.b($$2, $$4, $$1);
            ala<det> $$8 = this.c($$2, $$4, $$1);
            ala<det> $$9 = this.e($$2, $$4, $$1);
            ala<det> $$10 = this.h($$2, $$4, $$1);
            ala<det> $$11 = this.a($$2, $$4, $$1, $$10);
            ala<det> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dfc.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dfc.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dfc.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dfc.b.a(this.x, this.z), dfc.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dfc.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dfc.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dfc.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dfc.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dfc.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dfc.d, ala<det>>> $$0, dfc.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dfc.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dfc.b $$5 = this.q[$$4];
            ala<det> $$6 = this.a($$2, $$4, $$1);
            ala<det> $$7 = this.b($$2, $$4, $$1);
            ala<det> $$8 = this.c($$2, $$4, $$1);
            ala<det> $$9 = this.e($$2, $$4, $$1);
            ala<det> $$10 = this.h($$2, $$4, $$1);
            ala<det> $$11 = this.a($$2, $$4, $$1, $$6);
            ala<det> $$12 = this.g($$2, $$4, $$1);
            ala<det> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dfc.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dfc.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dfc.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dfc.b.a(this.x, this.z), dfc.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dfc.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dfc.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dfc.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dfc.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dfc.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dfc.d, ala<det>>> $$0, dfc.b $$1) {
      this.a($$0, this.o, this.o, this.x, dfc.b.a(this.r[0], this.r[2]), $$1, 0.0F, dfa.O);
      this.a($$0, dfc.b.a(this.p[1], this.p[2]), this.o, dfc.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dfa.g);
      this.a($$0, dfc.b.a(this.p[3], this.p[4]), this.o, dfc.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dfa.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dfc.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dfc.b $$5 = this.q[$$4];
            ala<det> $$6 = this.a($$2, $$4, $$1);
            ala<det> $$7 = this.b($$2, $$4, $$1);
            ala<det> $$8 = this.c($$2, $$4, $$1);
            ala<det> $$9 = this.h($$2, $$4, $$1);
            ala<det> $$10 = this.e($$2, $$4, $$1);
            ala<det> $$11 = this.a($$2, $$4);
            ala<det> $$12 = this.a($$2, $$4, $$1, $$6);
            ala<det> $$13 = this.d($$2, $$4, $$1);
            ala<det> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dfc.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dfc.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dfc.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dfc.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dfc.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dfc.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dfc.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dfc.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dfc.d, ala<det>>> $$0, dfc.b $$1) {
      this.a($$0, this.o, this.o, this.x, dfc.b.a(this.r[0], this.r[2]), $$1, 0.0F, dfa.O);
      this.a($$0, dfc.b.a(this.p[1], this.p[2]), this.o, dfc.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dfa.g);
      this.a($$0, dfc.b.a(this.p[3], this.p[4]), this.o, dfc.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dfa.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dfc.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dfc.b $$5 = this.q[$$4];
            ala<det> $$6 = this.a($$2, $$4, $$1);
            ala<det> $$7 = this.b($$2, $$4, $$1);
            ala<det> $$8 = this.c($$2, $$4, $$1);
            ala<det> $$9 = this.a($$2, $$4);
            ala<det> $$10 = this.a($$2, $$4, $$1, $$6);
            ala<det> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dfc.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dfc.b.a(this.A, this.B), dfc.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dfc.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dfc.b.a(this.A, this.B), dfc.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dfc.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dfc.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dfc.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dfc.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dfc.d, ala<det>>> $$0, dfc.b $$1) {
      this.a($$0, this.s, this.o, this.x, dfc.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dfa.O : dfa.L);
      this.a($$0, this.t, this.o, this.x, dfc.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dfa.O : dfa.K);
      this.a($$0, this.s, this.o, this.z, dfc.b.a(this.r[0], this.r[1]), $$1, 0.0F, dfa.L);
      this.a($$0, this.t, this.o, this.z, dfc.b.a(this.r[0], this.r[1]), $$1, 0.0F, dfa.K);
      this.a($$0, this.s, this.o, dfc.b.a(this.x, this.B), dfc.b.a(this.r[2], this.r[5]), $$1, 0.0F, dfa.L);
      this.a($$0, this.t, this.o, dfc.b.a(this.x, this.B), dfc.b.a(this.r[2], this.r[5]), $$1, 0.0F, dfa.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dfa.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dfa.K);
      this.a($$0, dfc.b.a(this.p[1], this.p[2]), this.o, dfc.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dfa.g);
      this.a($$0, dfc.b.a(this.p[3], this.p[4]), this.o, dfc.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dfa.h);
      this.a($$0, this.s, this.o, dfc.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dfa.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dfc.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dfc.b $$5 = this.q[$$4];
            ala<det> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dfc.b.a(this.A, this.B), dfc.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dfc.d, ala<det>>> $$0) {
      this.b($$0, this.o, this.o, dfc.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dfa.Z);
      this.b($$0, this.o, dfc.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dfa.aa);
      this.c($$0, this.o, this.o, this.o, dfc.b.a(this.r[0], this.r[1]), this.o, 0.0F, dfa.ab);
   }

   private ala<det> a(int $$0, int $$1, dfc.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         ala<det> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private ala<det> b(int $$0, int $$1, dfc.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private ala<det> c(int $$0, int $$1, dfc.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private ala<det> a(int $$0, int $$1, dfc.b $$2, ala<det> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dfa.w : $$3;
   }

   private ala<det> d(int $$0, int $$1, dfc.b $$2) {
      ala<det> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private ala<det> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dfa.N;
      } else {
         return $$0 == 4 ? dfa.f : dfa.M;
      }
   }

   private ala<det> a(int $$0, dfc.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dfa.A : dfa.B;
      } else {
         return $$0 < 3 ? dfa.A : dfa.C;
      }
   }

   private ala<det> e(int $$0, int $$1, dfc.b $$2) {
      if ($$2.b() >= 0L) {
         ala<det> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private ala<det> f(int $$0, int $$1, dfc.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dfa.I : dfa.H;
      } else {
         return $$0 == 3 ? dfa.J : this.a($$1, $$2);
      }
   }

   private ala<det> g(int $$0, int $$1, dfc.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dfa.G : dfa.F;
      }
   }

   private ala<det> h(int $$0, int $$1, dfc.b $$2) {
      ala<det> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dfc.d, ala<det>>> $$0, dfc.b $$1, dfc.b $$2, dfc.b $$3, dfc.b $$4, dfc.b $$5, float $$6, ala<det> $$7) {
      $$0.accept(Pair.of(dfc.a($$1, $$2, $$3, $$4, dfc.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dfc.a($$1, $$2, $$3, $$4, dfc.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dfc.d, ala<det>>> $$0, dfc.b $$1, dfc.b $$2, dfc.b $$3, dfc.b $$4, dfc.b $$5, float $$6, ala<det> $$7) {
      $$0.accept(Pair.of(dfc.a($$1, $$2, $$3, $$4, dfc.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dfc.d, ala<det>>> $$0, dfc.b $$1, dfc.b $$2, dfc.b $$3, dfc.b $$4, dfc.b $$5, float $$6, ala<det> $$7) {
      $$0.accept(Pair.of(dfc.a($$1, $$2, $$3, $$4, dfc.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dzp $$0, dzp $$1, dzp.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)ead.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)ead.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)ead.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)ead.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dfc.a((float)$$0);
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

   private static String a(double $$0, dfc.b[] $$1) {
      double $$2 = (double)dfc.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bai
   public dfc.b[] b() {
      return this.p;
   }

   @bai
   public dfc.b[] c() {
      return this.q;
   }

   @bai
   public dfc.b[] d() {
      return this.r;
   }

   @bai
   public dfc.b[] e() {
      return new dfc.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @bai
   public dfc.b[] f() {
      return new dfc.b[]{
         dfc.b.a(-2.0F, ead.a(0.05F)),
         dfc.b.a(ead.a(0.05F), ead.a(0.26666668F)),
         dfc.b.a(ead.a(0.26666668F), ead.a(0.4F)),
         dfc.b.a(ead.a(0.4F), ead.a(0.56666666F)),
         dfc.b.a(ead.a(0.56666666F), 2.0F)
      };
   }

   @bai
   public dfc.b[] g() {
      return new dfc.b[]{dfc.b.a(-2.0F, 0.0F), dfc.b.a(0.0F, 2.0F)};
   }
}
