import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dic extends dhy implements bkl {
   public static final int e = 9;
   public static final int f = 3;
   public static final int g = 27;
   public static final int h = 1;
   public static final int i = 10;
   public static final float j = 0.5F;
   public static final float k = 270.0F;
   public static final String l = "Items";
   private static final int[] r = IntStream.range(0, 27).toArray();
   private iq<cmx> s = iq.a(27, cmx.f);
   private int t;
   private dic.a u = dic.a.a;
   private float v;
   private float w;
   @Nullable
   private final cll x;

   public dic(@Nullable cll $$0, hx $$1, djg $$2) {
      super(dgw.x, $$1, $$2);
      this.x = $$0;
   }

   public dic(hx $$0, djg $$1) {
      super(dgw.x, $$0, $$1);
      this.x = ddn.a($$1.b());
   }

   public static void a(cto $$0, hx $$1, djg $$2, dic $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(cto $$0, hx $$1, djg $$2) {
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
               this.u = dic.a.c;
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
               this.u = dic.a.a;
               this.v = 0.0F;
               d($$0, $$1, $$2);
            }
            break;
         case c:
            this.v = 1.0F;
      }
   }

   public dic.a m() {
      return this.u;
   }

   public eln a(djg $$0) {
      return ccu.a($$0.c(ddn.b), 0.5F * this.a(1.0F));
   }

   private void c(cto $$0, hx $$1, djg $$2) {
      if ($$2.b() instanceof ddn) {
         ic $$3 = $$2.c(ddn.b);
         eln $$4 = ccu.a($$3, this.w, this.v).a($$1);
         List<blu> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (blu $$6 : $$5) {
               if ($$6.s_() != eev.d) {
                  $$6.a(bmq.d, new els(($$4.b() + 0.01) * (double)$$3.j(), ($$4.c() + 0.01) * (double)$$3.k(), ($$4.d() + 0.01) * (double)$$3.l()));
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
            this.u = dic.a.d;
         }

         if ($$1 == 1) {
            this.u = dic.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(cto $$0, hx $$1, djg $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void d_(cfh $$0) {
      if (!this.q && !$$0.P_()) {
         if (this.t < 0) {
            this.t = 0;
         }

         this.t++;
         this.o.a(this.p, this.r().b(), 1, this.t);
         if (this.t == 1) {
            this.o.a($$0, dnq.k, this.p);
            this.o.a(null, this.p, arr.vQ, ars.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cfh $$0) {
      if (!this.q && !$$0.P_()) {
         this.t--;
         this.o.a(this.p, this.r().b(), 1, this.t);
         if (this.t <= 0) {
            this.o.a($$0, dnq.j, this.p);
            this.o.a(null, this.p, arr.vP, ars.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected vf l() {
      return vf.c("container.shulkerBox");
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.d($$0);
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         bju.a($$0, this.s, false);
      }
   }

   @Override
   public void d(sn $$0) {
      this.s = iq.a(this.b(), cmx.f);
      if (!this.c_($$0) && $$0.b("Items", 9)) {
         bju.b($$0, this.s);
      }
   }

   @Override
   protected iq<cmx> k() {
      return this.s;
   }

   @Override
   protected void a(iq<cmx> $$0) {
      this.s = $$0;
   }

   @Override
   public int[] a(ic $$0) {
      return r;
   }

   @Override
   public boolean a(int $$0, cmx $$1, @Nullable ic $$2) {
      return !(cwp.a($$1.d()) instanceof ddn);
   }

   @Override
   public boolean b(int $$0, cmx $$1, ic $$2) {
      return true;
   }

   public float a(float $$0) {
      return aun.i($$0, this.w, this.v);
   }

   @Nullable
   public cll w() {
      return this.x;
   }

   @Override
   protected cia a(int $$0, cfg $$1) {
      return new cjs($$0, $$1, this);
   }

   public boolean x() {
      return this.u == dic.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
