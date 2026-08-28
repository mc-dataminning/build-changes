import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dko {
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
   private final dkh.b o = dkh.b.a(-1.0F, 1.0F);
   private final dkh.b[] p = new dkh.b[]{dkh.b.a(-1.0F, -0.45F), dkh.b.a(-0.45F, -0.15F), dkh.b.a(-0.15F, 0.2F), dkh.b.a(0.2F, 0.55F), dkh.b.a(0.55F, 1.0F)};
   private final dkh.b[] q = new dkh.b[]{dkh.b.a(-1.0F, -0.35F), dkh.b.a(-0.35F, -0.1F), dkh.b.a(-0.1F, 0.1F), dkh.b.a(0.1F, 0.3F), dkh.b.a(0.3F, 1.0F)};
   private final dkh.b[] r = new dkh.b[]{
      dkh.b.a(-1.0F, -0.78F),
      dkh.b.a(-0.78F, -0.375F),
      dkh.b.a(-0.375F, -0.2225F),
      dkh.b.a(-0.2225F, 0.05F),
      dkh.b.a(0.05F, 0.45F),
      dkh.b.a(0.45F, 0.55F),
      dkh.b.a(0.55F, 1.0F)
   };
   private final dkh.b s = this.p[0];
   private final dkh.b t = dkh.b.a(this.p[1], this.p[4]);
   private final dkh.b u = dkh.b.a(-1.2F, -1.05F);
   private final dkh.b v = dkh.b.a(-1.05F, -0.455F);
   private final dkh.b w = dkh.b.a(-0.455F, -0.19F);
   private final dkh.b x = dkh.b.a(-0.19F, -0.11F);
   private final dkh.b y = dkh.b.a(-0.11F, 0.55F);
   private final dkh.b z = dkh.b.a(-0.11F, 0.03F);
   private final dkh.b A = dkh.b.a(0.03F, 0.3F);
   private final dkh.b B = dkh.b.a(0.3F, 1.0F);
   private final alf<djy>[][] C = new alf[][]{{dkf.Y, dkf.W, dkf.U, dkf.S, dkf.Q}, {dkf.X, dkf.V, dkf.T, dkf.R, dkf.Q}};
   private final alf<djy>[][] D = new alf[][]{
      {dkf.d, dkf.d, dkf.d, dkf.r, dkf.q},
      {dkf.b, dkf.b, dkf.i, dkf.q, dkf.p},
      {dkf.j, dkf.b, dkf.i, dkf.k, dkf.l},
      {dkf.s, dkf.s, dkf.i, dkf.y, dkf.y},
      {dkf.f, dkf.f, dkf.f, dkf.f, dkf.f}
   };
   private final alf<djy>[][] E = new alf[][]{
      {dkf.e, null, dkf.r, null, null},
      {null, null, null, null, dkf.o},
      {dkf.c, null, null, dkf.n, null},
      {null, null, dkf.b, dkf.z, dkf.A},
      {null, null, null, null, null}
   };
   private final alf<djy>[][] F = new alf[][]{
      {dkf.d, dkf.d, dkf.d, dkf.r, dkf.r},
      {dkf.E, dkf.E, dkf.i, dkf.q, dkf.p},
      {dkf.E, dkf.E, dkf.E, dkf.E, dkf.m},
      {dkf.t, dkf.t, dkf.i, dkf.i, dkf.y},
      {dkf.B, dkf.B, dkf.B, dkf.D, dkf.D}
   };
   private final alf<djy>[][] G = new alf[][]{
      {dkf.e, null, null, null, null},
      {dkf.F, null, dkf.E, dkf.E, dkf.o},
      {dkf.F, dkf.F, dkf.i, dkf.k, null},
      {null, null, null, null, null},
      {dkf.C, dkf.C, null, null, null}
   };
   private final alf<djy>[][] H = new alf[][]{
      {dkf.v, dkf.v, dkf.u, dkf.w, dkf.w},
      {dkf.v, dkf.v, dkf.u, dkf.w, dkf.w},
      {dkf.u, dkf.u, dkf.u, dkf.w, dkf.w},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dkh.d> a() {
      dkh.b $$0 = dkh.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dkh.d(this.o, this.o, dkh.b.a(this.y, this.o), this.o, $$0, dkh.b.a(-1.0F, -0.16F), 0L),
         new dkh.d(this.o, this.o, dkh.b.a(this.y, this.o), this.o, $$0, dkh.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dkh.d, alf<djy>>> $$0) {
      if (ab.ar) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dkh.d, alf<djy>>> $$0) {
      jg.a $$1 = ov.a();
      jf<efr> $$2 = $$1.e(mg.aN);
      efs.w.a $$3 = new efs.w.a($$2.b(egf.d));
      efs.w.a $$4 = new efs.w.a($$2.b(egf.e));
      efs.w.a $$5 = new efs.w.a($$2.b(egf.g));
      $$0.accept(Pair.of(dkh.a(this.o, this.o, this.o, this.o, dkh.b.a(0.0F), this.o, 0.01F), dkf.b));
      if (qw.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, bar.a) instanceof ayn.e<?, ?> $$7) {
         alf<djy> $$8 = dkf.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dkh.a(this.o, this.o, this.o, dkh.b.a($$9), dkh.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dkf.f ? dkf.B : dkf.f;
         }
      }

      if (qw.a($$3, $$4, $$5, false) instanceof ayn.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dkh.a(this.o, this.o, dkh.b.a($$12), this.o, dkh.b.a(0.0F), this.o, 0.0F), dkf.r));
         }
      }
   }

   private void c(Consumer<Pair<dkh.d, alf<djy>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dkf.Z);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dkh.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dkh.d, alf<djy>>> $$0) {
      this.c($$0, dkh.b.a(-1.0F, -0.93333334F));
      this.b($$0, dkh.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dkh.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dkh.b.a(-0.56666666F, -0.4F));
      this.c($$0, dkh.b.a(-0.4F, -0.26666668F));
      this.d($$0, dkh.b.a(-0.26666668F, -0.05F));
      this.e($$0, dkh.b.a(-0.05F, 0.05F));
      this.d($$0, dkh.b.a(0.05F, 0.26666668F));
      this.c($$0, dkh.b.a(0.26666668F, 0.4F));
      this.b($$0, dkh.b.a(0.4F, 0.56666666F));
      this.a($$0, dkh.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dkh.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dkh.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dkh.d, alf<djy>>> $$0, dkh.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dkh.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dkh.b $$5 = this.q[$$4];
            alf<djy> $$6 = this.a($$2, $$4, $$1);
            alf<djy> $$7 = this.b($$2, $$4, $$1);
            alf<djy> $$8 = this.c($$2, $$4, $$1);
            alf<djy> $$9 = this.e($$2, $$4, $$1);
            alf<djy> $$10 = this.h($$2, $$4, $$1);
            alf<djy> $$11 = this.a($$2, $$4, $$1, $$10);
            alf<djy> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dkh.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dkh.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dkh.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dkh.b.a(this.x, this.z), dkh.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkh.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dkh.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkh.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dkh.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dkh.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dkh.d, alf<djy>>> $$0, dkh.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dkh.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dkh.b $$5 = this.q[$$4];
            alf<djy> $$6 = this.a($$2, $$4, $$1);
            alf<djy> $$7 = this.b($$2, $$4, $$1);
            alf<djy> $$8 = this.c($$2, $$4, $$1);
            alf<djy> $$9 = this.e($$2, $$4, $$1);
            alf<djy> $$10 = this.h($$2, $$4, $$1);
            alf<djy> $$11 = this.a($$2, $$4, $$1, $$6);
            alf<djy> $$12 = this.g($$2, $$4, $$1);
            alf<djy> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dkh.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dkh.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dkh.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dkh.b.a(this.x, this.z), dkh.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkh.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dkh.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkh.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dkh.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dkh.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dkh.d, alf<djy>>> $$0, dkh.b $$1) {
      this.a($$0, this.o, this.o, this.x, dkh.b.a(this.r[0], this.r[2]), $$1, 0.0F, dkf.P);
      this.a($$0, dkh.b.a(this.p[1], this.p[2]), this.o, dkh.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dkf.g);
      this.a($$0, dkh.b.a(this.p[3], this.p[4]), this.o, dkh.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dkf.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dkh.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dkh.b $$5 = this.q[$$4];
            alf<djy> $$6 = this.a($$2, $$4, $$1);
            alf<djy> $$7 = this.b($$2, $$4, $$1);
            alf<djy> $$8 = this.c($$2, $$4, $$1);
            alf<djy> $$9 = this.h($$2, $$4, $$1);
            alf<djy> $$10 = this.e($$2, $$4, $$1);
            alf<djy> $$11 = this.a($$2, $$4);
            alf<djy> $$12 = this.a($$2, $$4, $$1, $$6);
            alf<djy> $$13 = this.d($$2, $$4, $$1);
            alf<djy> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dkh.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dkh.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dkh.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkh.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dkh.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dkh.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dkh.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dkh.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dkh.d, alf<djy>>> $$0, dkh.b $$1) {
      this.a($$0, this.o, this.o, this.x, dkh.b.a(this.r[0], this.r[2]), $$1, 0.0F, dkf.P);
      this.a($$0, dkh.b.a(this.p[1], this.p[2]), this.o, dkh.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dkf.g);
      this.a($$0, dkh.b.a(this.p[3], this.p[4]), this.o, dkh.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dkf.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dkh.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dkh.b $$5 = this.q[$$4];
            alf<djy> $$6 = this.a($$2, $$4, $$1);
            alf<djy> $$7 = this.b($$2, $$4, $$1);
            alf<djy> $$8 = this.c($$2, $$4, $$1);
            alf<djy> $$9 = this.a($$2, $$4);
            alf<djy> $$10 = this.a($$2, $$4, $$1, $$6);
            alf<djy> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dkh.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dkh.b.a(this.A, this.B), dkh.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dkh.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkh.b.a(this.A, this.B), dkh.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dkh.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dkh.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dkh.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dkh.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dkh.d, alf<djy>>> $$0, dkh.b $$1) {
      this.a($$0, this.s, this.o, this.x, dkh.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dkf.P : dkf.M);
      this.a($$0, this.t, this.o, this.x, dkh.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dkf.P : dkf.L);
      this.a($$0, this.s, this.o, this.z, dkh.b.a(this.r[0], this.r[1]), $$1, 0.0F, dkf.M);
      this.a($$0, this.t, this.o, this.z, dkh.b.a(this.r[0], this.r[1]), $$1, 0.0F, dkf.L);
      this.a($$0, this.s, this.o, dkh.b.a(this.x, this.B), dkh.b.a(this.r[2], this.r[5]), $$1, 0.0F, dkf.M);
      this.a($$0, this.t, this.o, dkh.b.a(this.x, this.B), dkh.b.a(this.r[2], this.r[5]), $$1, 0.0F, dkf.L);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dkf.M);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dkf.L);
      this.a($$0, dkh.b.a(this.p[1], this.p[2]), this.o, dkh.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dkf.g);
      this.a($$0, dkh.b.a(this.p[3], this.p[4]), this.o, dkh.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dkf.h);
      this.a($$0, this.s, this.o, dkh.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dkf.M);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dkh.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dkh.b $$5 = this.q[$$4];
            alf<djy> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dkh.b.a(this.A, this.B), dkh.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dkh.d, alf<djy>>> $$0) {
      this.b($$0, this.o, this.o, dkh.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dkf.aa);
      this.b($$0, this.o, dkh.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dkf.ab);
      this.c($$0, this.o, this.o, this.o, dkh.b.a(this.r[0], this.r[1]), this.o, 0.0F, dkf.ac);
   }

   private alf<djy> a(int $$0, int $$1, dkh.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         alf<djy> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private alf<djy> b(int $$0, int $$1, dkh.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private alf<djy> c(int $$0, int $$1, dkh.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private alf<djy> a(int $$0, int $$1, dkh.b $$2, alf<djy> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dkf.x : $$3;
   }

   private alf<djy> d(int $$0, int $$1, dkh.b $$2) {
      alf<djy> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private alf<djy> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dkf.O;
      } else {
         return $$0 == 4 ? dkf.f : dkf.N;
      }
   }

   private alf<djy> a(int $$0, dkh.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dkf.B : dkf.C;
      } else {
         return $$0 < 3 ? dkf.B : dkf.D;
      }
   }

   private alf<djy> e(int $$0, int $$1, dkh.b $$2) {
      if ($$2.b() >= 0L) {
         alf<djy> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private alf<djy> f(int $$0, int $$1, dkh.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dkf.J : dkf.I;
      } else {
         return $$0 == 3 ? dkf.K : this.a($$1, $$2);
      }
   }

   private alf<djy> g(int $$0, int $$1, dkh.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dkf.H : dkf.G;
      }
   }

   private alf<djy> h(int $$0, int $$1, dkh.b $$2) {
      alf<djy> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dkh.d, alf<djy>>> $$0, dkh.b $$1, dkh.b $$2, dkh.b $$3, dkh.b $$4, dkh.b $$5, float $$6, alf<djy> $$7) {
      $$0.accept(Pair.of(dkh.a($$1, $$2, $$3, $$4, dkh.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dkh.a($$1, $$2, $$3, $$4, dkh.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dkh.d, alf<djy>>> $$0, dkh.b $$1, dkh.b $$2, dkh.b $$3, dkh.b $$4, dkh.b $$5, float $$6, alf<djy> $$7) {
      $$0.accept(Pair.of(dkh.a($$1, $$2, $$3, $$4, dkh.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dkh.d, alf<djy>>> $$0, dkh.b $$1, dkh.b $$2, dkh.b $$3, dkh.b $$4, dkh.b $$5, float $$6, alf<djy> $$7) {
      $$0.accept(Pair.of(dkh.a($$1, $$2, $$3, $$4, dkh.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(efr $$0, efr $$1, efr.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)egf.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)egf.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)egf.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)egf.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dkh.a((float)$$0);
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

   private static String a(double $$0, dkh.b[] $$1) {
      double $$2 = (double)dkh.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bav
   public dkh.b[] b() {
      return this.p;
   }

   @bav
   public dkh.b[] c() {
      return this.q;
   }

   @bav
   public dkh.b[] d() {
      return this.r;
   }

   @bav
   public dkh.b[] e() {
      return new dkh.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @bav
   public dkh.b[] f() {
      return new dkh.b[]{
         dkh.b.a(-2.0F, egf.a(0.05F)),
         dkh.b.a(egf.a(0.05F), egf.a(0.26666668F)),
         dkh.b.a(egf.a(0.26666668F), egf.a(0.4F)),
         dkh.b.a(egf.a(0.4F), egf.a(0.56666666F)),
         dkh.b.a(egf.a(0.56666666F), 2.0F)
      };
   }

   @bav
   public dkh.b[] g() {
      return new dkh.b[]{dkh.b.a(-2.0F, 0.0F), dkh.b.a(0.0F, 2.0F)};
   }
}
