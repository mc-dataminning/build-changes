import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dki {
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
   private final dkb.b o = dkb.b.a(-1.0F, 1.0F);
   private final dkb.b[] p = new dkb.b[]{dkb.b.a(-1.0F, -0.45F), dkb.b.a(-0.45F, -0.15F), dkb.b.a(-0.15F, 0.2F), dkb.b.a(0.2F, 0.55F), dkb.b.a(0.55F, 1.0F)};
   private final dkb.b[] q = new dkb.b[]{dkb.b.a(-1.0F, -0.35F), dkb.b.a(-0.35F, -0.1F), dkb.b.a(-0.1F, 0.1F), dkb.b.a(0.1F, 0.3F), dkb.b.a(0.3F, 1.0F)};
   private final dkb.b[] r = new dkb.b[]{
      dkb.b.a(-1.0F, -0.78F),
      dkb.b.a(-0.78F, -0.375F),
      dkb.b.a(-0.375F, -0.2225F),
      dkb.b.a(-0.2225F, 0.05F),
      dkb.b.a(0.05F, 0.45F),
      dkb.b.a(0.45F, 0.55F),
      dkb.b.a(0.55F, 1.0F)
   };
   private final dkb.b s = this.p[0];
   private final dkb.b t = dkb.b.a(this.p[1], this.p[4]);
   private final dkb.b u = dkb.b.a(-1.2F, -1.05F);
   private final dkb.b v = dkb.b.a(-1.05F, -0.455F);
   private final dkb.b w = dkb.b.a(-0.455F, -0.19F);
   private final dkb.b x = dkb.b.a(-0.19F, -0.11F);
   private final dkb.b y = dkb.b.a(-0.11F, 0.55F);
   private final dkb.b z = dkb.b.a(-0.11F, 0.03F);
   private final dkb.b A = dkb.b.a(0.03F, 0.3F);
   private final dkb.b B = dkb.b.a(0.3F, 1.0F);
   private final ald<djs>[][] C = new ald[][]{{djz.Y, djz.W, djz.U, djz.S, djz.Q}, {djz.X, djz.V, djz.T, djz.R, djz.Q}};
   private final ald<djs>[][] D = new ald[][]{
      {djz.d, djz.d, djz.d, djz.r, djz.q},
      {djz.b, djz.b, djz.i, djz.q, djz.p},
      {djz.j, djz.b, djz.i, djz.k, djz.l},
      {djz.s, djz.s, djz.i, djz.y, djz.y},
      {djz.f, djz.f, djz.f, djz.f, djz.f}
   };
   private final ald<djs>[][] E = new ald[][]{
      {djz.e, null, djz.r, null, null},
      {null, null, null, null, djz.o},
      {djz.c, null, null, djz.n, null},
      {null, null, djz.b, djz.z, djz.A},
      {null, null, null, null, null}
   };
   private final ald<djs>[][] F = new ald[][]{
      {djz.d, djz.d, djz.d, djz.r, djz.r},
      {djz.E, djz.E, djz.i, djz.q, djz.p},
      {djz.E, djz.E, djz.E, djz.E, djz.m},
      {djz.t, djz.t, djz.i, djz.i, djz.y},
      {djz.B, djz.B, djz.B, djz.D, djz.D}
   };
   private final ald<djs>[][] G = new ald[][]{
      {djz.e, null, null, null, null},
      {djz.F, null, djz.E, djz.E, djz.o},
      {djz.F, djz.F, djz.i, djz.k, null},
      {null, null, null, null, null},
      {djz.C, djz.C, null, null, null}
   };
   private final ald<djs>[][] H = new ald[][]{
      {djz.v, djz.v, djz.u, djz.w, djz.w},
      {djz.v, djz.v, djz.u, djz.w, djz.w},
      {djz.u, djz.u, djz.u, djz.w, djz.w},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dkb.d> a() {
      dkb.b $$0 = dkb.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dkb.d(this.o, this.o, dkb.b.a(this.y, this.o), this.o, $$0, dkb.b.a(-1.0F, -0.16F), 0L),
         new dkb.d(this.o, this.o, dkb.b.a(this.y, this.o), this.o, $$0, dkb.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dkb.d, ald<djs>>> $$0) {
      if (ab.ar) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dkb.d, ald<djs>>> $$0) {
      jg.a $$1 = ov.a();
      jf<efg> $$2 = $$1.e(mg.aM);
      efh.w.a $$3 = new efh.w.a($$2.b(efu.d));
      efh.w.a $$4 = new efh.w.a($$2.b(efu.e));
      efh.w.a $$5 = new efh.w.a($$2.b(efu.g));
      $$0.accept(Pair.of(dkb.a(this.o, this.o, this.o, this.o, dkb.b.a(0.0F), this.o, 0.01F), djz.b));
      if (qw.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, bap.a) instanceof ayl.e<?, ?> $$7) {
         ald<djs> $$8 = djz.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dkb.a(this.o, this.o, this.o, dkb.b.a($$9), dkb.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == djz.f ? djz.B : djz.f;
         }
      }

      if (qw.a($$3, $$4, $$5, false) instanceof ayl.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dkb.a(this.o, this.o, dkb.b.a($$12), this.o, dkb.b.a(0.0F), this.o, 0.0F), djz.r));
         }
      }
   }

   private void c(Consumer<Pair<dkb.d, ald<djs>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, djz.Z);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dkb.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dkb.d, ald<djs>>> $$0) {
      this.c($$0, dkb.b.a(-1.0F, -0.93333334F));
      this.b($$0, dkb.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dkb.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dkb.b.a(-0.56666666F, -0.4F));
      this.c($$0, dkb.b.a(-0.4F, -0.26666668F));
      this.d($$0, dkb.b.a(-0.26666668F, -0.05F));
      this.e($$0, dkb.b.a(-0.05F, 0.05F));
      this.d($$0, dkb.b.a(0.05F, 0.26666668F));
      this.c($$0, dkb.b.a(0.26666668F, 0.4F));
      this.b($$0, dkb.b.a(0.4F, 0.56666666F));
      this.a($$0, dkb.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dkb.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dkb.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dkb.d, ald<djs>>> $$0, dkb.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dkb.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dkb.b $$5 = this.q[$$4];
            ald<djs> $$6 = this.a($$2, $$4, $$1);
            ald<djs> $$7 = this.b($$2, $$4, $$1);
            ald<djs> $$8 = this.c($$2, $$4, $$1);
            ald<djs> $$9 = this.e($$2, $$4, $$1);
            ald<djs> $$10 = this.h($$2, $$4, $$1);
            ald<djs> $$11 = this.a($$2, $$4, $$1, $$10);
            ald<djs> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dkb.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dkb.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dkb.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dkb.b.a(this.x, this.z), dkb.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkb.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dkb.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkb.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dkb.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dkb.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dkb.d, ald<djs>>> $$0, dkb.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dkb.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dkb.b $$5 = this.q[$$4];
            ald<djs> $$6 = this.a($$2, $$4, $$1);
            ald<djs> $$7 = this.b($$2, $$4, $$1);
            ald<djs> $$8 = this.c($$2, $$4, $$1);
            ald<djs> $$9 = this.e($$2, $$4, $$1);
            ald<djs> $$10 = this.h($$2, $$4, $$1);
            ald<djs> $$11 = this.a($$2, $$4, $$1, $$6);
            ald<djs> $$12 = this.g($$2, $$4, $$1);
            ald<djs> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dkb.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dkb.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dkb.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dkb.b.a(this.x, this.z), dkb.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkb.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dkb.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkb.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dkb.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dkb.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dkb.d, ald<djs>>> $$0, dkb.b $$1) {
      this.a($$0, this.o, this.o, this.x, dkb.b.a(this.r[0], this.r[2]), $$1, 0.0F, djz.P);
      this.a($$0, dkb.b.a(this.p[1], this.p[2]), this.o, dkb.b.a(this.z, this.B), this.r[6], $$1, 0.0F, djz.g);
      this.a($$0, dkb.b.a(this.p[3], this.p[4]), this.o, dkb.b.a(this.z, this.B), this.r[6], $$1, 0.0F, djz.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dkb.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dkb.b $$5 = this.q[$$4];
            ald<djs> $$6 = this.a($$2, $$4, $$1);
            ald<djs> $$7 = this.b($$2, $$4, $$1);
            ald<djs> $$8 = this.c($$2, $$4, $$1);
            ald<djs> $$9 = this.h($$2, $$4, $$1);
            ald<djs> $$10 = this.e($$2, $$4, $$1);
            ald<djs> $$11 = this.a($$2, $$4);
            ald<djs> $$12 = this.a($$2, $$4, $$1, $$6);
            ald<djs> $$13 = this.d($$2, $$4, $$1);
            ald<djs> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dkb.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dkb.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dkb.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkb.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dkb.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dkb.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dkb.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dkb.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dkb.d, ald<djs>>> $$0, dkb.b $$1) {
      this.a($$0, this.o, this.o, this.x, dkb.b.a(this.r[0], this.r[2]), $$1, 0.0F, djz.P);
      this.a($$0, dkb.b.a(this.p[1], this.p[2]), this.o, dkb.b.a(this.z, this.B), this.r[6], $$1, 0.0F, djz.g);
      this.a($$0, dkb.b.a(this.p[3], this.p[4]), this.o, dkb.b.a(this.z, this.B), this.r[6], $$1, 0.0F, djz.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dkb.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dkb.b $$5 = this.q[$$4];
            ald<djs> $$6 = this.a($$2, $$4, $$1);
            ald<djs> $$7 = this.b($$2, $$4, $$1);
            ald<djs> $$8 = this.c($$2, $$4, $$1);
            ald<djs> $$9 = this.a($$2, $$4);
            ald<djs> $$10 = this.a($$2, $$4, $$1, $$6);
            ald<djs> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dkb.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dkb.b.a(this.A, this.B), dkb.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dkb.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dkb.b.a(this.A, this.B), dkb.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dkb.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dkb.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dkb.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dkb.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dkb.d, ald<djs>>> $$0, dkb.b $$1) {
      this.a($$0, this.s, this.o, this.x, dkb.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? djz.P : djz.M);
      this.a($$0, this.t, this.o, this.x, dkb.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? djz.P : djz.L);
      this.a($$0, this.s, this.o, this.z, dkb.b.a(this.r[0], this.r[1]), $$1, 0.0F, djz.M);
      this.a($$0, this.t, this.o, this.z, dkb.b.a(this.r[0], this.r[1]), $$1, 0.0F, djz.L);
      this.a($$0, this.s, this.o, dkb.b.a(this.x, this.B), dkb.b.a(this.r[2], this.r[5]), $$1, 0.0F, djz.M);
      this.a($$0, this.t, this.o, dkb.b.a(this.x, this.B), dkb.b.a(this.r[2], this.r[5]), $$1, 0.0F, djz.L);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, djz.M);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, djz.L);
      this.a($$0, dkb.b.a(this.p[1], this.p[2]), this.o, dkb.b.a(this.y, this.B), this.r[6], $$1, 0.0F, djz.g);
      this.a($$0, dkb.b.a(this.p[3], this.p[4]), this.o, dkb.b.a(this.y, this.B), this.r[6], $$1, 0.0F, djz.h);
      this.a($$0, this.s, this.o, dkb.b.a(this.y, this.B), this.r[6], $$1, 0.0F, djz.M);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dkb.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dkb.b $$5 = this.q[$$4];
            ald<djs> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dkb.b.a(this.A, this.B), dkb.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dkb.d, ald<djs>>> $$0) {
      this.b($$0, this.o, this.o, dkb.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, djz.aa);
      this.b($$0, this.o, dkb.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, djz.ab);
      this.c($$0, this.o, this.o, this.o, dkb.b.a(this.r[0], this.r[1]), this.o, 0.0F, djz.ac);
   }

   private ald<djs> a(int $$0, int $$1, dkb.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         ald<djs> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private ald<djs> b(int $$0, int $$1, dkb.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private ald<djs> c(int $$0, int $$1, dkb.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private ald<djs> a(int $$0, int $$1, dkb.b $$2, ald<djs> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? djz.x : $$3;
   }

   private ald<djs> d(int $$0, int $$1, dkb.b $$2) {
      ald<djs> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private ald<djs> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return djz.O;
      } else {
         return $$0 == 4 ? djz.f : djz.N;
      }
   }

   private ald<djs> a(int $$0, dkb.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? djz.B : djz.C;
      } else {
         return $$0 < 3 ? djz.B : djz.D;
      }
   }

   private ald<djs> e(int $$0, int $$1, dkb.b $$2) {
      if ($$2.b() >= 0L) {
         ald<djs> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private ald<djs> f(int $$0, int $$1, dkb.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? djz.J : djz.I;
      } else {
         return $$0 == 3 ? djz.K : this.a($$1, $$2);
      }
   }

   private ald<djs> g(int $$0, int $$1, dkb.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? djz.H : djz.G;
      }
   }

   private ald<djs> h(int $$0, int $$1, dkb.b $$2) {
      ald<djs> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dkb.d, ald<djs>>> $$0, dkb.b $$1, dkb.b $$2, dkb.b $$3, dkb.b $$4, dkb.b $$5, float $$6, ald<djs> $$7) {
      $$0.accept(Pair.of(dkb.a($$1, $$2, $$3, $$4, dkb.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dkb.a($$1, $$2, $$3, $$4, dkb.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dkb.d, ald<djs>>> $$0, dkb.b $$1, dkb.b $$2, dkb.b $$3, dkb.b $$4, dkb.b $$5, float $$6, ald<djs> $$7) {
      $$0.accept(Pair.of(dkb.a($$1, $$2, $$3, $$4, dkb.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dkb.d, ald<djs>>> $$0, dkb.b $$1, dkb.b $$2, dkb.b $$3, dkb.b $$4, dkb.b $$5, float $$6, ald<djs> $$7) {
      $$0.accept(Pair.of(dkb.a($$1, $$2, $$3, $$4, dkb.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(efg $$0, efg $$1, efg.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)efu.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)efu.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)efu.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)efu.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dkb.a((float)$$0);
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

   private static String a(double $$0, dkb.b[] $$1) {
      double $$2 = (double)dkb.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bat
   public dkb.b[] b() {
      return this.p;
   }

   @bat
   public dkb.b[] c() {
      return this.q;
   }

   @bat
   public dkb.b[] d() {
      return this.r;
   }

   @bat
   public dkb.b[] e() {
      return new dkb.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @bat
   public dkb.b[] f() {
      return new dkb.b[]{
         dkb.b.a(-2.0F, efu.a(0.05F)),
         dkb.b.a(efu.a(0.05F), efu.a(0.26666668F)),
         dkb.b.a(efu.a(0.26666668F), efu.a(0.4F)),
         dkb.b.a(efu.a(0.4F), efu.a(0.56666666F)),
         dkb.b.a(efu.a(0.56666666F), 2.0F)
      };
   }

   @bat
   public dkb.b[] g() {
      return new dkb.b[]{dkb.b.a(-2.0F, 0.0F), dkb.b.a(0.0F, 2.0F)};
   }
}
