import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dla {
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
   private final dkt.b o = dkt.b.a(-1.0F, 1.0F);
   private final dkt.b[] p = new dkt.b[]{dkt.b.a(-1.0F, -0.45F), dkt.b.a(-0.45F, -0.15F), dkt.b.a(-0.15F, 0.2F), dkt.b.a(0.2F, 0.55F), dkt.b.a(0.55F, 1.0F)};
   private final dkt.b[] q = new dkt.b[]{dkt.b.a(-1.0F, -0.35F), dkt.b.a(-0.35F, -0.1F), dkt.b.a(-0.1F, 0.1F), dkt.b.a(0.1F, 0.3F), dkt.b.a(0.3F, 1.0F)};
   private final dkt.b[] r = new dkt.b[]{
      dkt.b.a(-1.0F, -0.78F),
      dkt.b.a(-0.78F, -0.375F),
      dkt.b.a(-0.375F, -0.2225F),
      dkt.b.a(-0.2225F, 0.05F),
      dkt.b.a(0.05F, 0.45F),
      dkt.b.a(0.45F, 0.55F),
      dkt.b.a(0.55F, 1.0F)
   };
   private final dkt.b s = this.p[0];
   private final dkt.b t = dkt.b.a(this.p[1], this.p[4]);
   private final dkt.b u = dkt.b.a(-1.2F, -1.05F);
   private final dkt.b v = dkt.b.a(-1.05F, -0.455F);
   private final dkt.b w = dkt.b.a(-0.455F, -0.19F);
   private final dkt.b x = dkt.b.a(-0.19F, -0.11F);
   private final dkt.b y = dkt.b.a(-0.11F, 0.55F);
   private final dkt.b z = dkt.b.a(-0.11F, 0.03F);
   private final dkt.b A = dkt.b.a(0.03F, 0.3F);
   private final dkt.b B = dkt.b.a(0.3F, 1.0F);
   private final alf<dkk>[][] C = new alf[][]{{dkr.Y, dkr.W, dkr.U, dkr.S, dkr.Q}, {dkr.X, dkr.V, dkr.T, dkr.R, dkr.Q}};
   private final alf<dkk>[][] D = new alf[][]{
      {dkr.d, dkr.d, dkr.d, dkr.r, dkr.q},
      {dkr.b, dkr.b, dkr.i, dkr.q, dkr.p},
      {dkr.j, dkr.b, dkr.i, dkr.k, dkr.l},
      {dkr.s, dkr.s, dkr.i, dkr.y, dkr.y},
      {dkr.f, dkr.f, dkr.f, dkr.f, dkr.f}
   };
   private final alf<dkk>[][] E = new alf[][]{
      {dkr.e, null, dkr.r, null, null},
      {null, null, null, null, dkr.o},
      {dkr.c, null, null, dkr.n, null},
      {null, null, dkr.b, dkr.z, dkr.A},
      {null, null, null, null, null}
   };
   private final alf<dkk>[][] F = new alf[][]{
      {dkr.d, dkr.d, dkr.d, dkr.r, dkr.r},
      {dkr.E, dkr.E, dkr.i, dkr.q, dkr.p},
      {dkr.E, dkr.E, dkr.E, dkr.E, dkr.m},
      {dkr.t, dkr.t, dkr.i, dkr.i, dkr.y},
      {dkr.B, dkr.B, dkr.B, dkr.D, dkr.D}
   };
   private final alf<dkk>[][] G = new alf[][]{
      {dkr.e, null, null, null, null},
      {dkr.F, null, dkr.E, dkr.E, dkr.o},
      {dkr.F, dkr.F, dkr.i, dkr.k, null},
      {null, null, null, null, null},
      {dkr.C, dkr.C, null, null, null}
   };
   private final alf<dkk>[][] H = new alf[][]{
      {dkr.v, dkr.v, dkr.u, dkr.w, dkr.w},
      {dkr.v, dkr.v, dkr.u, dkr.w, dkr.w},
      {dkr.u, dkr.u, dkr.u, dkr.w, dkr.w},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dkt.d> a() {
      dkt.b $$0 = dkt.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dkt.d(this.o, this.o, dkt.b.a(this.y, this.o), this.o, $$0, dkt.b.a(-1.0F, -0.16F), 0L),
         new dkt.d(this.o, this.o, dkt.b.a(this.y, this.o), this.o, $$0, dkt.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dkt.d, alf<dkk>>> $$0) {
      if (ac.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dkt.d, alf<dkk>>> $$0) {
      jh.a $$1 = ow.a();
      jg<egg> $$2 = $$1.e(mh.aO);
      egh.w.a $$3 = new egh.w.a($$2.b(egu.d));
      egh.w.a $$4 = new egh.w.a($$2.b(egu.e));
      egh.w.a $$5 = new egh.w.a($$2.b(egu.g));
      $$0.accept(Pair.of(dkt.a(this.o, this.o, this.o, this.o, dkt.b.a(0.0F), this.o, 0.01F), dkr.b));
      if (qw.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, bar.a) instanceof ayn.e<?, ?> $$7) {
         alf<dkk> $$8 = dkr.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dkt.a(this.o, this.o, this.o, dkt.b.a($$9), dkt.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dkr.f ? dkr.B : dkr.f;
         }
      }

      if (qw.a($$3, $$4, $$5, false) instanceof ayn.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dkt.a(this.o, this.o, dkt.b.a($$12), this.o, dkt.b.a(0.0F), this.o, 0.0F), dkr.r));
         }
      }
   }

   private void c(Consumer<Pair<dkt.d, alf<dkk>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dkr.Z);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dkt.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dkt.d, alf<dkk>>> $$0) {
      this.c($$0, dkt.b.a(-1.0F, -0.93333334F));
      this.b($$0, dkt.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dkt.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dkt.b.a(-0.56666666F, -0.4F));
      this.c($$0, dkt.b.a(-0.4F, -0.26666668F));
      this.d($$0, dkt.b.a(-0.26666668F, -0.05F));
      this.e($$0, dkt.b.a(-0.05F, 0.05F));
      this.d($$0, dkt.b.a(0.05F, 0.26666668F));
      this.c($$0, dkt.b.a(0.26666668F, 0.4F));
      this.b($$0, dkt.b.a(0.4F, 0.56666666F));
      this.a($$0, dkt.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dkt.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dkt.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dkt.d, alf<dkk>>> $$0, dkt.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dkt.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dkt.b $$5 = this.q[$$4];
            alf<dkk> $$6 = this.a($$2, $$4, $$1);
            alf<dkk> $$7 = this.b($$2, $$4, $$1);
            alf<dkk> $$8 = this.c($$2, $$4, $$1);
            alf<dkk> $$9 = this.e($$2, $$4, $$1);
            alf<dkk> $$10 = this.h($$2, $$4, $$1);
            alf<dkk> $$11 = this.a($$2, $$4, $$1, $$10);
            alf<dkk> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dkt.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dkt.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dkt.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dkt.b.a(this.x, this.z), dkt.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkt.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dkt.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkt.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dkt.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dkt.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dkt.d, alf<dkk>>> $$0, dkt.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dkt.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dkt.b $$5 = this.q[$$4];
            alf<dkk> $$6 = this.a($$2, $$4, $$1);
            alf<dkk> $$7 = this.b($$2, $$4, $$1);
            alf<dkk> $$8 = this.c($$2, $$4, $$1);
            alf<dkk> $$9 = this.e($$2, $$4, $$1);
            alf<dkk> $$10 = this.h($$2, $$4, $$1);
            alf<dkk> $$11 = this.a($$2, $$4, $$1, $$6);
            alf<dkk> $$12 = this.g($$2, $$4, $$1);
            alf<dkk> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dkt.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dkt.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dkt.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dkt.b.a(this.x, this.z), dkt.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkt.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dkt.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkt.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dkt.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dkt.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dkt.d, alf<dkk>>> $$0, dkt.b $$1) {
      this.a($$0, this.o, this.o, this.x, dkt.b.a(this.r[0], this.r[2]), $$1, 0.0F, dkr.P);
      this.a($$0, dkt.b.a(this.p[1], this.p[2]), this.o, dkt.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dkr.g);
      this.a($$0, dkt.b.a(this.p[3], this.p[4]), this.o, dkt.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dkr.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dkt.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dkt.b $$5 = this.q[$$4];
            alf<dkk> $$6 = this.a($$2, $$4, $$1);
            alf<dkk> $$7 = this.b($$2, $$4, $$1);
            alf<dkk> $$8 = this.c($$2, $$4, $$1);
            alf<dkk> $$9 = this.h($$2, $$4, $$1);
            alf<dkk> $$10 = this.e($$2, $$4, $$1);
            alf<dkk> $$11 = this.a($$2, $$4);
            alf<dkk> $$12 = this.a($$2, $$4, $$1, $$6);
            alf<dkk> $$13 = this.d($$2, $$4, $$1);
            alf<dkk> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dkt.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dkt.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dkt.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkt.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dkt.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dkt.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dkt.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dkt.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dkt.d, alf<dkk>>> $$0, dkt.b $$1) {
      this.a($$0, this.o, this.o, this.x, dkt.b.a(this.r[0], this.r[2]), $$1, 0.0F, dkr.P);
      this.a($$0, dkt.b.a(this.p[1], this.p[2]), this.o, dkt.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dkr.g);
      this.a($$0, dkt.b.a(this.p[3], this.p[4]), this.o, dkt.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dkr.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dkt.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dkt.b $$5 = this.q[$$4];
            alf<dkk> $$6 = this.a($$2, $$4, $$1);
            alf<dkk> $$7 = this.b($$2, $$4, $$1);
            alf<dkk> $$8 = this.c($$2, $$4, $$1);
            alf<dkk> $$9 = this.a($$2, $$4);
            alf<dkk> $$10 = this.a($$2, $$4, $$1, $$6);
            alf<dkk> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dkt.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dkt.b.a(this.A, this.B), dkt.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dkt.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkt.b.a(this.A, this.B), dkt.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dkt.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dkt.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dkt.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dkt.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dkt.d, alf<dkk>>> $$0, dkt.b $$1) {
      this.a($$0, this.s, this.o, this.x, dkt.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dkr.P : dkr.M);
      this.a($$0, this.t, this.o, this.x, dkt.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dkr.P : dkr.L);
      this.a($$0, this.s, this.o, this.z, dkt.b.a(this.r[0], this.r[1]), $$1, 0.0F, dkr.M);
      this.a($$0, this.t, this.o, this.z, dkt.b.a(this.r[0], this.r[1]), $$1, 0.0F, dkr.L);
      this.a($$0, this.s, this.o, dkt.b.a(this.x, this.B), dkt.b.a(this.r[2], this.r[5]), $$1, 0.0F, dkr.M);
      this.a($$0, this.t, this.o, dkt.b.a(this.x, this.B), dkt.b.a(this.r[2], this.r[5]), $$1, 0.0F, dkr.L);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dkr.M);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dkr.L);
      this.a($$0, dkt.b.a(this.p[1], this.p[2]), this.o, dkt.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dkr.g);
      this.a($$0, dkt.b.a(this.p[3], this.p[4]), this.o, dkt.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dkr.h);
      this.a($$0, this.s, this.o, dkt.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dkr.M);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dkt.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dkt.b $$5 = this.q[$$4];
            alf<dkk> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dkt.b.a(this.A, this.B), dkt.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dkt.d, alf<dkk>>> $$0) {
      this.b($$0, this.o, this.o, dkt.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dkr.aa);
      this.b($$0, this.o, dkt.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dkr.ab);
      this.c($$0, this.o, this.o, this.o, dkt.b.a(this.r[0], this.r[1]), this.o, 0.0F, dkr.ac);
   }

   private alf<dkk> a(int $$0, int $$1, dkt.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         alf<dkk> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private alf<dkk> b(int $$0, int $$1, dkt.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private alf<dkk> c(int $$0, int $$1, dkt.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private alf<dkk> a(int $$0, int $$1, dkt.b $$2, alf<dkk> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dkr.x : $$3;
   }

   private alf<dkk> d(int $$0, int $$1, dkt.b $$2) {
      alf<dkk> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private alf<dkk> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dkr.O;
      } else {
         return $$0 == 4 ? dkr.f : dkr.N;
      }
   }

   private alf<dkk> a(int $$0, dkt.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dkr.B : dkr.C;
      } else {
         return $$0 < 3 ? dkr.B : dkr.D;
      }
   }

   private alf<dkk> e(int $$0, int $$1, dkt.b $$2) {
      if ($$2.b() >= 0L) {
         alf<dkk> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private alf<dkk> f(int $$0, int $$1, dkt.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dkr.J : dkr.I;
      } else {
         return $$0 == 3 ? dkr.K : this.a($$1, $$2);
      }
   }

   private alf<dkk> g(int $$0, int $$1, dkt.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dkr.H : dkr.G;
      }
   }

   private alf<dkk> h(int $$0, int $$1, dkt.b $$2) {
      alf<dkk> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dkt.d, alf<dkk>>> $$0, dkt.b $$1, dkt.b $$2, dkt.b $$3, dkt.b $$4, dkt.b $$5, float $$6, alf<dkk> $$7) {
      $$0.accept(Pair.of(dkt.a($$1, $$2, $$3, $$4, dkt.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dkt.a($$1, $$2, $$3, $$4, dkt.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dkt.d, alf<dkk>>> $$0, dkt.b $$1, dkt.b $$2, dkt.b $$3, dkt.b $$4, dkt.b $$5, float $$6, alf<dkk> $$7) {
      $$0.accept(Pair.of(dkt.a($$1, $$2, $$3, $$4, dkt.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dkt.d, alf<dkk>>> $$0, dkt.b $$1, dkt.b $$2, dkt.b $$3, dkt.b $$4, dkt.b $$5, float $$6, alf<dkk> $$7) {
      $$0.accept(Pair.of(dkt.a($$1, $$2, $$3, $$4, dkt.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(egg $$0, egg $$1, egg.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)egu.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)egu.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)egu.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)egu.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dkt.a((float)$$0);
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

   private static String a(double $$0, dkt.b[] $$1) {
      double $$2 = (double)dkt.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bav
   public dkt.b[] b() {
      return this.p;
   }

   @bav
   public dkt.b[] c() {
      return this.q;
   }

   @bav
   public dkt.b[] d() {
      return this.r;
   }

   @bav
   public dkt.b[] e() {
      return new dkt.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @bav
   public dkt.b[] f() {
      return new dkt.b[]{
         dkt.b.a(-2.0F, egu.a(0.05F)),
         dkt.b.a(egu.a(0.05F), egu.a(0.26666668F)),
         dkt.b.a(egu.a(0.26666668F), egu.a(0.4F)),
         dkt.b.a(egu.a(0.4F), egu.a(0.56666666F)),
         dkt.b.a(egu.a(0.56666666F), 2.0F)
      };
   }

   @bav
   public dkt.b[] g() {
      return new dkt.b[]{dkt.b.a(-2.0F, 0.0F), dkt.b.a(0.0F, 2.0F)};
   }
}
