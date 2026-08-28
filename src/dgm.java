import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dgm {
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
   private final dgf.b o = dgf.b.a(-1.0F, 1.0F);
   private final dgf.b[] p = new dgf.b[]{dgf.b.a(-1.0F, -0.45F), dgf.b.a(-0.45F, -0.15F), dgf.b.a(-0.15F, 0.2F), dgf.b.a(0.2F, 0.55F), dgf.b.a(0.55F, 1.0F)};
   private final dgf.b[] q = new dgf.b[]{dgf.b.a(-1.0F, -0.35F), dgf.b.a(-0.35F, -0.1F), dgf.b.a(-0.1F, 0.1F), dgf.b.a(0.1F, 0.3F), dgf.b.a(0.3F, 1.0F)};
   private final dgf.b[] r = new dgf.b[]{
      dgf.b.a(-1.0F, -0.78F),
      dgf.b.a(-0.78F, -0.375F),
      dgf.b.a(-0.375F, -0.2225F),
      dgf.b.a(-0.2225F, 0.05F),
      dgf.b.a(0.05F, 0.45F),
      dgf.b.a(0.45F, 0.55F),
      dgf.b.a(0.55F, 1.0F)
   };
   private final dgf.b s = this.p[0];
   private final dgf.b t = dgf.b.a(this.p[1], this.p[4]);
   private final dgf.b u = dgf.b.a(-1.2F, -1.05F);
   private final dgf.b v = dgf.b.a(-1.05F, -0.455F);
   private final dgf.b w = dgf.b.a(-0.455F, -0.19F);
   private final dgf.b x = dgf.b.a(-0.19F, -0.11F);
   private final dgf.b y = dgf.b.a(-0.11F, 0.55F);
   private final dgf.b z = dgf.b.a(-0.11F, 0.03F);
   private final dgf.b A = dgf.b.a(0.03F, 0.3F);
   private final dgf.b B = dgf.b.a(0.3F, 1.0F);
   private final alg<dfw>[][] C = new alg[][]{{dgd.X, dgd.V, dgd.T, dgd.R, dgd.P}, {dgd.W, dgd.U, dgd.S, dgd.Q, dgd.P}};
   private final alg<dfw>[][] D = new alg[][]{
      {dgd.d, dgd.d, dgd.d, dgd.q, dgd.p},
      {dgd.b, dgd.b, dgd.i, dgd.p, dgd.o},
      {dgd.j, dgd.b, dgd.i, dgd.k, dgd.l},
      {dgd.r, dgd.r, dgd.i, dgd.x, dgd.x},
      {dgd.f, dgd.f, dgd.f, dgd.f, dgd.f}
   };
   private final alg<dfw>[][] E = new alg[][]{
      {dgd.e, null, dgd.q, null, null},
      {null, null, null, null, dgd.n},
      {dgd.c, null, null, dgd.m, null},
      {null, null, dgd.b, dgd.y, dgd.z},
      {null, null, null, null, null}
   };
   private final alg<dfw>[][] F = new alg[][]{
      {dgd.d, dgd.d, dgd.d, dgd.q, dgd.q},
      {dgd.D, dgd.D, dgd.i, dgd.p, dgd.o},
      {dgd.D, dgd.D, dgd.D, dgd.D, dgd.l},
      {dgd.s, dgd.s, dgd.i, dgd.i, dgd.x},
      {dgd.A, dgd.A, dgd.A, dgd.C, dgd.C}
   };
   private final alg<dfw>[][] G = new alg[][]{
      {dgd.e, null, null, null, null},
      {dgd.E, null, dgd.D, dgd.D, dgd.n},
      {dgd.E, dgd.E, dgd.i, dgd.k, null},
      {null, null, null, null, null},
      {dgd.B, dgd.B, null, null, null}
   };
   private final alg<dfw>[][] H = new alg[][]{
      {dgd.u, dgd.u, dgd.t, dgd.v, dgd.v},
      {dgd.u, dgd.u, dgd.t, dgd.v, dgd.v},
      {dgd.t, dgd.t, dgd.t, dgd.v, dgd.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dgf.d> a() {
      dgf.b $$0 = dgf.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dgf.d(this.o, this.o, dgf.b.a(this.y, this.o), this.o, $$0, dgf.b.a(-1.0F, -0.16F), 0L),
         new dgf.d(this.o, this.o, dgf.b.a(this.y, this.o), this.o, $$0, dgf.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dgf.d, alg<dfw>>> $$0) {
      if (ab.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dgf.d, alg<dfw>>> $$0) {
      jr.a $$1 = pk.a();
      jq<eas> $$2 = $$1.d(ly.aK);
      eat.w.a $$3 = new eat.w.a($$2.b(ebg.d));
      eat.w.a $$4 = new eat.w.a($$2.b(ebg.e));
      eat.w.a $$5 = new eat.w.a($$2.b(ebg.g));
      $$0.accept(Pair.of(dgf.a(this.o, this.o, this.o, this.o, dgf.b.a(0.0F), this.o, 0.01F), dgd.b));
      if (rm.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, bal.a) instanceof ayl.e<?, ?> $$7) {
         alg<dfw> $$8 = dgd.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dgf.a(this.o, this.o, this.o, dgf.b.a($$9), dgf.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dgd.f ? dgd.A : dgd.f;
         }
      }

      if (rm.a($$3, $$4, $$5, false) instanceof ayl.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dgf.a(this.o, this.o, dgf.b.a($$12), this.o, dgf.b.a(0.0F), this.o, 0.0F), dgd.q));
         }
      }
   }

   private void c(Consumer<Pair<dgf.d, alg<dfw>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dgd.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dgf.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dgf.d, alg<dfw>>> $$0) {
      this.c($$0, dgf.b.a(-1.0F, -0.93333334F));
      this.b($$0, dgf.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dgf.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dgf.b.a(-0.56666666F, -0.4F));
      this.c($$0, dgf.b.a(-0.4F, -0.26666668F));
      this.d($$0, dgf.b.a(-0.26666668F, -0.05F));
      this.e($$0, dgf.b.a(-0.05F, 0.05F));
      this.d($$0, dgf.b.a(0.05F, 0.26666668F));
      this.c($$0, dgf.b.a(0.26666668F, 0.4F));
      this.b($$0, dgf.b.a(0.4F, 0.56666666F));
      this.a($$0, dgf.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dgf.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dgf.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dgf.d, alg<dfw>>> $$0, dgf.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dgf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dgf.b $$5 = this.q[$$4];
            alg<dfw> $$6 = this.a($$2, $$4, $$1);
            alg<dfw> $$7 = this.b($$2, $$4, $$1);
            alg<dfw> $$8 = this.c($$2, $$4, $$1);
            alg<dfw> $$9 = this.e($$2, $$4, $$1);
            alg<dfw> $$10 = this.h($$2, $$4, $$1);
            alg<dfw> $$11 = this.a($$2, $$4, $$1, $$10);
            alg<dfw> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dgf.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dgf.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dgf.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dgf.b.a(this.x, this.z), dgf.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgf.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dgf.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgf.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dgf.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dgf.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dgf.d, alg<dfw>>> $$0, dgf.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dgf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dgf.b $$5 = this.q[$$4];
            alg<dfw> $$6 = this.a($$2, $$4, $$1);
            alg<dfw> $$7 = this.b($$2, $$4, $$1);
            alg<dfw> $$8 = this.c($$2, $$4, $$1);
            alg<dfw> $$9 = this.e($$2, $$4, $$1);
            alg<dfw> $$10 = this.h($$2, $$4, $$1);
            alg<dfw> $$11 = this.a($$2, $$4, $$1, $$6);
            alg<dfw> $$12 = this.g($$2, $$4, $$1);
            alg<dfw> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dgf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dgf.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dgf.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dgf.b.a(this.x, this.z), dgf.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgf.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dgf.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgf.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dgf.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dgf.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dgf.d, alg<dfw>>> $$0, dgf.b $$1) {
      this.a($$0, this.o, this.o, this.x, dgf.b.a(this.r[0], this.r[2]), $$1, 0.0F, dgd.O);
      this.a($$0, dgf.b.a(this.p[1], this.p[2]), this.o, dgf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dgd.g);
      this.a($$0, dgf.b.a(this.p[3], this.p[4]), this.o, dgf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dgd.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dgf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dgf.b $$5 = this.q[$$4];
            alg<dfw> $$6 = this.a($$2, $$4, $$1);
            alg<dfw> $$7 = this.b($$2, $$4, $$1);
            alg<dfw> $$8 = this.c($$2, $$4, $$1);
            alg<dfw> $$9 = this.h($$2, $$4, $$1);
            alg<dfw> $$10 = this.e($$2, $$4, $$1);
            alg<dfw> $$11 = this.a($$2, $$4);
            alg<dfw> $$12 = this.a($$2, $$4, $$1, $$6);
            alg<dfw> $$13 = this.d($$2, $$4, $$1);
            alg<dfw> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dgf.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dgf.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dgf.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgf.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dgf.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dgf.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dgf.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dgf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dgf.d, alg<dfw>>> $$0, dgf.b $$1) {
      this.a($$0, this.o, this.o, this.x, dgf.b.a(this.r[0], this.r[2]), $$1, 0.0F, dgd.O);
      this.a($$0, dgf.b.a(this.p[1], this.p[2]), this.o, dgf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dgd.g);
      this.a($$0, dgf.b.a(this.p[3], this.p[4]), this.o, dgf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dgd.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dgf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dgf.b $$5 = this.q[$$4];
            alg<dfw> $$6 = this.a($$2, $$4, $$1);
            alg<dfw> $$7 = this.b($$2, $$4, $$1);
            alg<dfw> $$8 = this.c($$2, $$4, $$1);
            alg<dfw> $$9 = this.a($$2, $$4);
            alg<dfw> $$10 = this.a($$2, $$4, $$1, $$6);
            alg<dfw> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dgf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dgf.b.a(this.A, this.B), dgf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dgf.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgf.b.a(this.A, this.B), dgf.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dgf.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dgf.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dgf.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dgf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dgf.d, alg<dfw>>> $$0, dgf.b $$1) {
      this.a($$0, this.s, this.o, this.x, dgf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dgd.O : dgd.L);
      this.a($$0, this.t, this.o, this.x, dgf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dgd.O : dgd.K);
      this.a($$0, this.s, this.o, this.z, dgf.b.a(this.r[0], this.r[1]), $$1, 0.0F, dgd.L);
      this.a($$0, this.t, this.o, this.z, dgf.b.a(this.r[0], this.r[1]), $$1, 0.0F, dgd.K);
      this.a($$0, this.s, this.o, dgf.b.a(this.x, this.B), dgf.b.a(this.r[2], this.r[5]), $$1, 0.0F, dgd.L);
      this.a($$0, this.t, this.o, dgf.b.a(this.x, this.B), dgf.b.a(this.r[2], this.r[5]), $$1, 0.0F, dgd.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dgd.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dgd.K);
      this.a($$0, dgf.b.a(this.p[1], this.p[2]), this.o, dgf.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dgd.g);
      this.a($$0, dgf.b.a(this.p[3], this.p[4]), this.o, dgf.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dgd.h);
      this.a($$0, this.s, this.o, dgf.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dgd.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dgf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dgf.b $$5 = this.q[$$4];
            alg<dfw> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dgf.b.a(this.A, this.B), dgf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dgf.d, alg<dfw>>> $$0) {
      this.b($$0, this.o, this.o, dgf.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dgd.Z);
      this.b($$0, this.o, dgf.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dgd.aa);
      this.c($$0, this.o, this.o, this.o, dgf.b.a(this.r[0], this.r[1]), this.o, 0.0F, dgd.ab);
   }

   private alg<dfw> a(int $$0, int $$1, dgf.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         alg<dfw> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private alg<dfw> b(int $$0, int $$1, dgf.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private alg<dfw> c(int $$0, int $$1, dgf.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private alg<dfw> a(int $$0, int $$1, dgf.b $$2, alg<dfw> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dgd.w : $$3;
   }

   private alg<dfw> d(int $$0, int $$1, dgf.b $$2) {
      alg<dfw> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private alg<dfw> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dgd.N;
      } else {
         return $$0 == 4 ? dgd.f : dgd.M;
      }
   }

   private alg<dfw> a(int $$0, dgf.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dgd.A : dgd.B;
      } else {
         return $$0 < 3 ? dgd.A : dgd.C;
      }
   }

   private alg<dfw> e(int $$0, int $$1, dgf.b $$2) {
      if ($$2.b() >= 0L) {
         alg<dfw> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private alg<dfw> f(int $$0, int $$1, dgf.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dgd.I : dgd.H;
      } else {
         return $$0 == 3 ? dgd.J : this.a($$1, $$2);
      }
   }

   private alg<dfw> g(int $$0, int $$1, dgf.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dgd.G : dgd.F;
      }
   }

   private alg<dfw> h(int $$0, int $$1, dgf.b $$2) {
      alg<dfw> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dgf.d, alg<dfw>>> $$0, dgf.b $$1, dgf.b $$2, dgf.b $$3, dgf.b $$4, dgf.b $$5, float $$6, alg<dfw> $$7) {
      $$0.accept(Pair.of(dgf.a($$1, $$2, $$3, $$4, dgf.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dgf.a($$1, $$2, $$3, $$4, dgf.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dgf.d, alg<dfw>>> $$0, dgf.b $$1, dgf.b $$2, dgf.b $$3, dgf.b $$4, dgf.b $$5, float $$6, alg<dfw> $$7) {
      $$0.accept(Pair.of(dgf.a($$1, $$2, $$3, $$4, dgf.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dgf.d, alg<dfw>>> $$0, dgf.b $$1, dgf.b $$2, dgf.b $$3, dgf.b $$4, dgf.b $$5, float $$6, alg<dfw> $$7) {
      $$0.accept(Pair.of(dgf.a($$1, $$2, $$3, $$4, dgf.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(eas $$0, eas $$1, eas.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)ebg.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)ebg.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)ebg.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)ebg.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dgf.a((float)$$0);
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

   private static String a(double $$0, dgf.b[] $$1) {
      double $$2 = (double)dgf.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bap
   public dgf.b[] b() {
      return this.p;
   }

   @bap
   public dgf.b[] c() {
      return this.q;
   }

   @bap
   public dgf.b[] d() {
      return this.r;
   }

   @bap
   public dgf.b[] e() {
      return new dgf.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @bap
   public dgf.b[] f() {
      return new dgf.b[]{
         dgf.b.a(-2.0F, ebg.a(0.05F)),
         dgf.b.a(ebg.a(0.05F), ebg.a(0.26666668F)),
         dgf.b.a(ebg.a(0.26666668F), ebg.a(0.4F)),
         dgf.b.a(ebg.a(0.4F), ebg.a(0.56666666F)),
         dgf.b.a(ebg.a(0.56666666F), 2.0F)
      };
   }

   @bap
   public dgf.b[] g() {
      return new dgf.b[]{dgf.b.a(-2.0F, 0.0F), dgf.b.a(0.0F, 2.0F)};
   }
}
