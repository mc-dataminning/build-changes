import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class cre {
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
   private final cqx.b o = cqx.b.a(-1.0F, 1.0F);
   private final cqx.b[] p = new cqx.b[]{cqx.b.a(-1.0F, -0.45F), cqx.b.a(-0.45F, -0.15F), cqx.b.a(-0.15F, 0.2F), cqx.b.a(0.2F, 0.55F), cqx.b.a(0.55F, 1.0F)};
   private final cqx.b[] q = new cqx.b[]{cqx.b.a(-1.0F, -0.35F), cqx.b.a(-0.35F, -0.1F), cqx.b.a(-0.1F, 0.1F), cqx.b.a(0.1F, 0.3F), cqx.b.a(0.3F, 1.0F)};
   private final cqx.b[] r = new cqx.b[]{
      cqx.b.a(-1.0F, -0.78F),
      cqx.b.a(-0.78F, -0.375F),
      cqx.b.a(-0.375F, -0.2225F),
      cqx.b.a(-0.2225F, 0.05F),
      cqx.b.a(0.05F, 0.45F),
      cqx.b.a(0.45F, 0.55F),
      cqx.b.a(0.55F, 1.0F)
   };
   private final cqx.b s = this.p[0];
   private final cqx.b t = cqx.b.a(this.p[1], this.p[4]);
   private final cqx.b u = cqx.b.a(-1.2F, -1.05F);
   private final cqx.b v = cqx.b.a(-1.05F, -0.455F);
   private final cqx.b w = cqx.b.a(-0.455F, -0.19F);
   private final cqx.b x = cqx.b.a(-0.19F, -0.11F);
   private final cqx.b y = cqx.b.a(-0.11F, 0.55F);
   private final cqx.b z = cqx.b.a(-0.11F, 0.03F);
   private final cqx.b A = cqx.b.a(0.03F, 0.3F);
   private final cqx.b B = cqx.b.a(0.3F, 1.0F);
   private final aet<cqo>[][] C = new aet[][]{{cqv.X, cqv.V, cqv.T, cqv.R, cqv.P}, {cqv.W, cqv.U, cqv.S, cqv.Q, cqv.P}};
   private final aet<cqo>[][] D = new aet[][]{
      {cqv.d, cqv.d, cqv.d, cqv.q, cqv.p},
      {cqv.b, cqv.b, cqv.i, cqv.p, cqv.o},
      {cqv.j, cqv.b, cqv.i, cqv.k, cqv.l},
      {cqv.r, cqv.r, cqv.i, cqv.x, cqv.x},
      {cqv.f, cqv.f, cqv.f, cqv.f, cqv.f}
   };
   private final aet<cqo>[][] E = new aet[][]{
      {cqv.e, null, cqv.q, null, null},
      {null, null, null, null, cqv.n},
      {cqv.c, null, null, cqv.m, null},
      {null, null, cqv.b, cqv.y, cqv.z},
      {null, null, null, null, null}
   };
   private final aet<cqo>[][] F = new aet[][]{
      {cqv.d, cqv.d, cqv.d, cqv.q, cqv.q},
      {cqv.D, cqv.D, cqv.i, cqv.p, cqv.o},
      {cqv.D, cqv.D, cqv.D, cqv.D, cqv.l},
      {cqv.s, cqv.s, cqv.i, cqv.i, cqv.x},
      {cqv.A, cqv.A, cqv.A, cqv.C, cqv.C}
   };
   private final aet<cqo>[][] G = new aet[][]{
      {cqv.e, null, null, null, null},
      {cqv.E, null, cqv.D, cqv.D, cqv.n},
      {cqv.E, cqv.E, cqv.i, cqv.k, null},
      {null, null, null, null, null},
      {cqv.B, cqv.B, null, null, null}
   };
   private final aet<cqo>[][] H = new aet[][]{
      {cqv.u, cqv.u, cqv.t, cqv.v, cqv.v},
      {cqv.u, cqv.u, cqv.t, cqv.v, cqv.v},
      {cqv.t, cqv.t, cqv.t, cqv.v, cqv.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<cqx.d> a() {
      cqx.b $$0 = cqx.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new cqx.d(this.o, this.o, cqx.b.a(this.y, this.o), this.o, $$0, cqx.b.a(-1.0F, -0.16F), 0L),
         new cqx.d(this.o, this.o, cqx.b.a(this.y, this.o), this.o, $$0, cqx.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<cqx.d, aet<cqo>>> $$0) {
      if (aa.ap) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<cqx.d, aet<cqo>>> $$0) {
      hi.b $$1 = mh.a();
      hh<dkg> $$2 = $$1.b(je.at);
      dkh.w.a $$3 = new dkh.w.a($$2.b(dku.d));
      dkh.w.a $$4 = new dkh.w.a($$2.b(dku.e));
      dkh.w.a $$5 = new dkh.w.a($$2.b(dku.g));
      $$0.accept(Pair.of(cqx.a(this.o, this.o, this.o, this.o, cqx.b.a(0.0F), this.o, 0.01F), cqv.b));
      if (oe.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, asq.a) instanceof aqw.e<?, ?> $$7) {
         aet<cqo> $$8 = cqv.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(cqx.a(this.o, this.o, this.o, cqx.b.a($$9), cqx.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == cqv.f ? cqv.A : cqv.f;
         }
      }

      if (oe.a($$3, $$4, $$5, false) instanceof aqw.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(cqx.a(this.o, this.o, cqx.b.a($$12), this.o, cqx.b.a(0.0F), this.o, 0.0F), cqv.q));
         }
      }
   }

   private void c(Consumer<Pair<cqx.d, aet<cqo>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, cqv.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         cqx.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<cqx.d, aet<cqo>>> $$0) {
      this.c($$0, cqx.b.a(-1.0F, -0.93333334F));
      this.b($$0, cqx.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, cqx.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, cqx.b.a(-0.56666666F, -0.4F));
      this.c($$0, cqx.b.a(-0.4F, -0.26666668F));
      this.d($$0, cqx.b.a(-0.26666668F, -0.05F));
      this.e($$0, cqx.b.a(-0.05F, 0.05F));
      this.d($$0, cqx.b.a(0.05F, 0.26666668F));
      this.c($$0, cqx.b.a(0.26666668F, 0.4F));
      this.b($$0, cqx.b.a(0.4F, 0.56666666F));
      this.a($$0, cqx.b.a(0.56666666F, 0.7666667F));
      this.b($$0, cqx.b.a(0.7666667F, 0.93333334F));
      this.c($$0, cqx.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<cqx.d, aet<cqo>>> $$0, cqx.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cqx.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cqx.b $$5 = this.q[$$4];
            aet<cqo> $$6 = this.a($$2, $$4, $$1);
            aet<cqo> $$7 = this.b($$2, $$4, $$1);
            aet<cqo> $$8 = this.c($$2, $$4, $$1);
            aet<cqo> $$9 = this.e($$2, $$4, $$1);
            aet<cqo> $$10 = this.h($$2, $$4, $$1);
            aet<cqo> $$11 = this.a($$2, $$4, $$1, $$10);
            aet<cqo> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cqx.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cqx.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cqx.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cqx.b.a(this.x, this.z), cqx.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqx.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cqx.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqx.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cqx.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cqx.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<cqx.d, aet<cqo>>> $$0, cqx.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cqx.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cqx.b $$5 = this.q[$$4];
            aet<cqo> $$6 = this.a($$2, $$4, $$1);
            aet<cqo> $$7 = this.b($$2, $$4, $$1);
            aet<cqo> $$8 = this.c($$2, $$4, $$1);
            aet<cqo> $$9 = this.e($$2, $$4, $$1);
            aet<cqo> $$10 = this.h($$2, $$4, $$1);
            aet<cqo> $$11 = this.a($$2, $$4, $$1, $$6);
            aet<cqo> $$12 = this.g($$2, $$4, $$1);
            aet<cqo> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, cqx.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cqx.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cqx.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cqx.b.a(this.x, this.z), cqx.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqx.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cqx.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqx.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cqx.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cqx.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<cqx.d, aet<cqo>>> $$0, cqx.b $$1) {
      this.a($$0, this.o, this.o, this.x, cqx.b.a(this.r[0], this.r[2]), $$1, 0.0F, cqv.O);
      this.a($$0, cqx.b.a(this.p[1], this.p[2]), this.o, cqx.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cqv.g);
      this.a($$0, cqx.b.a(this.p[3], this.p[4]), this.o, cqx.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cqv.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cqx.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cqx.b $$5 = this.q[$$4];
            aet<cqo> $$6 = this.a($$2, $$4, $$1);
            aet<cqo> $$7 = this.b($$2, $$4, $$1);
            aet<cqo> $$8 = this.c($$2, $$4, $$1);
            aet<cqo> $$9 = this.h($$2, $$4, $$1);
            aet<cqo> $$10 = this.e($$2, $$4, $$1);
            aet<cqo> $$11 = this.a($$2, $$4);
            aet<cqo> $$12 = this.a($$2, $$4, $$1, $$6);
            aet<cqo> $$13 = this.d($$2, $$4, $$1);
            aet<cqo> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cqx.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, cqx.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cqx.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqx.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, cqx.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, cqx.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cqx.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cqx.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<cqx.d, aet<cqo>>> $$0, cqx.b $$1) {
      this.a($$0, this.o, this.o, this.x, cqx.b.a(this.r[0], this.r[2]), $$1, 0.0F, cqv.O);
      this.a($$0, cqx.b.a(this.p[1], this.p[2]), this.o, cqx.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cqv.g);
      this.a($$0, cqx.b.a(this.p[3], this.p[4]), this.o, cqx.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cqv.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cqx.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cqx.b $$5 = this.q[$$4];
            aet<cqo> $$6 = this.a($$2, $$4, $$1);
            aet<cqo> $$7 = this.b($$2, $$4, $$1);
            aet<cqo> $$8 = this.c($$2, $$4, $$1);
            aet<cqo> $$9 = this.a($$2, $$4);
            aet<cqo> $$10 = this.a($$2, $$4, $$1, $$6);
            aet<cqo> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, cqx.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, cqx.b.a(this.A, this.B), cqx.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, cqx.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cqx.b.a(this.A, this.B), cqx.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, cqx.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cqx.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cqx.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cqx.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<cqx.d, aet<cqo>>> $$0, cqx.b $$1) {
      this.a($$0, this.s, this.o, this.x, cqx.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cqv.O : cqv.L);
      this.a($$0, this.t, this.o, this.x, cqx.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cqv.O : cqv.K);
      this.a($$0, this.s, this.o, this.z, cqx.b.a(this.r[0], this.r[1]), $$1, 0.0F, cqv.L);
      this.a($$0, this.t, this.o, this.z, cqx.b.a(this.r[0], this.r[1]), $$1, 0.0F, cqv.K);
      this.a($$0, this.s, this.o, cqx.b.a(this.x, this.B), cqx.b.a(this.r[2], this.r[5]), $$1, 0.0F, cqv.L);
      this.a($$0, this.t, this.o, cqx.b.a(this.x, this.B), cqx.b.a(this.r[2], this.r[5]), $$1, 0.0F, cqv.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, cqv.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, cqv.K);
      this.a($$0, cqx.b.a(this.p[1], this.p[2]), this.o, cqx.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cqv.g);
      this.a($$0, cqx.b.a(this.p[3], this.p[4]), this.o, cqx.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cqv.h);
      this.a($$0, this.s, this.o, cqx.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cqv.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cqx.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cqx.b $$5 = this.q[$$4];
            aet<cqo> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cqx.b.a(this.A, this.B), cqx.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<cqx.d, aet<cqo>>> $$0) {
      this.b($$0, this.o, this.o, cqx.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, cqv.Z);
      this.b($$0, this.o, cqx.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, cqv.aa);
      this.c($$0, this.o, this.o, this.o, cqx.b.a(this.r[0], this.r[1]), this.o, 0.0F, cqv.ab);
   }

   private aet<cqo> a(int $$0, int $$1, cqx.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         aet<cqo> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private aet<cqo> b(int $$0, int $$1, cqx.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private aet<cqo> c(int $$0, int $$1, cqx.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private aet<cqo> a(int $$0, int $$1, cqx.b $$2, aet<cqo> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? cqv.w : $$3;
   }

   private aet<cqo> d(int $$0, int $$1, cqx.b $$2) {
      aet<cqo> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private aet<cqo> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return cqv.N;
      } else {
         return $$0 == 4 ? cqv.f : cqv.M;
      }
   }

   private aet<cqo> a(int $$0, cqx.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? cqv.A : cqv.B;
      } else {
         return $$0 < 3 ? cqv.A : cqv.C;
      }
   }

   private aet<cqo> e(int $$0, int $$1, cqx.b $$2) {
      if ($$2.b() >= 0L) {
         aet<cqo> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private aet<cqo> f(int $$0, int $$1, cqx.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? cqv.I : cqv.H;
      } else {
         return $$0 == 3 ? cqv.J : this.a($$1, $$2);
      }
   }

   private aet<cqo> g(int $$0, int $$1, cqx.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? cqv.G : cqv.F;
      }
   }

   private aet<cqo> h(int $$0, int $$1, cqx.b $$2) {
      aet<cqo> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<cqx.d, aet<cqo>>> $$0, cqx.b $$1, cqx.b $$2, cqx.b $$3, cqx.b $$4, cqx.b $$5, float $$6, aet<cqo> $$7) {
      $$0.accept(Pair.of(cqx.a($$1, $$2, $$3, $$4, cqx.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(cqx.a($$1, $$2, $$3, $$4, cqx.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<cqx.d, aet<cqo>>> $$0, cqx.b $$1, cqx.b $$2, cqx.b $$3, cqx.b $$4, cqx.b $$5, float $$6, aet<cqo> $$7) {
      $$0.accept(Pair.of(cqx.a($$1, $$2, $$3, $$4, cqx.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<cqx.d, aet<cqo>>> $$0, cqx.b $$1, cqx.b $$2, cqx.b $$3, cqx.b $$4, cqx.b $$5, float $$6, aet<cqo> $$7) {
      $$0.accept(Pair.of(cqx.a($$1, $$2, $$3, $$4, cqx.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dkg $$0, dkg $$1, dkg.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dku.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dku.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dku.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dku.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)cqx.a((float)$$0);
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

   private static String a(double $$0, cqx.b[] $$1) {
      double $$2 = (double)cqx.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @ast
   public cqx.b[] b() {
      return this.p;
   }

   @ast
   public cqx.b[] c() {
      return this.q;
   }

   @ast
   public cqx.b[] d() {
      return this.r;
   }

   @ast
   public cqx.b[] e() {
      return new cqx.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @ast
   public cqx.b[] f() {
      return new cqx.b[]{
         cqx.b.a(-2.0F, dku.a(0.05F)),
         cqx.b.a(dku.a(0.05F), dku.a(0.26666668F)),
         cqx.b.a(dku.a(0.26666668F), dku.a(0.4F)),
         cqx.b.a(dku.a(0.4F), dku.a(0.56666666F)),
         cqx.b.a(dku.a(0.56666666F), 2.0F)
      };
   }

   @ast
   public cqx.b[] g() {
      return new cqx.b[]{cqx.b.a(-2.0F, 0.0F), cqx.b.a(0.0F, 2.0F)};
   }
}
