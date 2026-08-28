import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dkt {
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
   private final dkm.b o = dkm.b.a(-1.0F, 1.0F);
   private final dkm.b[] p = new dkm.b[]{dkm.b.a(-1.0F, -0.45F), dkm.b.a(-0.45F, -0.15F), dkm.b.a(-0.15F, 0.2F), dkm.b.a(0.2F, 0.55F), dkm.b.a(0.55F, 1.0F)};
   private final dkm.b[] q = new dkm.b[]{dkm.b.a(-1.0F, -0.35F), dkm.b.a(-0.35F, -0.1F), dkm.b.a(-0.1F, 0.1F), dkm.b.a(0.1F, 0.3F), dkm.b.a(0.3F, 1.0F)};
   private final dkm.b[] r = new dkm.b[]{
      dkm.b.a(-1.0F, -0.78F),
      dkm.b.a(-0.78F, -0.375F),
      dkm.b.a(-0.375F, -0.2225F),
      dkm.b.a(-0.2225F, 0.05F),
      dkm.b.a(0.05F, 0.45F),
      dkm.b.a(0.45F, 0.55F),
      dkm.b.a(0.55F, 1.0F)
   };
   private final dkm.b s = this.p[0];
   private final dkm.b t = dkm.b.a(this.p[1], this.p[4]);
   private final dkm.b u = dkm.b.a(-1.2F, -1.05F);
   private final dkm.b v = dkm.b.a(-1.05F, -0.455F);
   private final dkm.b w = dkm.b.a(-0.455F, -0.19F);
   private final dkm.b x = dkm.b.a(-0.19F, -0.11F);
   private final dkm.b y = dkm.b.a(-0.11F, 0.55F);
   private final dkm.b z = dkm.b.a(-0.11F, 0.03F);
   private final dkm.b A = dkm.b.a(0.03F, 0.3F);
   private final dkm.b B = dkm.b.a(0.3F, 1.0F);
   private final alf<dkd>[][] C = new alf[][]{{dkk.Y, dkk.W, dkk.U, dkk.S, dkk.Q}, {dkk.X, dkk.V, dkk.T, dkk.R, dkk.Q}};
   private final alf<dkd>[][] D = new alf[][]{
      {dkk.d, dkk.d, dkk.d, dkk.r, dkk.q},
      {dkk.b, dkk.b, dkk.i, dkk.q, dkk.p},
      {dkk.j, dkk.b, dkk.i, dkk.k, dkk.l},
      {dkk.s, dkk.s, dkk.i, dkk.y, dkk.y},
      {dkk.f, dkk.f, dkk.f, dkk.f, dkk.f}
   };
   private final alf<dkd>[][] E = new alf[][]{
      {dkk.e, null, dkk.r, null, null},
      {null, null, null, null, dkk.o},
      {dkk.c, null, null, dkk.n, null},
      {null, null, dkk.b, dkk.z, dkk.A},
      {null, null, null, null, null}
   };
   private final alf<dkd>[][] F = new alf[][]{
      {dkk.d, dkk.d, dkk.d, dkk.r, dkk.r},
      {dkk.E, dkk.E, dkk.i, dkk.q, dkk.p},
      {dkk.E, dkk.E, dkk.E, dkk.E, dkk.m},
      {dkk.t, dkk.t, dkk.i, dkk.i, dkk.y},
      {dkk.B, dkk.B, dkk.B, dkk.D, dkk.D}
   };
   private final alf<dkd>[][] G = new alf[][]{
      {dkk.e, null, null, null, null},
      {dkk.F, null, dkk.E, dkk.E, dkk.o},
      {dkk.F, dkk.F, dkk.i, dkk.k, null},
      {null, null, null, null, null},
      {dkk.C, dkk.C, null, null, null}
   };
   private final alf<dkd>[][] H = new alf[][]{
      {dkk.v, dkk.v, dkk.u, dkk.w, dkk.w},
      {dkk.v, dkk.v, dkk.u, dkk.w, dkk.w},
      {dkk.u, dkk.u, dkk.u, dkk.w, dkk.w},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dkm.d> a() {
      dkm.b $$0 = dkm.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dkm.d(this.o, this.o, dkm.b.a(this.y, this.o), this.o, $$0, dkm.b.a(-1.0F, -0.16F), 0L),
         new dkm.d(this.o, this.o, dkm.b.a(this.y, this.o), this.o, $$0, dkm.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dkm.d, alf<dkd>>> $$0) {
      if (ab.ar) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dkm.d, alf<dkd>>> $$0) {
      jg.a $$1 = ov.a();
      jf<efz> $$2 = $$1.e(mg.aO);
      ega.w.a $$3 = new ega.w.a($$2.b(egn.d));
      ega.w.a $$4 = new ega.w.a($$2.b(egn.e));
      ega.w.a $$5 = new ega.w.a($$2.b(egn.g));
      $$0.accept(Pair.of(dkm.a(this.o, this.o, this.o, this.o, dkm.b.a(0.0F), this.o, 0.01F), dkk.b));
      if (qw.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, bar.a) instanceof ayn.e<?, ?> $$7) {
         alf<dkd> $$8 = dkk.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dkm.a(this.o, this.o, this.o, dkm.b.a($$9), dkm.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dkk.f ? dkk.B : dkk.f;
         }
      }

      if (qw.a($$3, $$4, $$5, false) instanceof ayn.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dkm.a(this.o, this.o, dkm.b.a($$12), this.o, dkm.b.a(0.0F), this.o, 0.0F), dkk.r));
         }
      }
   }

   private void c(Consumer<Pair<dkm.d, alf<dkd>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dkk.Z);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dkm.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dkm.d, alf<dkd>>> $$0) {
      this.c($$0, dkm.b.a(-1.0F, -0.93333334F));
      this.b($$0, dkm.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dkm.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dkm.b.a(-0.56666666F, -0.4F));
      this.c($$0, dkm.b.a(-0.4F, -0.26666668F));
      this.d($$0, dkm.b.a(-0.26666668F, -0.05F));
      this.e($$0, dkm.b.a(-0.05F, 0.05F));
      this.d($$0, dkm.b.a(0.05F, 0.26666668F));
      this.c($$0, dkm.b.a(0.26666668F, 0.4F));
      this.b($$0, dkm.b.a(0.4F, 0.56666666F));
      this.a($$0, dkm.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dkm.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dkm.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dkm.d, alf<dkd>>> $$0, dkm.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dkm.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dkm.b $$5 = this.q[$$4];
            alf<dkd> $$6 = this.a($$2, $$4, $$1);
            alf<dkd> $$7 = this.b($$2, $$4, $$1);
            alf<dkd> $$8 = this.c($$2, $$4, $$1);
            alf<dkd> $$9 = this.e($$2, $$4, $$1);
            alf<dkd> $$10 = this.h($$2, $$4, $$1);
            alf<dkd> $$11 = this.a($$2, $$4, $$1, $$10);
            alf<dkd> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dkm.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dkm.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dkm.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dkm.b.a(this.x, this.z), dkm.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkm.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dkm.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkm.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dkm.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dkm.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dkm.d, alf<dkd>>> $$0, dkm.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dkm.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dkm.b $$5 = this.q[$$4];
            alf<dkd> $$6 = this.a($$2, $$4, $$1);
            alf<dkd> $$7 = this.b($$2, $$4, $$1);
            alf<dkd> $$8 = this.c($$2, $$4, $$1);
            alf<dkd> $$9 = this.e($$2, $$4, $$1);
            alf<dkd> $$10 = this.h($$2, $$4, $$1);
            alf<dkd> $$11 = this.a($$2, $$4, $$1, $$6);
            alf<dkd> $$12 = this.g($$2, $$4, $$1);
            alf<dkd> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dkm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dkm.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dkm.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dkm.b.a(this.x, this.z), dkm.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkm.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dkm.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkm.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dkm.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dkm.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dkm.d, alf<dkd>>> $$0, dkm.b $$1) {
      this.a($$0, this.o, this.o, this.x, dkm.b.a(this.r[0], this.r[2]), $$1, 0.0F, dkk.P);
      this.a($$0, dkm.b.a(this.p[1], this.p[2]), this.o, dkm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dkk.g);
      this.a($$0, dkm.b.a(this.p[3], this.p[4]), this.o, dkm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dkk.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dkm.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dkm.b $$5 = this.q[$$4];
            alf<dkd> $$6 = this.a($$2, $$4, $$1);
            alf<dkd> $$7 = this.b($$2, $$4, $$1);
            alf<dkd> $$8 = this.c($$2, $$4, $$1);
            alf<dkd> $$9 = this.h($$2, $$4, $$1);
            alf<dkd> $$10 = this.e($$2, $$4, $$1);
            alf<dkd> $$11 = this.a($$2, $$4);
            alf<dkd> $$12 = this.a($$2, $$4, $$1, $$6);
            alf<dkd> $$13 = this.d($$2, $$4, $$1);
            alf<dkd> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dkm.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dkm.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dkm.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkm.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dkm.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dkm.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dkm.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dkm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dkm.d, alf<dkd>>> $$0, dkm.b $$1) {
      this.a($$0, this.o, this.o, this.x, dkm.b.a(this.r[0], this.r[2]), $$1, 0.0F, dkk.P);
      this.a($$0, dkm.b.a(this.p[1], this.p[2]), this.o, dkm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dkk.g);
      this.a($$0, dkm.b.a(this.p[3], this.p[4]), this.o, dkm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dkk.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dkm.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dkm.b $$5 = this.q[$$4];
            alf<dkd> $$6 = this.a($$2, $$4, $$1);
            alf<dkd> $$7 = this.b($$2, $$4, $$1);
            alf<dkd> $$8 = this.c($$2, $$4, $$1);
            alf<dkd> $$9 = this.a($$2, $$4);
            alf<dkd> $$10 = this.a($$2, $$4, $$1, $$6);
            alf<dkd> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dkm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dkm.b.a(this.A, this.B), dkm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dkm.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkm.b.a(this.A, this.B), dkm.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dkm.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dkm.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dkm.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dkm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dkm.d, alf<dkd>>> $$0, dkm.b $$1) {
      this.a($$0, this.s, this.o, this.x, dkm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dkk.P : dkk.M);
      this.a($$0, this.t, this.o, this.x, dkm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dkk.P : dkk.L);
      this.a($$0, this.s, this.o, this.z, dkm.b.a(this.r[0], this.r[1]), $$1, 0.0F, dkk.M);
      this.a($$0, this.t, this.o, this.z, dkm.b.a(this.r[0], this.r[1]), $$1, 0.0F, dkk.L);
      this.a($$0, this.s, this.o, dkm.b.a(this.x, this.B), dkm.b.a(this.r[2], this.r[5]), $$1, 0.0F, dkk.M);
      this.a($$0, this.t, this.o, dkm.b.a(this.x, this.B), dkm.b.a(this.r[2], this.r[5]), $$1, 0.0F, dkk.L);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dkk.M);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dkk.L);
      this.a($$0, dkm.b.a(this.p[1], this.p[2]), this.o, dkm.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dkk.g);
      this.a($$0, dkm.b.a(this.p[3], this.p[4]), this.o, dkm.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dkk.h);
      this.a($$0, this.s, this.o, dkm.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dkk.M);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dkm.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dkm.b $$5 = this.q[$$4];
            alf<dkd> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dkm.b.a(this.A, this.B), dkm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dkm.d, alf<dkd>>> $$0) {
      this.b($$0, this.o, this.o, dkm.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dkk.aa);
      this.b($$0, this.o, dkm.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dkk.ab);
      this.c($$0, this.o, this.o, this.o, dkm.b.a(this.r[0], this.r[1]), this.o, 0.0F, dkk.ac);
   }

   private alf<dkd> a(int $$0, int $$1, dkm.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         alf<dkd> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private alf<dkd> b(int $$0, int $$1, dkm.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private alf<dkd> c(int $$0, int $$1, dkm.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private alf<dkd> a(int $$0, int $$1, dkm.b $$2, alf<dkd> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dkk.x : $$3;
   }

   private alf<dkd> d(int $$0, int $$1, dkm.b $$2) {
      alf<dkd> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private alf<dkd> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dkk.O;
      } else {
         return $$0 == 4 ? dkk.f : dkk.N;
      }
   }

   private alf<dkd> a(int $$0, dkm.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dkk.B : dkk.C;
      } else {
         return $$0 < 3 ? dkk.B : dkk.D;
      }
   }

   private alf<dkd> e(int $$0, int $$1, dkm.b $$2) {
      if ($$2.b() >= 0L) {
         alf<dkd> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private alf<dkd> f(int $$0, int $$1, dkm.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dkk.J : dkk.I;
      } else {
         return $$0 == 3 ? dkk.K : this.a($$1, $$2);
      }
   }

   private alf<dkd> g(int $$0, int $$1, dkm.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dkk.H : dkk.G;
      }
   }

   private alf<dkd> h(int $$0, int $$1, dkm.b $$2) {
      alf<dkd> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dkm.d, alf<dkd>>> $$0, dkm.b $$1, dkm.b $$2, dkm.b $$3, dkm.b $$4, dkm.b $$5, float $$6, alf<dkd> $$7) {
      $$0.accept(Pair.of(dkm.a($$1, $$2, $$3, $$4, dkm.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dkm.a($$1, $$2, $$3, $$4, dkm.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dkm.d, alf<dkd>>> $$0, dkm.b $$1, dkm.b $$2, dkm.b $$3, dkm.b $$4, dkm.b $$5, float $$6, alf<dkd> $$7) {
      $$0.accept(Pair.of(dkm.a($$1, $$2, $$3, $$4, dkm.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dkm.d, alf<dkd>>> $$0, dkm.b $$1, dkm.b $$2, dkm.b $$3, dkm.b $$4, dkm.b $$5, float $$6, alf<dkd> $$7) {
      $$0.accept(Pair.of(dkm.a($$1, $$2, $$3, $$4, dkm.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(efz $$0, efz $$1, efz.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)egn.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)egn.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)egn.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)egn.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dkm.a((float)$$0);
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

   private static String a(double $$0, dkm.b[] $$1) {
      double $$2 = (double)dkm.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bav
   public dkm.b[] b() {
      return this.p;
   }

   @bav
   public dkm.b[] c() {
      return this.q;
   }

   @bav
   public dkm.b[] d() {
      return this.r;
   }

   @bav
   public dkm.b[] e() {
      return new dkm.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @bav
   public dkm.b[] f() {
      return new dkm.b[]{
         dkm.b.a(-2.0F, egn.a(0.05F)),
         dkm.b.a(egn.a(0.05F), egn.a(0.26666668F)),
         dkm.b.a(egn.a(0.26666668F), egn.a(0.4F)),
         dkm.b.a(egn.a(0.4F), egn.a(0.56666666F)),
         dkm.b.a(egn.a(0.56666666F), 2.0F)
      };
   }

   @bav
   public dkm.b[] g() {
      return new dkm.b[]{dkm.b.a(-2.0F, 0.0F), dkm.b.a(0.0F, 2.0F)};
   }
}
