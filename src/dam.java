import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dam {
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
   private final daf.b o = daf.b.a(-1.0F, 1.0F);
   private final daf.b[] p = new daf.b[]{daf.b.a(-1.0F, -0.45F), daf.b.a(-0.45F, -0.15F), daf.b.a(-0.15F, 0.2F), daf.b.a(0.2F, 0.55F), daf.b.a(0.55F, 1.0F)};
   private final daf.b[] q = new daf.b[]{daf.b.a(-1.0F, -0.35F), daf.b.a(-0.35F, -0.1F), daf.b.a(-0.1F, 0.1F), daf.b.a(0.1F, 0.3F), daf.b.a(0.3F, 1.0F)};
   private final daf.b[] r = new daf.b[]{
      daf.b.a(-1.0F, -0.78F),
      daf.b.a(-0.78F, -0.375F),
      daf.b.a(-0.375F, -0.2225F),
      daf.b.a(-0.2225F, 0.05F),
      daf.b.a(0.05F, 0.45F),
      daf.b.a(0.45F, 0.55F),
      daf.b.a(0.55F, 1.0F)
   };
   private final daf.b s = this.p[0];
   private final daf.b t = daf.b.a(this.p[1], this.p[4]);
   private final daf.b u = daf.b.a(-1.2F, -1.05F);
   private final daf.b v = daf.b.a(-1.05F, -0.455F);
   private final daf.b w = daf.b.a(-0.455F, -0.19F);
   private final daf.b x = daf.b.a(-0.19F, -0.11F);
   private final daf.b y = daf.b.a(-0.11F, 0.55F);
   private final daf.b z = daf.b.a(-0.11F, 0.03F);
   private final daf.b A = daf.b.a(0.03F, 0.3F);
   private final daf.b B = daf.b.a(0.3F, 1.0F);
   private final ajs<czw>[][] C = new ajs[][]{{dad.X, dad.V, dad.T, dad.R, dad.P}, {dad.W, dad.U, dad.S, dad.Q, dad.P}};
   private final ajs<czw>[][] D = new ajs[][]{
      {dad.d, dad.d, dad.d, dad.q, dad.p},
      {dad.b, dad.b, dad.i, dad.p, dad.o},
      {dad.j, dad.b, dad.i, dad.k, dad.l},
      {dad.r, dad.r, dad.i, dad.x, dad.x},
      {dad.f, dad.f, dad.f, dad.f, dad.f}
   };
   private final ajs<czw>[][] E = new ajs[][]{
      {dad.e, null, dad.q, null, null},
      {null, null, null, null, dad.n},
      {dad.c, null, null, dad.m, null},
      {null, null, dad.b, dad.y, dad.z},
      {null, null, null, null, null}
   };
   private final ajs<czw>[][] F = new ajs[][]{
      {dad.d, dad.d, dad.d, dad.q, dad.q},
      {dad.D, dad.D, dad.i, dad.p, dad.o},
      {dad.D, dad.D, dad.D, dad.D, dad.l},
      {dad.s, dad.s, dad.i, dad.i, dad.x},
      {dad.A, dad.A, dad.A, dad.C, dad.C}
   };
   private final ajs<czw>[][] G = new ajs[][]{
      {dad.e, null, null, null, null},
      {dad.E, null, dad.D, dad.D, dad.n},
      {dad.E, dad.E, dad.i, dad.k, null},
      {null, null, null, null, null},
      {dad.B, dad.B, null, null, null}
   };
   private final ajs<czw>[][] H = new ajs[][]{
      {dad.u, dad.u, dad.t, dad.v, dad.v},
      {dad.u, dad.u, dad.t, dad.v, dad.v},
      {dad.t, dad.t, dad.t, dad.v, dad.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<daf.d> a() {
      daf.b $$0 = daf.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new daf.d(this.o, this.o, daf.b.a(this.y, this.o), this.o, $$0, daf.b.a(-1.0F, -0.16F), 0L),
         new daf.d(this.o, this.o, daf.b.a(this.y, this.o), this.o, $$0, daf.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<daf.d, ajs<czw>>> $$0) {
      if (aa.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<daf.d, ajs<czw>>> $$0) {
      in.a $$1 = oh.a();
      im<duk> $$2 = $$1.b(ks.az);
      dul.w.a $$3 = new dul.w.a($$2.b(duy.d));
      dul.w.a $$4 = new dul.w.a($$2.b(duy.e));
      dul.w.a $$5 = new dul.w.a($$2.b(duy.g));
      $$0.accept(Pair.of(daf.a(this.o, this.o, this.o, this.o, daf.b.a(0.0F), this.o, 0.01F), dad.b));
      if (qm.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, ayk.a) instanceof awm.e<?, ?> $$7) {
         ajs<czw> $$8 = dad.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(daf.a(this.o, this.o, this.o, daf.b.a($$9), daf.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dad.f ? dad.A : dad.f;
         }
      }

      if (qm.a($$3, $$4, $$5, false) instanceof awm.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(daf.a(this.o, this.o, daf.b.a($$12), this.o, daf.b.a(0.0F), this.o, 0.0F), dad.q));
         }
      }
   }

   private void c(Consumer<Pair<daf.d, ajs<czw>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dad.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         daf.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<daf.d, ajs<czw>>> $$0) {
      this.c($$0, daf.b.a(-1.0F, -0.93333334F));
      this.b($$0, daf.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, daf.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, daf.b.a(-0.56666666F, -0.4F));
      this.c($$0, daf.b.a(-0.4F, -0.26666668F));
      this.d($$0, daf.b.a(-0.26666668F, -0.05F));
      this.e($$0, daf.b.a(-0.05F, 0.05F));
      this.d($$0, daf.b.a(0.05F, 0.26666668F));
      this.c($$0, daf.b.a(0.26666668F, 0.4F));
      this.b($$0, daf.b.a(0.4F, 0.56666666F));
      this.a($$0, daf.b.a(0.56666666F, 0.7666667F));
      this.b($$0, daf.b.a(0.7666667F, 0.93333334F));
      this.c($$0, daf.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<daf.d, ajs<czw>>> $$0, daf.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         daf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            daf.b $$5 = this.q[$$4];
            ajs<czw> $$6 = this.a($$2, $$4, $$1);
            ajs<czw> $$7 = this.b($$2, $$4, $$1);
            ajs<czw> $$8 = this.c($$2, $$4, $$1);
            ajs<czw> $$9 = this.e($$2, $$4, $$1);
            ajs<czw> $$10 = this.h($$2, $$4, $$1);
            ajs<czw> $$11 = this.a($$2, $$4, $$1, $$10);
            ajs<czw> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, daf.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, daf.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, daf.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, daf.b.a(this.x, this.z), daf.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, daf.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, daf.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, daf.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, daf.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, daf.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<daf.d, ajs<czw>>> $$0, daf.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         daf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            daf.b $$5 = this.q[$$4];
            ajs<czw> $$6 = this.a($$2, $$4, $$1);
            ajs<czw> $$7 = this.b($$2, $$4, $$1);
            ajs<czw> $$8 = this.c($$2, $$4, $$1);
            ajs<czw> $$9 = this.e($$2, $$4, $$1);
            ajs<czw> $$10 = this.h($$2, $$4, $$1);
            ajs<czw> $$11 = this.a($$2, $$4, $$1, $$6);
            ajs<czw> $$12 = this.g($$2, $$4, $$1);
            ajs<czw> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, daf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, daf.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, daf.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, daf.b.a(this.x, this.z), daf.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, daf.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, daf.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, daf.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, daf.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, daf.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<daf.d, ajs<czw>>> $$0, daf.b $$1) {
      this.a($$0, this.o, this.o, this.x, daf.b.a(this.r[0], this.r[2]), $$1, 0.0F, dad.O);
      this.a($$0, daf.b.a(this.p[1], this.p[2]), this.o, daf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dad.g);
      this.a($$0, daf.b.a(this.p[3], this.p[4]), this.o, daf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dad.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         daf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            daf.b $$5 = this.q[$$4];
            ajs<czw> $$6 = this.a($$2, $$4, $$1);
            ajs<czw> $$7 = this.b($$2, $$4, $$1);
            ajs<czw> $$8 = this.c($$2, $$4, $$1);
            ajs<czw> $$9 = this.h($$2, $$4, $$1);
            ajs<czw> $$10 = this.e($$2, $$4, $$1);
            ajs<czw> $$11 = this.a($$2, $$4);
            ajs<czw> $$12 = this.a($$2, $$4, $$1, $$6);
            ajs<czw> $$13 = this.d($$2, $$4, $$1);
            ajs<czw> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, daf.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, daf.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, daf.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, daf.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, daf.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, daf.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, daf.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, daf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<daf.d, ajs<czw>>> $$0, daf.b $$1) {
      this.a($$0, this.o, this.o, this.x, daf.b.a(this.r[0], this.r[2]), $$1, 0.0F, dad.O);
      this.a($$0, daf.b.a(this.p[1], this.p[2]), this.o, daf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dad.g);
      this.a($$0, daf.b.a(this.p[3], this.p[4]), this.o, daf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dad.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         daf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            daf.b $$5 = this.q[$$4];
            ajs<czw> $$6 = this.a($$2, $$4, $$1);
            ajs<czw> $$7 = this.b($$2, $$4, $$1);
            ajs<czw> $$8 = this.c($$2, $$4, $$1);
            ajs<czw> $$9 = this.a($$2, $$4);
            ajs<czw> $$10 = this.a($$2, $$4, $$1, $$6);
            ajs<czw> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, daf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, daf.b.a(this.A, this.B), daf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, daf.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, daf.b.a(this.A, this.B), daf.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, daf.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, daf.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, daf.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, daf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<daf.d, ajs<czw>>> $$0, daf.b $$1) {
      this.a($$0, this.s, this.o, this.x, daf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dad.O : dad.L);
      this.a($$0, this.t, this.o, this.x, daf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dad.O : dad.K);
      this.a($$0, this.s, this.o, this.z, daf.b.a(this.r[0], this.r[1]), $$1, 0.0F, dad.L);
      this.a($$0, this.t, this.o, this.z, daf.b.a(this.r[0], this.r[1]), $$1, 0.0F, dad.K);
      this.a($$0, this.s, this.o, daf.b.a(this.x, this.B), daf.b.a(this.r[2], this.r[5]), $$1, 0.0F, dad.L);
      this.a($$0, this.t, this.o, daf.b.a(this.x, this.B), daf.b.a(this.r[2], this.r[5]), $$1, 0.0F, dad.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dad.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dad.K);
      this.a($$0, daf.b.a(this.p[1], this.p[2]), this.o, daf.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dad.g);
      this.a($$0, daf.b.a(this.p[3], this.p[4]), this.o, daf.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dad.h);
      this.a($$0, this.s, this.o, daf.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dad.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         daf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            daf.b $$5 = this.q[$$4];
            ajs<czw> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, daf.b.a(this.A, this.B), daf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<daf.d, ajs<czw>>> $$0) {
      this.b($$0, this.o, this.o, daf.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dad.Z);
      this.b($$0, this.o, daf.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dad.aa);
      this.c($$0, this.o, this.o, this.o, daf.b.a(this.r[0], this.r[1]), this.o, 0.0F, dad.ab);
   }

   private ajs<czw> a(int $$0, int $$1, daf.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         ajs<czw> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private ajs<czw> b(int $$0, int $$1, daf.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private ajs<czw> c(int $$0, int $$1, daf.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private ajs<czw> a(int $$0, int $$1, daf.b $$2, ajs<czw> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dad.w : $$3;
   }

   private ajs<czw> d(int $$0, int $$1, daf.b $$2) {
      ajs<czw> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private ajs<czw> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dad.N;
      } else {
         return $$0 == 4 ? dad.f : dad.M;
      }
   }

   private ajs<czw> a(int $$0, daf.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dad.A : dad.B;
      } else {
         return $$0 < 3 ? dad.A : dad.C;
      }
   }

   private ajs<czw> e(int $$0, int $$1, daf.b $$2) {
      if ($$2.b() >= 0L) {
         ajs<czw> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private ajs<czw> f(int $$0, int $$1, daf.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dad.I : dad.H;
      } else {
         return $$0 == 3 ? dad.J : this.a($$1, $$2);
      }
   }

   private ajs<czw> g(int $$0, int $$1, daf.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dad.G : dad.F;
      }
   }

   private ajs<czw> h(int $$0, int $$1, daf.b $$2) {
      ajs<czw> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<daf.d, ajs<czw>>> $$0, daf.b $$1, daf.b $$2, daf.b $$3, daf.b $$4, daf.b $$5, float $$6, ajs<czw> $$7) {
      $$0.accept(Pair.of(daf.a($$1, $$2, $$3, $$4, daf.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(daf.a($$1, $$2, $$3, $$4, daf.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<daf.d, ajs<czw>>> $$0, daf.b $$1, daf.b $$2, daf.b $$3, daf.b $$4, daf.b $$5, float $$6, ajs<czw> $$7) {
      $$0.accept(Pair.of(daf.a($$1, $$2, $$3, $$4, daf.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<daf.d, ajs<czw>>> $$0, daf.b $$1, daf.b $$2, daf.b $$3, daf.b $$4, daf.b $$5, float $$6, ajs<czw> $$7) {
      $$0.accept(Pair.of(daf.a($$1, $$2, $$3, $$4, daf.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(duk $$0, duk $$1, duk.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)duy.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)duy.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)duy.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)duy.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)daf.a((float)$$0);
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

   private static String a(double $$0, daf.b[] $$1) {
      double $$2 = (double)daf.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @ayn
   public daf.b[] b() {
      return this.p;
   }

   @ayn
   public daf.b[] c() {
      return this.q;
   }

   @ayn
   public daf.b[] d() {
      return this.r;
   }

   @ayn
   public daf.b[] e() {
      return new daf.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @ayn
   public daf.b[] f() {
      return new daf.b[]{
         daf.b.a(-2.0F, duy.a(0.05F)),
         daf.b.a(duy.a(0.05F), duy.a(0.26666668F)),
         daf.b.a(duy.a(0.26666668F), duy.a(0.4F)),
         daf.b.a(duy.a(0.4F), duy.a(0.56666666F)),
         daf.b.a(duy.a(0.56666666F), 2.0F)
      };
   }

   @ayn
   public daf.b[] g() {
      return new daf.b[]{daf.b.a(-2.0F, 0.0F), daf.b.a(0.0F, 2.0F)};
   }
}
