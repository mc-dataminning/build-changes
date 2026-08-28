import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dia {
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
   private final dht.b o = dht.b.a(-1.0F, 1.0F);
   private final dht.b[] p = new dht.b[]{dht.b.a(-1.0F, -0.45F), dht.b.a(-0.45F, -0.15F), dht.b.a(-0.15F, 0.2F), dht.b.a(0.2F, 0.55F), dht.b.a(0.55F, 1.0F)};
   private final dht.b[] q = new dht.b[]{dht.b.a(-1.0F, -0.35F), dht.b.a(-0.35F, -0.1F), dht.b.a(-0.1F, 0.1F), dht.b.a(0.1F, 0.3F), dht.b.a(0.3F, 1.0F)};
   private final dht.b[] r = new dht.b[]{
      dht.b.a(-1.0F, -0.78F),
      dht.b.a(-0.78F, -0.375F),
      dht.b.a(-0.375F, -0.2225F),
      dht.b.a(-0.2225F, 0.05F),
      dht.b.a(0.05F, 0.45F),
      dht.b.a(0.45F, 0.55F),
      dht.b.a(0.55F, 1.0F)
   };
   private final dht.b s = this.p[0];
   private final dht.b t = dht.b.a(this.p[1], this.p[4]);
   private final dht.b u = dht.b.a(-1.2F, -1.05F);
   private final dht.b v = dht.b.a(-1.05F, -0.455F);
   private final dht.b w = dht.b.a(-0.455F, -0.19F);
   private final dht.b x = dht.b.a(-0.19F, -0.11F);
   private final dht.b y = dht.b.a(-0.11F, 0.55F);
   private final dht.b z = dht.b.a(-0.11F, 0.03F);
   private final dht.b A = dht.b.a(0.03F, 0.3F);
   private final dht.b B = dht.b.a(0.3F, 1.0F);
   private final aku<dhk>[][] C = new aku[][]{{dhr.Y, dhr.W, dhr.U, dhr.S, dhr.Q}, {dhr.X, dhr.V, dhr.T, dhr.R, dhr.Q}};
   private final aku<dhk>[][] D = new aku[][]{
      {dhr.d, dhr.d, dhr.d, dhr.r, dhr.q},
      {dhr.b, dhr.b, dhr.i, dhr.q, dhr.p},
      {dhr.j, dhr.b, dhr.i, dhr.k, dhr.l},
      {dhr.s, dhr.s, dhr.i, dhr.y, dhr.y},
      {dhr.f, dhr.f, dhr.f, dhr.f, dhr.f}
   };
   private final aku<dhk>[][] E = new aku[][]{
      {dhr.e, null, dhr.r, null, null},
      {null, null, null, null, dhr.o},
      {dhr.c, null, null, dhr.n, null},
      {null, null, dhr.b, dhr.z, dhr.A},
      {null, null, null, null, null}
   };
   private final aku<dhk>[][] F = new aku[][]{
      {dhr.d, dhr.d, dhr.d, dhr.r, dhr.r},
      {dhr.E, dhr.E, dhr.i, dhr.q, dhr.p},
      {dhr.E, dhr.E, dhr.E, dhr.E, dhr.l},
      {dhr.t, dhr.t, dhr.i, dhr.i, dhr.y},
      {dhr.B, dhr.B, dhr.B, dhr.D, dhr.D}
   };
   private final aku<dhk>[][] G = new aku[][]{
      {dhr.e, null, null, null, null},
      {dhr.F, null, dhr.E, dhr.E, dhr.o},
      {dhr.F, dhr.F, dhr.i, dhr.k, dhr.m},
      {null, null, null, null, null},
      {dhr.C, dhr.C, null, null, null}
   };
   private final aku<dhk>[][] H = new aku[][]{
      {dhr.v, dhr.v, dhr.u, dhr.w, dhr.w},
      {dhr.v, dhr.v, dhr.u, dhr.w, dhr.w},
      {dhr.u, dhr.u, dhr.u, dhr.w, dhr.w},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dht.d> a() {
      dht.b $$0 = dht.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dht.d(this.o, this.o, dht.b.a(this.y, this.o), this.o, $$0, dht.b.a(-1.0F, -0.16F), 0L),
         new dht.d(this.o, this.o, dht.b.a(this.y, this.o), this.o, $$0, dht.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dht.d, aku<dhk>>> $$0) {
      if (ab.ar) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dht.d, aku<dhk>>> $$0) {
      jt.a $$1 = or.a();
      js<ecl> $$2 = $$1.d(mc.aM);
      ecm.w.a $$3 = new ecm.w.a($$2.b(ecz.d));
      ecm.w.a $$4 = new ecm.w.a($$2.b(ecz.e));
      ecm.w.a $$5 = new ecm.w.a($$2.b(ecz.g));
      $$0.accept(Pair.of(dht.a(this.o, this.o, this.o, this.o, dht.b.a(0.0F), this.o, 0.01F), dhr.b));
      if (qt.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, bac.a) instanceof ayb.e<?, ?> $$7) {
         aku<dhk> $$8 = dhr.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dht.a(this.o, this.o, this.o, dht.b.a($$9), dht.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dhr.f ? dhr.B : dhr.f;
         }
      }

      if (qt.a($$3, $$4, $$5, false) instanceof ayb.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dht.a(this.o, this.o, dht.b.a($$12), this.o, dht.b.a(0.0F), this.o, 0.0F), dhr.r));
         }
      }
   }

   private void c(Consumer<Pair<dht.d, aku<dhk>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dhr.Z);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dht.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dht.d, aku<dhk>>> $$0) {
      this.c($$0, dht.b.a(-1.0F, -0.93333334F));
      this.b($$0, dht.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dht.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dht.b.a(-0.56666666F, -0.4F));
      this.c($$0, dht.b.a(-0.4F, -0.26666668F));
      this.d($$0, dht.b.a(-0.26666668F, -0.05F));
      this.e($$0, dht.b.a(-0.05F, 0.05F));
      this.d($$0, dht.b.a(0.05F, 0.26666668F));
      this.c($$0, dht.b.a(0.26666668F, 0.4F));
      this.b($$0, dht.b.a(0.4F, 0.56666666F));
      this.a($$0, dht.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dht.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dht.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dht.d, aku<dhk>>> $$0, dht.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dht.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dht.b $$5 = this.q[$$4];
            aku<dhk> $$6 = this.a($$2, $$4, $$1);
            aku<dhk> $$7 = this.b($$2, $$4, $$1);
            aku<dhk> $$8 = this.c($$2, $$4, $$1);
            aku<dhk> $$9 = this.e($$2, $$4, $$1);
            aku<dhk> $$10 = this.h($$2, $$4, $$1);
            aku<dhk> $$11 = this.a($$2, $$4, $$1, $$10);
            aku<dhk> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dht.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dht.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dht.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dht.b.a(this.x, this.z), dht.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dht.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dht.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dht.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dht.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dht.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dht.d, aku<dhk>>> $$0, dht.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dht.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dht.b $$5 = this.q[$$4];
            aku<dhk> $$6 = this.a($$2, $$4, $$1);
            aku<dhk> $$7 = this.b($$2, $$4, $$1);
            aku<dhk> $$8 = this.c($$2, $$4, $$1);
            aku<dhk> $$9 = this.e($$2, $$4, $$1);
            aku<dhk> $$10 = this.h($$2, $$4, $$1);
            aku<dhk> $$11 = this.a($$2, $$4, $$1, $$6);
            aku<dhk> $$12 = this.g($$2, $$4, $$1);
            aku<dhk> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dht.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dht.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dht.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dht.b.a(this.x, this.z), dht.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dht.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dht.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dht.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dht.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dht.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dht.d, aku<dhk>>> $$0, dht.b $$1) {
      this.a($$0, this.o, this.o, this.x, dht.b.a(this.r[0], this.r[2]), $$1, 0.0F, dhr.P);
      this.a($$0, dht.b.a(this.p[1], this.p[2]), this.o, dht.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dhr.g);
      this.a($$0, dht.b.a(this.p[3], this.p[4]), this.o, dht.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dhr.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dht.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dht.b $$5 = this.q[$$4];
            aku<dhk> $$6 = this.a($$2, $$4, $$1);
            aku<dhk> $$7 = this.b($$2, $$4, $$1);
            aku<dhk> $$8 = this.c($$2, $$4, $$1);
            aku<dhk> $$9 = this.h($$2, $$4, $$1);
            aku<dhk> $$10 = this.e($$2, $$4, $$1);
            aku<dhk> $$11 = this.a($$2, $$4);
            aku<dhk> $$12 = this.a($$2, $$4, $$1, $$6);
            aku<dhk> $$13 = this.d($$2, $$4, $$1);
            aku<dhk> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dht.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dht.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dht.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dht.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dht.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dht.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dht.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dht.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dht.d, aku<dhk>>> $$0, dht.b $$1) {
      this.a($$0, this.o, this.o, this.x, dht.b.a(this.r[0], this.r[2]), $$1, 0.0F, dhr.P);
      this.a($$0, dht.b.a(this.p[1], this.p[2]), this.o, dht.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dhr.g);
      this.a($$0, dht.b.a(this.p[3], this.p[4]), this.o, dht.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dhr.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dht.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dht.b $$5 = this.q[$$4];
            aku<dhk> $$6 = this.a($$2, $$4, $$1);
            aku<dhk> $$7 = this.b($$2, $$4, $$1);
            aku<dhk> $$8 = this.c($$2, $$4, $$1);
            aku<dhk> $$9 = this.a($$2, $$4);
            aku<dhk> $$10 = this.a($$2, $$4, $$1, $$6);
            aku<dhk> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dht.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dht.b.a(this.A, this.B), dht.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dht.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dht.b.a(this.A, this.B), dht.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dht.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dht.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dht.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dht.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dht.d, aku<dhk>>> $$0, dht.b $$1) {
      this.a($$0, this.s, this.o, this.x, dht.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dhr.P : dhr.M);
      this.a($$0, this.t, this.o, this.x, dht.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dhr.P : dhr.L);
      this.a($$0, this.s, this.o, this.z, dht.b.a(this.r[0], this.r[1]), $$1, 0.0F, dhr.M);
      this.a($$0, this.t, this.o, this.z, dht.b.a(this.r[0], this.r[1]), $$1, 0.0F, dhr.L);
      this.a($$0, this.s, this.o, dht.b.a(this.x, this.B), dht.b.a(this.r[2], this.r[5]), $$1, 0.0F, dhr.M);
      this.a($$0, this.t, this.o, dht.b.a(this.x, this.B), dht.b.a(this.r[2], this.r[5]), $$1, 0.0F, dhr.L);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dhr.M);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dhr.L);
      this.a($$0, dht.b.a(this.p[1], this.p[2]), this.o, dht.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dhr.g);
      this.a($$0, dht.b.a(this.p[3], this.p[4]), this.o, dht.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dhr.h);
      this.a($$0, this.s, this.o, dht.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dhr.M);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dht.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dht.b $$5 = this.q[$$4];
            aku<dhk> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dht.b.a(this.A, this.B), dht.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dht.d, aku<dhk>>> $$0) {
      this.b($$0, this.o, this.o, dht.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dhr.aa);
      this.b($$0, this.o, dht.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dhr.ab);
      this.c($$0, this.o, this.o, this.o, dht.b.a(this.r[0], this.r[1]), this.o, 0.0F, dhr.ac);
   }

   private aku<dhk> a(int $$0, int $$1, dht.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         aku<dhk> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private aku<dhk> b(int $$0, int $$1, dht.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private aku<dhk> c(int $$0, int $$1, dht.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private aku<dhk> a(int $$0, int $$1, dht.b $$2, aku<dhk> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dhr.x : $$3;
   }

   private aku<dhk> d(int $$0, int $$1, dht.b $$2) {
      aku<dhk> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private aku<dhk> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dhr.O;
      } else {
         return $$0 == 4 ? dhr.f : dhr.N;
      }
   }

   private aku<dhk> a(int $$0, dht.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dhr.B : dhr.C;
      } else {
         return $$0 < 3 ? dhr.B : dhr.D;
      }
   }

   private aku<dhk> e(int $$0, int $$1, dht.b $$2) {
      if ($$2.b() >= 0L) {
         aku<dhk> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private aku<dhk> f(int $$0, int $$1, dht.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dhr.J : dhr.I;
      } else {
         return $$0 == 3 ? dhr.K : this.a($$1, $$2);
      }
   }

   private aku<dhk> g(int $$0, int $$1, dht.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dhr.H : dhr.G;
      }
   }

   private aku<dhk> h(int $$0, int $$1, dht.b $$2) {
      aku<dhk> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dht.d, aku<dhk>>> $$0, dht.b $$1, dht.b $$2, dht.b $$3, dht.b $$4, dht.b $$5, float $$6, aku<dhk> $$7) {
      $$0.accept(Pair.of(dht.a($$1, $$2, $$3, $$4, dht.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dht.a($$1, $$2, $$3, $$4, dht.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dht.d, aku<dhk>>> $$0, dht.b $$1, dht.b $$2, dht.b $$3, dht.b $$4, dht.b $$5, float $$6, aku<dhk> $$7) {
      $$0.accept(Pair.of(dht.a($$1, $$2, $$3, $$4, dht.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dht.d, aku<dhk>>> $$0, dht.b $$1, dht.b $$2, dht.b $$3, dht.b $$4, dht.b $$5, float $$6, aku<dhk> $$7) {
      $$0.accept(Pair.of(dht.a($$1, $$2, $$3, $$4, dht.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(ecl $$0, ecl $$1, ecl.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)ecz.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)ecz.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)ecz.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)ecz.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dht.a((float)$$0);
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

   private static String a(double $$0, dht.b[] $$1) {
      double $$2 = (double)dht.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bag
   public dht.b[] b() {
      return this.p;
   }

   @bag
   public dht.b[] c() {
      return this.q;
   }

   @bag
   public dht.b[] d() {
      return this.r;
   }

   @bag
   public dht.b[] e() {
      return new dht.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @bag
   public dht.b[] f() {
      return new dht.b[]{
         dht.b.a(-2.0F, ecz.a(0.05F)),
         dht.b.a(ecz.a(0.05F), ecz.a(0.26666668F)),
         dht.b.a(ecz.a(0.26666668F), ecz.a(0.4F)),
         dht.b.a(ecz.a(0.4F), ecz.a(0.56666666F)),
         dht.b.a(ecz.a(0.56666666F), 2.0F)
      };
   }

   @bag
   public dht.b[] g() {
      return new dht.b[]{dht.b.a(-2.0F, 0.0F), dht.b.a(0.0F, 2.0F)};
   }
}
