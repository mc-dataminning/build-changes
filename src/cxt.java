import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class cxt {
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
   private final cxm.b o = cxm.b.a(-1.0F, 1.0F);
   private final cxm.b[] p = new cxm.b[]{cxm.b.a(-1.0F, -0.45F), cxm.b.a(-0.45F, -0.15F), cxm.b.a(-0.15F, 0.2F), cxm.b.a(0.2F, 0.55F), cxm.b.a(0.55F, 1.0F)};
   private final cxm.b[] q = new cxm.b[]{cxm.b.a(-1.0F, -0.35F), cxm.b.a(-0.35F, -0.1F), cxm.b.a(-0.1F, 0.1F), cxm.b.a(0.1F, 0.3F), cxm.b.a(0.3F, 1.0F)};
   private final cxm.b[] r = new cxm.b[]{
      cxm.b.a(-1.0F, -0.78F),
      cxm.b.a(-0.78F, -0.375F),
      cxm.b.a(-0.375F, -0.2225F),
      cxm.b.a(-0.2225F, 0.05F),
      cxm.b.a(0.05F, 0.45F),
      cxm.b.a(0.45F, 0.55F),
      cxm.b.a(0.55F, 1.0F)
   };
   private final cxm.b s = this.p[0];
   private final cxm.b t = cxm.b.a(this.p[1], this.p[4]);
   private final cxm.b u = cxm.b.a(-1.2F, -1.05F);
   private final cxm.b v = cxm.b.a(-1.05F, -0.455F);
   private final cxm.b w = cxm.b.a(-0.455F, -0.19F);
   private final cxm.b x = cxm.b.a(-0.19F, -0.11F);
   private final cxm.b y = cxm.b.a(-0.11F, 0.55F);
   private final cxm.b z = cxm.b.a(-0.11F, 0.03F);
   private final cxm.b A = cxm.b.a(0.03F, 0.3F);
   private final cxm.b B = cxm.b.a(0.3F, 1.0F);
   private final ajb<cxd>[][] C = new ajb[][]{{cxk.X, cxk.V, cxk.T, cxk.R, cxk.P}, {cxk.W, cxk.U, cxk.S, cxk.Q, cxk.P}};
   private final ajb<cxd>[][] D = new ajb[][]{
      {cxk.d, cxk.d, cxk.d, cxk.q, cxk.p},
      {cxk.b, cxk.b, cxk.i, cxk.p, cxk.o},
      {cxk.j, cxk.b, cxk.i, cxk.k, cxk.l},
      {cxk.r, cxk.r, cxk.i, cxk.x, cxk.x},
      {cxk.f, cxk.f, cxk.f, cxk.f, cxk.f}
   };
   private final ajb<cxd>[][] E = new ajb[][]{
      {cxk.e, null, cxk.q, null, null},
      {null, null, null, null, cxk.n},
      {cxk.c, null, null, cxk.m, null},
      {null, null, cxk.b, cxk.y, cxk.z},
      {null, null, null, null, null}
   };
   private final ajb<cxd>[][] F = new ajb[][]{
      {cxk.d, cxk.d, cxk.d, cxk.q, cxk.q},
      {cxk.D, cxk.D, cxk.i, cxk.p, cxk.o},
      {cxk.D, cxk.D, cxk.D, cxk.D, cxk.l},
      {cxk.s, cxk.s, cxk.i, cxk.i, cxk.x},
      {cxk.A, cxk.A, cxk.A, cxk.C, cxk.C}
   };
   private final ajb<cxd>[][] G = new ajb[][]{
      {cxk.e, null, null, null, null},
      {cxk.E, null, cxk.D, cxk.D, cxk.n},
      {cxk.E, cxk.E, cxk.i, cxk.k, null},
      {null, null, null, null, null},
      {cxk.B, cxk.B, null, null, null}
   };
   private final ajb<cxd>[][] H = new ajb[][]{
      {cxk.u, cxk.u, cxk.t, cxk.v, cxk.v},
      {cxk.u, cxk.u, cxk.t, cxk.v, cxk.v},
      {cxk.t, cxk.t, cxk.t, cxk.v, cxk.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<cxm.d> a() {
      cxm.b $$0 = cxm.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new cxm.d(this.o, this.o, cxm.b.a(this.y, this.o), this.o, $$0, cxm.b.a(-1.0F, -0.16F), 0L),
         new cxm.d(this.o, this.o, cxm.b.a(this.y, this.o), this.o, $$0, cxm.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<cxm.d, ajb<cxd>>> $$0) {
      if (aa.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<cxm.d, ajb<cxd>>> $$0) {
      in.a $$1 = nt.a();
      im<drj> $$2 = $$1.b(ki.ay);
      drk.w.a $$3 = new drk.w.a($$2.b(drx.d));
      drk.w.a $$4 = new drk.w.a($$2.b(drx.e));
      drk.w.a $$5 = new drk.w.a($$2.b(drx.g));
      $$0.accept(Pair.of(cxm.a(this.o, this.o, this.o, this.o, cxm.b.a(0.0F), this.o, 0.01F), cxk.b));
      if (py.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, axm.a) instanceof avo.e<?, ?> $$7) {
         ajb<cxd> $$8 = cxk.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(cxm.a(this.o, this.o, this.o, cxm.b.a($$9), cxm.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == cxk.f ? cxk.A : cxk.f;
         }
      }

      if (py.a($$3, $$4, $$5, false) instanceof avo.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(cxm.a(this.o, this.o, cxm.b.a($$12), this.o, cxm.b.a(0.0F), this.o, 0.0F), cxk.q));
         }
      }
   }

   private void c(Consumer<Pair<cxm.d, ajb<cxd>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, cxk.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         cxm.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<cxm.d, ajb<cxd>>> $$0) {
      this.c($$0, cxm.b.a(-1.0F, -0.93333334F));
      this.b($$0, cxm.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, cxm.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, cxm.b.a(-0.56666666F, -0.4F));
      this.c($$0, cxm.b.a(-0.4F, -0.26666668F));
      this.d($$0, cxm.b.a(-0.26666668F, -0.05F));
      this.e($$0, cxm.b.a(-0.05F, 0.05F));
      this.d($$0, cxm.b.a(0.05F, 0.26666668F));
      this.c($$0, cxm.b.a(0.26666668F, 0.4F));
      this.b($$0, cxm.b.a(0.4F, 0.56666666F));
      this.a($$0, cxm.b.a(0.56666666F, 0.7666667F));
      this.b($$0, cxm.b.a(0.7666667F, 0.93333334F));
      this.c($$0, cxm.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<cxm.d, ajb<cxd>>> $$0, cxm.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cxm.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cxm.b $$5 = this.q[$$4];
            ajb<cxd> $$6 = this.a($$2, $$4, $$1);
            ajb<cxd> $$7 = this.b($$2, $$4, $$1);
            ajb<cxd> $$8 = this.c($$2, $$4, $$1);
            ajb<cxd> $$9 = this.e($$2, $$4, $$1);
            ajb<cxd> $$10 = this.h($$2, $$4, $$1);
            ajb<cxd> $$11 = this.a($$2, $$4, $$1, $$10);
            ajb<cxd> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cxm.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cxm.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cxm.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cxm.b.a(this.x, this.z), cxm.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cxm.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cxm.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cxm.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cxm.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cxm.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<cxm.d, ajb<cxd>>> $$0, cxm.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cxm.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cxm.b $$5 = this.q[$$4];
            ajb<cxd> $$6 = this.a($$2, $$4, $$1);
            ajb<cxd> $$7 = this.b($$2, $$4, $$1);
            ajb<cxd> $$8 = this.c($$2, $$4, $$1);
            ajb<cxd> $$9 = this.e($$2, $$4, $$1);
            ajb<cxd> $$10 = this.h($$2, $$4, $$1);
            ajb<cxd> $$11 = this.a($$2, $$4, $$1, $$6);
            ajb<cxd> $$12 = this.g($$2, $$4, $$1);
            ajb<cxd> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, cxm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cxm.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cxm.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cxm.b.a(this.x, this.z), cxm.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cxm.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cxm.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cxm.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cxm.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cxm.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<cxm.d, ajb<cxd>>> $$0, cxm.b $$1) {
      this.a($$0, this.o, this.o, this.x, cxm.b.a(this.r[0], this.r[2]), $$1, 0.0F, cxk.O);
      this.a($$0, cxm.b.a(this.p[1], this.p[2]), this.o, cxm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cxk.g);
      this.a($$0, cxm.b.a(this.p[3], this.p[4]), this.o, cxm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cxk.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cxm.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cxm.b $$5 = this.q[$$4];
            ajb<cxd> $$6 = this.a($$2, $$4, $$1);
            ajb<cxd> $$7 = this.b($$2, $$4, $$1);
            ajb<cxd> $$8 = this.c($$2, $$4, $$1);
            ajb<cxd> $$9 = this.h($$2, $$4, $$1);
            ajb<cxd> $$10 = this.e($$2, $$4, $$1);
            ajb<cxd> $$11 = this.a($$2, $$4);
            ajb<cxd> $$12 = this.a($$2, $$4, $$1, $$6);
            ajb<cxd> $$13 = this.d($$2, $$4, $$1);
            ajb<cxd> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cxm.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, cxm.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cxm.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cxm.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, cxm.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, cxm.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cxm.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cxm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<cxm.d, ajb<cxd>>> $$0, cxm.b $$1) {
      this.a($$0, this.o, this.o, this.x, cxm.b.a(this.r[0], this.r[2]), $$1, 0.0F, cxk.O);
      this.a($$0, cxm.b.a(this.p[1], this.p[2]), this.o, cxm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cxk.g);
      this.a($$0, cxm.b.a(this.p[3], this.p[4]), this.o, cxm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cxk.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cxm.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cxm.b $$5 = this.q[$$4];
            ajb<cxd> $$6 = this.a($$2, $$4, $$1);
            ajb<cxd> $$7 = this.b($$2, $$4, $$1);
            ajb<cxd> $$8 = this.c($$2, $$4, $$1);
            ajb<cxd> $$9 = this.a($$2, $$4);
            ajb<cxd> $$10 = this.a($$2, $$4, $$1, $$6);
            ajb<cxd> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, cxm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, cxm.b.a(this.A, this.B), cxm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, cxm.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cxm.b.a(this.A, this.B), cxm.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, cxm.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cxm.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cxm.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cxm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<cxm.d, ajb<cxd>>> $$0, cxm.b $$1) {
      this.a($$0, this.s, this.o, this.x, cxm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cxk.O : cxk.L);
      this.a($$0, this.t, this.o, this.x, cxm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cxk.O : cxk.K);
      this.a($$0, this.s, this.o, this.z, cxm.b.a(this.r[0], this.r[1]), $$1, 0.0F, cxk.L);
      this.a($$0, this.t, this.o, this.z, cxm.b.a(this.r[0], this.r[1]), $$1, 0.0F, cxk.K);
      this.a($$0, this.s, this.o, cxm.b.a(this.x, this.B), cxm.b.a(this.r[2], this.r[5]), $$1, 0.0F, cxk.L);
      this.a($$0, this.t, this.o, cxm.b.a(this.x, this.B), cxm.b.a(this.r[2], this.r[5]), $$1, 0.0F, cxk.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, cxk.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, cxk.K);
      this.a($$0, cxm.b.a(this.p[1], this.p[2]), this.o, cxm.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cxk.g);
      this.a($$0, cxm.b.a(this.p[3], this.p[4]), this.o, cxm.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cxk.h);
      this.a($$0, this.s, this.o, cxm.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cxk.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cxm.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cxm.b $$5 = this.q[$$4];
            ajb<cxd> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cxm.b.a(this.A, this.B), cxm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<cxm.d, ajb<cxd>>> $$0) {
      this.b($$0, this.o, this.o, cxm.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, cxk.Z);
      this.b($$0, this.o, cxm.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, cxk.aa);
      this.c($$0, this.o, this.o, this.o, cxm.b.a(this.r[0], this.r[1]), this.o, 0.0F, cxk.ab);
   }

   private ajb<cxd> a(int $$0, int $$1, cxm.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         ajb<cxd> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private ajb<cxd> b(int $$0, int $$1, cxm.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private ajb<cxd> c(int $$0, int $$1, cxm.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private ajb<cxd> a(int $$0, int $$1, cxm.b $$2, ajb<cxd> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? cxk.w : $$3;
   }

   private ajb<cxd> d(int $$0, int $$1, cxm.b $$2) {
      ajb<cxd> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private ajb<cxd> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return cxk.N;
      } else {
         return $$0 == 4 ? cxk.f : cxk.M;
      }
   }

   private ajb<cxd> a(int $$0, cxm.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? cxk.A : cxk.B;
      } else {
         return $$0 < 3 ? cxk.A : cxk.C;
      }
   }

   private ajb<cxd> e(int $$0, int $$1, cxm.b $$2) {
      if ($$2.b() >= 0L) {
         ajb<cxd> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private ajb<cxd> f(int $$0, int $$1, cxm.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? cxk.I : cxk.H;
      } else {
         return $$0 == 3 ? cxk.J : this.a($$1, $$2);
      }
   }

   private ajb<cxd> g(int $$0, int $$1, cxm.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? cxk.G : cxk.F;
      }
   }

   private ajb<cxd> h(int $$0, int $$1, cxm.b $$2) {
      ajb<cxd> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<cxm.d, ajb<cxd>>> $$0, cxm.b $$1, cxm.b $$2, cxm.b $$3, cxm.b $$4, cxm.b $$5, float $$6, ajb<cxd> $$7) {
      $$0.accept(Pair.of(cxm.a($$1, $$2, $$3, $$4, cxm.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(cxm.a($$1, $$2, $$3, $$4, cxm.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<cxm.d, ajb<cxd>>> $$0, cxm.b $$1, cxm.b $$2, cxm.b $$3, cxm.b $$4, cxm.b $$5, float $$6, ajb<cxd> $$7) {
      $$0.accept(Pair.of(cxm.a($$1, $$2, $$3, $$4, cxm.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<cxm.d, ajb<cxd>>> $$0, cxm.b $$1, cxm.b $$2, cxm.b $$3, cxm.b $$4, cxm.b $$5, float $$6, ajb<cxd> $$7) {
      $$0.accept(Pair.of(cxm.a($$1, $$2, $$3, $$4, cxm.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(drj $$0, drj $$1, drj.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)drx.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)drx.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)drx.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)drx.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)cxm.a((float)$$0);
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

   private static String a(double $$0, cxm.b[] $$1) {
      double $$2 = (double)cxm.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @axp
   public cxm.b[] b() {
      return this.p;
   }

   @axp
   public cxm.b[] c() {
      return this.q;
   }

   @axp
   public cxm.b[] d() {
      return this.r;
   }

   @axp
   public cxm.b[] e() {
      return new cxm.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @axp
   public cxm.b[] f() {
      return new cxm.b[]{
         cxm.b.a(-2.0F, drx.a(0.05F)),
         cxm.b.a(drx.a(0.05F), drx.a(0.26666668F)),
         cxm.b.a(drx.a(0.26666668F), drx.a(0.4F)),
         cxm.b.a(drx.a(0.4F), drx.a(0.56666666F)),
         cxm.b.a(drx.a(0.56666666F), 2.0F)
      };
   }

   @axp
   public cxm.b[] g() {
      return new cxm.b[]{cxm.b.a(-2.0F, 0.0F), cxm.b.a(0.0F, 2.0F)};
   }
}
