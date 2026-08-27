import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class csn {
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
   private final csg.b o = csg.b.a(-1.0F, 1.0F);
   private final csg.b[] p = new csg.b[]{csg.b.a(-1.0F, -0.45F), csg.b.a(-0.45F, -0.15F), csg.b.a(-0.15F, 0.2F), csg.b.a(0.2F, 0.55F), csg.b.a(0.55F, 1.0F)};
   private final csg.b[] q = new csg.b[]{csg.b.a(-1.0F, -0.35F), csg.b.a(-0.35F, -0.1F), csg.b.a(-0.1F, 0.1F), csg.b.a(0.1F, 0.3F), csg.b.a(0.3F, 1.0F)};
   private final csg.b[] r = new csg.b[]{
      csg.b.a(-1.0F, -0.78F),
      csg.b.a(-0.78F, -0.375F),
      csg.b.a(-0.375F, -0.2225F),
      csg.b.a(-0.2225F, 0.05F),
      csg.b.a(0.05F, 0.45F),
      csg.b.a(0.45F, 0.55F),
      csg.b.a(0.55F, 1.0F)
   };
   private final csg.b s = this.p[0];
   private final csg.b t = csg.b.a(this.p[1], this.p[4]);
   private final csg.b u = csg.b.a(-1.2F, -1.05F);
   private final csg.b v = csg.b.a(-1.05F, -0.455F);
   private final csg.b w = csg.b.a(-0.455F, -0.19F);
   private final csg.b x = csg.b.a(-0.19F, -0.11F);
   private final csg.b y = csg.b.a(-0.11F, 0.55F);
   private final csg.b z = csg.b.a(-0.11F, 0.03F);
   private final csg.b A = csg.b.a(0.03F, 0.3F);
   private final csg.b B = csg.b.a(0.3F, 1.0F);
   private final afv<crx>[][] C = new afv[][]{{cse.X, cse.V, cse.T, cse.R, cse.P}, {cse.W, cse.U, cse.S, cse.Q, cse.P}};
   private final afv<crx>[][] D = new afv[][]{
      {cse.d, cse.d, cse.d, cse.q, cse.p},
      {cse.b, cse.b, cse.i, cse.p, cse.o},
      {cse.j, cse.b, cse.i, cse.k, cse.l},
      {cse.r, cse.r, cse.i, cse.x, cse.x},
      {cse.f, cse.f, cse.f, cse.f, cse.f}
   };
   private final afv<crx>[][] E = new afv[][]{
      {cse.e, null, cse.q, null, null},
      {null, null, null, null, cse.n},
      {cse.c, null, null, cse.m, null},
      {null, null, cse.b, cse.y, cse.z},
      {null, null, null, null, null}
   };
   private final afv<crx>[][] F = new afv[][]{
      {cse.d, cse.d, cse.d, cse.q, cse.q},
      {cse.D, cse.D, cse.i, cse.p, cse.o},
      {cse.D, cse.D, cse.D, cse.D, cse.l},
      {cse.s, cse.s, cse.i, cse.i, cse.x},
      {cse.A, cse.A, cse.A, cse.C, cse.C}
   };
   private final afv<crx>[][] G = new afv[][]{
      {cse.e, null, null, null, null},
      {cse.E, null, cse.D, cse.D, cse.n},
      {cse.E, cse.E, cse.i, cse.k, null},
      {null, null, null, null, null},
      {cse.B, cse.B, null, null, null}
   };
   private final afv<crx>[][] H = new afv[][]{
      {cse.u, cse.u, cse.t, cse.v, cse.v},
      {cse.u, cse.u, cse.t, cse.v, cse.v},
      {cse.t, cse.t, cse.t, cse.v, cse.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<csg.d> a() {
      csg.b $$0 = csg.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new csg.d(this.o, this.o, csg.b.a(this.y, this.o), this.o, $$0, csg.b.a(-1.0F, -0.16F), 0L),
         new csg.d(this.o, this.o, csg.b.a(this.y, this.o), this.o, $$0, csg.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<csg.d, afv<crx>>> $$0) {
      if (aa.aq) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<csg.d, afv<crx>>> $$0) {
      id.b $$1 = ne.a();
      ic<dld> $$2 = $$1.b(jz.au);
      dle.w.a $$3 = new dle.w.a($$2.b(dlr.d));
      dle.w.a $$4 = new dle.w.a($$2.b(dlr.e));
      dle.w.a $$5 = new dle.w.a($$2.b(dlr.g));
      $$0.accept(Pair.of(csg.a(this.o, this.o, this.o, this.o, csg.b.a(0.0F), this.o, 0.01F), cse.b));
      if (pd.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, atx.a) instanceof asb.e<?, ?> $$7) {
         afv<crx> $$8 = cse.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(csg.a(this.o, this.o, this.o, csg.b.a($$9), csg.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == cse.f ? cse.A : cse.f;
         }
      }

      if (pd.a($$3, $$4, $$5, false) instanceof asb.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(csg.a(this.o, this.o, csg.b.a($$12), this.o, csg.b.a(0.0F), this.o, 0.0F), cse.q));
         }
      }
   }

   private void c(Consumer<Pair<csg.d, afv<crx>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, cse.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         csg.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<csg.d, afv<crx>>> $$0) {
      this.c($$0, csg.b.a(-1.0F, -0.93333334F));
      this.b($$0, csg.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, csg.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, csg.b.a(-0.56666666F, -0.4F));
      this.c($$0, csg.b.a(-0.4F, -0.26666668F));
      this.d($$0, csg.b.a(-0.26666668F, -0.05F));
      this.e($$0, csg.b.a(-0.05F, 0.05F));
      this.d($$0, csg.b.a(0.05F, 0.26666668F));
      this.c($$0, csg.b.a(0.26666668F, 0.4F));
      this.b($$0, csg.b.a(0.4F, 0.56666666F));
      this.a($$0, csg.b.a(0.56666666F, 0.7666667F));
      this.b($$0, csg.b.a(0.7666667F, 0.93333334F));
      this.c($$0, csg.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<csg.d, afv<crx>>> $$0, csg.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         csg.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            csg.b $$5 = this.q[$$4];
            afv<crx> $$6 = this.a($$2, $$4, $$1);
            afv<crx> $$7 = this.b($$2, $$4, $$1);
            afv<crx> $$8 = this.c($$2, $$4, $$1);
            afv<crx> $$9 = this.e($$2, $$4, $$1);
            afv<crx> $$10 = this.h($$2, $$4, $$1);
            afv<crx> $$11 = this.a($$2, $$4, $$1, $$10);
            afv<crx> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, csg.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, csg.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, csg.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, csg.b.a(this.x, this.z), csg.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, csg.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, csg.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, csg.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, csg.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, csg.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<csg.d, afv<crx>>> $$0, csg.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         csg.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            csg.b $$5 = this.q[$$4];
            afv<crx> $$6 = this.a($$2, $$4, $$1);
            afv<crx> $$7 = this.b($$2, $$4, $$1);
            afv<crx> $$8 = this.c($$2, $$4, $$1);
            afv<crx> $$9 = this.e($$2, $$4, $$1);
            afv<crx> $$10 = this.h($$2, $$4, $$1);
            afv<crx> $$11 = this.a($$2, $$4, $$1, $$6);
            afv<crx> $$12 = this.g($$2, $$4, $$1);
            afv<crx> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, csg.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, csg.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, csg.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, csg.b.a(this.x, this.z), csg.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, csg.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, csg.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, csg.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, csg.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, csg.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<csg.d, afv<crx>>> $$0, csg.b $$1) {
      this.a($$0, this.o, this.o, this.x, csg.b.a(this.r[0], this.r[2]), $$1, 0.0F, cse.O);
      this.a($$0, csg.b.a(this.p[1], this.p[2]), this.o, csg.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cse.g);
      this.a($$0, csg.b.a(this.p[3], this.p[4]), this.o, csg.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cse.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         csg.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            csg.b $$5 = this.q[$$4];
            afv<crx> $$6 = this.a($$2, $$4, $$1);
            afv<crx> $$7 = this.b($$2, $$4, $$1);
            afv<crx> $$8 = this.c($$2, $$4, $$1);
            afv<crx> $$9 = this.h($$2, $$4, $$1);
            afv<crx> $$10 = this.e($$2, $$4, $$1);
            afv<crx> $$11 = this.a($$2, $$4);
            afv<crx> $$12 = this.a($$2, $$4, $$1, $$6);
            afv<crx> $$13 = this.d($$2, $$4, $$1);
            afv<crx> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, csg.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, csg.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, csg.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, csg.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, csg.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, csg.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, csg.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, csg.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<csg.d, afv<crx>>> $$0, csg.b $$1) {
      this.a($$0, this.o, this.o, this.x, csg.b.a(this.r[0], this.r[2]), $$1, 0.0F, cse.O);
      this.a($$0, csg.b.a(this.p[1], this.p[2]), this.o, csg.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cse.g);
      this.a($$0, csg.b.a(this.p[3], this.p[4]), this.o, csg.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cse.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         csg.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            csg.b $$5 = this.q[$$4];
            afv<crx> $$6 = this.a($$2, $$4, $$1);
            afv<crx> $$7 = this.b($$2, $$4, $$1);
            afv<crx> $$8 = this.c($$2, $$4, $$1);
            afv<crx> $$9 = this.a($$2, $$4);
            afv<crx> $$10 = this.a($$2, $$4, $$1, $$6);
            afv<crx> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, csg.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, csg.b.a(this.A, this.B), csg.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, csg.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, csg.b.a(this.A, this.B), csg.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, csg.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, csg.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, csg.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, csg.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<csg.d, afv<crx>>> $$0, csg.b $$1) {
      this.a($$0, this.s, this.o, this.x, csg.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cse.O : cse.L);
      this.a($$0, this.t, this.o, this.x, csg.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cse.O : cse.K);
      this.a($$0, this.s, this.o, this.z, csg.b.a(this.r[0], this.r[1]), $$1, 0.0F, cse.L);
      this.a($$0, this.t, this.o, this.z, csg.b.a(this.r[0], this.r[1]), $$1, 0.0F, cse.K);
      this.a($$0, this.s, this.o, csg.b.a(this.x, this.B), csg.b.a(this.r[2], this.r[5]), $$1, 0.0F, cse.L);
      this.a($$0, this.t, this.o, csg.b.a(this.x, this.B), csg.b.a(this.r[2], this.r[5]), $$1, 0.0F, cse.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, cse.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, cse.K);
      this.a($$0, csg.b.a(this.p[1], this.p[2]), this.o, csg.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cse.g);
      this.a($$0, csg.b.a(this.p[3], this.p[4]), this.o, csg.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cse.h);
      this.a($$0, this.s, this.o, csg.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cse.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         csg.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            csg.b $$5 = this.q[$$4];
            afv<crx> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, csg.b.a(this.A, this.B), csg.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<csg.d, afv<crx>>> $$0) {
      this.b($$0, this.o, this.o, csg.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, cse.Z);
      this.b($$0, this.o, csg.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, cse.aa);
      this.c($$0, this.o, this.o, this.o, csg.b.a(this.r[0], this.r[1]), this.o, 0.0F, cse.ab);
   }

   private afv<crx> a(int $$0, int $$1, csg.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         afv<crx> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private afv<crx> b(int $$0, int $$1, csg.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private afv<crx> c(int $$0, int $$1, csg.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private afv<crx> a(int $$0, int $$1, csg.b $$2, afv<crx> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? cse.w : $$3;
   }

   private afv<crx> d(int $$0, int $$1, csg.b $$2) {
      afv<crx> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private afv<crx> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return cse.N;
      } else {
         return $$0 == 4 ? cse.f : cse.M;
      }
   }

   private afv<crx> a(int $$0, csg.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? cse.A : cse.B;
      } else {
         return $$0 < 3 ? cse.A : cse.C;
      }
   }

   private afv<crx> e(int $$0, int $$1, csg.b $$2) {
      if ($$2.b() >= 0L) {
         afv<crx> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private afv<crx> f(int $$0, int $$1, csg.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? cse.I : cse.H;
      } else {
         return $$0 == 3 ? cse.J : this.a($$1, $$2);
      }
   }

   private afv<crx> g(int $$0, int $$1, csg.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? cse.G : cse.F;
      }
   }

   private afv<crx> h(int $$0, int $$1, csg.b $$2) {
      afv<crx> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<csg.d, afv<crx>>> $$0, csg.b $$1, csg.b $$2, csg.b $$3, csg.b $$4, csg.b $$5, float $$6, afv<crx> $$7) {
      $$0.accept(Pair.of(csg.a($$1, $$2, $$3, $$4, csg.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(csg.a($$1, $$2, $$3, $$4, csg.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<csg.d, afv<crx>>> $$0, csg.b $$1, csg.b $$2, csg.b $$3, csg.b $$4, csg.b $$5, float $$6, afv<crx> $$7) {
      $$0.accept(Pair.of(csg.a($$1, $$2, $$3, $$4, csg.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<csg.d, afv<crx>>> $$0, csg.b $$1, csg.b $$2, csg.b $$3, csg.b $$4, csg.b $$5, float $$6, afv<crx> $$7) {
      $$0.accept(Pair.of(csg.a($$1, $$2, $$3, $$4, csg.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dld $$0, dld $$1, dld.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dlr.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dlr.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dlr.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dlr.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)csg.a((float)$$0);
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

   private static String a(double $$0, csg.b[] $$1) {
      double $$2 = (double)csg.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @aua
   public csg.b[] b() {
      return this.p;
   }

   @aua
   public csg.b[] c() {
      return this.q;
   }

   @aua
   public csg.b[] d() {
      return this.r;
   }

   @aua
   public csg.b[] e() {
      return new csg.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @aua
   public csg.b[] f() {
      return new csg.b[]{
         csg.b.a(-2.0F, dlr.a(0.05F)),
         csg.b.a(dlr.a(0.05F), dlr.a(0.26666668F)),
         csg.b.a(dlr.a(0.26666668F), dlr.a(0.4F)),
         csg.b.a(dlr.a(0.4F), dlr.a(0.56666666F)),
         csg.b.a(dlr.a(0.56666666F), 2.0F)
      };
   }

   @aua
   public csg.b[] g() {
      return new csg.b[]{csg.b.a(-2.0F, 0.0F), csg.b.a(0.0F, 2.0F)};
   }
}
