import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dgx {
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
   private final dgq.b o = dgq.b.a(-1.0F, 1.0F);
   private final dgq.b[] p = new dgq.b[]{dgq.b.a(-1.0F, -0.45F), dgq.b.a(-0.45F, -0.15F), dgq.b.a(-0.15F, 0.2F), dgq.b.a(0.2F, 0.55F), dgq.b.a(0.55F, 1.0F)};
   private final dgq.b[] q = new dgq.b[]{dgq.b.a(-1.0F, -0.35F), dgq.b.a(-0.35F, -0.1F), dgq.b.a(-0.1F, 0.1F), dgq.b.a(0.1F, 0.3F), dgq.b.a(0.3F, 1.0F)};
   private final dgq.b[] r = new dgq.b[]{
      dgq.b.a(-1.0F, -0.78F),
      dgq.b.a(-0.78F, -0.375F),
      dgq.b.a(-0.375F, -0.2225F),
      dgq.b.a(-0.2225F, 0.05F),
      dgq.b.a(0.05F, 0.45F),
      dgq.b.a(0.45F, 0.55F),
      dgq.b.a(0.55F, 1.0F)
   };
   private final dgq.b s = this.p[0];
   private final dgq.b t = dgq.b.a(this.p[1], this.p[4]);
   private final dgq.b u = dgq.b.a(-1.2F, -1.05F);
   private final dgq.b v = dgq.b.a(-1.05F, -0.455F);
   private final dgq.b w = dgq.b.a(-0.455F, -0.19F);
   private final dgq.b x = dgq.b.a(-0.19F, -0.11F);
   private final dgq.b y = dgq.b.a(-0.11F, 0.55F);
   private final dgq.b z = dgq.b.a(-0.11F, 0.03F);
   private final dgq.b A = dgq.b.a(0.03F, 0.3F);
   private final dgq.b B = dgq.b.a(0.3F, 1.0F);
   private final alk<dgh>[][] C = new alk[][]{{dgo.X, dgo.V, dgo.T, dgo.R, dgo.P}, {dgo.W, dgo.U, dgo.S, dgo.Q, dgo.P}};
   private final alk<dgh>[][] D = new alk[][]{
      {dgo.d, dgo.d, dgo.d, dgo.q, dgo.p},
      {dgo.b, dgo.b, dgo.i, dgo.p, dgo.o},
      {dgo.j, dgo.b, dgo.i, dgo.k, dgo.l},
      {dgo.r, dgo.r, dgo.i, dgo.x, dgo.x},
      {dgo.f, dgo.f, dgo.f, dgo.f, dgo.f}
   };
   private final alk<dgh>[][] E = new alk[][]{
      {dgo.e, null, dgo.q, null, null},
      {null, null, null, null, dgo.n},
      {dgo.c, null, null, dgo.m, null},
      {null, null, dgo.b, dgo.y, dgo.z},
      {null, null, null, null, null}
   };
   private final alk<dgh>[][] F = new alk[][]{
      {dgo.d, dgo.d, dgo.d, dgo.q, dgo.q},
      {dgo.D, dgo.D, dgo.i, dgo.p, dgo.o},
      {dgo.D, dgo.D, dgo.D, dgo.D, dgo.l},
      {dgo.s, dgo.s, dgo.i, dgo.i, dgo.x},
      {dgo.A, dgo.A, dgo.A, dgo.C, dgo.C}
   };
   private final alk<dgh>[][] G = new alk[][]{
      {dgo.e, null, null, null, null},
      {dgo.E, null, dgo.D, dgo.D, dgo.n},
      {dgo.E, dgo.E, dgo.i, dgo.k, null},
      {null, null, null, null, null},
      {dgo.B, dgo.B, null, null, null}
   };
   private final alk<dgh>[][] H = new alk[][]{
      {dgo.u, dgo.u, dgo.t, dgo.v, dgo.v},
      {dgo.u, dgo.u, dgo.t, dgo.v, dgo.v},
      {dgo.t, dgo.t, dgo.t, dgo.v, dgo.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dgq.d> a() {
      dgq.b $$0 = dgq.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dgq.d(this.o, this.o, dgq.b.a(this.y, this.o), this.o, $$0, dgq.b.a(-1.0F, -0.16F), 0L),
         new dgq.d(this.o, this.o, dgq.b.a(this.y, this.o), this.o, $$0, dgq.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dgq.d, alk<dgh>>> $$0) {
      if (ab.ar) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dgq.d, alk<dgh>>> $$0) {
      js.a $$1 = pn.a();
      jr<ebc> $$2 = $$1.d(ma.aK);
      ebd.w.a $$3 = new ebd.w.a($$2.b(ebq.d));
      ebd.w.a $$4 = new ebd.w.a($$2.b(ebq.e));
      ebd.w.a $$5 = new ebd.w.a($$2.b(ebq.g));
      $$0.accept(Pair.of(dgq.a(this.o, this.o, this.o, this.o, dgq.b.a(0.0F), this.o, 0.01F), dgo.b));
      if (rq.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, baq.a) instanceof ayp.e<?, ?> $$7) {
         alk<dgh> $$8 = dgo.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dgq.a(this.o, this.o, this.o, dgq.b.a($$9), dgq.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dgo.f ? dgo.A : dgo.f;
         }
      }

      if (rq.a($$3, $$4, $$5, false) instanceof ayp.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dgq.a(this.o, this.o, dgq.b.a($$12), this.o, dgq.b.a(0.0F), this.o, 0.0F), dgo.q));
         }
      }
   }

   private void c(Consumer<Pair<dgq.d, alk<dgh>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dgo.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dgq.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dgq.d, alk<dgh>>> $$0) {
      this.c($$0, dgq.b.a(-1.0F, -0.93333334F));
      this.b($$0, dgq.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dgq.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dgq.b.a(-0.56666666F, -0.4F));
      this.c($$0, dgq.b.a(-0.4F, -0.26666668F));
      this.d($$0, dgq.b.a(-0.26666668F, -0.05F));
      this.e($$0, dgq.b.a(-0.05F, 0.05F));
      this.d($$0, dgq.b.a(0.05F, 0.26666668F));
      this.c($$0, dgq.b.a(0.26666668F, 0.4F));
      this.b($$0, dgq.b.a(0.4F, 0.56666666F));
      this.a($$0, dgq.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dgq.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dgq.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dgq.d, alk<dgh>>> $$0, dgq.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dgq.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dgq.b $$5 = this.q[$$4];
            alk<dgh> $$6 = this.a($$2, $$4, $$1);
            alk<dgh> $$7 = this.b($$2, $$4, $$1);
            alk<dgh> $$8 = this.c($$2, $$4, $$1);
            alk<dgh> $$9 = this.e($$2, $$4, $$1);
            alk<dgh> $$10 = this.h($$2, $$4, $$1);
            alk<dgh> $$11 = this.a($$2, $$4, $$1, $$10);
            alk<dgh> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dgq.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dgq.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dgq.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dgq.b.a(this.x, this.z), dgq.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgq.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dgq.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgq.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dgq.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dgq.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dgq.d, alk<dgh>>> $$0, dgq.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dgq.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dgq.b $$5 = this.q[$$4];
            alk<dgh> $$6 = this.a($$2, $$4, $$1);
            alk<dgh> $$7 = this.b($$2, $$4, $$1);
            alk<dgh> $$8 = this.c($$2, $$4, $$1);
            alk<dgh> $$9 = this.e($$2, $$4, $$1);
            alk<dgh> $$10 = this.h($$2, $$4, $$1);
            alk<dgh> $$11 = this.a($$2, $$4, $$1, $$6);
            alk<dgh> $$12 = this.g($$2, $$4, $$1);
            alk<dgh> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dgq.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dgq.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dgq.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dgq.b.a(this.x, this.z), dgq.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgq.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dgq.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgq.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dgq.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dgq.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dgq.d, alk<dgh>>> $$0, dgq.b $$1) {
      this.a($$0, this.o, this.o, this.x, dgq.b.a(this.r[0], this.r[2]), $$1, 0.0F, dgo.O);
      this.a($$0, dgq.b.a(this.p[1], this.p[2]), this.o, dgq.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dgo.g);
      this.a($$0, dgq.b.a(this.p[3], this.p[4]), this.o, dgq.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dgo.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dgq.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dgq.b $$5 = this.q[$$4];
            alk<dgh> $$6 = this.a($$2, $$4, $$1);
            alk<dgh> $$7 = this.b($$2, $$4, $$1);
            alk<dgh> $$8 = this.c($$2, $$4, $$1);
            alk<dgh> $$9 = this.h($$2, $$4, $$1);
            alk<dgh> $$10 = this.e($$2, $$4, $$1);
            alk<dgh> $$11 = this.a($$2, $$4);
            alk<dgh> $$12 = this.a($$2, $$4, $$1, $$6);
            alk<dgh> $$13 = this.d($$2, $$4, $$1);
            alk<dgh> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dgq.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dgq.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dgq.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgq.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dgq.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dgq.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dgq.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dgq.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dgq.d, alk<dgh>>> $$0, dgq.b $$1) {
      this.a($$0, this.o, this.o, this.x, dgq.b.a(this.r[0], this.r[2]), $$1, 0.0F, dgo.O);
      this.a($$0, dgq.b.a(this.p[1], this.p[2]), this.o, dgq.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dgo.g);
      this.a($$0, dgq.b.a(this.p[3], this.p[4]), this.o, dgq.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dgo.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dgq.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dgq.b $$5 = this.q[$$4];
            alk<dgh> $$6 = this.a($$2, $$4, $$1);
            alk<dgh> $$7 = this.b($$2, $$4, $$1);
            alk<dgh> $$8 = this.c($$2, $$4, $$1);
            alk<dgh> $$9 = this.a($$2, $$4);
            alk<dgh> $$10 = this.a($$2, $$4, $$1, $$6);
            alk<dgh> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dgq.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dgq.b.a(this.A, this.B), dgq.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dgq.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dgq.b.a(this.A, this.B), dgq.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dgq.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dgq.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dgq.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dgq.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dgq.d, alk<dgh>>> $$0, dgq.b $$1) {
      this.a($$0, this.s, this.o, this.x, dgq.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dgo.O : dgo.L);
      this.a($$0, this.t, this.o, this.x, dgq.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dgo.O : dgo.K);
      this.a($$0, this.s, this.o, this.z, dgq.b.a(this.r[0], this.r[1]), $$1, 0.0F, dgo.L);
      this.a($$0, this.t, this.o, this.z, dgq.b.a(this.r[0], this.r[1]), $$1, 0.0F, dgo.K);
      this.a($$0, this.s, this.o, dgq.b.a(this.x, this.B), dgq.b.a(this.r[2], this.r[5]), $$1, 0.0F, dgo.L);
      this.a($$0, this.t, this.o, dgq.b.a(this.x, this.B), dgq.b.a(this.r[2], this.r[5]), $$1, 0.0F, dgo.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dgo.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dgo.K);
      this.a($$0, dgq.b.a(this.p[1], this.p[2]), this.o, dgq.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dgo.g);
      this.a($$0, dgq.b.a(this.p[3], this.p[4]), this.o, dgq.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dgo.h);
      this.a($$0, this.s, this.o, dgq.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dgo.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dgq.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dgq.b $$5 = this.q[$$4];
            alk<dgh> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dgq.b.a(this.A, this.B), dgq.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dgq.d, alk<dgh>>> $$0) {
      this.b($$0, this.o, this.o, dgq.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dgo.Z);
      this.b($$0, this.o, dgq.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dgo.aa);
      this.c($$0, this.o, this.o, this.o, dgq.b.a(this.r[0], this.r[1]), this.o, 0.0F, dgo.ab);
   }

   private alk<dgh> a(int $$0, int $$1, dgq.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         alk<dgh> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private alk<dgh> b(int $$0, int $$1, dgq.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private alk<dgh> c(int $$0, int $$1, dgq.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private alk<dgh> a(int $$0, int $$1, dgq.b $$2, alk<dgh> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dgo.w : $$3;
   }

   private alk<dgh> d(int $$0, int $$1, dgq.b $$2) {
      alk<dgh> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private alk<dgh> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dgo.N;
      } else {
         return $$0 == 4 ? dgo.f : dgo.M;
      }
   }

   private alk<dgh> a(int $$0, dgq.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dgo.A : dgo.B;
      } else {
         return $$0 < 3 ? dgo.A : dgo.C;
      }
   }

   private alk<dgh> e(int $$0, int $$1, dgq.b $$2) {
      if ($$2.b() >= 0L) {
         alk<dgh> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private alk<dgh> f(int $$0, int $$1, dgq.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dgo.I : dgo.H;
      } else {
         return $$0 == 3 ? dgo.J : this.a($$1, $$2);
      }
   }

   private alk<dgh> g(int $$0, int $$1, dgq.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dgo.G : dgo.F;
      }
   }

   private alk<dgh> h(int $$0, int $$1, dgq.b $$2) {
      alk<dgh> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dgq.d, alk<dgh>>> $$0, dgq.b $$1, dgq.b $$2, dgq.b $$3, dgq.b $$4, dgq.b $$5, float $$6, alk<dgh> $$7) {
      $$0.accept(Pair.of(dgq.a($$1, $$2, $$3, $$4, dgq.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dgq.a($$1, $$2, $$3, $$4, dgq.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dgq.d, alk<dgh>>> $$0, dgq.b $$1, dgq.b $$2, dgq.b $$3, dgq.b $$4, dgq.b $$5, float $$6, alk<dgh> $$7) {
      $$0.accept(Pair.of(dgq.a($$1, $$2, $$3, $$4, dgq.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dgq.d, alk<dgh>>> $$0, dgq.b $$1, dgq.b $$2, dgq.b $$3, dgq.b $$4, dgq.b $$5, float $$6, alk<dgh> $$7) {
      $$0.accept(Pair.of(dgq.a($$1, $$2, $$3, $$4, dgq.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(ebc $$0, ebc $$1, ebc.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)ebq.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)ebq.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)ebq.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)ebq.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dgq.a((float)$$0);
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

   private static String a(double $$0, dgq.b[] $$1) {
      double $$2 = (double)dgq.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bau
   public dgq.b[] b() {
      return this.p;
   }

   @bau
   public dgq.b[] c() {
      return this.q;
   }

   @bau
   public dgq.b[] d() {
      return this.r;
   }

   @bau
   public dgq.b[] e() {
      return new dgq.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @bau
   public dgq.b[] f() {
      return new dgq.b[]{
         dgq.b.a(-2.0F, ebq.a(0.05F)),
         dgq.b.a(ebq.a(0.05F), ebq.a(0.26666668F)),
         dgq.b.a(ebq.a(0.26666668F), ebq.a(0.4F)),
         dgq.b.a(ebq.a(0.4F), ebq.a(0.56666666F)),
         dgq.b.a(ebq.a(0.56666666F), 2.0F)
      };
   }

   @bau
   public dgq.b[] g() {
      return new dgq.b[]{dgq.b.a(-2.0F, 0.0F), dgq.b.a(0.0F, 2.0F)};
   }
}
