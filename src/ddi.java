import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class ddi {
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
   private final ddb.b o = ddb.b.a(-1.0F, 1.0F);
   private final ddb.b[] p = new ddb.b[]{ddb.b.a(-1.0F, -0.45F), ddb.b.a(-0.45F, -0.15F), ddb.b.a(-0.15F, 0.2F), ddb.b.a(0.2F, 0.55F), ddb.b.a(0.55F, 1.0F)};
   private final ddb.b[] q = new ddb.b[]{ddb.b.a(-1.0F, -0.35F), ddb.b.a(-0.35F, -0.1F), ddb.b.a(-0.1F, 0.1F), ddb.b.a(0.1F, 0.3F), ddb.b.a(0.3F, 1.0F)};
   private final ddb.b[] r = new ddb.b[]{
      ddb.b.a(-1.0F, -0.78F),
      ddb.b.a(-0.78F, -0.375F),
      ddb.b.a(-0.375F, -0.2225F),
      ddb.b.a(-0.2225F, 0.05F),
      ddb.b.a(0.05F, 0.45F),
      ddb.b.a(0.45F, 0.55F),
      ddb.b.a(0.55F, 1.0F)
   };
   private final ddb.b s = this.p[0];
   private final ddb.b t = ddb.b.a(this.p[1], this.p[4]);
   private final ddb.b u = ddb.b.a(-1.2F, -1.05F);
   private final ddb.b v = ddb.b.a(-1.05F, -0.455F);
   private final ddb.b w = ddb.b.a(-0.455F, -0.19F);
   private final ddb.b x = ddb.b.a(-0.19F, -0.11F);
   private final ddb.b y = ddb.b.a(-0.11F, 0.55F);
   private final ddb.b z = ddb.b.a(-0.11F, 0.03F);
   private final ddb.b A = ddb.b.a(0.03F, 0.3F);
   private final ddb.b B = ddb.b.a(0.3F, 1.0F);
   private final ala<dcs>[][] C = new ala[][]{{dcz.X, dcz.V, dcz.T, dcz.R, dcz.P}, {dcz.W, dcz.U, dcz.S, dcz.Q, dcz.P}};
   private final ala<dcs>[][] D = new ala[][]{
      {dcz.d, dcz.d, dcz.d, dcz.q, dcz.p},
      {dcz.b, dcz.b, dcz.i, dcz.p, dcz.o},
      {dcz.j, dcz.b, dcz.i, dcz.k, dcz.l},
      {dcz.r, dcz.r, dcz.i, dcz.x, dcz.x},
      {dcz.f, dcz.f, dcz.f, dcz.f, dcz.f}
   };
   private final ala<dcs>[][] E = new ala[][]{
      {dcz.e, null, dcz.q, null, null},
      {null, null, null, null, dcz.n},
      {dcz.c, null, null, dcz.m, null},
      {null, null, dcz.b, dcz.y, dcz.z},
      {null, null, null, null, null}
   };
   private final ala<dcs>[][] F = new ala[][]{
      {dcz.d, dcz.d, dcz.d, dcz.q, dcz.q},
      {dcz.D, dcz.D, dcz.i, dcz.p, dcz.o},
      {dcz.D, dcz.D, dcz.D, dcz.D, dcz.l},
      {dcz.s, dcz.s, dcz.i, dcz.i, dcz.x},
      {dcz.A, dcz.A, dcz.A, dcz.C, dcz.C}
   };
   private final ala<dcs>[][] G = new ala[][]{
      {dcz.e, null, null, null, null},
      {dcz.E, null, dcz.D, dcz.D, dcz.n},
      {dcz.E, dcz.E, dcz.i, dcz.k, null},
      {null, null, null, null, null},
      {dcz.B, dcz.B, null, null, null}
   };
   private final ala<dcs>[][] H = new ala[][]{
      {dcz.u, dcz.u, dcz.t, dcz.v, dcz.v},
      {dcz.u, dcz.u, dcz.t, dcz.v, dcz.v},
      {dcz.t, dcz.t, dcz.t, dcz.v, dcz.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<ddb.d> a() {
      ddb.b $$0 = ddb.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new ddb.d(this.o, this.o, ddb.b.a(this.y, this.o), this.o, $$0, ddb.b.a(-1.0F, -0.16F), 0L),
         new ddb.d(this.o, this.o, ddb.b.a(this.y, this.o), this.o, $$0, ddb.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<ddb.d, ala<dcs>>> $$0) {
      if (aa.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<ddb.d, ala<dcs>>> $$0) {
      jk.a $$1 = ph.a();
      jj<dxi> $$2 = $$1.b(lq.aD);
      dxj.w.a $$3 = new dxj.w.a($$2.b(dxw.d));
      dxj.w.a $$4 = new dxj.w.a($$2.b(dxw.e));
      dxj.w.a $$5 = new dxj.w.a($$2.b(dxw.g));
      $$0.accept(Pair.of(ddb.a(this.o, this.o, this.o, this.o, ddb.b.a(0.0F), this.o, 0.01F), dcz.b));
      if (rr.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, azv.a) instanceof axw.e<?, ?> $$7) {
         ala<dcs> $$8 = dcz.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(ddb.a(this.o, this.o, this.o, ddb.b.a($$9), ddb.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dcz.f ? dcz.A : dcz.f;
         }
      }

      if (rr.a($$3, $$4, $$5, false) instanceof axw.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(ddb.a(this.o, this.o, ddb.b.a($$12), this.o, ddb.b.a(0.0F), this.o, 0.0F), dcz.q));
         }
      }
   }

   private void c(Consumer<Pair<ddb.d, ala<dcs>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dcz.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         ddb.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<ddb.d, ala<dcs>>> $$0) {
      this.c($$0, ddb.b.a(-1.0F, -0.93333334F));
      this.b($$0, ddb.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, ddb.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, ddb.b.a(-0.56666666F, -0.4F));
      this.c($$0, ddb.b.a(-0.4F, -0.26666668F));
      this.d($$0, ddb.b.a(-0.26666668F, -0.05F));
      this.e($$0, ddb.b.a(-0.05F, 0.05F));
      this.d($$0, ddb.b.a(0.05F, 0.26666668F));
      this.c($$0, ddb.b.a(0.26666668F, 0.4F));
      this.b($$0, ddb.b.a(0.4F, 0.56666666F));
      this.a($$0, ddb.b.a(0.56666666F, 0.7666667F));
      this.b($$0, ddb.b.a(0.7666667F, 0.93333334F));
      this.c($$0, ddb.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<ddb.d, ala<dcs>>> $$0, ddb.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddb.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddb.b $$5 = this.q[$$4];
            ala<dcs> $$6 = this.a($$2, $$4, $$1);
            ala<dcs> $$7 = this.b($$2, $$4, $$1);
            ala<dcs> $$8 = this.c($$2, $$4, $$1);
            ala<dcs> $$9 = this.e($$2, $$4, $$1);
            ala<dcs> $$10 = this.h($$2, $$4, $$1);
            ala<dcs> $$11 = this.a($$2, $$4, $$1, $$10);
            ala<dcs> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddb.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddb.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, ddb.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddb.b.a(this.x, this.z), ddb.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddb.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddb.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddb.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, ddb.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddb.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<ddb.d, ala<dcs>>> $$0, ddb.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddb.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddb.b $$5 = this.q[$$4];
            ala<dcs> $$6 = this.a($$2, $$4, $$1);
            ala<dcs> $$7 = this.b($$2, $$4, $$1);
            ala<dcs> $$8 = this.c($$2, $$4, $$1);
            ala<dcs> $$9 = this.e($$2, $$4, $$1);
            ala<dcs> $$10 = this.h($$2, $$4, $$1);
            ala<dcs> $$11 = this.a($$2, $$4, $$1, $$6);
            ala<dcs> $$12 = this.g($$2, $$4, $$1);
            ala<dcs> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, ddb.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddb.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, ddb.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddb.b.a(this.x, this.z), ddb.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddb.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddb.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddb.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, ddb.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddb.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<ddb.d, ala<dcs>>> $$0, ddb.b $$1) {
      this.a($$0, this.o, this.o, this.x, ddb.b.a(this.r[0], this.r[2]), $$1, 0.0F, dcz.O);
      this.a($$0, ddb.b.a(this.p[1], this.p[2]), this.o, ddb.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dcz.g);
      this.a($$0, ddb.b.a(this.p[3], this.p[4]), this.o, ddb.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dcz.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddb.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddb.b $$5 = this.q[$$4];
            ala<dcs> $$6 = this.a($$2, $$4, $$1);
            ala<dcs> $$7 = this.b($$2, $$4, $$1);
            ala<dcs> $$8 = this.c($$2, $$4, $$1);
            ala<dcs> $$9 = this.h($$2, $$4, $$1);
            ala<dcs> $$10 = this.e($$2, $$4, $$1);
            ala<dcs> $$11 = this.a($$2, $$4);
            ala<dcs> $$12 = this.a($$2, $$4, $$1, $$6);
            ala<dcs> $$13 = this.d($$2, $$4, $$1);
            ala<dcs> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddb.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, ddb.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddb.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddb.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, ddb.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, ddb.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddb.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, ddb.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<ddb.d, ala<dcs>>> $$0, ddb.b $$1) {
      this.a($$0, this.o, this.o, this.x, ddb.b.a(this.r[0], this.r[2]), $$1, 0.0F, dcz.O);
      this.a($$0, ddb.b.a(this.p[1], this.p[2]), this.o, ddb.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dcz.g);
      this.a($$0, ddb.b.a(this.p[3], this.p[4]), this.o, ddb.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dcz.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddb.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddb.b $$5 = this.q[$$4];
            ala<dcs> $$6 = this.a($$2, $$4, $$1);
            ala<dcs> $$7 = this.b($$2, $$4, $$1);
            ala<dcs> $$8 = this.c($$2, $$4, $$1);
            ala<dcs> $$9 = this.a($$2, $$4);
            ala<dcs> $$10 = this.a($$2, $$4, $$1, $$6);
            ala<dcs> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, ddb.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, ddb.b.a(this.A, this.B), ddb.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, ddb.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddb.b.a(this.A, this.B), ddb.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, ddb.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddb.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddb.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, ddb.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<ddb.d, ala<dcs>>> $$0, ddb.b $$1) {
      this.a($$0, this.s, this.o, this.x, ddb.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dcz.O : dcz.L);
      this.a($$0, this.t, this.o, this.x, ddb.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dcz.O : dcz.K);
      this.a($$0, this.s, this.o, this.z, ddb.b.a(this.r[0], this.r[1]), $$1, 0.0F, dcz.L);
      this.a($$0, this.t, this.o, this.z, ddb.b.a(this.r[0], this.r[1]), $$1, 0.0F, dcz.K);
      this.a($$0, this.s, this.o, ddb.b.a(this.x, this.B), ddb.b.a(this.r[2], this.r[5]), $$1, 0.0F, dcz.L);
      this.a($$0, this.t, this.o, ddb.b.a(this.x, this.B), ddb.b.a(this.r[2], this.r[5]), $$1, 0.0F, dcz.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dcz.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dcz.K);
      this.a($$0, ddb.b.a(this.p[1], this.p[2]), this.o, ddb.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dcz.g);
      this.a($$0, ddb.b.a(this.p[3], this.p[4]), this.o, ddb.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dcz.h);
      this.a($$0, this.s, this.o, ddb.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dcz.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddb.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddb.b $$5 = this.q[$$4];
            ala<dcs> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddb.b.a(this.A, this.B), ddb.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<ddb.d, ala<dcs>>> $$0) {
      this.b($$0, this.o, this.o, ddb.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dcz.Z);
      this.b($$0, this.o, ddb.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dcz.aa);
      this.c($$0, this.o, this.o, this.o, ddb.b.a(this.r[0], this.r[1]), this.o, 0.0F, dcz.ab);
   }

   private ala<dcs> a(int $$0, int $$1, ddb.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         ala<dcs> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private ala<dcs> b(int $$0, int $$1, ddb.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private ala<dcs> c(int $$0, int $$1, ddb.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private ala<dcs> a(int $$0, int $$1, ddb.b $$2, ala<dcs> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dcz.w : $$3;
   }

   private ala<dcs> d(int $$0, int $$1, ddb.b $$2) {
      ala<dcs> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private ala<dcs> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dcz.N;
      } else {
         return $$0 == 4 ? dcz.f : dcz.M;
      }
   }

   private ala<dcs> a(int $$0, ddb.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dcz.A : dcz.B;
      } else {
         return $$0 < 3 ? dcz.A : dcz.C;
      }
   }

   private ala<dcs> e(int $$0, int $$1, ddb.b $$2) {
      if ($$2.b() >= 0L) {
         ala<dcs> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private ala<dcs> f(int $$0, int $$1, ddb.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dcz.I : dcz.H;
      } else {
         return $$0 == 3 ? dcz.J : this.a($$1, $$2);
      }
   }

   private ala<dcs> g(int $$0, int $$1, ddb.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dcz.G : dcz.F;
      }
   }

   private ala<dcs> h(int $$0, int $$1, ddb.b $$2) {
      ala<dcs> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<ddb.d, ala<dcs>>> $$0, ddb.b $$1, ddb.b $$2, ddb.b $$3, ddb.b $$4, ddb.b $$5, float $$6, ala<dcs> $$7) {
      $$0.accept(Pair.of(ddb.a($$1, $$2, $$3, $$4, ddb.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(ddb.a($$1, $$2, $$3, $$4, ddb.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<ddb.d, ala<dcs>>> $$0, ddb.b $$1, ddb.b $$2, ddb.b $$3, ddb.b $$4, ddb.b $$5, float $$6, ala<dcs> $$7) {
      $$0.accept(Pair.of(ddb.a($$1, $$2, $$3, $$4, ddb.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<ddb.d, ala<dcs>>> $$0, ddb.b $$1, ddb.b $$2, ddb.b $$3, ddb.b $$4, ddb.b $$5, float $$6, ala<dcs> $$7) {
      $$0.accept(Pair.of(ddb.a($$1, $$2, $$3, $$4, ddb.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dxi $$0, dxi $$1, dxi.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dxw.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dxw.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dxw.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dxw.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)ddb.a((float)$$0);
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

   private static String a(double $$0, ddb.b[] $$1) {
      double $$2 = (double)ddb.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @azy
   public ddb.b[] b() {
      return this.p;
   }

   @azy
   public ddb.b[] c() {
      return this.q;
   }

   @azy
   public ddb.b[] d() {
      return this.r;
   }

   @azy
   public ddb.b[] e() {
      return new ddb.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @azy
   public ddb.b[] f() {
      return new ddb.b[]{
         ddb.b.a(-2.0F, dxw.a(0.05F)),
         ddb.b.a(dxw.a(0.05F), dxw.a(0.26666668F)),
         ddb.b.a(dxw.a(0.26666668F), dxw.a(0.4F)),
         ddb.b.a(dxw.a(0.4F), dxw.a(0.56666666F)),
         ddb.b.a(dxw.a(0.56666666F), 2.0F)
      };
   }

   @azy
   public ddb.b[] g() {
      return new ddb.b[]{ddb.b.a(-2.0F, 0.0F), ddb.b.a(0.0F, 2.0F)};
   }
}
