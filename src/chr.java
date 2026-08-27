import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class chr extends cfu implements cht {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;
   private final Multimap<bhb, bhe> d;

   public chr(cfu.a $$0) {
      super($$0);
      Builder<bhb, bhe> $$1 = ImmutableMultimap.builder();
      $$1.put(bhg.f, new bhe(m, "Tool modifier", 8.0, bhe.a.a));
      $$1.put(bhg.h, new bhe(n, "Tool modifier", -2.9F, bhe.a.a));
      this.d = $$1.build();
   }

   @Override
   public boolean a(dcb $$0, cmm $$1, gu $$2, byo $$3) {
      return !$$3.f();
   }

   @Override
   public chs c(cfz $$0) {
      return chs.f;
   }

   @Override
   public int b(cfz $$0) {
      return 72000;
   }

   @Override
   public void a(cfz $$0, cmm $$1, bfz $$2, int $$3) {
      if ($$2 instanceof byo $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = cki.h($$0);
            if ($$6 <= 0 || $$4.aW()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, $$1x -> $$1x.d($$2.fj()));
                  if ($$6 == 0) {
                     bzs $$7 = new bzs($$1, $$4, $$0);
                     $$7.a($$4, $$4.dA(), $$4.dy(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fO().d) {
                        $$7.d = byu.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, amh.xN, ami.h, 1.0F, 1.0F);
                     if (!$$4.fO().d) {
                        $$4.fN().g($$0);
                     }
                  }
               }

               $$4.b(amr.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dy();
                  float $$9 = $$4.dA();
                  float $$10 = -apa.a($$8 * (float) (Math.PI / 180.0)) * apa.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -apa.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = apa.b($$8 * (float) (Math.PI / 180.0)) * apa.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = apa.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.t(20);
                  if ($$4.ay()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bgf.a, new eei(0.0, 1.1999999F, 0.0));
                  }

                  amg $$16;
                  if ($$6 >= 3) {
                     $$16 = amh.xM;
                  } else if ($$6 == 2) {
                     $$16 = amh.xL;
                  } else {
                     $$16 = amh.xK;
                  }

                  $$1.a(null, $$4, $$16, ami.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
      cfz $$3 = $$1.b($$2);
      if ($$3.k() >= $$3.l() - 1) {
         return bdy.d($$3);
      } else if (cki.h($$3) > 0 && !$$1.aW()) {
         return bdy.d($$3);
      } else {
         $$1.c($$2);
         return bdy.b($$3);
      }
   }

   @Override
   public boolean a(cfz $$0, bfz $$1, bfz $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bfo.a));
      return true;
   }

   @Override
   public boolean a(cfz $$0, cmm $$1, dcb $$2, gu $$3, bfz $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bfo.a));
      }

      return true;
   }

   @Override
   public Multimap<bhb, bhe> a(bfo $$0) {
      return $$0 == bfo.a ? this.d : super.a($$0);
   }

   @Override
   public int c() {
      return 1;
   }
}
