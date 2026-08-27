import com.mojang.serialization.MapCodec;

public class cyk extends cwy implements cws {
   public static final MapCodec<cyk> d = b(cyk::new);
   public static final int e = 7;
   public static final dkg f = djw.av;
   private static final eml[] a = new eml[]{
      cwp.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends cyk> a() {
      return d;
   }

   protected cyk(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(djg $$0, csu $$1, hx $$2) {
      return $$0.a(cwr.cC);
   }

   protected dkg b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(djg $$0) {
      return $$0.c(this.b());
   }

   public djg b(int $$0) {
      return this.o().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(djg $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   public boolean e_(djg $$0) {
      return !this.h($$0);
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      if ($$1.b($$2, 0) >= 9) {
         int $$4 = this.g($$0);
         if ($$4 < this.c()) {
            float $$5 = a(this, $$1, $$2);
            if ($$3.a((int)(25.0F / $$5) + 1) == 0) {
               $$1.a($$2, this.b($$4 + 1), 2);
            }
         }
      }
   }

   public void a(cto $$0, hx $$1, djg $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(cto $$0) {
      return aun.a($$0.z, 2, 5);
   }

   protected static float a(cwp $$0, csu $$1, hx $$2) {
      float $$3 = 1.0F;
      hx $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            djg $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(cwr.cC)) {
               $$7 = 1.0F;
               if ($$8.c(czm.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      hx $$9 = $$2.e();
      hx $$10 = $$2.f();
      hx $$11 = $$2.g();
      hx $$12 = $$2.h();
      boolean $$13 = $$1.a_($$11).a($$0) || $$1.a_($$12).a($$0);
      boolean $$14 = $$1.a_($$9).a($$0) || $$1.a_($$10).a($$0);
      if ($$13 && $$14) {
         $$3 /= 2.0F;
      } else {
         boolean $$15 = $$1.a_($$11.e()).a($$0) || $$1.a_($$12.e()).a($$0) || $$1.a_($$12.f()).a($$0) || $$1.a_($$11.f()).a($$0);
         if ($$15) {
            $$3 /= 2.0F;
         }
      }

      return $$3;
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(ctr $$0, hx $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, blu $$3) {
      if ($$3 instanceof cct && $$1.Z().b(ctk.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected ctn d() {
      return cna.ps;
   }

   @Override
   public cmx a(ctr $$0, hx $$1, djg $$2) {
      return new cmx(this.d());
   }

   @Override
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      this.a((cto)$$0, $$2, $$3);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(f);
   }
}
