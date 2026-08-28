import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dib {
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
   private final dhu.b o = dhu.b.a(-1.0F, 1.0F);
   private final dhu.b[] p = new dhu.b[]{dhu.b.a(-1.0F, -0.45F), dhu.b.a(-0.45F, -0.15F), dhu.b.a(-0.15F, 0.2F), dhu.b.a(0.2F, 0.55F), dhu.b.a(0.55F, 1.0F)};
   private final dhu.b[] q = new dhu.b[]{dhu.b.a(-1.0F, -0.35F), dhu.b.a(-0.35F, -0.1F), dhu.b.a(-0.1F, 0.1F), dhu.b.a(0.1F, 0.3F), dhu.b.a(0.3F, 1.0F)};
   private final dhu.b[] r = new dhu.b[]{
      dhu.b.a(-1.0F, -0.78F),
      dhu.b.a(-0.78F, -0.375F),
      dhu.b.a(-0.375F, -0.2225F),
      dhu.b.a(-0.2225F, 0.05F),
      dhu.b.a(0.05F, 0.45F),
      dhu.b.a(0.45F, 0.55F),
      dhu.b.a(0.55F, 1.0F)
   };
   private final dhu.b s = this.p[0];
   private final dhu.b t = dhu.b.a(this.p[1], this.p[4]);
   private final dhu.b u = dhu.b.a(-1.2F, -1.05F);
   private final dhu.b v = dhu.b.a(-1.05F, -0.455F);
   private final dhu.b w = dhu.b.a(-0.455F, -0.19F);
   private final dhu.b x = dhu.b.a(-0.19F, -0.11F);
   private final dhu.b y = dhu.b.a(-0.11F, 0.55F);
   private final dhu.b z = dhu.b.a(-0.11F, 0.03F);
   private final dhu.b A = dhu.b.a(0.03F, 0.3F);
   private final dhu.b B = dhu.b.a(0.3F, 1.0F);
   private final aku<dhl>[][] C = new aku[][]{{dhs.Y, dhs.W, dhs.U, dhs.S, dhs.Q}, {dhs.X, dhs.V, dhs.T, dhs.R, dhs.Q}};
   private final aku<dhl>[][] D = new aku[][]{
      {dhs.d, dhs.d, dhs.d, dhs.r, dhs.q},
      {dhs.b, dhs.b, dhs.i, dhs.q, dhs.p},
      {dhs.j, dhs.b, dhs.i, dhs.k, dhs.l},
      {dhs.s, dhs.s, dhs.i, dhs.y, dhs.y},
      {dhs.f, dhs.f, dhs.f, dhs.f, dhs.f}
   };
   private final aku<dhl>[][] E = new aku[][]{
      {dhs.e, null, dhs.r, null, null},
      {null, null, null, null, dhs.o},
      {dhs.c, null, null, dhs.n, null},
      {null, null, dhs.b, dhs.z, dhs.A},
      {null, null, null, null, null}
   };
   private final aku<dhl>[][] F = new aku[][]{
      {dhs.d, dhs.d, dhs.d, dhs.r, dhs.r},
      {dhs.E, dhs.E, dhs.i, dhs.q, dhs.p},
      {dhs.E, dhs.E, dhs.E, dhs.E, dhs.l},
      {dhs.t, dhs.t, dhs.i, dhs.i, dhs.y},
      {dhs.B, dhs.B, dhs.B, dhs.D, dhs.D}
   };
   private final aku<dhl>[][] G = new aku[][]{
      {dhs.e, null, null, null, null},
      {dhs.F, null, dhs.E, dhs.E, dhs.o},
      {dhs.F, dhs.F, dhs.i, dhs.k, dhs.m},
      {null, null, null, null, null},
      {dhs.C, dhs.C, null, null, null}
   };
   private final aku<dhl>[][] H = new aku[][]{
      {dhs.v, dhs.v, dhs.u, dhs.w, dhs.w},
      {dhs.v, dhs.v, dhs.u, dhs.w, dhs.w},
      {dhs.u, dhs.u, dhs.u, dhs.w, dhs.w},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dhu.d> a() {
      dhu.b $$0 = dhu.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dhu.d(this.o, this.o, dhu.b.a(this.y, this.o), this.o, $$0, dhu.b.a(-1.0F, -0.16F), 0L),
         new dhu.d(this.o, this.o, dhu.b.a(this.y, this.o), this.o, $$0, dhu.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dhu.d, aku<dhl>>> $$0) {
      if (ab.ar) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dhu.d, aku<dhl>>> $$0) {
      jt.a $$1 = or.a();
      js<ecm> $$2 = $$1.d(mc.aM);
      ecn.w.a $$3 = new ecn.w.a($$2.b(eda.d));
      ecn.w.a $$4 = new ecn.w.a($$2.b(eda.e));
      ecn.w.a $$5 = new ecn.w.a($$2.b(eda.g));
      $$0.accept(Pair.of(dhu.a(this.o, this.o, this.o, this.o, dhu.b.a(0.0F), this.o, 0.01F), dhs.b));
      if (qt.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, bac.a) instanceof ayb.e<?, ?> $$7) {
         aku<dhl> $$8 = dhs.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dhu.a(this.o, this.o, this.o, dhu.b.a($$9), dhu.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dhs.f ? dhs.B : dhs.f;
         }
      }

      if (qt.a($$3, $$4, $$5, false) instanceof ayb.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dhu.a(this.o, this.o, dhu.b.a($$12), this.o, dhu.b.a(0.0F), this.o, 0.0F), dhs.r));
         }
      }
   }

   private void c(Consumer<Pair<dhu.d, aku<dhl>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dhs.Z);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dhu.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dhu.d, aku<dhl>>> $$0) {
      this.c($$0, dhu.b.a(-1.0F, -0.93333334F));
      this.b($$0, dhu.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dhu.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dhu.b.a(-0.56666666F, -0.4F));
      this.c($$0, dhu.b.a(-0.4F, -0.26666668F));
      this.d($$0, dhu.b.a(-0.26666668F, -0.05F));
      this.e($$0, dhu.b.a(-0.05F, 0.05F));
      this.d($$0, dhu.b.a(0.05F, 0.26666668F));
      this.c($$0, dhu.b.a(0.26666668F, 0.4F));
      this.b($$0, dhu.b.a(0.4F, 0.56666666F));
      this.a($$0, dhu.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dhu.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dhu.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dhu.d, aku<dhl>>> $$0, dhu.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dhu.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dhu.b $$5 = this.q[$$4];
            aku<dhl> $$6 = this.a($$2, $$4, $$1);
            aku<dhl> $$7 = this.b($$2, $$4, $$1);
            aku<dhl> $$8 = this.c($$2, $$4, $$1);
            aku<dhl> $$9 = this.e($$2, $$4, $$1);
            aku<dhl> $$10 = this.h($$2, $$4, $$1);
            aku<dhl> $$11 = this.a($$2, $$4, $$1, $$10);
            aku<dhl> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dhu.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dhu.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dhu.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dhu.b.a(this.x, this.z), dhu.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dhu.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dhu.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dhu.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dhu.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dhu.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dhu.d, aku<dhl>>> $$0, dhu.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dhu.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dhu.b $$5 = this.q[$$4];
            aku<dhl> $$6 = this.a($$2, $$4, $$1);
            aku<dhl> $$7 = this.b($$2, $$4, $$1);
            aku<dhl> $$8 = this.c($$2, $$4, $$1);
            aku<dhl> $$9 = this.e($$2, $$4, $$1);
            aku<dhl> $$10 = this.h($$2, $$4, $$1);
            aku<dhl> $$11 = this.a($$2, $$4, $$1, $$6);
            aku<dhl> $$12 = this.g($$2, $$4, $$1);
            aku<dhl> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dhu.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dhu.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dhu.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dhu.b.a(this.x, this.z), dhu.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dhu.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dhu.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dhu.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dhu.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dhu.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dhu.d, aku<dhl>>> $$0, dhu.b $$1) {
      this.a($$0, this.o, this.o, this.x, dhu.b.a(this.r[0], this.r[2]), $$1, 0.0F, dhs.P);
      this.a($$0, dhu.b.a(this.p[1], this.p[2]), this.o, dhu.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dhs.g);
      this.a($$0, dhu.b.a(this.p[3], this.p[4]), this.o, dhu.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dhs.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dhu.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dhu.b $$5 = this.q[$$4];
            aku<dhl> $$6 = this.a($$2, $$4, $$1);
            aku<dhl> $$7 = this.b($$2, $$4, $$1);
            aku<dhl> $$8 = this.c($$2, $$4, $$1);
            aku<dhl> $$9 = this.h($$2, $$4, $$1);
            aku<dhl> $$10 = this.e($$2, $$4, $$1);
            aku<dhl> $$11 = this.a($$2, $$4);
            aku<dhl> $$12 = this.a($$2, $$4, $$1, $$6);
            aku<dhl> $$13 = this.d($$2, $$4, $$1);
            aku<dhl> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dhu.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dhu.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dhu.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dhu.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dhu.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dhu.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dhu.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dhu.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dhu.d, aku<dhl>>> $$0, dhu.b $$1) {
      this.a($$0, this.o, this.o, this.x, dhu.b.a(this.r[0], this.r[2]), $$1, 0.0F, dhs.P);
      this.a($$0, dhu.b.a(this.p[1], this.p[2]), this.o, dhu.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dhs.g);
      this.a($$0, dhu.b.a(this.p[3], this.p[4]), this.o, dhu.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dhs.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dhu.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dhu.b $$5 = this.q[$$4];
            aku<dhl> $$6 = this.a($$2, $$4, $$1);
            aku<dhl> $$7 = this.b($$2, $$4, $$1);
            aku<dhl> $$8 = this.c($$2, $$4, $$1);
            aku<dhl> $$9 = this.a($$2, $$4);
            aku<dhl> $$10 = this.a($$2, $$4, $$1, $$6);
            aku<dhl> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dhu.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dhu.b.a(this.A, this.B), dhu.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dhu.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dhu.b.a(this.A, this.B), dhu.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dhu.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dhu.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dhu.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dhu.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dhu.d, aku<dhl>>> $$0, dhu.b $$1) {
      this.a($$0, this.s, this.o, this.x, dhu.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dhs.P : dhs.M);
      this.a($$0, this.t, this.o, this.x, dhu.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dhs.P : dhs.L);
      this.a($$0, this.s, this.o, this.z, dhu.b.a(this.r[0], this.r[1]), $$1, 0.0F, dhs.M);
      this.a($$0, this.t, this.o, this.z, dhu.b.a(this.r[0], this.r[1]), $$1, 0.0F, dhs.L);
      this.a($$0, this.s, this.o, dhu.b.a(this.x, this.B), dhu.b.a(this.r[2], this.r[5]), $$1, 0.0F, dhs.M);
      this.a($$0, this.t, this.o, dhu.b.a(this.x, this.B), dhu.b.a(this.r[2], this.r[5]), $$1, 0.0F, dhs.L);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dhs.M);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dhs.L);
      this.a($$0, dhu.b.a(this.p[1], this.p[2]), this.o, dhu.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dhs.g);
      this.a($$0, dhu.b.a(this.p[3], this.p[4]), this.o, dhu.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dhs.h);
      this.a($$0, this.s, this.o, dhu.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dhs.M);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dhu.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dhu.b $$5 = this.q[$$4];
            aku<dhl> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dhu.b.a(this.A, this.B), dhu.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dhu.d, aku<dhl>>> $$0) {
      this.b($$0, this.o, this.o, dhu.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dhs.aa);
      this.b($$0, this.o, dhu.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dhs.ab);
      this.c($$0, this.o, this.o, this.o, dhu.b.a(this.r[0], this.r[1]), this.o, 0.0F, dhs.ac);
   }

   private aku<dhl> a(int $$0, int $$1, dhu.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         aku<dhl> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private aku<dhl> b(int $$0, int $$1, dhu.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private aku<dhl> c(int $$0, int $$1, dhu.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private aku<dhl> a(int $$0, int $$1, dhu.b $$2, aku<dhl> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dhs.x : $$3;
   }

   private aku<dhl> d(int $$0, int $$1, dhu.b $$2) {
      aku<dhl> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private aku<dhl> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dhs.O;
      } else {
         return $$0 == 4 ? dhs.f : dhs.N;
      }
   }

   private aku<dhl> a(int $$0, dhu.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dhs.B : dhs.C;
      } else {
         return $$0 < 3 ? dhs.B : dhs.D;
      }
   }

   private aku<dhl> e(int $$0, int $$1, dhu.b $$2) {
      if ($$2.b() >= 0L) {
         aku<dhl> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private aku<dhl> f(int $$0, int $$1, dhu.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dhs.J : dhs.I;
      } else {
         return $$0 == 3 ? dhs.K : this.a($$1, $$2);
      }
   }

   private aku<dhl> g(int $$0, int $$1, dhu.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dhs.H : dhs.G;
      }
   }

   private aku<dhl> h(int $$0, int $$1, dhu.b $$2) {
      aku<dhl> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dhu.d, aku<dhl>>> $$0, dhu.b $$1, dhu.b $$2, dhu.b $$3, dhu.b $$4, dhu.b $$5, float $$6, aku<dhl> $$7) {
      $$0.accept(Pair.of(dhu.a($$1, $$2, $$3, $$4, dhu.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dhu.a($$1, $$2, $$3, $$4, dhu.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dhu.d, aku<dhl>>> $$0, dhu.b $$1, dhu.b $$2, dhu.b $$3, dhu.b $$4, dhu.b $$5, float $$6, aku<dhl> $$7) {
      $$0.accept(Pair.of(dhu.a($$1, $$2, $$3, $$4, dhu.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dhu.d, aku<dhl>>> $$0, dhu.b $$1, dhu.b $$2, dhu.b $$3, dhu.b $$4, dhu.b $$5, float $$6, aku<dhl> $$7) {
      $$0.accept(Pair.of(dhu.a($$1, $$2, $$3, $$4, dhu.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(ecm $$0, ecm $$1, ecm.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)eda.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)eda.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)eda.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)eda.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dhu.a((float)$$0);
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

   private static String a(double $$0, dhu.b[] $$1) {
      double $$2 = (double)dhu.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bag
   public dhu.b[] b() {
      return this.p;
   }

   @bag
   public dhu.b[] c() {
      return this.q;
   }

   @bag
   public dhu.b[] d() {
      return this.r;
   }

   @bag
   public dhu.b[] e() {
      return new dhu.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @bag
   public dhu.b[] f() {
      return new dhu.b[]{
         dhu.b.a(-2.0F, eda.a(0.05F)),
         dhu.b.a(eda.a(0.05F), eda.a(0.26666668F)),
         dhu.b.a(eda.a(0.26666668F), eda.a(0.4F)),
         dhu.b.a(eda.a(0.4F), eda.a(0.56666666F)),
         dhu.b.a(eda.a(0.56666666F), 2.0F)
      };
   }

   @bag
   public dhu.b[] g() {
      return new dhu.b[]{dhu.b.a(-2.0F, 0.0F), dhu.b.a(0.0F, 2.0F)};
   }
}
