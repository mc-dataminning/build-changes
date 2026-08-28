import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dhe {
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
   private final dgx.b o = dgx.b.a(-1.0F, 1.0F);
   private final dgx.b[] p = new dgx.b[]{dgx.b.a(-1.0F, -0.45F), dgx.b.a(-0.45F, -0.15F), dgx.b.a(-0.15F, 0.2F), dgx.b.a(0.2F, 0.55F), dgx.b.a(0.55F, 1.0F)};
   private final dgx.b[] q = new dgx.b[]{dgx.b.a(-1.0F, -0.35F), dgx.b.a(-0.35F, -0.1F), dgx.b.a(-0.1F, 0.1F), dgx.b.a(0.1F, 0.3F), dgx.b.a(0.3F, 1.0F)};
   private final dgx.b[] r = new dgx.b[]{
      dgx.b.a(-1.0F, -0.78F),
      dgx.b.a(-0.78F, -0.375F),
      dgx.b.a(-0.375F, -0.2225F),
      dgx.b.a(-0.2225F, 0.05F),
      dgx.b.a(0.05F, 0.45F),
      dgx.b.a(0.45F, 0.55F),
      dgx.b.a(0.55F, 1.0F)
   };
   private final dgx.b s = this.p[0];
   private final dgx.b t = dgx.b.a(this.p[1], this.p[4]);
   private final dgx.b u = dgx.b.a(-1.2F, -1.05F);
   private final dgx.b v = dgx.b.a(-1.05F, -0.455F);
   private final dgx.b w = dgx.b.a(-0.455F, -0.19F);
   private final dgx.b x = dgx.b.a(-0.19F, -0.11F);
   private final dgx.b y = dgx.b.a(-0.11F, 0.55F);
   private final dgx.b z = dgx.b.a(-0.11F, 0.03F);
   private final dgx.b A = dgx.b.a(0.03F, 0.3F);
   private final dgx.b B = dgx.b.a(0.3F, 1.0F);
   private final ali<dgo>[][] C = new ali[][]{{dgv.X, dgv.V, dgv.T, dgv.R, dgv.P}, {dgv.W, dgv.U, dgv.S, dgv.Q, dgv.P}};
   private final ali<dgo>[][] D = new ali[][]{
      {dgv.d, dgv.d, dgv.d, dgv.q, dgv.p},
      {dgv.b, dgv.b, dgv.i, dgv.p, dgv.o},
      {dgv.j, dgv.b, dgv.i, dgv.k, dgv.l},
      {dgv.r, dgv.r, dgv.i, dgv.x, dgv.x},
      {dgv.f, dgv.f, dgv.f, dgv.f, dgv.f}
   };
   private final ali<dgo>[][] E = new ali[][]{
      {dgv.e, null, dgv.q, null, null},
      {null, null, null, null, dgv.n},
      {dgv.c, null, null, dgv.m, null},
      {null, null, dgv.b, dgv.y, dgv.z},
      {null, null, null, null, null}
   };
   private final ali<dgo>[][] F = new ali[][]{
      {dgv.d, dgv.d, dgv.d, dgv.q, dgv.q},
      {dgv.D, dgv.D, dgv.i, dgv.p, dgv.o},
      {dgv.D, dgv.D, dgv.D, dgv.D, dgv.l},
      {dgv.s, dgv.s, dgv.i, dgv.i, dgv.x},
      {dgv.A, dgv.A, dgv.A, dgv.C, dgv.C}
   };
   private final ali<dgo>[][] G = new ali[][]{
      {dgv.e, null, null, null, null},
      {dgv.E, null, dgv.D, dgv.D, dgv.n},
      {dgv.E, dgv.E, dgv.i, dgv.k, null},
      {null, null, null, null, null},
      {dgv.B, dgv.B, null, null, null}
   };
   private final ali<dgo>[][] H = new ali[][]{
      {dgv.u, dgv.u, dgv.t, dgv.v, dgv.v},
      {dgv.u, dgv.u, dgv.t, dgv.v, dgv.v},
      {dgv.t, dgv.t, dgv.t, dgv.v, dgv.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dgx.d> a() {
      dgx.b $$0 = dgx.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dgx.d(this.o, this.o, dgx.b.a(this.y, this.o), this.o, $$0, dgx.b.a(-1.0F, -0.16F), 0L),
         new dgx.d(this.o, this.o, dgx.b.a(this.y, this.o), this.o, $$0, dgx.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dgx.d, ali<dgo>>> $$0) {
      if (ab.ar) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dgx.d, ali<dgo>>> $$0) {
      js.a $$1 = pm.a();
      jr<ebj> $$2 = $$1.d(ma.aK);
      ebk.w.a $$3 = new ebk.w.a($$2.b(ebx.d));
      ebk.w.a $$4 = new ebk.w.a($$2.b(ebx.e));
      ebk.w.a $$5 = new ebk.w.a($$2.b(ebx.g));
      $$0.accept(Pair.of(dgx.a(this.o, this.o, this.o, this.o, dgx.b.a(0.0F), this.o, 0.01F), dgv.b));
      if (ro.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, bap.a) instanceof ayo.e<?, ?> $$7) {
         ali<dgo> $$8 = dgv.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dgx.a(this.o, this.o, this.o, dgx.b.a($$9), dgx.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dgv.f ? dgv.A : dgv.f;
         }
      }

      if (ro.a($$3, $$4, $$5, false) instanceof ayo.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dgx.a(this.o, this.o, dgx.b.a($$12), this.o, dgx.b.a(0.0F), this.o, 0.0F), dgv.q));
         }
      }
   }

   private void c(Consumer<Pair<dgx.d, ali<dgo>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dgv.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dgx.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dgx.d, ali<dgo>>> $$0) {
      this.c($$0, dgx.b.a(-1.0F, -0.93333334F));
      this.b($$0, dgx.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dgx.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dgx.b.a(-0.56666666F, -0.4F));
      this.c($$0, dgx.b.a(-0.4F, -0.26666668F));
      this.d($$0, dgx.b.a(-0.26666668F, -0.05F));
      this.e($$0, dgx.b.a(-0.05F, 0.05F));
      this.d($$0, dgx.b.a(0.05F, 0.26666668F));
      this.c($$0, dgx.b.a(0.26666668F, 0.4F));
      this.b($$0, dgx.b.a(0.4F, 0.56666666F));
      this.a($$0, dgx.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dgx.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dgx.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dgx.d, ali<dgo>>> $$0, dgx.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dgx.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dgx.b $$5 = this.q[$$4];
            ali<dgo> $$6 = this.a($$2, $$4, $$1);
            ali<dgo> $$7 = this.b($$2, $$4, $$1);
            ali<dgo> $$8 = this.c($$2, $$4, $$1);
            ali<dgo> $$9 = this.e($$2, $$4, $$1);
            ali<dgo> $$10 = this.h($$2, $$4, $$1);
            ali<dgo> $$11 = this.a($$2, $$4, $$1, $$10);
            ali<dgo> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dgx.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dgx.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dgx.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dgx.b.a(this.x, this.z), dgx.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgx.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dgx.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgx.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dgx.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dgx.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dgx.d, ali<dgo>>> $$0, dgx.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dgx.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dgx.b $$5 = this.q[$$4];
            ali<dgo> $$6 = this.a($$2, $$4, $$1);
            ali<dgo> $$7 = this.b($$2, $$4, $$1);
            ali<dgo> $$8 = this.c($$2, $$4, $$1);
            ali<dgo> $$9 = this.e($$2, $$4, $$1);
            ali<dgo> $$10 = this.h($$2, $$4, $$1);
            ali<dgo> $$11 = this.a($$2, $$4, $$1, $$6);
            ali<dgo> $$12 = this.g($$2, $$4, $$1);
            ali<dgo> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dgx.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dgx.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dgx.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dgx.b.a(this.x, this.z), dgx.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgx.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dgx.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgx.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dgx.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dgx.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dgx.d, ali<dgo>>> $$0, dgx.b $$1) {
      this.a($$0, this.o, this.o, this.x, dgx.b.a(this.r[0], this.r[2]), $$1, 0.0F, dgv.O);
      this.a($$0, dgx.b.a(this.p[1], this.p[2]), this.o, dgx.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dgv.g);
      this.a($$0, dgx.b.a(this.p[3], this.p[4]), this.o, dgx.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dgv.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dgx.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dgx.b $$5 = this.q[$$4];
            ali<dgo> $$6 = this.a($$2, $$4, $$1);
            ali<dgo> $$7 = this.b($$2, $$4, $$1);
            ali<dgo> $$8 = this.c($$2, $$4, $$1);
            ali<dgo> $$9 = this.h($$2, $$4, $$1);
            ali<dgo> $$10 = this.e($$2, $$4, $$1);
            ali<dgo> $$11 = this.a($$2, $$4);
            ali<dgo> $$12 = this.a($$2, $$4, $$1, $$6);
            ali<dgo> $$13 = this.d($$2, $$4, $$1);
            ali<dgo> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dgx.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dgx.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dgx.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgx.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dgx.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dgx.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dgx.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dgx.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dgx.d, ali<dgo>>> $$0, dgx.b $$1) {
      this.a($$0, this.o, this.o, this.x, dgx.b.a(this.r[0], this.r[2]), $$1, 0.0F, dgv.O);
      this.a($$0, dgx.b.a(this.p[1], this.p[2]), this.o, dgx.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dgv.g);
      this.a($$0, dgx.b.a(this.p[3], this.p[4]), this.o, dgx.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dgv.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dgx.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dgx.b $$5 = this.q[$$4];
            ali<dgo> $$6 = this.a($$2, $$4, $$1);
            ali<dgo> $$7 = this.b($$2, $$4, $$1);
            ali<dgo> $$8 = this.c($$2, $$4, $$1);
            ali<dgo> $$9 = this.a($$2, $$4);
            ali<dgo> $$10 = this.a($$2, $$4, $$1, $$6);
            ali<dgo> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dgx.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dgx.b.a(this.A, this.B), dgx.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dgx.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgx.b.a(this.A, this.B), dgx.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dgx.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dgx.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dgx.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dgx.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dgx.d, ali<dgo>>> $$0, dgx.b $$1) {
      this.a($$0, this.s, this.o, this.x, dgx.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dgv.O : dgv.L);
      this.a($$0, this.t, this.o, this.x, dgx.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dgv.O : dgv.K);
      this.a($$0, this.s, this.o, this.z, dgx.b.a(this.r[0], this.r[1]), $$1, 0.0F, dgv.L);
      this.a($$0, this.t, this.o, this.z, dgx.b.a(this.r[0], this.r[1]), $$1, 0.0F, dgv.K);
      this.a($$0, this.s, this.o, dgx.b.a(this.x, this.B), dgx.b.a(this.r[2], this.r[5]), $$1, 0.0F, dgv.L);
      this.a($$0, this.t, this.o, dgx.b.a(this.x, this.B), dgx.b.a(this.r[2], this.r[5]), $$1, 0.0F, dgv.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dgv.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dgv.K);
      this.a($$0, dgx.b.a(this.p[1], this.p[2]), this.o, dgx.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dgv.g);
      this.a($$0, dgx.b.a(this.p[3], this.p[4]), this.o, dgx.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dgv.h);
      this.a($$0, this.s, this.o, dgx.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dgv.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dgx.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dgx.b $$5 = this.q[$$4];
            ali<dgo> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dgx.b.a(this.A, this.B), dgx.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dgx.d, ali<dgo>>> $$0) {
      this.b($$0, this.o, this.o, dgx.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dgv.Z);
      this.b($$0, this.o, dgx.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dgv.aa);
      this.c($$0, this.o, this.o, this.o, dgx.b.a(this.r[0], this.r[1]), this.o, 0.0F, dgv.ab);
   }

   private ali<dgo> a(int $$0, int $$1, dgx.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         ali<dgo> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private ali<dgo> b(int $$0, int $$1, dgx.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private ali<dgo> c(int $$0, int $$1, dgx.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private ali<dgo> a(int $$0, int $$1, dgx.b $$2, ali<dgo> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dgv.w : $$3;
   }

   private ali<dgo> d(int $$0, int $$1, dgx.b $$2) {
      ali<dgo> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private ali<dgo> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dgv.N;
      } else {
         return $$0 == 4 ? dgv.f : dgv.M;
      }
   }

   private ali<dgo> a(int $$0, dgx.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dgv.A : dgv.B;
      } else {
         return $$0 < 3 ? dgv.A : dgv.C;
      }
   }

   private ali<dgo> e(int $$0, int $$1, dgx.b $$2) {
      if ($$2.b() >= 0L) {
         ali<dgo> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private ali<dgo> f(int $$0, int $$1, dgx.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dgv.I : dgv.H;
      } else {
         return $$0 == 3 ? dgv.J : this.a($$1, $$2);
      }
   }

   private ali<dgo> g(int $$0, int $$1, dgx.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dgv.G : dgv.F;
      }
   }

   private ali<dgo> h(int $$0, int $$1, dgx.b $$2) {
      ali<dgo> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dgx.d, ali<dgo>>> $$0, dgx.b $$1, dgx.b $$2, dgx.b $$3, dgx.b $$4, dgx.b $$5, float $$6, ali<dgo> $$7) {
      $$0.accept(Pair.of(dgx.a($$1, $$2, $$3, $$4, dgx.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dgx.a($$1, $$2, $$3, $$4, dgx.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dgx.d, ali<dgo>>> $$0, dgx.b $$1, dgx.b $$2, dgx.b $$3, dgx.b $$4, dgx.b $$5, float $$6, ali<dgo> $$7) {
      $$0.accept(Pair.of(dgx.a($$1, $$2, $$3, $$4, dgx.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dgx.d, ali<dgo>>> $$0, dgx.b $$1, dgx.b $$2, dgx.b $$3, dgx.b $$4, dgx.b $$5, float $$6, ali<dgo> $$7) {
      $$0.accept(Pair.of(dgx.a($$1, $$2, $$3, $$4, dgx.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(ebj $$0, ebj $$1, ebj.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)ebx.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)ebx.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)ebx.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)ebx.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dgx.a((float)$$0);
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

   private static String a(double $$0, dgx.b[] $$1) {
      double $$2 = (double)dgx.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bat
   public dgx.b[] b() {
      return this.p;
   }

   @bat
   public dgx.b[] c() {
      return this.q;
   }

   @bat
   public dgx.b[] d() {
      return this.r;
   }

   @bat
   public dgx.b[] e() {
      return new dgx.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @bat
   public dgx.b[] f() {
      return new dgx.b[]{
         dgx.b.a(-2.0F, ebx.a(0.05F)),
         dgx.b.a(ebx.a(0.05F), ebx.a(0.26666668F)),
         dgx.b.a(ebx.a(0.26666668F), ebx.a(0.4F)),
         dgx.b.a(ebx.a(0.4F), ebx.a(0.56666666F)),
         dgx.b.a(ebx.a(0.56666666F), 2.0F)
      };
   }

   @bat
   public dgx.b[] g() {
      return new dgx.b[]{dgx.b.a(-2.0F, 0.0F), dgx.b.a(0.0F, 2.0F)};
   }
}
