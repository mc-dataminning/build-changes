import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dnx extends dnt implements bor {
   public static final int e = 9;
   public static final int f = 3;
   public static final int g = 27;
   public static final int h = 1;
   public static final int i = 10;
   public static final float j = 0.5F;
   public static final float k = 270.0F;
   private static final int[] l = IntStream.range(0, 27).toArray();
   private iw<crs> r = iw.a(27, crs.i);
   private int s;
   private dnx.a t = dnx.a.a;
   private float u;
   private float v;
   @Nullable
   private final cql w;

   public dnx(@Nullable cql $$0, id $$1, dpi $$2) {
      super(dmq.x, $$1, $$2);
      this.w = $$0;
   }

   public dnx(id $$0, dpi $$1) {
      super(dmq.x, $$0, $$1);
      this.w = djf.a($$1.b());
   }

   public static void a(czg $$0, id $$1, dpi $$2, dnx $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(czg $$0, id $$1, dpi $$2) {
      this.v = this.u;
      switch (this.t) {
         case a:
            this.u = 0.0F;
            break;
         case b:
            this.u += 0.1F;
            if (this.v == 0.0F) {
               d($$0, $$1, $$2);
            }

            if (this.u >= 1.0F) {
               this.t = dnx.a.c;
               this.u = 1.0F;
               d($$0, $$1, $$2);
            }

            this.c($$0, $$1, $$2);
            break;
         case d:
            this.u -= 0.1F;
            if (this.v == 1.0F) {
               d($$0, $$1, $$2);
            }

            if (this.u <= 0.0F) {
               this.t = dnx.a.a;
               this.u = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.u = 1.0F;
      }
   }

   public dnx.a l() {
      return this.t;
   }

   public ese a(dpi $$0) {
      return chm.a(1.0F, $$0.c(djf.b), 0.5F * this.a(1.0F));
   }

   private void c(czg $$0, id $$1, dpi $$2) {
      if ($$2.b() instanceof djf) {
         ij $$3 = $$2.c(djf.b);
         ese $$4 = chm.a(1.0F, $$3, this.v, this.u).a($$1);
         List<bqa> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bqa $$6 : $$5) {
               if ($$6.k_() != elg.d) {
                  $$6.a(bqy.d, new esj(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
               }
            }
         }
      }
   }

   @Override
   public int b() {
      return this.r.size();
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.s = $$1;
         if ($$1 == 0) {
            this.t = dnx.a.d;
         }

         if ($$1 == 1) {
            this.t = dnx.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(czg $$0, id $$1, dpi $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cka $$0) {
      if (!this.q && !$$0.N_()) {
         if (this.s < 0) {
            this.s = 0;
         }

         this.s++;
         this.o.a(this.p, this.n().b(), 1, this.s);
         if (this.s == 1) {
            this.o.a($$0, dub.k, this.p);
            this.o.a(null, this.p, auo.wr, aup.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cka $$0) {
      if (!this.q && !$$0.N_()) {
         this.s--;
         this.o.a(this.p, this.n().b(), 1, this.s);
         if (this.s <= 0) {
            this.o.a($$0, dub.j, this.p);
            this.o.a(null, this.p, auo.wq, aup.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected wi k() {
      return wi.c("container.shulkerBox");
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      this.c($$0, $$1);
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bnz.a($$0, this.r, false, $$1);
      }
   }

   public void c(to $$0, ip.a $$1) {
      this.r = iw.a(this.b(), crs.i);
      if (!this.a_($$0) && $$0.b("Items", 9)) {
         bnz.b($$0, this.r, $$1);
      }
   }

   @Override
   protected iw<crs> j() {
      return this.r;
   }

   @Override
   protected void a(iw<crs> $$0) {
      this.r = $$0;
   }

   @Override
   public int[] a(ij $$0) {
      return l;
   }

   @Override
   public boolean a(int $$0, crs $$1, @Nullable ij $$2) {
      return !(dch.a($$1.f()) instanceof djf);
   }

   @Override
   public boolean b(int $$0, crs $$1, ij $$2) {
      return true;
   }

   public float a(float $$0) {
      return axm.i($$0, this.v, this.u);
   }

   @Nullable
   public cql t() {
      return this.w;
   }

   @Override
   protected cmw a(int $$0, cjz $$1) {
      return new cop($$0, $$1, this);
   }

   public boolean u() {
      return this.t == dnx.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
