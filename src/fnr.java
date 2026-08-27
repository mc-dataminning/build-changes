import com.google.common.collect.ImmutableList;
import java.util.function.Function;

public class fnr<T extends box> extends fma<T> implements fme, fnm {
   public static final float f = 0.25F;
   public static final float g = 0.5F;
   public static final float h = -0.1F;
   private static final float a = 0.005F;
   private static final float b = (float) (Math.PI / 12);
   private static final float w = 1.9198622F;
   private static final float x = (float) (Math.PI / 12);
   private static final float y = (float) (-Math.PI * 4.0 / 9.0);
   private static final float z = 0.43633232F;
   private static final float A = (float) (Math.PI / 6);
   public static final float i = 1.4835298F;
   public static final float j = (float) (Math.PI / 6);
   public final fqf k;
   public final fqf l;
   public final fqf m;
   public final fqf n;
   public final fqf o;
   public final fqf p;
   public final fqf q;
   public fnr.a r = fnr.a.a;
   public fnr.a s = fnr.a.a;
   public boolean t;
   public float u;

   public fnr(fqf $$0) {
      this($$0, fwy::e);
   }

   public fnr(fqf $$0, Function<ajc, fwy> $$1) {
      super($$1, true, 16.0F, 0.0F, 2.0F, 2.0F, 24.0F);
      this.k = $$0.b("head");
      this.l = $$0.b("hat");
      this.m = $$0.b("body");
      this.n = $$0.b("right_arm");
      this.o = $$0.b("left_arm");
      this.p = $$0.b("right_leg");
      this.q = $$0.b("left_leg");
   }

   public static fqn a(fqj $$0, float $$1) {
      fqn $$2 = new fqn();
      fqo $$3 = $$2.a();
      $$3.a("head", fqk.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fqh.a(0.0F, 0.0F + $$1, 0.0F));
      $$3.a("hat", fqk.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0.a(0.5F)), fqh.a(0.0F, 0.0F + $$1, 0.0F));
      $$3.a("body", fqk.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), fqh.a(0.0F, 0.0F + $$1, 0.0F));
      $$3.a("right_arm", fqk.c().a(40, 16).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), fqh.a(-5.0F, 2.0F + $$1, 0.0F));
      $$3.a("left_arm", fqk.c().a(40, 16).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), fqh.a(5.0F, 2.0F + $$1, 0.0F));
      $$3.a("right_leg", fqk.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), fqh.a(-1.9F, 12.0F + $$1, 0.0F));
      $$3.a("left_leg", fqk.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), fqh.a(1.9F, 12.0F + $$1, 0.0F));
      return $$2;
   }

   @Override
   protected Iterable<fqf> a() {
      return ImmutableList.of(this.k);
   }

   @Override
   protected Iterable<fqf> b() {
      return ImmutableList.of(this.m, this.n, this.o, this.p, this.q, this.l);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.u = $$0.a($$3);
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      boolean $$6 = $$0.fz() > 4;
      boolean $$7 = $$0.bX();
      this.k.f = $$4 * (float) (Math.PI / 180.0);
      if ($$6) {
         this.k.e = (float) (-Math.PI / 4);
      } else if (this.u > 0.0F) {
         if ($$7) {
            this.k.e = this.a(this.u, this.k.e, (float) (-Math.PI / 4));
         } else {
            this.k.e = this.a(this.u, this.k.e, $$5 * (float) (Math.PI / 180.0));
         }
      } else {
         this.k.e = $$5 * (float) (Math.PI / 180.0);
      }

      this.m.f = 0.0F;
      this.n.d = 0.0F;
      this.n.b = -5.0F;
      this.o.d = 0.0F;
      this.o.b = 5.0F;
      float $$8 = 1.0F;
      if ($$6) {
         $$8 = (float)$$0.dm().g();
         $$8 /= 0.2F;
         $$8 *= $$8 * $$8;
      }

      if ($$8 < 1.0F) {
         $$8 = 1.0F;
      }

      this.n.e = awm.b($$1 * 0.6662F + (float) Math.PI) * 2.0F * $$2 * 0.5F / $$8;
      this.o.e = awm.b($$1 * 0.6662F) * 2.0F * $$2 * 0.5F / $$8;
      this.n.g = 0.0F;
      this.o.g = 0.0F;
      this.p.e = awm.b($$1 * 0.6662F) * 1.4F * $$2 / $$8;
      this.q.e = awm.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2 / $$8;
      this.p.f = 0.005F;
      this.q.f = -0.005F;
      this.p.g = 0.005F;
      this.q.g = -0.005F;
      if (this.d) {
         this.n.e += (float) (-Math.PI / 5);
         this.o.e += (float) (-Math.PI / 5);
         this.p.e = -1.4137167F;
         this.p.f = (float) (Math.PI / 10);
         this.p.g = 0.07853982F;
         this.q.e = -1.4137167F;
         this.q.f = (float) (-Math.PI / 10);
         this.q.g = -0.07853982F;
      }

      this.n.f = 0.0F;
      this.o.f = 0.0F;
      boolean $$9 = $$0.fo() == bor.b;
      if ($$0.fp()) {
         boolean $$10 = $$0.fq() == bmk.a;
         if ($$10 == $$9) {
            this.a($$0);
         } else {
            this.b($$0);
         }
      } else {
         boolean $$11 = $$9 ? this.r.a() : this.s.a();
         if ($$9 != $$11) {
            this.b($$0);
            this.a($$0);
         } else {
            this.a($$0);
            this.b($$0);
         }
      }

      this.a($$0, $$3);
      if (this.t) {
         this.m.e = 0.5F;
         this.n.e += 0.4F;
         this.o.e += 0.4F;
         this.p.d = 4.0F;
         this.q.d = 4.0F;
         this.p.c = 12.2F;
         this.q.c = 12.2F;
         this.k.c = 4.2F;
         this.m.c = 3.2F;
         this.o.c = 5.2F;
         this.n.c = 5.2F;
      } else {
         this.m.e = 0.0F;
         this.p.d = 0.0F;
         this.q.d = 0.0F;
         this.p.c = 12.0F;
         this.q.c = 12.0F;
         this.k.c = 0.0F;
         this.m.c = 0.0F;
         this.o.c = 2.0F;
         this.n.c = 2.0F;
      }

      if (this.s != fnr.a.h) {
         fmc.a(this.n, $$3, 1.0F);
      }

      if (this.r != fnr.a.h) {
         fmc.a(this.o, $$3, -1.0F);
      }

      if (this.u > 0.0F) {
         float $$12 = $$1 % 26.0F;
         bor $$13 = this.c($$0);
         float $$14 = $$13 == bor.b && this.c > 0.0F ? 0.0F : this.u;
         float $$15 = $$13 == bor.a && this.c > 0.0F ? 0.0F : this.u;
         if (!$$0.fp()) {
            if ($$12 < 14.0F) {
               this.o.e = this.a($$15, this.o.e, 0.0F);
               this.n.e = awm.i($$14, this.n.e, 0.0F);
               this.o.f = this.a($$15, this.o.f, (float) Math.PI);
               this.n.f = awm.i($$14, this.n.f, (float) Math.PI);
               this.o.g = this.a($$15, this.o.g, (float) Math.PI + 1.8707964F * this.a($$12) / this.a(14.0F));
               this.n.g = awm.i($$14, this.n.g, (float) Math.PI - 1.8707964F * this.a($$12) / this.a(14.0F));
            } else if ($$12 >= 14.0F && $$12 < 22.0F) {
               float $$16 = ($$12 - 14.0F) / 8.0F;
               this.o.e = this.a($$15, this.o.e, (float) (Math.PI / 2) * $$16);
               this.n.e = awm.i($$14, this.n.e, (float) (Math.PI / 2) * $$16);
               this.o.f = this.a($$15, this.o.f, (float) Math.PI);
               this.n.f = awm.i($$14, this.n.f, (float) Math.PI);
               this.o.g = this.a($$15, this.o.g, 5.012389F - 1.8707964F * $$16);
               this.n.g = awm.i($$14, this.n.g, 1.2707963F + 1.8707964F * $$16);
            } else if ($$12 >= 22.0F && $$12 < 26.0F) {
               float $$17 = ($$12 - 22.0F) / 4.0F;
               this.o.e = this.a($$15, this.o.e, (float) (Math.PI / 2) - (float) (Math.PI / 2) * $$17);
               this.n.e = awm.i($$14, this.n.e, (float) (Math.PI / 2) - (float) (Math.PI / 2) * $$17);
               this.o.f = this.a($$15, this.o.f, (float) Math.PI);
               this.n.f = awm.i($$14, this.n.f, (float) Math.PI);
               this.o.g = this.a($$15, this.o.g, (float) Math.PI);
               this.n.g = awm.i($$14, this.n.g, (float) Math.PI);
            }
         }

         float $$18 = 0.3F;
         float $$19 = 0.33333334F;
         this.q.e = awm.i(this.u, this.q.e, 0.3F * awm.b($$1 * 0.33333334F + (float) Math.PI));
         this.p.e = awm.i(this.u, this.p.e, 0.3F * awm.b($$1 * 0.33333334F));
      }

      this.l.a(this.k);
   }

   private void a(T $$0) {
      switch (this.s) {
         case a:
            this.n.f = 0.0F;
            break;
         case c:
            this.a(this.n, true);
            break;
         case b:
            this.n.e = this.n.e * 0.5F - (float) (Math.PI / 10);
            this.n.f = 0.0F;
            break;
         case e:
            this.n.e = this.n.e * 0.5F - (float) Math.PI;
            this.n.f = 0.0F;
            break;
         case d:
            this.n.f = -0.1F + this.k.f;
            this.o.f = 0.1F + this.k.f + 0.4F;
            this.n.e = (float) (-Math.PI / 2) + this.k.e;
            this.o.e = (float) (-Math.PI / 2) + this.k.e;
            break;
         case f:
            fmc.a(this.n, this.o, $$0, true);
            break;
         case g:
            fmc.a(this.n, this.o, this.k, true);
            break;
         case j:
            this.n.e = this.n.e * 0.5F - (float) (Math.PI / 5);
            this.n.f = 0.0F;
            break;
         case h:
            this.n.e = awm.a(this.k.e - 1.9198622F - ($$0.bU() ? (float) (Math.PI / 12) : 0.0F), -2.4F, 3.3F);
            this.n.f = this.k.f - (float) (Math.PI / 12);
            break;
         case i:
            this.n.e = awm.a(this.k.e, -1.2F, 1.2F) - 1.4835298F;
            this.n.f = this.k.f - (float) (Math.PI / 6);
      }
   }

   private void b(T $$0) {
      switch (this.r) {
         case a:
            this.o.f = 0.0F;
            break;
         case c:
            this.a(this.o, false);
            break;
         case b:
            this.o.e = this.o.e * 0.5F - (float) (Math.PI / 10);
            this.o.f = 0.0F;
            break;
         case e:
            this.o.e = this.o.e * 0.5F - (float) Math.PI;
            this.o.f = 0.0F;
            break;
         case d:
            this.n.f = -0.1F + this.k.f - 0.4F;
            this.o.f = 0.1F + this.k.f;
            this.n.e = (float) (-Math.PI / 2) + this.k.e;
            this.o.e = (float) (-Math.PI / 2) + this.k.e;
            break;
         case f:
            fmc.a(this.n, this.o, $$0, false);
            break;
         case g:
            fmc.a(this.n, this.o, this.k, false);
            break;
         case j:
            this.o.e = this.o.e * 0.5F - (float) (Math.PI / 5);
            this.o.f = 0.0F;
            break;
         case h:
            this.o.e = awm.a(this.k.e - 1.9198622F - ($$0.bU() ? (float) (Math.PI / 12) : 0.0F), -2.4F, 3.3F);
            this.o.f = this.k.f + (float) (Math.PI / 12);
            break;
         case i:
            this.o.e = awm.a(this.k.e, -1.2F, 1.2F) - 1.4835298F;
            this.o.f = this.k.f + (float) (Math.PI / 6);
      }
   }

   private void a(fqf $$0, boolean $$1) {
      $$0.e = $$0.e * 0.5F - 0.9424779F + awm.a(this.k.e, (float) (-Math.PI * 4.0 / 9.0), 0.43633232F);
      $$0.f = ($$1 ? -30.0F : 30.0F) * (float) (Math.PI / 180.0) + awm.a(this.k.f, (float) (-Math.PI / 6), (float) (Math.PI / 6));
   }

   protected void a(T $$0, float $$1) {
      if (!(this.c <= 0.0F)) {
         bor $$2 = this.c($$0);
         fqf $$3 = this.a($$2);
         float $$4 = this.c;
         this.m.f = awm.a(awm.c($$4) * (float) (Math.PI * 2)) * 0.2F;
         if ($$2 == bor.a) {
            this.m.f *= -1.0F;
         }

         this.n.d = awm.a(this.m.f) * 5.0F;
         this.n.b = -awm.b(this.m.f) * 5.0F;
         this.o.d = -awm.a(this.m.f) * 5.0F;
         this.o.b = awm.b(this.m.f) * 5.0F;
         this.n.f = this.n.f + this.m.f;
         this.o.f = this.o.f + this.m.f;
         this.o.e = this.o.e + this.m.f;
         $$4 = 1.0F - this.c;
         $$4 *= $$4;
         $$4 *= $$4;
         $$4 = 1.0F - $$4;
         float $$5 = awm.a($$4 * (float) Math.PI);
         float $$6 = awm.a(this.c * (float) Math.PI) * -(this.k.e - 0.7F) * 0.75F;
         $$3.e -= $$5 * 1.2F + $$6;
         $$3.f = $$3.f + this.m.f * 2.0F;
         $$3.g = $$3.g + awm.a(this.c * (float) Math.PI) * -0.4F;
      }
   }

   protected float a(float $$0, float $$1, float $$2) {
      float $$3 = ($$2 - $$1) % (float) (Math.PI * 2);
      if ($$3 < (float) -Math.PI) {
         $$3 += (float) (Math.PI * 2);
      }

      if ($$3 >= (float) Math.PI) {
         $$3 -= (float) (Math.PI * 2);
      }

      return $$1 + $$0 * $$3;
   }

   private float a(float $$0) {
      return -65.0F * $$0 + $$0 * $$0;
   }

   public void a(fnr<T> $$0) {
      super.a($$0);
      $$0.r = this.r;
      $$0.s = this.s;
      $$0.t = this.t;
      $$0.k.a(this.k);
      $$0.l.a(this.l);
      $$0.m.a(this.m);
      $$0.n.a(this.n);
      $$0.o.a(this.o);
      $$0.p.a(this.p);
      $$0.q.a(this.q);
   }

   public void b_(boolean $$0) {
      this.k.k = $$0;
      this.l.k = $$0;
      this.m.k = $$0;
      this.n.k = $$0;
      this.o.k = $$0;
      this.p.k = $$0;
      this.q.k = $$0;
   }

   @Override
   public void a(bor $$0, etd $$1) {
      this.a($$0).a($$1);
   }

   protected fqf a(bor $$0) {
      return $$0 == bor.a ? this.o : this.n;
   }

   @Override
   public fqf d() {
      return this.k;
   }

   private bor c(T $$0) {
      bor $$1 = $$0.fo();
      return $$0.aH == bmk.a ? $$1 : $$1.e();
   }

   public static enum a {
      a(false),
      b(false),
      c(false),
      d(true),
      e(false),
      f(true),
      g(true),
      h(false),
      i(false),
      j(false);

      private final boolean k;

      private a(boolean $$0) {
         this.k = $$0;
      }

      public boolean a() {
         return this.k;
      }
   }
}
