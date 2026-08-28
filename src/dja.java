import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dja {
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
   private final dja.a o;
   private final dit.b p = dit.b.a(-1.0F, 1.0F);
   private final dit.b[] q = new dit.b[]{dit.b.a(-1.0F, -0.45F), dit.b.a(-0.45F, -0.15F), dit.b.a(-0.15F, 0.2F), dit.b.a(0.2F, 0.55F), dit.b.a(0.55F, 1.0F)};
   private final dit.b[] r = new dit.b[]{dit.b.a(-1.0F, -0.35F), dit.b.a(-0.35F, -0.1F), dit.b.a(-0.1F, 0.1F), dit.b.a(0.1F, 0.3F), dit.b.a(0.3F, 1.0F)};
   private final dit.b[] s = new dit.b[]{
      dit.b.a(-1.0F, -0.78F),
      dit.b.a(-0.78F, -0.375F),
      dit.b.a(-0.375F, -0.2225F),
      dit.b.a(-0.2225F, 0.05F),
      dit.b.a(0.05F, 0.45F),
      dit.b.a(0.45F, 0.55F),
      dit.b.a(0.55F, 1.0F)
   };
   private final dit.b t = this.q[0];
   private final dit.b u = dit.b.a(this.q[1], this.q[4]);
   private final dit.b v = dit.b.a(-1.2F, -1.05F);
   private final dit.b w = dit.b.a(-1.05F, -0.455F);
   private final dit.b x = dit.b.a(-0.455F, -0.19F);
   private final dit.b y = dit.b.a(-0.19F, -0.11F);
   private final dit.b z = dit.b.a(-0.11F, 0.55F);
   private final dit.b A = dit.b.a(-0.11F, 0.03F);
   private final dit.b B = dit.b.a(0.03F, 0.3F);
   private final dit.b C = dit.b.a(0.3F, 1.0F);
   private final aly<dik>[][] D = new aly[][]{{dir.X, dir.V, dir.T, dir.R, dir.P}, {dir.W, dir.U, dir.S, dir.Q, dir.P}};
   private final aly<dik>[][] E = new aly[][]{
      {dir.d, dir.d, dir.d, dir.q, dir.p},
      {dir.b, dir.b, dir.i, dir.p, dir.o},
      {dir.j, dir.b, dir.i, dir.k, dir.l},
      {dir.r, dir.r, dir.i, dir.x, dir.x},
      {dir.f, dir.f, dir.f, dir.f, dir.f}
   };
   private final aly<dik>[][] F = new aly[][]{
      {dir.e, null, dir.q, null, null},
      {null, null, null, null, dir.n},
      {dir.c, null, null, dir.m, null},
      {null, null, dir.b, dir.y, dir.z},
      {null, null, null, null, null}
   };
   private final aly<dik>[][] G = new aly[][]{
      {dir.d, dir.d, dir.d, dir.q, dir.q},
      {dir.D, dir.D, dir.i, dir.p, dir.o},
      {dir.D, dir.D, dir.D, dir.D, dir.l},
      {dir.s, dir.s, dir.i, dir.i, dir.x},
      {dir.A, dir.A, dir.A, dir.C, dir.C}
   };
   private final aly<dik>[][] H = new aly[][]{
      {dir.e, null, null, null, null},
      {dir.E, null, dir.D, dir.D, dir.n},
      {dir.E, dir.E, dir.i, dir.k, null},
      {null, null, null, null, null},
      {dir.B, dir.B, null, null, null}
   };
   private final aly<dik>[][] I = new aly[][]{
      {dir.e, null, null, null, null},
      {dir.E, null, dir.D, dir.D, dir.n},
      {dir.E, dir.E, dir.i, dir.k, sd.a},
      {null, null, null, null, null},
      {dir.B, dir.B, null, null, null}
   };
   private final aly<dik>[][] J = new aly[][]{
      {dir.u, dir.u, dir.t, dir.v, dir.v},
      {dir.u, dir.u, dir.t, dir.v, dir.v},
      {dir.t, dir.t, dir.t, dir.v, dir.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public dja() {
      this(dja.a.a);
   }

   public dja(dja.a $$0) {
      this.o = $$0;
   }

   public List<dit.d> a() {
      dit.b $$0 = dit.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dit.d(this.p, this.p, dit.b.a(this.z, this.p), this.p, $$0, dit.b.a(-1.0F, -0.16F), 0L),
         new dit.d(this.p, this.p, dit.b.a(this.z, this.p), this.p, $$0, dit.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dit.d, aly<dik>>> $$0) {
      if (ab.ar) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dit.d, aly<dik>>> $$0) {
      js.a $$1 = ps.a();
      jr<edj> $$2 = $$1.d(mb.aM);
      edk.w.a $$3 = new edk.w.a($$2.b(edx.d));
      edk.w.a $$4 = new edk.w.a($$2.b(edx.e));
      edk.w.a $$5 = new edk.w.a($$2.b(edx.g));
      $$0.accept(Pair.of(dit.a(this.p, this.p, this.p, this.p, dit.b.a(0.0F), this.p, 0.01F), dir.b));
      if (rz.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, bbh.a) instanceof azg.e<?, ?> $$7) {
         aly<dik> $$8 = dir.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dit.a(this.p, this.p, this.p, dit.b.a($$9), dit.b.a(0.0F), this.p, 0.0F), $$8));
            $$8 = $$8 == dir.f ? dir.A : dir.f;
         }
      }

      if (rz.a($$3, $$4, $$5, false) instanceof azg.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dit.a(this.p, this.p, dit.b.a($$12), this.p, dit.b.a(0.0F), this.p, 0.0F), dir.q));
         }
      }
   }

   private void c(Consumer<Pair<dit.d, aly<dik>>> $$0) {
      this.a($$0, this.p, this.p, this.v, this.p, this.p, 0.0F, dir.Y);

      for (int $$1 = 0; $$1 < this.q.length; $$1++) {
         dit.b $$2 = this.q[$$1];
         this.a($$0, $$2, this.p, this.w, this.p, this.p, 0.0F, this.D[0][$$1]);
         this.a($$0, $$2, this.p, this.x, this.p, this.p, 0.0F, this.D[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dit.d, aly<dik>>> $$0) {
      this.c($$0, dit.b.a(-1.0F, -0.93333334F));
      this.b($$0, dit.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dit.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dit.b.a(-0.56666666F, -0.4F));
      this.c($$0, dit.b.a(-0.4F, -0.26666668F));
      this.d($$0, dit.b.a(-0.26666668F, -0.05F));
      this.e($$0, dit.b.a(-0.05F, 0.05F));
      this.d($$0, dit.b.a(0.05F, 0.26666668F));
      this.c($$0, dit.b.a(0.26666668F, 0.4F));
      this.b($$0, dit.b.a(0.4F, 0.56666666F));
      this.a($$0, dit.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dit.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dit.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dit.d, aly<dik>>> $$0, dit.b $$1) {
      for (int $$2 = 0; $$2 < this.q.length; $$2++) {
         dit.b $$3 = this.q[$$2];

         for (int $$4 = 0; $$4 < this.r.length; $$4++) {
            dit.b $$5 = this.r[$$4];
            aly<dik> $$6 = this.a($$2, $$4, $$1);
            aly<dik> $$7 = this.b($$2, $$4, $$1);
            aly<dik> $$8 = this.c($$2, $$4, $$1);
            aly<dik> $$9 = this.e($$2, $$4, $$1);
            aly<dik> $$10 = this.h($$2, $$4, $$1);
            aly<dik> $$11 = this.a($$2, $$4, $$1, $$10);
            aly<dik> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dit.b.a(this.y, this.C), this.s[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dit.b.a(this.y, this.A), this.s[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dit.b.a(this.B, this.C), this.s[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dit.b.a(this.y, this.A), dit.b.a(this.s[2], this.s[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dit.b.a(this.B, this.C), this.s[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.B, this.s[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.C, this.s[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dit.b.a(this.y, this.C), this.s[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dit.b.a(this.y, this.A), this.s[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dit.b.a(this.B, this.C), this.s[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dit.b.a(this.y, this.C), this.s[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dit.d, aly<dik>>> $$0, dit.b $$1) {
      for (int $$2 = 0; $$2 < this.q.length; $$2++) {
         dit.b $$3 = this.q[$$2];

         for (int $$4 = 0; $$4 < this.r.length; $$4++) {
            dit.b $$5 = this.r[$$4];
            aly<dik> $$6 = this.a($$2, $$4, $$1);
            aly<dik> $$7 = this.b($$2, $$4, $$1);
            aly<dik> $$8 = this.c($$2, $$4, $$1);
            aly<dik> $$9 = this.e($$2, $$4, $$1);
            aly<dik> $$10 = this.h($$2, $$4, $$1);
            aly<dik> $$11 = this.a($$2, $$4, $$1, $$6);
            aly<dik> $$12 = this.g($$2, $$4, $$1);
            aly<dik> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.y, dit.b.a(this.s[0], this.s[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.s[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dit.b.a(this.B, this.C), this.s[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.A, this.s[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dit.b.a(this.B, this.C), this.s[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dit.b.a(this.y, this.A), dit.b.a(this.s[2], this.s[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dit.b.a(this.B, this.C), this.s[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.B, this.s[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.C, this.s[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dit.b.a(this.y, this.C), this.s[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dit.b.a(this.y, this.A), this.s[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dit.b.a(this.B, this.C), this.s[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dit.b.a(this.y, this.C), this.s[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dit.d, aly<dik>>> $$0, dit.b $$1) {
      this.a($$0, this.p, this.p, this.y, dit.b.a(this.s[0], this.s[2]), $$1, 0.0F, dir.O);
      this.a($$0, dit.b.a(this.q[1], this.q[2]), this.p, dit.b.a(this.A, this.C), this.s[6], $$1, 0.0F, dir.g);
      this.a($$0, dit.b.a(this.q[3], this.q[4]), this.p, dit.b.a(this.A, this.C), this.s[6], $$1, 0.0F, dir.h);

      for (int $$2 = 0; $$2 < this.q.length; $$2++) {
         dit.b $$3 = this.q[$$2];

         for (int $$4 = 0; $$4 < this.r.length; $$4++) {
            dit.b $$5 = this.r[$$4];
            aly<dik> $$6 = this.a($$2, $$4, $$1);
            aly<dik> $$7 = this.b($$2, $$4, $$1);
            aly<dik> $$8 = this.c($$2, $$4, $$1);
            aly<dik> $$9 = this.h($$2, $$4, $$1);
            aly<dik> $$10 = this.e($$2, $$4, $$1);
            aly<dik> $$11 = this.a($$2, $$4);
            aly<dik> $$12 = this.a($$2, $$4, $$1, $$6);
            aly<dik> $$13 = this.d($$2, $$4, $$1);
            aly<dik> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dit.b.a(this.A, this.C), this.s[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dit.b.a(this.A, this.B), this.s[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.C, this.s[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.A, this.s[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.B, this.s[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.C, this.s[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dit.b.a(this.y, this.A), this.s[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dit.b.a(this.B, this.C), this.s[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.y, this.s[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dit.b.a(this.A, this.C), this.s[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dit.b.a(this.y, this.C), this.s[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.y, this.s[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.A, this.s[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dit.b.a(this.B, this.C), this.s[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.y, this.s[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.y, this.s[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dit.b.a(this.A, this.C), this.s[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dit.d, aly<dik>>> $$0, dit.b $$1) {
      this.a($$0, this.p, this.p, this.y, dit.b.a(this.s[0], this.s[2]), $$1, 0.0F, dir.O);
      this.a($$0, dit.b.a(this.q[1], this.q[2]), this.p, dit.b.a(this.A, this.C), this.s[6], $$1, 0.0F, dir.g);
      this.a($$0, dit.b.a(this.q[3], this.q[4]), this.p, dit.b.a(this.A, this.C), this.s[6], $$1, 0.0F, dir.h);

      for (int $$2 = 0; $$2 < this.q.length; $$2++) {
         dit.b $$3 = this.q[$$2];

         for (int $$4 = 0; $$4 < this.r.length; $$4++) {
            dit.b $$5 = this.r[$$4];
            aly<dik> $$6 = this.a($$2, $$4, $$1);
            aly<dik> $$7 = this.b($$2, $$4, $$1);
            aly<dik> $$8 = this.c($$2, $$4, $$1);
            aly<dik> $$9 = this.a($$2, $$4);
            aly<dik> $$10 = this.a($$2, $$4, $$1, $$6);
            aly<dik> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.A, dit.b.a(this.s[0], this.s[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dit.b.a(this.B, this.C), dit.b.a(this.s[0], this.s[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.A, dit.b.a(this.s[2], this.s[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dit.b.a(this.B, this.C), dit.b.a(this.s[2], this.s[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.y, dit.b.a(this.s[3], this.s[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dit.b.a(this.A, this.C), this.s[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.y, this.s[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.A, this.s[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dit.b.a(this.B, this.C), this.s[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.y, this.s[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dit.b.a(this.A, this.C), this.s[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dit.d, aly<dik>>> $$0, dit.b $$1) {
      this.a($$0, this.t, this.p, this.y, dit.b.a(this.s[0], this.s[1]), $$1, 0.0F, $$1.b() < 0L ? dir.O : dir.L);
      this.a($$0, this.u, this.p, this.y, dit.b.a(this.s[0], this.s[1]), $$1, 0.0F, $$1.b() < 0L ? dir.O : dir.K);
      this.a($$0, this.t, this.p, this.A, dit.b.a(this.s[0], this.s[1]), $$1, 0.0F, dir.L);
      this.a($$0, this.u, this.p, this.A, dit.b.a(this.s[0], this.s[1]), $$1, 0.0F, dir.K);
      this.a($$0, this.t, this.p, dit.b.a(this.y, this.C), dit.b.a(this.s[2], this.s[5]), $$1, 0.0F, dir.L);
      this.a($$0, this.u, this.p, dit.b.a(this.y, this.C), dit.b.a(this.s[2], this.s[5]), $$1, 0.0F, dir.K);
      this.a($$0, this.t, this.p, this.y, this.s[6], $$1, 0.0F, dir.L);
      this.a($$0, this.u, this.p, this.y, this.s[6], $$1, 0.0F, dir.K);
      this.a($$0, dit.b.a(this.q[1], this.q[2]), this.p, dit.b.a(this.z, this.C), this.s[6], $$1, 0.0F, dir.g);
      this.a($$0, dit.b.a(this.q[3], this.q[4]), this.p, dit.b.a(this.z, this.C), this.s[6], $$1, 0.0F, dir.h);
      this.a($$0, this.t, this.p, dit.b.a(this.z, this.C), this.s[6], $$1, 0.0F, dir.L);

      for (int $$2 = 0; $$2 < this.q.length; $$2++) {
         dit.b $$3 = this.q[$$2];

         for (int $$4 = 0; $$4 < this.r.length; $$4++) {
            dit.b $$5 = this.r[$$4];
            aly<dik> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dit.b.a(this.B, this.C), dit.b.a(this.s[0], this.s[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dit.d, aly<dik>>> $$0) {
      this.b($$0, this.p, this.p, dit.b.a(0.8F, 1.0F), this.p, this.p, 0.0F, dir.Z);
      this.b($$0, this.p, dit.b.a(0.7F, 1.0F), this.p, this.p, this.p, 0.0F, dir.aa);
      this.c($$0, this.p, this.p, this.p, dit.b.a(this.s[0], this.s[1]), this.p, 0.0F, dir.ab);
   }

   private aly<dik> a(int $$0, int $$1, dit.b $$2) {
      if ($$2.b() < 0L) {
         return this.E[$$0][$$1];
      } else {
         aly<dik> $$3 = this.F[$$0][$$1];
         return $$3 == null ? this.E[$$0][$$1] : $$3;
      }
   }

   private aly<dik> b(int $$0, int $$1, dit.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private aly<dik> c(int $$0, int $$1, dit.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private aly<dik> a(int $$0, int $$1, dit.b $$2, aly<dik> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dir.w : $$3;
   }

   private aly<dik> d(int $$0, int $$1, dit.b $$2) {
      aly<dik> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private aly<dik> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dir.N;
      } else {
         return $$0 == 4 ? dir.f : dir.M;
      }
   }

   private aly<dik> a(int $$0, dit.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dir.A : dir.B;
      } else {
         return $$0 < 3 ? dir.A : dir.C;
      }
   }

   private aly<dik> e(int $$0, int $$1, dit.b $$2) {
      if ($$2.b() >= 0L) {
         aly<dik> $$3 = (this.o == dja.a.b ? this.I : this.H)[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.G[$$0][$$1];
   }

   private aly<dik> f(int $$0, int $$1, dit.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dir.I : dir.H;
      } else {
         return $$0 == 3 ? dir.J : this.a($$1, $$2);
      }
   }

   private aly<dik> g(int $$0, int $$1, dit.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dir.G : dir.F;
      }
   }

   private aly<dik> h(int $$0, int $$1, dit.b $$2) {
      aly<dik> $$3 = this.J[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dit.d, aly<dik>>> $$0, dit.b $$1, dit.b $$2, dit.b $$3, dit.b $$4, dit.b $$5, float $$6, aly<dik> $$7) {
      $$0.accept(Pair.of(dit.a($$1, $$2, $$3, $$4, dit.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dit.a($$1, $$2, $$3, $$4, dit.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dit.d, aly<dik>>> $$0, dit.b $$1, dit.b $$2, dit.b $$3, dit.b $$4, dit.b $$5, float $$6, aly<dik> $$7) {
      $$0.accept(Pair.of(dit.a($$1, $$2, $$3, $$4, dit.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dit.d, aly<dik>>> $$0, dit.b $$1, dit.b $$2, dit.b $$3, dit.b $$4, dit.b $$5, float $$6, aly<dik> $$7) {
      $$0.accept(Pair.of(dit.a($$1, $$2, $$3, $$4, dit.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(edj $$0, edj $$1, edj.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)edx.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)edx.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)edx.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)edx.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dit.a((float)$$0);
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

   private static String a(double $$0, dit.b[] $$1) {
      double $$2 = (double)dit.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bbl
   public dit.b[] b() {
      return this.q;
   }

   @bbl
   public dit.b[] c() {
      return this.r;
   }

   @bbl
   public dit.b[] d() {
      return this.s;
   }

   @bbl
   public dit.b[] e() {
      return new dit.b[]{this.v, this.w, this.x, this.y, this.A, this.B, this.C};
   }

   @bbl
   public dit.b[] f() {
      return new dit.b[]{
         dit.b.a(-2.0F, edx.a(0.05F)),
         dit.b.a(edx.a(0.05F), edx.a(0.26666668F)),
         dit.b.a(edx.a(0.26666668F), edx.a(0.4F)),
         dit.b.a(edx.a(0.4F), edx.a(0.56666666F)),
         dit.b.a(edx.a(0.56666666F), 2.0F)
      };
   }

   @bbl
   public dit.b[] g() {
      return new dit.b[]{dit.b.a(-2.0F, 0.0F), dit.b.a(0.0F, 2.0F)};
   }

   public static enum a {
      a,
      b;
   }
}
