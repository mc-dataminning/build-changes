import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class ddw {
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
   private final ddp.b o = ddp.b.a(-1.0F, 1.0F);
   private final ddp.b[] p = new ddp.b[]{ddp.b.a(-1.0F, -0.45F), ddp.b.a(-0.45F, -0.15F), ddp.b.a(-0.15F, 0.2F), ddp.b.a(0.2F, 0.55F), ddp.b.a(0.55F, 1.0F)};
   private final ddp.b[] q = new ddp.b[]{ddp.b.a(-1.0F, -0.35F), ddp.b.a(-0.35F, -0.1F), ddp.b.a(-0.1F, 0.1F), ddp.b.a(0.1F, 0.3F), ddp.b.a(0.3F, 1.0F)};
   private final ddp.b[] r = new ddp.b[]{
      ddp.b.a(-1.0F, -0.78F),
      ddp.b.a(-0.78F, -0.375F),
      ddp.b.a(-0.375F, -0.2225F),
      ddp.b.a(-0.2225F, 0.05F),
      ddp.b.a(0.05F, 0.45F),
      ddp.b.a(0.45F, 0.55F),
      ddp.b.a(0.55F, 1.0F)
   };
   private final ddp.b s = this.p[0];
   private final ddp.b t = ddp.b.a(this.p[1], this.p[4]);
   private final ddp.b u = ddp.b.a(-1.2F, -1.05F);
   private final ddp.b v = ddp.b.a(-1.05F, -0.455F);
   private final ddp.b w = ddp.b.a(-0.455F, -0.19F);
   private final ddp.b x = ddp.b.a(-0.19F, -0.11F);
   private final ddp.b y = ddp.b.a(-0.11F, 0.55F);
   private final ddp.b z = ddp.b.a(-0.11F, 0.03F);
   private final ddp.b A = ddp.b.a(0.03F, 0.3F);
   private final ddp.b B = ddp.b.a(0.3F, 1.0F);
   private final akj<ddg>[][] C = new akj[][]{{ddn.X, ddn.V, ddn.T, ddn.R, ddn.P}, {ddn.W, ddn.U, ddn.S, ddn.Q, ddn.P}};
   private final akj<ddg>[][] D = new akj[][]{
      {ddn.d, ddn.d, ddn.d, ddn.q, ddn.p},
      {ddn.b, ddn.b, ddn.i, ddn.p, ddn.o},
      {ddn.j, ddn.b, ddn.i, ddn.k, ddn.l},
      {ddn.r, ddn.r, ddn.i, ddn.x, ddn.x},
      {ddn.f, ddn.f, ddn.f, ddn.f, ddn.f}
   };
   private final akj<ddg>[][] E = new akj[][]{
      {ddn.e, null, ddn.q, null, null},
      {null, null, null, null, ddn.n},
      {ddn.c, null, null, ddn.m, null},
      {null, null, ddn.b, ddn.y, ddn.z},
      {null, null, null, null, null}
   };
   private final akj<ddg>[][] F = new akj[][]{
      {ddn.d, ddn.d, ddn.d, ddn.q, ddn.q},
      {ddn.D, ddn.D, ddn.i, ddn.p, ddn.o},
      {ddn.D, ddn.D, ddn.D, ddn.D, ddn.l},
      {ddn.s, ddn.s, ddn.i, ddn.i, ddn.x},
      {ddn.A, ddn.A, ddn.A, ddn.C, ddn.C}
   };
   private final akj<ddg>[][] G = new akj[][]{
      {ddn.e, null, null, null, null},
      {ddn.E, null, ddn.D, ddn.D, ddn.n},
      {ddn.E, ddn.E, ddn.i, ddn.k, null},
      {null, null, null, null, null},
      {ddn.B, ddn.B, null, null, null}
   };
   private final akj<ddg>[][] H = new akj[][]{
      {ddn.u, ddn.u, ddn.t, ddn.v, ddn.v},
      {ddn.u, ddn.u, ddn.t, ddn.v, ddn.v},
      {ddn.t, ddn.t, ddn.t, ddn.v, ddn.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<ddp.d> a() {
      ddp.b $$0 = ddp.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new ddp.d(this.o, this.o, ddp.b.a(this.y, this.o), this.o, $$0, ddp.b.a(-1.0F, -0.16F), 0L),
         new ddp.d(this.o, this.o, ddp.b.a(this.y, this.o), this.o, $$0, ddp.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<ddp.d, akj<ddg>>> $$0) {
      if (aa.aq) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<ddp.d, akj<ddg>>> $$0) {
      jl.a $$1 = oz.a();
      jk<dxz> $$2 = $$1.b(lr.aI);
      dya.w.a $$3 = new dya.w.a($$2.b(dyn.d));
      dya.w.a $$4 = new dya.w.a($$2.b(dyn.e));
      dya.w.a $$5 = new dya.w.a($$2.b(dyn.g));
      $$0.accept(Pair.of(ddp.a(this.o, this.o, this.o, this.o, ddp.b.a(0.0F), this.o, 0.01F), ddn.b));
      if (rb.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, azi.a) instanceof axh.e<?, ?> $$7) {
         akj<ddg> $$8 = ddn.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(ddp.a(this.o, this.o, this.o, ddp.b.a($$9), ddp.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == ddn.f ? ddn.A : ddn.f;
         }
      }

      if (rb.a($$3, $$4, $$5, false) instanceof axh.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(ddp.a(this.o, this.o, ddp.b.a($$12), this.o, ddp.b.a(0.0F), this.o, 0.0F), ddn.q));
         }
      }
   }

   private void c(Consumer<Pair<ddp.d, akj<ddg>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, ddn.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         ddp.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<ddp.d, akj<ddg>>> $$0) {
      this.c($$0, ddp.b.a(-1.0F, -0.93333334F));
      this.b($$0, ddp.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, ddp.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, ddp.b.a(-0.56666666F, -0.4F));
      this.c($$0, ddp.b.a(-0.4F, -0.26666668F));
      this.d($$0, ddp.b.a(-0.26666668F, -0.05F));
      this.e($$0, ddp.b.a(-0.05F, 0.05F));
      this.d($$0, ddp.b.a(0.05F, 0.26666668F));
      this.c($$0, ddp.b.a(0.26666668F, 0.4F));
      this.b($$0, ddp.b.a(0.4F, 0.56666666F));
      this.a($$0, ddp.b.a(0.56666666F, 0.7666667F));
      this.b($$0, ddp.b.a(0.7666667F, 0.93333334F));
      this.c($$0, ddp.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<ddp.d, akj<ddg>>> $$0, ddp.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddp.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddp.b $$5 = this.q[$$4];
            akj<ddg> $$6 = this.a($$2, $$4, $$1);
            akj<ddg> $$7 = this.b($$2, $$4, $$1);
            akj<ddg> $$8 = this.c($$2, $$4, $$1);
            akj<ddg> $$9 = this.e($$2, $$4, $$1);
            akj<ddg> $$10 = this.h($$2, $$4, $$1);
            akj<ddg> $$11 = this.a($$2, $$4, $$1, $$10);
            akj<ddg> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddp.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddp.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, ddp.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddp.b.a(this.x, this.z), ddp.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddp.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddp.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddp.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, ddp.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddp.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<ddp.d, akj<ddg>>> $$0, ddp.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddp.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddp.b $$5 = this.q[$$4];
            akj<ddg> $$6 = this.a($$2, $$4, $$1);
            akj<ddg> $$7 = this.b($$2, $$4, $$1);
            akj<ddg> $$8 = this.c($$2, $$4, $$1);
            akj<ddg> $$9 = this.e($$2, $$4, $$1);
            akj<ddg> $$10 = this.h($$2, $$4, $$1);
            akj<ddg> $$11 = this.a($$2, $$4, $$1, $$6);
            akj<ddg> $$12 = this.g($$2, $$4, $$1);
            akj<ddg> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, ddp.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddp.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, ddp.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddp.b.a(this.x, this.z), ddp.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddp.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddp.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddp.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, ddp.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddp.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<ddp.d, akj<ddg>>> $$0, ddp.b $$1) {
      this.a($$0, this.o, this.o, this.x, ddp.b.a(this.r[0], this.r[2]), $$1, 0.0F, ddn.O);
      this.a($$0, ddp.b.a(this.p[1], this.p[2]), this.o, ddp.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddn.g);
      this.a($$0, ddp.b.a(this.p[3], this.p[4]), this.o, ddp.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddn.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddp.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddp.b $$5 = this.q[$$4];
            akj<ddg> $$6 = this.a($$2, $$4, $$1);
            akj<ddg> $$7 = this.b($$2, $$4, $$1);
            akj<ddg> $$8 = this.c($$2, $$4, $$1);
            akj<ddg> $$9 = this.h($$2, $$4, $$1);
            akj<ddg> $$10 = this.e($$2, $$4, $$1);
            akj<ddg> $$11 = this.a($$2, $$4);
            akj<ddg> $$12 = this.a($$2, $$4, $$1, $$6);
            akj<ddg> $$13 = this.d($$2, $$4, $$1);
            akj<ddg> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddp.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, ddp.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddp.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddp.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, ddp.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, ddp.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddp.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, ddp.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<ddp.d, akj<ddg>>> $$0, ddp.b $$1) {
      this.a($$0, this.o, this.o, this.x, ddp.b.a(this.r[0], this.r[2]), $$1, 0.0F, ddn.O);
      this.a($$0, ddp.b.a(this.p[1], this.p[2]), this.o, ddp.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddn.g);
      this.a($$0, ddp.b.a(this.p[3], this.p[4]), this.o, ddp.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddn.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddp.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddp.b $$5 = this.q[$$4];
            akj<ddg> $$6 = this.a($$2, $$4, $$1);
            akj<ddg> $$7 = this.b($$2, $$4, $$1);
            akj<ddg> $$8 = this.c($$2, $$4, $$1);
            akj<ddg> $$9 = this.a($$2, $$4);
            akj<ddg> $$10 = this.a($$2, $$4, $$1, $$6);
            akj<ddg> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, ddp.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, ddp.b.a(this.A, this.B), ddp.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, ddp.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddp.b.a(this.A, this.B), ddp.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, ddp.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddp.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddp.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, ddp.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<ddp.d, akj<ddg>>> $$0, ddp.b $$1) {
      this.a($$0, this.s, this.o, this.x, ddp.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? ddn.O : ddn.L);
      this.a($$0, this.t, this.o, this.x, ddp.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? ddn.O : ddn.K);
      this.a($$0, this.s, this.o, this.z, ddp.b.a(this.r[0], this.r[1]), $$1, 0.0F, ddn.L);
      this.a($$0, this.t, this.o, this.z, ddp.b.a(this.r[0], this.r[1]), $$1, 0.0F, ddn.K);
      this.a($$0, this.s, this.o, ddp.b.a(this.x, this.B), ddp.b.a(this.r[2], this.r[5]), $$1, 0.0F, ddn.L);
      this.a($$0, this.t, this.o, ddp.b.a(this.x, this.B), ddp.b.a(this.r[2], this.r[5]), $$1, 0.0F, ddn.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, ddn.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, ddn.K);
      this.a($$0, ddp.b.a(this.p[1], this.p[2]), this.o, ddp.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddn.g);
      this.a($$0, ddp.b.a(this.p[3], this.p[4]), this.o, ddp.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddn.h);
      this.a($$0, this.s, this.o, ddp.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddn.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddp.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddp.b $$5 = this.q[$$4];
            akj<ddg> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddp.b.a(this.A, this.B), ddp.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<ddp.d, akj<ddg>>> $$0) {
      this.b($$0, this.o, this.o, ddp.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, ddn.Z);
      this.b($$0, this.o, ddp.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, ddn.aa);
      this.c($$0, this.o, this.o, this.o, ddp.b.a(this.r[0], this.r[1]), this.o, 0.0F, ddn.ab);
   }

   private akj<ddg> a(int $$0, int $$1, ddp.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         akj<ddg> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private akj<ddg> b(int $$0, int $$1, ddp.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private akj<ddg> c(int $$0, int $$1, ddp.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private akj<ddg> a(int $$0, int $$1, ddp.b $$2, akj<ddg> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? ddn.w : $$3;
   }

   private akj<ddg> d(int $$0, int $$1, ddp.b $$2) {
      akj<ddg> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private akj<ddg> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return ddn.N;
      } else {
         return $$0 == 4 ? ddn.f : ddn.M;
      }
   }

   private akj<ddg> a(int $$0, ddp.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? ddn.A : ddn.B;
      } else {
         return $$0 < 3 ? ddn.A : ddn.C;
      }
   }

   private akj<ddg> e(int $$0, int $$1, ddp.b $$2) {
      if ($$2.b() >= 0L) {
         akj<ddg> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private akj<ddg> f(int $$0, int $$1, ddp.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? ddn.I : ddn.H;
      } else {
         return $$0 == 3 ? ddn.J : this.a($$1, $$2);
      }
   }

   private akj<ddg> g(int $$0, int $$1, ddp.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? ddn.G : ddn.F;
      }
   }

   private akj<ddg> h(int $$0, int $$1, ddp.b $$2) {
      akj<ddg> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<ddp.d, akj<ddg>>> $$0, ddp.b $$1, ddp.b $$2, ddp.b $$3, ddp.b $$4, ddp.b $$5, float $$6, akj<ddg> $$7) {
      $$0.accept(Pair.of(ddp.a($$1, $$2, $$3, $$4, ddp.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(ddp.a($$1, $$2, $$3, $$4, ddp.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<ddp.d, akj<ddg>>> $$0, ddp.b $$1, ddp.b $$2, ddp.b $$3, ddp.b $$4, ddp.b $$5, float $$6, akj<ddg> $$7) {
      $$0.accept(Pair.of(ddp.a($$1, $$2, $$3, $$4, ddp.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<ddp.d, akj<ddg>>> $$0, ddp.b $$1, ddp.b $$2, ddp.b $$3, ddp.b $$4, ddp.b $$5, float $$6, akj<ddg> $$7) {
      $$0.accept(Pair.of(ddp.a($$1, $$2, $$3, $$4, ddp.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dxz $$0, dxz $$1, dxz.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dyn.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dyn.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dyn.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dyn.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)ddp.a((float)$$0);
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

   private static String a(double $$0, ddp.b[] $$1) {
      double $$2 = (double)ddp.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @azl
   public ddp.b[] b() {
      return this.p;
   }

   @azl
   public ddp.b[] c() {
      return this.q;
   }

   @azl
   public ddp.b[] d() {
      return this.r;
   }

   @azl
   public ddp.b[] e() {
      return new ddp.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @azl
   public ddp.b[] f() {
      return new ddp.b[]{
         ddp.b.a(-2.0F, dyn.a(0.05F)),
         ddp.b.a(dyn.a(0.05F), dyn.a(0.26666668F)),
         ddp.b.a(dyn.a(0.26666668F), dyn.a(0.4F)),
         ddp.b.a(dyn.a(0.4F), dyn.a(0.56666666F)),
         ddp.b.a(dyn.a(0.56666666F), 2.0F)
      };
   }

   @azl
   public ddp.b[] g() {
      return new ddp.b[]{ddp.b.a(-2.0F, 0.0F), ddp.b.a(0.0F, 2.0F)};
   }
}
