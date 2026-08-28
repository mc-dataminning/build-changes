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
   private final dil.b o = dil.b.a(-1.0F, 1.0F);
   private final dil.b[] p = new dil.b[]{dil.b.a(-1.0F, -0.45F), dil.b.a(-0.45F, -0.15F), dil.b.a(-0.15F, 0.2F), dil.b.a(0.2F, 0.55F), dil.b.a(0.55F, 1.0F)};
   private final dil.b[] q = new dil.b[]{dil.b.a(-1.0F, -0.35F), dil.b.a(-0.35F, -0.1F), dil.b.a(-0.1F, 0.1F), dil.b.a(0.1F, 0.3F), dil.b.a(0.3F, 1.0F)};
   private final dil.b[] r = new dil.b[]{
      dil.b.a(-1.0F, -0.78F),
      dil.b.a(-0.78F, -0.375F),
      dil.b.a(-0.375F, -0.2225F),
      dil.b.a(-0.2225F, 0.05F),
      dil.b.a(0.05F, 0.45F),
      dil.b.a(0.45F, 0.55F),
      dil.b.a(0.55F, 1.0F)
   };
   private final dil.b s = this.p[0];
   private final dil.b t = dil.b.a(this.p[1], this.p[4]);
   private final dil.b u = dil.b.a(-1.2F, -1.05F);
   private final dil.b v = dil.b.a(-1.05F, -0.455F);
   private final dil.b w = dil.b.a(-0.455F, -0.19F);
   private final dil.b x = dil.b.a(-0.19F, -0.11F);
   private final dil.b y = dil.b.a(-0.11F, 0.55F);
   private final dil.b z = dil.b.a(-0.11F, 0.03F);
   private final dil.b A = dil.b.a(0.03F, 0.3F);
   private final dil.b B = dil.b.a(0.3F, 1.0F);
   private final akt<dic>[][] C = new akt[][]{{dij.Y, dij.W, dij.U, dij.S, dij.Q}, {dij.X, dij.V, dij.T, dij.R, dij.Q}};
   private final akt<dic>[][] D = new akt[][]{
      {dij.d, dij.d, dij.d, dij.r, dij.q},
      {dij.b, dij.b, dij.i, dij.q, dij.p},
      {dij.j, dij.b, dij.i, dij.k, dij.l},
      {dij.s, dij.s, dij.i, dij.y, dij.y},
      {dij.f, dij.f, dij.f, dij.f, dij.f}
   };
   private final akt<dic>[][] E = new akt[][]{
      {dij.e, null, dij.r, null, null},
      {null, null, null, null, dij.o},
      {dij.c, null, null, dij.n, null},
      {null, null, dij.b, dij.z, dij.A},
      {null, null, null, null, null}
   };
   private final akt<dic>[][] F = new akt[][]{
      {dij.d, dij.d, dij.d, dij.r, dij.r},
      {dij.E, dij.E, dij.i, dij.q, dij.p},
      {dij.E, dij.E, dij.E, dij.E, dij.m},
      {dij.t, dij.t, dij.i, dij.i, dij.y},
      {dij.B, dij.B, dij.B, dij.D, dij.D}
   };
   private final akt<dic>[][] G = new akt[][]{
      {dij.e, null, null, null, null},
      {dij.F, null, dij.E, dij.E, dij.o},
      {dij.F, dij.F, dij.i, dij.k, null},
      {null, null, null, null, null},
      {dij.C, dij.C, null, null, null}
   };
   private final akt<dic>[][] H = new akt[][]{
      {dij.v, dij.v, dij.u, dij.w, dij.w},
      {dij.v, dij.v, dij.u, dij.w, dij.w},
      {dij.u, dij.u, dij.u, dij.w, dij.w},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dil.d> a() {
      dil.b $$0 = dil.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dil.d(this.o, this.o, dil.b.a(this.y, this.o), this.o, $$0, dil.b.a(-1.0F, -0.16F), 0L),
         new dil.d(this.o, this.o, dil.b.a(this.y, this.o), this.o, $$0, dil.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dil.d, akt<dic>>> $$0) {
      if (ab.ar) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dil.d, akt<dic>>> $$0) {
      jt.a $$1 = or.a();
      js<edh> $$2 = $$1.d(mc.aN);
      edi.w.a $$3 = new edi.w.a($$2.b(edv.d));
      edi.w.a $$4 = new edi.w.a($$2.b(edv.e));
      edi.w.a $$5 = new edi.w.a($$2.b(edv.g));
      $$0.accept(Pair.of(dil.a(this.o, this.o, this.o, this.o, dil.b.a(0.0F), this.o, 0.01F), dij.b));
      if (qt.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, bac.a) instanceof ayb.e<?, ?> $$7) {
         akt<dic> $$8 = dij.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dil.a(this.o, this.o, this.o, dil.b.a($$9), dil.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dij.f ? dij.B : dij.f;
         }
      }

      if (qt.a($$3, $$4, $$5, false) instanceof ayb.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dil.a(this.o, this.o, dil.b.a($$12), this.o, dil.b.a(0.0F), this.o, 0.0F), dij.r));
         }
      }
   }

   private void c(Consumer<Pair<dil.d, akt<dic>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dij.Z);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dil.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dil.d, akt<dic>>> $$0) {
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

   private void a(Consumer<Pair<dil.d, akt<dic>>> $$0, dil.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dil.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dil.b $$5 = this.q[$$4];
            akt<dic> $$6 = this.a($$2, $$4, $$1);
            akt<dic> $$7 = this.b($$2, $$4, $$1);
            akt<dic> $$8 = this.c($$2, $$4, $$1);
            akt<dic> $$9 = this.e($$2, $$4, $$1);
            akt<dic> $$10 = this.h($$2, $$4, $$1);
            akt<dic> $$11 = this.a($$2, $$4, $$1, $$10);
            akt<dic> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dil.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dil.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dil.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dil.b.a(this.x, this.z), dil.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dil.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dil.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dil.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dil.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dil.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dil.d, akt<dic>>> $$0, dil.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dil.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dil.b $$5 = this.q[$$4];
            akt<dic> $$6 = this.a($$2, $$4, $$1);
            akt<dic> $$7 = this.b($$2, $$4, $$1);
            akt<dic> $$8 = this.c($$2, $$4, $$1);
            akt<dic> $$9 = this.e($$2, $$4, $$1);
            akt<dic> $$10 = this.h($$2, $$4, $$1);
            akt<dic> $$11 = this.a($$2, $$4, $$1, $$6);
            akt<dic> $$12 = this.g($$2, $$4, $$1);
            akt<dic> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dil.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dil.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dil.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dil.b.a(this.x, this.z), dil.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dil.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dil.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dil.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dil.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dil.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dil.d, akt<dic>>> $$0, dil.b $$1) {
      this.a($$0, this.o, this.o, this.x, dil.b.a(this.r[0], this.r[2]), $$1, 0.0F, dij.P);
      this.a($$0, dil.b.a(this.p[1], this.p[2]), this.o, dil.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dij.g);
      this.a($$0, dil.b.a(this.p[3], this.p[4]), this.o, dil.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dij.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dil.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dil.b $$5 = this.q[$$4];
            akt<dic> $$6 = this.a($$2, $$4, $$1);
            akt<dic> $$7 = this.b($$2, $$4, $$1);
            akt<dic> $$8 = this.c($$2, $$4, $$1);
            akt<dic> $$9 = this.h($$2, $$4, $$1);
            akt<dic> $$10 = this.e($$2, $$4, $$1);
            akt<dic> $$11 = this.a($$2, $$4);
            akt<dic> $$12 = this.a($$2, $$4, $$1, $$6);
            akt<dic> $$13 = this.d($$2, $$4, $$1);
            akt<dic> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dil.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dil.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dil.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dil.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dil.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dil.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dil.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dil.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dil.d, akt<dic>>> $$0, dil.b $$1) {
      this.a($$0, this.o, this.o, this.x, dil.b.a(this.r[0], this.r[2]), $$1, 0.0F, dij.P);
      this.a($$0, dil.b.a(this.p[1], this.p[2]), this.o, dil.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dij.g);
      this.a($$0, dil.b.a(this.p[3], this.p[4]), this.o, dil.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dij.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dil.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dil.b $$5 = this.q[$$4];
            akt<dic> $$6 = this.a($$2, $$4, $$1);
            akt<dic> $$7 = this.b($$2, $$4, $$1);
            akt<dic> $$8 = this.c($$2, $$4, $$1);
            akt<dic> $$9 = this.a($$2, $$4);
            akt<dic> $$10 = this.a($$2, $$4, $$1, $$6);
            akt<dic> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dil.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dil.b.a(this.A, this.B), dil.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dil.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dil.b.a(this.A, this.B), dil.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dil.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dil.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dil.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dil.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dil.d, akt<dic>>> $$0, dil.b $$1) {
      this.a($$0, this.s, this.o, this.x, dil.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dij.P : dij.M);
      this.a($$0, this.t, this.o, this.x, dil.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dij.P : dij.L);
      this.a($$0, this.s, this.o, this.z, dil.b.a(this.r[0], this.r[1]), $$1, 0.0F, dij.M);
      this.a($$0, this.t, this.o, this.z, dil.b.a(this.r[0], this.r[1]), $$1, 0.0F, dij.L);
      this.a($$0, this.s, this.o, dil.b.a(this.x, this.B), dil.b.a(this.r[2], this.r[5]), $$1, 0.0F, dij.M);
      this.a($$0, this.t, this.o, dil.b.a(this.x, this.B), dil.b.a(this.r[2], this.r[5]), $$1, 0.0F, dij.L);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dij.M);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dij.L);
      this.a($$0, dil.b.a(this.p[1], this.p[2]), this.o, dil.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dij.g);
      this.a($$0, dil.b.a(this.p[3], this.p[4]), this.o, dil.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dij.h);
      this.a($$0, this.s, this.o, dil.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dij.M);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dil.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dil.b $$5 = this.q[$$4];
            akt<dic> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dil.b.a(this.A, this.B), dil.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dil.d, akt<dic>>> $$0) {
      this.b($$0, this.o, this.o, dil.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dij.aa);
      this.b($$0, this.o, dil.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dij.ab);
      this.c($$0, this.o, this.o, this.o, dil.b.a(this.r[0], this.r[1]), this.o, 0.0F, dij.ac);
   }

   private akt<dic> a(int $$0, int $$1, dil.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         akt<dic> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private akt<dic> b(int $$0, int $$1, dil.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private akt<dic> c(int $$0, int $$1, dil.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private akt<dic> a(int $$0, int $$1, dil.b $$2, akt<dic> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dij.x : $$3;
   }

   private akt<dic> d(int $$0, int $$1, dil.b $$2) {
      akt<dic> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private akt<dic> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dij.O;
      } else {
         return $$0 == 4 ? dij.f : dij.N;
      }
   }

   private akt<dic> a(int $$0, dil.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dij.B : dij.C;
      } else {
         return $$0 < 3 ? dij.B : dij.D;
      }
   }

   private akt<dic> e(int $$0, int $$1, dil.b $$2) {
      if ($$2.b() >= 0L) {
         akt<dic> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private akt<dic> f(int $$0, int $$1, dil.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dij.J : dij.I;
      } else {
         return $$0 == 3 ? dij.K : this.a($$1, $$2);
      }
   }

   private akt<dic> g(int $$0, int $$1, dil.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dij.H : dij.G;
      }
   }

   private akt<dic> h(int $$0, int $$1, dil.b $$2) {
      akt<dic> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dil.d, akt<dic>>> $$0, dil.b $$1, dil.b $$2, dil.b $$3, dil.b $$4, dil.b $$5, float $$6, akt<dic> $$7) {
      $$0.accept(Pair.of(dil.a($$1, $$2, $$3, $$4, dil.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dil.a($$1, $$2, $$3, $$4, dil.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dil.d, akt<dic>>> $$0, dil.b $$1, dil.b $$2, dil.b $$3, dil.b $$4, dil.b $$5, float $$6, akt<dic> $$7) {
      $$0.accept(Pair.of(dil.a($$1, $$2, $$3, $$4, dil.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dil.d, akt<dic>>> $$0, dil.b $$1, dil.b $$2, dil.b $$3, dil.b $$4, dil.b $$5, float $$6, akt<dic> $$7) {
      $$0.accept(Pair.of(dil.a($$1, $$2, $$3, $$4, dil.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(edh $$0, edh $$1, edh.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)edv.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)edv.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)edv.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)edv.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dil.a((float)$$0);
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

   private static String a(double $$0, dil.b[] $$1) {
      double $$2 = (double)dil.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bag
   public dil.b[] b() {
      return this.p;
   }

   @bag
   public dil.b[] c() {
      return this.q;
   }

   @bag
   public dil.b[] d() {
      return this.r;
   }

   @bag
   public dil.b[] e() {
      return new dil.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @bag
   public dil.b[] f() {
      return new dil.b[]{
         dil.b.a(-2.0F, edv.a(0.05F)),
         dil.b.a(edv.a(0.05F), edv.a(0.26666668F)),
         dil.b.a(edv.a(0.26666668F), edv.a(0.4F)),
         dil.b.a(edv.a(0.4F), edv.a(0.56666666F)),
         dil.b.a(edv.a(0.56666666F), 2.0F)
      };
   }

   @bag
   public dil.b[] g() {
      return new dil.b[]{dil.b.a(-2.0F, 0.0F), dil.b.a(0.0F, 2.0F)};
   }
}
