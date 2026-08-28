import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dek {
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
   private final ded.b o = ded.b.a(-1.0F, 1.0F);
   private final ded.b[] p = new ded.b[]{ded.b.a(-1.0F, -0.45F), ded.b.a(-0.45F, -0.15F), ded.b.a(-0.15F, 0.2F), ded.b.a(0.2F, 0.55F), ded.b.a(0.55F, 1.0F)};
   private final ded.b[] q = new ded.b[]{ded.b.a(-1.0F, -0.35F), ded.b.a(-0.35F, -0.1F), ded.b.a(-0.1F, 0.1F), ded.b.a(0.1F, 0.3F), ded.b.a(0.3F, 1.0F)};
   private final ded.b[] r = new ded.b[]{
      ded.b.a(-1.0F, -0.78F),
      ded.b.a(-0.78F, -0.375F),
      ded.b.a(-0.375F, -0.2225F),
      ded.b.a(-0.2225F, 0.05F),
      ded.b.a(0.05F, 0.45F),
      ded.b.a(0.45F, 0.55F),
      ded.b.a(0.55F, 1.0F)
   };
   private final ded.b s = this.p[0];
   private final ded.b t = ded.b.a(this.p[1], this.p[4]);
   private final ded.b u = ded.b.a(-1.2F, -1.05F);
   private final ded.b v = ded.b.a(-1.05F, -0.455F);
   private final ded.b w = ded.b.a(-0.455F, -0.19F);
   private final ded.b x = ded.b.a(-0.19F, -0.11F);
   private final ded.b y = ded.b.a(-0.11F, 0.55F);
   private final ded.b z = ded.b.a(-0.11F, 0.03F);
   private final ded.b A = ded.b.a(0.03F, 0.3F);
   private final ded.b B = ded.b.a(0.3F, 1.0F);
   private final akp<ddu>[][] C = new akp[][]{{deb.X, deb.V, deb.T, deb.R, deb.P}, {deb.W, deb.U, deb.S, deb.Q, deb.P}};
   private final akp<ddu>[][] D = new akp[][]{
      {deb.d, deb.d, deb.d, deb.q, deb.p},
      {deb.b, deb.b, deb.i, deb.p, deb.o},
      {deb.j, deb.b, deb.i, deb.k, deb.l},
      {deb.r, deb.r, deb.i, deb.x, deb.x},
      {deb.f, deb.f, deb.f, deb.f, deb.f}
   };
   private final akp<ddu>[][] E = new akp[][]{
      {deb.e, null, deb.q, null, null},
      {null, null, null, null, deb.n},
      {deb.c, null, null, deb.m, null},
      {null, null, deb.b, deb.y, deb.z},
      {null, null, null, null, null}
   };
   private final akp<ddu>[][] F = new akp[][]{
      {deb.d, deb.d, deb.d, deb.q, deb.q},
      {deb.D, deb.D, deb.i, deb.p, deb.o},
      {deb.D, deb.D, deb.D, deb.D, deb.l},
      {deb.s, deb.s, deb.i, deb.i, deb.x},
      {deb.A, deb.A, deb.A, deb.C, deb.C}
   };
   private final akp<ddu>[][] G = new akp[][]{
      {deb.e, null, null, null, null},
      {deb.E, null, deb.D, deb.D, deb.n},
      {deb.E, deb.E, deb.i, deb.k, null},
      {null, null, null, null, null},
      {deb.B, deb.B, null, null, null}
   };
   private final akp<ddu>[][] H = new akp[][]{
      {deb.u, deb.u, deb.t, deb.v, deb.v},
      {deb.u, deb.u, deb.t, deb.v, deb.v},
      {deb.t, deb.t, deb.t, deb.v, deb.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<ded.d> a() {
      ded.b $$0 = ded.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new ded.d(this.o, this.o, ded.b.a(this.y, this.o), this.o, $$0, ded.b.a(-1.0F, -0.16F), 0L),
         new ded.d(this.o, this.o, ded.b.a(this.y, this.o), this.o, $$0, ded.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<ded.d, akp<ddu>>> $$0) {
      if (ab.ar) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<ded.d, akp<ddu>>> $$0) {
      jo.a $$1 = pc.a();
      jn<dyo> $$2 = $$1.b(lu.aJ);
      dyp.w.a $$3 = new dyp.w.a($$2.b(dzc.d));
      dyp.w.a $$4 = new dyp.w.a($$2.b(dzc.e));
      dyp.w.a $$5 = new dyp.w.a($$2.b(dzc.g));
      $$0.accept(Pair.of(ded.a(this.o, this.o, this.o, this.o, ded.b.a(0.0F), this.o, 0.01F), deb.b));
      if (re.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, azp.a) instanceof axo.e<?, ?> $$7) {
         akp<ddu> $$8 = deb.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(ded.a(this.o, this.o, this.o, ded.b.a($$9), ded.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == deb.f ? deb.A : deb.f;
         }
      }

      if (re.a($$3, $$4, $$5, false) instanceof axo.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(ded.a(this.o, this.o, ded.b.a($$12), this.o, ded.b.a(0.0F), this.o, 0.0F), deb.q));
         }
      }
   }

   private void c(Consumer<Pair<ded.d, akp<ddu>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, deb.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         ded.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<ded.d, akp<ddu>>> $$0) {
      this.c($$0, ded.b.a(-1.0F, -0.93333334F));
      this.b($$0, ded.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, ded.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, ded.b.a(-0.56666666F, -0.4F));
      this.c($$0, ded.b.a(-0.4F, -0.26666668F));
      this.d($$0, ded.b.a(-0.26666668F, -0.05F));
      this.e($$0, ded.b.a(-0.05F, 0.05F));
      this.d($$0, ded.b.a(0.05F, 0.26666668F));
      this.c($$0, ded.b.a(0.26666668F, 0.4F));
      this.b($$0, ded.b.a(0.4F, 0.56666666F));
      this.a($$0, ded.b.a(0.56666666F, 0.7666667F));
      this.b($$0, ded.b.a(0.7666667F, 0.93333334F));
      this.c($$0, ded.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<ded.d, akp<ddu>>> $$0, ded.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ded.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ded.b $$5 = this.q[$$4];
            akp<ddu> $$6 = this.a($$2, $$4, $$1);
            akp<ddu> $$7 = this.b($$2, $$4, $$1);
            akp<ddu> $$8 = this.c($$2, $$4, $$1);
            akp<ddu> $$9 = this.e($$2, $$4, $$1);
            akp<ddu> $$10 = this.h($$2, $$4, $$1);
            akp<ddu> $$11 = this.a($$2, $$4, $$1, $$10);
            akp<ddu> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ded.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ded.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, ded.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ded.b.a(this.x, this.z), ded.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ded.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ded.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ded.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, ded.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ded.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<ded.d, akp<ddu>>> $$0, ded.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ded.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ded.b $$5 = this.q[$$4];
            akp<ddu> $$6 = this.a($$2, $$4, $$1);
            akp<ddu> $$7 = this.b($$2, $$4, $$1);
            akp<ddu> $$8 = this.c($$2, $$4, $$1);
            akp<ddu> $$9 = this.e($$2, $$4, $$1);
            akp<ddu> $$10 = this.h($$2, $$4, $$1);
            akp<ddu> $$11 = this.a($$2, $$4, $$1, $$6);
            akp<ddu> $$12 = this.g($$2, $$4, $$1);
            akp<ddu> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, ded.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ded.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, ded.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ded.b.a(this.x, this.z), ded.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ded.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ded.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ded.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, ded.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ded.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<ded.d, akp<ddu>>> $$0, ded.b $$1) {
      this.a($$0, this.o, this.o, this.x, ded.b.a(this.r[0], this.r[2]), $$1, 0.0F, deb.O);
      this.a($$0, ded.b.a(this.p[1], this.p[2]), this.o, ded.b.a(this.z, this.B), this.r[6], $$1, 0.0F, deb.g);
      this.a($$0, ded.b.a(this.p[3], this.p[4]), this.o, ded.b.a(this.z, this.B), this.r[6], $$1, 0.0F, deb.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ded.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ded.b $$5 = this.q[$$4];
            akp<ddu> $$6 = this.a($$2, $$4, $$1);
            akp<ddu> $$7 = this.b($$2, $$4, $$1);
            akp<ddu> $$8 = this.c($$2, $$4, $$1);
            akp<ddu> $$9 = this.h($$2, $$4, $$1);
            akp<ddu> $$10 = this.e($$2, $$4, $$1);
            akp<ddu> $$11 = this.a($$2, $$4);
            akp<ddu> $$12 = this.a($$2, $$4, $$1, $$6);
            akp<ddu> $$13 = this.d($$2, $$4, $$1);
            akp<ddu> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ded.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, ded.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ded.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ded.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, ded.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, ded.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ded.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, ded.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<ded.d, akp<ddu>>> $$0, ded.b $$1) {
      this.a($$0, this.o, this.o, this.x, ded.b.a(this.r[0], this.r[2]), $$1, 0.0F, deb.O);
      this.a($$0, ded.b.a(this.p[1], this.p[2]), this.o, ded.b.a(this.z, this.B), this.r[6], $$1, 0.0F, deb.g);
      this.a($$0, ded.b.a(this.p[3], this.p[4]), this.o, ded.b.a(this.z, this.B), this.r[6], $$1, 0.0F, deb.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ded.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ded.b $$5 = this.q[$$4];
            akp<ddu> $$6 = this.a($$2, $$4, $$1);
            akp<ddu> $$7 = this.b($$2, $$4, $$1);
            akp<ddu> $$8 = this.c($$2, $$4, $$1);
            akp<ddu> $$9 = this.a($$2, $$4);
            akp<ddu> $$10 = this.a($$2, $$4, $$1, $$6);
            akp<ddu> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, ded.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, ded.b.a(this.A, this.B), ded.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, ded.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ded.b.a(this.A, this.B), ded.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, ded.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ded.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ded.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, ded.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<ded.d, akp<ddu>>> $$0, ded.b $$1) {
      this.a($$0, this.s, this.o, this.x, ded.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? deb.O : deb.L);
      this.a($$0, this.t, this.o, this.x, ded.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? deb.O : deb.K);
      this.a($$0, this.s, this.o, this.z, ded.b.a(this.r[0], this.r[1]), $$1, 0.0F, deb.L);
      this.a($$0, this.t, this.o, this.z, ded.b.a(this.r[0], this.r[1]), $$1, 0.0F, deb.K);
      this.a($$0, this.s, this.o, ded.b.a(this.x, this.B), ded.b.a(this.r[2], this.r[5]), $$1, 0.0F, deb.L);
      this.a($$0, this.t, this.o, ded.b.a(this.x, this.B), ded.b.a(this.r[2], this.r[5]), $$1, 0.0F, deb.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, deb.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, deb.K);
      this.a($$0, ded.b.a(this.p[1], this.p[2]), this.o, ded.b.a(this.y, this.B), this.r[6], $$1, 0.0F, deb.g);
      this.a($$0, ded.b.a(this.p[3], this.p[4]), this.o, ded.b.a(this.y, this.B), this.r[6], $$1, 0.0F, deb.h);
      this.a($$0, this.s, this.o, ded.b.a(this.y, this.B), this.r[6], $$1, 0.0F, deb.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ded.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ded.b $$5 = this.q[$$4];
            akp<ddu> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ded.b.a(this.A, this.B), ded.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<ded.d, akp<ddu>>> $$0) {
      this.b($$0, this.o, this.o, ded.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, deb.Z);
      this.b($$0, this.o, ded.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, deb.aa);
      this.c($$0, this.o, this.o, this.o, ded.b.a(this.r[0], this.r[1]), this.o, 0.0F, deb.ab);
   }

   private akp<ddu> a(int $$0, int $$1, ded.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         akp<ddu> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private akp<ddu> b(int $$0, int $$1, ded.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private akp<ddu> c(int $$0, int $$1, ded.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private akp<ddu> a(int $$0, int $$1, ded.b $$2, akp<ddu> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? deb.w : $$3;
   }

   private akp<ddu> d(int $$0, int $$1, ded.b $$2) {
      akp<ddu> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private akp<ddu> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return deb.N;
      } else {
         return $$0 == 4 ? deb.f : deb.M;
      }
   }

   private akp<ddu> a(int $$0, ded.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? deb.A : deb.B;
      } else {
         return $$0 < 3 ? deb.A : deb.C;
      }
   }

   private akp<ddu> e(int $$0, int $$1, ded.b $$2) {
      if ($$2.b() >= 0L) {
         akp<ddu> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private akp<ddu> f(int $$0, int $$1, ded.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? deb.I : deb.H;
      } else {
         return $$0 == 3 ? deb.J : this.a($$1, $$2);
      }
   }

   private akp<ddu> g(int $$0, int $$1, ded.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? deb.G : deb.F;
      }
   }

   private akp<ddu> h(int $$0, int $$1, ded.b $$2) {
      akp<ddu> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<ded.d, akp<ddu>>> $$0, ded.b $$1, ded.b $$2, ded.b $$3, ded.b $$4, ded.b $$5, float $$6, akp<ddu> $$7) {
      $$0.accept(Pair.of(ded.a($$1, $$2, $$3, $$4, ded.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(ded.a($$1, $$2, $$3, $$4, ded.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<ded.d, akp<ddu>>> $$0, ded.b $$1, ded.b $$2, ded.b $$3, ded.b $$4, ded.b $$5, float $$6, akp<ddu> $$7) {
      $$0.accept(Pair.of(ded.a($$1, $$2, $$3, $$4, ded.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<ded.d, akp<ddu>>> $$0, ded.b $$1, ded.b $$2, ded.b $$3, ded.b $$4, ded.b $$5, float $$6, akp<ddu> $$7) {
      $$0.accept(Pair.of(ded.a($$1, $$2, $$3, $$4, ded.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dyo $$0, dyo $$1, dyo.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dzc.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dzc.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dzc.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dzc.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)ded.a((float)$$0);
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

   private static String a(double $$0, ded.b[] $$1) {
      double $$2 = (double)ded.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @azs
   public ded.b[] b() {
      return this.p;
   }

   @azs
   public ded.b[] c() {
      return this.q;
   }

   @azs
   public ded.b[] d() {
      return this.r;
   }

   @azs
   public ded.b[] e() {
      return new ded.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @azs
   public ded.b[] f() {
      return new ded.b[]{
         ded.b.a(-2.0F, dzc.a(0.05F)),
         ded.b.a(dzc.a(0.05F), dzc.a(0.26666668F)),
         ded.b.a(dzc.a(0.26666668F), dzc.a(0.4F)),
         ded.b.a(dzc.a(0.4F), dzc.a(0.56666666F)),
         ded.b.a(dzc.a(0.56666666F), 2.0F)
      };
   }

   @azs
   public ded.b[] g() {
      return new ded.b[]{ded.b.a(-2.0F, 0.0F), ded.b.a(0.0F, 2.0F)};
   }
}
