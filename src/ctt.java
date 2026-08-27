import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class ctt {
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
   private final ctm.b o = ctm.b.a(-1.0F, 1.0F);
   private final ctm.b[] p = new ctm.b[]{ctm.b.a(-1.0F, -0.45F), ctm.b.a(-0.45F, -0.15F), ctm.b.a(-0.15F, 0.2F), ctm.b.a(0.2F, 0.55F), ctm.b.a(0.55F, 1.0F)};
   private final ctm.b[] q = new ctm.b[]{ctm.b.a(-1.0F, -0.35F), ctm.b.a(-0.35F, -0.1F), ctm.b.a(-0.1F, 0.1F), ctm.b.a(0.1F, 0.3F), ctm.b.a(0.3F, 1.0F)};
   private final ctm.b[] r = new ctm.b[]{
      ctm.b.a(-1.0F, -0.78F),
      ctm.b.a(-0.78F, -0.375F),
      ctm.b.a(-0.375F, -0.2225F),
      ctm.b.a(-0.2225F, 0.05F),
      ctm.b.a(0.05F, 0.45F),
      ctm.b.a(0.45F, 0.55F),
      ctm.b.a(0.55F, 1.0F)
   };
   private final ctm.b s = this.p[0];
   private final ctm.b t = ctm.b.a(this.p[1], this.p[4]);
   private final ctm.b u = ctm.b.a(-1.2F, -1.05F);
   private final ctm.b v = ctm.b.a(-1.05F, -0.455F);
   private final ctm.b w = ctm.b.a(-0.455F, -0.19F);
   private final ctm.b x = ctm.b.a(-0.19F, -0.11F);
   private final ctm.b y = ctm.b.a(-0.11F, 0.55F);
   private final ctm.b z = ctm.b.a(-0.11F, 0.03F);
   private final ctm.b A = ctm.b.a(0.03F, 0.3F);
   private final ctm.b B = ctm.b.a(0.3F, 1.0F);
   private final agl<ctd>[][] C = new agl[][]{{ctk.X, ctk.V, ctk.T, ctk.R, ctk.P}, {ctk.W, ctk.U, ctk.S, ctk.Q, ctk.P}};
   private final agl<ctd>[][] D = new agl[][]{
      {ctk.d, ctk.d, ctk.d, ctk.q, ctk.p},
      {ctk.b, ctk.b, ctk.i, ctk.p, ctk.o},
      {ctk.j, ctk.b, ctk.i, ctk.k, ctk.l},
      {ctk.r, ctk.r, ctk.i, ctk.x, ctk.x},
      {ctk.f, ctk.f, ctk.f, ctk.f, ctk.f}
   };
   private final agl<ctd>[][] E = new agl[][]{
      {ctk.e, null, ctk.q, null, null},
      {null, null, null, null, ctk.n},
      {ctk.c, null, null, ctk.m, null},
      {null, null, ctk.b, ctk.y, ctk.z},
      {null, null, null, null, null}
   };
   private final agl<ctd>[][] F = new agl[][]{
      {ctk.d, ctk.d, ctk.d, ctk.q, ctk.q},
      {ctk.D, ctk.D, ctk.i, ctk.p, ctk.o},
      {ctk.D, ctk.D, ctk.D, ctk.D, ctk.l},
      {ctk.s, ctk.s, ctk.i, ctk.i, ctk.x},
      {ctk.A, ctk.A, ctk.A, ctk.C, ctk.C}
   };
   private final agl<ctd>[][] G = new agl[][]{
      {ctk.e, null, null, null, null},
      {ctk.E, null, ctk.D, ctk.D, ctk.n},
      {ctk.E, ctk.E, ctk.i, ctk.k, null},
      {null, null, null, null, null},
      {ctk.B, ctk.B, null, null, null}
   };
   private final agl<ctd>[][] H = new agl[][]{
      {ctk.u, ctk.u, ctk.t, ctk.v, ctk.v},
      {ctk.u, ctk.u, ctk.t, ctk.v, ctk.v},
      {ctk.t, ctk.t, ctk.t, ctk.v, ctk.v},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<ctm.d> a() {
      ctm.b $$0 = ctm.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new ctm.d(this.o, this.o, ctm.b.a(this.y, this.o), this.o, $$0, ctm.b.a(-1.0F, -0.16F), 0L),
         new ctm.d(this.o, this.o, ctm.b.a(this.y, this.o), this.o, $$0, ctm.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<ctm.d, agl<ctd>>> $$0) {
      if (aa.aq) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<ctm.d, agl<ctd>>> $$0) {
      ii.b $$1 = nn.a();
      ih<dmp> $$2 = $$1.b(kd.av);
      dmq.w.a $$3 = new dmq.w.a($$2.b(dnd.d));
      dmq.w.a $$4 = new dmq.w.a($$2.b(dnd.e));
      dmq.w.a $$5 = new dmq.w.a($$2.b(dnd.g));
      $$0.accept(Pair.of(ctm.a(this.o, this.o, this.o, this.o, ctm.b.a(0.0F), this.o, 0.01F), ctk.b));
      if (po.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, auq.a) instanceof ast.e<?, ?> $$7) {
         agl<ctd> $$8 = ctk.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(ctm.a(this.o, this.o, this.o, ctm.b.a($$9), ctm.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == ctk.f ? ctk.A : ctk.f;
         }
      }

      if (po.a($$3, $$4, $$5, false) instanceof ast.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(ctm.a(this.o, this.o, ctm.b.a($$12), this.o, ctm.b.a(0.0F), this.o, 0.0F), ctk.q));
         }
      }
   }

   private void c(Consumer<Pair<ctm.d, agl<ctd>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, ctk.Y);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         ctm.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<ctm.d, agl<ctd>>> $$0) {
      this.c($$0, ctm.b.a(-1.0F, -0.93333334F));
      this.b($$0, ctm.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, ctm.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, ctm.b.a(-0.56666666F, -0.4F));
      this.c($$0, ctm.b.a(-0.4F, -0.26666668F));
      this.d($$0, ctm.b.a(-0.26666668F, -0.05F));
      this.e($$0, ctm.b.a(-0.05F, 0.05F));
      this.d($$0, ctm.b.a(0.05F, 0.26666668F));
      this.c($$0, ctm.b.a(0.26666668F, 0.4F));
      this.b($$0, ctm.b.a(0.4F, 0.56666666F));
      this.a($$0, ctm.b.a(0.56666666F, 0.7666667F));
      this.b($$0, ctm.b.a(0.7666667F, 0.93333334F));
      this.c($$0, ctm.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<ctm.d, agl<ctd>>> $$0, ctm.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ctm.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ctm.b $$5 = this.q[$$4];
            agl<ctd> $$6 = this.a($$2, $$4, $$1);
            agl<ctd> $$7 = this.b($$2, $$4, $$1);
            agl<ctd> $$8 = this.c($$2, $$4, $$1);
            agl<ctd> $$9 = this.e($$2, $$4, $$1);
            agl<ctd> $$10 = this.h($$2, $$4, $$1);
            agl<ctd> $$11 = this.a($$2, $$4, $$1, $$10);
            agl<ctd> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ctm.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ctm.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, ctm.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ctm.b.a(this.x, this.z), ctm.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ctm.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ctm.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ctm.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, ctm.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ctm.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<ctm.d, agl<ctd>>> $$0, ctm.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ctm.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ctm.b $$5 = this.q[$$4];
            agl<ctd> $$6 = this.a($$2, $$4, $$1);
            agl<ctd> $$7 = this.b($$2, $$4, $$1);
            agl<ctd> $$8 = this.c($$2, $$4, $$1);
            agl<ctd> $$9 = this.e($$2, $$4, $$1);
            agl<ctd> $$10 = this.h($$2, $$4, $$1);
            agl<ctd> $$11 = this.a($$2, $$4, $$1, $$6);
            agl<ctd> $$12 = this.g($$2, $$4, $$1);
            agl<ctd> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, ctm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ctm.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, ctm.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ctm.b.a(this.x, this.z), ctm.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ctm.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ctm.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ctm.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, ctm.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ctm.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<ctm.d, agl<ctd>>> $$0, ctm.b $$1) {
      this.a($$0, this.o, this.o, this.x, ctm.b.a(this.r[0], this.r[2]), $$1, 0.0F, ctk.O);
      this.a($$0, ctm.b.a(this.p[1], this.p[2]), this.o, ctm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ctk.g);
      this.a($$0, ctm.b.a(this.p[3], this.p[4]), this.o, ctm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ctk.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ctm.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ctm.b $$5 = this.q[$$4];
            agl<ctd> $$6 = this.a($$2, $$4, $$1);
            agl<ctd> $$7 = this.b($$2, $$4, $$1);
            agl<ctd> $$8 = this.c($$2, $$4, $$1);
            agl<ctd> $$9 = this.h($$2, $$4, $$1);
            agl<ctd> $$10 = this.e($$2, $$4, $$1);
            agl<ctd> $$11 = this.a($$2, $$4);
            agl<ctd> $$12 = this.a($$2, $$4, $$1, $$6);
            agl<ctd> $$13 = this.d($$2, $$4, $$1);
            agl<ctd> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ctm.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, ctm.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ctm.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ctm.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, ctm.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, ctm.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, ctm.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, ctm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<ctm.d, agl<ctd>>> $$0, ctm.b $$1) {
      this.a($$0, this.o, this.o, this.x, ctm.b.a(this.r[0], this.r[2]), $$1, 0.0F, ctk.O);
      this.a($$0, ctm.b.a(this.p[1], this.p[2]), this.o, ctm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ctk.g);
      this.a($$0, ctm.b.a(this.p[3], this.p[4]), this.o, ctm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, ctk.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ctm.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ctm.b $$5 = this.q[$$4];
            agl<ctd> $$6 = this.a($$2, $$4, $$1);
            agl<ctd> $$7 = this.b($$2, $$4, $$1);
            agl<ctd> $$8 = this.c($$2, $$4, $$1);
            agl<ctd> $$9 = this.a($$2, $$4);
            agl<ctd> $$10 = this.a($$2, $$4, $$1, $$6);
            agl<ctd> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, ctm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, ctm.b.a(this.A, this.B), ctm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, ctm.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, ctm.b.a(this.A, this.B), ctm.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, ctm.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, ctm.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, ctm.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, ctm.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<ctm.d, agl<ctd>>> $$0, ctm.b $$1) {
      this.a($$0, this.s, this.o, this.x, ctm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? ctk.O : ctk.L);
      this.a($$0, this.t, this.o, this.x, ctm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? ctk.O : ctk.K);
      this.a($$0, this.s, this.o, this.z, ctm.b.a(this.r[0], this.r[1]), $$1, 0.0F, ctk.L);
      this.a($$0, this.t, this.o, this.z, ctm.b.a(this.r[0], this.r[1]), $$1, 0.0F, ctk.K);
      this.a($$0, this.s, this.o, ctm.b.a(this.x, this.B), ctm.b.a(this.r[2], this.r[5]), $$1, 0.0F, ctk.L);
      this.a($$0, this.t, this.o, ctm.b.a(this.x, this.B), ctm.b.a(this.r[2], this.r[5]), $$1, 0.0F, ctk.K);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, ctk.L);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, ctk.K);
      this.a($$0, ctm.b.a(this.p[1], this.p[2]), this.o, ctm.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ctk.g);
      this.a($$0, ctm.b.a(this.p[3], this.p[4]), this.o, ctm.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ctk.h);
      this.a($$0, this.s, this.o, ctm.b.a(this.y, this.B), this.r[6], $$1, 0.0F, ctk.L);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         ctm.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            ctm.b $$5 = this.q[$$4];
            agl<ctd> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, ctm.b.a(this.A, this.B), ctm.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<ctm.d, agl<ctd>>> $$0) {
      this.b($$0, this.o, this.o, ctm.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, ctk.Z);
      this.b($$0, this.o, ctm.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, ctk.aa);
      this.c($$0, this.o, this.o, this.o, ctm.b.a(this.r[0], this.r[1]), this.o, 0.0F, ctk.ab);
   }

   private agl<ctd> a(int $$0, int $$1, ctm.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         agl<ctd> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private agl<ctd> b(int $$0, int $$1, ctm.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private agl<ctd> c(int $$0, int $$1, ctm.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private agl<ctd> a(int $$0, int $$1, ctm.b $$2, agl<ctd> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? ctk.w : $$3;
   }

   private agl<ctd> d(int $$0, int $$1, ctm.b $$2) {
      agl<ctd> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private agl<ctd> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return ctk.N;
      } else {
         return $$0 == 4 ? ctk.f : ctk.M;
      }
   }

   private agl<ctd> a(int $$0, ctm.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? ctk.A : ctk.B;
      } else {
         return $$0 < 3 ? ctk.A : ctk.C;
      }
   }

   private agl<ctd> e(int $$0, int $$1, ctm.b $$2) {
      if ($$2.b() >= 0L) {
         agl<ctd> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private agl<ctd> f(int $$0, int $$1, ctm.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? ctk.I : ctk.H;
      } else {
         return $$0 == 3 ? ctk.J : this.a($$1, $$2);
      }
   }

   private agl<ctd> g(int $$0, int $$1, ctm.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? ctk.G : ctk.F;
      }
   }

   private agl<ctd> h(int $$0, int $$1, ctm.b $$2) {
      agl<ctd> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<ctm.d, agl<ctd>>> $$0, ctm.b $$1, ctm.b $$2, ctm.b $$3, ctm.b $$4, ctm.b $$5, float $$6, agl<ctd> $$7) {
      $$0.accept(Pair.of(ctm.a($$1, $$2, $$3, $$4, ctm.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(ctm.a($$1, $$2, $$3, $$4, ctm.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<ctm.d, agl<ctd>>> $$0, ctm.b $$1, ctm.b $$2, ctm.b $$3, ctm.b $$4, ctm.b $$5, float $$6, agl<ctd> $$7) {
      $$0.accept(Pair.of(ctm.a($$1, $$2, $$3, $$4, ctm.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<ctm.d, agl<ctd>>> $$0, ctm.b $$1, ctm.b $$2, ctm.b $$3, ctm.b $$4, ctm.b $$5, float $$6, agl<ctd> $$7) {
      $$0.accept(Pair.of(ctm.a($$1, $$2, $$3, $$4, ctm.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(dmp $$0, dmp $$1, dmp.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < (double)dnd.a(0.05F)) {
         return "Valley";
      } else if ($$0 < (double)dnd.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < (double)dnd.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < (double)dnd.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = (double)ctm.a((float)$$0);
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

   private static String a(double $$0, ctm.b[] $$1) {
      double $$2 = (double)ctm.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < (double)$$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @aut
   public ctm.b[] b() {
      return this.p;
   }

   @aut
   public ctm.b[] c() {
      return this.q;
   }

   @aut
   public ctm.b[] d() {
      return this.r;
   }

   @aut
   public ctm.b[] e() {
      return new ctm.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @aut
   public ctm.b[] f() {
      return new ctm.b[]{
         ctm.b.a(-2.0F, dnd.a(0.05F)),
         ctm.b.a(dnd.a(0.05F), dnd.a(0.26666668F)),
         ctm.b.a(dnd.a(0.26666668F), dnd.a(0.4F)),
         ctm.b.a(dnd.a(0.4F), dnd.a(0.56666666F)),
         ctm.b.a(dnd.a(0.56666666F), 2.0F)
      };
   }

   @aut
   public ctm.b[] g() {
      return new ctm.b[]{ctm.b.a(-2.0F, 0.0F), ctm.b.a(0.0F, 2.0F)};
   }
}
