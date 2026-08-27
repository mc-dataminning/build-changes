import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dcm {
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
   private final dcf.b o = dcf.b.a(-1.0F, 1.0F);
   private final dcf.b[] p = new dcf.b[]{dcf.b.a(-1.0F, -0.45F), dcf.b.a(-0.45F, -0.15F), dcf.b.a(-0.15F, 0.2F), dcf.b.a(0.2F, 0.55F), dcf.b.a(0.55F, 1.0F)};
   private final dcf.b[] q = new dcf.b[]{dcf.b.a(-1.0F, -0.35F), dcf.b.a(-0.35F, -0.1F), dcf.b.a(-0.1F, 0.1F), dcf.b.a(0.1F, 0.3F), dcf.b.a(0.3F, 1.0F)};
   private final dcf.b[] r = new dcf.b[]{
      dcf.b.a(-1.0F, -0.78F),
      dcf.b.a(-0.78F, -0.375F),
      dcf.b.a(-0.375F, -0.2225F),
      dcf.b.a(-0.2225F, 0.05F),
      dcf.b.a(0.05F, 0.45F),
      dcf.b.a(0.45F, 0.55F),
      dcf.b.a(0.55F, 1.0F)
   };
   private final dcf.b s = this.p[0];
   private final dcf.b t = dcf.b.a(this.p[1], this.p[4]);
   private final dcf.b u = dcf.b.a(-1.2F, -1.05F);
   private final dcf.b v = dcf.b.a(-1.05F, -0.455F);
   private final dcf.b w = dcf.b.a(-0.455F, -0.19F);
   private final dcf.b x = dcf.b.a(-0.19F, -0.11F);
   private final dcf.b y = dcf.b.a(-0.11F, 0.55F);
   private final dcf.b z = dcf.b.a(-0.11F, 0.03F);
   private final dcf.b A = dcf.b.a(0.03F, 0.3F);
   private final dcf.b B = dcf.b.a(0.3F, 1.0F);
   private final akl<dbw>[][] C = new akl[][]{{dcd.X, dcd.V, dcd.T, dcd.R, dcd.P}, {dcd.W, dcd.U, dcd.S, dcd.Q, dcd.P}};
   private final akl<dbw>[][] D = new akl[][]{
      {dcd.d, dcd.d, dcd.d, dcd.q, dcd.p},
      {dcd.b, dcd.b, dcd.i, dcd.p, dcd.o},
      {dcd.j, dcd.b, dcd.i, dcd.k, dcd.l},
      {dcd.r, dcd.r, dcd.i, dcd.x, dcd.x},
      {dcd.f, dcd.f, dcd.f, dcd.f, dcd.f}
   };
   private final akl<dbw>[][] E = new akl[][]{
      {dcd.e, null, dcd.q, null, null},
      {null, null, null, null, dcd.n},
      {dcd.c, null, null, dcd.m, null},
      {null, null, dcd.b, dcd.y, dcd.z},
      {null, null, null, null, null}
   };
   private final akl<dbw>[][] F = new akl[][]{
      {dcd.d, dcd.d, dcd.d, dcd.q, dcd.q},
      {dcd.D, dcd.D, dcd.i, dcd.p, dcd.o},
      {dcd.D, dcd.D, dcd.D, dcd.D, dcd.l},
      {dcd.s, dcd.s, dcd.i, dcd.i, dcd.x},
      {dcd.A, dcd.A, dcd.A, dcd.C, dcd.C}
   };
   private final akl<dbw>[][] G = new akl[][]{
      {dcd.e, null, null, null, null},
      {dcd.E, null, dcd.D, dcd.D, dcd.n},
      {dcd.E, dcd.E, dcd.i, dcd.k, null},
      {null, null, null, null, null},
      {dcd.B, dcd.B, null, null, null}
   };
   private final akl<dbw>[][] H = new akl[][]{
      {dcd.u, dcd.u, dcd.t, dcd.v, dcd.v},
      {dcd.u, dcd.u, dcd.t, dcd.v, dcd.v},
      {dcd.t, dcd.t, dcd.t, dcd.v, dcd.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dcf.d> a() {
      dcf.b $$0 = dcf.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dcf.d(this.o, this.o, dcf.b.a(this.y, this.o), this.o, $$0, dcf.b.a(-1.0F, -0.16F), 0L),
         new dcf.d(this.o, this.o, dcf.b.a(this.y, this.o), this.o, $$0, dcf.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dcf.d, akl<dbw>>> $$0) {
      if (aa.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dcf.d, akl<dbw>>> $$0) {
      iz.a $$1 = ow.a();
      iy<dwm> $$2 = $$1.b(lf.aD);
      dwn.w.a $$3 = new dwn.w.a($$2.b(dxa.d));
      dwn.w.a $$4 = new dwn.w.a($$2.b(dxa.e));
      dwn.w.a $$5 = new dwn.w.a($$2.b(dxa.g));
      $$0.accept(Pair.of(dcf.a(this.o, this.o, this.o, this.o, dcf.b.a(0.0F), this.o, 0.01F), dcd.b));
      if (rd.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, azd.a) instanceof axg.e<?, ?> $$7) {
         akl<dbw> $$8 = dcd.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dcf.a(this.o, this.o, this.o, dcf.b.a($$9), dcf.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dcd.f ? dcd.A : dcd.f;
         }
      }

      if (rd.a($$3, $$4, $$5, false) instanceof axg.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dcf.a(this.o, this.o, dcf.b.a($$12), this.o, dcf.b.a(0.0F), this.o, 0.0F), dcd.q));
         }
      }
   }

   private void c(Consumer<Pair<dcf.d, akl<dbw>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dcd.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dcf.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dcf.d, akl<dbw>>> $$0) {
      this.c($$0, dcf.b.a(-1.0F, -0.93333334F));
      this.b($$0, dcf.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dcf.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dcf.b.a(-0.56666666F, -0.4F));
      this.c($$0, dcf.b.a(-0.4F, -0.26666668F));
      this.d($$0, dcf.b.a(-0.26666668F, -0.05F));
      this.e($$0, dcf.b.a(-0.05F, 0.05F));
      this.d($$0, dcf.b.a(0.05F, 0.26666668F));
      this.c($$0, dcf.b.a(0.26666668F, 0.4F));
      this.b($$0, dcf.b.a(0.4F, 0.56666666F));
      this.a($$0, dcf.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dcf.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dcf.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dcf.d, akl<dbw>>> $$0, dcf.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dcf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dcf.b $$5 = this.q[$$4];
            akl<dbw> $$6 = this.a($$2, $$4, $$1);
            akl<dbw> $$7 = this.b($$2, $$4, $$1);
            akl<dbw> $$8 = this.c($$2, $$4, $$1);
            akl<dbw> $$9 = this.e($$2, $$4, $$1);
            akl<dbw> $$10 = this.h($$2, $$4, $$1);
            akl<dbw> $$11 = this.a($$2, $$4, $$1, $$10);
            akl<dbw> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dcf.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dcf.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dcf.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dcf.b.a(this.x, this.z), dcf.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dcf.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dcf.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dcf.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dcf.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dcf.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dcf.d, akl<dbw>>> $$0, dcf.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dcf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dcf.b $$5 = this.q[$$4];
            akl<dbw> $$6 = this.a($$2, $$4, $$1);
            akl<dbw> $$7 = this.b($$2, $$4, $$1);
            akl<dbw> $$8 = this.c($$2, $$4, $$1);
            akl<dbw> $$9 = this.e($$2, $$4, $$1);
            akl<dbw> $$10 = this.h($$2, $$4, $$1);
            akl<dbw> $$11 = this.a($$2, $$4, $$1, $$6);
            akl<dbw> $$12 = this.g($$2, $$4, $$1);
            akl<dbw> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dcf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dcf.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dcf.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dcf.b.a(this.x, this.z), dcf.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dcf.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dcf.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dcf.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dcf.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dcf.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dcf.d, akl<dbw>>> $$0, dcf.b $$1) {
      this.a($$0, this.o, this.o, this.x, dcf.b.a(this.r[0], this.r[2]), $$1, 0.0F, dcd.O);
      this.a($$0, dcf.b.a(this.p[1], this.p[2]), this.o, dcf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dcd.g);
      this.a($$0, dcf.b.a(this.p[3], this.p[4]), this.o, dcf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dcd.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dcf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dcf.b $$5 = this.q[$$4];
            akl<dbw> $$6 = this.a($$2, $$4, $$1);
            akl<dbw> $$7 = this.b($$2, $$4, $$1);
            akl<dbw> $$8 = this.c($$2, $$4, $$1);
            akl<dbw> $$9 = this.h($$2, $$4, $$1);
            akl<dbw> $$10 = this.e($$2, $$4, $$1);
            akl<dbw> $$11 = this.a($$2, $$4);
            akl<dbw> $$12 = this.a($$2, $$4, $$1, $$6);
            akl<dbw> $$13 = this.d($$2, $$4, $$1);
            akl<dbw> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dcf.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dcf.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dcf.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dcf.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dcf.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dcf.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dcf.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dcf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dcf.d, akl<dbw>>> $$0, dcf.b $$1) {
      this.a($$0, this.o, this.o, this.x, dcf.b.a(this.r[0], this.r[2]), $$1, 0.0F, dcd.O);
      this.a($$0, dcf.b.a(this.p[1], this.p[2]), this.o, dcf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dcd.g);
      this.a($$0, dcf.b.a(this.p[3], this.p[4]), this.o, dcf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dcd.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dcf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dcf.b $$5 = this.q[$$4];
            akl<dbw> $$6 = this.a($$2, $$4, $$1);
            akl<dbw> $$7 = this.b($$2, $$4, $$1);
            akl<dbw> $$8 = this.c($$2, $$4, $$1);
            akl<dbw> $$9 = this.a($$2, $$4);
            akl<dbw> $$10 = this.a($$2, $$4, $$1, $$6);
            akl<dbw> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dcf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dcf.b.a(this.A, this.B), dcf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dcf.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dcf.b.a(this.A, this.B), dcf.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dcf.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dcf.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dcf.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dcf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dcf.d, akl<dbw>>> $$0, dcf.b $$1) {
      this.a($$0, this.s, this.o, this.x, dcf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dcd.O : dcd.L);
      this.a($$0, this.t, this.o, this.x, dcf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dcd.O : dcd.K);
      this.a($$0, this.s, this.o, this.z, dcf.b.a(this.r[0], this.r[1]), $$1, 0.0F, dcd.L);
      this.a($$0, this.t, this.o, this.z, dcf.b.a(this.r[0], this.r[1]), $$1, 0.0F, dcd.K);
      this.a($$0, this.s, this.o, dcf.b.a(this.x, this.B), dcf.b.a(this.r[2], this.r[5]), $$1, 0.0F, dcd.L);
      this.a($$0, this.t, this.o, dcf.b.a(this.x, this.B), dcf.b.a(this.r[2], this.r[5]), $$1, 0.0F, dcd.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dcd.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dcd.K);
      this.a($$0, dcf.b.a(this.p[1], this.p[2]), this.o, dcf.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dcd.g);
      this.a($$0, dcf.b.a(this.p[3], this.p[4]), this.o, dcf.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dcd.h);
      this.a($$0, this.s, this.o, dcf.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dcd.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dcf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dcf.b $$5 = this.q[$$4];
            akl<dbw> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dcf.b.a(this.A, this.B), dcf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dcf.d, akl<dbw>>> $$0) {
      this.b($$0, this.o, this.o, dcf.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dcd.Z);
      this.b($$0, this.o, dcf.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dcd.aa);
      this.c($$0, this.o, this.o, this.o, dcf.b.a(this.r[0], this.r[1]), this.o, 0.0F, dcd.ab);
   }

   private akl<dbw> a(int $$0, int $$1, dcf.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         akl<dbw> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private akl<dbw> b(int $$0, int $$1, dcf.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private akl<dbw> c(int $$0, int $$1, dcf.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private akl<dbw> a(int $$0, int $$1, dcf.b $$2, akl<dbw> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dcd.w : $$3;
   }

   private akl<dbw> d(int $$0, int $$1, dcf.b $$2) {
      akl<dbw> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private akl<dbw> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dcd.N;
      } else {
         return $$0 == 4 ? dcd.f : dcd.M;
      }
   }

   private akl<dbw> a(int $$0, dcf.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dcd.A : dcd.B;
      } else {
         return $$0 < 3 ? dcd.A : dcd.C;
      }
   }

   private akl<dbw> e(int $$0, int $$1, dcf.b $$2) {
      if ($$2.b() >= 0L) {
         akl<dbw> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private akl<dbw> f(int $$0, int $$1, dcf.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dcd.I : dcd.H;
      } else {
         return $$0 == 3 ? dcd.J : this.a($$1, $$2);
      }
   }

   private akl<dbw> g(int $$0, int $$1, dcf.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dcd.G : dcd.F;
      }
   }

   private akl<dbw> h(int $$0, int $$1, dcf.b $$2) {
      akl<dbw> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dcf.d, akl<dbw>>> $$0, dcf.b $$1, dcf.b $$2, dcf.b $$3, dcf.b $$4, dcf.b $$5, float $$6, akl<dbw> $$7) {
      $$0.accept(Pair.of(dcf.a($$1, $$2, $$3, $$4, dcf.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dcf.a($$1, $$2, $$3, $$4, dcf.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dcf.d, akl<dbw>>> $$0, dcf.b $$1, dcf.b $$2, dcf.b $$3, dcf.b $$4, dcf.b $$5, float $$6, akl<dbw> $$7) {
      $$0.accept(Pair.of(dcf.a($$1, $$2, $$3, $$4, dcf.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dcf.d, akl<dbw>>> $$0, dcf.b $$1, dcf.b $$2, dcf.b $$3, dcf.b $$4, dcf.b $$5, float $$6, akl<dbw> $$7) {
      $$0.accept(Pair.of(dcf.a($$1, $$2, $$3, $$4, dcf.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dwm $$0, dwm $$1, dwm.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dxa.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dxa.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dxa.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dxa.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dcf.a((float)$$0);
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

   private static String a(double $$0, dcf.b[] $$1) {
      double $$2 = (double)dcf.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @azg
   public dcf.b[] b() {
      return this.p;
   }

   @azg
   public dcf.b[] c() {
      return this.q;
   }

   @azg
   public dcf.b[] d() {
      return this.r;
   }

   @azg
   public dcf.b[] e() {
      return new dcf.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @azg
   public dcf.b[] f() {
      return new dcf.b[]{
         dcf.b.a(-2.0F, dxa.a(0.05F)),
         dcf.b.a(dxa.a(0.05F), dxa.a(0.26666668F)),
         dcf.b.a(dxa.a(0.26666668F), dxa.a(0.4F)),
         dcf.b.a(dxa.a(0.4F), dxa.a(0.56666666F)),
         dcf.b.a(dxa.a(0.56666666F), 2.0F)
      };
   }

   @azg
   public dcf.b[] g() {
      return new dcf.b[]{dcf.b.a(-2.0F, 0.0F), dcf.b.a(0.0F, 2.0F)};
   }
}
