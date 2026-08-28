import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class diz {
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
   private final diz.a o;
   private final dis.b p = dis.b.a(-1.0F, 1.0F);
   private final dis.b[] q = new dis.b[]{dis.b.a(-1.0F, -0.45F), dis.b.a(-0.45F, -0.15F), dis.b.a(-0.15F, 0.2F), dis.b.a(0.2F, 0.55F), dis.b.a(0.55F, 1.0F)};
   private final dis.b[] r = new dis.b[]{dis.b.a(-1.0F, -0.35F), dis.b.a(-0.35F, -0.1F), dis.b.a(-0.1F, 0.1F), dis.b.a(0.1F, 0.3F), dis.b.a(0.3F, 1.0F)};
   private final dis.b[] s = new dis.b[]{
      dis.b.a(-1.0F, -0.78F),
      dis.b.a(-0.78F, -0.375F),
      dis.b.a(-0.375F, -0.2225F),
      dis.b.a(-0.2225F, 0.05F),
      dis.b.a(0.05F, 0.45F),
      dis.b.a(0.45F, 0.55F),
      dis.b.a(0.55F, 1.0F)
   };
   private final dis.b t = this.q[0];
   private final dis.b u = dis.b.a(this.q[1], this.q[4]);
   private final dis.b v = dis.b.a(-1.2F, -1.05F);
   private final dis.b w = dis.b.a(-1.05F, -0.455F);
   private final dis.b x = dis.b.a(-0.455F, -0.19F);
   private final dis.b y = dis.b.a(-0.19F, -0.11F);
   private final dis.b z = dis.b.a(-0.11F, 0.55F);
   private final dis.b A = dis.b.a(-0.11F, 0.03F);
   private final dis.b B = dis.b.a(0.03F, 0.3F);
   private final dis.b C = dis.b.a(0.3F, 1.0F);
   private final aly<dij>[][] D = new aly[][]{{diq.X, diq.V, diq.T, diq.R, diq.P}, {diq.W, diq.U, diq.S, diq.Q, diq.P}};
   private final aly<dij>[][] E = new aly[][]{
      {diq.d, diq.d, diq.d, diq.q, diq.p},
      {diq.b, diq.b, diq.i, diq.p, diq.o},
      {diq.j, diq.b, diq.i, diq.k, diq.l},
      {diq.r, diq.r, diq.i, diq.x, diq.x},
      {diq.f, diq.f, diq.f, diq.f, diq.f}
   };
   private final aly<dij>[][] F = new aly[][]{
      {diq.e, null, diq.q, null, null},
      {null, null, null, null, diq.n},
      {diq.c, null, null, diq.m, null},
      {null, null, diq.b, diq.y, diq.z},
      {null, null, null, null, null}
   };
   private final aly<dij>[][] G = new aly[][]{
      {diq.d, diq.d, diq.d, diq.q, diq.q},
      {diq.D, diq.D, diq.i, diq.p, diq.o},
      {diq.D, diq.D, diq.D, diq.D, diq.l},
      {diq.s, diq.s, diq.i, diq.i, diq.x},
      {diq.A, diq.A, diq.A, diq.C, diq.C}
   };
   private final aly<dij>[][] H = new aly[][]{
      {diq.e, null, null, null, null},
      {diq.E, null, diq.D, diq.D, diq.n},
      {diq.E, diq.E, diq.i, diq.k, null},
      {null, null, null, null, null},
      {diq.B, diq.B, null, null, null}
   };
   private final aly<dij>[][] I = new aly[][]{
      {diq.e, null, null, null, null},
      {diq.E, null, diq.D, diq.D, diq.n},
      {diq.E, diq.E, diq.i, diq.k, sd.a},
      {null, null, null, null, null},
      {diq.B, diq.B, null, null, null}
   };
   private final aly<dij>[][] J = new aly[][]{
      {diq.u, diq.u, diq.t, diq.v, diq.v},
      {diq.u, diq.u, diq.t, diq.v, diq.v},
      {diq.t, diq.t, diq.t, diq.v, diq.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public diz() {
      this(diz.a.a);
   }

   public diz(diz.a $$0) {
      this.o = $$0;
   }

   public List<dis.d> a() {
      dis.b $$0 = dis.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dis.d(this.p, this.p, dis.b.a(this.z, this.p), this.p, $$0, dis.b.a(-1.0F, -0.16F), 0L),
         new dis.d(this.p, this.p, dis.b.a(this.z, this.p), this.p, $$0, dis.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dis.d, aly<dij>>> $$0) {
      if (ab.ar) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dis.d, aly<dij>>> $$0) {
      js.a $$1 = ps.a();
      jr<edi> $$2 = $$1.d(mb.aM);
      edj.w.a $$3 = new edj.w.a($$2.b(edw.d));
      edj.w.a $$4 = new edj.w.a($$2.b(edw.e));
      edj.w.a $$5 = new edj.w.a($$2.b(edw.g));
      $$0.accept(Pair.of(dis.a(this.p, this.p, this.p, this.p, dis.b.a(0.0F), this.p, 0.01F), diq.b));
      if (rz.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, bbh.a) instanceof azg.e<?, ?> $$7) {
         aly<dij> $$8 = diq.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dis.a(this.p, this.p, this.p, dis.b.a($$9), dis.b.a(0.0F), this.p, 0.0F), $$8));
            $$8 = $$8 == diq.f ? diq.A : diq.f;
         }
      }

      if (rz.a($$3, $$4, $$5, false) instanceof azg.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dis.a(this.p, this.p, dis.b.a($$12), this.p, dis.b.a(0.0F), this.p, 0.0F), diq.q));
         }
      }
   }

   private void c(Consumer<Pair<dis.d, aly<dij>>> $$0) {
      this.a($$0, this.p, this.p, this.v, this.p, this.p, 0.0F, diq.Y);

      for (int $$1 = 0; $$1 < this.q.length; $$1++) {
         dis.b $$2 = this.q[$$1];
         this.a($$0, $$2, this.p, this.w, this.p, this.p, 0.0F, this.D[0][$$1]);
         this.a($$0, $$2, this.p, this.x, this.p, this.p, 0.0F, this.D[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dis.d, aly<dij>>> $$0) {
      this.c($$0, dis.b.a(-1.0F, -0.93333334F));
      this.b($$0, dis.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dis.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dis.b.a(-0.56666666F, -0.4F));
      this.c($$0, dis.b.a(-0.4F, -0.26666668F));
      this.d($$0, dis.b.a(-0.26666668F, -0.05F));
      this.e($$0, dis.b.a(-0.05F, 0.05F));
      this.d($$0, dis.b.a(0.05F, 0.26666668F));
      this.c($$0, dis.b.a(0.26666668F, 0.4F));
      this.b($$0, dis.b.a(0.4F, 0.56666666F));
      this.a($$0, dis.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dis.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dis.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dis.d, aly<dij>>> $$0, dis.b $$1) {
      for (int $$2 = 0; $$2 < this.q.length; $$2++) {
         dis.b $$3 = this.q[$$2];

         for (int $$4 = 0; $$4 < this.r.length; $$4++) {
            dis.b $$5 = this.r[$$4];
            aly<dij> $$6 = this.a($$2, $$4, $$1);
            aly<dij> $$7 = this.b($$2, $$4, $$1);
            aly<dij> $$8 = this.c($$2, $$4, $$1);
            aly<dij> $$9 = this.e($$2, $$4, $$1);
            aly<dij> $$10 = this.h($$2, $$4, $$1);
            aly<dij> $$11 = this.a($$2, $$4, $$1, $$10);
            aly<dij> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dis.b.a(this.y, this.C), this.s[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dis.b.a(this.y, this.A), this.s[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dis.b.a(this.B, this.C), this.s[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dis.b.a(this.y, this.A), dis.b.a(this.s[2], this.s[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dis.b.a(this.B, this.C), this.s[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.B, this.s[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.C, this.s[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dis.b.a(this.y, this.C), this.s[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dis.b.a(this.y, this.A), this.s[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dis.b.a(this.B, this.C), this.s[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dis.b.a(this.y, this.C), this.s[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dis.d, aly<dij>>> $$0, dis.b $$1) {
      for (int $$2 = 0; $$2 < this.q.length; $$2++) {
         dis.b $$3 = this.q[$$2];

         for (int $$4 = 0; $$4 < this.r.length; $$4++) {
            dis.b $$5 = this.r[$$4];
            aly<dij> $$6 = this.a($$2, $$4, $$1);
            aly<dij> $$7 = this.b($$2, $$4, $$1);
            aly<dij> $$8 = this.c($$2, $$4, $$1);
            aly<dij> $$9 = this.e($$2, $$4, $$1);
            aly<dij> $$10 = this.h($$2, $$4, $$1);
            aly<dij> $$11 = this.a($$2, $$4, $$1, $$6);
            aly<dij> $$12 = this.g($$2, $$4, $$1);
            aly<dij> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.y, dis.b.a(this.s[0], this.s[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.s[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dis.b.a(this.B, this.C), this.s[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.A, this.s[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dis.b.a(this.B, this.C), this.s[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dis.b.a(this.y, this.A), dis.b.a(this.s[2], this.s[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dis.b.a(this.B, this.C), this.s[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.B, this.s[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.C, this.s[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dis.b.a(this.y, this.C), this.s[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dis.b.a(this.y, this.A), this.s[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dis.b.a(this.B, this.C), this.s[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dis.b.a(this.y, this.C), this.s[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dis.d, aly<dij>>> $$0, dis.b $$1) {
      this.a($$0, this.p, this.p, this.y, dis.b.a(this.s[0], this.s[2]), $$1, 0.0F, diq.O);
      this.a($$0, dis.b.a(this.q[1], this.q[2]), this.p, dis.b.a(this.A, this.C), this.s[6], $$1, 0.0F, diq.g);
      this.a($$0, dis.b.a(this.q[3], this.q[4]), this.p, dis.b.a(this.A, this.C), this.s[6], $$1, 0.0F, diq.h);

      for (int $$2 = 0; $$2 < this.q.length; $$2++) {
         dis.b $$3 = this.q[$$2];

         for (int $$4 = 0; $$4 < this.r.length; $$4++) {
            dis.b $$5 = this.r[$$4];
            aly<dij> $$6 = this.a($$2, $$4, $$1);
            aly<dij> $$7 = this.b($$2, $$4, $$1);
            aly<dij> $$8 = this.c($$2, $$4, $$1);
            aly<dij> $$9 = this.h($$2, $$4, $$1);
            aly<dij> $$10 = this.e($$2, $$4, $$1);
            aly<dij> $$11 = this.a($$2, $$4);
            aly<dij> $$12 = this.a($$2, $$4, $$1, $$6);
            aly<dij> $$13 = this.d($$2, $$4, $$1);
            aly<dij> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dis.b.a(this.A, this.C), this.s[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dis.b.a(this.A, this.B), this.s[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.C, this.s[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.A, this.s[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.B, this.s[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.C, this.s[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dis.b.a(this.y, this.A), this.s[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dis.b.a(this.B, this.C), this.s[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.y, this.s[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dis.b.a(this.A, this.C), this.s[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dis.b.a(this.y, this.C), this.s[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.y, this.s[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.A, this.s[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dis.b.a(this.B, this.C), this.s[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.y, this.s[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.y, this.s[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dis.b.a(this.A, this.C), this.s[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dis.d, aly<dij>>> $$0, dis.b $$1) {
      this.a($$0, this.p, this.p, this.y, dis.b.a(this.s[0], this.s[2]), $$1, 0.0F, diq.O);
      this.a($$0, dis.b.a(this.q[1], this.q[2]), this.p, dis.b.a(this.A, this.C), this.s[6], $$1, 0.0F, diq.g);
      this.a($$0, dis.b.a(this.q[3], this.q[4]), this.p, dis.b.a(this.A, this.C), this.s[6], $$1, 0.0F, diq.h);

      for (int $$2 = 0; $$2 < this.q.length; $$2++) {
         dis.b $$3 = this.q[$$2];

         for (int $$4 = 0; $$4 < this.r.length; $$4++) {
            dis.b $$5 = this.r[$$4];
            aly<dij> $$6 = this.a($$2, $$4, $$1);
            aly<dij> $$7 = this.b($$2, $$4, $$1);
            aly<dij> $$8 = this.c($$2, $$4, $$1);
            aly<dij> $$9 = this.a($$2, $$4);
            aly<dij> $$10 = this.a($$2, $$4, $$1, $$6);
            aly<dij> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.A, dis.b.a(this.s[0], this.s[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dis.b.a(this.B, this.C), dis.b.a(this.s[0], this.s[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.A, dis.b.a(this.s[2], this.s[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dis.b.a(this.B, this.C), dis.b.a(this.s[2], this.s[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.y, dis.b.a(this.s[3], this.s[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dis.b.a(this.A, this.C), this.s[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.y, this.s[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.A, this.s[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dis.b.a(this.B, this.C), this.s[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.y, this.s[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dis.b.a(this.A, this.C), this.s[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dis.d, aly<dij>>> $$0, dis.b $$1) {
      this.a($$0, this.t, this.p, this.y, dis.b.a(this.s[0], this.s[1]), $$1, 0.0F, $$1.b() < 0L ? diq.O : diq.L);
      this.a($$0, this.u, this.p, this.y, dis.b.a(this.s[0], this.s[1]), $$1, 0.0F, $$1.b() < 0L ? diq.O : diq.K);
      this.a($$0, this.t, this.p, this.A, dis.b.a(this.s[0], this.s[1]), $$1, 0.0F, diq.L);
      this.a($$0, this.u, this.p, this.A, dis.b.a(this.s[0], this.s[1]), $$1, 0.0F, diq.K);
      this.a($$0, this.t, this.p, dis.b.a(this.y, this.C), dis.b.a(this.s[2], this.s[5]), $$1, 0.0F, diq.L);
      this.a($$0, this.u, this.p, dis.b.a(this.y, this.C), dis.b.a(this.s[2], this.s[5]), $$1, 0.0F, diq.K);
      this.a($$0, this.t, this.p, this.y, this.s[6], $$1, 0.0F, diq.L);
      this.a($$0, this.u, this.p, this.y, this.s[6], $$1, 0.0F, diq.K);
      this.a($$0, dis.b.a(this.q[1], this.q[2]), this.p, dis.b.a(this.z, this.C), this.s[6], $$1, 0.0F, diq.g);
      this.a($$0, dis.b.a(this.q[3], this.q[4]), this.p, dis.b.a(this.z, this.C), this.s[6], $$1, 0.0F, diq.h);
      this.a($$0, this.t, this.p, dis.b.a(this.z, this.C), this.s[6], $$1, 0.0F, diq.L);

      for (int $$2 = 0; $$2 < this.q.length; $$2++) {
         dis.b $$3 = this.q[$$2];

         for (int $$4 = 0; $$4 < this.r.length; $$4++) {
            dis.b $$5 = this.r[$$4];
            aly<dij> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dis.b.a(this.B, this.C), dis.b.a(this.s[0], this.s[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dis.d, aly<dij>>> $$0) {
      this.b($$0, this.p, this.p, dis.b.a(0.8F, 1.0F), this.p, this.p, 0.0F, diq.Z);
      this.b($$0, this.p, dis.b.a(0.7F, 1.0F), this.p, this.p, this.p, 0.0F, diq.aa);
      this.c($$0, this.p, this.p, this.p, dis.b.a(this.s[0], this.s[1]), this.p, 0.0F, diq.ab);
   }

   private aly<dij> a(int $$0, int $$1, dis.b $$2) {
      if ($$2.b() < 0L) {
         return this.E[$$0][$$1];
      } else {
         aly<dij> $$3 = this.F[$$0][$$1];
         return $$3 == null ? this.E[$$0][$$1] : $$3;
      }
   }

   private aly<dij> b(int $$0, int $$1, dis.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private aly<dij> c(int $$0, int $$1, dis.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private aly<dij> a(int $$0, int $$1, dis.b $$2, aly<dij> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? diq.w : $$3;
   }

   private aly<dij> d(int $$0, int $$1, dis.b $$2) {
      aly<dij> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private aly<dij> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return diq.N;
      } else {
         return $$0 == 4 ? diq.f : diq.M;
      }
   }

   private aly<dij> a(int $$0, dis.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? diq.A : diq.B;
      } else {
         return $$0 < 3 ? diq.A : diq.C;
      }
   }

   private aly<dij> e(int $$0, int $$1, dis.b $$2) {
      if ($$2.b() >= 0L) {
         aly<dij> $$3 = (this.o == diz.a.b ? this.I : this.H)[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.G[$$0][$$1];
   }

   private aly<dij> f(int $$0, int $$1, dis.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? diq.I : diq.H;
      } else {
         return $$0 == 3 ? diq.J : this.a($$1, $$2);
      }
   }

   private aly<dij> g(int $$0, int $$1, dis.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? diq.G : diq.F;
      }
   }

   private aly<dij> h(int $$0, int $$1, dis.b $$2) {
      aly<dij> $$3 = this.J[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dis.d, aly<dij>>> $$0, dis.b $$1, dis.b $$2, dis.b $$3, dis.b $$4, dis.b $$5, float $$6, aly<dij> $$7) {
      $$0.accept(Pair.of(dis.a($$1, $$2, $$3, $$4, dis.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dis.a($$1, $$2, $$3, $$4, dis.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dis.d, aly<dij>>> $$0, dis.b $$1, dis.b $$2, dis.b $$3, dis.b $$4, dis.b $$5, float $$6, aly<dij> $$7) {
      $$0.accept(Pair.of(dis.a($$1, $$2, $$3, $$4, dis.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dis.d, aly<dij>>> $$0, dis.b $$1, dis.b $$2, dis.b $$3, dis.b $$4, dis.b $$5, float $$6, aly<dij> $$7) {
      $$0.accept(Pair.of(dis.a($$1, $$2, $$3, $$4, dis.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(edi $$0, edi $$1, edi.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)edw.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)edw.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)edw.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)edw.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dis.a((float)$$0);
      if ($$1 < (double)this.v.b()) {
         return "Mushroom fields";
      } else if ($$1 < (double)this.w.b()) {
         return "Deep ocean";
      } else if ($$1 < (double)this.x.b()) {
         return "Ocean";
      } else if ($$1 < (double)this.y.b()) {
         return "Coast";
      } else if ($$1 < (double)this.A.b()) {
         return "Near inland";
      } else {
         return $$1 < (double)this.B.b() ? "Mid inland" : "Far inland";
      }
   }

   public String c(double $$0) {
      return a($$0, this.s);
   }

   public String d(double $$0) {
      return a($$0, this.q);
   }

   public String e(double $$0) {
      return a($$0, this.r);
   }

   private static String a(double $$0, dis.b[] $$1) {
      double $$2 = (double)dis.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bbl
   public dis.b[] b() {
      return this.q;
   }

   @bbl
   public dis.b[] c() {
      return this.r;
   }

   @bbl
   public dis.b[] d() {
      return this.s;
   }

   @bbl
   public dis.b[] e() {
      return new dis.b[]{this.v, this.w, this.x, this.y, this.A, this.B, this.C};
   }

   @bbl
   public dis.b[] f() {
      return new dis.b[]{
         dis.b.a(-2.0F, edw.a(0.05F)),
         dis.b.a(edw.a(0.05F), edw.a(0.26666668F)),
         dis.b.a(edw.a(0.26666668F), edw.a(0.4F)),
         dis.b.a(edw.a(0.4F), edw.a(0.56666666F)),
         dis.b.a(edw.a(0.56666666F), 2.0F)
      };
   }

   @bbl
   public dis.b[] g() {
      return new dis.b[]{dis.b.a(-2.0F, 0.0F), dis.b.a(0.0F, 2.0F)};
   }

   public static enum a {
      a,
      b;
   }
}
