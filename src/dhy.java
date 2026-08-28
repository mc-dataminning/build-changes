import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dhy {
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
   private final dhr.b o = dhr.b.a(-1.0F, 1.0F);
   private final dhr.b[] p = new dhr.b[]{dhr.b.a(-1.0F, -0.45F), dhr.b.a(-0.45F, -0.15F), dhr.b.a(-0.15F, 0.2F), dhr.b.a(0.2F, 0.55F), dhr.b.a(0.55F, 1.0F)};
   private final dhr.b[] q = new dhr.b[]{dhr.b.a(-1.0F, -0.35F), dhr.b.a(-0.35F, -0.1F), dhr.b.a(-0.1F, 0.1F), dhr.b.a(0.1F, 0.3F), dhr.b.a(0.3F, 1.0F)};
   private final dhr.b[] r = new dhr.b[]{
      dhr.b.a(-1.0F, -0.78F),
      dhr.b.a(-0.78F, -0.375F),
      dhr.b.a(-0.375F, -0.2225F),
      dhr.b.a(-0.2225F, 0.05F),
      dhr.b.a(0.05F, 0.45F),
      dhr.b.a(0.45F, 0.55F),
      dhr.b.a(0.55F, 1.0F)
   };
   private final dhr.b s = this.p[0];
   private final dhr.b t = dhr.b.a(this.p[1], this.p[4]);
   private final dhr.b u = dhr.b.a(-1.2F, -1.05F);
   private final dhr.b v = dhr.b.a(-1.05F, -0.455F);
   private final dhr.b w = dhr.b.a(-0.455F, -0.19F);
   private final dhr.b x = dhr.b.a(-0.19F, -0.11F);
   private final dhr.b y = dhr.b.a(-0.11F, 0.55F);
   private final dhr.b z = dhr.b.a(-0.11F, 0.03F);
   private final dhr.b A = dhr.b.a(0.03F, 0.3F);
   private final dhr.b B = dhr.b.a(0.3F, 1.0F);
   private final akt<dhi>[][] C = new akt[][]{{dhp.Y, dhp.W, dhp.U, dhp.S, dhp.Q}, {dhp.X, dhp.V, dhp.T, dhp.R, dhp.Q}};
   private final akt<dhi>[][] D = new akt[][]{
      {dhp.d, dhp.d, dhp.d, dhp.r, dhp.q},
      {dhp.b, dhp.b, dhp.i, dhp.q, dhp.p},
      {dhp.j, dhp.b, dhp.i, dhp.k, dhp.l},
      {dhp.s, dhp.s, dhp.i, dhp.y, dhp.y},
      {dhp.f, dhp.f, dhp.f, dhp.f, dhp.f}
   };
   private final akt<dhi>[][] E = new akt[][]{
      {dhp.e, null, dhp.r, null, null},
      {null, null, null, null, dhp.o},
      {dhp.c, null, null, dhp.n, null},
      {null, null, dhp.b, dhp.z, dhp.A},
      {null, null, null, null, null}
   };
   private final akt<dhi>[][] F = new akt[][]{
      {dhp.d, dhp.d, dhp.d, dhp.r, dhp.r},
      {dhp.E, dhp.E, dhp.i, dhp.q, dhp.p},
      {dhp.E, dhp.E, dhp.E, dhp.E, dhp.l},
      {dhp.t, dhp.t, dhp.i, dhp.i, dhp.y},
      {dhp.B, dhp.B, dhp.B, dhp.D, dhp.D}
   };
   private final akt<dhi>[][] G = new akt[][]{
      {dhp.e, null, null, null, null},
      {dhp.F, null, dhp.E, dhp.E, dhp.o},
      {dhp.F, dhp.F, dhp.i, dhp.k, dhp.m},
      {null, null, null, null, null},
      {dhp.C, dhp.C, null, null, null}
   };
   private final akt<dhi>[][] H = new akt[][]{
      {dhp.v, dhp.v, dhp.u, dhp.w, dhp.w},
      {dhp.v, dhp.v, dhp.u, dhp.w, dhp.w},
      {dhp.u, dhp.u, dhp.u, dhp.w, dhp.w},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dhr.d> a() {
      dhr.b $$0 = dhr.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dhr.d(this.o, this.o, dhr.b.a(this.y, this.o), this.o, $$0, dhr.b.a(-1.0F, -0.16F), 0L),
         new dhr.d(this.o, this.o, dhr.b.a(this.y, this.o), this.o, $$0, dhr.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dhr.d, akt<dhi>>> $$0) {
      if (ab.ar) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dhr.d, akt<dhi>>> $$0) {
      jt.a $$1 = or.a();
      js<ecj> $$2 = $$1.d(mc.aM);
      eck.w.a $$3 = new eck.w.a($$2.b(ecx.d));
      eck.w.a $$4 = new eck.w.a($$2.b(ecx.e));
      eck.w.a $$5 = new eck.w.a($$2.b(ecx.g));
      $$0.accept(Pair.of(dhr.a(this.o, this.o, this.o, this.o, dhr.b.a(0.0F), this.o, 0.01F), dhp.b));
      if (qt.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, bab.a) instanceof aya.e<?, ?> $$7) {
         akt<dhi> $$8 = dhp.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dhr.a(this.o, this.o, this.o, dhr.b.a($$9), dhr.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dhp.f ? dhp.B : dhp.f;
         }
      }

      if (qt.a($$3, $$4, $$5, false) instanceof aya.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dhr.a(this.o, this.o, dhr.b.a($$12), this.o, dhr.b.a(0.0F), this.o, 0.0F), dhp.r));
         }
      }
   }

   private void c(Consumer<Pair<dhr.d, akt<dhi>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dhp.Z);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dhr.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dhr.d, akt<dhi>>> $$0) {
      this.c($$0, dhr.b.a(-1.0F, -0.93333334F));
      this.b($$0, dhr.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dhr.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dhr.b.a(-0.56666666F, -0.4F));
      this.c($$0, dhr.b.a(-0.4F, -0.26666668F));
      this.d($$0, dhr.b.a(-0.26666668F, -0.05F));
      this.e($$0, dhr.b.a(-0.05F, 0.05F));
      this.d($$0, dhr.b.a(0.05F, 0.26666668F));
      this.c($$0, dhr.b.a(0.26666668F, 0.4F));
      this.b($$0, dhr.b.a(0.4F, 0.56666666F));
      this.a($$0, dhr.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dhr.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dhr.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dhr.d, akt<dhi>>> $$0, dhr.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dhr.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dhr.b $$5 = this.q[$$4];
            akt<dhi> $$6 = this.a($$2, $$4, $$1);
            akt<dhi> $$7 = this.b($$2, $$4, $$1);
            akt<dhi> $$8 = this.c($$2, $$4, $$1);
            akt<dhi> $$9 = this.e($$2, $$4, $$1);
            akt<dhi> $$10 = this.h($$2, $$4, $$1);
            akt<dhi> $$11 = this.a($$2, $$4, $$1, $$10);
            akt<dhi> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dhr.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dhr.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dhr.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dhr.b.a(this.x, this.z), dhr.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dhr.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dhr.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dhr.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dhr.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dhr.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dhr.d, akt<dhi>>> $$0, dhr.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dhr.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dhr.b $$5 = this.q[$$4];
            akt<dhi> $$6 = this.a($$2, $$4, $$1);
            akt<dhi> $$7 = this.b($$2, $$4, $$1);
            akt<dhi> $$8 = this.c($$2, $$4, $$1);
            akt<dhi> $$9 = this.e($$2, $$4, $$1);
            akt<dhi> $$10 = this.h($$2, $$4, $$1);
            akt<dhi> $$11 = this.a($$2, $$4, $$1, $$6);
            akt<dhi> $$12 = this.g($$2, $$4, $$1);
            akt<dhi> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dhr.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dhr.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dhr.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dhr.b.a(this.x, this.z), dhr.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dhr.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dhr.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dhr.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dhr.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dhr.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dhr.d, akt<dhi>>> $$0, dhr.b $$1) {
      this.a($$0, this.o, this.o, this.x, dhr.b.a(this.r[0], this.r[2]), $$1, 0.0F, dhp.P);
      this.a($$0, dhr.b.a(this.p[1], this.p[2]), this.o, dhr.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dhp.g);
      this.a($$0, dhr.b.a(this.p[3], this.p[4]), this.o, dhr.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dhp.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dhr.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dhr.b $$5 = this.q[$$4];
            akt<dhi> $$6 = this.a($$2, $$4, $$1);
            akt<dhi> $$7 = this.b($$2, $$4, $$1);
            akt<dhi> $$8 = this.c($$2, $$4, $$1);
            akt<dhi> $$9 = this.h($$2, $$4, $$1);
            akt<dhi> $$10 = this.e($$2, $$4, $$1);
            akt<dhi> $$11 = this.a($$2, $$4);
            akt<dhi> $$12 = this.a($$2, $$4, $$1, $$6);
            akt<dhi> $$13 = this.d($$2, $$4, $$1);
            akt<dhi> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dhr.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dhr.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dhr.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dhr.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dhr.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dhr.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dhr.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dhr.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dhr.d, akt<dhi>>> $$0, dhr.b $$1) {
      this.a($$0, this.o, this.o, this.x, dhr.b.a(this.r[0], this.r[2]), $$1, 0.0F, dhp.P);
      this.a($$0, dhr.b.a(this.p[1], this.p[2]), this.o, dhr.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dhp.g);
      this.a($$0, dhr.b.a(this.p[3], this.p[4]), this.o, dhr.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dhp.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dhr.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dhr.b $$5 = this.q[$$4];
            akt<dhi> $$6 = this.a($$2, $$4, $$1);
            akt<dhi> $$7 = this.b($$2, $$4, $$1);
            akt<dhi> $$8 = this.c($$2, $$4, $$1);
            akt<dhi> $$9 = this.a($$2, $$4);
            akt<dhi> $$10 = this.a($$2, $$4, $$1, $$6);
            akt<dhi> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dhr.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dhr.b.a(this.A, this.B), dhr.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dhr.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dhr.b.a(this.A, this.B), dhr.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dhr.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dhr.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dhr.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dhr.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dhr.d, akt<dhi>>> $$0, dhr.b $$1) {
      this.a($$0, this.s, this.o, this.x, dhr.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dhp.P : dhp.M);
      this.a($$0, this.t, this.o, this.x, dhr.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dhp.P : dhp.L);
      this.a($$0, this.s, this.o, this.z, dhr.b.a(this.r[0], this.r[1]), $$1, 0.0F, dhp.M);
      this.a($$0, this.t, this.o, this.z, dhr.b.a(this.r[0], this.r[1]), $$1, 0.0F, dhp.L);
      this.a($$0, this.s, this.o, dhr.b.a(this.x, this.B), dhr.b.a(this.r[2], this.r[5]), $$1, 0.0F, dhp.M);
      this.a($$0, this.t, this.o, dhr.b.a(this.x, this.B), dhr.b.a(this.r[2], this.r[5]), $$1, 0.0F, dhp.L);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dhp.M);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dhp.L);
      this.a($$0, dhr.b.a(this.p[1], this.p[2]), this.o, dhr.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dhp.g);
      this.a($$0, dhr.b.a(this.p[3], this.p[4]), this.o, dhr.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dhp.h);
      this.a($$0, this.s, this.o, dhr.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dhp.M);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dhr.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dhr.b $$5 = this.q[$$4];
            akt<dhi> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dhr.b.a(this.A, this.B), dhr.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dhr.d, akt<dhi>>> $$0) {
      this.b($$0, this.o, this.o, dhr.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dhp.aa);
      this.b($$0, this.o, dhr.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dhp.ab);
      this.c($$0, this.o, this.o, this.o, dhr.b.a(this.r[0], this.r[1]), this.o, 0.0F, dhp.ac);
   }

   private akt<dhi> a(int $$0, int $$1, dhr.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         akt<dhi> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private akt<dhi> b(int $$0, int $$1, dhr.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private akt<dhi> c(int $$0, int $$1, dhr.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private akt<dhi> a(int $$0, int $$1, dhr.b $$2, akt<dhi> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dhp.x : $$3;
   }

   private akt<dhi> d(int $$0, int $$1, dhr.b $$2) {
      akt<dhi> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private akt<dhi> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dhp.O;
      } else {
         return $$0 == 4 ? dhp.f : dhp.N;
      }
   }

   private akt<dhi> a(int $$0, dhr.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dhp.B : dhp.C;
      } else {
         return $$0 < 3 ? dhp.B : dhp.D;
      }
   }

   private akt<dhi> e(int $$0, int $$1, dhr.b $$2) {
      if ($$2.b() >= 0L) {
         akt<dhi> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private akt<dhi> f(int $$0, int $$1, dhr.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dhp.J : dhp.I;
      } else {
         return $$0 == 3 ? dhp.K : this.a($$1, $$2);
      }
   }

   private akt<dhi> g(int $$0, int $$1, dhr.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dhp.H : dhp.G;
      }
   }

   private akt<dhi> h(int $$0, int $$1, dhr.b $$2) {
      akt<dhi> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dhr.d, akt<dhi>>> $$0, dhr.b $$1, dhr.b $$2, dhr.b $$3, dhr.b $$4, dhr.b $$5, float $$6, akt<dhi> $$7) {
      $$0.accept(Pair.of(dhr.a($$1, $$2, $$3, $$4, dhr.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dhr.a($$1, $$2, $$3, $$4, dhr.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dhr.d, akt<dhi>>> $$0, dhr.b $$1, dhr.b $$2, dhr.b $$3, dhr.b $$4, dhr.b $$5, float $$6, akt<dhi> $$7) {
      $$0.accept(Pair.of(dhr.a($$1, $$2, $$3, $$4, dhr.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dhr.d, akt<dhi>>> $$0, dhr.b $$1, dhr.b $$2, dhr.b $$3, dhr.b $$4, dhr.b $$5, float $$6, akt<dhi> $$7) {
      $$0.accept(Pair.of(dhr.a($$1, $$2, $$3, $$4, dhr.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(ecj $$0, ecj $$1, ecj.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)ecx.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)ecx.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)ecx.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)ecx.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dhr.a((float)$$0);
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

   private static String a(double $$0, dhr.b[] $$1) {
      double $$2 = (double)dhr.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @baf
   public dhr.b[] b() {
      return this.p;
   }

   @baf
   public dhr.b[] c() {
      return this.q;
   }

   @baf
   public dhr.b[] d() {
      return this.r;
   }

   @baf
   public dhr.b[] e() {
      return new dhr.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @baf
   public dhr.b[] f() {
      return new dhr.b[]{
         dhr.b.a(-2.0F, ecx.a(0.05F)),
         dhr.b.a(ecx.a(0.05F), ecx.a(0.26666668F)),
         dhr.b.a(ecx.a(0.26666668F), ecx.a(0.4F)),
         dhr.b.a(ecx.a(0.4F), ecx.a(0.56666666F)),
         dhr.b.a(ecx.a(0.56666666F), 2.0F)
      };
   }

   @baf
   public dhr.b[] g() {
      return new dhr.b[]{dhr.b.a(-2.0F, 0.0F), dhr.b.a(0.0F, 2.0F)};
   }
}
