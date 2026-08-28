import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dga {
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
   private final dft.b o = dft.b.a(-1.0F, 1.0F);
   private final dft.b[] p = new dft.b[]{dft.b.a(-1.0F, -0.45F), dft.b.a(-0.45F, -0.15F), dft.b.a(-0.15F, 0.2F), dft.b.a(0.2F, 0.55F), dft.b.a(0.55F, 1.0F)};
   private final dft.b[] q = new dft.b[]{dft.b.a(-1.0F, -0.35F), dft.b.a(-0.35F, -0.1F), dft.b.a(-0.1F, 0.1F), dft.b.a(0.1F, 0.3F), dft.b.a(0.3F, 1.0F)};
   private final dft.b[] r = new dft.b[]{
      dft.b.a(-1.0F, -0.78F),
      dft.b.a(-0.78F, -0.375F),
      dft.b.a(-0.375F, -0.2225F),
      dft.b.a(-0.2225F, 0.05F),
      dft.b.a(0.05F, 0.45F),
      dft.b.a(0.45F, 0.55F),
      dft.b.a(0.55F, 1.0F)
   };
   private final dft.b s = this.p[0];
   private final dft.b t = dft.b.a(this.p[1], this.p[4]);
   private final dft.b u = dft.b.a(-1.2F, -1.05F);
   private final dft.b v = dft.b.a(-1.05F, -0.455F);
   private final dft.b w = dft.b.a(-0.455F, -0.19F);
   private final dft.b x = dft.b.a(-0.19F, -0.11F);
   private final dft.b y = dft.b.a(-0.11F, 0.55F);
   private final dft.b z = dft.b.a(-0.11F, 0.03F);
   private final dft.b A = dft.b.a(0.03F, 0.3F);
   private final dft.b B = dft.b.a(0.3F, 1.0F);
   private final ald<dfk>[][] C = new ald[][]{{dfr.X, dfr.V, dfr.T, dfr.R, dfr.P}, {dfr.W, dfr.U, dfr.S, dfr.Q, dfr.P}};
   private final ald<dfk>[][] D = new ald[][]{
      {dfr.d, dfr.d, dfr.d, dfr.q, dfr.p},
      {dfr.b, dfr.b, dfr.i, dfr.p, dfr.o},
      {dfr.j, dfr.b, dfr.i, dfr.k, dfr.l},
      {dfr.r, dfr.r, dfr.i, dfr.x, dfr.x},
      {dfr.f, dfr.f, dfr.f, dfr.f, dfr.f}
   };
   private final ald<dfk>[][] E = new ald[][]{
      {dfr.e, null, dfr.q, null, null},
      {null, null, null, null, dfr.n},
      {dfr.c, null, null, dfr.m, null},
      {null, null, dfr.b, dfr.y, dfr.z},
      {null, null, null, null, null}
   };
   private final ald<dfk>[][] F = new ald[][]{
      {dfr.d, dfr.d, dfr.d, dfr.q, dfr.q},
      {dfr.D, dfr.D, dfr.i, dfr.p, dfr.o},
      {dfr.D, dfr.D, dfr.D, dfr.D, dfr.l},
      {dfr.s, dfr.s, dfr.i, dfr.i, dfr.x},
      {dfr.A, dfr.A, dfr.A, dfr.C, dfr.C}
   };
   private final ald<dfk>[][] G = new ald[][]{
      {dfr.e, null, null, null, null},
      {dfr.E, null, dfr.D, dfr.D, dfr.n},
      {dfr.E, dfr.E, dfr.i, dfr.k, null},
      {null, null, null, null, null},
      {dfr.B, dfr.B, null, null, null}
   };
   private final ald<dfk>[][] H = new ald[][]{
      {dfr.u, dfr.u, dfr.t, dfr.v, dfr.v},
      {dfr.u, dfr.u, dfr.t, dfr.v, dfr.v},
      {dfr.t, dfr.t, dfr.t, dfr.v, dfr.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dft.d> a() {
      dft.b $$0 = dft.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dft.d(this.o, this.o, dft.b.a(this.y, this.o), this.o, $$0, dft.b.a(-1.0F, -0.16F), 0L),
         new dft.d(this.o, this.o, dft.b.a(this.y, this.o), this.o, $$0, dft.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dft.d, ald<dfk>>> $$0) {
      if (ab.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dft.d, ald<dfk>>> $$0) {
      jq.a $$1 = ph.a();
      jp<eah> $$2 = $$1.d(lw.aL);
      eai.w.a $$3 = new eai.w.a($$2.b(eav.d));
      eai.w.a $$4 = new eai.w.a($$2.b(eav.e));
      eai.w.a $$5 = new eai.w.a($$2.b(eav.g));
      $$0.accept(Pair.of(dft.a(this.o, this.o, this.o, this.o, dft.b.a(0.0F), this.o, 0.01F), dfr.b));
      if (rj.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, bah.a) instanceof ayh.e<?, ?> $$7) {
         ald<dfk> $$8 = dfr.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dft.a(this.o, this.o, this.o, dft.b.a($$9), dft.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dfr.f ? dfr.A : dfr.f;
         }
      }

      if (rj.a($$3, $$4, $$5, false) instanceof ayh.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dft.a(this.o, this.o, dft.b.a($$12), this.o, dft.b.a(0.0F), this.o, 0.0F), dfr.q));
         }
      }
   }

   private void c(Consumer<Pair<dft.d, ald<dfk>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dfr.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dft.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dft.d, ald<dfk>>> $$0) {
      this.c($$0, dft.b.a(-1.0F, -0.93333334F));
      this.b($$0, dft.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dft.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dft.b.a(-0.56666666F, -0.4F));
      this.c($$0, dft.b.a(-0.4F, -0.26666668F));
      this.d($$0, dft.b.a(-0.26666668F, -0.05F));
      this.e($$0, dft.b.a(-0.05F, 0.05F));
      this.d($$0, dft.b.a(0.05F, 0.26666668F));
      this.c($$0, dft.b.a(0.26666668F, 0.4F));
      this.b($$0, dft.b.a(0.4F, 0.56666666F));
      this.a($$0, dft.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dft.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dft.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dft.d, ald<dfk>>> $$0, dft.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dft.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dft.b $$5 = this.q[$$4];
            ald<dfk> $$6 = this.a($$2, $$4, $$1);
            ald<dfk> $$7 = this.b($$2, $$4, $$1);
            ald<dfk> $$8 = this.c($$2, $$4, $$1);
            ald<dfk> $$9 = this.e($$2, $$4, $$1);
            ald<dfk> $$10 = this.h($$2, $$4, $$1);
            ald<dfk> $$11 = this.a($$2, $$4, $$1, $$10);
            ald<dfk> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dft.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dft.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dft.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dft.b.a(this.x, this.z), dft.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dft.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dft.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dft.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dft.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dft.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dft.d, ald<dfk>>> $$0, dft.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dft.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dft.b $$5 = this.q[$$4];
            ald<dfk> $$6 = this.a($$2, $$4, $$1);
            ald<dfk> $$7 = this.b($$2, $$4, $$1);
            ald<dfk> $$8 = this.c($$2, $$4, $$1);
            ald<dfk> $$9 = this.e($$2, $$4, $$1);
            ald<dfk> $$10 = this.h($$2, $$4, $$1);
            ald<dfk> $$11 = this.a($$2, $$4, $$1, $$6);
            ald<dfk> $$12 = this.g($$2, $$4, $$1);
            ald<dfk> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dft.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dft.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dft.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dft.b.a(this.x, this.z), dft.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dft.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dft.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dft.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dft.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dft.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dft.d, ald<dfk>>> $$0, dft.b $$1) {
      this.a($$0, this.o, this.o, this.x, dft.b.a(this.r[0], this.r[2]), $$1, 0.0F, dfr.O);
      this.a($$0, dft.b.a(this.p[1], this.p[2]), this.o, dft.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dfr.g);
      this.a($$0, dft.b.a(this.p[3], this.p[4]), this.o, dft.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dfr.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dft.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dft.b $$5 = this.q[$$4];
            ald<dfk> $$6 = this.a($$2, $$4, $$1);
            ald<dfk> $$7 = this.b($$2, $$4, $$1);
            ald<dfk> $$8 = this.c($$2, $$4, $$1);
            ald<dfk> $$9 = this.h($$2, $$4, $$1);
            ald<dfk> $$10 = this.e($$2, $$4, $$1);
            ald<dfk> $$11 = this.a($$2, $$4);
            ald<dfk> $$12 = this.a($$2, $$4, $$1, $$6);
            ald<dfk> $$13 = this.d($$2, $$4, $$1);
            ald<dfk> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dft.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dft.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dft.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dft.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dft.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dft.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dft.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dft.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dft.d, ald<dfk>>> $$0, dft.b $$1) {
      this.a($$0, this.o, this.o, this.x, dft.b.a(this.r[0], this.r[2]), $$1, 0.0F, dfr.O);
      this.a($$0, dft.b.a(this.p[1], this.p[2]), this.o, dft.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dfr.g);
      this.a($$0, dft.b.a(this.p[3], this.p[4]), this.o, dft.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dfr.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dft.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dft.b $$5 = this.q[$$4];
            ald<dfk> $$6 = this.a($$2, $$4, $$1);
            ald<dfk> $$7 = this.b($$2, $$4, $$1);
            ald<dfk> $$8 = this.c($$2, $$4, $$1);
            ald<dfk> $$9 = this.a($$2, $$4);
            ald<dfk> $$10 = this.a($$2, $$4, $$1, $$6);
            ald<dfk> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dft.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dft.b.a(this.A, this.B), dft.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dft.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dft.b.a(this.A, this.B), dft.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dft.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dft.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dft.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dft.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dft.d, ald<dfk>>> $$0, dft.b $$1) {
      this.a($$0, this.s, this.o, this.x, dft.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dfr.O : dfr.L);
      this.a($$0, this.t, this.o, this.x, dft.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dfr.O : dfr.K);
      this.a($$0, this.s, this.o, this.z, dft.b.a(this.r[0], this.r[1]), $$1, 0.0F, dfr.L);
      this.a($$0, this.t, this.o, this.z, dft.b.a(this.r[0], this.r[1]), $$1, 0.0F, dfr.K);
      this.a($$0, this.s, this.o, dft.b.a(this.x, this.B), dft.b.a(this.r[2], this.r[5]), $$1, 0.0F, dfr.L);
      this.a($$0, this.t, this.o, dft.b.a(this.x, this.B), dft.b.a(this.r[2], this.r[5]), $$1, 0.0F, dfr.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dfr.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dfr.K);
      this.a($$0, dft.b.a(this.p[1], this.p[2]), this.o, dft.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dfr.g);
      this.a($$0, dft.b.a(this.p[3], this.p[4]), this.o, dft.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dfr.h);
      this.a($$0, this.s, this.o, dft.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dfr.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dft.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dft.b $$5 = this.q[$$4];
            ald<dfk> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dft.b.a(this.A, this.B), dft.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dft.d, ald<dfk>>> $$0) {
      this.b($$0, this.o, this.o, dft.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dfr.Z);
      this.b($$0, this.o, dft.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dfr.aa);
      this.c($$0, this.o, this.o, this.o, dft.b.a(this.r[0], this.r[1]), this.o, 0.0F, dfr.ab);
   }

   private ald<dfk> a(int $$0, int $$1, dft.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         ald<dfk> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private ald<dfk> b(int $$0, int $$1, dft.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private ald<dfk> c(int $$0, int $$1, dft.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private ald<dfk> a(int $$0, int $$1, dft.b $$2, ald<dfk> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dfr.w : $$3;
   }

   private ald<dfk> d(int $$0, int $$1, dft.b $$2) {
      ald<dfk> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private ald<dfk> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dfr.N;
      } else {
         return $$0 == 4 ? dfr.f : dfr.M;
      }
   }

   private ald<dfk> a(int $$0, dft.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dfr.A : dfr.B;
      } else {
         return $$0 < 3 ? dfr.A : dfr.C;
      }
   }

   private ald<dfk> e(int $$0, int $$1, dft.b $$2) {
      if ($$2.b() >= 0L) {
         ald<dfk> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private ald<dfk> f(int $$0, int $$1, dft.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dfr.I : dfr.H;
      } else {
         return $$0 == 3 ? dfr.J : this.a($$1, $$2);
      }
   }

   private ald<dfk> g(int $$0, int $$1, dft.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dfr.G : dfr.F;
      }
   }

   private ald<dfk> h(int $$0, int $$1, dft.b $$2) {
      ald<dfk> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dft.d, ald<dfk>>> $$0, dft.b $$1, dft.b $$2, dft.b $$3, dft.b $$4, dft.b $$5, float $$6, ald<dfk> $$7) {
      $$0.accept(Pair.of(dft.a($$1, $$2, $$3, $$4, dft.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dft.a($$1, $$2, $$3, $$4, dft.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dft.d, ald<dfk>>> $$0, dft.b $$1, dft.b $$2, dft.b $$3, dft.b $$4, dft.b $$5, float $$6, ald<dfk> $$7) {
      $$0.accept(Pair.of(dft.a($$1, $$2, $$3, $$4, dft.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dft.d, ald<dfk>>> $$0, dft.b $$1, dft.b $$2, dft.b $$3, dft.b $$4, dft.b $$5, float $$6, ald<dfk> $$7) {
      $$0.accept(Pair.of(dft.a($$1, $$2, $$3, $$4, dft.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(eah $$0, eah $$1, eah.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)eav.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)eav.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)eav.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)eav.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dft.a((float)$$0);
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

   private static String a(double $$0, dft.b[] $$1) {
      double $$2 = (double)dft.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bal
   public dft.b[] b() {
      return this.p;
   }

   @bal
   public dft.b[] c() {
      return this.q;
   }

   @bal
   public dft.b[] d() {
      return this.r;
   }

   @bal
   public dft.b[] e() {
      return new dft.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @bal
   public dft.b[] f() {
      return new dft.b[]{
         dft.b.a(-2.0F, eav.a(0.05F)),
         dft.b.a(eav.a(0.05F), eav.a(0.26666668F)),
         dft.b.a(eav.a(0.26666668F), eav.a(0.4F)),
         dft.b.a(eav.a(0.4F), eav.a(0.56666666F)),
         dft.b.a(eav.a(0.56666666F), 2.0F)
      };
   }

   @bal
   public dft.b[] g() {
      return new dft.b[]{dft.b.a(-2.0F, 0.0F), dft.b.a(0.0F, 2.0F)};
   }
}
