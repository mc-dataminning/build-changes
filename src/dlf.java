import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dlf {
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
   private final dky.b o = dky.b.a(-1.0F, 1.0F);
   private final dky.b[] p = new dky.b[]{dky.b.a(-1.0F, -0.45F), dky.b.a(-0.45F, -0.15F), dky.b.a(-0.15F, 0.2F), dky.b.a(0.2F, 0.55F), dky.b.a(0.55F, 1.0F)};
   private final dky.b[] q = new dky.b[]{dky.b.a(-1.0F, -0.35F), dky.b.a(-0.35F, -0.1F), dky.b.a(-0.1F, 0.1F), dky.b.a(0.1F, 0.3F), dky.b.a(0.3F, 1.0F)};
   private final dky.b[] r = new dky.b[]{
      dky.b.a(-1.0F, -0.78F),
      dky.b.a(-0.78F, -0.375F),
      dky.b.a(-0.375F, -0.2225F),
      dky.b.a(-0.2225F, 0.05F),
      dky.b.a(0.05F, 0.45F),
      dky.b.a(0.45F, 0.55F),
      dky.b.a(0.55F, 1.0F)
   };
   private final dky.b s = this.p[0];
   private final dky.b t = dky.b.a(this.p[1], this.p[4]);
   private final dky.b u = dky.b.a(-1.2F, -1.05F);
   private final dky.b v = dky.b.a(-1.05F, -0.455F);
   private final dky.b w = dky.b.a(-0.455F, -0.19F);
   private final dky.b x = dky.b.a(-0.19F, -0.11F);
   private final dky.b y = dky.b.a(-0.11F, 0.55F);
   private final dky.b z = dky.b.a(-0.11F, 0.03F);
   private final dky.b A = dky.b.a(0.03F, 0.3F);
   private final dky.b B = dky.b.a(0.3F, 1.0F);
   private final alf<dkp>[][] C = new alf[][]{{dkw.Y, dkw.W, dkw.U, dkw.S, dkw.Q}, {dkw.X, dkw.V, dkw.T, dkw.R, dkw.Q}};
   private final alf<dkp>[][] D = new alf[][]{
      {dkw.d, dkw.d, dkw.d, dkw.r, dkw.q},
      {dkw.b, dkw.b, dkw.i, dkw.q, dkw.p},
      {dkw.j, dkw.b, dkw.i, dkw.k, dkw.l},
      {dkw.s, dkw.s, dkw.i, dkw.y, dkw.y},
      {dkw.f, dkw.f, dkw.f, dkw.f, dkw.f}
   };
   private final alf<dkp>[][] E = new alf[][]{
      {dkw.e, null, dkw.r, null, null},
      {null, null, null, null, dkw.o},
      {dkw.c, null, null, dkw.n, null},
      {null, null, dkw.b, dkw.z, dkw.A},
      {null, null, null, null, null}
   };
   private final alf<dkp>[][] F = new alf[][]{
      {dkw.d, dkw.d, dkw.d, dkw.r, dkw.r},
      {dkw.E, dkw.E, dkw.i, dkw.q, dkw.p},
      {dkw.E, dkw.E, dkw.E, dkw.E, dkw.m},
      {dkw.t, dkw.t, dkw.i, dkw.i, dkw.y},
      {dkw.B, dkw.B, dkw.B, dkw.D, dkw.D}
   };
   private final alf<dkp>[][] G = new alf[][]{
      {dkw.e, null, null, null, null},
      {dkw.F, null, dkw.E, dkw.E, dkw.o},
      {dkw.F, dkw.F, dkw.i, dkw.k, null},
      {null, null, null, null, null},
      {dkw.C, dkw.C, null, null, null}
   };
   private final alf<dkp>[][] H = new alf[][]{
      {dkw.v, dkw.v, dkw.u, dkw.w, dkw.w},
      {dkw.v, dkw.v, dkw.u, dkw.w, dkw.w},
      {dkw.u, dkw.u, dkw.u, dkw.w, dkw.w},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dky.d> a() {
      dky.b $$0 = dky.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dky.d(this.o, this.o, dky.b.a(this.y, this.o), this.o, $$0, dky.b.a(-1.0F, -0.16F), 0L),
         new dky.d(this.o, this.o, dky.b.a(this.y, this.o), this.o, $$0, dky.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dky.d, alf<dkp>>> $$0) {
      if (ac.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dky.d, alf<dkp>>> $$0) {
      jh.a $$1 = ow.a();
      jg<egl> $$2 = $$1.e(mh.aO);
      egm.w.a $$3 = new egm.w.a($$2.b(egz.d));
      egm.w.a $$4 = new egm.w.a($$2.b(egz.e));
      egm.w.a $$5 = new egm.w.a($$2.b(egz.g));
      $$0.accept(Pair.of(dky.a(this.o, this.o, this.o, this.o, dky.b.a(0.0F), this.o, 0.01F), dkw.b));
      if (qw.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, bar.a) instanceof ayn.e<?, ?> $$7) {
         alf<dkp> $$8 = dkw.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dky.a(this.o, this.o, this.o, dky.b.a($$9), dky.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dkw.f ? dkw.B : dkw.f;
         }
      }

      if (qw.a($$3, $$4, $$5, false) instanceof ayn.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dky.a(this.o, this.o, dky.b.a($$12), this.o, dky.b.a(0.0F), this.o, 0.0F), dkw.r));
         }
      }
   }

   private void c(Consumer<Pair<dky.d, alf<dkp>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dkw.Z);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dky.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dky.d, alf<dkp>>> $$0) {
      this.c($$0, dky.b.a(-1.0F, -0.93333334F));
      this.b($$0, dky.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dky.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dky.b.a(-0.56666666F, -0.4F));
      this.c($$0, dky.b.a(-0.4F, -0.26666668F));
      this.d($$0, dky.b.a(-0.26666668F, -0.05F));
      this.e($$0, dky.b.a(-0.05F, 0.05F));
      this.d($$0, dky.b.a(0.05F, 0.26666668F));
      this.c($$0, dky.b.a(0.26666668F, 0.4F));
      this.b($$0, dky.b.a(0.4F, 0.56666666F));
      this.a($$0, dky.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dky.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dky.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dky.d, alf<dkp>>> $$0, dky.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dky.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dky.b $$5 = this.q[$$4];
            alf<dkp> $$6 = this.a($$2, $$4, $$1);
            alf<dkp> $$7 = this.b($$2, $$4, $$1);
            alf<dkp> $$8 = this.c($$2, $$4, $$1);
            alf<dkp> $$9 = this.e($$2, $$4, $$1);
            alf<dkp> $$10 = this.h($$2, $$4, $$1);
            alf<dkp> $$11 = this.a($$2, $$4, $$1, $$10);
            alf<dkp> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dky.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dky.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dky.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dky.b.a(this.x, this.z), dky.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dky.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dky.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dky.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dky.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dky.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dky.d, alf<dkp>>> $$0, dky.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dky.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dky.b $$5 = this.q[$$4];
            alf<dkp> $$6 = this.a($$2, $$4, $$1);
            alf<dkp> $$7 = this.b($$2, $$4, $$1);
            alf<dkp> $$8 = this.c($$2, $$4, $$1);
            alf<dkp> $$9 = this.e($$2, $$4, $$1);
            alf<dkp> $$10 = this.h($$2, $$4, $$1);
            alf<dkp> $$11 = this.a($$2, $$4, $$1, $$6);
            alf<dkp> $$12 = this.g($$2, $$4, $$1);
            alf<dkp> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dky.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dky.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dky.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dky.b.a(this.x, this.z), dky.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dky.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dky.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dky.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dky.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dky.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dky.d, alf<dkp>>> $$0, dky.b $$1) {
      this.a($$0, this.o, this.o, this.x, dky.b.a(this.r[0], this.r[2]), $$1, 0.0F, dkw.P);
      this.a($$0, dky.b.a(this.p[1], this.p[2]), this.o, dky.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dkw.g);
      this.a($$0, dky.b.a(this.p[3], this.p[4]), this.o, dky.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dkw.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dky.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dky.b $$5 = this.q[$$4];
            alf<dkp> $$6 = this.a($$2, $$4, $$1);
            alf<dkp> $$7 = this.b($$2, $$4, $$1);
            alf<dkp> $$8 = this.c($$2, $$4, $$1);
            alf<dkp> $$9 = this.h($$2, $$4, $$1);
            alf<dkp> $$10 = this.e($$2, $$4, $$1);
            alf<dkp> $$11 = this.a($$2, $$4);
            alf<dkp> $$12 = this.a($$2, $$4, $$1, $$6);
            alf<dkp> $$13 = this.d($$2, $$4, $$1);
            alf<dkp> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dky.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dky.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dky.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dky.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dky.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dky.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dky.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dky.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dky.d, alf<dkp>>> $$0, dky.b $$1) {
      this.a($$0, this.o, this.o, this.x, dky.b.a(this.r[0], this.r[2]), $$1, 0.0F, dkw.P);
      this.a($$0, dky.b.a(this.p[1], this.p[2]), this.o, dky.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dkw.g);
      this.a($$0, dky.b.a(this.p[3], this.p[4]), this.o, dky.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dkw.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dky.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dky.b $$5 = this.q[$$4];
            alf<dkp> $$6 = this.a($$2, $$4, $$1);
            alf<dkp> $$7 = this.b($$2, $$4, $$1);
            alf<dkp> $$8 = this.c($$2, $$4, $$1);
            alf<dkp> $$9 = this.a($$2, $$4);
            alf<dkp> $$10 = this.a($$2, $$4, $$1, $$6);
            alf<dkp> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dky.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dky.b.a(this.A, this.B), dky.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dky.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dky.b.a(this.A, this.B), dky.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dky.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dky.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dky.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dky.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dky.d, alf<dkp>>> $$0, dky.b $$1) {
      this.a($$0, this.s, this.o, this.x, dky.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dkw.P : dkw.M);
      this.a($$0, this.t, this.o, this.x, dky.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dkw.P : dkw.L);
      this.a($$0, this.s, this.o, this.z, dky.b.a(this.r[0], this.r[1]), $$1, 0.0F, dkw.M);
      this.a($$0, this.t, this.o, this.z, dky.b.a(this.r[0], this.r[1]), $$1, 0.0F, dkw.L);
      this.a($$0, this.s, this.o, dky.b.a(this.x, this.B), dky.b.a(this.r[2], this.r[5]), $$1, 0.0F, dkw.M);
      this.a($$0, this.t, this.o, dky.b.a(this.x, this.B), dky.b.a(this.r[2], this.r[5]), $$1, 0.0F, dkw.L);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dkw.M);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dkw.L);
      this.a($$0, dky.b.a(this.p[1], this.p[2]), this.o, dky.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dkw.g);
      this.a($$0, dky.b.a(this.p[3], this.p[4]), this.o, dky.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dkw.h);
      this.a($$0, this.s, this.o, dky.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dkw.M);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dky.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dky.b $$5 = this.q[$$4];
            alf<dkp> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dky.b.a(this.A, this.B), dky.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dky.d, alf<dkp>>> $$0) {
      this.b($$0, this.o, this.o, dky.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dkw.aa);
      this.b($$0, this.o, dky.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dkw.ab);
      this.c($$0, this.o, this.o, this.o, dky.b.a(this.r[0], this.r[1]), this.o, 0.0F, dkw.ac);
   }

   private alf<dkp> a(int $$0, int $$1, dky.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         alf<dkp> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private alf<dkp> b(int $$0, int $$1, dky.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private alf<dkp> c(int $$0, int $$1, dky.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private alf<dkp> a(int $$0, int $$1, dky.b $$2, alf<dkp> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dkw.x : $$3;
   }

   private alf<dkp> d(int $$0, int $$1, dky.b $$2) {
      alf<dkp> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private alf<dkp> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dkw.O;
      } else {
         return $$0 == 4 ? dkw.f : dkw.N;
      }
   }

   private alf<dkp> a(int $$0, dky.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dkw.B : dkw.C;
      } else {
         return $$0 < 3 ? dkw.B : dkw.D;
      }
   }

   private alf<dkp> e(int $$0, int $$1, dky.b $$2) {
      if ($$2.b() >= 0L) {
         alf<dkp> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private alf<dkp> f(int $$0, int $$1, dky.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dkw.J : dkw.I;
      } else {
         return $$0 == 3 ? dkw.K : this.a($$1, $$2);
      }
   }

   private alf<dkp> g(int $$0, int $$1, dky.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dkw.H : dkw.G;
      }
   }

   private alf<dkp> h(int $$0, int $$1, dky.b $$2) {
      alf<dkp> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dky.d, alf<dkp>>> $$0, dky.b $$1, dky.b $$2, dky.b $$3, dky.b $$4, dky.b $$5, float $$6, alf<dkp> $$7) {
      $$0.accept(Pair.of(dky.a($$1, $$2, $$3, $$4, dky.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dky.a($$1, $$2, $$3, $$4, dky.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dky.d, alf<dkp>>> $$0, dky.b $$1, dky.b $$2, dky.b $$3, dky.b $$4, dky.b $$5, float $$6, alf<dkp> $$7) {
      $$0.accept(Pair.of(dky.a($$1, $$2, $$3, $$4, dky.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dky.d, alf<dkp>>> $$0, dky.b $$1, dky.b $$2, dky.b $$3, dky.b $$4, dky.b $$5, float $$6, alf<dkp> $$7) {
      $$0.accept(Pair.of(dky.a($$1, $$2, $$3, $$4, dky.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(egl $$0, egl $$1, egl.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)egz.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)egz.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)egz.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)egz.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dky.a((float)$$0);
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

   private static String a(double $$0, dky.b[] $$1) {
      double $$2 = (double)dky.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bav
   public dky.b[] b() {
      return this.p;
   }

   @bav
   public dky.b[] c() {
      return this.q;
   }

   @bav
   public dky.b[] d() {
      return this.r;
   }

   @bav
   public dky.b[] e() {
      return new dky.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @bav
   public dky.b[] f() {
      return new dky.b[]{
         dky.b.a(-2.0F, egz.a(0.05F)),
         dky.b.a(egz.a(0.05F), egz.a(0.26666668F)),
         dky.b.a(egz.a(0.26666668F), egz.a(0.4F)),
         dky.b.a(egz.a(0.4F), egz.a(0.56666666F)),
         dky.b.a(egz.a(0.56666666F), 2.0F)
      };
   }

   @bav
   public dky.b[] g() {
      return new dky.b[]{dky.b.a(-2.0F, 0.0F), dky.b.a(0.0F, 2.0F)};
   }
}
