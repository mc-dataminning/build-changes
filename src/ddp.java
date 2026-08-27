import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class ddp {
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
   private final ddi.b o = ddi.b.a(-1.0F, 1.0F);
   private final ddi.b[] p = new ddi.b[]{ddi.b.a(-1.0F, -0.45F), ddi.b.a(-0.45F, -0.15F), ddi.b.a(-0.15F, 0.2F), ddi.b.a(0.2F, 0.55F), ddi.b.a(0.55F, 1.0F)};
   private final ddi.b[] q = new ddi.b[]{ddi.b.a(-1.0F, -0.35F), ddi.b.a(-0.35F, -0.1F), ddi.b.a(-0.1F, 0.1F), ddi.b.a(0.1F, 0.3F), ddi.b.a(0.3F, 1.0F)};
   private final ddi.b[] r = new ddi.b[]{
      ddi.b.a(-1.0F, -0.78F),
      ddi.b.a(-0.78F, -0.375F),
      ddi.b.a(-0.375F, -0.2225F),
      ddi.b.a(-0.2225F, 0.05F),
      ddi.b.a(0.05F, 0.45F),
      ddi.b.a(0.45F, 0.55F),
      ddi.b.a(0.55F, 1.0F)
   };
   private final ddi.b s = this.p[0];
   private final ddi.b t = ddi.b.a(this.p[1], this.p[4]);
   private final ddi.b u = ddi.b.a(-1.2F, -1.05F);
   private final ddi.b v = ddi.b.a(-1.05F, -0.455F);
   private final ddi.b w = ddi.b.a(-0.455F, -0.19F);
   private final ddi.b x = ddi.b.a(-0.19F, -0.11F);
   private final ddi.b y = ddi.b.a(-0.11F, 0.55F);
   private final ddi.b z = ddi.b.a(-0.11F, 0.03F);
   private final ddi.b A = ddi.b.a(0.03F, 0.3F);
   private final ddi.b B = ddi.b.a(0.3F, 1.0F);
   private final aks<dcz>[][] C = new aks[][]{{ddg.ac, ddg.aa, ddg.Y, ddg.W, ddg.U}, {ddg.ab, ddg.Z, ddg.X, ddg.V, ddg.U}};
   private final aks<dcz>[][] D = new aks[][]{
      {ddg.i, ddg.i, ddg.i, ddg.v, ddg.u},
      {ddg.b, ddg.b, ddg.n, ddg.u, ddg.t},
      {ddg.o, ddg.b, ddg.n, ddg.p, ddg.q},
      {ddg.w, ddg.w, ddg.n, ddg.C, ddg.C},
      {ddg.k, ddg.k, ddg.k, ddg.k, ddg.k}
   };
   private final aks<dcz>[][] E = new aks[][]{
      {ddg.j, null, ddg.v, null, null},
      {null, null, null, null, ddg.s},
      {ddg.c, null, null, ddg.r, null},
      {null, null, ddg.b, ddg.D, ddg.E},
      {null, null, null, null, null}
   };
   private final aks<dcz>[][] F = new aks[][]{
      {ddg.i, ddg.i, ddg.i, ddg.v, ddg.v},
      {ddg.I, ddg.I, ddg.n, ddg.u, ddg.t},
      {ddg.I, ddg.I, ddg.I, ddg.I, ddg.q},
      {ddg.x, ddg.x, ddg.n, ddg.n, ddg.C},
      {ddg.F, ddg.F, ddg.F, ddg.H, ddg.H}
   };
   private final aks<dcz>[][] G = new aks[][]{
      {ddg.j, null, null, null, null},
      {ddg.J, null, ddg.I, ddg.I, ddg.s},
      {ddg.J, ddg.J, ddg.n, ddg.p, null},
      {null, null, null, null, null},
      {ddg.G, ddg.G, null, null, null}
   };
   private final aks<dcz>[][] H = new aks[][]{
      {ddg.z, ddg.z, ddg.y, ddg.A, ddg.A},
      {ddg.z, ddg.z, ddg.y, ddg.A, ddg.A},
      {ddg.y, ddg.y, ddg.y, ddg.A, ddg.A},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<ddi.d> a() {
      ddi.b $$0 = ddi.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new ddi.d(this.o, this.o, ddi.b.a(this.y, this.o), this.o, $$0, ddi.b.a(-1.0F, -0.16F), 0L),
         new ddi.d(this.o, this.o, ddi.b.a(this.y, this.o), this.o, $$0, ddi.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<ddi.d, aks<dcz>>> $$0) {
      if (ab.as) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<ddi.d, aks<dcz>>> $$0) {
      jc.a $$1 = oy.a();
      jb<dyn> $$2 = $$1.b(li.aD);
      dyo.w.a $$3 = new dyo.w.a($$2.b(dzb.d));
      dyo.w.a $$4 = new dyo.w.a($$2.b(dzb.e));
      dyo.w.a $$5 = new dyo.w.a($$2.b(dzb.g));
      $$0.accept(Pair.of(ddi.a(this.o, this.o, this.o, this.o, ddi.b.a(0.0F), this.o, 0.01F), ddg.b));
      if (rj.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, azm.a) instanceof axo.e<?, ?> $$7) {
         aks<dcz> $$8 = ddg.k;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(ddi.a(this.o, this.o, this.o, ddi.b.a($$9), ddi.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == ddg.k ? ddg.F : ddg.k;
         }
      }

      if (rj.a($$3, $$4, $$5, false) instanceof axo.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(ddi.a(this.o, this.o, ddi.b.a($$12), this.o, ddi.b.a(0.0F), this.o, 0.0F), ddg.v));
         }
      }
   }

   private void c(Consumer<Pair<ddi.d, aks<dcz>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, ddg.ad);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         ddi.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<ddi.d, aks<dcz>>> $$0) {
      this.c($$0, ddi.b.a(-1.0F, -0.93333334F));
      this.b($$0, ddi.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, ddi.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, ddi.b.a(-0.56666666F, -0.4F));
      this.c($$0, ddi.b.a(-0.4F, -0.26666668F));
      this.d($$0, ddi.b.a(-0.26666668F, -0.05F));
      this.e($$0, ddi.b.a(-0.05F, 0.05F));
      this.d($$0, ddi.b.a(0.05F, 0.26666668F));
      this.c($$0, ddi.b.a(0.26666668F, 0.4F));
      this.b($$0, ddi.b.a(0.4F, 0.56666666F));
      this.a($$0, ddi.b.a(0.56666666F, 0.7666667F));
      this.b($$0, ddi.b.a(0.7666667F, 0.93333334F));
      this.c($$0, ddi.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<ddi.d, aks<dcz>>> $$0, ddi.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddi.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddi.b $$5 = this.q[$$4];
            aks<dcz> $$6 = this.a($$2, $$4, $$1);
            aks<dcz> $$7 = this.b($$2, $$4, $$1);
            aks<dcz> $$8 = this.c($$2, $$4, $$1);
            aks<dcz> $$9 = this.e($$2, $$4, $$1);
            aks<dcz> $$10 = this.h($$2, $$4, $$1);
            aks<dcz> $$11 = this.a($$2, $$4, $$1, $$10);
            aks<dcz> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddi.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddi.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddi.b.a(this.x, this.z), ddi.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddi.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddi.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddi.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<ddi.d, aks<dcz>>> $$0, ddi.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddi.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddi.b $$5 = this.q[$$4];
            aks<dcz> $$6 = this.a($$2, $$4, $$1);
            aks<dcz> $$7 = this.b($$2, $$4, $$1);
            aks<dcz> $$8 = this.c($$2, $$4, $$1);
            aks<dcz> $$9 = this.e($$2, $$4, $$1);
            aks<dcz> $$10 = this.h($$2, $$4, $$1);
            aks<dcz> $$11 = this.a($$2, $$4, $$1, $$6);
            aks<dcz> $$12 = this.g($$2, $$4, $$1);
            aks<dcz> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, ddi.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddi.b.a(this.x, this.z), ddi.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddi.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddi.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddi.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<ddi.d, aks<dcz>>> $$0, ddi.b $$1) {
      this.a($$0, this.o, this.o, this.x, ddi.b.a(this.r[0], this.r[2]), $$1, 0.0F, ddg.T);
      this.a($$0, ddi.b.a(this.p[1], this.p[2]), this.o, ddi.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddg.l);
      this.a($$0, ddi.b.a(this.p[3], this.p[4]), this.o, ddi.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddg.m);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddi.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddi.b $$5 = this.q[$$4];
            aks<dcz> $$6 = this.a($$2, $$4, $$1);
            aks<dcz> $$7 = this.b($$2, $$4, $$1);
            aks<dcz> $$8 = this.c($$2, $$4, $$1);
            aks<dcz> $$9 = this.h($$2, $$4, $$1);
            aks<dcz> $$10 = this.e($$2, $$4, $$1);
            aks<dcz> $$11 = this.a($$2, $$4);
            aks<dcz> $$12 = this.a($$2, $$4, $$1, $$6);
            aks<dcz> $$13 = this.d($$2, $$4, $$1);
            aks<dcz> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddi.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, ddi.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddi.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, ddi.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, ddi.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, ddi.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<ddi.d, aks<dcz>>> $$0, ddi.b $$1) {
      this.a($$0, this.o, this.o, this.x, ddi.b.a(this.r[0], this.r[2]), $$1, 0.0F, ddg.T);
      this.a($$0, ddi.b.a(this.p[1], this.p[2]), this.o, ddi.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddg.l);
      this.a($$0, ddi.b.a(this.p[3], this.p[4]), this.o, ddi.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ddg.m);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddi.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddi.b $$5 = this.q[$$4];
            aks<dcz> $$6 = this.a($$2, $$4, $$1);
            aks<dcz> $$7 = this.b($$2, $$4, $$1);
            aks<dcz> $$8 = this.c($$2, $$4, $$1);
            aks<dcz> $$9 = this.a($$2, $$4);
            aks<dcz> $$10 = this.a($$2, $$4, $$1, $$6);
            aks<dcz> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, ddi.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), ddi.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, ddi.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), ddi.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, ddi.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ddi.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, ddi.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<ddi.d, aks<dcz>>> $$0, ddi.b $$1) {
      this.a($$0, this.s, this.o, this.x, ddi.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? ddg.T : ddg.Q);
      this.a($$0, this.t, this.o, this.x, ddi.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? ddg.T : ddg.P);
      this.a($$0, this.s, this.o, this.z, ddi.b.a(this.r[0], this.r[1]), $$1, 0.0F, ddg.Q);
      this.a($$0, this.t, this.o, this.z, ddi.b.a(this.r[0], this.r[1]), $$1, 0.0F, ddg.P);
      this.a($$0, this.s, this.o, ddi.b.a(this.x, this.B), ddi.b.a(this.r[2], this.r[5]), $$1, 0.0F, ddg.Q);
      this.a($$0, this.t, this.o, ddi.b.a(this.x, this.B), ddi.b.a(this.r[2], this.r[5]), $$1, 0.0F, ddg.P);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, ddg.Q);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, ddg.P);
      this.a($$0, ddi.b.a(this.p[1], this.p[2]), this.o, ddi.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddg.l);
      this.a($$0, ddi.b.a(this.p[3], this.p[4]), this.o, ddi.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddg.m);
      this.a($$0, this.s, this.o, ddi.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ddg.Q);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ddi.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ddi.b $$5 = this.q[$$4];
            aks<dcz> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ddi.b.a(this.A, this.B), ddi.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<ddi.d, aks<dcz>>> $$0) {
      this.b($$0, this.o, this.o, ddi.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, ddg.ae);
      this.b($$0, this.o, ddi.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, ddg.af);
      this.c($$0, this.o, this.o, this.o, ddi.b.a(this.r[0], this.r[1]), this.o, 0.0F, ddg.ag);
   }

   private aks<dcz> a(int $$0, int $$1, ddi.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         aks<dcz> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private aks<dcz> b(int $$0, int $$1, ddi.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private aks<dcz> c(int $$0, int $$1, ddi.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private aks<dcz> a(int $$0, int $$1, ddi.b $$2, aks<dcz> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? ddg.B : $$3;
   }

   private aks<dcz> d(int $$0, int $$1, ddi.b $$2) {
      aks<dcz> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private aks<dcz> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return ddg.S;
      } else {
         return $$0 == 4 ? ddg.k : ddg.R;
      }
   }

   private aks<dcz> a(int $$0, ddi.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? ddg.F : ddg.G;
      } else {
         return $$0 < 3 ? ddg.F : ddg.H;
      }
   }

   private aks<dcz> e(int $$0, int $$1, ddi.b $$2) {
      if ($$2.b() >= 0L) {
         aks<dcz> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private aks<dcz> f(int $$0, int $$1, ddi.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? ddg.N : ddg.M;
      } else {
         return $$0 == 3 ? ddg.O : this.a($$1, $$2);
      }
   }

   private aks<dcz> g(int $$0, int $$1, ddi.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? ddg.L : ddg.K;
      }
   }

   private aks<dcz> h(int $$0, int $$1, ddi.b $$2) {
      aks<dcz> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<ddi.d, aks<dcz>>> $$0, ddi.b $$1, ddi.b $$2, ddi.b $$3, ddi.b $$4, ddi.b $$5, float $$6, aks<dcz> $$7) {
      $$0.accept(Pair.of(ddi.a($$1, $$2, $$3, $$4, ddi.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(ddi.a($$1, $$2, $$3, $$4, ddi.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<ddi.d, aks<dcz>>> $$0, ddi.b $$1, ddi.b $$2, ddi.b $$3, ddi.b $$4, ddi.b $$5, float $$6, aks<dcz> $$7) {
      $$0.accept(Pair.of(ddi.a($$1, $$2, $$3, $$4, ddi.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<ddi.d, aks<dcz>>> $$0, ddi.b $$1, ddi.b $$2, ddi.b $$3, ddi.b $$4, ddi.b $$5, float $$6, aks<dcz> $$7) {
      $$0.accept(Pair.of(ddi.a($$1, $$2, $$3, $$4, ddi.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dyn $$0, dyn $$1, dyn.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dzb.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dzb.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dzb.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dzb.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)ddi.a((float)$$0);
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

   private static String a(double $$0, ddi.b[] $$1) {
      double $$2 = (double)ddi.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @azp
   public ddi.b[] b() {
      return this.p;
   }

   @azp
   public ddi.b[] c() {
      return this.q;
   }

   @azp
   public ddi.b[] d() {
      return this.r;
   }

   @azp
   public ddi.b[] e() {
      return new ddi.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @azp
   public ddi.b[] f() {
      return new ddi.b[]{
         ddi.b.a(-2.0F, dzb.a(0.05F)),
         ddi.b.a(dzb.a(0.05F), dzb.a(0.26666668F)),
         ddi.b.a(dzb.a(0.26666668F), dzb.a(0.4F)),
         ddi.b.a(dzb.a(0.4F), dzb.a(0.56666666F)),
         ddi.b.a(dzb.a(0.56666666F), 2.0F)
      };
   }

   @azp
   public ddi.b[] g() {
      return new ddi.b[]{ddi.b.a(-2.0F, 0.0F), ddi.b.a(0.0F, 2.0F)};
   }
}
