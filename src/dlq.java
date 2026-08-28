import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dlq {
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
   private final dlj.b o = dlj.b.a(-1.0F, 1.0F);
   private final dlj.b[] p = new dlj.b[]{dlj.b.a(-1.0F, -0.45F), dlj.b.a(-0.45F, -0.15F), dlj.b.a(-0.15F, 0.2F), dlj.b.a(0.2F, 0.55F), dlj.b.a(0.55F, 1.0F)};
   private final dlj.b[] q = new dlj.b[]{dlj.b.a(-1.0F, -0.35F), dlj.b.a(-0.35F, -0.1F), dlj.b.a(-0.1F, 0.1F), dlj.b.a(0.1F, 0.3F), dlj.b.a(0.3F, 1.0F)};
   private final dlj.b[] r = new dlj.b[]{
      dlj.b.a(-1.0F, -0.78F),
      dlj.b.a(-0.78F, -0.375F),
      dlj.b.a(-0.375F, -0.2225F),
      dlj.b.a(-0.2225F, 0.05F),
      dlj.b.a(0.05F, 0.45F),
      dlj.b.a(0.45F, 0.55F),
      dlj.b.a(0.55F, 1.0F)
   };
   private final dlj.b s = this.p[0];
   private final dlj.b t = dlj.b.a(this.p[1], this.p[4]);
   private final dlj.b u = dlj.b.a(-1.2F, -1.05F);
   private final dlj.b v = dlj.b.a(-1.05F, -0.455F);
   private final dlj.b w = dlj.b.a(-0.455F, -0.19F);
   private final dlj.b x = dlj.b.a(-0.19F, -0.11F);
   private final dlj.b y = dlj.b.a(-0.11F, 0.55F);
   private final dlj.b z = dlj.b.a(-0.11F, 0.03F);
   private final dlj.b A = dlj.b.a(0.03F, 0.3F);
   private final dlj.b B = dlj.b.a(0.3F, 1.0F);
   private final alh<dla>[][] C = new alh[][]{{dlh.Y, dlh.W, dlh.U, dlh.S, dlh.Q}, {dlh.X, dlh.V, dlh.T, dlh.R, dlh.Q}};
   private final alh<dla>[][] D = new alh[][]{
      {dlh.d, dlh.d, dlh.d, dlh.r, dlh.q},
      {dlh.b, dlh.b, dlh.i, dlh.q, dlh.p},
      {dlh.j, dlh.b, dlh.i, dlh.k, dlh.l},
      {dlh.s, dlh.s, dlh.i, dlh.y, dlh.y},
      {dlh.f, dlh.f, dlh.f, dlh.f, dlh.f}
   };
   private final alh<dla>[][] E = new alh[][]{
      {dlh.e, null, dlh.r, null, null},
      {null, null, null, null, dlh.o},
      {dlh.c, null, null, dlh.n, null},
      {null, null, dlh.b, dlh.z, dlh.A},
      {null, null, null, null, null}
   };
   private final alh<dla>[][] F = new alh[][]{
      {dlh.d, dlh.d, dlh.d, dlh.r, dlh.r},
      {dlh.E, dlh.E, dlh.i, dlh.q, dlh.p},
      {dlh.E, dlh.E, dlh.E, dlh.E, dlh.m},
      {dlh.t, dlh.t, dlh.i, dlh.i, dlh.y},
      {dlh.B, dlh.B, dlh.B, dlh.D, dlh.D}
   };
   private final alh<dla>[][] G = new alh[][]{
      {dlh.e, null, null, null, null},
      {dlh.F, null, dlh.E, dlh.E, dlh.o},
      {dlh.F, dlh.F, dlh.i, dlh.k, null},
      {null, null, null, null, null},
      {dlh.C, dlh.C, null, null, null}
   };
   private final alh<dla>[][] H = new alh[][]{
      {dlh.v, dlh.v, dlh.u, dlh.w, dlh.w},
      {dlh.v, dlh.v, dlh.u, dlh.w, dlh.w},
      {dlh.u, dlh.u, dlh.u, dlh.w, dlh.w},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dlj.d> a() {
      dlj.b $$0 = dlj.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dlj.d(this.o, this.o, dlj.b.a(this.y, this.o), this.o, $$0, dlj.b.a(-1.0F, -0.16F), 0L),
         new dlj.d(this.o, this.o, dlj.b.a(this.y, this.o), this.o, $$0, dlj.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dlj.d, alh<dla>>> $$0) {
      if (ac.ar) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dlj.d, alh<dla>>> $$0) {
      jh.a $$1 = ow.a();
      jg<egw> $$2 = $$1.e(mh.aO);
      egx.w.a $$3 = new egx.w.a($$2.b(ehk.d));
      egx.w.a $$4 = new egx.w.a($$2.b(ehk.e));
      egx.w.a $$5 = new egx.w.a($$2.b(ehk.g));
      $$0.accept(Pair.of(dlj.a(this.o, this.o, this.o, this.o, dlj.b.a(0.0F), this.o, 0.01F), dlh.b));
      if (qw.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, bat.a) instanceof ayp.e<?, ?> $$7) {
         alh<dla> $$8 = dlh.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dlj.a(this.o, this.o, this.o, dlj.b.a($$9), dlj.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dlh.f ? dlh.B : dlh.f;
         }
      }

      if (qw.a($$3, $$4, $$5, false) instanceof ayp.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dlj.a(this.o, this.o, dlj.b.a($$12), this.o, dlj.b.a(0.0F), this.o, 0.0F), dlh.r));
         }
      }
   }

   private void c(Consumer<Pair<dlj.d, alh<dla>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dlh.Z);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dlj.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dlj.d, alh<dla>>> $$0) {
      this.c($$0, dlj.b.a(-1.0F, -0.93333334F));
      this.b($$0, dlj.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dlj.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dlj.b.a(-0.56666666F, -0.4F));
      this.c($$0, dlj.b.a(-0.4F, -0.26666668F));
      this.d($$0, dlj.b.a(-0.26666668F, -0.05F));
      this.e($$0, dlj.b.a(-0.05F, 0.05F));
      this.d($$0, dlj.b.a(0.05F, 0.26666668F));
      this.c($$0, dlj.b.a(0.26666668F, 0.4F));
      this.b($$0, dlj.b.a(0.4F, 0.56666666F));
      this.a($$0, dlj.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dlj.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dlj.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dlj.d, alh<dla>>> $$0, dlj.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dlj.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dlj.b $$5 = this.q[$$4];
            alh<dla> $$6 = this.a($$2, $$4, $$1);
            alh<dla> $$7 = this.b($$2, $$4, $$1);
            alh<dla> $$8 = this.c($$2, $$4, $$1);
            alh<dla> $$9 = this.e($$2, $$4, $$1);
            alh<dla> $$10 = this.h($$2, $$4, $$1);
            alh<dla> $$11 = this.a($$2, $$4, $$1, $$10);
            alh<dla> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dlj.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dlj.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dlj.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dlj.b.a(this.x, this.z), dlj.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dlj.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dlj.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dlj.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dlj.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dlj.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dlj.d, alh<dla>>> $$0, dlj.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dlj.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dlj.b $$5 = this.q[$$4];
            alh<dla> $$6 = this.a($$2, $$4, $$1);
            alh<dla> $$7 = this.b($$2, $$4, $$1);
            alh<dla> $$8 = this.c($$2, $$4, $$1);
            alh<dla> $$9 = this.e($$2, $$4, $$1);
            alh<dla> $$10 = this.h($$2, $$4, $$1);
            alh<dla> $$11 = this.a($$2, $$4, $$1, $$6);
            alh<dla> $$12 = this.g($$2, $$4, $$1);
            alh<dla> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dlj.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dlj.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dlj.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dlj.b.a(this.x, this.z), dlj.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dlj.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dlj.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dlj.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dlj.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dlj.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dlj.d, alh<dla>>> $$0, dlj.b $$1) {
      this.a($$0, this.o, this.o, this.x, dlj.b.a(this.r[0], this.r[2]), $$1, 0.0F, dlh.P);
      this.a($$0, dlj.b.a(this.p[1], this.p[2]), this.o, dlj.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dlh.g);
      this.a($$0, dlj.b.a(this.p[3], this.p[4]), this.o, dlj.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dlh.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dlj.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dlj.b $$5 = this.q[$$4];
            alh<dla> $$6 = this.a($$2, $$4, $$1);
            alh<dla> $$7 = this.b($$2, $$4, $$1);
            alh<dla> $$8 = this.c($$2, $$4, $$1);
            alh<dla> $$9 = this.h($$2, $$4, $$1);
            alh<dla> $$10 = this.e($$2, $$4, $$1);
            alh<dla> $$11 = this.a($$2, $$4);
            alh<dla> $$12 = this.a($$2, $$4, $$1, $$6);
            alh<dla> $$13 = this.d($$2, $$4, $$1);
            alh<dla> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dlj.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dlj.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dlj.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dlj.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dlj.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dlj.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dlj.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dlj.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dlj.d, alh<dla>>> $$0, dlj.b $$1) {
      this.a($$0, this.o, this.o, this.x, dlj.b.a(this.r[0], this.r[2]), $$1, 0.0F, dlh.P);
      this.a($$0, dlj.b.a(this.p[1], this.p[2]), this.o, dlj.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dlh.g);
      this.a($$0, dlj.b.a(this.p[3], this.p[4]), this.o, dlj.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dlh.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dlj.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dlj.b $$5 = this.q[$$4];
            alh<dla> $$6 = this.a($$2, $$4, $$1);
            alh<dla> $$7 = this.b($$2, $$4, $$1);
            alh<dla> $$8 = this.c($$2, $$4, $$1);
            alh<dla> $$9 = this.a($$2, $$4);
            alh<dla> $$10 = this.a($$2, $$4, $$1, $$6);
            alh<dla> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dlj.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dlj.b.a(this.A, this.B), dlj.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dlj.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dlj.b.a(this.A, this.B), dlj.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dlj.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dlj.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dlj.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dlj.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dlj.d, alh<dla>>> $$0, dlj.b $$1) {
      this.a($$0, this.s, this.o, this.x, dlj.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dlh.P : dlh.M);
      this.a($$0, this.t, this.o, this.x, dlj.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dlh.P : dlh.L);
      this.a($$0, this.s, this.o, this.z, dlj.b.a(this.r[0], this.r[1]), $$1, 0.0F, dlh.M);
      this.a($$0, this.t, this.o, this.z, dlj.b.a(this.r[0], this.r[1]), $$1, 0.0F, dlh.L);
      this.a($$0, this.s, this.o, dlj.b.a(this.x, this.B), dlj.b.a(this.r[2], this.r[5]), $$1, 0.0F, dlh.M);
      this.a($$0, this.t, this.o, dlj.b.a(this.x, this.B), dlj.b.a(this.r[2], this.r[5]), $$1, 0.0F, dlh.L);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dlh.M);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dlh.L);
      this.a($$0, dlj.b.a(this.p[1], this.p[2]), this.o, dlj.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dlh.g);
      this.a($$0, dlj.b.a(this.p[3], this.p[4]), this.o, dlj.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dlh.h);
      this.a($$0, this.s, this.o, dlj.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dlh.M);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dlj.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dlj.b $$5 = this.q[$$4];
            alh<dla> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dlj.b.a(this.A, this.B), dlj.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dlj.d, alh<dla>>> $$0) {
      this.b($$0, this.o, this.o, dlj.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dlh.aa);
      this.b($$0, this.o, dlj.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dlh.ab);
      this.c($$0, this.o, this.o, this.o, dlj.b.a(this.r[0], this.r[1]), this.o, 0.0F, dlh.ac);
   }

   private alh<dla> a(int $$0, int $$1, dlj.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         alh<dla> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private alh<dla> b(int $$0, int $$1, dlj.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private alh<dla> c(int $$0, int $$1, dlj.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private alh<dla> a(int $$0, int $$1, dlj.b $$2, alh<dla> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dlh.x : $$3;
   }

   private alh<dla> d(int $$0, int $$1, dlj.b $$2) {
      alh<dla> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private alh<dla> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dlh.O;
      } else {
         return $$0 == 4 ? dlh.f : dlh.N;
      }
   }

   private alh<dla> a(int $$0, dlj.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dlh.B : dlh.C;
      } else {
         return $$0 < 3 ? dlh.B : dlh.D;
      }
   }

   private alh<dla> e(int $$0, int $$1, dlj.b $$2) {
      if ($$2.b() >= 0L) {
         alh<dla> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private alh<dla> f(int $$0, int $$1, dlj.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dlh.J : dlh.I;
      } else {
         return $$0 == 3 ? dlh.K : this.a($$1, $$2);
      }
   }

   private alh<dla> g(int $$0, int $$1, dlj.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dlh.H : dlh.G;
      }
   }

   private alh<dla> h(int $$0, int $$1, dlj.b $$2) {
      alh<dla> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dlj.d, alh<dla>>> $$0, dlj.b $$1, dlj.b $$2, dlj.b $$3, dlj.b $$4, dlj.b $$5, float $$6, alh<dla> $$7) {
      $$0.accept(Pair.of(dlj.a($$1, $$2, $$3, $$4, dlj.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dlj.a($$1, $$2, $$3, $$4, dlj.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dlj.d, alh<dla>>> $$0, dlj.b $$1, dlj.b $$2, dlj.b $$3, dlj.b $$4, dlj.b $$5, float $$6, alh<dla> $$7) {
      $$0.accept(Pair.of(dlj.a($$1, $$2, $$3, $$4, dlj.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dlj.d, alh<dla>>> $$0, dlj.b $$1, dlj.b $$2, dlj.b $$3, dlj.b $$4, dlj.b $$5, float $$6, alh<dla> $$7) {
      $$0.accept(Pair.of(dlj.a($$1, $$2, $$3, $$4, dlj.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(egw $$0, egw $$1, egw.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)ehk.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)ehk.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)ehk.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)ehk.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dlj.a((float)$$0);
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

   private static String a(double $$0, dlj.b[] $$1) {
      double $$2 = (double)dlj.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bax
   public dlj.b[] b() {
      return this.p;
   }

   @bax
   public dlj.b[] c() {
      return this.q;
   }

   @bax
   public dlj.b[] d() {
      return this.r;
   }

   @bax
   public dlj.b[] e() {
      return new dlj.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @bax
   public dlj.b[] f() {
      return new dlj.b[]{
         dlj.b.a(-2.0F, ehk.a(0.05F)),
         dlj.b.a(ehk.a(0.05F), ehk.a(0.26666668F)),
         dlj.b.a(ehk.a(0.26666668F), ehk.a(0.4F)),
         dlj.b.a(ehk.a(0.4F), ehk.a(0.56666666F)),
         dlj.b.a(ehk.a(0.56666666F), 2.0F)
      };
   }

   @bax
   public dlj.b[] g() {
      return new dlj.b[]{dlj.b.a(-2.0F, 0.0F), dlj.b.a(0.0F, 2.0F)};
   }
}
