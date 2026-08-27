import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class cto {
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
   private final cth.b o = cth.b.a(-1.0F, 1.0F);
   private final cth.b[] p = new cth.b[]{cth.b.a(-1.0F, -0.45F), cth.b.a(-0.45F, -0.15F), cth.b.a(-0.15F, 0.2F), cth.b.a(0.2F, 0.55F), cth.b.a(0.55F, 1.0F)};
   private final cth.b[] q = new cth.b[]{cth.b.a(-1.0F, -0.35F), cth.b.a(-0.35F, -0.1F), cth.b.a(-0.1F, 0.1F), cth.b.a(0.1F, 0.3F), cth.b.a(0.3F, 1.0F)};
   private final cth.b[] r = new cth.b[]{
      cth.b.a(-1.0F, -0.78F),
      cth.b.a(-0.78F, -0.375F),
      cth.b.a(-0.375F, -0.2225F),
      cth.b.a(-0.2225F, 0.05F),
      cth.b.a(0.05F, 0.45F),
      cth.b.a(0.45F, 0.55F),
      cth.b.a(0.55F, 1.0F)
   };
   private final cth.b s = this.p[0];
   private final cth.b t = cth.b.a(this.p[1], this.p[4]);
   private final cth.b u = cth.b.a(-1.2F, -1.05F);
   private final cth.b v = cth.b.a(-1.05F, -0.455F);
   private final cth.b w = cth.b.a(-0.455F, -0.19F);
   private final cth.b x = cth.b.a(-0.19F, -0.11F);
   private final cth.b y = cth.b.a(-0.11F, 0.55F);
   private final cth.b z = cth.b.a(-0.11F, 0.03F);
   private final cth.b A = cth.b.a(0.03F, 0.3F);
   private final cth.b B = cth.b.a(0.3F, 1.0F);
   private final agh<csy>[][] C = new agh[][]{{ctf.X, ctf.V, ctf.T, ctf.R, ctf.P}, {ctf.W, ctf.U, ctf.S, ctf.Q, ctf.P}};
   private final agh<csy>[][] D = new agh[][]{
      {ctf.d, ctf.d, ctf.d, ctf.q, ctf.p},
      {ctf.b, ctf.b, ctf.i, ctf.p, ctf.o},
      {ctf.j, ctf.b, ctf.i, ctf.k, ctf.l},
      {ctf.r, ctf.r, ctf.i, ctf.x, ctf.x},
      {ctf.f, ctf.f, ctf.f, ctf.f, ctf.f}
   };
   private final agh<csy>[][] E = new agh[][]{
      {ctf.e, null, ctf.q, null, null},
      {null, null, null, null, ctf.n},
      {ctf.c, null, null, ctf.m, null},
      {null, null, ctf.b, ctf.y, ctf.z},
      {null, null, null, null, null}
   };
   private final agh<csy>[][] F = new agh[][]{
      {ctf.d, ctf.d, ctf.d, ctf.q, ctf.q},
      {ctf.D, ctf.D, ctf.i, ctf.p, ctf.o},
      {ctf.D, ctf.D, ctf.D, ctf.D, ctf.l},
      {ctf.s, ctf.s, ctf.i, ctf.i, ctf.x},
      {ctf.A, ctf.A, ctf.A, ctf.C, ctf.C}
   };
   private final agh<csy>[][] G = new agh[][]{
      {ctf.e, null, null, null, null},
      {ctf.E, null, ctf.D, ctf.D, ctf.n},
      {ctf.E, ctf.E, ctf.i, ctf.k, null},
      {null, null, null, null, null},
      {ctf.B, ctf.B, null, null, null}
   };
   private final agh<csy>[][] H = new agh[][]{
      {ctf.u, ctf.u, ctf.t, ctf.v, ctf.v},
      {ctf.u, ctf.u, ctf.t, ctf.v, ctf.v},
      {ctf.t, ctf.t, ctf.t, ctf.v, ctf.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<cth.d> a() {
      cth.b $$0 = cth.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new cth.d(this.o, this.o, cth.b.a(this.y, this.o), this.o, $$0, cth.b.a(-1.0F, -0.16F), 0L),
         new cth.d(this.o, this.o, cth.b.a(this.y, this.o), this.o, $$0, cth.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<cth.d, agh<csy>>> $$0) {
      if (aa.aq) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<cth.d, agh<csy>>> $$0) {
      id.b $$1 = nj.a();
      ic<dmk> $$2 = $$1.b(jz.av);
      dml.w.a $$3 = new dml.w.a($$2.b(dmy.d));
      dml.w.a $$4 = new dml.w.a($$2.b(dmy.e));
      dml.w.a $$5 = new dml.w.a($$2.b(dmy.g));
      $$0.accept(Pair.of(cth.a(this.o, this.o, this.o, this.o, cth.b.a(0.0F), this.o, 0.01F), ctf.b));
      if (pk.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, aum.a) instanceof asp.e<?, ?> $$7) {
         agh<csy> $$8 = ctf.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(cth.a(this.o, this.o, this.o, cth.b.a($$9), cth.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == ctf.f ? ctf.A : ctf.f;
         }
      }

      if (pk.a($$3, $$4, $$5, false) instanceof asp.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(cth.a(this.o, this.o, cth.b.a($$12), this.o, cth.b.a(0.0F), this.o, 0.0F), ctf.q));
         }
      }
   }

   private void c(Consumer<Pair<cth.d, agh<csy>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, ctf.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         cth.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<cth.d, agh<csy>>> $$0) {
      this.c($$0, cth.b.a(-1.0F, -0.93333334F));
      this.b($$0, cth.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, cth.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, cth.b.a(-0.56666666F, -0.4F));
      this.c($$0, cth.b.a(-0.4F, -0.26666668F));
      this.d($$0, cth.b.a(-0.26666668F, -0.05F));
      this.e($$0, cth.b.a(-0.05F, 0.05F));
      this.d($$0, cth.b.a(0.05F, 0.26666668F));
      this.c($$0, cth.b.a(0.26666668F, 0.4F));
      this.b($$0, cth.b.a(0.4F, 0.56666666F));
      this.a($$0, cth.b.a(0.56666666F, 0.7666667F));
      this.b($$0, cth.b.a(0.7666667F, 0.93333334F));
      this.c($$0, cth.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<cth.d, agh<csy>>> $$0, cth.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cth.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cth.b $$5 = this.q[$$4];
            agh<csy> $$6 = this.a($$2, $$4, $$1);
            agh<csy> $$7 = this.b($$2, $$4, $$1);
            agh<csy> $$8 = this.c($$2, $$4, $$1);
            agh<csy> $$9 = this.e($$2, $$4, $$1);
            agh<csy> $$10 = this.h($$2, $$4, $$1);
            agh<csy> $$11 = this.a($$2, $$4, $$1, $$10);
            agh<csy> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cth.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cth.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cth.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cth.b.a(this.x, this.z), cth.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cth.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cth.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cth.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cth.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cth.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<cth.d, agh<csy>>> $$0, cth.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cth.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cth.b $$5 = this.q[$$4];
            agh<csy> $$6 = this.a($$2, $$4, $$1);
            agh<csy> $$7 = this.b($$2, $$4, $$1);
            agh<csy> $$8 = this.c($$2, $$4, $$1);
            agh<csy> $$9 = this.e($$2, $$4, $$1);
            agh<csy> $$10 = this.h($$2, $$4, $$1);
            agh<csy> $$11 = this.a($$2, $$4, $$1, $$6);
            agh<csy> $$12 = this.g($$2, $$4, $$1);
            agh<csy> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, cth.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cth.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cth.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cth.b.a(this.x, this.z), cth.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cth.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cth.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cth.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cth.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cth.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<cth.d, agh<csy>>> $$0, cth.b $$1) {
      this.a($$0, this.o, this.o, this.x, cth.b.a(this.r[0], this.r[2]), $$1, 0.0F, ctf.O);
      this.a($$0, cth.b.a(this.p[1], this.p[2]), this.o, cth.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ctf.g);
      this.a($$0, cth.b.a(this.p[3], this.p[4]), this.o, cth.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ctf.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cth.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cth.b $$5 = this.q[$$4];
            agh<csy> $$6 = this.a($$2, $$4, $$1);
            agh<csy> $$7 = this.b($$2, $$4, $$1);
            agh<csy> $$8 = this.c($$2, $$4, $$1);
            agh<csy> $$9 = this.h($$2, $$4, $$1);
            agh<csy> $$10 = this.e($$2, $$4, $$1);
            agh<csy> $$11 = this.a($$2, $$4);
            agh<csy> $$12 = this.a($$2, $$4, $$1, $$6);
            agh<csy> $$13 = this.d($$2, $$4, $$1);
            agh<csy> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cth.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, cth.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cth.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cth.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, cth.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, cth.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cth.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cth.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<cth.d, agh<csy>>> $$0, cth.b $$1) {
      this.a($$0, this.o, this.o, this.x, cth.b.a(this.r[0], this.r[2]), $$1, 0.0F, ctf.O);
      this.a($$0, cth.b.a(this.p[1], this.p[2]), this.o, cth.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ctf.g);
      this.a($$0, cth.b.a(this.p[3], this.p[4]), this.o, cth.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ctf.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cth.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cth.b $$5 = this.q[$$4];
            agh<csy> $$6 = this.a($$2, $$4, $$1);
            agh<csy> $$7 = this.b($$2, $$4, $$1);
            agh<csy> $$8 = this.c($$2, $$4, $$1);
            agh<csy> $$9 = this.a($$2, $$4);
            agh<csy> $$10 = this.a($$2, $$4, $$1, $$6);
            agh<csy> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, cth.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, cth.b.a(this.A, this.B), cth.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, cth.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cth.b.a(this.A, this.B), cth.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, cth.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cth.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cth.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cth.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<cth.d, agh<csy>>> $$0, cth.b $$1) {
      this.a($$0, this.s, this.o, this.x, cth.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? ctf.O : ctf.L);
      this.a($$0, this.t, this.o, this.x, cth.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? ctf.O : ctf.K);
      this.a($$0, this.s, this.o, this.z, cth.b.a(this.r[0], this.r[1]), $$1, 0.0F, ctf.L);
      this.a($$0, this.t, this.o, this.z, cth.b.a(this.r[0], this.r[1]), $$1, 0.0F, ctf.K);
      this.a($$0, this.s, this.o, cth.b.a(this.x, this.B), cth.b.a(this.r[2], this.r[5]), $$1, 0.0F, ctf.L);
      this.a($$0, this.t, this.o, cth.b.a(this.x, this.B), cth.b.a(this.r[2], this.r[5]), $$1, 0.0F, ctf.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, ctf.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, ctf.K);
      this.a($$0, cth.b.a(this.p[1], this.p[2]), this.o, cth.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ctf.g);
      this.a($$0, cth.b.a(this.p[3], this.p[4]), this.o, cth.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ctf.h);
      this.a($$0, this.s, this.o, cth.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ctf.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cth.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cth.b $$5 = this.q[$$4];
            agh<csy> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cth.b.a(this.A, this.B), cth.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<cth.d, agh<csy>>> $$0) {
      this.b($$0, this.o, this.o, cth.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, ctf.Z);
      this.b($$0, this.o, cth.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, ctf.aa);
      this.c($$0, this.o, this.o, this.o, cth.b.a(this.r[0], this.r[1]), this.o, 0.0F, ctf.ab);
   }

   private agh<csy> a(int $$0, int $$1, cth.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         agh<csy> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private agh<csy> b(int $$0, int $$1, cth.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private agh<csy> c(int $$0, int $$1, cth.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private agh<csy> a(int $$0, int $$1, cth.b $$2, agh<csy> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? ctf.w : $$3;
   }

   private agh<csy> d(int $$0, int $$1, cth.b $$2) {
      agh<csy> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private agh<csy> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return ctf.N;
      } else {
         return $$0 == 4 ? ctf.f : ctf.M;
      }
   }

   private agh<csy> a(int $$0, cth.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? ctf.A : ctf.B;
      } else {
         return $$0 < 3 ? ctf.A : ctf.C;
      }
   }

   private agh<csy> e(int $$0, int $$1, cth.b $$2) {
      if ($$2.b() >= 0L) {
         agh<csy> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private agh<csy> f(int $$0, int $$1, cth.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? ctf.I : ctf.H;
      } else {
         return $$0 == 3 ? ctf.J : this.a($$1, $$2);
      }
   }

   private agh<csy> g(int $$0, int $$1, cth.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? ctf.G : ctf.F;
      }
   }

   private agh<csy> h(int $$0, int $$1, cth.b $$2) {
      agh<csy> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<cth.d, agh<csy>>> $$0, cth.b $$1, cth.b $$2, cth.b $$3, cth.b $$4, cth.b $$5, float $$6, agh<csy> $$7) {
      $$0.accept(Pair.of(cth.a($$1, $$2, $$3, $$4, cth.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(cth.a($$1, $$2, $$3, $$4, cth.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<cth.d, agh<csy>>> $$0, cth.b $$1, cth.b $$2, cth.b $$3, cth.b $$4, cth.b $$5, float $$6, agh<csy> $$7) {
      $$0.accept(Pair.of(cth.a($$1, $$2, $$3, $$4, cth.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<cth.d, agh<csy>>> $$0, cth.b $$1, cth.b $$2, cth.b $$3, cth.b $$4, cth.b $$5, float $$6, agh<csy> $$7) {
      $$0.accept(Pair.of(cth.a($$1, $$2, $$3, $$4, cth.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dmk $$0, dmk $$1, dmk.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dmy.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dmy.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dmy.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dmy.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)cth.a((float)$$0);
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

   private static String a(double $$0, cth.b[] $$1) {
      double $$2 = (double)cth.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @aup
   public cth.b[] b() {
      return this.p;
   }

   @aup
   public cth.b[] c() {
      return this.q;
   }

   @aup
   public cth.b[] d() {
      return this.r;
   }

   @aup
   public cth.b[] e() {
      return new cth.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @aup
   public cth.b[] f() {
      return new cth.b[]{
         cth.b.a(-2.0F, dmy.a(0.05F)),
         cth.b.a(dmy.a(0.05F), dmy.a(0.26666668F)),
         cth.b.a(dmy.a(0.26666668F), dmy.a(0.4F)),
         cth.b.a(dmy.a(0.4F), dmy.a(0.56666666F)),
         cth.b.a(dmy.a(0.56666666F), 2.0F)
      };
   }

   @aup
   public cth.b[] g() {
      return new cth.b[]{cth.b.a(-2.0F, 0.0F), cth.b.a(0.0F, 2.0F)};
   }
}
