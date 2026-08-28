import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dfx {
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
   private final dfq.b o = dfq.b.a(-1.0F, 1.0F);
   private final dfq.b[] p = new dfq.b[]{dfq.b.a(-1.0F, -0.45F), dfq.b.a(-0.45F, -0.15F), dfq.b.a(-0.15F, 0.2F), dfq.b.a(0.2F, 0.55F), dfq.b.a(0.55F, 1.0F)};
   private final dfq.b[] q = new dfq.b[]{dfq.b.a(-1.0F, -0.35F), dfq.b.a(-0.35F, -0.1F), dfq.b.a(-0.1F, 0.1F), dfq.b.a(0.1F, 0.3F), dfq.b.a(0.3F, 1.0F)};
   private final dfq.b[] r = new dfq.b[]{
      dfq.b.a(-1.0F, -0.78F),
      dfq.b.a(-0.78F, -0.375F),
      dfq.b.a(-0.375F, -0.2225F),
      dfq.b.a(-0.2225F, 0.05F),
      dfq.b.a(0.05F, 0.45F),
      dfq.b.a(0.45F, 0.55F),
      dfq.b.a(0.55F, 1.0F)
   };
   private final dfq.b s = this.p[0];
   private final dfq.b t = dfq.b.a(this.p[1], this.p[4]);
   private final dfq.b u = dfq.b.a(-1.2F, -1.05F);
   private final dfq.b v = dfq.b.a(-1.05F, -0.455F);
   private final dfq.b w = dfq.b.a(-0.455F, -0.19F);
   private final dfq.b x = dfq.b.a(-0.19F, -0.11F);
   private final dfq.b y = dfq.b.a(-0.11F, 0.55F);
   private final dfq.b z = dfq.b.a(-0.11F, 0.03F);
   private final dfq.b A = dfq.b.a(0.03F, 0.3F);
   private final dfq.b B = dfq.b.a(0.3F, 1.0F);
   private final alb<dfh>[][] C = new alb[][]{{dfo.X, dfo.V, dfo.T, dfo.R, dfo.P}, {dfo.W, dfo.U, dfo.S, dfo.Q, dfo.P}};
   private final alb<dfh>[][] D = new alb[][]{
      {dfo.d, dfo.d, dfo.d, dfo.q, dfo.p},
      {dfo.b, dfo.b, dfo.i, dfo.p, dfo.o},
      {dfo.j, dfo.b, dfo.i, dfo.k, dfo.l},
      {dfo.r, dfo.r, dfo.i, dfo.x, dfo.x},
      {dfo.f, dfo.f, dfo.f, dfo.f, dfo.f}
   };
   private final alb<dfh>[][] E = new alb[][]{
      {dfo.e, null, dfo.q, null, null},
      {null, null, null, null, dfo.n},
      {dfo.c, null, null, dfo.m, null},
      {null, null, dfo.b, dfo.y, dfo.z},
      {null, null, null, null, null}
   };
   private final alb<dfh>[][] F = new alb[][]{
      {dfo.d, dfo.d, dfo.d, dfo.q, dfo.q},
      {dfo.D, dfo.D, dfo.i, dfo.p, dfo.o},
      {dfo.D, dfo.D, dfo.D, dfo.D, dfo.l},
      {dfo.s, dfo.s, dfo.i, dfo.i, dfo.x},
      {dfo.A, dfo.A, dfo.A, dfo.C, dfo.C}
   };
   private final alb<dfh>[][] G = new alb[][]{
      {dfo.e, null, null, null, null},
      {dfo.E, null, dfo.D, dfo.D, dfo.n},
      {dfo.E, dfo.E, dfo.i, dfo.k, null},
      {null, null, null, null, null},
      {dfo.B, dfo.B, null, null, null}
   };
   private final alb<dfh>[][] H = new alb[][]{
      {dfo.u, dfo.u, dfo.t, dfo.v, dfo.v},
      {dfo.u, dfo.u, dfo.t, dfo.v, dfo.v},
      {dfo.t, dfo.t, dfo.t, dfo.v, dfo.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dfq.d> a() {
      dfq.b $$0 = dfq.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dfq.d(this.o, this.o, dfq.b.a(this.y, this.o), this.o, $$0, dfq.b.a(-1.0F, -0.16F), 0L),
         new dfq.d(this.o, this.o, dfq.b.a(this.y, this.o), this.o, $$0, dfq.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dfq.d, alb<dfh>>> $$0) {
      if (ab.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dfq.d, alb<dfh>>> $$0) {
      jp.a $$1 = pg.a();
      jo<ead> $$2 = $$1.b(lv.aK);
      eae.w.a $$3 = new eae.w.a($$2.b(ear.d));
      eae.w.a $$4 = new eae.w.a($$2.b(ear.e));
      eae.w.a $$5 = new eae.w.a($$2.b(ear.g));
      $$0.accept(Pair.of(dfq.a(this.o, this.o, this.o, this.o, dfq.b.a(0.0F), this.o, 0.01F), dfo.b));
      if (ri.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, baf.a) instanceof ayf.e<?, ?> $$7) {
         alb<dfh> $$8 = dfo.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dfq.a(this.o, this.o, this.o, dfq.b.a($$9), dfq.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dfo.f ? dfo.A : dfo.f;
         }
      }

      if (ri.a($$3, $$4, $$5, false) instanceof ayf.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dfq.a(this.o, this.o, dfq.b.a($$12), this.o, dfq.b.a(0.0F), this.o, 0.0F), dfo.q));
         }
      }
   }

   private void c(Consumer<Pair<dfq.d, alb<dfh>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dfo.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dfq.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dfq.d, alb<dfh>>> $$0) {
      this.c($$0, dfq.b.a(-1.0F, -0.93333334F));
      this.b($$0, dfq.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dfq.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dfq.b.a(-0.56666666F, -0.4F));
      this.c($$0, dfq.b.a(-0.4F, -0.26666668F));
      this.d($$0, dfq.b.a(-0.26666668F, -0.05F));
      this.e($$0, dfq.b.a(-0.05F, 0.05F));
      this.d($$0, dfq.b.a(0.05F, 0.26666668F));
      this.c($$0, dfq.b.a(0.26666668F, 0.4F));
      this.b($$0, dfq.b.a(0.4F, 0.56666666F));
      this.a($$0, dfq.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dfq.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dfq.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dfq.d, alb<dfh>>> $$0, dfq.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dfq.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dfq.b $$5 = this.q[$$4];
            alb<dfh> $$6 = this.a($$2, $$4, $$1);
            alb<dfh> $$7 = this.b($$2, $$4, $$1);
            alb<dfh> $$8 = this.c($$2, $$4, $$1);
            alb<dfh> $$9 = this.e($$2, $$4, $$1);
            alb<dfh> $$10 = this.h($$2, $$4, $$1);
            alb<dfh> $$11 = this.a($$2, $$4, $$1, $$10);
            alb<dfh> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dfq.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dfq.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dfq.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dfq.b.a(this.x, this.z), dfq.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dfq.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dfq.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dfq.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dfq.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dfq.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dfq.d, alb<dfh>>> $$0, dfq.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dfq.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dfq.b $$5 = this.q[$$4];
            alb<dfh> $$6 = this.a($$2, $$4, $$1);
            alb<dfh> $$7 = this.b($$2, $$4, $$1);
            alb<dfh> $$8 = this.c($$2, $$4, $$1);
            alb<dfh> $$9 = this.e($$2, $$4, $$1);
            alb<dfh> $$10 = this.h($$2, $$4, $$1);
            alb<dfh> $$11 = this.a($$2, $$4, $$1, $$6);
            alb<dfh> $$12 = this.g($$2, $$4, $$1);
            alb<dfh> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dfq.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dfq.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dfq.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dfq.b.a(this.x, this.z), dfq.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dfq.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dfq.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dfq.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dfq.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dfq.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dfq.d, alb<dfh>>> $$0, dfq.b $$1) {
      this.a($$0, this.o, this.o, this.x, dfq.b.a(this.r[0], this.r[2]), $$1, 0.0F, dfo.O);
      this.a($$0, dfq.b.a(this.p[1], this.p[2]), this.o, dfq.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dfo.g);
      this.a($$0, dfq.b.a(this.p[3], this.p[4]), this.o, dfq.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dfo.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dfq.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dfq.b $$5 = this.q[$$4];
            alb<dfh> $$6 = this.a($$2, $$4, $$1);
            alb<dfh> $$7 = this.b($$2, $$4, $$1);
            alb<dfh> $$8 = this.c($$2, $$4, $$1);
            alb<dfh> $$9 = this.h($$2, $$4, $$1);
            alb<dfh> $$10 = this.e($$2, $$4, $$1);
            alb<dfh> $$11 = this.a($$2, $$4);
            alb<dfh> $$12 = this.a($$2, $$4, $$1, $$6);
            alb<dfh> $$13 = this.d($$2, $$4, $$1);
            alb<dfh> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dfq.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dfq.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dfq.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dfq.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dfq.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dfq.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dfq.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dfq.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dfq.d, alb<dfh>>> $$0, dfq.b $$1) {
      this.a($$0, this.o, this.o, this.x, dfq.b.a(this.r[0], this.r[2]), $$1, 0.0F, dfo.O);
      this.a($$0, dfq.b.a(this.p[1], this.p[2]), this.o, dfq.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dfo.g);
      this.a($$0, dfq.b.a(this.p[3], this.p[4]), this.o, dfq.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dfo.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dfq.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dfq.b $$5 = this.q[$$4];
            alb<dfh> $$6 = this.a($$2, $$4, $$1);
            alb<dfh> $$7 = this.b($$2, $$4, $$1);
            alb<dfh> $$8 = this.c($$2, $$4, $$1);
            alb<dfh> $$9 = this.a($$2, $$4);
            alb<dfh> $$10 = this.a($$2, $$4, $$1, $$6);
            alb<dfh> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dfq.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dfq.b.a(this.A, this.B), dfq.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dfq.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dfq.b.a(this.A, this.B), dfq.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dfq.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dfq.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dfq.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dfq.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dfq.d, alb<dfh>>> $$0, dfq.b $$1) {
      this.a($$0, this.s, this.o, this.x, dfq.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dfo.O : dfo.L);
      this.a($$0, this.t, this.o, this.x, dfq.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dfo.O : dfo.K);
      this.a($$0, this.s, this.o, this.z, dfq.b.a(this.r[0], this.r[1]), $$1, 0.0F, dfo.L);
      this.a($$0, this.t, this.o, this.z, dfq.b.a(this.r[0], this.r[1]), $$1, 0.0F, dfo.K);
      this.a($$0, this.s, this.o, dfq.b.a(this.x, this.B), dfq.b.a(this.r[2], this.r[5]), $$1, 0.0F, dfo.L);
      this.a($$0, this.t, this.o, dfq.b.a(this.x, this.B), dfq.b.a(this.r[2], this.r[5]), $$1, 0.0F, dfo.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dfo.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dfo.K);
      this.a($$0, dfq.b.a(this.p[1], this.p[2]), this.o, dfq.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dfo.g);
      this.a($$0, dfq.b.a(this.p[3], this.p[4]), this.o, dfq.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dfo.h);
      this.a($$0, this.s, this.o, dfq.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dfo.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dfq.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dfq.b $$5 = this.q[$$4];
            alb<dfh> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dfq.b.a(this.A, this.B), dfq.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dfq.d, alb<dfh>>> $$0) {
      this.b($$0, this.o, this.o, dfq.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dfo.Z);
      this.b($$0, this.o, dfq.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dfo.aa);
      this.c($$0, this.o, this.o, this.o, dfq.b.a(this.r[0], this.r[1]), this.o, 0.0F, dfo.ab);
   }

   private alb<dfh> a(int $$0, int $$1, dfq.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         alb<dfh> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private alb<dfh> b(int $$0, int $$1, dfq.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private alb<dfh> c(int $$0, int $$1, dfq.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private alb<dfh> a(int $$0, int $$1, dfq.b $$2, alb<dfh> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dfo.w : $$3;
   }

   private alb<dfh> d(int $$0, int $$1, dfq.b $$2) {
      alb<dfh> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private alb<dfh> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dfo.N;
      } else {
         return $$0 == 4 ? dfo.f : dfo.M;
      }
   }

   private alb<dfh> a(int $$0, dfq.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dfo.A : dfo.B;
      } else {
         return $$0 < 3 ? dfo.A : dfo.C;
      }
   }

   private alb<dfh> e(int $$0, int $$1, dfq.b $$2) {
      if ($$2.b() >= 0L) {
         alb<dfh> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private alb<dfh> f(int $$0, int $$1, dfq.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dfo.I : dfo.H;
      } else {
         return $$0 == 3 ? dfo.J : this.a($$1, $$2);
      }
   }

   private alb<dfh> g(int $$0, int $$1, dfq.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dfo.G : dfo.F;
      }
   }

   private alb<dfh> h(int $$0, int $$1, dfq.b $$2) {
      alb<dfh> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dfq.d, alb<dfh>>> $$0, dfq.b $$1, dfq.b $$2, dfq.b $$3, dfq.b $$4, dfq.b $$5, float $$6, alb<dfh> $$7) {
      $$0.accept(Pair.of(dfq.a($$1, $$2, $$3, $$4, dfq.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dfq.a($$1, $$2, $$3, $$4, dfq.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dfq.d, alb<dfh>>> $$0, dfq.b $$1, dfq.b $$2, dfq.b $$3, dfq.b $$4, dfq.b $$5, float $$6, alb<dfh> $$7) {
      $$0.accept(Pair.of(dfq.a($$1, $$2, $$3, $$4, dfq.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dfq.d, alb<dfh>>> $$0, dfq.b $$1, dfq.b $$2, dfq.b $$3, dfq.b $$4, dfq.b $$5, float $$6, alb<dfh> $$7) {
      $$0.accept(Pair.of(dfq.a($$1, $$2, $$3, $$4, dfq.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(ead $$0, ead $$1, ead.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)ear.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)ear.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)ear.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)ear.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dfq.a((float)$$0);
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

   private static String a(double $$0, dfq.b[] $$1) {
      double $$2 = (double)dfq.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @baj
   public dfq.b[] b() {
      return this.p;
   }

   @baj
   public dfq.b[] c() {
      return this.q;
   }

   @baj
   public dfq.b[] d() {
      return this.r;
   }

   @baj
   public dfq.b[] e() {
      return new dfq.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @baj
   public dfq.b[] f() {
      return new dfq.b[]{
         dfq.b.a(-2.0F, ear.a(0.05F)),
         dfq.b.a(ear.a(0.05F), ear.a(0.26666668F)),
         dfq.b.a(ear.a(0.26666668F), ear.a(0.4F)),
         dfq.b.a(ear.a(0.4F), ear.a(0.56666666F)),
         dfq.b.a(ear.a(0.56666666F), 2.0F)
      };
   }

   @baj
   public dfq.b[] g() {
      return new dfq.b[]{dfq.b.a(-2.0F, 0.0F), dfq.b.a(0.0F, 2.0F)};
   }
}
