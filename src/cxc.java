import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class cxc {
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
   private final cwv.b o = cwv.b.a(-1.0F, 1.0F);
   private final cwv.b[] p = new cwv.b[]{cwv.b.a(-1.0F, -0.45F), cwv.b.a(-0.45F, -0.15F), cwv.b.a(-0.15F, 0.2F), cwv.b.a(0.2F, 0.55F), cwv.b.a(0.55F, 1.0F)};
   private final cwv.b[] q = new cwv.b[]{cwv.b.a(-1.0F, -0.35F), cwv.b.a(-0.35F, -0.1F), cwv.b.a(-0.1F, 0.1F), cwv.b.a(0.1F, 0.3F), cwv.b.a(0.3F, 1.0F)};
   private final cwv.b[] r = new cwv.b[]{
      cwv.b.a(-1.0F, -0.78F),
      cwv.b.a(-0.78F, -0.375F),
      cwv.b.a(-0.375F, -0.2225F),
      cwv.b.a(-0.2225F, 0.05F),
      cwv.b.a(0.05F, 0.45F),
      cwv.b.a(0.45F, 0.55F),
      cwv.b.a(0.55F, 1.0F)
   };
   private final cwv.b s = this.p[0];
   private final cwv.b t = cwv.b.a(this.p[1], this.p[4]);
   private final cwv.b u = cwv.b.a(-1.2F, -1.05F);
   private final cwv.b v = cwv.b.a(-1.05F, -0.455F);
   private final cwv.b w = cwv.b.a(-0.455F, -0.19F);
   private final cwv.b x = cwv.b.a(-0.19F, -0.11F);
   private final cwv.b y = cwv.b.a(-0.11F, 0.55F);
   private final cwv.b z = cwv.b.a(-0.11F, 0.03F);
   private final cwv.b A = cwv.b.a(0.03F, 0.3F);
   private final cwv.b B = cwv.b.a(0.3F, 1.0F);
   private final aix<cwm>[][] C = new aix[][]{{cwt.X, cwt.V, cwt.T, cwt.R, cwt.P}, {cwt.W, cwt.U, cwt.S, cwt.Q, cwt.P}};
   private final aix<cwm>[][] D = new aix[][]{
      {cwt.d, cwt.d, cwt.d, cwt.q, cwt.p},
      {cwt.b, cwt.b, cwt.i, cwt.p, cwt.o},
      {cwt.j, cwt.b, cwt.i, cwt.k, cwt.l},
      {cwt.r, cwt.r, cwt.i, cwt.x, cwt.x},
      {cwt.f, cwt.f, cwt.f, cwt.f, cwt.f}
   };
   private final aix<cwm>[][] E = new aix[][]{
      {cwt.e, null, cwt.q, null, null},
      {null, null, null, null, cwt.n},
      {cwt.c, null, null, cwt.m, null},
      {null, null, cwt.b, cwt.y, cwt.z},
      {null, null, null, null, null}
   };
   private final aix<cwm>[][] F = new aix[][]{
      {cwt.d, cwt.d, cwt.d, cwt.q, cwt.q},
      {cwt.D, cwt.D, cwt.i, cwt.p, cwt.o},
      {cwt.D, cwt.D, cwt.D, cwt.D, cwt.l},
      {cwt.s, cwt.s, cwt.i, cwt.i, cwt.x},
      {cwt.A, cwt.A, cwt.A, cwt.C, cwt.C}
   };
   private final aix<cwm>[][] G = new aix[][]{
      {cwt.e, null, null, null, null},
      {cwt.E, null, cwt.D, cwt.D, cwt.n},
      {cwt.E, cwt.E, cwt.i, cwt.k, null},
      {null, null, null, null, null},
      {cwt.B, cwt.B, null, null, null}
   };
   private final aix<cwm>[][] H = new aix[][]{
      {cwt.u, cwt.u, cwt.t, cwt.v, cwt.v},
      {cwt.u, cwt.u, cwt.t, cwt.v, cwt.v},
      {cwt.t, cwt.t, cwt.t, cwt.v, cwt.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<cwv.d> a() {
      cwv.b $$0 = cwv.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new cwv.d(this.o, this.o, cwv.b.a(this.y, this.o), this.o, $$0, cwv.b.a(-1.0F, -0.16F), 0L),
         new cwv.d(this.o, this.o, cwv.b.a(this.y, this.o), this.o, $$0, cwv.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<cwv.d, aix<cwm>>> $$0) {
      if (aa.ar) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<cwv.d, aix<cwm>>> $$0) {
      il.b $$1 = nr.a();
      ik<dqh> $$2 = $$1.b(kg.ax);
      dqi.w.a $$3 = new dqi.w.a($$2.b(dqv.d));
      dqi.w.a $$4 = new dqi.w.a($$2.b(dqv.e));
      dqi.w.a $$5 = new dqi.w.a($$2.b(dqv.g));
      $$0.accept(Pair.of(cwv.a(this.o, this.o, this.o, this.o, cwv.b.a(0.0F), this.o, 0.01F), cwt.b));
      if (pw.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, axi.a) instanceof avj.e<?, ?> $$7) {
         aix<cwm> $$8 = cwt.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(cwv.a(this.o, this.o, this.o, cwv.b.a($$9), cwv.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == cwt.f ? cwt.A : cwt.f;
         }
      }

      if (pw.a($$3, $$4, $$5, false) instanceof avj.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(cwv.a(this.o, this.o, cwv.b.a($$12), this.o, cwv.b.a(0.0F), this.o, 0.0F), cwt.q));
         }
      }
   }

   private void c(Consumer<Pair<cwv.d, aix<cwm>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, cwt.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         cwv.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<cwv.d, aix<cwm>>> $$0) {
      this.c($$0, cwv.b.a(-1.0F, -0.93333334F));
      this.b($$0, cwv.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, cwv.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, cwv.b.a(-0.56666666F, -0.4F));
      this.c($$0, cwv.b.a(-0.4F, -0.26666668F));
      this.d($$0, cwv.b.a(-0.26666668F, -0.05F));
      this.e($$0, cwv.b.a(-0.05F, 0.05F));
      this.d($$0, cwv.b.a(0.05F, 0.26666668F));
      this.c($$0, cwv.b.a(0.26666668F, 0.4F));
      this.b($$0, cwv.b.a(0.4F, 0.56666666F));
      this.a($$0, cwv.b.a(0.56666666F, 0.7666667F));
      this.b($$0, cwv.b.a(0.7666667F, 0.93333334F));
      this.c($$0, cwv.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<cwv.d, aix<cwm>>> $$0, cwv.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cwv.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cwv.b $$5 = this.q[$$4];
            aix<cwm> $$6 = this.a($$2, $$4, $$1);
            aix<cwm> $$7 = this.b($$2, $$4, $$1);
            aix<cwm> $$8 = this.c($$2, $$4, $$1);
            aix<cwm> $$9 = this.e($$2, $$4, $$1);
            aix<cwm> $$10 = this.h($$2, $$4, $$1);
            aix<cwm> $$11 = this.a($$2, $$4, $$1, $$10);
            aix<cwm> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cwv.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cwv.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cwv.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cwv.b.a(this.x, this.z), cwv.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cwv.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cwv.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cwv.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cwv.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cwv.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<cwv.d, aix<cwm>>> $$0, cwv.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cwv.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cwv.b $$5 = this.q[$$4];
            aix<cwm> $$6 = this.a($$2, $$4, $$1);
            aix<cwm> $$7 = this.b($$2, $$4, $$1);
            aix<cwm> $$8 = this.c($$2, $$4, $$1);
            aix<cwm> $$9 = this.e($$2, $$4, $$1);
            aix<cwm> $$10 = this.h($$2, $$4, $$1);
            aix<cwm> $$11 = this.a($$2, $$4, $$1, $$6);
            aix<cwm> $$12 = this.g($$2, $$4, $$1);
            aix<cwm> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, cwv.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cwv.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cwv.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cwv.b.a(this.x, this.z), cwv.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cwv.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cwv.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cwv.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cwv.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cwv.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<cwv.d, aix<cwm>>> $$0, cwv.b $$1) {
      this.a($$0, this.o, this.o, this.x, cwv.b.a(this.r[0], this.r[2]), $$1, 0.0F, cwt.O);
      this.a($$0, cwv.b.a(this.p[1], this.p[2]), this.o, cwv.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cwt.g);
      this.a($$0, cwv.b.a(this.p[3], this.p[4]), this.o, cwv.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cwt.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cwv.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cwv.b $$5 = this.q[$$4];
            aix<cwm> $$6 = this.a($$2, $$4, $$1);
            aix<cwm> $$7 = this.b($$2, $$4, $$1);
            aix<cwm> $$8 = this.c($$2, $$4, $$1);
            aix<cwm> $$9 = this.h($$2, $$4, $$1);
            aix<cwm> $$10 = this.e($$2, $$4, $$1);
            aix<cwm> $$11 = this.a($$2, $$4);
            aix<cwm> $$12 = this.a($$2, $$4, $$1, $$6);
            aix<cwm> $$13 = this.d($$2, $$4, $$1);
            aix<cwm> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cwv.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, cwv.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cwv.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cwv.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, cwv.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, cwv.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cwv.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cwv.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<cwv.d, aix<cwm>>> $$0, cwv.b $$1) {
      this.a($$0, this.o, this.o, this.x, cwv.b.a(this.r[0], this.r[2]), $$1, 0.0F, cwt.O);
      this.a($$0, cwv.b.a(this.p[1], this.p[2]), this.o, cwv.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cwt.g);
      this.a($$0, cwv.b.a(this.p[3], this.p[4]), this.o, cwv.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cwt.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cwv.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cwv.b $$5 = this.q[$$4];
            aix<cwm> $$6 = this.a($$2, $$4, $$1);
            aix<cwm> $$7 = this.b($$2, $$4, $$1);
            aix<cwm> $$8 = this.c($$2, $$4, $$1);
            aix<cwm> $$9 = this.a($$2, $$4);
            aix<cwm> $$10 = this.a($$2, $$4, $$1, $$6);
            aix<cwm> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, cwv.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, cwv.b.a(this.A, this.B), cwv.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, cwv.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cwv.b.a(this.A, this.B), cwv.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, cwv.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cwv.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cwv.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cwv.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<cwv.d, aix<cwm>>> $$0, cwv.b $$1) {
      this.a($$0, this.s, this.o, this.x, cwv.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cwt.O : cwt.L);
      this.a($$0, this.t, this.o, this.x, cwv.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cwt.O : cwt.K);
      this.a($$0, this.s, this.o, this.z, cwv.b.a(this.r[0], this.r[1]), $$1, 0.0F, cwt.L);
      this.a($$0, this.t, this.o, this.z, cwv.b.a(this.r[0], this.r[1]), $$1, 0.0F, cwt.K);
      this.a($$0, this.s, this.o, cwv.b.a(this.x, this.B), cwv.b.a(this.r[2], this.r[5]), $$1, 0.0F, cwt.L);
      this.a($$0, this.t, this.o, cwv.b.a(this.x, this.B), cwv.b.a(this.r[2], this.r[5]), $$1, 0.0F, cwt.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, cwt.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, cwt.K);
      this.a($$0, cwv.b.a(this.p[1], this.p[2]), this.o, cwv.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cwt.g);
      this.a($$0, cwv.b.a(this.p[3], this.p[4]), this.o, cwv.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cwt.h);
      this.a($$0, this.s, this.o, cwv.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cwt.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cwv.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cwv.b $$5 = this.q[$$4];
            aix<cwm> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cwv.b.a(this.A, this.B), cwv.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<cwv.d, aix<cwm>>> $$0) {
      this.b($$0, this.o, this.o, cwv.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, cwt.Z);
      this.b($$0, this.o, cwv.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, cwt.aa);
      this.c($$0, this.o, this.o, this.o, cwv.b.a(this.r[0], this.r[1]), this.o, 0.0F, cwt.ab);
   }

   private aix<cwm> a(int $$0, int $$1, cwv.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         aix<cwm> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private aix<cwm> b(int $$0, int $$1, cwv.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private aix<cwm> c(int $$0, int $$1, cwv.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private aix<cwm> a(int $$0, int $$1, cwv.b $$2, aix<cwm> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? cwt.w : $$3;
   }

   private aix<cwm> d(int $$0, int $$1, cwv.b $$2) {
      aix<cwm> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private aix<cwm> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return cwt.N;
      } else {
         return $$0 == 4 ? cwt.f : cwt.M;
      }
   }

   private aix<cwm> a(int $$0, cwv.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? cwt.A : cwt.B;
      } else {
         return $$0 < 3 ? cwt.A : cwt.C;
      }
   }

   private aix<cwm> e(int $$0, int $$1, cwv.b $$2) {
      if ($$2.b() >= 0L) {
         aix<cwm> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private aix<cwm> f(int $$0, int $$1, cwv.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? cwt.I : cwt.H;
      } else {
         return $$0 == 3 ? cwt.J : this.a($$1, $$2);
      }
   }

   private aix<cwm> g(int $$0, int $$1, cwv.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? cwt.G : cwt.F;
      }
   }

   private aix<cwm> h(int $$0, int $$1, cwv.b $$2) {
      aix<cwm> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<cwv.d, aix<cwm>>> $$0, cwv.b $$1, cwv.b $$2, cwv.b $$3, cwv.b $$4, cwv.b $$5, float $$6, aix<cwm> $$7) {
      $$0.accept(Pair.of(cwv.a($$1, $$2, $$3, $$4, cwv.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(cwv.a($$1, $$2, $$3, $$4, cwv.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<cwv.d, aix<cwm>>> $$0, cwv.b $$1, cwv.b $$2, cwv.b $$3, cwv.b $$4, cwv.b $$5, float $$6, aix<cwm> $$7) {
      $$0.accept(Pair.of(cwv.a($$1, $$2, $$3, $$4, cwv.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<cwv.d, aix<cwm>>> $$0, cwv.b $$1, cwv.b $$2, cwv.b $$3, cwv.b $$4, cwv.b $$5, float $$6, aix<cwm> $$7) {
      $$0.accept(Pair.of(cwv.a($$1, $$2, $$3, $$4, cwv.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dqh $$0, dqh $$1, dqh.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dqv.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dqv.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dqv.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dqv.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)cwv.a((float)$$0);
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

   private static String a(double $$0, cwv.b[] $$1) {
      double $$2 = (double)cwv.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @axl
   public cwv.b[] b() {
      return this.p;
   }

   @axl
   public cwv.b[] c() {
      return this.q;
   }

   @axl
   public cwv.b[] d() {
      return this.r;
   }

   @axl
   public cwv.b[] e() {
      return new cwv.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @axl
   public cwv.b[] f() {
      return new cwv.b[]{
         cwv.b.a(-2.0F, dqv.a(0.05F)),
         cwv.b.a(dqv.a(0.05F), dqv.a(0.26666668F)),
         cwv.b.a(dqv.a(0.26666668F), dqv.a(0.4F)),
         cwv.b.a(dqv.a(0.4F), dqv.a(0.56666666F)),
         cwv.b.a(dqv.a(0.56666666F), 2.0F)
      };
   }

   @axl
   public cwv.b[] g() {
      return new cwv.b[]{cwv.b.a(-2.0F, 0.0F), cwv.b.a(0.0F, 2.0F)};
   }
}
