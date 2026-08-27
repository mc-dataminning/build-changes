import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class cyo {
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
   private final cyh.b o = cyh.b.a(-1.0F, 1.0F);
   private final cyh.b[] p = new cyh.b[]{cyh.b.a(-1.0F, -0.45F), cyh.b.a(-0.45F, -0.15F), cyh.b.a(-0.15F, 0.2F), cyh.b.a(0.2F, 0.55F), cyh.b.a(0.55F, 1.0F)};
   private final cyh.b[] q = new cyh.b[]{cyh.b.a(-1.0F, -0.35F), cyh.b.a(-0.35F, -0.1F), cyh.b.a(-0.1F, 0.1F), cyh.b.a(0.1F, 0.3F), cyh.b.a(0.3F, 1.0F)};
   private final cyh.b[] r = new cyh.b[]{
      cyh.b.a(-1.0F, -0.78F),
      cyh.b.a(-0.78F, -0.375F),
      cyh.b.a(-0.375F, -0.2225F),
      cyh.b.a(-0.2225F, 0.05F),
      cyh.b.a(0.05F, 0.45F),
      cyh.b.a(0.45F, 0.55F),
      cyh.b.a(0.55F, 1.0F)
   };
   private final cyh.b s = this.p[0];
   private final cyh.b t = cyh.b.a(this.p[1], this.p[4]);
   private final cyh.b u = cyh.b.a(-1.2F, -1.05F);
   private final cyh.b v = cyh.b.a(-1.05F, -0.455F);
   private final cyh.b w = cyh.b.a(-0.455F, -0.19F);
   private final cyh.b x = cyh.b.a(-0.19F, -0.11F);
   private final cyh.b y = cyh.b.a(-0.11F, 0.55F);
   private final cyh.b z = cyh.b.a(-0.11F, 0.03F);
   private final cyh.b A = cyh.b.a(0.03F, 0.3F);
   private final cyh.b B = cyh.b.a(0.3F, 1.0F);
   private final ajg<cxy>[][] C = new ajg[][]{{cyf.X, cyf.V, cyf.T, cyf.R, cyf.P}, {cyf.W, cyf.U, cyf.S, cyf.Q, cyf.P}};
   private final ajg<cxy>[][] D = new ajg[][]{
      {cyf.d, cyf.d, cyf.d, cyf.q, cyf.p},
      {cyf.b, cyf.b, cyf.i, cyf.p, cyf.o},
      {cyf.j, cyf.b, cyf.i, cyf.k, cyf.l},
      {cyf.r, cyf.r, cyf.i, cyf.x, cyf.x},
      {cyf.f, cyf.f, cyf.f, cyf.f, cyf.f}
   };
   private final ajg<cxy>[][] E = new ajg[][]{
      {cyf.e, null, cyf.q, null, null},
      {null, null, null, null, cyf.n},
      {cyf.c, null, null, cyf.m, null},
      {null, null, cyf.b, cyf.y, cyf.z},
      {null, null, null, null, null}
   };
   private final ajg<cxy>[][] F = new ajg[][]{
      {cyf.d, cyf.d, cyf.d, cyf.q, cyf.q},
      {cyf.D, cyf.D, cyf.i, cyf.p, cyf.o},
      {cyf.D, cyf.D, cyf.D, cyf.D, cyf.l},
      {cyf.s, cyf.s, cyf.i, cyf.i, cyf.x},
      {cyf.A, cyf.A, cyf.A, cyf.C, cyf.C}
   };
   private final ajg<cxy>[][] G = new ajg[][]{
      {cyf.e, null, null, null, null},
      {cyf.E, null, cyf.D, cyf.D, cyf.n},
      {cyf.E, cyf.E, cyf.i, cyf.k, null},
      {null, null, null, null, null},
      {cyf.B, cyf.B, null, null, null}
   };
   private final ajg<cxy>[][] H = new ajg[][]{
      {cyf.u, cyf.u, cyf.t, cyf.v, cyf.v},
      {cyf.u, cyf.u, cyf.t, cyf.v, cyf.v},
      {cyf.t, cyf.t, cyf.t, cyf.v, cyf.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<cyh.d> a() {
      cyh.b $$0 = cyh.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new cyh.d(this.o, this.o, cyh.b.a(this.y, this.o), this.o, $$0, cyh.b.a(-1.0F, -0.16F), 0L),
         new cyh.d(this.o, this.o, cyh.b.a(this.y, this.o), this.o, $$0, cyh.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<cyh.d, ajg<cxy>>> $$0) {
      if (aa.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<cyh.d, ajg<cxy>>> $$0) {
      in.a $$1 = nv.a();
      im<dsf> $$2 = $$1.b(kj.ay);
      dsg.w.a $$3 = new dsg.w.a($$2.b(dst.d));
      dsg.w.a $$4 = new dsg.w.a($$2.b(dst.e));
      dsg.w.a $$5 = new dsg.w.a($$2.b(dst.g));
      $$0.accept(Pair.of(cyh.a(this.o, this.o, this.o, this.o, cyh.b.a(0.0F), this.o, 0.01F), cyf.b));
      if (qa.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, axw.a) instanceof avy.e<?, ?> $$7) {
         ajg<cxy> $$8 = cyf.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(cyh.a(this.o, this.o, this.o, cyh.b.a($$9), cyh.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == cyf.f ? cyf.A : cyf.f;
         }
      }

      if (qa.a($$3, $$4, $$5, false) instanceof avy.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(cyh.a(this.o, this.o, cyh.b.a($$12), this.o, cyh.b.a(0.0F), this.o, 0.0F), cyf.q));
         }
      }
   }

   private void c(Consumer<Pair<cyh.d, ajg<cxy>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, cyf.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         cyh.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<cyh.d, ajg<cxy>>> $$0) {
      this.c($$0, cyh.b.a(-1.0F, -0.93333334F));
      this.b($$0, cyh.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, cyh.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, cyh.b.a(-0.56666666F, -0.4F));
      this.c($$0, cyh.b.a(-0.4F, -0.26666668F));
      this.d($$0, cyh.b.a(-0.26666668F, -0.05F));
      this.e($$0, cyh.b.a(-0.05F, 0.05F));
      this.d($$0, cyh.b.a(0.05F, 0.26666668F));
      this.c($$0, cyh.b.a(0.26666668F, 0.4F));
      this.b($$0, cyh.b.a(0.4F, 0.56666666F));
      this.a($$0, cyh.b.a(0.56666666F, 0.7666667F));
      this.b($$0, cyh.b.a(0.7666667F, 0.93333334F));
      this.c($$0, cyh.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<cyh.d, ajg<cxy>>> $$0, cyh.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cyh.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cyh.b $$5 = this.q[$$4];
            ajg<cxy> $$6 = this.a($$2, $$4, $$1);
            ajg<cxy> $$7 = this.b($$2, $$4, $$1);
            ajg<cxy> $$8 = this.c($$2, $$4, $$1);
            ajg<cxy> $$9 = this.e($$2, $$4, $$1);
            ajg<cxy> $$10 = this.h($$2, $$4, $$1);
            ajg<cxy> $$11 = this.a($$2, $$4, $$1, $$10);
            ajg<cxy> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cyh.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cyh.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cyh.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cyh.b.a(this.x, this.z), cyh.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cyh.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cyh.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cyh.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cyh.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cyh.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<cyh.d, ajg<cxy>>> $$0, cyh.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cyh.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cyh.b $$5 = this.q[$$4];
            ajg<cxy> $$6 = this.a($$2, $$4, $$1);
            ajg<cxy> $$7 = this.b($$2, $$4, $$1);
            ajg<cxy> $$8 = this.c($$2, $$4, $$1);
            ajg<cxy> $$9 = this.e($$2, $$4, $$1);
            ajg<cxy> $$10 = this.h($$2, $$4, $$1);
            ajg<cxy> $$11 = this.a($$2, $$4, $$1, $$6);
            ajg<cxy> $$12 = this.g($$2, $$4, $$1);
            ajg<cxy> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, cyh.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cyh.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cyh.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cyh.b.a(this.x, this.z), cyh.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cyh.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cyh.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cyh.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cyh.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cyh.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<cyh.d, ajg<cxy>>> $$0, cyh.b $$1) {
      this.a($$0, this.o, this.o, this.x, cyh.b.a(this.r[0], this.r[2]), $$1, 0.0F, cyf.O);
      this.a($$0, cyh.b.a(this.p[1], this.p[2]), this.o, cyh.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cyf.g);
      this.a($$0, cyh.b.a(this.p[3], this.p[4]), this.o, cyh.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cyf.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cyh.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cyh.b $$5 = this.q[$$4];
            ajg<cxy> $$6 = this.a($$2, $$4, $$1);
            ajg<cxy> $$7 = this.b($$2, $$4, $$1);
            ajg<cxy> $$8 = this.c($$2, $$4, $$1);
            ajg<cxy> $$9 = this.h($$2, $$4, $$1);
            ajg<cxy> $$10 = this.e($$2, $$4, $$1);
            ajg<cxy> $$11 = this.a($$2, $$4);
            ajg<cxy> $$12 = this.a($$2, $$4, $$1, $$6);
            ajg<cxy> $$13 = this.d($$2, $$4, $$1);
            ajg<cxy> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cyh.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, cyh.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cyh.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cyh.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, cyh.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, cyh.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cyh.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cyh.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<cyh.d, ajg<cxy>>> $$0, cyh.b $$1) {
      this.a($$0, this.o, this.o, this.x, cyh.b.a(this.r[0], this.r[2]), $$1, 0.0F, cyf.O);
      this.a($$0, cyh.b.a(this.p[1], this.p[2]), this.o, cyh.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cyf.g);
      this.a($$0, cyh.b.a(this.p[3], this.p[4]), this.o, cyh.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cyf.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cyh.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cyh.b $$5 = this.q[$$4];
            ajg<cxy> $$6 = this.a($$2, $$4, $$1);
            ajg<cxy> $$7 = this.b($$2, $$4, $$1);
            ajg<cxy> $$8 = this.c($$2, $$4, $$1);
            ajg<cxy> $$9 = this.a($$2, $$4);
            ajg<cxy> $$10 = this.a($$2, $$4, $$1, $$6);
            ajg<cxy> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, cyh.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, cyh.b.a(this.A, this.B), cyh.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, cyh.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cyh.b.a(this.A, this.B), cyh.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, cyh.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cyh.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cyh.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cyh.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<cyh.d, ajg<cxy>>> $$0, cyh.b $$1) {
      this.a($$0, this.s, this.o, this.x, cyh.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cyf.O : cyf.L);
      this.a($$0, this.t, this.o, this.x, cyh.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cyf.O : cyf.K);
      this.a($$0, this.s, this.o, this.z, cyh.b.a(this.r[0], this.r[1]), $$1, 0.0F, cyf.L);
      this.a($$0, this.t, this.o, this.z, cyh.b.a(this.r[0], this.r[1]), $$1, 0.0F, cyf.K);
      this.a($$0, this.s, this.o, cyh.b.a(this.x, this.B), cyh.b.a(this.r[2], this.r[5]), $$1, 0.0F, cyf.L);
      this.a($$0, this.t, this.o, cyh.b.a(this.x, this.B), cyh.b.a(this.r[2], this.r[5]), $$1, 0.0F, cyf.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, cyf.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, cyf.K);
      this.a($$0, cyh.b.a(this.p[1], this.p[2]), this.o, cyh.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cyf.g);
      this.a($$0, cyh.b.a(this.p[3], this.p[4]), this.o, cyh.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cyf.h);
      this.a($$0, this.s, this.o, cyh.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cyf.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cyh.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cyh.b $$5 = this.q[$$4];
            ajg<cxy> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cyh.b.a(this.A, this.B), cyh.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<cyh.d, ajg<cxy>>> $$0) {
      this.b($$0, this.o, this.o, cyh.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, cyf.Z);
      this.b($$0, this.o, cyh.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, cyf.aa);
      this.c($$0, this.o, this.o, this.o, cyh.b.a(this.r[0], this.r[1]), this.o, 0.0F, cyf.ab);
   }

   private ajg<cxy> a(int $$0, int $$1, cyh.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         ajg<cxy> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private ajg<cxy> b(int $$0, int $$1, cyh.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private ajg<cxy> c(int $$0, int $$1, cyh.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private ajg<cxy> a(int $$0, int $$1, cyh.b $$2, ajg<cxy> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? cyf.w : $$3;
   }

   private ajg<cxy> d(int $$0, int $$1, cyh.b $$2) {
      ajg<cxy> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private ajg<cxy> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return cyf.N;
      } else {
         return $$0 == 4 ? cyf.f : cyf.M;
      }
   }

   private ajg<cxy> a(int $$0, cyh.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? cyf.A : cyf.B;
      } else {
         return $$0 < 3 ? cyf.A : cyf.C;
      }
   }

   private ajg<cxy> e(int $$0, int $$1, cyh.b $$2) {
      if ($$2.b() >= 0L) {
         ajg<cxy> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private ajg<cxy> f(int $$0, int $$1, cyh.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? cyf.I : cyf.H;
      } else {
         return $$0 == 3 ? cyf.J : this.a($$1, $$2);
      }
   }

   private ajg<cxy> g(int $$0, int $$1, cyh.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? cyf.G : cyf.F;
      }
   }

   private ajg<cxy> h(int $$0, int $$1, cyh.b $$2) {
      ajg<cxy> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<cyh.d, ajg<cxy>>> $$0, cyh.b $$1, cyh.b $$2, cyh.b $$3, cyh.b $$4, cyh.b $$5, float $$6, ajg<cxy> $$7) {
      $$0.accept(Pair.of(cyh.a($$1, $$2, $$3, $$4, cyh.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(cyh.a($$1, $$2, $$3, $$4, cyh.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<cyh.d, ajg<cxy>>> $$0, cyh.b $$1, cyh.b $$2, cyh.b $$3, cyh.b $$4, cyh.b $$5, float $$6, ajg<cxy> $$7) {
      $$0.accept(Pair.of(cyh.a($$1, $$2, $$3, $$4, cyh.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<cyh.d, ajg<cxy>>> $$0, cyh.b $$1, cyh.b $$2, cyh.b $$3, cyh.b $$4, cyh.b $$5, float $$6, ajg<cxy> $$7) {
      $$0.accept(Pair.of(cyh.a($$1, $$2, $$3, $$4, cyh.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dsf $$0, dsf $$1, dsf.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dst.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dst.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dst.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dst.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)cyh.a((float)$$0);
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

   private static String a(double $$0, cyh.b[] $$1) {
      double $$2 = (double)cyh.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @axz
   public cyh.b[] b() {
      return this.p;
   }

   @axz
   public cyh.b[] c() {
      return this.q;
   }

   @axz
   public cyh.b[] d() {
      return this.r;
   }

   @axz
   public cyh.b[] e() {
      return new cyh.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @axz
   public cyh.b[] f() {
      return new cyh.b[]{
         cyh.b.a(-2.0F, dst.a(0.05F)),
         cyh.b.a(dst.a(0.05F), dst.a(0.26666668F)),
         cyh.b.a(dst.a(0.26666668F), dst.a(0.4F)),
         cyh.b.a(dst.a(0.4F), dst.a(0.56666666F)),
         cyh.b.a(dst.a(0.56666666F), 2.0F)
      };
   }

   @axz
   public cyh.b[] g() {
      return new cyh.b[]{cyh.b.a(-2.0F, 0.0F), cyh.b.a(0.0F, 2.0F)};
   }
}
