import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class cvm {
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
   private final cvf.b o = cvf.b.a(-1.0F, 1.0F);
   private final cvf.b[] p = new cvf.b[]{cvf.b.a(-1.0F, -0.45F), cvf.b.a(-0.45F, -0.15F), cvf.b.a(-0.15F, 0.2F), cvf.b.a(0.2F, 0.55F), cvf.b.a(0.55F, 1.0F)};
   private final cvf.b[] q = new cvf.b[]{cvf.b.a(-1.0F, -0.35F), cvf.b.a(-0.35F, -0.1F), cvf.b.a(-0.1F, 0.1F), cvf.b.a(0.1F, 0.3F), cvf.b.a(0.3F, 1.0F)};
   private final cvf.b[] r = new cvf.b[]{
      cvf.b.a(-1.0F, -0.78F),
      cvf.b.a(-0.78F, -0.375F),
      cvf.b.a(-0.375F, -0.2225F),
      cvf.b.a(-0.2225F, 0.05F),
      cvf.b.a(0.05F, 0.45F),
      cvf.b.a(0.45F, 0.55F),
      cvf.b.a(0.55F, 1.0F)
   };
   private final cvf.b s = this.p[0];
   private final cvf.b t = cvf.b.a(this.p[1], this.p[4]);
   private final cvf.b u = cvf.b.a(-1.2F, -1.05F);
   private final cvf.b v = cvf.b.a(-1.05F, -0.455F);
   private final cvf.b w = cvf.b.a(-0.455F, -0.19F);
   private final cvf.b x = cvf.b.a(-0.19F, -0.11F);
   private final cvf.b y = cvf.b.a(-0.11F, 0.55F);
   private final cvf.b z = cvf.b.a(-0.11F, 0.03F);
   private final cvf.b A = cvf.b.a(0.03F, 0.3F);
   private final cvf.b B = cvf.b.a(0.3F, 1.0F);
   private final ahg<cuw>[][] C = new ahg[][]{{cvd.X, cvd.V, cvd.T, cvd.R, cvd.P}, {cvd.W, cvd.U, cvd.S, cvd.Q, cvd.P}};
   private final ahg<cuw>[][] D = new ahg[][]{
      {cvd.d, cvd.d, cvd.d, cvd.q, cvd.p},
      {cvd.b, cvd.b, cvd.i, cvd.p, cvd.o},
      {cvd.j, cvd.b, cvd.i, cvd.k, cvd.l},
      {cvd.r, cvd.r, cvd.i, cvd.x, cvd.x},
      {cvd.f, cvd.f, cvd.f, cvd.f, cvd.f}
   };
   private final ahg<cuw>[][] E = new ahg[][]{
      {cvd.e, null, cvd.q, null, null},
      {null, null, null, null, cvd.n},
      {cvd.c, null, null, cvd.m, null},
      {null, null, cvd.b, cvd.y, cvd.z},
      {null, null, null, null, null}
   };
   private final ahg<cuw>[][] F = new ahg[][]{
      {cvd.d, cvd.d, cvd.d, cvd.q, cvd.q},
      {cvd.D, cvd.D, cvd.i, cvd.p, cvd.o},
      {cvd.D, cvd.D, cvd.D, cvd.D, cvd.l},
      {cvd.s, cvd.s, cvd.i, cvd.i, cvd.x},
      {cvd.A, cvd.A, cvd.A, cvd.C, cvd.C}
   };
   private final ahg<cuw>[][] G = new ahg[][]{
      {cvd.e, null, null, null, null},
      {cvd.E, null, cvd.D, cvd.D, cvd.n},
      {cvd.E, cvd.E, cvd.i, cvd.k, null},
      {null, null, null, null, null},
      {cvd.B, cvd.B, null, null, null}
   };
   private final ahg<cuw>[][] H = new ahg[][]{
      {cvd.u, cvd.u, cvd.t, cvd.v, cvd.v},
      {cvd.u, cvd.u, cvd.t, cvd.v, cvd.v},
      {cvd.t, cvd.t, cvd.t, cvd.v, cvd.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<cvf.d> a() {
      cvf.b $$0 = cvf.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new cvf.d(this.o, this.o, cvf.b.a(this.y, this.o), this.o, $$0, cvf.b.a(-1.0F, -0.16F), 0L),
         new cvf.d(this.o, this.o, cvf.b.a(this.y, this.o), this.o, $$0, cvf.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<cvf.d, ahg<cuw>>> $$0) {
      if (aa.at) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<cvf.d, ahg<cuw>>> $$0) {
      ij.b $$1 = np.a();
      ii<dor> $$2 = $$1.b(ke.ax);
      dos.w.a $$3 = new dos.w.a($$2.b(dpf.d));
      dos.w.a $$4 = new dos.w.a($$2.b(dpf.e));
      dos.w.a $$5 = new dos.w.a($$2.b(dpf.g));
      $$0.accept(Pair.of(cvf.a(this.o, this.o, this.o, this.o, cvf.b.a(0.0F), this.o, 0.01F), cvd.b));
      if (pu.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, avr.a) instanceof atr.e<?, ?> $$7) {
         ahg<cuw> $$8 = cvd.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(cvf.a(this.o, this.o, this.o, cvf.b.a($$9), cvf.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == cvd.f ? cvd.A : cvd.f;
         }
      }

      if (pu.a($$3, $$4, $$5, false) instanceof atr.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(cvf.a(this.o, this.o, cvf.b.a($$12), this.o, cvf.b.a(0.0F), this.o, 0.0F), cvd.q));
         }
      }
   }

   private void c(Consumer<Pair<cvf.d, ahg<cuw>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, cvd.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         cvf.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<cvf.d, ahg<cuw>>> $$0) {
      this.c($$0, cvf.b.a(-1.0F, -0.93333334F));
      this.b($$0, cvf.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, cvf.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, cvf.b.a(-0.56666666F, -0.4F));
      this.c($$0, cvf.b.a(-0.4F, -0.26666668F));
      this.d($$0, cvf.b.a(-0.26666668F, -0.05F));
      this.e($$0, cvf.b.a(-0.05F, 0.05F));
      this.d($$0, cvf.b.a(0.05F, 0.26666668F));
      this.c($$0, cvf.b.a(0.26666668F, 0.4F));
      this.b($$0, cvf.b.a(0.4F, 0.56666666F));
      this.a($$0, cvf.b.a(0.56666666F, 0.7666667F));
      this.b($$0, cvf.b.a(0.7666667F, 0.93333334F));
      this.c($$0, cvf.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<cvf.d, ahg<cuw>>> $$0, cvf.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cvf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cvf.b $$5 = this.q[$$4];
            ahg<cuw> $$6 = this.a($$2, $$4, $$1);
            ahg<cuw> $$7 = this.b($$2, $$4, $$1);
            ahg<cuw> $$8 = this.c($$2, $$4, $$1);
            ahg<cuw> $$9 = this.e($$2, $$4, $$1);
            ahg<cuw> $$10 = this.h($$2, $$4, $$1);
            ahg<cuw> $$11 = this.a($$2, $$4, $$1, $$10);
            ahg<cuw> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cvf.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cvf.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cvf.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cvf.b.a(this.x, this.z), cvf.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cvf.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cvf.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cvf.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cvf.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cvf.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<cvf.d, ahg<cuw>>> $$0, cvf.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cvf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cvf.b $$5 = this.q[$$4];
            ahg<cuw> $$6 = this.a($$2, $$4, $$1);
            ahg<cuw> $$7 = this.b($$2, $$4, $$1);
            ahg<cuw> $$8 = this.c($$2, $$4, $$1);
            ahg<cuw> $$9 = this.e($$2, $$4, $$1);
            ahg<cuw> $$10 = this.h($$2, $$4, $$1);
            ahg<cuw> $$11 = this.a($$2, $$4, $$1, $$6);
            ahg<cuw> $$12 = this.g($$2, $$4, $$1);
            ahg<cuw> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, cvf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cvf.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cvf.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cvf.b.a(this.x, this.z), cvf.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cvf.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cvf.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cvf.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cvf.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cvf.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<cvf.d, ahg<cuw>>> $$0, cvf.b $$1) {
      this.a($$0, this.o, this.o, this.x, cvf.b.a(this.r[0], this.r[2]), $$1, 0.0F, cvd.O);
      this.a($$0, cvf.b.a(this.p[1], this.p[2]), this.o, cvf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cvd.g);
      this.a($$0, cvf.b.a(this.p[3], this.p[4]), this.o, cvf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cvd.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cvf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cvf.b $$5 = this.q[$$4];
            ahg<cuw> $$6 = this.a($$2, $$4, $$1);
            ahg<cuw> $$7 = this.b($$2, $$4, $$1);
            ahg<cuw> $$8 = this.c($$2, $$4, $$1);
            ahg<cuw> $$9 = this.h($$2, $$4, $$1);
            ahg<cuw> $$10 = this.e($$2, $$4, $$1);
            ahg<cuw> $$11 = this.a($$2, $$4);
            ahg<cuw> $$12 = this.a($$2, $$4, $$1, $$6);
            ahg<cuw> $$13 = this.d($$2, $$4, $$1);
            ahg<cuw> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cvf.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, cvf.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cvf.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cvf.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, cvf.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, cvf.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cvf.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cvf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<cvf.d, ahg<cuw>>> $$0, cvf.b $$1) {
      this.a($$0, this.o, this.o, this.x, cvf.b.a(this.r[0], this.r[2]), $$1, 0.0F, cvd.O);
      this.a($$0, cvf.b.a(this.p[1], this.p[2]), this.o, cvf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cvd.g);
      this.a($$0, cvf.b.a(this.p[3], this.p[4]), this.o, cvf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cvd.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cvf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cvf.b $$5 = this.q[$$4];
            ahg<cuw> $$6 = this.a($$2, $$4, $$1);
            ahg<cuw> $$7 = this.b($$2, $$4, $$1);
            ahg<cuw> $$8 = this.c($$2, $$4, $$1);
            ahg<cuw> $$9 = this.a($$2, $$4);
            ahg<cuw> $$10 = this.a($$2, $$4, $$1, $$6);
            ahg<cuw> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, cvf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, cvf.b.a(this.A, this.B), cvf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, cvf.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cvf.b.a(this.A, this.B), cvf.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, cvf.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cvf.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cvf.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cvf.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<cvf.d, ahg<cuw>>> $$0, cvf.b $$1) {
      this.a($$0, this.s, this.o, this.x, cvf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cvd.O : cvd.L);
      this.a($$0, this.t, this.o, this.x, cvf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cvd.O : cvd.K);
      this.a($$0, this.s, this.o, this.z, cvf.b.a(this.r[0], this.r[1]), $$1, 0.0F, cvd.L);
      this.a($$0, this.t, this.o, this.z, cvf.b.a(this.r[0], this.r[1]), $$1, 0.0F, cvd.K);
      this.a($$0, this.s, this.o, cvf.b.a(this.x, this.B), cvf.b.a(this.r[2], this.r[5]), $$1, 0.0F, cvd.L);
      this.a($$0, this.t, this.o, cvf.b.a(this.x, this.B), cvf.b.a(this.r[2], this.r[5]), $$1, 0.0F, cvd.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, cvd.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, cvd.K);
      this.a($$0, cvf.b.a(this.p[1], this.p[2]), this.o, cvf.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cvd.g);
      this.a($$0, cvf.b.a(this.p[3], this.p[4]), this.o, cvf.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cvd.h);
      this.a($$0, this.s, this.o, cvf.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cvd.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cvf.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cvf.b $$5 = this.q[$$4];
            ahg<cuw> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cvf.b.a(this.A, this.B), cvf.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<cvf.d, ahg<cuw>>> $$0) {
      this.b($$0, this.o, this.o, cvf.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, cvd.Z);
      this.b($$0, this.o, cvf.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, cvd.aa);
      this.c($$0, this.o, this.o, this.o, cvf.b.a(this.r[0], this.r[1]), this.o, 0.0F, cvd.ab);
   }

   private ahg<cuw> a(int $$0, int $$1, cvf.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         ahg<cuw> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private ahg<cuw> b(int $$0, int $$1, cvf.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private ahg<cuw> c(int $$0, int $$1, cvf.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private ahg<cuw> a(int $$0, int $$1, cvf.b $$2, ahg<cuw> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? cvd.w : $$3;
   }

   private ahg<cuw> d(int $$0, int $$1, cvf.b $$2) {
      ahg<cuw> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private ahg<cuw> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return cvd.N;
      } else {
         return $$0 == 4 ? cvd.f : cvd.M;
      }
   }

   private ahg<cuw> a(int $$0, cvf.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? cvd.A : cvd.B;
      } else {
         return $$0 < 3 ? cvd.A : cvd.C;
      }
   }

   private ahg<cuw> e(int $$0, int $$1, cvf.b $$2) {
      if ($$2.b() >= 0L) {
         ahg<cuw> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private ahg<cuw> f(int $$0, int $$1, cvf.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? cvd.I : cvd.H;
      } else {
         return $$0 == 3 ? cvd.J : this.a($$1, $$2);
      }
   }

   private ahg<cuw> g(int $$0, int $$1, cvf.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? cvd.G : cvd.F;
      }
   }

   private ahg<cuw> h(int $$0, int $$1, cvf.b $$2) {
      ahg<cuw> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<cvf.d, ahg<cuw>>> $$0, cvf.b $$1, cvf.b $$2, cvf.b $$3, cvf.b $$4, cvf.b $$5, float $$6, ahg<cuw> $$7) {
      $$0.accept(Pair.of(cvf.a($$1, $$2, $$3, $$4, cvf.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(cvf.a($$1, $$2, $$3, $$4, cvf.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<cvf.d, ahg<cuw>>> $$0, cvf.b $$1, cvf.b $$2, cvf.b $$3, cvf.b $$4, cvf.b $$5, float $$6, ahg<cuw> $$7) {
      $$0.accept(Pair.of(cvf.a($$1, $$2, $$3, $$4, cvf.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<cvf.d, ahg<cuw>>> $$0, cvf.b $$1, cvf.b $$2, cvf.b $$3, cvf.b $$4, cvf.b $$5, float $$6, ahg<cuw> $$7) {
      $$0.accept(Pair.of(cvf.a($$1, $$2, $$3, $$4, cvf.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dor $$0, dor $$1, dor.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dpf.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dpf.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dpf.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dpf.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)cvf.a((float)$$0);
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

   private static String a(double $$0, cvf.b[] $$1) {
      double $$2 = (double)cvf.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @avu
   public cvf.b[] b() {
      return this.p;
   }

   @avu
   public cvf.b[] c() {
      return this.q;
   }

   @avu
   public cvf.b[] d() {
      return this.r;
   }

   @avu
   public cvf.b[] e() {
      return new cvf.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @avu
   public cvf.b[] f() {
      return new cvf.b[]{
         cvf.b.a(-2.0F, dpf.a(0.05F)),
         cvf.b.a(dpf.a(0.05F), dpf.a(0.26666668F)),
         cvf.b.a(dpf.a(0.26666668F), dpf.a(0.4F)),
         cvf.b.a(dpf.a(0.4F), dpf.a(0.56666666F)),
         cvf.b.a(dpf.a(0.56666666F), 2.0F)
      };
   }

   @avu
   public cvf.b[] g() {
      return new cvf.b[]{cvf.b.a(-2.0F, 0.0F), cvf.b.a(0.0F, 2.0F)};
   }
}
