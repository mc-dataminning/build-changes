import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dkt extends dkp implements bmx {
   public static final int e = 9;
   public static final int f = 3;
   public static final int g = 27;
   public static final int h = 1;
   public static final int i = 10;
   public static final float j = 0.5F;
   public static final float k = 270.0F;
   public static final String l = "Items";
   private static final int[] r = IntStream.range(0, 27).toArray();
   private iu<cpq> s = iu.a(27, cpq.h);
   private int t;
   private dkt.a u = dkt.a.a;
   private float v;
   private float w;
   @Nullable
   private final cog x;

   public dkt(@Nullable cog $$0, ib $$1, dme $$2) {
      super(djn.x, $$1, $$2);
      this.x = $$0;
   }

   public dkt(ib $$0, dme $$1) {
      super(djn.x, $$0, $$1);
      this.x = dgd.a($$1.b());
   }

   public static void a(cwe $$0, ib $$1, dme $$2, dkt $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(cwe $$0, ib $$1, dme $$2) {
      this.w = this.v;
      switch (this.u) {
         case a:
            this.v = 0.0F;
            break;
         case b:
            this.v += 0.1F;
            if (this.w == 0.0F) {
               d($$0, $$1, $$2);
            }

            if (this.v >= 1.0F) {
               this.u = dkt.a.c;
               this.v = 1.0F;
               d($$0, $$1, $$2);
            }

            this.c($$0, $$1, $$2);
            break;
         case d:
            this.v -= 0.1F;
            if (this.w == 1.0F) {
               d($$0, $$1, $$2);
            }

            if (this.v <= 0.0F) {
               this.u = dkt.a.a;
               this.v = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.v = 1.0F;
      }
   }

   public dkt.a l() {
      return this.u;
   }

   public eoq a(dme $$0) {
      return cfm.a(1.0F, $$0.c(dgd.b), 0.5F * this.a(1.0F));
   }

   private void c(cwe $$0, ib $$1, dme $$2) {
      if ($$2.b() instanceof dgd) {
         ih $$3 = $$2.c(dgd.b);
         eoq $$4 = cfm.a(1.0F, $$3, this.w, this.v).a($$1);
         List<bof> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bof $$6 : $$5) {
               if ($$6.s_() != ehw.d) {
                  $$6.a(bpc.d, new eov(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
               }
            }
         }
      }
   }

   @Override
   public int b() {
      return this.s.size();
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.t = $$1;
         if ($$1 == 0) {
            this.u = dkt.a.d;
         }

         if ($$1 == 1) {
            this.u = dkt.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(cwe $$0, ib $$1, dme $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cia $$0) {
      if (!this.q && !$$0.P_()) {
         if (this.t < 0) {
            this.t = 0;
         }

         this.t++;
         this.o.a(this.p, this.n().b(), 1, this.t);
         if (this.t == 1) {
            this.o.a($$0, dqr.k, this.p);
            this.o.a(null, this.p, atp.wg, atq.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cia $$0) {
      if (!this.q && !$$0.P_()) {
         this.t--;
         this.o.a(this.p, this.n().b(), 1, this.t);
         if (this.t <= 0) {
            this.o.a($$0, dqr.j, this.p);
            this.o.a(null, this.p, atp.wf, atq.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected vs k() {
      return vs.c("container.shulkerBox");
   }

   @Override
   public void a(sy $$0, in.a $$1) {
      super.a($$0, $$1);
      this.c($$0);
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.b($$0)) {
         bmf.a($$0, this.s, false);
      }
   }

   @Override
   public void c(sy $$0) {
      this.s = iu.a(this.b(), cpq.h);
      if (!this.c_($$0) && $$0.b("Items", 9)) {
         bmf.b($$0, this.s);
      }
   }

   @Override
   protected iu<cpq> j() {
      return this.s;
   }

   @Override
   protected void a(iu<cpq> $$0) {
      this.s = $$0;
   }

   @Override
   public int[] a(ih $$0) {
      return r;
   }

   @Override
   public boolean a(int $$0, cpq $$1, @Nullable ih $$2) {
      return !(czf.a($$1.d()) instanceof dgd);
   }

   @Override
   public boolean b(int $$0, cpq $$1, ih $$2) {
      return true;
   }

   public float a(float $$0) {
      return awm.i($$0, this.w, this.v);
   }

   @Nullable
   public cog s() {
      return this.x;
   }

   @Override
   protected cku a(int $$0, chz $$1) {
      return new cmm($$0, $$1, this);
   }

   public boolean t() {
      return this.u == dkt.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
