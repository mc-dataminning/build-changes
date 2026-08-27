import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class cux {
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
   private final cuq.b o = cuq.b.a(-1.0F, 1.0F);
   private final cuq.b[] p = new cuq.b[]{cuq.b.a(-1.0F, -0.45F), cuq.b.a(-0.45F, -0.15F), cuq.b.a(-0.15F, 0.2F), cuq.b.a(0.2F, 0.55F), cuq.b.a(0.55F, 1.0F)};
   private final cuq.b[] q = new cuq.b[]{cuq.b.a(-1.0F, -0.35F), cuq.b.a(-0.35F, -0.1F), cuq.b.a(-0.1F, 0.1F), cuq.b.a(0.1F, 0.3F), cuq.b.a(0.3F, 1.0F)};
   private final cuq.b[] r = new cuq.b[]{
      cuq.b.a(-1.0F, -0.78F),
      cuq.b.a(-0.78F, -0.375F),
      cuq.b.a(-0.375F, -0.2225F),
      cuq.b.a(-0.2225F, 0.05F),
      cuq.b.a(0.05F, 0.45F),
      cuq.b.a(0.45F, 0.55F),
      cuq.b.a(0.55F, 1.0F)
   };
   private final cuq.b s = this.p[0];
   private final cuq.b t = cuq.b.a(this.p[1], this.p[4]);
   private final cuq.b u = cuq.b.a(-1.2F, -1.05F);
   private final cuq.b v = cuq.b.a(-1.05F, -0.455F);
   private final cuq.b w = cuq.b.a(-0.455F, -0.19F);
   private final cuq.b x = cuq.b.a(-0.19F, -0.11F);
   private final cuq.b y = cuq.b.a(-0.11F, 0.55F);
   private final cuq.b z = cuq.b.a(-0.11F, 0.03F);
   private final cuq.b A = cuq.b.a(0.03F, 0.3F);
   private final cuq.b B = cuq.b.a(0.3F, 1.0F);
   private final ahc<cuh>[][] C = new ahc[][]{{cuo.X, cuo.V, cuo.T, cuo.R, cuo.P}, {cuo.W, cuo.U, cuo.S, cuo.Q, cuo.P}};
   private final ahc<cuh>[][] D = new ahc[][]{
      {cuo.d, cuo.d, cuo.d, cuo.q, cuo.p},
      {cuo.b, cuo.b, cuo.i, cuo.p, cuo.o},
      {cuo.j, cuo.b, cuo.i, cuo.k, cuo.l},
      {cuo.r, cuo.r, cuo.i, cuo.x, cuo.x},
      {cuo.f, cuo.f, cuo.f, cuo.f, cuo.f}
   };
   private final ahc<cuh>[][] E = new ahc[][]{
      {cuo.e, null, cuo.q, null, null},
      {null, null, null, null, cuo.n},
      {cuo.c, null, null, cuo.m, null},
      {null, null, cuo.b, cuo.y, cuo.z},
      {null, null, null, null, null}
   };
   private final ahc<cuh>[][] F = new ahc[][]{
      {cuo.d, cuo.d, cuo.d, cuo.q, cuo.q},
      {cuo.D, cuo.D, cuo.i, cuo.p, cuo.o},
      {cuo.D, cuo.D, cuo.D, cuo.D, cuo.l},
      {cuo.s, cuo.s, cuo.i, cuo.i, cuo.x},
      {cuo.A, cuo.A, cuo.A, cuo.C, cuo.C}
   };
   private final ahc<cuh>[][] G = new ahc[][]{
      {cuo.e, null, null, null, null},
      {cuo.E, null, cuo.D, cuo.D, cuo.n},
      {cuo.E, cuo.E, cuo.i, cuo.k, null},
      {null, null, null, null, null},
      {cuo.B, cuo.B, null, null, null}
   };
   private final ahc<cuh>[][] H = new ahc[][]{
      {cuo.u, cuo.u, cuo.t, cuo.v, cuo.v},
      {cuo.u, cuo.u, cuo.t, cuo.v, cuo.v},
      {cuo.t, cuo.t, cuo.t, cuo.v, cuo.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<cuq.d> a() {
      cuq.b $$0 = cuq.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new cuq.d(this.o, this.o, cuq.b.a(this.y, this.o), this.o, $$0, cuq.b.a(-1.0F, -0.16F), 0L),
         new cuq.d(this.o, this.o, cuq.b.a(this.y, this.o), this.o, $$0, cuq.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<cuq.d, ahc<cuh>>> $$0) {
      if (aa.at) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<cuq.d, ahc<cuh>>> $$0) {
      ij.b $$1 = nn.a();
      ii<doc> $$2 = $$1.b(ke.ax);
      dod.w.a $$3 = new dod.w.a($$2.b(doq.d));
      dod.w.a $$4 = new dod.w.a($$2.b(doq.e));
      dod.w.a $$5 = new dod.w.a($$2.b(doq.g));
      $$0.accept(Pair.of(cuq.a(this.o, this.o, this.o, this.o, cuq.b.a(0.0F), this.o, 0.01F), cuo.b));
      if (pr.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, avk.a) instanceof atk.e<?, ?> $$7) {
         ahc<cuh> $$8 = cuo.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(cuq.a(this.o, this.o, this.o, cuq.b.a($$9), cuq.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == cuo.f ? cuo.A : cuo.f;
         }
      }

      if (pr.a($$3, $$4, $$5, false) instanceof atk.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(cuq.a(this.o, this.o, cuq.b.a($$12), this.o, cuq.b.a(0.0F), this.o, 0.0F), cuo.q));
         }
      }
   }

   private void c(Consumer<Pair<cuq.d, ahc<cuh>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, cuo.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         cuq.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<cuq.d, ahc<cuh>>> $$0) {
      this.c($$0, cuq.b.a(-1.0F, -0.93333334F));
      this.b($$0, cuq.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, cuq.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, cuq.b.a(-0.56666666F, -0.4F));
      this.c($$0, cuq.b.a(-0.4F, -0.26666668F));
      this.d($$0, cuq.b.a(-0.26666668F, -0.05F));
      this.e($$0, cuq.b.a(-0.05F, 0.05F));
      this.d($$0, cuq.b.a(0.05F, 0.26666668F));
      this.c($$0, cuq.b.a(0.26666668F, 0.4F));
      this.b($$0, cuq.b.a(0.4F, 0.56666666F));
      this.a($$0, cuq.b.a(0.56666666F, 0.7666667F));
      this.b($$0, cuq.b.a(0.7666667F, 0.93333334F));
      this.c($$0, cuq.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<cuq.d, ahc<cuh>>> $$0, cuq.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cuq.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cuq.b $$5 = this.q[$$4];
            ahc<cuh> $$6 = this.a($$2, $$4, $$1);
            ahc<cuh> $$7 = this.b($$2, $$4, $$1);
            ahc<cuh> $$8 = this.c($$2, $$4, $$1);
            ahc<cuh> $$9 = this.e($$2, $$4, $$1);
            ahc<cuh> $$10 = this.h($$2, $$4, $$1);
            ahc<cuh> $$11 = this.a($$2, $$4, $$1, $$10);
            ahc<cuh> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cuq.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cuq.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cuq.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cuq.b.a(this.x, this.z), cuq.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cuq.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cuq.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cuq.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cuq.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cuq.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<cuq.d, ahc<cuh>>> $$0, cuq.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cuq.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cuq.b $$5 = this.q[$$4];
            ahc<cuh> $$6 = this.a($$2, $$4, $$1);
            ahc<cuh> $$7 = this.b($$2, $$4, $$1);
            ahc<cuh> $$8 = this.c($$2, $$4, $$1);
            ahc<cuh> $$9 = this.e($$2, $$4, $$1);
            ahc<cuh> $$10 = this.h($$2, $$4, $$1);
            ahc<cuh> $$11 = this.a($$2, $$4, $$1, $$6);
            ahc<cuh> $$12 = this.g($$2, $$4, $$1);
            ahc<cuh> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, cuq.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cuq.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cuq.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cuq.b.a(this.x, this.z), cuq.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cuq.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cuq.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cuq.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cuq.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cuq.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<cuq.d, ahc<cuh>>> $$0, cuq.b $$1) {
      this.a($$0, this.o, this.o, this.x, cuq.b.a(this.r[0], this.r[2]), $$1, 0.0F, cuo.O);
      this.a($$0, cuq.b.a(this.p[1], this.p[2]), this.o, cuq.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cuo.g);
      this.a($$0, cuq.b.a(this.p[3], this.p[4]), this.o, cuq.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cuo.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cuq.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cuq.b $$5 = this.q[$$4];
            ahc<cuh> $$6 = this.a($$2, $$4, $$1);
            ahc<cuh> $$7 = this.b($$2, $$4, $$1);
            ahc<cuh> $$8 = this.c($$2, $$4, $$1);
            ahc<cuh> $$9 = this.h($$2, $$4, $$1);
            ahc<cuh> $$10 = this.e($$2, $$4, $$1);
            ahc<cuh> $$11 = this.a($$2, $$4);
            ahc<cuh> $$12 = this.a($$2, $$4, $$1, $$6);
            ahc<cuh> $$13 = this.d($$2, $$4, $$1);
            ahc<cuh> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cuq.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, cuq.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cuq.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cuq.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, cuq.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, cuq.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cuq.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cuq.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<cuq.d, ahc<cuh>>> $$0, cuq.b $$1) {
      this.a($$0, this.o, this.o, this.x, cuq.b.a(this.r[0], this.r[2]), $$1, 0.0F, cuo.O);
      this.a($$0, cuq.b.a(this.p[1], this.p[2]), this.o, cuq.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cuo.g);
      this.a($$0, cuq.b.a(this.p[3], this.p[4]), this.o, cuq.b.a(this.z, this.B), this.r[6], $$1, 0.0F, cuo.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cuq.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cuq.b $$5 = this.q[$$4];
            ahc<cuh> $$6 = this.a($$2, $$4, $$1);
            ahc<cuh> $$7 = this.b($$2, $$4, $$1);
            ahc<cuh> $$8 = this.c($$2, $$4, $$1);
            ahc<cuh> $$9 = this.a($$2, $$4);
            ahc<cuh> $$10 = this.a($$2, $$4, $$1, $$6);
            ahc<cuh> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, cuq.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, cuq.b.a(this.A, this.B), cuq.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, cuq.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cuq.b.a(this.A, this.B), cuq.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, cuq.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cuq.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cuq.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cuq.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<cuq.d, ahc<cuh>>> $$0, cuq.b $$1) {
      this.a($$0, this.s, this.o, this.x, cuq.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cuo.O : cuo.L);
      this.a($$0, this.t, this.o, this.x, cuq.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? cuo.O : cuo.K);
      this.a($$0, this.s, this.o, this.z, cuq.b.a(this.r[0], this.r[1]), $$1, 0.0F, cuo.L);
      this.a($$0, this.t, this.o, this.z, cuq.b.a(this.r[0], this.r[1]), $$1, 0.0F, cuo.K);
      this.a($$0, this.s, this.o, cuq.b.a(this.x, this.B), cuq.b.a(this.r[2], this.r[5]), $$1, 0.0F, cuo.L);
      this.a($$0, this.t, this.o, cuq.b.a(this.x, this.B), cuq.b.a(this.r[2], this.r[5]), $$1, 0.0F, cuo.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, cuo.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, cuo.K);
      this.a($$0, cuq.b.a(this.p[1], this.p[2]), this.o, cuq.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cuo.g);
      this.a($$0, cuq.b.a(this.p[3], this.p[4]), this.o, cuq.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cuo.h);
      this.a($$0, this.s, this.o, cuq.b.a(this.y, this.B), this.r[6], $$1, 0.0F, cuo.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cuq.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cuq.b $$5 = this.q[$$4];
            ahc<cuh> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cuq.b.a(this.A, this.B), cuq.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<cuq.d, ahc<cuh>>> $$0) {
      this.b($$0, this.o, this.o, cuq.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, cuo.Z);
      this.b($$0, this.o, cuq.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, cuo.aa);
      this.c($$0, this.o, this.o, this.o, cuq.b.a(this.r[0], this.r[1]), this.o, 0.0F, cuo.ab);
   }

   private ahc<cuh> a(int $$0, int $$1, cuq.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         ahc<cuh> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private ahc<cuh> b(int $$0, int $$1, cuq.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private ahc<cuh> c(int $$0, int $$1, cuq.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private ahc<cuh> a(int $$0, int $$1, cuq.b $$2, ahc<cuh> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? cuo.w : $$3;
   }

   private ahc<cuh> d(int $$0, int $$1, cuq.b $$2) {
      ahc<cuh> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private ahc<cuh> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return cuo.N;
      } else {
         return $$0 == 4 ? cuo.f : cuo.M;
      }
   }

   private ahc<cuh> a(int $$0, cuq.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? cuo.A : cuo.B;
      } else {
         return $$0 < 3 ? cuo.A : cuo.C;
      }
   }

   private ahc<cuh> e(int $$0, int $$1, cuq.b $$2) {
      if ($$2.b() >= 0L) {
         ahc<cuh> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private ahc<cuh> f(int $$0, int $$1, cuq.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? cuo.I : cuo.H;
      } else {
         return $$0 == 3 ? cuo.J : this.a($$1, $$2);
      }
   }

   private ahc<cuh> g(int $$0, int $$1, cuq.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? cuo.G : cuo.F;
      }
   }

   private ahc<cuh> h(int $$0, int $$1, cuq.b $$2) {
      ahc<cuh> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<cuq.d, ahc<cuh>>> $$0, cuq.b $$1, cuq.b $$2, cuq.b $$3, cuq.b $$4, cuq.b $$5, float $$6, ahc<cuh> $$7) {
      $$0.accept(Pair.of(cuq.a($$1, $$2, $$3, $$4, cuq.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(cuq.a($$1, $$2, $$3, $$4, cuq.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<cuq.d, ahc<cuh>>> $$0, cuq.b $$1, cuq.b $$2, cuq.b $$3, cuq.b $$4, cuq.b $$5, float $$6, ahc<cuh> $$7) {
      $$0.accept(Pair.of(cuq.a($$1, $$2, $$3, $$4, cuq.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<cuq.d, ahc<cuh>>> $$0, cuq.b $$1, cuq.b $$2, cuq.b $$3, cuq.b $$4, cuq.b $$5, float $$6, ahc<cuh> $$7) {
      $$0.accept(Pair.of(cuq.a($$1, $$2, $$3, $$4, cuq.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(doc $$0, doc $$1, doc.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)doq.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)doq.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)doq.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)doq.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)cuq.a((float)$$0);
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

   private static String a(double $$0, cuq.b[] $$1) {
      double $$2 = (double)cuq.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @avn
   public cuq.b[] b() {
      return this.p;
   }

   @avn
   public cuq.b[] c() {
      return this.q;
   }

   @avn
   public cuq.b[] d() {
      return this.r;
   }

   @avn
   public cuq.b[] e() {
      return new cuq.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @avn
   public cuq.b[] f() {
      return new cuq.b[]{
         cuq.b.a(-2.0F, doq.a(0.05F)),
         cuq.b.a(doq.a(0.05F), doq.a(0.26666668F)),
         cuq.b.a(doq.a(0.26666668F), doq.a(0.4F)),
         cuq.b.a(doq.a(0.4F), doq.a(0.56666666F)),
         cuq.b.a(doq.a(0.56666666F), 2.0F)
      };
   }

   @avn
   public cuq.b[] g() {
      return new cuq.b[]{cuq.b.a(-2.0F, 0.0F), cuq.b.a(0.0F, 2.0F)};
   }
}
