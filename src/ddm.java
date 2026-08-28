import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class ddm {
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
   private final ddf.b o = ddf.b.a(-1.0F, 1.0F);
   private final ddf.b[] p = new ddf.b[]{ddf.b.a(-1.0F, -0.45F), ddf.b.a(-0.45F, -0.15F), ddf.b.a(-0.15F, 0.2F), ddf.b.a(0.2F, 0.55F), ddf.b.a(0.55F, 1.0F)};
   private final ddf.b[] q = new ddf.b[]{ddf.b.a(-1.0F, -0.35F), ddf.b.a(-0.35F, -0.1F), ddf.b.a(-0.1F, 0.1F), ddf.b.a(0.1F, 0.3F), ddf.b.a(0.3F, 1.0F)};
   private final ddf.b[] r = new ddf.b[]{
      ddf.b.a(-1.0F, -0.78F),
      ddf.b.a(-0.78F, -0.375F),
      ddf.b.a(-0.375F, -0.2225F),
      ddf.b.a(-0.2225F, 0.05F),
      ddf.b.a(0.05F, 0.45F),
      ddf.b.a(0.45F, 0.55F),
      ddf.b.a(0.55F, 1.0F)
   };
   private final ddf.b s = this.p[0];
   private final ddf.b t = ddf.b.a(this.p[1], this.p[4]);
   private final ddf.b u = ddf.b.a(-1.2F, -1.05F);
   private final ddf.b v = ddf.b.a(-1.05F, -0.455F);
   private final ddf.b w = ddf.b.a(-0.455F, -0.19F);
   private final ddf.b x = ddf.b.a(-0.19F, -0.11F);
   private final ddf.b y = ddf.b.a(-0.11F, 0.55F);
   private final ddf.b z = ddf.b.a(-0.11F, 0.03F);
   private final ddf.b A = ddf.b.a(0.03F, 0.3F);
   private final ddf.b B = ddf.b.a(0.3F, 1.0F);
   private final ald<dcw>[][] C = new ald[][]{{ddd.X, ddd.V, ddd.T, ddd.R, ddd.P}, {ddd.W, ddd.U, ddd.S, ddd.Q, ddd.P}};
   private final ald<dcw>[][] D = new ald[][]{
      {ddd.d, ddd.d, ddd.d, ddd.q, ddd.p},
      {ddd.b, ddd.b, ddd.i, ddd.p, ddd.o},
      {ddd.j, ddd.b, ddd.i, ddd.k, ddd.l},
      {ddd.r, ddd.r, ddd.i, ddd.x, ddd.x},
      {ddd.f, ddd.f, ddd.f, ddd.f, ddd.f}
   };
   private final ald<dcw>[][] E = new ald[][]{
      {ddd.e, null, ddd.q, null, null},
      {null, null, null, null, ddd.n},
      {ddd.c, null, null, ddd.m, null},
      {null, null, ddd.b, ddd.y, ddd.z},
      {null, null, null, null, null}
   };
   private final ald<dcw>[][] F = new ald[][]{
      {ddd.d, ddd.d, ddd.d, ddd.q, ddd.q},
      {ddd.D, ddd.D, ddd.i, ddd.p, ddd.o},
      {ddd.D, ddd.D, ddd.D, ddd.D, ddd.l},
      {ddd.s, ddd.s, ddd.i, ddd.i, ddd.x},
      {ddd.A, ddd.A, ddd.A, ddd.C, ddd.C}
   };
   private final ald<dcw>[][] G = new ald[][]{
      {ddd.e, null, null, null, null},
      {ddd.E, null, ddd.D, ddd.D, ddd.n},
      {ddd.E, ddd.E, ddd.i, ddd.k, null},
      {null, null, null, null, null},
      {ddd.B, ddd.B, null, null, null}
   };
   private final ald<dcw>[][] H = new ald[][]{
      {ddd.u, ddd.u, ddd.t, ddd.v, ddd.v},
      {ddd.u, ddd.u, ddd.t, ddd.v, ddd.v},
      {ddd.t, ddd.t, ddd.t, ddd.v, ddd.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<ddf.d> a() {
      ddf.b $$0 = ddf.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new ddf.d(this.o, this.o, ddf.b.a(this.y, this.o), this.o, $$0, ddf.b.a(-1.0F, -0.16F), 0L),
         new ddf.d(this.o, this.o, ddf.b.a(this.y, this.o), this.o, $$0, ddf.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<ddf.d, ald<dcw>>> $$0) {
      if (aa.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<ddf.d, ald<dcw>>> $$0) {
      jk.a $$1 = ph.a();
      jj<dxm> $$2 = $$1.b(lq.aD);
      dxn.w.a $$3 = new dxn.w.a($$2.b(dya.d));
      dxn.w.a $$4 = new dxn.w.a($$2.b(dya.e));
      dxn.w.a $$5 = new dxn.w.a($$2.b(dya.g));
      $$0.accept(Pair.of(ddf.a(this.o, this.o, this.o, this.o, ddf.b.a(0.0F), this.o, 0.01F), ddd.b));
      if (rr.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, azz.a) instanceof axz.e<?, ?> $$7) {
         ald<dcw> $$8 = ddd.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(ddf.a(this.o, this.o, this.o, ddf.b.a($$9), ddf.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == ddd.f ? ddd.A : ddd.f;
         }
      }

      if (rr.a($$3, $$4, $$5, false) instanceof axz.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(ddf.a(this.o, this.o, ddf.b.a($$12), this.o, ddf.b.a(0.0F), this.o, 0.0F), ddd.q));
         }
      }
   }

   private void c(Consumer<Pair<ddf.d, ald<dcw>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, ddd.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         ddf.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<ddf.d, ald<dcw>>> $$0) {
      this.c($$0, ddf.b.a(-1.0F, -0.93333334F));
      this.b($$0, ddf.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, ddf.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, ddf.b.a(-0.56666666F, -0.4F));
      this.c($$0, ddf.b.a(-0.4F, -0.26666668F));
      this.d($$0, ddf.b.a(-0.26666668F, -0.05F));
      this.e($$0, ddf.b.a(-0.05F, 0.05F));
      this.d($$0, ddf.b.a(0.05F, 0.26666668F));
      this.c($$0, ddf.b.a(0.26666668F, 0.4F));
      this.b($$0, ddf.b.a(0.4F, 0.56666666F));
      this.a($$0, ddf.b.a(0.56666666F, 0.7666667F));
      this.b($$0, ddf.b.a(0.7666667F, 0.93333334F));
      this.c($$0, ddf.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<ddf.d, ald<dcw>>> $$0, ddf.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddf.b $$5 = this.q[$$4];
            ald<dcw> $$6 = this.a($$2, $$4, $$1);
            ald<dcw> $$7 = this.b($$2, $$4, $$1);
            ald<dcw> $$8 = this.c($$2, $$4, $$1);
            ald<dcw> $$9 = this.e($$2, $$4, $$1);
            ald<dcw> $$10 = this.h($$2, $$4, $$1);
            ald<dcw> $$11 = this.a($$2, $$4, $$1, $$10);
            ald<dcw> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddf.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddf.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, ddf.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddf.b.a(this.x, this.z), ddf.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddf.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddf.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddf.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, ddf.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddf.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<ddf.d, ald<dcw>>> $$0, ddf.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddf.b $$5 = this.q[$$4];
            ald<dcw> $$6 = this.a($$2, $$4, $$1);
            ald<dcw> $$7 = this.b($$2, $$4, $$1);
            ald<dcw> $$8 = this.c($$2, $$4, $$1);
            ald<dcw> $$9 = this.e($$2, $$4, $$1);
            ald<dcw> $$10 = this.h($$2, $$4, $$1);
            ald<dcw> $$11 = this.a($$2, $$4, $$1, $$6);
            ald<dcw> $$12 = this.g($$2, $$4, $$1);
            ald<dcw> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, ddf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddf.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, ddf.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddf.b.a(this.x, this.z), ddf.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddf.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddf.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddf.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, ddf.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddf.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<ddf.d, ald<dcw>>> $$0, ddf.b $$1) {
      this.a($$0, this.o, this.o, this.x, ddf.b.a(this.r[0], this.r[2]), $$1, 0.0F, ddd.O);
      this.a($$0, ddf.b.a(this.p[1], this.p[2]), this.o, ddf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddd.g);
      this.a($$0, ddf.b.a(this.p[3], this.p[4]), this.o, ddf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddd.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddf.b $$5 = this.q[$$4];
            ald<dcw> $$6 = this.a($$2, $$4, $$1);
            ald<dcw> $$7 = this.b($$2, $$4, $$1);
            ald<dcw> $$8 = this.c($$2, $$4, $$1);
            ald<dcw> $$9 = this.h($$2, $$4, $$1);
            ald<dcw> $$10 = this.e($$2, $$4, $$1);
            ald<dcw> $$11 = this.a($$2, $$4);
            ald<dcw> $$12 = this.a($$2, $$4, $$1, $$6);
            ald<dcw> $$13 = this.d($$2, $$4, $$1);
            ald<dcw> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddf.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, ddf.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddf.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddf.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, ddf.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, ddf.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddf.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, ddf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<ddf.d, ald<dcw>>> $$0, ddf.b $$1) {
      this.a($$0, this.o, this.o, this.x, ddf.b.a(this.r[0], this.r[2]), $$1, 0.0F, ddd.O);
      this.a($$0, ddf.b.a(this.p[1], this.p[2]), this.o, ddf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddd.g);
      this.a($$0, ddf.b.a(this.p[3], this.p[4]), this.o, ddf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddd.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddf.b $$5 = this.q[$$4];
            ald<dcw> $$6 = this.a($$2, $$4, $$1);
            ald<dcw> $$7 = this.b($$2, $$4, $$1);
            ald<dcw> $$8 = this.c($$2, $$4, $$1);
            ald<dcw> $$9 = this.a($$2, $$4);
            ald<dcw> $$10 = this.a($$2, $$4, $$1, $$6);
            ald<dcw> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, ddf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, ddf.b.a(this.A, this.B), ddf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, ddf.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddf.b.a(this.A, this.B), ddf.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, ddf.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddf.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddf.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, ddf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<ddf.d, ald<dcw>>> $$0, ddf.b $$1) {
      this.a($$0, this.s, this.o, this.x, ddf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? ddd.O : ddd.L);
      this.a($$0, this.t, this.o, this.x, ddf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? ddd.O : ddd.K);
      this.a($$0, this.s, this.o, this.z, ddf.b.a(this.r[0], this.r[1]), $$1, 0.0F, ddd.L);
      this.a($$0, this.t, this.o, this.z, ddf.b.a(this.r[0], this.r[1]), $$1, 0.0F, ddd.K);
      this.a($$0, this.s, this.o, ddf.b.a(this.x, this.B), ddf.b.a(this.r[2], this.r[5]), $$1, 0.0F, ddd.L);
      this.a($$0, this.t, this.o, ddf.b.a(this.x, this.B), ddf.b.a(this.r[2], this.r[5]), $$1, 0.0F, ddd.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, ddd.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, ddd.K);
      this.a($$0, ddf.b.a(this.p[1], this.p[2]), this.o, ddf.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddd.g);
      this.a($$0, ddf.b.a(this.p[3], this.p[4]), this.o, ddf.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddd.h);
      this.a($$0, this.s, this.o, ddf.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddd.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddf.b $$5 = this.q[$$4];
            ald<dcw> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddf.b.a(this.A, this.B), ddf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<ddf.d, ald<dcw>>> $$0) {
      this.b($$0, this.o, this.o, ddf.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, ddd.Z);
      this.b($$0, this.o, ddf.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, ddd.aa);
      this.c($$0, this.o, this.o, this.o, ddf.b.a(this.r[0], this.r[1]), this.o, 0.0F, ddd.ab);
   }

   private ald<dcw> a(int $$0, int $$1, ddf.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         ald<dcw> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private ald<dcw> b(int $$0, int $$1, ddf.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private ald<dcw> c(int $$0, int $$1, ddf.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private ald<dcw> a(int $$0, int $$1, ddf.b $$2, ald<dcw> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? ddd.w : $$3;
   }

   private ald<dcw> d(int $$0, int $$1, ddf.b $$2) {
      ald<dcw> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private ald<dcw> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return ddd.N;
      } else {
         return $$0 == 4 ? ddd.f : ddd.M;
      }
   }

   private ald<dcw> a(int $$0, ddf.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? ddd.A : ddd.B;
      } else {
         return $$0 < 3 ? ddd.A : ddd.C;
      }
   }

   private ald<dcw> e(int $$0, int $$1, ddf.b $$2) {
      if ($$2.b() >= 0L) {
         ald<dcw> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private ald<dcw> f(int $$0, int $$1, ddf.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? ddd.I : ddd.H;
      } else {
         return $$0 == 3 ? ddd.J : this.a($$1, $$2);
      }
   }

   private ald<dcw> g(int $$0, int $$1, ddf.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? ddd.G : ddd.F;
      }
   }

   private ald<dcw> h(int $$0, int $$1, ddf.b $$2) {
      ald<dcw> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<ddf.d, ald<dcw>>> $$0, ddf.b $$1, ddf.b $$2, ddf.b $$3, ddf.b $$4, ddf.b $$5, float $$6, ald<dcw> $$7) {
      $$0.accept(Pair.of(ddf.a($$1, $$2, $$3, $$4, ddf.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(ddf.a($$1, $$2, $$3, $$4, ddf.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<ddf.d, ald<dcw>>> $$0, ddf.b $$1, ddf.b $$2, ddf.b $$3, ddf.b $$4, ddf.b $$5, float $$6, ald<dcw> $$7) {
      $$0.accept(Pair.of(ddf.a($$1, $$2, $$3, $$4, ddf.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<ddf.d, ald<dcw>>> $$0, ddf.b $$1, ddf.b $$2, ddf.b $$3, ddf.b $$4, ddf.b $$5, float $$6, ald<dcw> $$7) {
      $$0.accept(Pair.of(ddf.a($$1, $$2, $$3, $$4, ddf.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dxm $$0, dxm $$1, dxm.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dya.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dya.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dya.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dya.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)ddf.a((float)$$0);
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

   private static String a(double $$0, ddf.b[] $$1) {
      double $$2 = (double)ddf.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bac
   public ddf.b[] b() {
      return this.p;
   }

   @bac
   public ddf.b[] c() {
      return this.q;
   }

   @bac
   public ddf.b[] d() {
      return this.r;
   }

   @bac
   public ddf.b[] e() {
      return new ddf.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @bac
   public ddf.b[] f() {
      return new ddf.b[]{
         ddf.b.a(-2.0F, dya.a(0.05F)),
         ddf.b.a(dya.a(0.05F), dya.a(0.26666668F)),
         ddf.b.a(dya.a(0.26666668F), dya.a(0.4F)),
         ddf.b.a(dya.a(0.4F), dya.a(0.56666666F)),
         ddf.b.a(dya.a(0.56666666F), 2.0F)
      };
   }

   @bac
   public ddf.b[] g() {
      return new ddf.b[]{ddf.b.a(-2.0F, 0.0F), ddf.b.a(0.0F, 2.0F)};
   }
}
