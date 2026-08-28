import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dhz {
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
   private final dhs.b o = dhs.b.a(-1.0F, 1.0F);
   private final dhs.b[] p = new dhs.b[]{dhs.b.a(-1.0F, -0.45F), dhs.b.a(-0.45F, -0.15F), dhs.b.a(-0.15F, 0.2F), dhs.b.a(0.2F, 0.55F), dhs.b.a(0.55F, 1.0F)};
   private final dhs.b[] q = new dhs.b[]{dhs.b.a(-1.0F, -0.35F), dhs.b.a(-0.35F, -0.1F), dhs.b.a(-0.1F, 0.1F), dhs.b.a(0.1F, 0.3F), dhs.b.a(0.3F, 1.0F)};
   private final dhs.b[] r = new dhs.b[]{
      dhs.b.a(-1.0F, -0.78F),
      dhs.b.a(-0.78F, -0.375F),
      dhs.b.a(-0.375F, -0.2225F),
      dhs.b.a(-0.2225F, 0.05F),
      dhs.b.a(0.05F, 0.45F),
      dhs.b.a(0.45F, 0.55F),
      dhs.b.a(0.55F, 1.0F)
   };
   private final dhs.b s = this.p[0];
   private final dhs.b t = dhs.b.a(this.p[1], this.p[4]);
   private final dhs.b u = dhs.b.a(-1.2F, -1.05F);
   private final dhs.b v = dhs.b.a(-1.05F, -0.455F);
   private final dhs.b w = dhs.b.a(-0.455F, -0.19F);
   private final dhs.b x = dhs.b.a(-0.19F, -0.11F);
   private final dhs.b y = dhs.b.a(-0.11F, 0.55F);
   private final dhs.b z = dhs.b.a(-0.11F, 0.03F);
   private final dhs.b A = dhs.b.a(0.03F, 0.3F);
   private final dhs.b B = dhs.b.a(0.3F, 1.0F);
   private final aku<dhj>[][] C = new aku[][]{{dhq.Y, dhq.W, dhq.U, dhq.S, dhq.Q}, {dhq.X, dhq.V, dhq.T, dhq.R, dhq.Q}};
   private final aku<dhj>[][] D = new aku[][]{
      {dhq.d, dhq.d, dhq.d, dhq.r, dhq.q},
      {dhq.b, dhq.b, dhq.i, dhq.q, dhq.p},
      {dhq.j, dhq.b, dhq.i, dhq.k, dhq.l},
      {dhq.s, dhq.s, dhq.i, dhq.y, dhq.y},
      {dhq.f, dhq.f, dhq.f, dhq.f, dhq.f}
   };
   private final aku<dhj>[][] E = new aku[][]{
      {dhq.e, null, dhq.r, null, null},
      {null, null, null, null, dhq.o},
      {dhq.c, null, null, dhq.n, null},
      {null, null, dhq.b, dhq.z, dhq.A},
      {null, null, null, null, null}
   };
   private final aku<dhj>[][] F = new aku[][]{
      {dhq.d, dhq.d, dhq.d, dhq.r, dhq.r},
      {dhq.E, dhq.E, dhq.i, dhq.q, dhq.p},
      {dhq.E, dhq.E, dhq.E, dhq.E, dhq.l},
      {dhq.t, dhq.t, dhq.i, dhq.i, dhq.y},
      {dhq.B, dhq.B, dhq.B, dhq.D, dhq.D}
   };
   private final aku<dhj>[][] G = new aku[][]{
      {dhq.e, null, null, null, null},
      {dhq.F, null, dhq.E, dhq.E, dhq.o},
      {dhq.F, dhq.F, dhq.i, dhq.k, dhq.m},
      {null, null, null, null, null},
      {dhq.C, dhq.C, null, null, null}
   };
   private final aku<dhj>[][] H = new aku[][]{
      {dhq.v, dhq.v, dhq.u, dhq.w, dhq.w},
      {dhq.v, dhq.v, dhq.u, dhq.w, dhq.w},
      {dhq.u, dhq.u, dhq.u, dhq.w, dhq.w},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dhs.d> a() {
      dhs.b $$0 = dhs.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dhs.d(this.o, this.o, dhs.b.a(this.y, this.o), this.o, $$0, dhs.b.a(-1.0F, -0.16F), 0L),
         new dhs.d(this.o, this.o, dhs.b.a(this.y, this.o), this.o, $$0, dhs.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dhs.d, aku<dhj>>> $$0) {
      if (ab.ar) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dhs.d, aku<dhj>>> $$0) {
      jt.a $$1 = or.a();
      js<eck> $$2 = $$1.d(mc.aM);
      ecl.w.a $$3 = new ecl.w.a($$2.b(ecy.d));
      ecl.w.a $$4 = new ecl.w.a($$2.b(ecy.e));
      ecl.w.a $$5 = new ecl.w.a($$2.b(ecy.g));
      $$0.accept(Pair.of(dhs.a(this.o, this.o, this.o, this.o, dhs.b.a(0.0F), this.o, 0.01F), dhq.b));
      if (qt.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, bac.a) instanceof ayb.e<?, ?> $$7) {
         aku<dhj> $$8 = dhq.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dhs.a(this.o, this.o, this.o, dhs.b.a($$9), dhs.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dhq.f ? dhq.B : dhq.f;
         }
      }

      if (qt.a($$3, $$4, $$5, false) instanceof ayb.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dhs.a(this.o, this.o, dhs.b.a($$12), this.o, dhs.b.a(0.0F), this.o, 0.0F), dhq.r));
         }
      }
   }

   private void c(Consumer<Pair<dhs.d, aku<dhj>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dhq.Z);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dhs.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dhs.d, aku<dhj>>> $$0) {
      this.c($$0, dhs.b.a(-1.0F, -0.93333334F));
      this.b($$0, dhs.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dhs.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dhs.b.a(-0.56666666F, -0.4F));
      this.c($$0, dhs.b.a(-0.4F, -0.26666668F));
      this.d($$0, dhs.b.a(-0.26666668F, -0.05F));
      this.e($$0, dhs.b.a(-0.05F, 0.05F));
      this.d($$0, dhs.b.a(0.05F, 0.26666668F));
      this.c($$0, dhs.b.a(0.26666668F, 0.4F));
      this.b($$0, dhs.b.a(0.4F, 0.56666666F));
      this.a($$0, dhs.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dhs.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dhs.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dhs.d, aku<dhj>>> $$0, dhs.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dhs.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dhs.b $$5 = this.q[$$4];
            aku<dhj> $$6 = this.a($$2, $$4, $$1);
            aku<dhj> $$7 = this.b($$2, $$4, $$1);
            aku<dhj> $$8 = this.c($$2, $$4, $$1);
            aku<dhj> $$9 = this.e($$2, $$4, $$1);
            aku<dhj> $$10 = this.h($$2, $$4, $$1);
            aku<dhj> $$11 = this.a($$2, $$4, $$1, $$10);
            aku<dhj> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dhs.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dhs.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dhs.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dhs.b.a(this.x, this.z), dhs.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dhs.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dhs.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dhs.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dhs.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dhs.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dhs.d, aku<dhj>>> $$0, dhs.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dhs.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dhs.b $$5 = this.q[$$4];
            aku<dhj> $$6 = this.a($$2, $$4, $$1);
            aku<dhj> $$7 = this.b($$2, $$4, $$1);
            aku<dhj> $$8 = this.c($$2, $$4, $$1);
            aku<dhj> $$9 = this.e($$2, $$4, $$1);
            aku<dhj> $$10 = this.h($$2, $$4, $$1);
            aku<dhj> $$11 = this.a($$2, $$4, $$1, $$6);
            aku<dhj> $$12 = this.g($$2, $$4, $$1);
            aku<dhj> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dhs.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dhs.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dhs.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dhs.b.a(this.x, this.z), dhs.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dhs.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dhs.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dhs.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dhs.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dhs.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dhs.d, aku<dhj>>> $$0, dhs.b $$1) {
      this.a($$0, this.o, this.o, this.x, dhs.b.a(this.r[0], this.r[2]), $$1, 0.0F, dhq.P);
      this.a($$0, dhs.b.a(this.p[1], this.p[2]), this.o, dhs.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dhq.g);
      this.a($$0, dhs.b.a(this.p[3], this.p[4]), this.o, dhs.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dhq.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dhs.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dhs.b $$5 = this.q[$$4];
            aku<dhj> $$6 = this.a($$2, $$4, $$1);
            aku<dhj> $$7 = this.b($$2, $$4, $$1);
            aku<dhj> $$8 = this.c($$2, $$4, $$1);
            aku<dhj> $$9 = this.h($$2, $$4, $$1);
            aku<dhj> $$10 = this.e($$2, $$4, $$1);
            aku<dhj> $$11 = this.a($$2, $$4);
            aku<dhj> $$12 = this.a($$2, $$4, $$1, $$6);
            aku<dhj> $$13 = this.d($$2, $$4, $$1);
            aku<dhj> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dhs.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dhs.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dhs.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dhs.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dhs.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dhs.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dhs.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dhs.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dhs.d, aku<dhj>>> $$0, dhs.b $$1) {
      this.a($$0, this.o, this.o, this.x, dhs.b.a(this.r[0], this.r[2]), $$1, 0.0F, dhq.P);
      this.a($$0, dhs.b.a(this.p[1], this.p[2]), this.o, dhs.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dhq.g);
      this.a($$0, dhs.b.a(this.p[3], this.p[4]), this.o, dhs.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dhq.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dhs.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dhs.b $$5 = this.q[$$4];
            aku<dhj> $$6 = this.a($$2, $$4, $$1);
            aku<dhj> $$7 = this.b($$2, $$4, $$1);
            aku<dhj> $$8 = this.c($$2, $$4, $$1);
            aku<dhj> $$9 = this.a($$2, $$4);
            aku<dhj> $$10 = this.a($$2, $$4, $$1, $$6);
            aku<dhj> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dhs.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dhs.b.a(this.A, this.B), dhs.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dhs.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dhs.b.a(this.A, this.B), dhs.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dhs.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dhs.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dhs.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dhs.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dhs.d, aku<dhj>>> $$0, dhs.b $$1) {
      this.a($$0, this.s, this.o, this.x, dhs.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dhq.P : dhq.M);
      this.a($$0, this.t, this.o, this.x, dhs.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dhq.P : dhq.L);
      this.a($$0, this.s, this.o, this.z, dhs.b.a(this.r[0], this.r[1]), $$1, 0.0F, dhq.M);
      this.a($$0, this.t, this.o, this.z, dhs.b.a(this.r[0], this.r[1]), $$1, 0.0F, dhq.L);
      this.a($$0, this.s, this.o, dhs.b.a(this.x, this.B), dhs.b.a(this.r[2], this.r[5]), $$1, 0.0F, dhq.M);
      this.a($$0, this.t, this.o, dhs.b.a(this.x, this.B), dhs.b.a(this.r[2], this.r[5]), $$1, 0.0F, dhq.L);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dhq.M);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dhq.L);
      this.a($$0, dhs.b.a(this.p[1], this.p[2]), this.o, dhs.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dhq.g);
      this.a($$0, dhs.b.a(this.p[3], this.p[4]), this.o, dhs.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dhq.h);
      this.a($$0, this.s, this.o, dhs.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dhq.M);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dhs.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dhs.b $$5 = this.q[$$4];
            aku<dhj> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dhs.b.a(this.A, this.B), dhs.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dhs.d, aku<dhj>>> $$0) {
      this.b($$0, this.o, this.o, dhs.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dhq.aa);
      this.b($$0, this.o, dhs.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dhq.ab);
      this.c($$0, this.o, this.o, this.o, dhs.b.a(this.r[0], this.r[1]), this.o, 0.0F, dhq.ac);
   }

   private aku<dhj> a(int $$0, int $$1, dhs.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         aku<dhj> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private aku<dhj> b(int $$0, int $$1, dhs.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private aku<dhj> c(int $$0, int $$1, dhs.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private aku<dhj> a(int $$0, int $$1, dhs.b $$2, aku<dhj> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dhq.x : $$3;
   }

   private aku<dhj> d(int $$0, int $$1, dhs.b $$2) {
      aku<dhj> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private aku<dhj> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dhq.O;
      } else {
         return $$0 == 4 ? dhq.f : dhq.N;
      }
   }

   private aku<dhj> a(int $$0, dhs.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dhq.B : dhq.C;
      } else {
         return $$0 < 3 ? dhq.B : dhq.D;
      }
   }

   private aku<dhj> e(int $$0, int $$1, dhs.b $$2) {
      if ($$2.b() >= 0L) {
         aku<dhj> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private aku<dhj> f(int $$0, int $$1, dhs.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dhq.J : dhq.I;
      } else {
         return $$0 == 3 ? dhq.K : this.a($$1, $$2);
      }
   }

   private aku<dhj> g(int $$0, int $$1, dhs.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dhq.H : dhq.G;
      }
   }

   private aku<dhj> h(int $$0, int $$1, dhs.b $$2) {
      aku<dhj> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dhs.d, aku<dhj>>> $$0, dhs.b $$1, dhs.b $$2, dhs.b $$3, dhs.b $$4, dhs.b $$5, float $$6, aku<dhj> $$7) {
      $$0.accept(Pair.of(dhs.a($$1, $$2, $$3, $$4, dhs.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dhs.a($$1, $$2, $$3, $$4, dhs.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dhs.d, aku<dhj>>> $$0, dhs.b $$1, dhs.b $$2, dhs.b $$3, dhs.b $$4, dhs.b $$5, float $$6, aku<dhj> $$7) {
      $$0.accept(Pair.of(dhs.a($$1, $$2, $$3, $$4, dhs.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dhs.d, aku<dhj>>> $$0, dhs.b $$1, dhs.b $$2, dhs.b $$3, dhs.b $$4, dhs.b $$5, float $$6, aku<dhj> $$7) {
      $$0.accept(Pair.of(dhs.a($$1, $$2, $$3, $$4, dhs.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(eck $$0, eck $$1, eck.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)ecy.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)ecy.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)ecy.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)ecy.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dhs.a((float)$$0);
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

   private static String a(double $$0, dhs.b[] $$1) {
      double $$2 = (double)dhs.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bag
   public dhs.b[] b() {
      return this.p;
   }

   @bag
   public dhs.b[] c() {
      return this.q;
   }

   @bag
   public dhs.b[] d() {
      return this.r;
   }

   @bag
   public dhs.b[] e() {
      return new dhs.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @bag
   public dhs.b[] f() {
      return new dhs.b[]{
         dhs.b.a(-2.0F, ecy.a(0.05F)),
         dhs.b.a(ecy.a(0.05F), ecy.a(0.26666668F)),
         dhs.b.a(ecy.a(0.26666668F), ecy.a(0.4F)),
         dhs.b.a(ecy.a(0.4F), ecy.a(0.56666666F)),
         dhs.b.a(ecy.a(0.56666666F), 2.0F)
      };
   }

   @bag
   public dhs.b[] g() {
      return new dhs.b[]{dhs.b.a(-2.0F, 0.0F), dhs.b.a(0.0F, 2.0F)};
   }
}
