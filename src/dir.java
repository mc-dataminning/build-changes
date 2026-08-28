import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dir {
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
   private final dik.b o = dik.b.a(-1.0F, 1.0F);
   private final dik.b[] p = new dik.b[]{dik.b.a(-1.0F, -0.45F), dik.b.a(-0.45F, -0.15F), dik.b.a(-0.15F, 0.2F), dik.b.a(0.2F, 0.55F), dik.b.a(0.55F, 1.0F)};
   private final dik.b[] q = new dik.b[]{dik.b.a(-1.0F, -0.35F), dik.b.a(-0.35F, -0.1F), dik.b.a(-0.1F, 0.1F), dik.b.a(0.1F, 0.3F), dik.b.a(0.3F, 1.0F)};
   private final dik.b[] r = new dik.b[]{
      dik.b.a(-1.0F, -0.78F),
      dik.b.a(-0.78F, -0.375F),
      dik.b.a(-0.375F, -0.2225F),
      dik.b.a(-0.2225F, 0.05F),
      dik.b.a(0.05F, 0.45F),
      dik.b.a(0.45F, 0.55F),
      dik.b.a(0.55F, 1.0F)
   };
   private final dik.b s = this.p[0];
   private final dik.b t = dik.b.a(this.p[1], this.p[4]);
   private final dik.b u = dik.b.a(-1.2F, -1.05F);
   private final dik.b v = dik.b.a(-1.05F, -0.455F);
   private final dik.b w = dik.b.a(-0.455F, -0.19F);
   private final dik.b x = dik.b.a(-0.19F, -0.11F);
   private final dik.b y = dik.b.a(-0.11F, 0.55F);
   private final dik.b z = dik.b.a(-0.11F, 0.03F);
   private final dik.b A = dik.b.a(0.03F, 0.3F);
   private final dik.b B = dik.b.a(0.3F, 1.0F);
   private final alo<dib>[][] C = new alo[][]{{dii.Y, dii.W, dii.U, dii.S, dii.Q}, {dii.X, dii.V, dii.T, dii.R, dii.Q}};
   private final alo<dib>[][] D = new alo[][]{
      {dii.d, dii.d, dii.d, dii.r, dii.q},
      {dii.b, dii.b, dii.i, dii.q, dii.p},
      {dii.j, dii.b, dii.i, dii.k, dii.l},
      {dii.s, dii.s, dii.i, dii.y, dii.y},
      {dii.f, dii.f, dii.f, dii.f, dii.f}
   };
   private final alo<dib>[][] E = new alo[][]{
      {dii.e, null, dii.r, null, null},
      {null, null, null, null, dii.o},
      {dii.c, null, null, dii.n, null},
      {null, null, dii.b, dii.z, dii.A},
      {null, null, null, null, null}
   };
   private final alo<dib>[][] F = new alo[][]{
      {dii.d, dii.d, dii.d, dii.r, dii.r},
      {dii.E, dii.E, dii.i, dii.q, dii.p},
      {dii.E, dii.E, dii.E, dii.E, dii.l},
      {dii.t, dii.t, dii.i, dii.i, dii.y},
      {dii.B, dii.B, dii.B, dii.D, dii.D}
   };
   private final alo<dib>[][] G = new alo[][]{
      {dii.e, null, null, null, null},
      {dii.F, null, dii.E, dii.E, dii.o},
      {dii.F, dii.F, dii.i, dii.k, dii.m},
      {null, null, null, null, null},
      {dii.C, dii.C, null, null, null}
   };
   private final alo<dib>[][] H = new alo[][]{
      {dii.v, dii.v, dii.u, dii.w, dii.w},
      {dii.v, dii.v, dii.u, dii.w, dii.w},
      {dii.u, dii.u, dii.u, dii.w, dii.w},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dik.d> a() {
      dik.b $$0 = dik.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dik.d(this.o, this.o, dik.b.a(this.y, this.o), this.o, $$0, dik.b.a(-1.0F, -0.16F), 0L),
         new dik.d(this.o, this.o, dik.b.a(this.y, this.o), this.o, $$0, dik.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dik.d, alo<dib>>> $$0) {
      if (ab.ar) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dik.d, alo<dib>>> $$0) {
      js.a $$1 = pn.a();
      jr<edc> $$2 = $$1.d(mb.aM);
      edd.w.a $$3 = new edd.w.a($$2.b(edq.d));
      edd.w.a $$4 = new edd.w.a($$2.b(edq.e));
      edd.w.a $$5 = new edd.w.a($$2.b(edq.g));
      $$0.accept(Pair.of(dik.a(this.o, this.o, this.o, this.o, dik.b.a(0.0F), this.o, 0.01F), dii.b));
      if (rp.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, bax.a) instanceof ayw.e<?, ?> $$7) {
         alo<dib> $$8 = dii.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dik.a(this.o, this.o, this.o, dik.b.a($$9), dik.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dii.f ? dii.B : dii.f;
         }
      }

      if (rp.a($$3, $$4, $$5, false) instanceof ayw.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dik.a(this.o, this.o, dik.b.a($$12), this.o, dik.b.a(0.0F), this.o, 0.0F), dii.r));
         }
      }
   }

   private void c(Consumer<Pair<dik.d, alo<dib>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dii.Z);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dik.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dik.d, alo<dib>>> $$0) {
      this.c($$0, dik.b.a(-1.0F, -0.93333334F));
      this.b($$0, dik.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dik.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dik.b.a(-0.56666666F, -0.4F));
      this.c($$0, dik.b.a(-0.4F, -0.26666668F));
      this.d($$0, dik.b.a(-0.26666668F, -0.05F));
      this.e($$0, dik.b.a(-0.05F, 0.05F));
      this.d($$0, dik.b.a(0.05F, 0.26666668F));
      this.c($$0, dik.b.a(0.26666668F, 0.4F));
      this.b($$0, dik.b.a(0.4F, 0.56666666F));
      this.a($$0, dik.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dik.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dik.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dik.d, alo<dib>>> $$0, dik.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dik.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dik.b $$5 = this.q[$$4];
            alo<dib> $$6 = this.a($$2, $$4, $$1);
            alo<dib> $$7 = this.b($$2, $$4, $$1);
            alo<dib> $$8 = this.c($$2, $$4, $$1);
            alo<dib> $$9 = this.e($$2, $$4, $$1);
            alo<dib> $$10 = this.h($$2, $$4, $$1);
            alo<dib> $$11 = this.a($$2, $$4, $$1, $$10);
            alo<dib> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dik.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dik.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dik.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dik.b.a(this.x, this.z), dik.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dik.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dik.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dik.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dik.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dik.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dik.d, alo<dib>>> $$0, dik.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dik.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dik.b $$5 = this.q[$$4];
            alo<dib> $$6 = this.a($$2, $$4, $$1);
            alo<dib> $$7 = this.b($$2, $$4, $$1);
            alo<dib> $$8 = this.c($$2, $$4, $$1);
            alo<dib> $$9 = this.e($$2, $$4, $$1);
            alo<dib> $$10 = this.h($$2, $$4, $$1);
            alo<dib> $$11 = this.a($$2, $$4, $$1, $$6);
            alo<dib> $$12 = this.g($$2, $$4, $$1);
            alo<dib> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dik.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dik.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dik.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dik.b.a(this.x, this.z), dik.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dik.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dik.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dik.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dik.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dik.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dik.d, alo<dib>>> $$0, dik.b $$1) {
      this.a($$0, this.o, this.o, this.x, dik.b.a(this.r[0], this.r[2]), $$1, 0.0F, dii.P);
      this.a($$0, dik.b.a(this.p[1], this.p[2]), this.o, dik.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dii.g);
      this.a($$0, dik.b.a(this.p[3], this.p[4]), this.o, dik.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dii.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dik.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dik.b $$5 = this.q[$$4];
            alo<dib> $$6 = this.a($$2, $$4, $$1);
            alo<dib> $$7 = this.b($$2, $$4, $$1);
            alo<dib> $$8 = this.c($$2, $$4, $$1);
            alo<dib> $$9 = this.h($$2, $$4, $$1);
            alo<dib> $$10 = this.e($$2, $$4, $$1);
            alo<dib> $$11 = this.a($$2, $$4);
            alo<dib> $$12 = this.a($$2, $$4, $$1, $$6);
            alo<dib> $$13 = this.d($$2, $$4, $$1);
            alo<dib> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dik.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dik.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dik.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dik.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dik.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dik.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dik.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dik.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dik.d, alo<dib>>> $$0, dik.b $$1) {
      this.a($$0, this.o, this.o, this.x, dik.b.a(this.r[0], this.r[2]), $$1, 0.0F, dii.P);
      this.a($$0, dik.b.a(this.p[1], this.p[2]), this.o, dik.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dii.g);
      this.a($$0, dik.b.a(this.p[3], this.p[4]), this.o, dik.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dii.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dik.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dik.b $$5 = this.q[$$4];
            alo<dib> $$6 = this.a($$2, $$4, $$1);
            alo<dib> $$7 = this.b($$2, $$4, $$1);
            alo<dib> $$8 = this.c($$2, $$4, $$1);
            alo<dib> $$9 = this.a($$2, $$4);
            alo<dib> $$10 = this.a($$2, $$4, $$1, $$6);
            alo<dib> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dik.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dik.b.a(this.A, this.B), dik.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dik.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dik.b.a(this.A, this.B), dik.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dik.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dik.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dik.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dik.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dik.d, alo<dib>>> $$0, dik.b $$1) {
      this.a($$0, this.s, this.o, this.x, dik.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dii.P : dii.M);
      this.a($$0, this.t, this.o, this.x, dik.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dii.P : dii.L);
      this.a($$0, this.s, this.o, this.z, dik.b.a(this.r[0], this.r[1]), $$1, 0.0F, dii.M);
      this.a($$0, this.t, this.o, this.z, dik.b.a(this.r[0], this.r[1]), $$1, 0.0F, dii.L);
      this.a($$0, this.s, this.o, dik.b.a(this.x, this.B), dik.b.a(this.r[2], this.r[5]), $$1, 0.0F, dii.M);
      this.a($$0, this.t, this.o, dik.b.a(this.x, this.B), dik.b.a(this.r[2], this.r[5]), $$1, 0.0F, dii.L);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dii.M);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dii.L);
      this.a($$0, dik.b.a(this.p[1], this.p[2]), this.o, dik.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dii.g);
      this.a($$0, dik.b.a(this.p[3], this.p[4]), this.o, dik.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dii.h);
      this.a($$0, this.s, this.o, dik.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dii.M);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dik.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dik.b $$5 = this.q[$$4];
            alo<dib> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dik.b.a(this.A, this.B), dik.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dik.d, alo<dib>>> $$0) {
      this.b($$0, this.o, this.o, dik.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dii.aa);
      this.b($$0, this.o, dik.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dii.ab);
      this.c($$0, this.o, this.o, this.o, dik.b.a(this.r[0], this.r[1]), this.o, 0.0F, dii.ac);
   }

   private alo<dib> a(int $$0, int $$1, dik.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         alo<dib> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private alo<dib> b(int $$0, int $$1, dik.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private alo<dib> c(int $$0, int $$1, dik.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private alo<dib> a(int $$0, int $$1, dik.b $$2, alo<dib> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dii.x : $$3;
   }

   private alo<dib> d(int $$0, int $$1, dik.b $$2) {
      alo<dib> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private alo<dib> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dii.O;
      } else {
         return $$0 == 4 ? dii.f : dii.N;
      }
   }

   private alo<dib> a(int $$0, dik.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dii.B : dii.C;
      } else {
         return $$0 < 3 ? dii.B : dii.D;
      }
   }

   private alo<dib> e(int $$0, int $$1, dik.b $$2) {
      if ($$2.b() >= 0L) {
         alo<dib> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private alo<dib> f(int $$0, int $$1, dik.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dii.J : dii.I;
      } else {
         return $$0 == 3 ? dii.K : this.a($$1, $$2);
      }
   }

   private alo<dib> g(int $$0, int $$1, dik.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dii.H : dii.G;
      }
   }

   private alo<dib> h(int $$0, int $$1, dik.b $$2) {
      alo<dib> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dik.d, alo<dib>>> $$0, dik.b $$1, dik.b $$2, dik.b $$3, dik.b $$4, dik.b $$5, float $$6, alo<dib> $$7) {
      $$0.accept(Pair.of(dik.a($$1, $$2, $$3, $$4, dik.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dik.a($$1, $$2, $$3, $$4, dik.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dik.d, alo<dib>>> $$0, dik.b $$1, dik.b $$2, dik.b $$3, dik.b $$4, dik.b $$5, float $$6, alo<dib> $$7) {
      $$0.accept(Pair.of(dik.a($$1, $$2, $$3, $$4, dik.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dik.d, alo<dib>>> $$0, dik.b $$1, dik.b $$2, dik.b $$3, dik.b $$4, dik.b $$5, float $$6, alo<dib> $$7) {
      $$0.accept(Pair.of(dik.a($$1, $$2, $$3, $$4, dik.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(edc $$0, edc $$1, edc.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)edq.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)edq.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)edq.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)edq.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dik.a((float)$$0);
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

   private static String a(double $$0, dik.b[] $$1) {
      double $$2 = (double)dik.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bbb
   public dik.b[] b() {
      return this.p;
   }

   @bbb
   public dik.b[] c() {
      return this.q;
   }

   @bbb
   public dik.b[] d() {
      return this.r;
   }

   @bbb
   public dik.b[] e() {
      return new dik.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @bbb
   public dik.b[] f() {
      return new dik.b[]{
         dik.b.a(-2.0F, edq.a(0.05F)),
         dik.b.a(edq.a(0.05F), edq.a(0.26666668F)),
         dik.b.a(edq.a(0.26666668F), edq.a(0.4F)),
         dik.b.a(edq.a(0.4F), edq.a(0.56666666F)),
         dik.b.a(edq.a(0.56666666F), 2.0F)
      };
   }

   @bbb
   public dik.b[] g() {
      return new dik.b[]{dik.b.a(-2.0F, 0.0F), dik.b.a(0.0F, 2.0F)};
   }
}
