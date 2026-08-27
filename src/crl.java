import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class crl {
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
   private final cre.b o = cre.b.a(-1.0F, 1.0F);
   private final cre.b[] p = new cre.b[]{cre.b.a(-1.0F, -0.45F), cre.b.a(-0.45F, -0.15F), cre.b.a(-0.15F, 0.2F), cre.b.a(0.2F, 0.55F), cre.b.a(0.55F, 1.0F)};
   private final cre.b[] q = new cre.b[]{cre.b.a(-1.0F, -0.35F), cre.b.a(-0.35F, -0.1F), cre.b.a(-0.1F, 0.1F), cre.b.a(0.1F, 0.3F), cre.b.a(0.3F, 1.0F)};
   private final cre.b[] r = new cre.b[]{
      cre.b.a(-1.0F, -0.78F),
      cre.b.a(-0.78F, -0.375F),
      cre.b.a(-0.375F, -0.2225F),
      cre.b.a(-0.2225F, 0.05F),
      cre.b.a(0.05F, 0.45F),
      cre.b.a(0.45F, 0.55F),
      cre.b.a(0.55F, 1.0F)
   };
   private final cre.b s = this.p[0];
   private final cre.b t = cre.b.a(this.p[1], this.p[4]);
   private final cre.b u = cre.b.a(-1.2F, -1.05F);
   private final cre.b v = cre.b.a(-1.05F, -0.455F);
   private final cre.b w = cre.b.a(-0.455F, -0.19F);
   private final cre.b x = cre.b.a(-0.19F, -0.11F);
   private final cre.b y = cre.b.a(-0.11F, 0.55F);
   private final cre.b z = cre.b.a(-0.11F, 0.03F);
   private final cre.b A = cre.b.a(0.03F, 0.3F);
   private final cre.b B = cre.b.a(0.3F, 1.0F);
   private final aex<cqv>[][] C = new aex[][]{{crc.X, crc.V, crc.T, crc.R, crc.P}, {crc.W, crc.U, crc.S, crc.Q, crc.P}};
   private final aex<cqv>[][] D = new aex[][]{
      {crc.d, crc.d, crc.d, crc.q, crc.p},
      {crc.b, crc.b, crc.i, crc.p, crc.o},
      {crc.j, crc.b, crc.i, crc.k, crc.l},
      {crc.r, crc.r, crc.i, crc.x, crc.x},
      {crc.f, crc.f, crc.f, crc.f, crc.f}
   };
   private final aex<cqv>[][] E = new aex[][]{
      {crc.e, null, crc.q, null, null},
      {null, null, null, null, crc.n},
      {crc.c, null, null, crc.m, null},
      {null, null, crc.b, crc.y, crc.z},
      {null, null, null, null, null}
   };
   private final aex<cqv>[][] F = new aex[][]{
      {crc.d, crc.d, crc.d, crc.q, crc.q},
      {crc.D, crc.D, crc.i, crc.p, crc.o},
      {crc.D, crc.D, crc.D, crc.D, crc.l},
      {crc.s, crc.s, crc.i, crc.i, crc.x},
      {crc.A, crc.A, crc.A, crc.C, crc.C}
   };
   private final aex<cqv>[][] G = new aex[][]{
      {crc.e, null, null, null, null},
      {crc.E, null, crc.D, crc.D, crc.n},
      {crc.E, crc.E, crc.i, crc.k, null},
      {null, null, null, null, null},
      {crc.B, crc.B, null, null, null}
   };
   private final aex<cqv>[][] H = new aex[][]{
      {crc.u, crc.u, crc.t, crc.v, crc.v},
      {crc.u, crc.u, crc.t, crc.v, crc.v},
      {crc.t, crc.t, crc.t, crc.v, crc.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<cre.d> a() {
      cre.b $$0 = cre.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new cre.d(this.o, this.o, cre.b.a(this.y, this.o), this.o, $$0, cre.b.a(-1.0F, -0.16F), 0L),
         new cre.d(this.o, this.o, cre.b.a(this.y, this.o), this.o, $$0, cre.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<cre.d, aex<cqv>>> $$0) {
      if (aa.aq) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<cre.d, aex<cqv>>> $$0) {
      hi.b $$1 = mj.a();
      hh<dkn> $$2 = $$1.b(je.at);
      dko.w.a $$3 = new dko.w.a($$2.b(dlb.d));
      dko.w.a $$4 = new dko.w.a($$2.b(dlb.e));
      dko.w.a $$5 = new dko.w.a($$2.b(dlb.g));
      $$0.accept(Pair.of(cre.a(this.o, this.o, this.o, this.o, cre.b.a(0.0F), this.o, 0.01F), crc.b));
      if (oi.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, asx.a) instanceof arc.e<?, ?> $$7) {
         aex<cqv> $$8 = crc.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(cre.a(this.o, this.o, this.o, cre.b.a($$9), cre.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == crc.f ? crc.A : crc.f;
         }
      }

      if (oi.a($$3, $$4, $$5, false) instanceof arc.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(cre.a(this.o, this.o, cre.b.a($$12), this.o, cre.b.a(0.0F), this.o, 0.0F), crc.q));
         }
      }
   }

   private void c(Consumer<Pair<cre.d, aex<cqv>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, crc.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         cre.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<cre.d, aex<cqv>>> $$0) {
      this.c($$0, cre.b.a(-1.0F, -0.93333334F));
      this.b($$0, cre.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, cre.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, cre.b.a(-0.56666666F, -0.4F));
      this.c($$0, cre.b.a(-0.4F, -0.26666668F));
      this.d($$0, cre.b.a(-0.26666668F, -0.05F));
      this.e($$0, cre.b.a(-0.05F, 0.05F));
      this.d($$0, cre.b.a(0.05F, 0.26666668F));
      this.c($$0, cre.b.a(0.26666668F, 0.4F));
      this.b($$0, cre.b.a(0.4F, 0.56666666F));
      this.a($$0, cre.b.a(0.56666666F, 0.7666667F));
      this.b($$0, cre.b.a(0.7666667F, 0.93333334F));
      this.c($$0, cre.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<cre.d, aex<cqv>>> $$0, cre.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cre.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cre.b $$5 = this.q[$$4];
            aex<cqv> $$6 = this.a($$2, $$4, $$1);
            aex<cqv> $$7 = this.b($$2, $$4, $$1);
            aex<cqv> $$8 = this.c($$2, $$4, $$1);
            aex<cqv> $$9 = this.e($$2, $$4, $$1);
            aex<cqv> $$10 = this.h($$2, $$4, $$1);
            aex<cqv> $$11 = this.a($$2, $$4, $$1, $$10);
            aex<cqv> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cre.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cre.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cre.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cre.b.a(this.x, this.z), cre.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cre.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cre.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cre.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cre.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cre.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<cre.d, aex<cqv>>> $$0, cre.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cre.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cre.b $$5 = this.q[$$4];
            aex<cqv> $$6 = this.a($$2, $$4, $$1);
            aex<cqv> $$7 = this.b($$2, $$4, $$1);
            aex<cqv> $$8 = this.c($$2, $$4, $$1);
            aex<cqv> $$9 = this.e($$2, $$4, $$1);
            aex<cqv> $$10 = this.h($$2, $$4, $$1);
            aex<cqv> $$11 = this.a($$2, $$4, $$1, $$6);
            aex<cqv> $$12 = this.g($$2, $$4, $$1);
            aex<cqv> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, cre.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cre.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cre.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cre.b.a(this.x, this.z), cre.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cre.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cre.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cre.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cre.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cre.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<cre.d, aex<cqv>>> $$0, cre.b $$1) {
      this.a($$0, this.o, this.o, this.x, cre.b.a(this.r[0], this.r[2]), $$1, 0.0F, crc.O);
      this.a($$0, cre.b.a(this.p[1], this.p[2]), this.o, cre.b.a(this.z, this.B), this.r[6], $$1, 0.0F, crc.g);
      this.a($$0, cre.b.a(this.p[3], this.p[4]), this.o, cre.b.a(this.z, this.B), this.r[6], $$1, 0.0F, crc.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cre.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cre.b $$5 = this.q[$$4];
            aex<cqv> $$6 = this.a($$2, $$4, $$1);
            aex<cqv> $$7 = this.b($$2, $$4, $$1);
            aex<cqv> $$8 = this.c($$2, $$4, $$1);
            aex<cqv> $$9 = this.h($$2, $$4, $$1);
            aex<cqv> $$10 = this.e($$2, $$4, $$1);
            aex<cqv> $$11 = this.a($$2, $$4);
            aex<cqv> $$12 = this.a($$2, $$4, $$1, $$6);
            aex<cqv> $$13 = this.d($$2, $$4, $$1);
            aex<cqv> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cre.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, cre.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cre.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cre.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, cre.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, cre.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cre.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cre.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<cre.d, aex<cqv>>> $$0, cre.b $$1) {
      this.a($$0, this.o, this.o, this.x, cre.b.a(this.r[0], this.r[2]), $$1, 0.0F, crc.O);
      this.a($$0, cre.b.a(this.p[1], this.p[2]), this.o, cre.b.a(this.z, this.B), this.r[6], $$1, 0.0F, crc.g);
      this.a($$0, cre.b.a(this.p[3], this.p[4]), this.o, cre.b.a(this.z, this.B), this.r[6], $$1, 0.0F, crc.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cre.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cre.b $$5 = this.q[$$4];
            aex<cqv> $$6 = this.a($$2, $$4, $$1);
            aex<cqv> $$7 = this.b($$2, $$4, $$1);
            aex<cqv> $$8 = this.c($$2, $$4, $$1);
            aex<cqv> $$9 = this.a($$2, $$4);
            aex<cqv> $$10 = this.a($$2, $$4, $$1, $$6);
            aex<cqv> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, cre.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, cre.b.a(this.A, this.B), cre.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, cre.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cre.b.a(this.A, this.B), cre.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, cre.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cre.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cre.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cre.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<cre.d, aex<cqv>>> $$0, cre.b $$1) {
      this.a($$0, this.s, this.o, this.x, cre.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? crc.O : crc.L);
      this.a($$0, this.t, this.o, this.x, cre.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? crc.O : crc.K);
      this.a($$0, this.s, this.o, this.z, cre.b.a(this.r[0], this.r[1]), $$1, 0.0F, crc.L);
      this.a($$0, this.t, this.o, this.z, cre.b.a(this.r[0], this.r[1]), $$1, 0.0F, crc.K);
      this.a($$0, this.s, this.o, cre.b.a(this.x, this.B), cre.b.a(this.r[2], this.r[5]), $$1, 0.0F, crc.L);
      this.a($$0, this.t, this.o, cre.b.a(this.x, this.B), cre.b.a(this.r[2], this.r[5]), $$1, 0.0F, crc.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, crc.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, crc.K);
      this.a($$0, cre.b.a(this.p[1], this.p[2]), this.o, cre.b.a(this.y, this.B), this.r[6], $$1, 0.0F, crc.g);
      this.a($$0, cre.b.a(this.p[3], this.p[4]), this.o, cre.b.a(this.y, this.B), this.r[6], $$1, 0.0F, crc.h);
      this.a($$0, this.s, this.o, cre.b.a(this.y, this.B), this.r[6], $$1, 0.0F, crc.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cre.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cre.b $$5 = this.q[$$4];
            aex<cqv> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cre.b.a(this.A, this.B), cre.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<cre.d, aex<cqv>>> $$0) {
      this.b($$0, this.o, this.o, cre.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, crc.Z);
      this.b($$0, this.o, cre.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, crc.aa);
      this.c($$0, this.o, this.o, this.o, cre.b.a(this.r[0], this.r[1]), this.o, 0.0F, crc.ab);
   }

   private aex<cqv> a(int $$0, int $$1, cre.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         aex<cqv> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private aex<cqv> b(int $$0, int $$1, cre.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private aex<cqv> c(int $$0, int $$1, cre.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private aex<cqv> a(int $$0, int $$1, cre.b $$2, aex<cqv> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? crc.w : $$3;
   }

   private aex<cqv> d(int $$0, int $$1, cre.b $$2) {
      aex<cqv> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private aex<cqv> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return crc.N;
      } else {
         return $$0 == 4 ? crc.f : crc.M;
      }
   }

   private aex<cqv> a(int $$0, cre.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? crc.A : crc.B;
      } else {
         return $$0 < 3 ? crc.A : crc.C;
      }
   }

   private aex<cqv> e(int $$0, int $$1, cre.b $$2) {
      if ($$2.b() >= 0L) {
         aex<cqv> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private aex<cqv> f(int $$0, int $$1, cre.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? crc.I : crc.H;
      } else {
         return $$0 == 3 ? crc.J : this.a($$1, $$2);
      }
   }

   private aex<cqv> g(int $$0, int $$1, cre.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? crc.G : crc.F;
      }
   }

   private aex<cqv> h(int $$0, int $$1, cre.b $$2) {
      aex<cqv> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<cre.d, aex<cqv>>> $$0, cre.b $$1, cre.b $$2, cre.b $$3, cre.b $$4, cre.b $$5, float $$6, aex<cqv> $$7) {
      $$0.accept(Pair.of(cre.a($$1, $$2, $$3, $$4, cre.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(cre.a($$1, $$2, $$3, $$4, cre.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<cre.d, aex<cqv>>> $$0, cre.b $$1, cre.b $$2, cre.b $$3, cre.b $$4, cre.b $$5, float $$6, aex<cqv> $$7) {
      $$0.accept(Pair.of(cre.a($$1, $$2, $$3, $$4, cre.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<cre.d, aex<cqv>>> $$0, cre.b $$1, cre.b $$2, cre.b $$3, cre.b $$4, cre.b $$5, float $$6, aex<cqv> $$7) {
      $$0.accept(Pair.of(cre.a($$1, $$2, $$3, $$4, cre.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dkn $$0, dkn $$1, dkn.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dlb.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dlb.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dlb.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dlb.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)cre.a((float)$$0);
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

   private static String a(double $$0, cre.b[] $$1) {
      double $$2 = (double)cre.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @ata
   public cre.b[] b() {
      return this.p;
   }

   @ata
   public cre.b[] c() {
      return this.q;
   }

   @ata
   public cre.b[] d() {
      return this.r;
   }

   @ata
   public cre.b[] e() {
      return new cre.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @ata
   public cre.b[] f() {
      return new cre.b[]{
         cre.b.a(-2.0F, dlb.a(0.05F)),
         cre.b.a(dlb.a(0.05F), dlb.a(0.26666668F)),
         cre.b.a(dlb.a(0.26666668F), dlb.a(0.4F)),
         cre.b.a(dlb.a(0.4F), dlb.a(0.56666666F)),
         cre.b.a(dlb.a(0.56666666F), 2.0F)
      };
   }

   @ata
   public cre.b[] g() {
      return new cre.b[]{cre.b.a(-2.0F, 0.0F), cre.b.a(0.0F, 2.0F)};
   }
}
