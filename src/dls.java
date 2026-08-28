import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dls {
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
   private final dll.b o = dll.b.a(-1.0F, 1.0F);
   private final dll.b[] p = new dll.b[]{dll.b.a(-1.0F, -0.45F), dll.b.a(-0.45F, -0.15F), dll.b.a(-0.15F, 0.2F), dll.b.a(0.2F, 0.55F), dll.b.a(0.55F, 1.0F)};
   private final dll.b[] q = new dll.b[]{dll.b.a(-1.0F, -0.35F), dll.b.a(-0.35F, -0.1F), dll.b.a(-0.1F, 0.1F), dll.b.a(0.1F, 0.3F), dll.b.a(0.3F, 1.0F)};
   private final dll.b[] r = new dll.b[]{
      dll.b.a(-1.0F, -0.78F),
      dll.b.a(-0.78F, -0.375F),
      dll.b.a(-0.375F, -0.2225F),
      dll.b.a(-0.2225F, 0.05F),
      dll.b.a(0.05F, 0.45F),
      dll.b.a(0.45F, 0.55F),
      dll.b.a(0.55F, 1.0F)
   };
   private final dll.b s = this.p[0];
   private final dll.b t = dll.b.a(this.p[1], this.p[4]);
   private final dll.b u = dll.b.a(-1.2F, -1.05F);
   private final dll.b v = dll.b.a(-1.05F, -0.455F);
   private final dll.b w = dll.b.a(-0.455F, -0.19F);
   private final dll.b x = dll.b.a(-0.19F, -0.11F);
   private final dll.b y = dll.b.a(-0.11F, 0.55F);
   private final dll.b z = dll.b.a(-0.11F, 0.03F);
   private final dll.b A = dll.b.a(0.03F, 0.3F);
   private final dll.b B = dll.b.a(0.3F, 1.0F);
   private final alj<dlc>[][] C = new alj[][]{{dlj.Y, dlj.W, dlj.U, dlj.S, dlj.Q}, {dlj.X, dlj.V, dlj.T, dlj.R, dlj.Q}};
   private final alj<dlc>[][] D = new alj[][]{
      {dlj.d, dlj.d, dlj.d, dlj.r, dlj.q},
      {dlj.b, dlj.b, dlj.i, dlj.q, dlj.p},
      {dlj.j, dlj.b, dlj.i, dlj.k, dlj.l},
      {dlj.s, dlj.s, dlj.i, dlj.y, dlj.y},
      {dlj.f, dlj.f, dlj.f, dlj.f, dlj.f}
   };
   private final alj<dlc>[][] E = new alj[][]{
      {dlj.e, null, dlj.r, null, null},
      {null, null, null, null, dlj.o},
      {dlj.c, null, null, dlj.n, null},
      {null, null, dlj.b, dlj.z, dlj.A},
      {null, null, null, null, null}
   };
   private final alj<dlc>[][] F = new alj[][]{
      {dlj.d, dlj.d, dlj.d, dlj.r, dlj.r},
      {dlj.E, dlj.E, dlj.i, dlj.q, dlj.p},
      {dlj.E, dlj.E, dlj.E, dlj.E, dlj.m},
      {dlj.t, dlj.t, dlj.i, dlj.i, dlj.y},
      {dlj.B, dlj.B, dlj.B, dlj.D, dlj.D}
   };
   private final alj<dlc>[][] G = new alj[][]{
      {dlj.e, null, null, null, null},
      {dlj.F, null, dlj.E, dlj.E, dlj.o},
      {dlj.F, dlj.F, dlj.i, dlj.k, null},
      {null, null, null, null, null},
      {dlj.C, dlj.C, null, null, null}
   };
   private final alj<dlc>[][] H = new alj[][]{
      {dlj.v, dlj.v, dlj.u, dlj.w, dlj.w},
      {dlj.v, dlj.v, dlj.u, dlj.w, dlj.w},
      {dlj.u, dlj.u, dlj.u, dlj.w, dlj.w},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dll.d> a() {
      dll.b $$0 = dll.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dll.d(this.o, this.o, dll.b.a(this.y, this.o), this.o, $$0, dll.b.a(-1.0F, -0.16F), 0L),
         new dll.d(this.o, this.o, dll.b.a(this.y, this.o), this.o, $$0, dll.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dll.d, alj<dlc>>> $$0) {
      if (ac.ar) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dll.d, alj<dlc>>> $$0) {
      ji.a $$1 = ox.a();
      jh<egy> $$2 = $$1.e(mi.aO);
      egz.w.a $$3 = new egz.w.a($$2.b(ehm.d));
      egz.w.a $$4 = new egz.w.a($$2.b(ehm.e));
      egz.w.a $$5 = new egz.w.a($$2.b(ehm.g));
      $$0.accept(Pair.of(dll.a(this.o, this.o, this.o, this.o, dll.b.a(0.0F), this.o, 0.01F), dlj.b));
      if (qx.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, bav.a) instanceof ayr.e<?, ?> $$7) {
         alj<dlc> $$8 = dlj.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dll.a(this.o, this.o, this.o, dll.b.a($$9), dll.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == dlj.f ? dlj.B : dlj.f;
         }
      }

      if (qx.a($$3, $$4, $$5, false) instanceof ayr.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dll.a(this.o, this.o, dll.b.a($$12), this.o, dll.b.a(0.0F), this.o, 0.0F), dlj.r));
         }
      }
   }

   private void c(Consumer<Pair<dll.d, alj<dlc>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, dlj.Z);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dll.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dll.d, alj<dlc>>> $$0) {
      this.c($$0, dll.b.a(-1.0F, -0.93333334F));
      this.b($$0, dll.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dll.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dll.b.a(-0.56666666F, -0.4F));
      this.c($$0, dll.b.a(-0.4F, -0.26666668F));
      this.d($$0, dll.b.a(-0.26666668F, -0.05F));
      this.e($$0, dll.b.a(-0.05F, 0.05F));
      this.d($$0, dll.b.a(0.05F, 0.26666668F));
      this.c($$0, dll.b.a(0.26666668F, 0.4F));
      this.b($$0, dll.b.a(0.4F, 0.56666666F));
      this.a($$0, dll.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dll.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dll.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dll.d, alj<dlc>>> $$0, dll.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dll.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dll.b $$5 = this.q[$$4];
            alj<dlc> $$6 = this.a($$2, $$4, $$1);
            alj<dlc> $$7 = this.b($$2, $$4, $$1);
            alj<dlc> $$8 = this.c($$2, $$4, $$1);
            alj<dlc> $$9 = this.e($$2, $$4, $$1);
            alj<dlc> $$10 = this.h($$2, $$4, $$1);
            alj<dlc> $$11 = this.a($$2, $$4, $$1, $$10);
            alj<dlc> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dll.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dll.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dll.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dll.b.a(this.x, this.z), dll.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dll.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dll.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dll.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dll.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dll.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dll.d, alj<dlc>>> $$0, dll.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dll.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dll.b $$5 = this.q[$$4];
            alj<dlc> $$6 = this.a($$2, $$4, $$1);
            alj<dlc> $$7 = this.b($$2, $$4, $$1);
            alj<dlc> $$8 = this.c($$2, $$4, $$1);
            alj<dlc> $$9 = this.e($$2, $$4, $$1);
            alj<dlc> $$10 = this.h($$2, $$4, $$1);
            alj<dlc> $$11 = this.a($$2, $$4, $$1, $$6);
            alj<dlc> $$12 = this.g($$2, $$4, $$1);
            alj<dlc> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dll.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dll.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dll.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dll.b.a(this.x, this.z), dll.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dll.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dll.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dll.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dll.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dll.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dll.d, alj<dlc>>> $$0, dll.b $$1) {
      this.a($$0, this.o, this.o, this.x, dll.b.a(this.r[0], this.r[2]), $$1, 0.0F, dlj.P);
      this.a($$0, dll.b.a(this.p[1], this.p[2]), this.o, dll.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dlj.g);
      this.a($$0, dll.b.a(this.p[3], this.p[4]), this.o, dll.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dlj.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dll.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dll.b $$5 = this.q[$$4];
            alj<dlc> $$6 = this.a($$2, $$4, $$1);
            alj<dlc> $$7 = this.b($$2, $$4, $$1);
            alj<dlc> $$8 = this.c($$2, $$4, $$1);
            alj<dlc> $$9 = this.h($$2, $$4, $$1);
            alj<dlc> $$10 = this.e($$2, $$4, $$1);
            alj<dlc> $$11 = this.a($$2, $$4);
            alj<dlc> $$12 = this.a($$2, $$4, $$1, $$6);
            alj<dlc> $$13 = this.d($$2, $$4, $$1);
            alj<dlc> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dll.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dll.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dll.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dll.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dll.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dll.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dll.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dll.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dll.d, alj<dlc>>> $$0, dll.b $$1) {
      this.a($$0, this.o, this.o, this.x, dll.b.a(this.r[0], this.r[2]), $$1, 0.0F, dlj.P);
      this.a($$0, dll.b.a(this.p[1], this.p[2]), this.o, dll.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dlj.g);
      this.a($$0, dll.b.a(this.p[3], this.p[4]), this.o, dll.b.a(this.z, this.B), this.r[6], $$1, 0.0F, dlj.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dll.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dll.b $$5 = this.q[$$4];
            alj<dlc> $$6 = this.a($$2, $$4, $$1);
            alj<dlc> $$7 = this.b($$2, $$4, $$1);
            alj<dlc> $$8 = this.c($$2, $$4, $$1);
            alj<dlc> $$9 = this.a($$2, $$4);
            alj<dlc> $$10 = this.a($$2, $$4, $$1, $$6);
            alj<dlc> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dll.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dll.b.a(this.A, this.B), dll.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dll.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dll.b.a(this.A, this.B), dll.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dll.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dll.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dll.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dll.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dll.d, alj<dlc>>> $$0, dll.b $$1) {
      this.a($$0, this.s, this.o, this.x, dll.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dlj.P : dlj.M);
      this.a($$0, this.t, this.o, this.x, dll.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? dlj.P : dlj.L);
      this.a($$0, this.s, this.o, this.z, dll.b.a(this.r[0], this.r[1]), $$1, 0.0F, dlj.M);
      this.a($$0, this.t, this.o, this.z, dll.b.a(this.r[0], this.r[1]), $$1, 0.0F, dlj.L);
      this.a($$0, this.s, this.o, dll.b.a(this.x, this.B), dll.b.a(this.r[2], this.r[5]), $$1, 0.0F, dlj.M);
      this.a($$0, this.t, this.o, dll.b.a(this.x, this.B), dll.b.a(this.r[2], this.r[5]), $$1, 0.0F, dlj.L);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, dlj.M);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, dlj.L);
      this.a($$0, dll.b.a(this.p[1], this.p[2]), this.o, dll.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dlj.g);
      this.a($$0, dll.b.a(this.p[3], this.p[4]), this.o, dll.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dlj.h);
      this.a($$0, this.s, this.o, dll.b.a(this.y, this.B), this.r[6], $$1, 0.0F, dlj.M);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dll.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dll.b $$5 = this.q[$$4];
            alj<dlc> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dll.b.a(this.A, this.B), dll.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dll.d, alj<dlc>>> $$0) {
      this.b($$0, this.o, this.o, dll.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, dlj.aa);
      this.b($$0, this.o, dll.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, dlj.ab);
      this.c($$0, this.o, this.o, this.o, dll.b.a(this.r[0], this.r[1]), this.o, 0.0F, dlj.ac);
   }

   private alj<dlc> a(int $$0, int $$1, dll.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         alj<dlc> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private alj<dlc> b(int $$0, int $$1, dll.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private alj<dlc> c(int $$0, int $$1, dll.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private alj<dlc> a(int $$0, int $$1, dll.b $$2, alj<dlc> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? dlj.x : $$3;
   }

   private alj<dlc> d(int $$0, int $$1, dll.b $$2) {
      alj<dlc> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private alj<dlc> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return dlj.O;
      } else {
         return $$0 == 4 ? dlj.f : dlj.N;
      }
   }

   private alj<dlc> a(int $$0, dll.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? dlj.B : dlj.C;
      } else {
         return $$0 < 3 ? dlj.B : dlj.D;
      }
   }

   private alj<dlc> e(int $$0, int $$1, dll.b $$2) {
      if ($$2.b() >= 0L) {
         alj<dlc> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private alj<dlc> f(int $$0, int $$1, dll.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? dlj.J : dlj.I;
      } else {
         return $$0 == 3 ? dlj.K : this.a($$1, $$2);
      }
   }

   private alj<dlc> g(int $$0, int $$1, dll.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? dlj.H : dlj.G;
      }
   }

   private alj<dlc> h(int $$0, int $$1, dll.b $$2) {
      alj<dlc> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dll.d, alj<dlc>>> $$0, dll.b $$1, dll.b $$2, dll.b $$3, dll.b $$4, dll.b $$5, float $$6, alj<dlc> $$7) {
      $$0.accept(Pair.of(dll.a($$1, $$2, $$3, $$4, dll.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dll.a($$1, $$2, $$3, $$4, dll.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dll.d, alj<dlc>>> $$0, dll.b $$1, dll.b $$2, dll.b $$3, dll.b $$4, dll.b $$5, float $$6, alj<dlc> $$7) {
      $$0.accept(Pair.of(dll.a($$1, $$2, $$3, $$4, dll.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dll.d, alj<dlc>>> $$0, dll.b $$1, dll.b $$2, dll.b $$3, dll.b $$4, dll.b $$5, float $$6, alj<dlc> $$7) {
      $$0.accept(Pair.of(dll.a($$1, $$2, $$3, $$4, dll.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(egy $$0, egy $$1, egy.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)ehm.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)ehm.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)ehm.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)ehm.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)dll.a((float)$$0);
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

   private static String a(double $$0, dll.b[] $$1) {
      double $$2 = (double)dll.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @baz
   public dll.b[] b() {
      return this.p;
   }

   @baz
   public dll.b[] c() {
      return this.q;
   }

   @baz
   public dll.b[] d() {
      return this.r;
   }

   @baz
   public dll.b[] e() {
      return new dll.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @baz
   public dll.b[] f() {
      return new dll.b[]{
         dll.b.a(-2.0F, ehm.a(0.05F)),
         dll.b.a(ehm.a(0.05F), ehm.a(0.26666668F)),
         dll.b.a(ehm.a(0.26666668F), ehm.a(0.4F)),
         dll.b.a(ehm.a(0.4F), ehm.a(0.56666666F)),
         dll.b.a(ehm.a(0.56666666F), 2.0F)
      };
   }

   @baz
   public dll.b[] g() {
      return new dll.b[]{dll.b.a(-2.0F, 0.0F), dll.b.a(0.0F, 2.0F)};
   }
}
