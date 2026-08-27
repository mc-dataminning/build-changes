import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class ctg {
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
   private final csz.b o = csz.b.a(-1.0F, 1.0F);
   private final csz.b[] p = new csz.b[]{csz.b.a(-1.0F, -0.45F), csz.b.a(-0.45F, -0.15F), csz.b.a(-0.15F, 0.2F), csz.b.a(0.2F, 0.55F), csz.b.a(0.55F, 1.0F)};
   private final csz.b[] q = new csz.b[]{csz.b.a(-1.0F, -0.35F), csz.b.a(-0.35F, -0.1F), csz.b.a(-0.1F, 0.1F), csz.b.a(0.1F, 0.3F), csz.b.a(0.3F, 1.0F)};
   private final csz.b[] r = new csz.b[]{
      csz.b.a(-1.0F, -0.78F),
      csz.b.a(-0.78F, -0.375F),
      csz.b.a(-0.375F, -0.2225F),
      csz.b.a(-0.2225F, 0.05F),
      csz.b.a(0.05F, 0.45F),
      csz.b.a(0.45F, 0.55F),
      csz.b.a(0.55F, 1.0F)
   };
   private final csz.b s = this.p[0];
   private final csz.b t = csz.b.a(this.p[1], this.p[4]);
   private final csz.b u = csz.b.a(-1.2F, -1.05F);
   private final csz.b v = csz.b.a(-1.05F, -0.455F);
   private final csz.b w = csz.b.a(-0.455F, -0.19F);
   private final csz.b x = csz.b.a(-0.19F, -0.11F);
   private final csz.b y = csz.b.a(-0.11F, 0.55F);
   private final csz.b z = csz.b.a(-0.11F, 0.03F);
   private final csz.b A = csz.b.a(0.03F, 0.3F);
   private final csz.b B = csz.b.a(0.3F, 1.0F);
   private final agf<csq>[][] C = new agf[][]{{csx.X, csx.V, csx.T, csx.R, csx.P}, {csx.W, csx.U, csx.S, csx.Q, csx.P}};
   private final agf<csq>[][] D = new agf[][]{
      {csx.d, csx.d, csx.d, csx.q, csx.p},
      {csx.b, csx.b, csx.i, csx.p, csx.o},
      {csx.j, csx.b, csx.i, csx.k, csx.l},
      {csx.r, csx.r, csx.i, csx.x, csx.x},
      {csx.f, csx.f, csx.f, csx.f, csx.f}
   };
   private final agf<csq>[][] E = new agf[][]{
      {csx.e, null, csx.q, null, null},
      {null, null, null, null, csx.n},
      {csx.c, null, null, csx.m, null},
      {null, null, csx.b, csx.y, csx.z},
      {null, null, null, null, null}
   };
   private final agf<csq>[][] F = new agf[][]{
      {csx.d, csx.d, csx.d, csx.q, csx.q},
      {csx.D, csx.D, csx.i, csx.p, csx.o},
      {csx.D, csx.D, csx.D, csx.D, csx.l},
      {csx.s, csx.s, csx.i, csx.i, csx.x},
      {csx.A, csx.A, csx.A, csx.C, csx.C}
   };
   private final agf<csq>[][] G = new agf[][]{
      {csx.e, null, null, null, null},
      {csx.E, null, csx.D, csx.D, csx.n},
      {csx.E, csx.E, csx.i, csx.k, null},
      {null, null, null, null, null},
      {csx.B, csx.B, null, null, null}
   };
   private final agf<csq>[][] H = new agf[][]{
      {csx.u, csx.u, csx.t, csx.v, csx.v},
      {csx.u, csx.u, csx.t, csx.v, csx.v},
      {csx.t, csx.t, csx.t, csx.v, csx.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<csz.d> a() {
      csz.b $$0 = csz.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new csz.d(this.o, this.o, csz.b.a(this.y, this.o), this.o, $$0, csz.b.a(-1.0F, -0.16F), 0L),
         new csz.d(this.o, this.o, csz.b.a(this.y, this.o), this.o, $$0, csz.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<csz.d, agf<csq>>> $$0) {
      if (aa.aq) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<csz.d, agf<csq>>> $$0) {
      id.b $$1 = ni.a();
      ic<dly> $$2 = $$1.b(jz.av);
      dlz.w.a $$3 = new dlz.w.a($$2.b(dmm.d));
      dlz.w.a $$4 = new dlz.w.a($$2.b(dmm.e));
      dlz.w.a $$5 = new dlz.w.a($$2.b(dmm.g));
      $$0.accept(Pair.of(csz.a(this.o, this.o, this.o, this.o, csz.b.a(0.0F), this.o, 0.01F), csx.b));
      if (pj.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, auh.a) instanceof asl.e<?, ?> $$7) {
         agf<csq> $$8 = csx.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(csz.a(this.o, this.o, this.o, csz.b.a($$9), csz.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == csx.f ? csx.A : csx.f;
         }
      }

      if (pj.a($$3, $$4, $$5, false) instanceof asl.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(csz.a(this.o, this.o, csz.b.a($$12), this.o, csz.b.a(0.0F), this.o, 0.0F), csx.q));
         }
      }
   }

   private void c(Consumer<Pair<csz.d, agf<csq>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, csx.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         csz.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<csz.d, agf<csq>>> $$0) {
      this.c($$0, csz.b.a(-1.0F, -0.93333334F));
      this.b($$0, csz.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, csz.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, csz.b.a(-0.56666666F, -0.4F));
      this.c($$0, csz.b.a(-0.4F, -0.26666668F));
      this.d($$0, csz.b.a(-0.26666668F, -0.05F));
      this.e($$0, csz.b.a(-0.05F, 0.05F));
      this.d($$0, csz.b.a(0.05F, 0.26666668F));
      this.c($$0, csz.b.a(0.26666668F, 0.4F));
      this.b($$0, csz.b.a(0.4F, 0.56666666F));
      this.a($$0, csz.b.a(0.56666666F, 0.7666667F));
      this.b($$0, csz.b.a(0.7666667F, 0.93333334F));
      this.c($$0, csz.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<csz.d, agf<csq>>> $$0, csz.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         csz.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            csz.b $$5 = this.q[$$4];
            agf<csq> $$6 = this.a($$2, $$4, $$1);
            agf<csq> $$7 = this.b($$2, $$4, $$1);
            agf<csq> $$8 = this.c($$2, $$4, $$1);
            agf<csq> $$9 = this.e($$2, $$4, $$1);
            agf<csq> $$10 = this.h($$2, $$4, $$1);
            agf<csq> $$11 = this.a($$2, $$4, $$1, $$10);
            agf<csq> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, csz.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, csz.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, csz.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, csz.b.a(this.x, this.z), csz.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, csz.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, csz.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, csz.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, csz.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, csz.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<csz.d, agf<csq>>> $$0, csz.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         csz.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            csz.b $$5 = this.q[$$4];
            agf<csq> $$6 = this.a($$2, $$4, $$1);
            agf<csq> $$7 = this.b($$2, $$4, $$1);
            agf<csq> $$8 = this.c($$2, $$4, $$1);
            agf<csq> $$9 = this.e($$2, $$4, $$1);
            agf<csq> $$10 = this.h($$2, $$4, $$1);
            agf<csq> $$11 = this.a($$2, $$4, $$1, $$6);
            agf<csq> $$12 = this.g($$2, $$4, $$1);
            agf<csq> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, csz.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, csz.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, csz.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, csz.b.a(this.x, this.z), csz.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, csz.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, csz.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, csz.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, csz.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, csz.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<csz.d, agf<csq>>> $$0, csz.b $$1) {
      this.a($$0, this.o, this.o, this.x, csz.b.a(this.r[0], this.r[2]), $$1, 0.0F, csx.O);
      this.a($$0, csz.b.a(this.p[1], this.p[2]), this.o, csz.b.a(this.z, this.B), this.r[6], $$1, 0.0F, csx.g);
      this.a($$0, csz.b.a(this.p[3], this.p[4]), this.o, csz.b.a(this.z, this.B), this.r[6], $$1, 0.0F, csx.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         csz.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            csz.b $$5 = this.q[$$4];
            agf<csq> $$6 = this.a($$2, $$4, $$1);
            agf<csq> $$7 = this.b($$2, $$4, $$1);
            agf<csq> $$8 = this.c($$2, $$4, $$1);
            agf<csq> $$9 = this.h($$2, $$4, $$1);
            agf<csq> $$10 = this.e($$2, $$4, $$1);
            agf<csq> $$11 = this.a($$2, $$4);
            agf<csq> $$12 = this.a($$2, $$4, $$1, $$6);
            agf<csq> $$13 = this.d($$2, $$4, $$1);
            agf<csq> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, csz.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, csz.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, csz.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, csz.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, csz.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, csz.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, csz.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, csz.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<csz.d, agf<csq>>> $$0, csz.b $$1) {
      this.a($$0, this.o, this.o, this.x, csz.b.a(this.r[0], this.r[2]), $$1, 0.0F, csx.O);
      this.a($$0, csz.b.a(this.p[1], this.p[2]), this.o, csz.b.a(this.z, this.B), this.r[6], $$1, 0.0F, csx.g);
      this.a($$0, csz.b.a(this.p[3], this.p[4]), this.o, csz.b.a(this.z, this.B), this.r[6], $$1, 0.0F, csx.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         csz.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            csz.b $$5 = this.q[$$4];
            agf<csq> $$6 = this.a($$2, $$4, $$1);
            agf<csq> $$7 = this.b($$2, $$4, $$1);
            agf<csq> $$8 = this.c($$2, $$4, $$1);
            agf<csq> $$9 = this.a($$2, $$4);
            agf<csq> $$10 = this.a($$2, $$4, $$1, $$6);
            agf<csq> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, csz.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, csz.b.a(this.A, this.B), csz.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, csz.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, csz.b.a(this.A, this.B), csz.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, csz.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, csz.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, csz.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, csz.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<csz.d, agf<csq>>> $$0, csz.b $$1) {
      this.a($$0, this.s, this.o, this.x, csz.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? csx.O : csx.L);
      this.a($$0, this.t, this.o, this.x, csz.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? csx.O : csx.K);
      this.a($$0, this.s, this.o, this.z, csz.b.a(this.r[0], this.r[1]), $$1, 0.0F, csx.L);
      this.a($$0, this.t, this.o, this.z, csz.b.a(this.r[0], this.r[1]), $$1, 0.0F, csx.K);
      this.a($$0, this.s, this.o, csz.b.a(this.x, this.B), csz.b.a(this.r[2], this.r[5]), $$1, 0.0F, csx.L);
      this.a($$0, this.t, this.o, csz.b.a(this.x, this.B), csz.b.a(this.r[2], this.r[5]), $$1, 0.0F, csx.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, csx.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, csx.K);
      this.a($$0, csz.b.a(this.p[1], this.p[2]), this.o, csz.b.a(this.y, this.B), this.r[6], $$1, 0.0F, csx.g);
      this.a($$0, csz.b.a(this.p[3], this.p[4]), this.o, csz.b.a(this.y, this.B), this.r[6], $$1, 0.0F, csx.h);
      this.a($$0, this.s, this.o, csz.b.a(this.y, this.B), this.r[6], $$1, 0.0F, csx.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         csz.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            csz.b $$5 = this.q[$$4];
            agf<csq> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, csz.b.a(this.A, this.B), csz.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<csz.d, agf<csq>>> $$0) {
      this.b($$0, this.o, this.o, csz.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, csx.Z);
      this.b($$0, this.o, csz.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, csx.aa);
      this.c($$0, this.o, this.o, this.o, csz.b.a(this.r[0], this.r[1]), this.o, 0.0F, csx.ab);
   }

   private agf<csq> a(int $$0, int $$1, csz.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         agf<csq> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private agf<csq> b(int $$0, int $$1, csz.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private agf<csq> c(int $$0, int $$1, csz.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private agf<csq> a(int $$0, int $$1, csz.b $$2, agf<csq> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? csx.w : $$3;
   }

   private agf<csq> d(int $$0, int $$1, csz.b $$2) {
      agf<csq> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private agf<csq> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return csx.N;
      } else {
         return $$0 == 4 ? csx.f : csx.M;
      }
   }

   private agf<csq> a(int $$0, csz.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? csx.A : csx.B;
      } else {
         return $$0 < 3 ? csx.A : csx.C;
      }
   }

   private agf<csq> e(int $$0, int $$1, csz.b $$2) {
      if ($$2.b() >= 0L) {
         agf<csq> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private agf<csq> f(int $$0, int $$1, csz.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? csx.I : csx.H;
      } else {
         return $$0 == 3 ? csx.J : this.a($$1, $$2);
      }
   }

   private agf<csq> g(int $$0, int $$1, csz.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? csx.G : csx.F;
      }
   }

   private agf<csq> h(int $$0, int $$1, csz.b $$2) {
      agf<csq> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<csz.d, agf<csq>>> $$0, csz.b $$1, csz.b $$2, csz.b $$3, csz.b $$4, csz.b $$5, float $$6, agf<csq> $$7) {
      $$0.accept(Pair.of(csz.a($$1, $$2, $$3, $$4, csz.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(csz.a($$1, $$2, $$3, $$4, csz.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<csz.d, agf<csq>>> $$0, csz.b $$1, csz.b $$2, csz.b $$3, csz.b $$4, csz.b $$5, float $$6, agf<csq> $$7) {
      $$0.accept(Pair.of(csz.a($$1, $$2, $$3, $$4, csz.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<csz.d, agf<csq>>> $$0, csz.b $$1, csz.b $$2, csz.b $$3, csz.b $$4, csz.b $$5, float $$6, agf<csq> $$7) {
      $$0.accept(Pair.of(csz.a($$1, $$2, $$3, $$4, csz.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dly $$0, dly $$1, dly.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dmm.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dmm.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dmm.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dmm.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)csz.a((float)$$0);
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

   private static String a(double $$0, csz.b[] $$1) {
      double $$2 = (double)csz.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @auk
   public csz.b[] b() {
      return this.p;
   }

   @auk
   public csz.b[] c() {
      return this.q;
   }

   @auk
   public csz.b[] d() {
      return this.r;
   }

   @auk
   public csz.b[] e() {
      return new csz.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @auk
   public csz.b[] f() {
      return new csz.b[]{
         csz.b.a(-2.0F, dmm.a(0.05F)),
         csz.b.a(dmm.a(0.05F), dmm.a(0.26666668F)),
         csz.b.a(dmm.a(0.26666668F), dmm.a(0.4F)),
         csz.b.a(dmm.a(0.4F), dmm.a(0.56666666F)),
         csz.b.a(dmm.a(0.56666666F), 2.0F)
      };
   }

   @auk
   public csz.b[] g() {
      return new csz.b[]{csz.b.a(-2.0F, 0.0F), csz.b.a(0.0F, 2.0F)};
   }
}
