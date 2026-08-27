import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class cyq {
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
   private final cyj.b o = cyj.b.a(-1.0F, 1.0F);
   private final cyj.b[] p = new cyj.b[]{cyj.b.a(-1.0F, -0.45F), cyj.b.a(-0.45F, -0.15F), cyj.b.a(-0.15F, 0.2F), cyj.b.a(0.2F, 0.55F), cyj.b.a(0.55F, 1.0F)};
   private final cyj.b[] q = new cyj.b[]{cyj.b.a(-1.0F, -0.35F), cyj.b.a(-0.35F, -0.1F), cyj.b.a(-0.1F, 0.1F), cyj.b.a(0.1F, 0.3F), cyj.b.a(0.3F, 1.0F)};
   private final cyj.b[] r = new cyj.b[]{
      cyj.b.a(-1.0F, -0.78F),
      cyj.b.a(-0.78F, -0.375F),
      cyj.b.a(-0.375F, -0.2225F),
      cyj.b.a(-0.2225F, 0.05F),
      cyj.b.a(0.05F, 0.45F),
      cyj.b.a(0.45F, 0.55F),
      cyj.b.a(0.55F, 1.0F)
   };
   private final cyj.b s = this.p[0];
   private final cyj.b t = cyj.b.a(this.p[1], this.p[4]);
   private final cyj.b u = cyj.b.a(-1.2F, -1.05F);
   private final cyj.b v = cyj.b.a(-1.05F, -0.455F);
   private final cyj.b w = cyj.b.a(-0.455F, -0.19F);
   private final cyj.b x = cyj.b.a(-0.19F, -0.11F);
   private final cyj.b y = cyj.b.a(-0.11F, 0.55F);
   private final cyj.b z = cyj.b.a(-0.11F, 0.03F);
   private final cyj.b A = cyj.b.a(0.03F, 0.3F);
   private final cyj.b B = cyj.b.a(0.3F, 1.0F);
   private final ajg<cya>[][] C = new ajg[][]{{cyh.X, cyh.V, cyh.T, cyh.R, cyh.P}, {cyh.W, cyh.U, cyh.S, cyh.Q, cyh.P}};
   private final ajg<cya>[][] D = new ajg[][]{
      {cyh.d, cyh.d, cyh.d, cyh.q, cyh.p},
      {cyh.b, cyh.b, cyh.i, cyh.p, cyh.o},
      {cyh.j, cyh.b, cyh.i, cyh.k, cyh.l},
      {cyh.r, cyh.r, cyh.i, cyh.x, cyh.x},
      {cyh.f, cyh.f, cyh.f, cyh.f, cyh.f}
   };
   private final ajg<cya>[][] E = new ajg[][]{
      {cyh.e, null, cyh.q, null, null},
      {null, null, null, null, cyh.n},
      {cyh.c, null, null, cyh.m, null},
      {null, null, cyh.b, cyh.y, cyh.z},
      {null, null, null, null, null}
   };
   private final ajg<cya>[][] F = new ajg[][]{
      {cyh.d, cyh.d, cyh.d, cyh.q, cyh.q},
      {cyh.D, cyh.D, cyh.i, cyh.p, cyh.o},
      {cyh.D, cyh.D, cyh.D, cyh.D, cyh.l},
      {cyh.s, cyh.s, cyh.i, cyh.i, cyh.x},
      {cyh.A, cyh.A, cyh.A, cyh.C, cyh.C}
   };
   private final ajg<cya>[][] G = new ajg[][]{
      {cyh.e, null, null, null, null},
      {cyh.E, null, cyh.D, cyh.D, cyh.n},
      {cyh.E, cyh.E, cyh.i, cyh.k, null},
      {null, null, null, null, null},
      {cyh.B, cyh.B, null, null, null}
   };
   private final ajg<cya>[][] H = new ajg[][]{
      {cyh.u, cyh.u, cyh.t, cyh.v, cyh.v},
      {cyh.u, cyh.u, cyh.t, cyh.v, cyh.v},
      {cyh.t, cyh.t, cyh.t, cyh.v, cyh.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<cyj.d> a() {
      cyj.b $$0 = cyj.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new cyj.d(this.o, this.o, cyj.b.a(this.y, this.o), this.o, $$0, cyj.b.a(-1.0F, -0.16F), 0L),
         new cyj.d(this.o, this.o, cyj.b.a(this.y, this.o), this.o, $$0, cyj.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<cyj.d, ajg<cya>>> $$0) {
      if (aa.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<cyj.d, ajg<cya>>> $$0) {
      in.a $$1 = nv.a();
      im<dsh> $$2 = $$1.b(kj.ay);
      dsi.w.a $$3 = new dsi.w.a($$2.b(dsv.d));
      dsi.w.a $$4 = new dsi.w.a($$2.b(dsv.e));
      dsi.w.a $$5 = new dsi.w.a($$2.b(dsv.g));
      $$0.accept(Pair.of(cyj.a(this.o, this.o, this.o, this.o, cyj.b.a(0.0F), this.o, 0.01F), cyh.b));
      if (qa.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, axw.a) instanceof avy.e<?, ?> $$7) {
         ajg<cya> $$8 = cyh.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(cyj.a(this.o, this.o, this.o, cyj.b.a($$9), cyj.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == cyh.f ? cyh.A : cyh.f;
         }
      }

      if (qa.a($$3, $$4, $$5, false) instanceof avy.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(cyj.a(this.o, this.o, cyj.b.a($$12), this.o, cyj.b.a(0.0F), this.o, 0.0F), cyh.q));
         }
      }
   }

   private void c(Consumer<Pair<cyj.d, ajg<cya>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, cyh.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         cyj.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<cyj.d, ajg<cya>>> $$0) {
      this.c($$0, cyj.b.a(-1.0F, -0.93333334F));
      this.b($$0, cyj.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, cyj.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, cyj.b.a(-0.56666666F, -0.4F));
      this.c($$0, cyj.b.a(-0.4F, -0.26666668F));
      this.d($$0, cyj.b.a(-0.26666668F, -0.05F));
      this.e($$0, cyj.b.a(-0.05F, 0.05F));
      this.d($$0, cyj.b.a(0.05F, 0.26666668F));
      this.c($$0, cyj.b.a(0.26666668F, 0.4F));
      this.b($$0, cyj.b.a(0.4F, 0.56666666F));
      this.a($$0, cyj.b.a(0.56666666F, 0.7666667F));
      this.b($$0, cyj.b.a(0.7666667F, 0.93333334F));
      this.c($$0, cyj.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<cyj.d, ajg<cya>>> $$0, cyj.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cyj.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cyj.b $$5 = this.q[$$4];
            ajg<cya> $$6 = this.a($$2, $$4, $$1);
            ajg<cya> $$7 = this.b($$2, $$4, $$1);
            ajg<cya> $$8 = this.c($$2, $$4, $$1);
            ajg<cya> $$9 = this.e($$2, $$4, $$1);
            ajg<cya> $$10 = this.h($$2, $$4, $$1);
            ajg<cya> $$11 = this.a($$2, $$4, $$1, $$10);
            ajg<cya> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cyj.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cyj.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cyj.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cyj.b.a(this.x, this.z), cyj.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cyj.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cyj.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cyj.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cyj.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cyj.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<cyj.d, ajg<cya>>> $$0, cyj.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cyj.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cyj.b $$5 = this.q[$$4];
            ajg<cya> $$6 = this.a($$2, $$4, $$1);
            ajg<cya> $$7 = this.b($$2, $$4, $$1);
            ajg<cya> $$8 = this.c($$2, $$4, $$1);
            ajg<cya> $$9 = this.e($$2, $$4, $$1);
            ajg<cya> $$10 = this.h($$2, $$4, $$1);
            ajg<cya> $$11 = this.a($$2, $$4, $$1, $$6);
            ajg<cya> $$12 = this.g($$2, $$4, $$1);
            ajg<cya> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, cyj.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cyj.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cyj.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cyj.b.a(this.x, this.z), cyj.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cyj.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cyj.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cyj.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cyj.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cyj.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<cyj.d, ajg<cya>>> $$0, cyj.b $$1) {
      this.a($$0, this.o, this.o, this.x, cyj.b.a(this.r[0], this.r[2]), $$1, 0.0F, cyh.O);
      this.a($$0, cyj.b.a(this.p[1], this.p[2]), this.o, cyj.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cyh.g);
      this.a($$0, cyj.b.a(this.p[3], this.p[4]), this.o, cyj.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cyh.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cyj.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cyj.b $$5 = this.q[$$4];
            ajg<cya> $$6 = this.a($$2, $$4, $$1);
            ajg<cya> $$7 = this.b($$2, $$4, $$1);
            ajg<cya> $$8 = this.c($$2, $$4, $$1);
            ajg<cya> $$9 = this.h($$2, $$4, $$1);
            ajg<cya> $$10 = this.e($$2, $$4, $$1);
            ajg<cya> $$11 = this.a($$2, $$4);
            ajg<cya> $$12 = this.a($$2, $$4, $$1, $$6);
            ajg<cya> $$13 = this.d($$2, $$4, $$1);
            ajg<cya> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cyj.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, cyj.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cyj.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cyj.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, cyj.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, cyj.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cyj.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cyj.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<cyj.d, ajg<cya>>> $$0, cyj.b $$1) {
      this.a($$0, this.o, this.o, this.x, cyj.b.a(this.r[0], this.r[2]), $$1, 0.0F, cyh.O);
      this.a($$0, cyj.b.a(this.p[1], this.p[2]), this.o, cyj.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cyh.g);
      this.a($$0, cyj.b.a(this.p[3], this.p[4]), this.o, cyj.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cyh.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cyj.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cyj.b $$5 = this.q[$$4];
            ajg<cya> $$6 = this.a($$2, $$4, $$1);
            ajg<cya> $$7 = this.b($$2, $$4, $$1);
            ajg<cya> $$8 = this.c($$2, $$4, $$1);
            ajg<cya> $$9 = this.a($$2, $$4);
            ajg<cya> $$10 = this.a($$2, $$4, $$1, $$6);
            ajg<cya> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, cyj.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, cyj.b.a(this.A, this.B), cyj.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, cyj.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cyj.b.a(this.A, this.B), cyj.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, cyj.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cyj.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cyj.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cyj.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<cyj.d, ajg<cya>>> $$0, cyj.b $$1) {
      this.a($$0, this.s, this.o, this.x, cyj.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cyh.O : cyh.L);
      this.a($$0, this.t, this.o, this.x, cyj.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cyh.O : cyh.K);
      this.a($$0, this.s, this.o, this.z, cyj.b.a(this.r[0], this.r[1]), $$1, 0.0F, cyh.L);
      this.a($$0, this.t, this.o, this.z, cyj.b.a(this.r[0], this.r[1]), $$1, 0.0F, cyh.K);
      this.a($$0, this.s, this.o, cyj.b.a(this.x, this.B), cyj.b.a(this.r[2], this.r[5]), $$1, 0.0F, cyh.L);
      this.a($$0, this.t, this.o, cyj.b.a(this.x, this.B), cyj.b.a(this.r[2], this.r[5]), $$1, 0.0F, cyh.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, cyh.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, cyh.K);
      this.a($$0, cyj.b.a(this.p[1], this.p[2]), this.o, cyj.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cyh.g);
      this.a($$0, cyj.b.a(this.p[3], this.p[4]), this.o, cyj.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cyh.h);
      this.a($$0, this.s, this.o, cyj.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cyh.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cyj.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cyj.b $$5 = this.q[$$4];
            ajg<cya> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cyj.b.a(this.A, this.B), cyj.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<cyj.d, ajg<cya>>> $$0) {
      this.b($$0, this.o, this.o, cyj.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, cyh.Z);
      this.b($$0, this.o, cyj.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, cyh.aa);
      this.c($$0, this.o, this.o, this.o, cyj.b.a(this.r[0], this.r[1]), this.o, 0.0F, cyh.ab);
   }

   private ajg<cya> a(int $$0, int $$1, cyj.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         ajg<cya> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private ajg<cya> b(int $$0, int $$1, cyj.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private ajg<cya> c(int $$0, int $$1, cyj.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private ajg<cya> a(int $$0, int $$1, cyj.b $$2, ajg<cya> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? cyh.w : $$3;
   }

   private ajg<cya> d(int $$0, int $$1, cyj.b $$2) {
      ajg<cya> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private ajg<cya> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return cyh.N;
      } else {
         return $$0 == 4 ? cyh.f : cyh.M;
      }
   }

   private ajg<cya> a(int $$0, cyj.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? cyh.A : cyh.B;
      } else {
         return $$0 < 3 ? cyh.A : cyh.C;
      }
   }

   private ajg<cya> e(int $$0, int $$1, cyj.b $$2) {
      if ($$2.b() >= 0L) {
         ajg<cya> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private ajg<cya> f(int $$0, int $$1, cyj.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? cyh.I : cyh.H;
      } else {
         return $$0 == 3 ? cyh.J : this.a($$1, $$2);
      }
   }

   private ajg<cya> g(int $$0, int $$1, cyj.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? cyh.G : cyh.F;
      }
   }

   private ajg<cya> h(int $$0, int $$1, cyj.b $$2) {
      ajg<cya> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<cyj.d, ajg<cya>>> $$0, cyj.b $$1, cyj.b $$2, cyj.b $$3, cyj.b $$4, cyj.b $$5, float $$6, ajg<cya> $$7) {
      $$0.accept(Pair.of(cyj.a($$1, $$2, $$3, $$4, cyj.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(cyj.a($$1, $$2, $$3, $$4, cyj.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<cyj.d, ajg<cya>>> $$0, cyj.b $$1, cyj.b $$2, cyj.b $$3, cyj.b $$4, cyj.b $$5, float $$6, ajg<cya> $$7) {
      $$0.accept(Pair.of(cyj.a($$1, $$2, $$3, $$4, cyj.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<cyj.d, ajg<cya>>> $$0, cyj.b $$1, cyj.b $$2, cyj.b $$3, cyj.b $$4, cyj.b $$5, float $$6, ajg<cya> $$7) {
      $$0.accept(Pair.of(cyj.a($$1, $$2, $$3, $$4, cyj.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dsh $$0, dsh $$1, dsh.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dsv.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dsv.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dsv.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dsv.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)cyj.a((float)$$0);
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

   private static String a(double $$0, cyj.b[] $$1) {
      double $$2 = (double)cyj.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @axz
   public cyj.b[] b() {
      return this.p;
   }

   @axz
   public cyj.b[] c() {
      return this.q;
   }

   @axz
   public cyj.b[] d() {
      return this.r;
   }

   @axz
   public cyj.b[] e() {
      return new cyj.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @axz
   public cyj.b[] f() {
      return new cyj.b[]{
         cyj.b.a(-2.0F, dsv.a(0.05F)),
         cyj.b.a(dsv.a(0.05F), dsv.a(0.26666668F)),
         cyj.b.a(dsv.a(0.26666668F), dsv.a(0.4F)),
         cyj.b.a(dsv.a(0.4F), dsv.a(0.56666666F)),
         cyj.b.a(dsv.a(0.56666666F), 2.0F)
      };
   }

   @axz
   public cyj.b[] g() {
      return new cyj.b[]{cyj.b.a(-2.0F, 0.0F), cyj.b.a(0.0F, 2.0F)};
   }
}
