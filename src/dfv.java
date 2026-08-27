import com.mojang.serialization.MapCodec;

public class dfv extends dej implements ded {
   public static final MapCodec<dfv> d = b(dfv::new);
   public static final int e = 7;
   public static final dsd f = drt.av;
   private static final evf[] a = new evf[]{
      dea.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dea.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dfv> a() {
      return d;
   }

   protected dfv(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(drd $$0, daf $$1, io $$2) {
      return $$0.a(dec.cC);
   }

   protected dsd b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(drd $$0) {
      return $$0.c(this.b());
   }

   public drd b(int $$0) {
      return this.n().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(drd $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   protected boolean d_(drd $$0) {
      return !this.h($$0);
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
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

   public void a(daz $$0, io $$1, drd $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(daz $$0) {
      return ayf.a($$0.z, 2, 5);
   }

   protected static float a(dea $$0, daf $$1, io $$2) {
      float $$3 = 1.0F;
      io $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            drd $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dec.cC)) {
               $$7 = 1.0F;
               if ($$8.c(dgx.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      io $$9 = $$2.e();
      io $$10 = $$2.f();
      io $$11 = $$2.g();
      io $$12 = $$2.h();
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
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dbc $$0, io $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, brw $$3) {
      if ($$3 instanceof cjj && $$1.aa().b(dav.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected day d() {
      return ctt.pv;
   }

   @Override
   public ctq a(dbc $$0, io $$1, drd $$2) {
      return new ctq(this.d());
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return true;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      this.a((daz)$$0, $$2, $$3);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(f);
   }
}
