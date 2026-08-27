import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class cxg {
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
   private final cwz.b o = cwz.b.a(-1.0F, 1.0F);
   private final cwz.b[] p = new cwz.b[]{cwz.b.a(-1.0F, -0.45F), cwz.b.a(-0.45F, -0.15F), cwz.b.a(-0.15F, 0.2F), cwz.b.a(0.2F, 0.55F), cwz.b.a(0.55F, 1.0F)};
   private final cwz.b[] q = new cwz.b[]{cwz.b.a(-1.0F, -0.35F), cwz.b.a(-0.35F, -0.1F), cwz.b.a(-0.1F, 0.1F), cwz.b.a(0.1F, 0.3F), cwz.b.a(0.3F, 1.0F)};
   private final cwz.b[] r = new cwz.b[]{
      cwz.b.a(-1.0F, -0.78F),
      cwz.b.a(-0.78F, -0.375F),
      cwz.b.a(-0.375F, -0.2225F),
      cwz.b.a(-0.2225F, 0.05F),
      cwz.b.a(0.05F, 0.45F),
      cwz.b.a(0.45F, 0.55F),
      cwz.b.a(0.55F, 1.0F)
   };
   private final cwz.b s = this.p[0];
   private final cwz.b t = cwz.b.a(this.p[1], this.p[4]);
   private final cwz.b u = cwz.b.a(-1.2F, -1.05F);
   private final cwz.b v = cwz.b.a(-1.05F, -0.455F);
   private final cwz.b w = cwz.b.a(-0.455F, -0.19F);
   private final cwz.b x = cwz.b.a(-0.19F, -0.11F);
   private final cwz.b y = cwz.b.a(-0.11F, 0.55F);
   private final cwz.b z = cwz.b.a(-0.11F, 0.03F);
   private final cwz.b A = cwz.b.a(0.03F, 0.3F);
   private final cwz.b B = cwz.b.a(0.3F, 1.0F);
   private final aix<cwq>[][] C = new aix[][]{{cwx.X, cwx.V, cwx.T, cwx.R, cwx.P}, {cwx.W, cwx.U, cwx.S, cwx.Q, cwx.P}};
   private final aix<cwq>[][] D = new aix[][]{
      {cwx.d, cwx.d, cwx.d, cwx.q, cwx.p},
      {cwx.b, cwx.b, cwx.i, cwx.p, cwx.o},
      {cwx.j, cwx.b, cwx.i, cwx.k, cwx.l},
      {cwx.r, cwx.r, cwx.i, cwx.x, cwx.x},
      {cwx.f, cwx.f, cwx.f, cwx.f, cwx.f}
   };
   private final aix<cwq>[][] E = new aix[][]{
      {cwx.e, null, cwx.q, null, null},
      {null, null, null, null, cwx.n},
      {cwx.c, null, null, cwx.m, null},
      {null, null, cwx.b, cwx.y, cwx.z},
      {null, null, null, null, null}
   };
   private final aix<cwq>[][] F = new aix[][]{
      {cwx.d, cwx.d, cwx.d, cwx.q, cwx.q},
      {cwx.D, cwx.D, cwx.i, cwx.p, cwx.o},
      {cwx.D, cwx.D, cwx.D, cwx.D, cwx.l},
      {cwx.s, cwx.s, cwx.i, cwx.i, cwx.x},
      {cwx.A, cwx.A, cwx.A, cwx.C, cwx.C}
   };
   private final aix<cwq>[][] G = new aix[][]{
      {cwx.e, null, null, null, null},
      {cwx.E, null, cwx.D, cwx.D, cwx.n},
      {cwx.E, cwx.E, cwx.i, cwx.k, null},
      {null, null, null, null, null},
      {cwx.B, cwx.B, null, null, null}
   };
   private final aix<cwq>[][] H = new aix[][]{
      {cwx.u, cwx.u, cwx.t, cwx.v, cwx.v},
      {cwx.u, cwx.u, cwx.t, cwx.v, cwx.v},
      {cwx.t, cwx.t, cwx.t, cwx.v, cwx.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<cwz.d> a() {
      cwz.b $$0 = cwz.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new cwz.d(this.o, this.o, cwz.b.a(this.y, this.o), this.o, $$0, cwz.b.a(-1.0F, -0.16F), 0L),
         new cwz.d(this.o, this.o, cwz.b.a(this.y, this.o), this.o, $$0, cwz.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<cwz.d, aix<cwq>>> $$0) {
      if (aa.ar) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<cwz.d, aix<cwq>>> $$0) {
      il.b $$1 = nr.a();
      ik<dqo> $$2 = $$1.b(kg.ax);
      dqp.w.a $$3 = new dqp.w.a($$2.b(drc.d));
      dqp.w.a $$4 = new dqp.w.a($$2.b(drc.e));
      dqp.w.a $$5 = new dqp.w.a($$2.b(drc.g));
      $$0.accept(Pair.of(cwz.a(this.o, this.o, this.o, this.o, cwz.b.a(0.0F), this.o, 0.01F), cwx.b));
      if (pw.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, axi.a) instanceof avk.e<?, ?> $$7) {
         aix<cwq> $$8 = cwx.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(cwz.a(this.o, this.o, this.o, cwz.b.a($$9), cwz.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == cwx.f ? cwx.A : cwx.f;
         }
      }

      if (pw.a($$3, $$4, $$5, false) instanceof avk.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(cwz.a(this.o, this.o, cwz.b.a($$12), this.o, cwz.b.a(0.0F), this.o, 0.0F), cwx.q));
         }
      }
   }

   private void c(Consumer<Pair<cwz.d, aix<cwq>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, cwx.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         cwz.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<cwz.d, aix<cwq>>> $$0) {
      this.c($$0, cwz.b.a(-1.0F, -0.93333334F));
      this.b($$0, cwz.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, cwz.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, cwz.b.a(-0.56666666F, -0.4F));
      this.c($$0, cwz.b.a(-0.4F, -0.26666668F));
      this.d($$0, cwz.b.a(-0.26666668F, -0.05F));
      this.e($$0, cwz.b.a(-0.05F, 0.05F));
      this.d($$0, cwz.b.a(0.05F, 0.26666668F));
      this.c($$0, cwz.b.a(0.26666668F, 0.4F));
      this.b($$0, cwz.b.a(0.4F, 0.56666666F));
      this.a($$0, cwz.b.a(0.56666666F, 0.7666667F));
      this.b($$0, cwz.b.a(0.7666667F, 0.93333334F));
      this.c($$0, cwz.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<cwz.d, aix<cwq>>> $$0, cwz.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cwz.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cwz.b $$5 = this.q[$$4];
            aix<cwq> $$6 = this.a($$2, $$4, $$1);
            aix<cwq> $$7 = this.b($$2, $$4, $$1);
            aix<cwq> $$8 = this.c($$2, $$4, $$1);
            aix<cwq> $$9 = this.e($$2, $$4, $$1);
            aix<cwq> $$10 = this.h($$2, $$4, $$1);
            aix<cwq> $$11 = this.a($$2, $$4, $$1, $$10);
            aix<cwq> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cwz.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cwz.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cwz.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cwz.b.a(this.x, this.z), cwz.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cwz.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cwz.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cwz.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cwz.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cwz.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<cwz.d, aix<cwq>>> $$0, cwz.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cwz.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cwz.b $$5 = this.q[$$4];
            aix<cwq> $$6 = this.a($$2, $$4, $$1);
            aix<cwq> $$7 = this.b($$2, $$4, $$1);
            aix<cwq> $$8 = this.c($$2, $$4, $$1);
            aix<cwq> $$9 = this.e($$2, $$4, $$1);
            aix<cwq> $$10 = this.h($$2, $$4, $$1);
            aix<cwq> $$11 = this.a($$2, $$4, $$1, $$6);
            aix<cwq> $$12 = this.g($$2, $$4, $$1);
            aix<cwq> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, cwz.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cwz.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cwz.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cwz.b.a(this.x, this.z), cwz.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cwz.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cwz.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cwz.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cwz.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cwz.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<cwz.d, aix<cwq>>> $$0, cwz.b $$1) {
      this.a($$0, this.o, this.o, this.x, cwz.b.a(this.r[0], this.r[2]), $$1, 0.0F, cwx.O);
      this.a($$0, cwz.b.a(this.p[1], this.p[2]), this.o, cwz.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cwx.g);
      this.a($$0, cwz.b.a(this.p[3], this.p[4]), this.o, cwz.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cwx.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cwz.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cwz.b $$5 = this.q[$$4];
            aix<cwq> $$6 = this.a($$2, $$4, $$1);
            aix<cwq> $$7 = this.b($$2, $$4, $$1);
            aix<cwq> $$8 = this.c($$2, $$4, $$1);
            aix<cwq> $$9 = this.h($$2, $$4, $$1);
            aix<cwq> $$10 = this.e($$2, $$4, $$1);
            aix<cwq> $$11 = this.a($$2, $$4);
            aix<cwq> $$12 = this.a($$2, $$4, $$1, $$6);
            aix<cwq> $$13 = this.d($$2, $$4, $$1);
            aix<cwq> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cwz.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, cwz.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cwz.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cwz.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, cwz.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, cwz.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cwz.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cwz.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<cwz.d, aix<cwq>>> $$0, cwz.b $$1) {
      this.a($$0, this.o, this.o, this.x, cwz.b.a(this.r[0], this.r[2]), $$1, 0.0F, cwx.O);
      this.a($$0, cwz.b.a(this.p[1], this.p[2]), this.o, cwz.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cwx.g);
      this.a($$0, cwz.b.a(this.p[3], this.p[4]), this.o, cwz.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cwx.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cwz.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cwz.b $$5 = this.q[$$4];
            aix<cwq> $$6 = this.a($$2, $$4, $$1);
            aix<cwq> $$7 = this.b($$2, $$4, $$1);
            aix<cwq> $$8 = this.c($$2, $$4, $$1);
            aix<cwq> $$9 = this.a($$2, $$4);
            aix<cwq> $$10 = this.a($$2, $$4, $$1, $$6);
            aix<cwq> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, cwz.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, cwz.b.a(this.A, this.B), cwz.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, cwz.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cwz.b.a(this.A, this.B), cwz.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, cwz.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cwz.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cwz.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cwz.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<cwz.d, aix<cwq>>> $$0, cwz.b $$1) {
      this.a($$0, this.s, this.o, this.x, cwz.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cwx.O : cwx.L);
      this.a($$0, this.t, this.o, this.x, cwz.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cwx.O : cwx.K);
      this.a($$0, this.s, this.o, this.z, cwz.b.a(this.r[0], this.r[1]), $$1, 0.0F, cwx.L);
      this.a($$0, this.t, this.o, this.z, cwz.b.a(this.r[0], this.r[1]), $$1, 0.0F, cwx.K);
      this.a($$0, this.s, this.o, cwz.b.a(this.x, this.B), cwz.b.a(this.r[2], this.r[5]), $$1, 0.0F, cwx.L);
      this.a($$0, this.t, this.o, cwz.b.a(this.x, this.B), cwz.b.a(this.r[2], this.r[5]), $$1, 0.0F, cwx.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, cwx.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, cwx.K);
      this.a($$0, cwz.b.a(this.p[1], this.p[2]), this.o, cwz.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cwx.g);
      this.a($$0, cwz.b.a(this.p[3], this.p[4]), this.o, cwz.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cwx.h);
      this.a($$0, this.s, this.o, cwz.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cwx.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cwz.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cwz.b $$5 = this.q[$$4];
            aix<cwq> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cwz.b.a(this.A, this.B), cwz.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<cwz.d, aix<cwq>>> $$0) {
      this.b($$0, this.o, this.o, cwz.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, cwx.Z);
      this.b($$0, this.o, cwz.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, cwx.aa);
      this.c($$0, this.o, this.o, this.o, cwz.b.a(this.r[0], this.r[1]), this.o, 0.0F, cwx.ab);
   }

   private aix<cwq> a(int $$0, int $$1, cwz.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         aix<cwq> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private aix<cwq> b(int $$0, int $$1, cwz.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private aix<cwq> c(int $$0, int $$1, cwz.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private aix<cwq> a(int $$0, int $$1, cwz.b $$2, aix<cwq> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? cwx.w : $$3;
   }

   private aix<cwq> d(int $$0, int $$1, cwz.b $$2) {
      aix<cwq> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private aix<cwq> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return cwx.N;
      } else {
         return $$0 == 4 ? cwx.f : cwx.M;
      }
   }

   private aix<cwq> a(int $$0, cwz.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? cwx.A : cwx.B;
      } else {
         return $$0 < 3 ? cwx.A : cwx.C;
      }
   }

   private aix<cwq> e(int $$0, int $$1, cwz.b $$2) {
      if ($$2.b() >= 0L) {
         aix<cwq> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private aix<cwq> f(int $$0, int $$1, cwz.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? cwx.I : cwx.H;
      } else {
         return $$0 == 3 ? cwx.J : this.a($$1, $$2);
      }
   }

   private aix<cwq> g(int $$0, int $$1, cwz.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? cwx.G : cwx.F;
      }
   }

   private aix<cwq> h(int $$0, int $$1, cwz.b $$2) {
      aix<cwq> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<cwz.d, aix<cwq>>> $$0, cwz.b $$1, cwz.b $$2, cwz.b $$3, cwz.b $$4, cwz.b $$5, float $$6, aix<cwq> $$7) {
      $$0.accept(Pair.of(cwz.a($$1, $$2, $$3, $$4, cwz.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(cwz.a($$1, $$2, $$3, $$4, cwz.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<cwz.d, aix<cwq>>> $$0, cwz.b $$1, cwz.b $$2, cwz.b $$3, cwz.b $$4, cwz.b $$5, float $$6, aix<cwq> $$7) {
      $$0.accept(Pair.of(cwz.a($$1, $$2, $$3, $$4, cwz.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<cwz.d, aix<cwq>>> $$0, cwz.b $$1, cwz.b $$2, cwz.b $$3, cwz.b $$4, cwz.b $$5, float $$6, aix<cwq> $$7) {
      $$0.accept(Pair.of(cwz.a($$1, $$2, $$3, $$4, cwz.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dqo $$0, dqo $$1, dqo.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)drc.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)drc.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)drc.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)drc.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)cwz.a((float)$$0);
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

   private static String a(double $$0, cwz.b[] $$1) {
      double $$2 = (double)cwz.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @axl
   public cwz.b[] b() {
      return this.p;
   }

   @axl
   public cwz.b[] c() {
      return this.q;
   }

   @axl
   public cwz.b[] d() {
      return this.r;
   }

   @axl
   public cwz.b[] e() {
      return new cwz.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @axl
   public cwz.b[] f() {
      return new cwz.b[]{
         cwz.b.a(-2.0F, drc.a(0.05F)),
         cwz.b.a(drc.a(0.05F), drc.a(0.26666668F)),
         cwz.b.a(drc.a(0.26666668F), drc.a(0.4F)),
         cwz.b.a(drc.a(0.4F), drc.a(0.56666666F)),
         cwz.b.a(drc.a(0.56666666F), 2.0F)
      };
   }

   @axl
   public cwz.b[] g() {
      return new cwz.b[]{cwz.b.a(-2.0F, 0.0F), cwz.b.a(0.0F, 2.0F)};
   }
}
