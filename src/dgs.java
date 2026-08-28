import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dgs {
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
   private final dgl.b o = dgl.b.a(-1.0F, 1.0F);
   private final dgl.b[] p = new dgl.b[]{dgl.b.a(-1.0F, -0.45F), dgl.b.a(-0.45F, -0.15F), dgl.b.a(-0.15F, 0.2F), dgl.b.a(0.2F, 0.55F), dgl.b.a(0.55F, 1.0F)};
   private final dgl.b[] q = new dgl.b[]{dgl.b.a(-1.0F, -0.35F), dgl.b.a(-0.35F, -0.1F), dgl.b.a(-0.1F, 0.1F), dgl.b.a(0.1F, 0.3F), dgl.b.a(0.3F, 1.0F)};
   private final dgl.b[] r = new dgl.b[]{
      dgl.b.a(-1.0F, -0.78F),
      dgl.b.a(-0.78F, -0.375F),
      dgl.b.a(-0.375F, -0.2225F),
      dgl.b.a(-0.2225F, 0.05F),
      dgl.b.a(0.05F, 0.45F),
      dgl.b.a(0.45F, 0.55F),
      dgl.b.a(0.55F, 1.0F)
   };
   private final dgl.b s = this.p[0];
   private final dgl.b t = dgl.b.a(this.p[1], this.p[4]);
   private final dgl.b u = dgl.b.a(-1.2F, -1.05F);
   private final dgl.b v = dgl.b.a(-1.05F, -0.455F);
   private final dgl.b w = dgl.b.a(-0.455F, -0.19F);
   private final dgl.b x = dgl.b.a(-0.19F, -0.11F);
   private final dgl.b y = dgl.b.a(-0.11F, 0.55F);
   private final dgl.b z = dgl.b.a(-0.11F, 0.03F);
   private final dgl.b A = dgl.b.a(0.03F, 0.3F);
   private final dgl.b B = dgl.b.a(0.3F, 1.0F);
   private final alh<dgc>[][] C = new alh[][]{{dgj.X, dgj.V, dgj.T, dgj.R, dgj.P}, {dgj.W, dgj.U, dgj.S, dgj.Q, dgj.P}};
   private final alh<dgc>[][] D = new alh[][]{
      {dgj.d, dgj.d, dgj.d, dgj.q, dgj.p},
      {dgj.b, dgj.b, dgj.i, dgj.p, dgj.o},
      {dgj.j, dgj.b, dgj.i, dgj.k, dgj.l},
      {dgj.r, dgj.r, dgj.i, dgj.x, dgj.x},
      {dgj.f, dgj.f, dgj.f, dgj.f, dgj.f}
   };
   private final alh<dgc>[][] E = new alh[][]{
      {dgj.e, null, dgj.q, null, null},
      {null, null, null, null, dgj.n},
      {dgj.c, null, null, dgj.m, null},
      {null, null, dgj.b, dgj.y, dgj.z},
      {null, null, null, null, null}
   };
   private final alh<dgc>[][] F = new alh[][]{
      {dgj.d, dgj.d, dgj.d, dgj.q, dgj.q},
      {dgj.D, dgj.D, dgj.i, dgj.p, dgj.o},
      {dgj.D, dgj.D, dgj.D, dgj.D, dgj.l},
      {dgj.s, dgj.s, dgj.i, dgj.i, dgj.x},
      {dgj.A, dgj.A, dgj.A, dgj.C, dgj.C}
   };
   private final alh<dgc>[][] G = new alh[][]{
      {dgj.e, null, null, null, null},
      {dgj.E, null, dgj.D, dgj.D, dgj.n},
      {dgj.E, dgj.E, dgj.i, dgj.k, null},
      {null, null, null, null, null},
      {dgj.B, dgj.B, null, null, null}
   };
   private final alh<dgc>[][] H = new alh[][]{
      {dgj.u, dgj.u, dgj.t, dgj.v, dgj.v},
      {dgj.u, dgj.u, dgj.t, dgj.v, dgj.v},
      {dgj.t, dgj.t, dgj.t, dgj.v, dgj.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dgl.d> a() {
      dgl.b $$0 = dgl.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dgl.d(this.o, this.o, dgl.b.a(this.y, this.o), this.o, $$0, dgl.b.a(-1.0F, -0.16F), 0L),
         new dgl.d(this.o, this.o, dgl.b.a(this.y, this.o), this.o, $$0, dgl.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dgl.d, alh<dgc>>> $$0) {
      if (ab.ar) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dgl.d, alh<dgc>>> $$0) {
      js.a $$1 = pl.a();
      jr<eay> $$2 = $$1.d(lz.aK);
      eaz.w.a $$3 = new eaz.w.a($$2.b(ebm.d));
      eaz.w.a $$4 = new eaz.w.a($$2.b(ebm.e));
      eaz.w.a $$5 = new eaz.w.a($$2.b(ebm.g));
      $$0.accept(Pair.of(dgl.a(this.o, this.o, this.o, this.o, dgl.b.a(0.0F), this.o, 0.01F), dgj.b));
      if (rn.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, bam.a) instanceof aym.e<?, ?> $$7) {
         alh<dgc> $$8 = dgj.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dgl.a(this.o, this.o, this.o, dgl.b.a($$9), dgl.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dgj.f ? dgj.A : dgj.f;
         }
      }

      if (rn.a($$3, $$4, $$5, false) instanceof aym.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dgl.a(this.o, this.o, dgl.b.a($$12), this.o, dgl.b.a(0.0F), this.o, 0.0F), dgj.q));
         }
      }
   }

   private void c(Consumer<Pair<dgl.d, alh<dgc>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dgj.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dgl.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dgl.d, alh<dgc>>> $$0) {
      this.c($$0, dgl.b.a(-1.0F, -0.93333334F));
      this.b($$0, dgl.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dgl.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dgl.b.a(-0.56666666F, -0.4F));
      this.c($$0, dgl.b.a(-0.4F, -0.26666668F));
      this.d($$0, dgl.b.a(-0.26666668F, -0.05F));
      this.e($$0, dgl.b.a(-0.05F, 0.05F));
      this.d($$0, dgl.b.a(0.05F, 0.26666668F));
      this.c($$0, dgl.b.a(0.26666668F, 0.4F));
      this.b($$0, dgl.b.a(0.4F, 0.56666666F));
      this.a($$0, dgl.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dgl.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dgl.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dgl.d, alh<dgc>>> $$0, dgl.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dgl.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dgl.b $$5 = this.q[$$4];
            alh<dgc> $$6 = this.a($$2, $$4, $$1);
            alh<dgc> $$7 = this.b($$2, $$4, $$1);
            alh<dgc> $$8 = this.c($$2, $$4, $$1);
            alh<dgc> $$9 = this.e($$2, $$4, $$1);
            alh<dgc> $$10 = this.h($$2, $$4, $$1);
            alh<dgc> $$11 = this.a($$2, $$4, $$1, $$10);
            alh<dgc> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dgl.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dgl.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dgl.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dgl.b.a(this.x, this.z), dgl.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgl.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dgl.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgl.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dgl.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dgl.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dgl.d, alh<dgc>>> $$0, dgl.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dgl.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dgl.b $$5 = this.q[$$4];
            alh<dgc> $$6 = this.a($$2, $$4, $$1);
            alh<dgc> $$7 = this.b($$2, $$4, $$1);
            alh<dgc> $$8 = this.c($$2, $$4, $$1);
            alh<dgc> $$9 = this.e($$2, $$4, $$1);
            alh<dgc> $$10 = this.h($$2, $$4, $$1);
            alh<dgc> $$11 = this.a($$2, $$4, $$1, $$6);
            alh<dgc> $$12 = this.g($$2, $$4, $$1);
            alh<dgc> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dgl.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dgl.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dgl.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dgl.b.a(this.x, this.z), dgl.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgl.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dgl.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgl.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dgl.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dgl.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dgl.d, alh<dgc>>> $$0, dgl.b $$1) {
      this.a($$0, this.o, this.o, this.x, dgl.b.a(this.r[0], this.r[2]), $$1, 0.0F, dgj.O);
      this.a($$0, dgl.b.a(this.p[1], this.p[2]), this.o, dgl.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dgj.g);
      this.a($$0, dgl.b.a(this.p[3], this.p[4]), this.o, dgl.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dgj.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dgl.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dgl.b $$5 = this.q[$$4];
            alh<dgc> $$6 = this.a($$2, $$4, $$1);
            alh<dgc> $$7 = this.b($$2, $$4, $$1);
            alh<dgc> $$8 = this.c($$2, $$4, $$1);
            alh<dgc> $$9 = this.h($$2, $$4, $$1);
            alh<dgc> $$10 = this.e($$2, $$4, $$1);
            alh<dgc> $$11 = this.a($$2, $$4);
            alh<dgc> $$12 = this.a($$2, $$4, $$1, $$6);
            alh<dgc> $$13 = this.d($$2, $$4, $$1);
            alh<dgc> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dgl.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dgl.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dgl.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgl.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dgl.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dgl.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dgl.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dgl.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dgl.d, alh<dgc>>> $$0, dgl.b $$1) {
      this.a($$0, this.o, this.o, this.x, dgl.b.a(this.r[0], this.r[2]), $$1, 0.0F, dgj.O);
      this.a($$0, dgl.b.a(this.p[1], this.p[2]), this.o, dgl.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dgj.g);
      this.a($$0, dgl.b.a(this.p[3], this.p[4]), this.o, dgl.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dgj.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dgl.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dgl.b $$5 = this.q[$$4];
            alh<dgc> $$6 = this.a($$2, $$4, $$1);
            alh<dgc> $$7 = this.b($$2, $$4, $$1);
            alh<dgc> $$8 = this.c($$2, $$4, $$1);
            alh<dgc> $$9 = this.a($$2, $$4);
            alh<dgc> $$10 = this.a($$2, $$4, $$1, $$6);
            alh<dgc> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dgl.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dgl.b.a(this.A, this.B), dgl.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dgl.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgl.b.a(this.A, this.B), dgl.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dgl.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dgl.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dgl.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dgl.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dgl.d, alh<dgc>>> $$0, dgl.b $$1) {
      this.a($$0, this.s, this.o, this.x, dgl.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dgj.O : dgj.L);
      this.a($$0, this.t, this.o, this.x, dgl.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dgj.O : dgj.K);
      this.a($$0, this.s, this.o, this.z, dgl.b.a(this.r[0], this.r[1]), $$1, 0.0F, dgj.L);
      this.a($$0, this.t, this.o, this.z, dgl.b.a(this.r[0], this.r[1]), $$1, 0.0F, dgj.K);
      this.a($$0, this.s, this.o, dgl.b.a(this.x, this.B), dgl.b.a(this.r[2], this.r[5]), $$1, 0.0F, dgj.L);
      this.a($$0, this.t, this.o, dgl.b.a(this.x, this.B), dgl.b.a(this.r[2], this.r[5]), $$1, 0.0F, dgj.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dgj.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dgj.K);
      this.a($$0, dgl.b.a(this.p[1], this.p[2]), this.o, dgl.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dgj.g);
      this.a($$0, dgl.b.a(this.p[3], this.p[4]), this.o, dgl.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dgj.h);
      this.a($$0, this.s, this.o, dgl.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dgj.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dgl.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dgl.b $$5 = this.q[$$4];
            alh<dgc> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dgl.b.a(this.A, this.B), dgl.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dgl.d, alh<dgc>>> $$0) {
      this.b($$0, this.o, this.o, dgl.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dgj.Z);
      this.b($$0, this.o, dgl.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dgj.aa);
      this.c($$0, this.o, this.o, this.o, dgl.b.a(this.r[0], this.r[1]), this.o, 0.0F, dgj.ab);
   }

   private alh<dgc> a(int $$0, int $$1, dgl.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         alh<dgc> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private alh<dgc> b(int $$0, int $$1, dgl.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private alh<dgc> c(int $$0, int $$1, dgl.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private alh<dgc> a(int $$0, int $$1, dgl.b $$2, alh<dgc> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dgj.w : $$3;
   }

   private alh<dgc> d(int $$0, int $$1, dgl.b $$2) {
      alh<dgc> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private alh<dgc> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dgj.N;
      } else {
         return $$0 == 4 ? dgj.f : dgj.M;
      }
   }

   private alh<dgc> a(int $$0, dgl.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dgj.A : dgj.B;
      } else {
         return $$0 < 3 ? dgj.A : dgj.C;
      }
   }

   private alh<dgc> e(int $$0, int $$1, dgl.b $$2) {
      if ($$2.b() >= 0L) {
         alh<dgc> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private alh<dgc> f(int $$0, int $$1, dgl.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dgj.I : dgj.H;
      } else {
         return $$0 == 3 ? dgj.J : this.a($$1, $$2);
      }
   }

   private alh<dgc> g(int $$0, int $$1, dgl.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dgj.G : dgj.F;
      }
   }

   private alh<dgc> h(int $$0, int $$1, dgl.b $$2) {
      alh<dgc> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dgl.d, alh<dgc>>> $$0, dgl.b $$1, dgl.b $$2, dgl.b $$3, dgl.b $$4, dgl.b $$5, float $$6, alh<dgc> $$7) {
      $$0.accept(Pair.of(dgl.a($$1, $$2, $$3, $$4, dgl.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dgl.a($$1, $$2, $$3, $$4, dgl.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dgl.d, alh<dgc>>> $$0, dgl.b $$1, dgl.b $$2, dgl.b $$3, dgl.b $$4, dgl.b $$5, float $$6, alh<dgc> $$7) {
      $$0.accept(Pair.of(dgl.a($$1, $$2, $$3, $$4, dgl.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dgl.d, alh<dgc>>> $$0, dgl.b $$1, dgl.b $$2, dgl.b $$3, dgl.b $$4, dgl.b $$5, float $$6, alh<dgc> $$7) {
      $$0.accept(Pair.of(dgl.a($$1, $$2, $$3, $$4, dgl.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(eay $$0, eay $$1, eay.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)ebm.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)ebm.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)ebm.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)ebm.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dgl.a((float)$$0);
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

   private static String a(double $$0, dgl.b[] $$1) {
      double $$2 = (double)dgl.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @baq
   public dgl.b[] b() {
      return this.p;
   }

   @baq
   public dgl.b[] c() {
      return this.q;
   }

   @baq
   public dgl.b[] d() {
      return this.r;
   }

   @baq
   public dgl.b[] e() {
      return new dgl.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @baq
   public dgl.b[] f() {
      return new dgl.b[]{
         dgl.b.a(-2.0F, ebm.a(0.05F)),
         dgl.b.a(ebm.a(0.05F), ebm.a(0.26666668F)),
         dgl.b.a(ebm.a(0.26666668F), ebm.a(0.4F)),
         dgl.b.a(ebm.a(0.4F), ebm.a(0.56666666F)),
         dgl.b.a(ebm.a(0.56666666F), 2.0F)
      };
   }

   @baq
   public dgl.b[] g() {
      return new dgl.b[]{dgl.b.a(-2.0F, 0.0F), dgl.b.a(0.0F, 2.0F)};
   }
}
