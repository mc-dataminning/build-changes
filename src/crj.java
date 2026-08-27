import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class crj {
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
   private final crc.b o = crc.b.a(-1.0F, 1.0F);
   private final crc.b[] p = new crc.b[]{crc.b.a(-1.0F, -0.45F), crc.b.a(-0.45F, -0.15F), crc.b.a(-0.15F, 0.2F), crc.b.a(0.2F, 0.55F), crc.b.a(0.55F, 1.0F)};
   private final crc.b[] q = new crc.b[]{crc.b.a(-1.0F, -0.35F), crc.b.a(-0.35F, -0.1F), crc.b.a(-0.1F, 0.1F), crc.b.a(0.1F, 0.3F), crc.b.a(0.3F, 1.0F)};
   private final crc.b[] r = new crc.b[]{
      crc.b.a(-1.0F, -0.78F),
      crc.b.a(-0.78F, -0.375F),
      crc.b.a(-0.375F, -0.2225F),
      crc.b.a(-0.2225F, 0.05F),
      crc.b.a(0.05F, 0.45F),
      crc.b.a(0.45F, 0.55F),
      crc.b.a(0.55F, 1.0F)
   };
   private final crc.b s = this.p[0];
   private final crc.b t = crc.b.a(this.p[1], this.p[4]);
   private final crc.b u = crc.b.a(-1.2F, -1.05F);
   private final crc.b v = crc.b.a(-1.05F, -0.455F);
   private final crc.b w = crc.b.a(-0.455F, -0.19F);
   private final crc.b x = crc.b.a(-0.19F, -0.11F);
   private final crc.b y = crc.b.a(-0.11F, 0.55F);
   private final crc.b z = crc.b.a(-0.11F, 0.03F);
   private final crc.b A = crc.b.a(0.03F, 0.3F);
   private final crc.b B = crc.b.a(0.3F, 1.0F);
   private final aev<cqt>[][] C = new aev[][]{{cra.X, cra.V, cra.T, cra.R, cra.P}, {cra.W, cra.U, cra.S, cra.Q, cra.P}};
   private final aev<cqt>[][] D = new aev[][]{
      {cra.d, cra.d, cra.d, cra.q, cra.p},
      {cra.b, cra.b, cra.i, cra.p, cra.o},
      {cra.j, cra.b, cra.i, cra.k, cra.l},
      {cra.r, cra.r, cra.i, cra.x, cra.x},
      {cra.f, cra.f, cra.f, cra.f, cra.f}
   };
   private final aev<cqt>[][] E = new aev[][]{
      {cra.e, null, cra.q, null, null},
      {null, null, null, null, cra.n},
      {cra.c, null, null, cra.m, null},
      {null, null, cra.b, cra.y, cra.z},
      {null, null, null, null, null}
   };
   private final aev<cqt>[][] F = new aev[][]{
      {cra.d, cra.d, cra.d, cra.q, cra.q},
      {cra.D, cra.D, cra.i, cra.p, cra.o},
      {cra.D, cra.D, cra.D, cra.D, cra.l},
      {cra.s, cra.s, cra.i, cra.i, cra.x},
      {cra.A, cra.A, cra.A, cra.C, cra.C}
   };
   private final aev<cqt>[][] G = new aev[][]{
      {cra.e, null, null, null, null},
      {cra.E, null, cra.D, cra.D, cra.n},
      {cra.E, cra.E, cra.i, cra.k, null},
      {null, null, null, null, null},
      {cra.B, cra.B, null, null, null}
   };
   private final aev<cqt>[][] H = new aev[][]{
      {cra.u, cra.u, cra.t, cra.v, cra.v},
      {cra.u, cra.u, cra.t, cra.v, cra.v},
      {cra.t, cra.t, cra.t, cra.v, cra.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<crc.d> a() {
      crc.b $$0 = crc.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new crc.d(this.o, this.o, crc.b.a(this.y, this.o), this.o, $$0, crc.b.a(-1.0F, -0.16F), 0L),
         new crc.d(this.o, this.o, crc.b.a(this.y, this.o), this.o, $$0, crc.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<crc.d, aev<cqt>>> $$0) {
      if (aa.aq) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<crc.d, aev<cqt>>> $$0) {
      hg.b $$1 = mh.a();
      hf<dkl> $$2 = $$1.b(jc.at);
      dkm.w.a $$3 = new dkm.w.a($$2.b(dkz.d));
      dkm.w.a $$4 = new dkm.w.a($$2.b(dkz.e));
      dkm.w.a $$5 = new dkm.w.a($$2.b(dkz.g));
      $$0.accept(Pair.of(crc.a(this.o, this.o, this.o, this.o, crc.b.a(0.0F), this.o, 0.01F), cra.b));
      if (og.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, asv.a) instanceof ara.e<?, ?> $$7) {
         aev<cqt> $$8 = cra.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(crc.a(this.o, this.o, this.o, crc.b.a($$9), crc.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == cra.f ? cra.A : cra.f;
         }
      }

      if (og.a($$3, $$4, $$5, false) instanceof ara.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(crc.a(this.o, this.o, crc.b.a($$12), this.o, crc.b.a(0.0F), this.o, 0.0F), cra.q));
         }
      }
   }

   private void c(Consumer<Pair<crc.d, aev<cqt>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, cra.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         crc.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<crc.d, aev<cqt>>> $$0) {
      this.c($$0, crc.b.a(-1.0F, -0.93333334F));
      this.b($$0, crc.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, crc.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, crc.b.a(-0.56666666F, -0.4F));
      this.c($$0, crc.b.a(-0.4F, -0.26666668F));
      this.d($$0, crc.b.a(-0.26666668F, -0.05F));
      this.e($$0, crc.b.a(-0.05F, 0.05F));
      this.d($$0, crc.b.a(0.05F, 0.26666668F));
      this.c($$0, crc.b.a(0.26666668F, 0.4F));
      this.b($$0, crc.b.a(0.4F, 0.56666666F));
      this.a($$0, crc.b.a(0.56666666F, 0.7666667F));
      this.b($$0, crc.b.a(0.7666667F, 0.93333334F));
      this.c($$0, crc.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<crc.d, aev<cqt>>> $$0, crc.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         crc.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            crc.b $$5 = this.q[$$4];
            aev<cqt> $$6 = this.a($$2, $$4, $$1);
            aev<cqt> $$7 = this.b($$2, $$4, $$1);
            aev<cqt> $$8 = this.c($$2, $$4, $$1);
            aev<cqt> $$9 = this.e($$2, $$4, $$1);
            aev<cqt> $$10 = this.h($$2, $$4, $$1);
            aev<cqt> $$11 = this.a($$2, $$4, $$1, $$10);
            aev<cqt> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, crc.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, crc.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, crc.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, crc.b.a(this.x, this.z), crc.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, crc.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, crc.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, crc.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, crc.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, crc.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<crc.d, aev<cqt>>> $$0, crc.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         crc.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            crc.b $$5 = this.q[$$4];
            aev<cqt> $$6 = this.a($$2, $$4, $$1);
            aev<cqt> $$7 = this.b($$2, $$4, $$1);
            aev<cqt> $$8 = this.c($$2, $$4, $$1);
            aev<cqt> $$9 = this.e($$2, $$4, $$1);
            aev<cqt> $$10 = this.h($$2, $$4, $$1);
            aev<cqt> $$11 = this.a($$2, $$4, $$1, $$6);
            aev<cqt> $$12 = this.g($$2, $$4, $$1);
            aev<cqt> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, crc.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, crc.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, crc.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, crc.b.a(this.x, this.z), crc.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, crc.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, crc.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, crc.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, crc.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, crc.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<crc.d, aev<cqt>>> $$0, crc.b $$1) {
      this.a($$0, this.o, this.o, this.x, crc.b.a(this.r[0], this.r[2]), $$1, 0.0F, cra.O);
      this.a($$0, crc.b.a(this.p[1], this.p[2]), this.o, crc.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cra.g);
      this.a($$0, crc.b.a(this.p[3], this.p[4]), this.o, crc.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cra.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         crc.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            crc.b $$5 = this.q[$$4];
            aev<cqt> $$6 = this.a($$2, $$4, $$1);
            aev<cqt> $$7 = this.b($$2, $$4, $$1);
            aev<cqt> $$8 = this.c($$2, $$4, $$1);
            aev<cqt> $$9 = this.h($$2, $$4, $$1);
            aev<cqt> $$10 = this.e($$2, $$4, $$1);
            aev<cqt> $$11 = this.a($$2, $$4);
            aev<cqt> $$12 = this.a($$2, $$4, $$1, $$6);
            aev<cqt> $$13 = this.d($$2, $$4, $$1);
            aev<cqt> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, crc.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, crc.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, crc.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, crc.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, crc.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, crc.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, crc.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, crc.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<crc.d, aev<cqt>>> $$0, crc.b $$1) {
      this.a($$0, this.o, this.o, this.x, crc.b.a(this.r[0], this.r[2]), $$1, 0.0F, cra.O);
      this.a($$0, crc.b.a(this.p[1], this.p[2]), this.o, crc.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cra.g);
      this.a($$0, crc.b.a(this.p[3], this.p[4]), this.o, crc.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cra.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         crc.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            crc.b $$5 = this.q[$$4];
            aev<cqt> $$6 = this.a($$2, $$4, $$1);
            aev<cqt> $$7 = this.b($$2, $$4, $$1);
            aev<cqt> $$8 = this.c($$2, $$4, $$1);
            aev<cqt> $$9 = this.a($$2, $$4);
            aev<cqt> $$10 = this.a($$2, $$4, $$1, $$6);
            aev<cqt> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, crc.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, crc.b.a(this.A, this.B), crc.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, crc.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, crc.b.a(this.A, this.B), crc.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, crc.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, crc.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, crc.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, crc.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<crc.d, aev<cqt>>> $$0, crc.b $$1) {
      this.a($$0, this.s, this.o, this.x, crc.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cra.O : cra.L);
      this.a($$0, this.t, this.o, this.x, crc.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cra.O : cra.K);
      this.a($$0, this.s, this.o, this.z, crc.b.a(this.r[0], this.r[1]), $$1, 0.0F, cra.L);
      this.a($$0, this.t, this.o, this.z, crc.b.a(this.r[0], this.r[1]), $$1, 0.0F, cra.K);
      this.a($$0, this.s, this.o, crc.b.a(this.x, this.B), crc.b.a(this.r[2], this.r[5]), $$1, 0.0F, cra.L);
      this.a($$0, this.t, this.o, crc.b.a(this.x, this.B), crc.b.a(this.r[2], this.r[5]), $$1, 0.0F, cra.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, cra.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, cra.K);
      this.a($$0, crc.b.a(this.p[1], this.p[2]), this.o, crc.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cra.g);
      this.a($$0, crc.b.a(this.p[3], this.p[4]), this.o, crc.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cra.h);
      this.a($$0, this.s, this.o, crc.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cra.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         crc.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            crc.b $$5 = this.q[$$4];
            aev<cqt> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, crc.b.a(this.A, this.B), crc.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<crc.d, aev<cqt>>> $$0) {
      this.b($$0, this.o, this.o, crc.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, cra.Z);
      this.b($$0, this.o, crc.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, cra.aa);
      this.c($$0, this.o, this.o, this.o, crc.b.a(this.r[0], this.r[1]), this.o, 0.0F, cra.ab);
   }

   private aev<cqt> a(int $$0, int $$1, crc.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         aev<cqt> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private aev<cqt> b(int $$0, int $$1, crc.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private aev<cqt> c(int $$0, int $$1, crc.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private aev<cqt> a(int $$0, int $$1, crc.b $$2, aev<cqt> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? cra.w : $$3;
   }

   private aev<cqt> d(int $$0, int $$1, crc.b $$2) {
      aev<cqt> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private aev<cqt> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return cra.N;
      } else {
         return $$0 == 4 ? cra.f : cra.M;
      }
   }

   private aev<cqt> a(int $$0, crc.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? cra.A : cra.B;
      } else {
         return $$0 < 3 ? cra.A : cra.C;
      }
   }

   private aev<cqt> e(int $$0, int $$1, crc.b $$2) {
      if ($$2.b() >= 0L) {
         aev<cqt> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private aev<cqt> f(int $$0, int $$1, crc.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? cra.I : cra.H;
      } else {
         return $$0 == 3 ? cra.J : this.a($$1, $$2);
      }
   }

   private aev<cqt> g(int $$0, int $$1, crc.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? cra.G : cra.F;
      }
   }

   private aev<cqt> h(int $$0, int $$1, crc.b $$2) {
      aev<cqt> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<crc.d, aev<cqt>>> $$0, crc.b $$1, crc.b $$2, crc.b $$3, crc.b $$4, crc.b $$5, float $$6, aev<cqt> $$7) {
      $$0.accept(Pair.of(crc.a($$1, $$2, $$3, $$4, crc.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(crc.a($$1, $$2, $$3, $$4, crc.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<crc.d, aev<cqt>>> $$0, crc.b $$1, crc.b $$2, crc.b $$3, crc.b $$4, crc.b $$5, float $$6, aev<cqt> $$7) {
      $$0.accept(Pair.of(crc.a($$1, $$2, $$3, $$4, crc.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<crc.d, aev<cqt>>> $$0, crc.b $$1, crc.b $$2, crc.b $$3, crc.b $$4, crc.b $$5, float $$6, aev<cqt> $$7) {
      $$0.accept(Pair.of(crc.a($$1, $$2, $$3, $$4, crc.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dkl $$0, dkl $$1, dkl.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dkz.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dkz.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dkz.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dkz.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)crc.a((float)$$0);
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

   private static String a(double $$0, crc.b[] $$1) {
      double $$2 = (double)crc.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @asy
   public crc.b[] b() {
      return this.p;
   }

   @asy
   public crc.b[] c() {
      return this.q;
   }

   @asy
   public crc.b[] d() {
      return this.r;
   }

   @asy
   public crc.b[] e() {
      return new crc.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @asy
   public crc.b[] f() {
      return new crc.b[]{
         crc.b.a(-2.0F, dkz.a(0.05F)),
         crc.b.a(dkz.a(0.05F), dkz.a(0.26666668F)),
         crc.b.a(dkz.a(0.26666668F), dkz.a(0.4F)),
         crc.b.a(dkz.a(0.4F), dkz.a(0.56666666F)),
         crc.b.a(dkz.a(0.56666666F), 2.0F)
      };
   }

   @asy
   public crc.b[] g() {
      return new crc.b[]{crc.b.a(-2.0F, 0.0F), crc.b.a(0.0F, 2.0F)};
   }
}
