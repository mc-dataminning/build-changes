import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dco {
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
   private final dch.b o = dch.b.a(-1.0F, 1.0F);
   private final dch.b[] p = new dch.b[]{dch.b.a(-1.0F, -0.45F), dch.b.a(-0.45F, -0.15F), dch.b.a(-0.15F, 0.2F), dch.b.a(0.2F, 0.55F), dch.b.a(0.55F, 1.0F)};
   private final dch.b[] q = new dch.b[]{dch.b.a(-1.0F, -0.35F), dch.b.a(-0.35F, -0.1F), dch.b.a(-0.1F, 0.1F), dch.b.a(0.1F, 0.3F), dch.b.a(0.3F, 1.0F)};
   private final dch.b[] r = new dch.b[]{
      dch.b.a(-1.0F, -0.78F),
      dch.b.a(-0.78F, -0.375F),
      dch.b.a(-0.375F, -0.2225F),
      dch.b.a(-0.2225F, 0.05F),
      dch.b.a(0.05F, 0.45F),
      dch.b.a(0.45F, 0.55F),
      dch.b.a(0.55F, 1.0F)
   };
   private final dch.b s = this.p[0];
   private final dch.b t = dch.b.a(this.p[1], this.p[4]);
   private final dch.b u = dch.b.a(-1.2F, -1.05F);
   private final dch.b v = dch.b.a(-1.05F, -0.455F);
   private final dch.b w = dch.b.a(-0.455F, -0.19F);
   private final dch.b x = dch.b.a(-0.19F, -0.11F);
   private final dch.b y = dch.b.a(-0.11F, 0.55F);
   private final dch.b z = dch.b.a(-0.11F, 0.03F);
   private final dch.b A = dch.b.a(0.03F, 0.3F);
   private final dch.b B = dch.b.a(0.3F, 1.0F);
   private final akm<dby>[][] C = new akm[][]{{dcf.X, dcf.V, dcf.T, dcf.R, dcf.P}, {dcf.W, dcf.U, dcf.S, dcf.Q, dcf.P}};
   private final akm<dby>[][] D = new akm[][]{
      {dcf.d, dcf.d, dcf.d, dcf.q, dcf.p},
      {dcf.b, dcf.b, dcf.i, dcf.p, dcf.o},
      {dcf.j, dcf.b, dcf.i, dcf.k, dcf.l},
      {dcf.r, dcf.r, dcf.i, dcf.x, dcf.x},
      {dcf.f, dcf.f, dcf.f, dcf.f, dcf.f}
   };
   private final akm<dby>[][] E = new akm[][]{
      {dcf.e, null, dcf.q, null, null},
      {null, null, null, null, dcf.n},
      {dcf.c, null, null, dcf.m, null},
      {null, null, dcf.b, dcf.y, dcf.z},
      {null, null, null, null, null}
   };
   private final akm<dby>[][] F = new akm[][]{
      {dcf.d, dcf.d, dcf.d, dcf.q, dcf.q},
      {dcf.D, dcf.D, dcf.i, dcf.p, dcf.o},
      {dcf.D, dcf.D, dcf.D, dcf.D, dcf.l},
      {dcf.s, dcf.s, dcf.i, dcf.i, dcf.x},
      {dcf.A, dcf.A, dcf.A, dcf.C, dcf.C}
   };
   private final akm<dby>[][] G = new akm[][]{
      {dcf.e, null, null, null, null},
      {dcf.E, null, dcf.D, dcf.D, dcf.n},
      {dcf.E, dcf.E, dcf.i, dcf.k, null},
      {null, null, null, null, null},
      {dcf.B, dcf.B, null, null, null}
   };
   private final akm<dby>[][] H = new akm[][]{
      {dcf.u, dcf.u, dcf.t, dcf.v, dcf.v},
      {dcf.u, dcf.u, dcf.t, dcf.v, dcf.v},
      {dcf.t, dcf.t, dcf.t, dcf.v, dcf.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dch.d> a() {
      dch.b $$0 = dch.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dch.d(this.o, this.o, dch.b.a(this.y, this.o), this.o, $$0, dch.b.a(-1.0F, -0.16F), 0L),
         new dch.d(this.o, this.o, dch.b.a(this.y, this.o), this.o, $$0, dch.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dch.d, akm<dby>>> $$0) {
      if (aa.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dch.d, akm<dby>>> $$0) {
      iz.a $$1 = ow.a();
      iy<dwo> $$2 = $$1.b(lf.aD);
      dwp.w.a $$3 = new dwp.w.a($$2.b(dxc.d));
      dwp.w.a $$4 = new dwp.w.a($$2.b(dxc.e));
      dwp.w.a $$5 = new dwp.w.a($$2.b(dxc.g));
      $$0.accept(Pair.of(dch.a(this.o, this.o, this.o, this.o, dch.b.a(0.0F), this.o, 0.01F), dcf.b));
      if (rd.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, azf.a) instanceof axh.e<?, ?> $$7) {
         akm<dby> $$8 = dcf.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dch.a(this.o, this.o, this.o, dch.b.a($$9), dch.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dcf.f ? dcf.A : dcf.f;
         }
      }

      if (rd.a($$3, $$4, $$5, false) instanceof axh.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dch.a(this.o, this.o, dch.b.a($$12), this.o, dch.b.a(0.0F), this.o, 0.0F), dcf.q));
         }
      }
   }

   private void c(Consumer<Pair<dch.d, akm<dby>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dcf.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dch.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dch.d, akm<dby>>> $$0) {
      this.c($$0, dch.b.a(-1.0F, -0.93333334F));
      this.b($$0, dch.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dch.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dch.b.a(-0.56666666F, -0.4F));
      this.c($$0, dch.b.a(-0.4F, -0.26666668F));
      this.d($$0, dch.b.a(-0.26666668F, -0.05F));
      this.e($$0, dch.b.a(-0.05F, 0.05F));
      this.d($$0, dch.b.a(0.05F, 0.26666668F));
      this.c($$0, dch.b.a(0.26666668F, 0.4F));
      this.b($$0, dch.b.a(0.4F, 0.56666666F));
      this.a($$0, dch.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dch.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dch.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dch.d, akm<dby>>> $$0, dch.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dch.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dch.b $$5 = this.q[$$4];
            akm<dby> $$6 = this.a($$2, $$4, $$1);
            akm<dby> $$7 = this.b($$2, $$4, $$1);
            akm<dby> $$8 = this.c($$2, $$4, $$1);
            akm<dby> $$9 = this.e($$2, $$4, $$1);
            akm<dby> $$10 = this.h($$2, $$4, $$1);
            akm<dby> $$11 = this.a($$2, $$4, $$1, $$10);
            akm<dby> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dch.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dch.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dch.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dch.b.a(this.x, this.z), dch.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dch.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dch.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dch.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dch.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dch.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dch.d, akm<dby>>> $$0, dch.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dch.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dch.b $$5 = this.q[$$4];
            akm<dby> $$6 = this.a($$2, $$4, $$1);
            akm<dby> $$7 = this.b($$2, $$4, $$1);
            akm<dby> $$8 = this.c($$2, $$4, $$1);
            akm<dby> $$9 = this.e($$2, $$4, $$1);
            akm<dby> $$10 = this.h($$2, $$4, $$1);
            akm<dby> $$11 = this.a($$2, $$4, $$1, $$6);
            akm<dby> $$12 = this.g($$2, $$4, $$1);
            akm<dby> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dch.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dch.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dch.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dch.b.a(this.x, this.z), dch.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dch.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dch.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dch.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dch.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dch.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dch.d, akm<dby>>> $$0, dch.b $$1) {
      this.a($$0, this.o, this.o, this.x, dch.b.a(this.r[0], this.r[2]), $$1, 0.0F, dcf.O);
      this.a($$0, dch.b.a(this.p[1], this.p[2]), this.o, dch.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dcf.g);
      this.a($$0, dch.b.a(this.p[3], this.p[4]), this.o, dch.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dcf.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dch.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dch.b $$5 = this.q[$$4];
            akm<dby> $$6 = this.a($$2, $$4, $$1);
            akm<dby> $$7 = this.b($$2, $$4, $$1);
            akm<dby> $$8 = this.c($$2, $$4, $$1);
            akm<dby> $$9 = this.h($$2, $$4, $$1);
            akm<dby> $$10 = this.e($$2, $$4, $$1);
            akm<dby> $$11 = this.a($$2, $$4);
            akm<dby> $$12 = this.a($$2, $$4, $$1, $$6);
            akm<dby> $$13 = this.d($$2, $$4, $$1);
            akm<dby> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dch.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dch.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dch.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dch.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dch.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dch.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dch.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dch.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dch.d, akm<dby>>> $$0, dch.b $$1) {
      this.a($$0, this.o, this.o, this.x, dch.b.a(this.r[0], this.r[2]), $$1, 0.0F, dcf.O);
      this.a($$0, dch.b.a(this.p[1], this.p[2]), this.o, dch.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dcf.g);
      this.a($$0, dch.b.a(this.p[3], this.p[4]), this.o, dch.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dcf.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dch.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dch.b $$5 = this.q[$$4];
            akm<dby> $$6 = this.a($$2, $$4, $$1);
            akm<dby> $$7 = this.b($$2, $$4, $$1);
            akm<dby> $$8 = this.c($$2, $$4, $$1);
            akm<dby> $$9 = this.a($$2, $$4);
            akm<dby> $$10 = this.a($$2, $$4, $$1, $$6);
            akm<dby> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dch.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dch.b.a(this.A, this.B), dch.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dch.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dch.b.a(this.A, this.B), dch.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dch.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dch.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dch.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dch.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dch.d, akm<dby>>> $$0, dch.b $$1) {
      this.a($$0, this.s, this.o, this.x, dch.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dcf.O : dcf.L);
      this.a($$0, this.t, this.o, this.x, dch.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dcf.O : dcf.K);
      this.a($$0, this.s, this.o, this.z, dch.b.a(this.r[0], this.r[1]), $$1, 0.0F, dcf.L);
      this.a($$0, this.t, this.o, this.z, dch.b.a(this.r[0], this.r[1]), $$1, 0.0F, dcf.K);
      this.a($$0, this.s, this.o, dch.b.a(this.x, this.B), dch.b.a(this.r[2], this.r[5]), $$1, 0.0F, dcf.L);
      this.a($$0, this.t, this.o, dch.b.a(this.x, this.B), dch.b.a(this.r[2], this.r[5]), $$1, 0.0F, dcf.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dcf.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dcf.K);
      this.a($$0, dch.b.a(this.p[1], this.p[2]), this.o, dch.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dcf.g);
      this.a($$0, dch.b.a(this.p[3], this.p[4]), this.o, dch.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dcf.h);
      this.a($$0, this.s, this.o, dch.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dcf.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dch.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dch.b $$5 = this.q[$$4];
            akm<dby> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dch.b.a(this.A, this.B), dch.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dch.d, akm<dby>>> $$0) {
      this.b($$0, this.o, this.o, dch.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dcf.Z);
      this.b($$0, this.o, dch.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dcf.aa);
      this.c($$0, this.o, this.o, this.o, dch.b.a(this.r[0], this.r[1]), this.o, 0.0F, dcf.ab);
   }

   private akm<dby> a(int $$0, int $$1, dch.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         akm<dby> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private akm<dby> b(int $$0, int $$1, dch.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private akm<dby> c(int $$0, int $$1, dch.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private akm<dby> a(int $$0, int $$1, dch.b $$2, akm<dby> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dcf.w : $$3;
   }

   private akm<dby> d(int $$0, int $$1, dch.b $$2) {
      akm<dby> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private akm<dby> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dcf.N;
      } else {
         return $$0 == 4 ? dcf.f : dcf.M;
      }
   }

   private akm<dby> a(int $$0, dch.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dcf.A : dcf.B;
      } else {
         return $$0 < 3 ? dcf.A : dcf.C;
      }
   }

   private akm<dby> e(int $$0, int $$1, dch.b $$2) {
      if ($$2.b() >= 0L) {
         akm<dby> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private akm<dby> f(int $$0, int $$1, dch.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dcf.I : dcf.H;
      } else {
         return $$0 == 3 ? dcf.J : this.a($$1, $$2);
      }
   }

   private akm<dby> g(int $$0, int $$1, dch.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dcf.G : dcf.F;
      }
   }

   private akm<dby> h(int $$0, int $$1, dch.b $$2) {
      akm<dby> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dch.d, akm<dby>>> $$0, dch.b $$1, dch.b $$2, dch.b $$3, dch.b $$4, dch.b $$5, float $$6, akm<dby> $$7) {
      $$0.accept(Pair.of(dch.a($$1, $$2, $$3, $$4, dch.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dch.a($$1, $$2, $$3, $$4, dch.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dch.d, akm<dby>>> $$0, dch.b $$1, dch.b $$2, dch.b $$3, dch.b $$4, dch.b $$5, float $$6, akm<dby> $$7) {
      $$0.accept(Pair.of(dch.a($$1, $$2, $$3, $$4, dch.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dch.d, akm<dby>>> $$0, dch.b $$1, dch.b $$2, dch.b $$3, dch.b $$4, dch.b $$5, float $$6, akm<dby> $$7) {
      $$0.accept(Pair.of(dch.a($$1, $$2, $$3, $$4, dch.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dwo $$0, dwo $$1, dwo.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dxc.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dxc.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dxc.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dxc.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dch.a((float)$$0);
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

   private static String a(double $$0, dch.b[] $$1) {
      double $$2 = (double)dch.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @azi
   public dch.b[] b() {
      return this.p;
   }

   @azi
   public dch.b[] c() {
      return this.q;
   }

   @azi
   public dch.b[] d() {
      return this.r;
   }

   @azi
   public dch.b[] e() {
      return new dch.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @azi
   public dch.b[] f() {
      return new dch.b[]{
         dch.b.a(-2.0F, dxc.a(0.05F)),
         dch.b.a(dxc.a(0.05F), dxc.a(0.26666668F)),
         dch.b.a(dxc.a(0.26666668F), dxc.a(0.4F)),
         dch.b.a(dxc.a(0.4F), dxc.a(0.56666666F)),
         dch.b.a(dxc.a(0.56666666F), 2.0F)
      };
   }

   @azi
   public dch.b[] g() {
      return new dch.b[]{dch.b.a(-2.0F, 0.0F), dch.b.a(0.0F, 2.0F)};
   }
}
