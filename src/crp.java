import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class crp {
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
   private final cri.b o = cri.b.a(-1.0F, 1.0F);
   private final cri.b[] p = new cri.b[]{cri.b.a(-1.0F, -0.45F), cri.b.a(-0.45F, -0.15F), cri.b.a(-0.15F, 0.2F), cri.b.a(0.2F, 0.55F), cri.b.a(0.55F, 1.0F)};
   private final cri.b[] q = new cri.b[]{cri.b.a(-1.0F, -0.35F), cri.b.a(-0.35F, -0.1F), cri.b.a(-0.1F, 0.1F), cri.b.a(0.1F, 0.3F), cri.b.a(0.3F, 1.0F)};
   private final cri.b[] r = new cri.b[]{
      cri.b.a(-1.0F, -0.78F),
      cri.b.a(-0.78F, -0.375F),
      cri.b.a(-0.375F, -0.2225F),
      cri.b.a(-0.2225F, 0.05F),
      cri.b.a(0.05F, 0.45F),
      cri.b.a(0.45F, 0.55F),
      cri.b.a(0.55F, 1.0F)
   };
   private final cri.b s = this.p[0];
   private final cri.b t = cri.b.a(this.p[1], this.p[4]);
   private final cri.b u = cri.b.a(-1.2F, -1.05F);
   private final cri.b v = cri.b.a(-1.05F, -0.455F);
   private final cri.b w = cri.b.a(-0.455F, -0.19F);
   private final cri.b x = cri.b.a(-0.19F, -0.11F);
   private final cri.b y = cri.b.a(-0.11F, 0.55F);
   private final cri.b z = cri.b.a(-0.11F, 0.03F);
   private final cri.b A = cri.b.a(0.03F, 0.3F);
   private final cri.b B = cri.b.a(0.3F, 1.0F);
   private final aey<cqz>[][] C = new aey[][]{{crg.X, crg.V, crg.T, crg.R, crg.P}, {crg.W, crg.U, crg.S, crg.Q, crg.P}};
   private final aey<cqz>[][] D = new aey[][]{
      {crg.d, crg.d, crg.d, crg.q, crg.p},
      {crg.b, crg.b, crg.i, crg.p, crg.o},
      {crg.j, crg.b, crg.i, crg.k, crg.l},
      {crg.r, crg.r, crg.i, crg.x, crg.x},
      {crg.f, crg.f, crg.f, crg.f, crg.f}
   };
   private final aey<cqz>[][] E = new aey[][]{
      {crg.e, null, crg.q, null, null},
      {null, null, null, null, crg.n},
      {crg.c, null, null, crg.m, null},
      {null, null, crg.b, crg.y, crg.z},
      {null, null, null, null, null}
   };
   private final aey<cqz>[][] F = new aey[][]{
      {crg.d, crg.d, crg.d, crg.q, crg.q},
      {crg.D, crg.D, crg.i, crg.p, crg.o},
      {crg.D, crg.D, crg.D, crg.D, crg.l},
      {crg.s, crg.s, crg.i, crg.i, crg.x},
      {crg.A, crg.A, crg.A, crg.C, crg.C}
   };
   private final aey<cqz>[][] G = new aey[][]{
      {crg.e, null, null, null, null},
      {crg.E, null, crg.D, crg.D, crg.n},
      {crg.E, crg.E, crg.i, crg.k, null},
      {null, null, null, null, null},
      {crg.B, crg.B, null, null, null}
   };
   private final aey<cqz>[][] H = new aey[][]{
      {crg.u, crg.u, crg.t, crg.v, crg.v},
      {crg.u, crg.u, crg.t, crg.v, crg.v},
      {crg.t, crg.t, crg.t, crg.v, crg.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<cri.d> a() {
      cri.b $$0 = cri.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new cri.d(this.o, this.o, cri.b.a(this.y, this.o), this.o, $$0, cri.b.a(-1.0F, -0.16F), 0L),
         new cri.d(this.o, this.o, cri.b.a(this.y, this.o), this.o, $$0, cri.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<cri.d, aey<cqz>>> $$0) {
      if (aa.aq) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<cri.d, aey<cqz>>> $$0) {
      hg.b $$1 = mh.a();
      hf<dkf> $$2 = $$1.b(jc.au);
      dkg.w.a $$3 = new dkg.w.a($$2.b(dkt.d));
      dkg.w.a $$4 = new dkg.w.a($$2.b(dkt.e));
      dkg.w.a $$5 = new dkg.w.a($$2.b(dkt.g));
      $$0.accept(Pair.of(cri.a(this.o, this.o, this.o, this.o, cri.b.a(0.0F), this.o, 0.01F), crg.b));
      if (og.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, ata.a) instanceof are.e<?, ?> $$7) {
         aey<cqz> $$8 = crg.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(cri.a(this.o, this.o, this.o, cri.b.a($$9), cri.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == crg.f ? crg.A : crg.f;
         }
      }

      if (og.a($$3, $$4, $$5, false) instanceof are.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(cri.a(this.o, this.o, cri.b.a($$12), this.o, cri.b.a(0.0F), this.o, 0.0F), crg.q));
         }
      }
   }

   private void c(Consumer<Pair<cri.d, aey<cqz>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, crg.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         cri.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<cri.d, aey<cqz>>> $$0) {
      this.c($$0, cri.b.a(-1.0F, -0.93333334F));
      this.b($$0, cri.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, cri.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, cri.b.a(-0.56666666F, -0.4F));
      this.c($$0, cri.b.a(-0.4F, -0.26666668F));
      this.d($$0, cri.b.a(-0.26666668F, -0.05F));
      this.e($$0, cri.b.a(-0.05F, 0.05F));
      this.d($$0, cri.b.a(0.05F, 0.26666668F));
      this.c($$0, cri.b.a(0.26666668F, 0.4F));
      this.b($$0, cri.b.a(0.4F, 0.56666666F));
      this.a($$0, cri.b.a(0.56666666F, 0.7666667F));
      this.b($$0, cri.b.a(0.7666667F, 0.93333334F));
      this.c($$0, cri.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<cri.d, aey<cqz>>> $$0, cri.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cri.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cri.b $$5 = this.q[$$4];
            aey<cqz> $$6 = this.a($$2, $$4, $$1);
            aey<cqz> $$7 = this.b($$2, $$4, $$1);
            aey<cqz> $$8 = this.c($$2, $$4, $$1);
            aey<cqz> $$9 = this.e($$2, $$4, $$1);
            aey<cqz> $$10 = this.h($$2, $$4, $$1);
            aey<cqz> $$11 = this.a($$2, $$4, $$1, $$10);
            aey<cqz> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cri.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cri.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cri.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cri.b.a(this.x, this.z), cri.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cri.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cri.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cri.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cri.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cri.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<cri.d, aey<cqz>>> $$0, cri.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cri.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cri.b $$5 = this.q[$$4];
            aey<cqz> $$6 = this.a($$2, $$4, $$1);
            aey<cqz> $$7 = this.b($$2, $$4, $$1);
            aey<cqz> $$8 = this.c($$2, $$4, $$1);
            aey<cqz> $$9 = this.e($$2, $$4, $$1);
            aey<cqz> $$10 = this.h($$2, $$4, $$1);
            aey<cqz> $$11 = this.a($$2, $$4, $$1, $$6);
            aey<cqz> $$12 = this.g($$2, $$4, $$1);
            aey<cqz> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, cri.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cri.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, cri.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cri.b.a(this.x, this.z), cri.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cri.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cri.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cri.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, cri.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cri.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<cri.d, aey<cqz>>> $$0, cri.b $$1) {
      this.a($$0, this.o, this.o, this.x, cri.b.a(this.r[0], this.r[2]), $$1, 0.0F, crg.O);
      this.a($$0, cri.b.a(this.p[1], this.p[2]), this.o, cri.b.a(this.z, this.B), this.r[6], $$1, 0.0F, crg.g);
      this.a($$0, cri.b.a(this.p[3], this.p[4]), this.o, cri.b.a(this.z, this.B), this.r[6], $$1, 0.0F, crg.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cri.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cri.b $$5 = this.q[$$4];
            aey<cqz> $$6 = this.a($$2, $$4, $$1);
            aey<cqz> $$7 = this.b($$2, $$4, $$1);
            aey<cqz> $$8 = this.c($$2, $$4, $$1);
            aey<cqz> $$9 = this.h($$2, $$4, $$1);
            aey<cqz> $$10 = this.e($$2, $$4, $$1);
            aey<cqz> $$11 = this.a($$2, $$4);
            aey<cqz> $$12 = this.a($$2, $$4, $$1, $$6);
            aey<cqz> $$13 = this.d($$2, $$4, $$1);
            aey<cqz> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cri.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, cri.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cri.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cri.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, cri.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, cri.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, cri.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cri.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<cri.d, aey<cqz>>> $$0, cri.b $$1) {
      this.a($$0, this.o, this.o, this.x, cri.b.a(this.r[0], this.r[2]), $$1, 0.0F, crg.O);
      this.a($$0, cri.b.a(this.p[1], this.p[2]), this.o, cri.b.a(this.z, this.B), this.r[6], $$1, 0.0F, crg.g);
      this.a($$0, cri.b.a(this.p[3], this.p[4]), this.o, cri.b.a(this.z, this.B), this.r[6], $$1, 0.0F, crg.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cri.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cri.b $$5 = this.q[$$4];
            aey<cqz> $$6 = this.a($$2, $$4, $$1);
            aey<cqz> $$7 = this.b($$2, $$4, $$1);
            aey<cqz> $$8 = this.c($$2, $$4, $$1);
            aey<cqz> $$9 = this.a($$2, $$4);
            aey<cqz> $$10 = this.a($$2, $$4, $$1, $$6);
            aey<cqz> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, cri.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, cri.b.a(this.A, this.B), cri.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, cri.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, cri.b.a(this.A, this.B), cri.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, cri.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, cri.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, cri.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, cri.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<cri.d, aey<cqz>>> $$0, cri.b $$1) {
      this.a($$0, this.s, this.o, this.x, cri.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? crg.O : crg.L);
      this.a($$0, this.t, this.o, this.x, cri.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? crg.O : crg.K);
      this.a($$0, this.s, this.o, this.z, cri.b.a(this.r[0], this.r[1]), $$1, 0.0F, crg.L);
      this.a($$0, this.t, this.o, this.z, cri.b.a(this.r[0], this.r[1]), $$1, 0.0F, crg.K);
      this.a($$0, this.s, this.o, cri.b.a(this.x, this.B), cri.b.a(this.r[2], this.r[5]), $$1, 0.0F, crg.L);
      this.a($$0, this.t, this.o, cri.b.a(this.x, this.B), cri.b.a(this.r[2], this.r[5]), $$1, 0.0F, crg.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, crg.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, crg.K);
      this.a($$0, cri.b.a(this.p[1], this.p[2]), this.o, cri.b.a(this.y, this.B), this.r[6], $$1, 0.0F, crg.g);
      this.a($$0, cri.b.a(this.p[3], this.p[4]), this.o, cri.b.a(this.y, this.B), this.r[6], $$1, 0.0F, crg.h);
      this.a($$0, this.s, this.o, cri.b.a(this.y, this.B), this.r[6], $$1, 0.0F, crg.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         cri.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            cri.b $$5 = this.q[$$4];
            aey<cqz> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, cri.b.a(this.A, this.B), cri.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<cri.d, aey<cqz>>> $$0) {
      this.b($$0, this.o, this.o, cri.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, crg.Z);
      this.b($$0, this.o, cri.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, crg.aa);
      this.c($$0, this.o, this.o, this.o, cri.b.a(this.r[0], this.r[1]), this.o, 0.0F, crg.ab);
   }

   private aey<cqz> a(int $$0, int $$1, cri.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         aey<cqz> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private aey<cqz> b(int $$0, int $$1, cri.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private aey<cqz> c(int $$0, int $$1, cri.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private aey<cqz> a(int $$0, int $$1, cri.b $$2, aey<cqz> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? crg.w : $$3;
   }

   private aey<cqz> d(int $$0, int $$1, cri.b $$2) {
      aey<cqz> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private aey<cqz> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return crg.N;
      } else {
         return $$0 == 4 ? crg.f : crg.M;
      }
   }

   private aey<cqz> a(int $$0, cri.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? crg.A : crg.B;
      } else {
         return $$0 < 3 ? crg.A : crg.C;
      }
   }

   private aey<cqz> e(int $$0, int $$1, cri.b $$2) {
      if ($$2.b() >= 0L) {
         aey<cqz> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private aey<cqz> f(int $$0, int $$1, cri.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? crg.I : crg.H;
      } else {
         return $$0 == 3 ? crg.J : this.a($$1, $$2);
      }
   }

   private aey<cqz> g(int $$0, int $$1, cri.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? crg.G : crg.F;
      }
   }

   private aey<cqz> h(int $$0, int $$1, cri.b $$2) {
      aey<cqz> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<cri.d, aey<cqz>>> $$0, cri.b $$1, cri.b $$2, cri.b $$3, cri.b $$4, cri.b $$5, float $$6, aey<cqz> $$7) {
      $$0.accept(Pair.of(cri.a($$1, $$2, $$3, $$4, cri.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(cri.a($$1, $$2, $$3, $$4, cri.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<cri.d, aey<cqz>>> $$0, cri.b $$1, cri.b $$2, cri.b $$3, cri.b $$4, cri.b $$5, float $$6, aey<cqz> $$7) {
      $$0.accept(Pair.of(cri.a($$1, $$2, $$3, $$4, cri.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<cri.d, aey<cqz>>> $$0, cri.b $$1, cri.b $$2, cri.b $$3, cri.b $$4, cri.b $$5, float $$6, aey<cqz> $$7) {
      $$0.accept(Pair.of(cri.a($$1, $$2, $$3, $$4, cri.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dkf $$0, dkf $$1, dkf.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dkt.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dkt.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dkt.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dkt.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)cri.a((float)$$0);
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

   private static String a(double $$0, cri.b[] $$1) {
      double $$2 = (double)cri.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @atd
   public cri.b[] b() {
      return this.p;
   }

   @atd
   public cri.b[] c() {
      return this.q;
   }

   @atd
   public cri.b[] d() {
      return this.r;
   }

   @atd
   public cri.b[] e() {
      return new cri.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @atd
   public cri.b[] f() {
      return new cri.b[]{
         cri.b.a(-2.0F, dkt.a(0.05F)),
         cri.b.a(dkt.a(0.05F), dkt.a(0.26666668F)),
         cri.b.a(dkt.a(0.26666668F), dkt.a(0.4F)),
         cri.b.a(dkt.a(0.4F), dkt.a(0.56666666F)),
         cri.b.a(dkt.a(0.56666666F), 2.0F)
      };
   }

   @atd
   public cri.b[] g() {
      return new cri.b[]{cri.b.a(-2.0F, 0.0F), cri.b.a(0.0F, 2.0F)};
   }
}
