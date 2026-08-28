import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class ddv {
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
   private final ddo.b o = ddo.b.a(-1.0F, 1.0F);
   private final ddo.b[] p = new ddo.b[]{ddo.b.a(-1.0F, -0.45F), ddo.b.a(-0.45F, -0.15F), ddo.b.a(-0.15F, 0.2F), ddo.b.a(0.2F, 0.55F), ddo.b.a(0.55F, 1.0F)};
   private final ddo.b[] q = new ddo.b[]{ddo.b.a(-1.0F, -0.35F), ddo.b.a(-0.35F, -0.1F), ddo.b.a(-0.1F, 0.1F), ddo.b.a(0.1F, 0.3F), ddo.b.a(0.3F, 1.0F)};
   private final ddo.b[] r = new ddo.b[]{
      ddo.b.a(-1.0F, -0.78F),
      ddo.b.a(-0.78F, -0.375F),
      ddo.b.a(-0.375F, -0.2225F),
      ddo.b.a(-0.2225F, 0.05F),
      ddo.b.a(0.05F, 0.45F),
      ddo.b.a(0.45F, 0.55F),
      ddo.b.a(0.55F, 1.0F)
   };
   private final ddo.b s = this.p[0];
   private final ddo.b t = ddo.b.a(this.p[1], this.p[4]);
   private final ddo.b u = ddo.b.a(-1.2F, -1.05F);
   private final ddo.b v = ddo.b.a(-1.05F, -0.455F);
   private final ddo.b w = ddo.b.a(-0.455F, -0.19F);
   private final ddo.b x = ddo.b.a(-0.19F, -0.11F);
   private final ddo.b y = ddo.b.a(-0.11F, 0.55F);
   private final ddo.b z = ddo.b.a(-0.11F, 0.03F);
   private final ddo.b A = ddo.b.a(0.03F, 0.3F);
   private final ddo.b B = ddo.b.a(0.3F, 1.0F);
   private final akj<ddf>[][] C = new akj[][]{{ddm.X, ddm.V, ddm.T, ddm.R, ddm.P}, {ddm.W, ddm.U, ddm.S, ddm.Q, ddm.P}};
   private final akj<ddf>[][] D = new akj[][]{
      {ddm.d, ddm.d, ddm.d, ddm.q, ddm.p},
      {ddm.b, ddm.b, ddm.i, ddm.p, ddm.o},
      {ddm.j, ddm.b, ddm.i, ddm.k, ddm.l},
      {ddm.r, ddm.r, ddm.i, ddm.x, ddm.x},
      {ddm.f, ddm.f, ddm.f, ddm.f, ddm.f}
   };
   private final akj<ddf>[][] E = new akj[][]{
      {ddm.e, null, ddm.q, null, null},
      {null, null, null, null, ddm.n},
      {ddm.c, null, null, ddm.m, null},
      {null, null, ddm.b, ddm.y, ddm.z},
      {null, null, null, null, null}
   };
   private final akj<ddf>[][] F = new akj[][]{
      {ddm.d, ddm.d, ddm.d, ddm.q, ddm.q},
      {ddm.D, ddm.D, ddm.i, ddm.p, ddm.o},
      {ddm.D, ddm.D, ddm.D, ddm.D, ddm.l},
      {ddm.s, ddm.s, ddm.i, ddm.i, ddm.x},
      {ddm.A, ddm.A, ddm.A, ddm.C, ddm.C}
   };
   private final akj<ddf>[][] G = new akj[][]{
      {ddm.e, null, null, null, null},
      {ddm.E, null, ddm.D, ddm.D, ddm.n},
      {ddm.E, ddm.E, ddm.i, ddm.k, null},
      {null, null, null, null, null},
      {ddm.B, ddm.B, null, null, null}
   };
   private final akj<ddf>[][] H = new akj[][]{
      {ddm.u, ddm.u, ddm.t, ddm.v, ddm.v},
      {ddm.u, ddm.u, ddm.t, ddm.v, ddm.v},
      {ddm.t, ddm.t, ddm.t, ddm.v, ddm.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<ddo.d> a() {
      ddo.b $$0 = ddo.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new ddo.d(this.o, this.o, ddo.b.a(this.y, this.o), this.o, $$0, ddo.b.a(-1.0F, -0.16F), 0L),
         new ddo.d(this.o, this.o, ddo.b.a(this.y, this.o), this.o, $$0, ddo.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<ddo.d, akj<ddf>>> $$0) {
      if (aa.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<ddo.d, akj<ddf>>> $$0) {
      jl.a $$1 = oz.a();
      jk<dxy> $$2 = $$1.b(lr.aI);
      dxz.w.a $$3 = new dxz.w.a($$2.b(dym.d));
      dxz.w.a $$4 = new dxz.w.a($$2.b(dym.e));
      dxz.w.a $$5 = new dxz.w.a($$2.b(dym.g));
      $$0.accept(Pair.of(ddo.a(this.o, this.o, this.o, this.o, ddo.b.a(0.0F), this.o, 0.01F), ddm.b));
      if (rb.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, azi.a) instanceof axh.e<?, ?> $$7) {
         akj<ddf> $$8 = ddm.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(ddo.a(this.o, this.o, this.o, ddo.b.a($$9), ddo.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == ddm.f ? ddm.A : ddm.f;
         }
      }

      if (rb.a($$3, $$4, $$5, false) instanceof axh.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(ddo.a(this.o, this.o, ddo.b.a($$12), this.o, ddo.b.a(0.0F), this.o, 0.0F), ddm.q));
         }
      }
   }

   private void c(Consumer<Pair<ddo.d, akj<ddf>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, ddm.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         ddo.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<ddo.d, akj<ddf>>> $$0) {
      this.c($$0, ddo.b.a(-1.0F, -0.93333334F));
      this.b($$0, ddo.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, ddo.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, ddo.b.a(-0.56666666F, -0.4F));
      this.c($$0, ddo.b.a(-0.4F, -0.26666668F));
      this.d($$0, ddo.b.a(-0.26666668F, -0.05F));
      this.e($$0, ddo.b.a(-0.05F, 0.05F));
      this.d($$0, ddo.b.a(0.05F, 0.26666668F));
      this.c($$0, ddo.b.a(0.26666668F, 0.4F));
      this.b($$0, ddo.b.a(0.4F, 0.56666666F));
      this.a($$0, ddo.b.a(0.56666666F, 0.7666667F));
      this.b($$0, ddo.b.a(0.7666667F, 0.93333334F));
      this.c($$0, ddo.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<ddo.d, akj<ddf>>> $$0, ddo.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddo.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddo.b $$5 = this.q[$$4];
            akj<ddf> $$6 = this.a($$2, $$4, $$1);
            akj<ddf> $$7 = this.b($$2, $$4, $$1);
            akj<ddf> $$8 = this.c($$2, $$4, $$1);
            akj<ddf> $$9 = this.e($$2, $$4, $$1);
            akj<ddf> $$10 = this.h($$2, $$4, $$1);
            akj<ddf> $$11 = this.a($$2, $$4, $$1, $$10);
            akj<ddf> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddo.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddo.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, ddo.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddo.b.a(this.x, this.z), ddo.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddo.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddo.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddo.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, ddo.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddo.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<ddo.d, akj<ddf>>> $$0, ddo.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddo.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddo.b $$5 = this.q[$$4];
            akj<ddf> $$6 = this.a($$2, $$4, $$1);
            akj<ddf> $$7 = this.b($$2, $$4, $$1);
            akj<ddf> $$8 = this.c($$2, $$4, $$1);
            akj<ddf> $$9 = this.e($$2, $$4, $$1);
            akj<ddf> $$10 = this.h($$2, $$4, $$1);
            akj<ddf> $$11 = this.a($$2, $$4, $$1, $$6);
            akj<ddf> $$12 = this.g($$2, $$4, $$1);
            akj<ddf> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, ddo.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddo.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, ddo.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddo.b.a(this.x, this.z), ddo.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddo.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddo.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddo.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, ddo.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddo.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<ddo.d, akj<ddf>>> $$0, ddo.b $$1) {
      this.a($$0, this.o, this.o, this.x, ddo.b.a(this.r[0], this.r[2]), $$1, 0.0F, ddm.O);
      this.a($$0, ddo.b.a(this.p[1], this.p[2]), this.o, ddo.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddm.g);
      this.a($$0, ddo.b.a(this.p[3], this.p[4]), this.o, ddo.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddm.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddo.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddo.b $$5 = this.q[$$4];
            akj<ddf> $$6 = this.a($$2, $$4, $$1);
            akj<ddf> $$7 = this.b($$2, $$4, $$1);
            akj<ddf> $$8 = this.c($$2, $$4, $$1);
            akj<ddf> $$9 = this.h($$2, $$4, $$1);
            akj<ddf> $$10 = this.e($$2, $$4, $$1);
            akj<ddf> $$11 = this.a($$2, $$4);
            akj<ddf> $$12 = this.a($$2, $$4, $$1, $$6);
            akj<ddf> $$13 = this.d($$2, $$4, $$1);
            akj<ddf> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddo.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, ddo.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddo.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddo.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, ddo.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, ddo.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddo.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, ddo.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<ddo.d, akj<ddf>>> $$0, ddo.b $$1) {
      this.a($$0, this.o, this.o, this.x, ddo.b.a(this.r[0], this.r[2]), $$1, 0.0F, ddm.O);
      this.a($$0, ddo.b.a(this.p[1], this.p[2]), this.o, ddo.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddm.g);
      this.a($$0, ddo.b.a(this.p[3], this.p[4]), this.o, ddo.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddm.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddo.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddo.b $$5 = this.q[$$4];
            akj<ddf> $$6 = this.a($$2, $$4, $$1);
            akj<ddf> $$7 = this.b($$2, $$4, $$1);
            akj<ddf> $$8 = this.c($$2, $$4, $$1);
            akj<ddf> $$9 = this.a($$2, $$4);
            akj<ddf> $$10 = this.a($$2, $$4, $$1, $$6);
            akj<ddf> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, ddo.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, ddo.b.a(this.A, this.B), ddo.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, ddo.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddo.b.a(this.A, this.B), ddo.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, ddo.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddo.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddo.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, ddo.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<ddo.d, akj<ddf>>> $$0, ddo.b $$1) {
      this.a($$0, this.s, this.o, this.x, ddo.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? ddm.O : ddm.L);
      this.a($$0, this.t, this.o, this.x, ddo.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? ddm.O : ddm.K);
      this.a($$0, this.s, this.o, this.z, ddo.b.a(this.r[0], this.r[1]), $$1, 0.0F, ddm.L);
      this.a($$0, this.t, this.o, this.z, ddo.b.a(this.r[0], this.r[1]), $$1, 0.0F, ddm.K);
      this.a($$0, this.s, this.o, ddo.b.a(this.x, this.B), ddo.b.a(this.r[2], this.r[5]), $$1, 0.0F, ddm.L);
      this.a($$0, this.t, this.o, ddo.b.a(this.x, this.B), ddo.b.a(this.r[2], this.r[5]), $$1, 0.0F, ddm.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, ddm.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, ddm.K);
      this.a($$0, ddo.b.a(this.p[1], this.p[2]), this.o, ddo.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddm.g);
      this.a($$0, ddo.b.a(this.p[3], this.p[4]), this.o, ddo.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddm.h);
      this.a($$0, this.s, this.o, ddo.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddm.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddo.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddo.b $$5 = this.q[$$4];
            akj<ddf> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddo.b.a(this.A, this.B), ddo.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<ddo.d, akj<ddf>>> $$0) {
      this.b($$0, this.o, this.o, ddo.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, ddm.Z);
      this.b($$0, this.o, ddo.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, ddm.aa);
      this.c($$0, this.o, this.o, this.o, ddo.b.a(this.r[0], this.r[1]), this.o, 0.0F, ddm.ab);
   }

   private akj<ddf> a(int $$0, int $$1, ddo.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         akj<ddf> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private akj<ddf> b(int $$0, int $$1, ddo.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private akj<ddf> c(int $$0, int $$1, ddo.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private akj<ddf> a(int $$0, int $$1, ddo.b $$2, akj<ddf> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? ddm.w : $$3;
   }

   private akj<ddf> d(int $$0, int $$1, ddo.b $$2) {
      akj<ddf> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private akj<ddf> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return ddm.N;
      } else {
         return $$0 == 4 ? ddm.f : ddm.M;
      }
   }

   private akj<ddf> a(int $$0, ddo.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? ddm.A : ddm.B;
      } else {
         return $$0 < 3 ? ddm.A : ddm.C;
      }
   }

   private akj<ddf> e(int $$0, int $$1, ddo.b $$2) {
      if ($$2.b() >= 0L) {
         akj<ddf> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private akj<ddf> f(int $$0, int $$1, ddo.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? ddm.I : ddm.H;
      } else {
         return $$0 == 3 ? ddm.J : this.a($$1, $$2);
      }
   }

   private akj<ddf> g(int $$0, int $$1, ddo.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? ddm.G : ddm.F;
      }
   }

   private akj<ddf> h(int $$0, int $$1, ddo.b $$2) {
      akj<ddf> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<ddo.d, akj<ddf>>> $$0, ddo.b $$1, ddo.b $$2, ddo.b $$3, ddo.b $$4, ddo.b $$5, float $$6, akj<ddf> $$7) {
      $$0.accept(Pair.of(ddo.a($$1, $$2, $$3, $$4, ddo.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(ddo.a($$1, $$2, $$3, $$4, ddo.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<ddo.d, akj<ddf>>> $$0, ddo.b $$1, ddo.b $$2, ddo.b $$3, ddo.b $$4, ddo.b $$5, float $$6, akj<ddf> $$7) {
      $$0.accept(Pair.of(ddo.a($$1, $$2, $$3, $$4, ddo.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<ddo.d, akj<ddf>>> $$0, ddo.b $$1, ddo.b $$2, ddo.b $$3, ddo.b $$4, ddo.b $$5, float $$6, akj<ddf> $$7) {
      $$0.accept(Pair.of(ddo.a($$1, $$2, $$3, $$4, ddo.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dxy $$0, dxy $$1, dxy.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dym.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dym.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dym.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dym.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)ddo.a((float)$$0);
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

   private static String a(double $$0, ddo.b[] $$1) {
      double $$2 = (double)ddo.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @azl
   public ddo.b[] b() {
      return this.p;
   }

   @azl
   public ddo.b[] c() {
      return this.q;
   }

   @azl
   public ddo.b[] d() {
      return this.r;
   }

   @azl
   public ddo.b[] e() {
      return new ddo.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @azl
   public ddo.b[] f() {
      return new ddo.b[]{
         ddo.b.a(-2.0F, dym.a(0.05F)),
         ddo.b.a(dym.a(0.05F), dym.a(0.26666668F)),
         ddo.b.a(dym.a(0.26666668F), dym.a(0.4F)),
         ddo.b.a(dym.a(0.4F), dym.a(0.56666666F)),
         ddo.b.a(dym.a(0.56666666F), 2.0F)
      };
   }

   @azl
   public ddo.b[] g() {
      return new ddo.b[]{ddo.b.a(-2.0F, 0.0F), ddo.b.a(0.0F, 2.0F)};
   }
}
