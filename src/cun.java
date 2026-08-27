import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class cun {
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
   private final cug.b o = cug.b.a(-1.0F, 1.0F);
   private final cug.b[] p = new cug.b[]{cug.b.a(-1.0F, -0.45F), cug.b.a(-0.45F, -0.15F), cug.b.a(-0.15F, 0.2F), cug.b.a(0.2F, 0.55F), cug.b.a(0.55F, 1.0F)};
   private final cug.b[] q = new cug.b[]{cug.b.a(-1.0F, -0.35F), cug.b.a(-0.35F, -0.1F), cug.b.a(-0.1F, 0.1F), cug.b.a(0.1F, 0.3F), cug.b.a(0.3F, 1.0F)};
   private final cug.b[] r = new cug.b[]{
      cug.b.a(-1.0F, -0.78F),
      cug.b.a(-0.78F, -0.375F),
      cug.b.a(-0.375F, -0.2225F),
      cug.b.a(-0.2225F, 0.05F),
      cug.b.a(0.05F, 0.45F),
      cug.b.a(0.45F, 0.55F),
      cug.b.a(0.55F, 1.0F)
   };
   private final cug.b s = this.p[0];
   private final cug.b t = cug.b.a(this.p[1], this.p[4]);
   private final cug.b u = cug.b.a(-1.2F, -1.05F);
   private final cug.b v = cug.b.a(-1.05F, -0.455F);
   private final cug.b w = cug.b.a(-0.455F, -0.19F);
   private final cug.b x = cug.b.a(-0.19F, -0.11F);
   private final cug.b y = cug.b.a(-0.11F, 0.55F);
   private final cug.b z = cug.b.a(-0.11F, 0.03F);
   private final cug.b A = cug.b.a(0.03F, 0.3F);
   private final cug.b B = cug.b.a(0.3F, 1.0F);
   private final ags<ctx>[][] C = new ags[][]{{cue.X, cue.V, cue.T, cue.R, cue.P}, {cue.W, cue.U, cue.S, cue.Q, cue.P}};
   private final ags<ctx>[][] D = new ags[][]{
      {cue.d, cue.d, cue.d, cue.q, cue.p},
      {cue.b, cue.b, cue.i, cue.p, cue.o},
      {cue.j, cue.b, cue.i, cue.k, cue.l},
      {cue.r, cue.r, cue.i, cue.x, cue.x},
      {cue.f, cue.f, cue.f, cue.f, cue.f}
   };
   private final ags<ctx>[][] E = new ags[][]{
      {cue.e, null, cue.q, null, null},
      {null, null, null, null, cue.n},
      {cue.c, null, null, cue.m, null},
      {null, null, cue.b, cue.y, cue.z},
      {null, null, null, null, null}
   };
   private final ags<ctx>[][] F = new ags[][]{
      {cue.d, cue.d, cue.d, cue.q, cue.q},
      {cue.D, cue.D, cue.i, cue.p, cue.o},
      {cue.D, cue.D, cue.D, cue.D, cue.l},
      {cue.s, cue.s, cue.i, cue.i, cue.x},
      {cue.A, cue.A, cue.A, cue.C, cue.C}
   };
   private final ags<ctx>[][] G = new ags[][]{
      {cue.e, null, null, null, null},
      {cue.E, null, cue.D, cue.D, cue.n},
      {cue.E, cue.E, cue.i, cue.k, null},
      {null, null, null, null, null},
      {cue.B, cue.B, null, null, null}
   };
   private final ags<ctx>[][] H = new ags[][]{
      {cue.u, cue.u, cue.t, cue.v, cue.v},
      {cue.u, cue.u, cue.t, cue.v, cue.v},
      {cue.t, cue.t, cue.t, cue.v, cue.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<cug.d> a() {
      cug.b $$0 = cug.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new cug.d(this.o, this.o, cug.b.a(this.y, this.o), this.o, $$0, cug.b.a(-1.0F, -0.16F), 0L),
         new cug.d(this.o, this.o, cug.b.a(this.y, this.o), this.o, $$0, cug.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<cug.d, ags<ctx>>> $$0) {
      if (aa.at) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<cug.d, ags<ctx>>> $$0) {
      ih.b $$1 = nl.a();
      ig<dnr> $$2 = $$1.b(kc.aw);
      dns.w.a $$3 = new dns.w.a($$2.b(dof.d));
      dns.w.a $$4 = new dns.w.a($$2.b(dof.e));
      dns.w.a $$5 = new dns.w.a($$2.b(dof.g));
      $$0.accept(Pair.of(cug.a(this.o, this.o, this.o, this.o, cug.b.a(0.0F), this.o, 0.01F), cue.b));
      if (pp.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, ava.a) instanceof ata.e<?, ?> $$7) {
         ags<ctx> $$8 = cue.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(cug.a(this.o, this.o, this.o, cug.b.a($$9), cug.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == cue.f ? cue.A : cue.f;
         }
      }

      if (pp.a($$3, $$4, $$5, false) instanceof ata.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(cug.a(this.o, this.o, cug.b.a($$12), this.o, cug.b.a(0.0F), this.o, 0.0F), cue.q));
         }
      }
   }

   private void c(Consumer<Pair<cug.d, ags<ctx>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, cue.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         cug.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<cug.d, ags<ctx>>> $$0) {
      this.c($$0, cug.b.a(-1.0F, -0.93333334F));
      this.b($$0, cug.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, cug.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, cug.b.a(-0.56666666F, -0.4F));
      this.c($$0, cug.b.a(-0.4F, -0.26666668F));
      this.d($$0, cug.b.a(-0.26666668F, -0.05F));
      this.e($$0, cug.b.a(-0.05F, 0.05F));
      this.d($$0, cug.b.a(0.05F, 0.26666668F));
      this.c($$0, cug.b.a(0.26666668F, 0.4F));
      this.b($$0, cug.b.a(0.4F, 0.56666666F));
      this.a($$0, cug.b.a(0.56666666F, 0.7666667F));
      this.b($$0, cug.b.a(0.7666667F, 0.93333334F));
      this.c($$0, cug.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<cug.d, ags<ctx>>> $$0, cug.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cug.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cug.b $$5 = this.q[$$4];
            ags<ctx> $$6 = this.a($$2, $$4, $$1);
            ags<ctx> $$7 = this.b($$2, $$4, $$1);
            ags<ctx> $$8 = this.c($$2, $$4, $$1);
            ags<ctx> $$9 = this.e($$2, $$4, $$1);
            ags<ctx> $$10 = this.h($$2, $$4, $$1);
            ags<ctx> $$11 = this.a($$2, $$4, $$1, $$10);
            ags<ctx> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cug.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cug.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cug.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cug.b.a(this.x, this.z), cug.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cug.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cug.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cug.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cug.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cug.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<cug.d, ags<ctx>>> $$0, cug.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cug.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cug.b $$5 = this.q[$$4];
            ags<ctx> $$6 = this.a($$2, $$4, $$1);
            ags<ctx> $$7 = this.b($$2, $$4, $$1);
            ags<ctx> $$8 = this.c($$2, $$4, $$1);
            ags<ctx> $$9 = this.e($$2, $$4, $$1);
            ags<ctx> $$10 = this.h($$2, $$4, $$1);
            ags<ctx> $$11 = this.a($$2, $$4, $$1, $$6);
            ags<ctx> $$12 = this.g($$2, $$4, $$1);
            ags<ctx> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, cug.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cug.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cug.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cug.b.a(this.x, this.z), cug.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cug.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cug.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cug.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cug.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cug.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<cug.d, ags<ctx>>> $$0, cug.b $$1) {
      this.a($$0, this.o, this.o, this.x, cug.b.a(this.r[0], this.r[2]), $$1, 0.0F, cue.O);
      this.a($$0, cug.b.a(this.p[1], this.p[2]), this.o, cug.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cue.g);
      this.a($$0, cug.b.a(this.p[3], this.p[4]), this.o, cug.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cue.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cug.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cug.b $$5 = this.q[$$4];
            ags<ctx> $$6 = this.a($$2, $$4, $$1);
            ags<ctx> $$7 = this.b($$2, $$4, $$1);
            ags<ctx> $$8 = this.c($$2, $$4, $$1);
            ags<ctx> $$9 = this.h($$2, $$4, $$1);
            ags<ctx> $$10 = this.e($$2, $$4, $$1);
            ags<ctx> $$11 = this.a($$2, $$4);
            ags<ctx> $$12 = this.a($$2, $$4, $$1, $$6);
            ags<ctx> $$13 = this.d($$2, $$4, $$1);
            ags<ctx> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cug.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, cug.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cug.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cug.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, cug.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, cug.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cug.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cug.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<cug.d, ags<ctx>>> $$0, cug.b $$1) {
      this.a($$0, this.o, this.o, this.x, cug.b.a(this.r[0], this.r[2]), $$1, 0.0F, cue.O);
      this.a($$0, cug.b.a(this.p[1], this.p[2]), this.o, cug.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cue.g);
      this.a($$0, cug.b.a(this.p[3], this.p[4]), this.o, cug.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cue.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cug.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cug.b $$5 = this.q[$$4];
            ags<ctx> $$6 = this.a($$2, $$4, $$1);
            ags<ctx> $$7 = this.b($$2, $$4, $$1);
            ags<ctx> $$8 = this.c($$2, $$4, $$1);
            ags<ctx> $$9 = this.a($$2, $$4);
            ags<ctx> $$10 = this.a($$2, $$4, $$1, $$6);
            ags<ctx> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, cug.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, cug.b.a(this.A, this.B), cug.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, cug.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cug.b.a(this.A, this.B), cug.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, cug.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cug.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cug.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cug.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<cug.d, ags<ctx>>> $$0, cug.b $$1) {
      this.a($$0, this.s, this.o, this.x, cug.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cue.O : cue.L);
      this.a($$0, this.t, this.o, this.x, cug.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cue.O : cue.K);
      this.a($$0, this.s, this.o, this.z, cug.b.a(this.r[0], this.r[1]), $$1, 0.0F, cue.L);
      this.a($$0, this.t, this.o, this.z, cug.b.a(this.r[0], this.r[1]), $$1, 0.0F, cue.K);
      this.a($$0, this.s, this.o, cug.b.a(this.x, this.B), cug.b.a(this.r[2], this.r[5]), $$1, 0.0F, cue.L);
      this.a($$0, this.t, this.o, cug.b.a(this.x, this.B), cug.b.a(this.r[2], this.r[5]), $$1, 0.0F, cue.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, cue.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, cue.K);
      this.a($$0, cug.b.a(this.p[1], this.p[2]), this.o, cug.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cue.g);
      this.a($$0, cug.b.a(this.p[3], this.p[4]), this.o, cug.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cue.h);
      this.a($$0, this.s, this.o, cug.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cue.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cug.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cug.b $$5 = this.q[$$4];
            ags<ctx> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cug.b.a(this.A, this.B), cug.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<cug.d, ags<ctx>>> $$0) {
      this.b($$0, this.o, this.o, cug.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, cue.Z);
      this.b($$0, this.o, cug.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, cue.aa);
      this.c($$0, this.o, this.o, this.o, cug.b.a(this.r[0], this.r[1]), this.o, 0.0F, cue.ab);
   }

   private ags<ctx> a(int $$0, int $$1, cug.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         ags<ctx> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private ags<ctx> b(int $$0, int $$1, cug.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private ags<ctx> c(int $$0, int $$1, cug.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private ags<ctx> a(int $$0, int $$1, cug.b $$2, ags<ctx> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? cue.w : $$3;
   }

   private ags<ctx> d(int $$0, int $$1, cug.b $$2) {
      ags<ctx> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private ags<ctx> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return cue.N;
      } else {
         return $$0 == 4 ? cue.f : cue.M;
      }
   }

   private ags<ctx> a(int $$0, cug.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? cue.A : cue.B;
      } else {
         return $$0 < 3 ? cue.A : cue.C;
      }
   }

   private ags<ctx> e(int $$0, int $$1, cug.b $$2) {
      if ($$2.b() >= 0L) {
         ags<ctx> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private ags<ctx> f(int $$0, int $$1, cug.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? cue.I : cue.H;
      } else {
         return $$0 == 3 ? cue.J : this.a($$1, $$2);
      }
   }

   private ags<ctx> g(int $$0, int $$1, cug.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? cue.G : cue.F;
      }
   }

   private ags<ctx> h(int $$0, int $$1, cug.b $$2) {
      ags<ctx> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<cug.d, ags<ctx>>> $$0, cug.b $$1, cug.b $$2, cug.b $$3, cug.b $$4, cug.b $$5, float $$6, ags<ctx> $$7) {
      $$0.accept(Pair.of(cug.a($$1, $$2, $$3, $$4, cug.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(cug.a($$1, $$2, $$3, $$4, cug.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<cug.d, ags<ctx>>> $$0, cug.b $$1, cug.b $$2, cug.b $$3, cug.b $$4, cug.b $$5, float $$6, ags<ctx> $$7) {
      $$0.accept(Pair.of(cug.a($$1, $$2, $$3, $$4, cug.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<cug.d, ags<ctx>>> $$0, cug.b $$1, cug.b $$2, cug.b $$3, cug.b $$4, cug.b $$5, float $$6, ags<ctx> $$7) {
      $$0.accept(Pair.of(cug.a($$1, $$2, $$3, $$4, cug.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dnr $$0, dnr $$1, dnr.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dof.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dof.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dof.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dof.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)cug.a((float)$$0);
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

   private static String a(double $$0, cug.b[] $$1) {
      double $$2 = (double)cug.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @avd
   public cug.b[] b() {
      return this.p;
   }

   @avd
   public cug.b[] c() {
      return this.q;
   }

   @avd
   public cug.b[] d() {
      return this.r;
   }

   @avd
   public cug.b[] e() {
      return new cug.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @avd
   public cug.b[] f() {
      return new cug.b[]{
         cug.b.a(-2.0F, dof.a(0.05F)),
         cug.b.a(dof.a(0.05F), dof.a(0.26666668F)),
         cug.b.a(dof.a(0.26666668F), dof.a(0.4F)),
         cug.b.a(dof.a(0.4F), dof.a(0.56666666F)),
         cug.b.a(dof.a(0.56666666F), 2.0F)
      };
   }

   @avd
   public cug.b[] g() {
      return new cug.b[]{cug.b.a(-2.0F, 0.0F), cug.b.a(0.0F, 2.0F)};
   }
}
