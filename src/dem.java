import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dem {
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
   private final def.b o = def.b.a(-1.0F, 1.0F);
   private final def.b[] p = new def.b[]{def.b.a(-1.0F, -0.45F), def.b.a(-0.45F, -0.15F), def.b.a(-0.15F, 0.2F), def.b.a(0.2F, 0.55F), def.b.a(0.55F, 1.0F)};
   private final def.b[] q = new def.b[]{def.b.a(-1.0F, -0.35F), def.b.a(-0.35F, -0.1F), def.b.a(-0.1F, 0.1F), def.b.a(0.1F, 0.3F), def.b.a(0.3F, 1.0F)};
   private final def.b[] r = new def.b[]{
      def.b.a(-1.0F, -0.78F),
      def.b.a(-0.78F, -0.375F),
      def.b.a(-0.375F, -0.2225F),
      def.b.a(-0.2225F, 0.05F),
      def.b.a(0.05F, 0.45F),
      def.b.a(0.45F, 0.55F),
      def.b.a(0.55F, 1.0F)
   };
   private final def.b s = this.p[0];
   private final def.b t = def.b.a(this.p[1], this.p[4]);
   private final def.b u = def.b.a(-1.2F, -1.05F);
   private final def.b v = def.b.a(-1.05F, -0.455F);
   private final def.b w = def.b.a(-0.455F, -0.19F);
   private final def.b x = def.b.a(-0.19F, -0.11F);
   private final def.b y = def.b.a(-0.11F, 0.55F);
   private final def.b z = def.b.a(-0.11F, 0.03F);
   private final def.b A = def.b.a(0.03F, 0.3F);
   private final def.b B = def.b.a(0.3F, 1.0F);
   private final akq<ddw>[][] C = new akq[][]{{ded.X, ded.V, ded.T, ded.R, ded.P}, {ded.W, ded.U, ded.S, ded.Q, ded.P}};
   private final akq<ddw>[][] D = new akq[][]{
      {ded.d, ded.d, ded.d, ded.q, ded.p},
      {ded.b, ded.b, ded.i, ded.p, ded.o},
      {ded.j, ded.b, ded.i, ded.k, ded.l},
      {ded.r, ded.r, ded.i, ded.x, ded.x},
      {ded.f, ded.f, ded.f, ded.f, ded.f}
   };
   private final akq<ddw>[][] E = new akq[][]{
      {ded.e, null, ded.q, null, null},
      {null, null, null, null, ded.n},
      {ded.c, null, null, ded.m, null},
      {null, null, ded.b, ded.y, ded.z},
      {null, null, null, null, null}
   };
   private final akq<ddw>[][] F = new akq[][]{
      {ded.d, ded.d, ded.d, ded.q, ded.q},
      {ded.D, ded.D, ded.i, ded.p, ded.o},
      {ded.D, ded.D, ded.D, ded.D, ded.l},
      {ded.s, ded.s, ded.i, ded.i, ded.x},
      {ded.A, ded.A, ded.A, ded.C, ded.C}
   };
   private final akq<ddw>[][] G = new akq[][]{
      {ded.e, null, null, null, null},
      {ded.E, null, ded.D, ded.D, ded.n},
      {ded.E, ded.E, ded.i, ded.k, null},
      {null, null, null, null, null},
      {ded.B, ded.B, null, null, null}
   };
   private final akq<ddw>[][] H = new akq[][]{
      {ded.u, ded.u, ded.t, ded.v, ded.v},
      {ded.u, ded.u, ded.t, ded.v, ded.v},
      {ded.t, ded.t, ded.t, ded.v, ded.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<def.d> a() {
      def.b $$0 = def.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new def.d(this.o, this.o, def.b.a(this.y, this.o), this.o, $$0, def.b.a(-1.0F, -0.16F), 0L),
         new def.d(this.o, this.o, def.b.a(this.y, this.o), this.o, $$0, def.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<def.d, akq<ddw>>> $$0) {
      if (ab.ar) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<def.d, akq<ddw>>> $$0) {
      jo.a $$1 = pd.a();
      jn<dyr> $$2 = $$1.b(lu.aJ);
      dys.w.a $$3 = new dys.w.a($$2.b(dzf.d));
      dys.w.a $$4 = new dys.w.a($$2.b(dzf.e));
      dys.w.a $$5 = new dys.w.a($$2.b(dzf.g));
      $$0.accept(Pair.of(def.a(this.o, this.o, this.o, this.o, def.b.a(0.0F), this.o, 0.01F), ded.b));
      if (rf.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, azq.a) instanceof axp.e<?, ?> $$7) {
         akq<ddw> $$8 = ded.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(def.a(this.o, this.o, this.o, def.b.a($$9), def.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == ded.f ? ded.A : ded.f;
         }
      }

      if (rf.a($$3, $$4, $$5, false) instanceof axp.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(def.a(this.o, this.o, def.b.a($$12), this.o, def.b.a(0.0F), this.o, 0.0F), ded.q));
         }
      }
   }

   private void c(Consumer<Pair<def.d, akq<ddw>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, ded.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         def.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<def.d, akq<ddw>>> $$0) {
      this.c($$0, def.b.a(-1.0F, -0.93333334F));
      this.b($$0, def.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, def.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, def.b.a(-0.56666666F, -0.4F));
      this.c($$0, def.b.a(-0.4F, -0.26666668F));
      this.d($$0, def.b.a(-0.26666668F, -0.05F));
      this.e($$0, def.b.a(-0.05F, 0.05F));
      this.d($$0, def.b.a(0.05F, 0.26666668F));
      this.c($$0, def.b.a(0.26666668F, 0.4F));
      this.b($$0, def.b.a(0.4F, 0.56666666F));
      this.a($$0, def.b.a(0.56666666F, 0.7666667F));
      this.b($$0, def.b.a(0.7666667F, 0.93333334F));
      this.c($$0, def.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<def.d, akq<ddw>>> $$0, def.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         def.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            def.b $$5 = this.q[$$4];
            akq<ddw> $$6 = this.a($$2, $$4, $$1);
            akq<ddw> $$7 = this.b($$2, $$4, $$1);
            akq<ddw> $$8 = this.c($$2, $$4, $$1);
            akq<ddw> $$9 = this.e($$2, $$4, $$1);
            akq<ddw> $$10 = this.h($$2, $$4, $$1);
            akq<ddw> $$11 = this.a($$2, $$4, $$1, $$10);
            akq<ddw> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, def.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, def.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, def.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, def.b.a(this.x, this.z), def.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, def.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, def.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, def.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, def.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, def.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<def.d, akq<ddw>>> $$0, def.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         def.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            def.b $$5 = this.q[$$4];
            akq<ddw> $$6 = this.a($$2, $$4, $$1);
            akq<ddw> $$7 = this.b($$2, $$4, $$1);
            akq<ddw> $$8 = this.c($$2, $$4, $$1);
            akq<ddw> $$9 = this.e($$2, $$4, $$1);
            akq<ddw> $$10 = this.h($$2, $$4, $$1);
            akq<ddw> $$11 = this.a($$2, $$4, $$1, $$6);
            akq<ddw> $$12 = this.g($$2, $$4, $$1);
            akq<ddw> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, def.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, def.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, def.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, def.b.a(this.x, this.z), def.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, def.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, def.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, def.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, def.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, def.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<def.d, akq<ddw>>> $$0, def.b $$1) {
      this.a($$0, this.o, this.o, this.x, def.b.a(this.r[0], this.r[2]), $$1, 0.0F, ded.O);
      this.a($$0, def.b.a(this.p[1], this.p[2]), this.o, def.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ded.g);
      this.a($$0, def.b.a(this.p[3], this.p[4]), this.o, def.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ded.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         def.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            def.b $$5 = this.q[$$4];
            akq<ddw> $$6 = this.a($$2, $$4, $$1);
            akq<ddw> $$7 = this.b($$2, $$4, $$1);
            akq<ddw> $$8 = this.c($$2, $$4, $$1);
            akq<ddw> $$9 = this.h($$2, $$4, $$1);
            akq<ddw> $$10 = this.e($$2, $$4, $$1);
            akq<ddw> $$11 = this.a($$2, $$4);
            akq<ddw> $$12 = this.a($$2, $$4, $$1, $$6);
            akq<ddw> $$13 = this.d($$2, $$4, $$1);
            akq<ddw> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, def.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, def.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, def.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, def.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, def.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, def.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, def.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, def.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<def.d, akq<ddw>>> $$0, def.b $$1) {
      this.a($$0, this.o, this.o, this.x, def.b.a(this.r[0], this.r[2]), $$1, 0.0F, ded.O);
      this.a($$0, def.b.a(this.p[1], this.p[2]), this.o, def.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ded.g);
      this.a($$0, def.b.a(this.p[3], this.p[4]), this.o, def.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ded.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         def.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            def.b $$5 = this.q[$$4];
            akq<ddw> $$6 = this.a($$2, $$4, $$1);
            akq<ddw> $$7 = this.b($$2, $$4, $$1);
            akq<ddw> $$8 = this.c($$2, $$4, $$1);
            akq<ddw> $$9 = this.a($$2, $$4);
            akq<ddw> $$10 = this.a($$2, $$4, $$1, $$6);
            akq<ddw> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, def.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, def.b.a(this.A, this.B), def.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, def.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, def.b.a(this.A, this.B), def.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, def.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, def.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, def.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, def.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<def.d, akq<ddw>>> $$0, def.b $$1) {
      this.a($$0, this.s, this.o, this.x, def.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? ded.O : ded.L);
      this.a($$0, this.t, this.o, this.x, def.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? ded.O : ded.K);
      this.a($$0, this.s, this.o, this.z, def.b.a(this.r[0], this.r[1]), $$1, 0.0F, ded.L);
      this.a($$0, this.t, this.o, this.z, def.b.a(this.r[0], this.r[1]), $$1, 0.0F, ded.K);
      this.a($$0, this.s, this.o, def.b.a(this.x, this.B), def.b.a(this.r[2], this.r[5]), $$1, 0.0F, ded.L);
      this.a($$0, this.t, this.o, def.b.a(this.x, this.B), def.b.a(this.r[2], this.r[5]), $$1, 0.0F, ded.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, ded.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, ded.K);
      this.a($$0, def.b.a(this.p[1], this.p[2]), this.o, def.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ded.g);
      this.a($$0, def.b.a(this.p[3], this.p[4]), this.o, def.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ded.h);
      this.a($$0, this.s, this.o, def.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ded.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         def.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            def.b $$5 = this.q[$$4];
            akq<ddw> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, def.b.a(this.A, this.B), def.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<def.d, akq<ddw>>> $$0) {
      this.b($$0, this.o, this.o, def.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, ded.Z);
      this.b($$0, this.o, def.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, ded.aa);
      this.c($$0, this.o, this.o, this.o, def.b.a(this.r[0], this.r[1]), this.o, 0.0F, ded.ab);
   }

   private akq<ddw> a(int $$0, int $$1, def.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         akq<ddw> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private akq<ddw> b(int $$0, int $$1, def.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private akq<ddw> c(int $$0, int $$1, def.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private akq<ddw> a(int $$0, int $$1, def.b $$2, akq<ddw> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? ded.w : $$3;
   }

   private akq<ddw> d(int $$0, int $$1, def.b $$2) {
      akq<ddw> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private akq<ddw> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return ded.N;
      } else {
         return $$0 == 4 ? ded.f : ded.M;
      }
   }

   private akq<ddw> a(int $$0, def.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? ded.A : ded.B;
      } else {
         return $$0 < 3 ? ded.A : ded.C;
      }
   }

   private akq<ddw> e(int $$0, int $$1, def.b $$2) {
      if ($$2.b() >= 0L) {
         akq<ddw> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private akq<ddw> f(int $$0, int $$1, def.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? ded.I : ded.H;
      } else {
         return $$0 == 3 ? ded.J : this.a($$1, $$2);
      }
   }

   private akq<ddw> g(int $$0, int $$1, def.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? ded.G : ded.F;
      }
   }

   private akq<ddw> h(int $$0, int $$1, def.b $$2) {
      akq<ddw> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<def.d, akq<ddw>>> $$0, def.b $$1, def.b $$2, def.b $$3, def.b $$4, def.b $$5, float $$6, akq<ddw> $$7) {
      $$0.accept(Pair.of(def.a($$1, $$2, $$3, $$4, def.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(def.a($$1, $$2, $$3, $$4, def.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<def.d, akq<ddw>>> $$0, def.b $$1, def.b $$2, def.b $$3, def.b $$4, def.b $$5, float $$6, akq<ddw> $$7) {
      $$0.accept(Pair.of(def.a($$1, $$2, $$3, $$4, def.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<def.d, akq<ddw>>> $$0, def.b $$1, def.b $$2, def.b $$3, def.b $$4, def.b $$5, float $$6, akq<ddw> $$7) {
      $$0.accept(Pair.of(def.a($$1, $$2, $$3, $$4, def.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dyr $$0, dyr $$1, dyr.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dzf.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dzf.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dzf.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dzf.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)def.a((float)$$0);
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

   private static String a(double $$0, def.b[] $$1) {
      double $$2 = (double)def.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @azt
   public def.b[] b() {
      return this.p;
   }

   @azt
   public def.b[] c() {
      return this.q;
   }

   @azt
   public def.b[] d() {
      return this.r;
   }

   @azt
   public def.b[] e() {
      return new def.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @azt
   public def.b[] f() {
      return new def.b[]{
         def.b.a(-2.0F, dzf.a(0.05F)),
         def.b.a(dzf.a(0.05F), dzf.a(0.26666668F)),
         def.b.a(dzf.a(0.26666668F), dzf.a(0.4F)),
         def.b.a(dzf.a(0.4F), dzf.a(0.56666666F)),
         def.b.a(dzf.a(0.56666666F), 2.0F)
      };
   }

   @azt
   public def.b[] g() {
      return new def.b[]{def.b.a(-2.0F, 0.0F), def.b.a(0.0F, 2.0F)};
   }
}
