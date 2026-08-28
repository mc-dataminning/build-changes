import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class eow extends eox {
   public static final dtr a = dtq.i;
   public static final dua b = dtq.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dfw.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dfw.a> $$0 = new Object2ByteLinkedOpenHashMap<dfw.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<eoy, exp> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dtb.a<eox, eoy> $$0) {
      $$0.a(a);
   }

   @Override
   public eww a(dca $$0, jd $$1, eoy $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      jd.a $$5 = new jd.a();

      for (ji $$6 : ji.c.a) {
         $$5.a($$1, $$6);
         eoy $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  jd $$10 = $$5.d();
                  eoy $$11 = $$0.b_($$10);
                  if (this.g($$11)) {
                     $$8 = $$11.d();
                     if ($$8 > 0.0F) {
                        $$9 = $$2.d() - ($$8 - 0.8888889F);
                     }
                  }
               }
            } else if ($$8 > 0.0F) {
               $$9 = $$2.d() - $$8;
            }

            if ($$9 != 0.0F) {
               $$3 += (double)((float)$$6.j() * $$9);
               $$4 += (double)((float)$$6.l() * $$9);
            }
         }
      }

      eww $$12 = new eww($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (ji $$13 : ji.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.c(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(eoy $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(dca $$0, jd $$1, ji $$2) {
      dta $$3 = $$0.a_($$1);
      eoy $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == ji.b) {
         return true;
      } else {
         return $$3.b() instanceof dju ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(dcu $$0, jd $$1, eoy $$2) {
      if (!$$2.c()) {
         dta $$3 = $$0.a_($$1);
         jd $$4 = $$1.d();
         dta $$5 = $$0.a_($$4);
         eoy $$6 = this.a($$0, $$4, $$5);
         if (this.a($$0, $$1, $$3, ji.a, $$4, $$5, $$0.b_($$4), $$6.a())) {
            this.a($$0, $$4, $$5, ji.a, $$6);
            if (this.a($$0, $$1) >= 3) {
               this.a($$0, $$1, $$2, $$3);
            }
         } else if ($$2.b() || !this.a($$0, $$6.a(), $$1, $$3, $$4, $$5)) {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(dcu $$0, jd $$1, eoy $$2, dta $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<ji, eoy> $$5 = this.b($$0, $$1, $$3);

         for (Entry<ji, eoy> $$6 : $$5.entrySet()) {
            ji $$7 = $$6.getKey();
            eoy $$8 = $$6.getValue();
            jd $$9 = $$1.a($$7);
            dta $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected eoy a(dcu $$0, jd $$1, dta $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (ji $$5 : ji.c.a) {
         jd $$6 = $$1.a($$5);
         dta $$7 = $$0.a_($$6);
         eoy $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         dta $$9 = $$0.a_($$1.d());
         eoy $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      jd $$11 = $$1.c();
      dta $$12 = $$0.a_($$11);
      eoy $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(ji.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? eoz.a.g() : this.a($$14, false);
      }
   }

   private boolean a(ji $$0, dca $$1, jd $$2, dta $$3, jd $$4, dta $$5) {
      Object2ByteLinkedOpenHashMap<dfw.a> $$7;
      if (!$$3.b().p() && !$$5.b().p()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      dfw.a $$8;
      if ($$7 != null) {
         $$8 = new dfw.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      exp $$11 = $$3.k($$1, $$2);
      exp $$12 = $$5.k($$1, $$4);
      boolean $$13 = !exm.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract eox d();

   public eoy a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract eox e();

   public eoy a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(dcu var1);

   protected void a(dcv $$0, jd $$1, dta $$2, ji $$3, eoy $$4) {
      if ($$2.b() instanceof dkn) {
         ((dkn)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(dcv var1, jd var2, dta var3);

   private static short a(jd $$0, jd $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(dcx $$0, jd $$1, int $$2, ji $$3, dta $$4, jd $$5, Short2ObjectMap<Pair<dta, eoy>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (ji $$9 : ji.c.a) {
         if ($$9 != $$3) {
            jd $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<dta, eoy> $$12 = (Pair<dta, eoy>)$$6.computeIfAbsent($$11, $$2x -> {
               dta $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            dta $$13 = (dta)$$12.getFirst();
            eoy $$14 = (eoy)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  jd $$4x = $$10.d();
                  dta $$5x = $$0.a_($$4x);
                  return this.a($$0, this.d(), $$10, $$13, $$4x, $$5x);
               });
               if ($$15) {
                  return $$2;
               }

               if ($$2 < this.b($$0)) {
                  int $$16 = this.a($$0, $$10, $$2 + 1, $$9.g(), $$13, $$5, $$6, $$7);
                  if ($$16 < $$8) {
                     $$8 = $$16;
                  }
               }
            }
         }
      }

      return $$8;
   }

   private boolean a(dca $$0, eox $$1, jd $$2, dta $$3, jd $$4, dta $$5) {
      if (!this.a(ji.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(dca $$0, eox $$1, jd $$2, dta $$3, ji $$4, jd $$5, dta $$6, eoy $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(eoy $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(dcx var1);

   private int a(dcx $$0, jd $$1) {
      int $$2 = 0;

      for (ji $$3 : ji.c.a) {
         jd $$4 = $$1.a($$3);
         eoy $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<ji, eoy> b(dcu $$0, jd $$1, dta $$2) {
      int $$3 = 1000;
      Map<ji, eoy> $$4 = Maps.newEnumMap(ji.class);
      Short2ObjectMap<Pair<dta, eoy>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (ji $$7 : ji.c.a) {
         jd $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<dta, eoy> $$10 = (Pair<dta, eoy>)$$5.computeIfAbsent($$9, $$2x -> {
            dta $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         dta $$11 = (dta)$$10.getFirst();
         eoy $$12 = (eoy)$$10.getSecond();
         eoy $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            jd $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               dta $$5x = $$0.a_($$14);
               return this.a($$0, this.d(), $$8, $$11, $$14, $$5x);
            });
            int $$16;
            if ($$15) {
               $$16 = 0;
            } else {
               $$16 = this.a($$0, $$8, 1, $$7.g(), $$11, $$1, $$5, $$6);
            }

            if ($$16 < $$3) {
               $$4.clear();
            }

            if ($$16 <= $$3) {
               $$4.put($$7, $$13);
               $$3 = $$16;
            }
         }
      }

      return $$4;
   }

   private boolean a(dca $$0, jd $$1, dta $$2, eox $$3) {
      dfw $$4 = $$2.b();
      if ($$4 instanceof dkn $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof dic || $$2.a(awd.ax) || $$2.a(dfy.cO) || $$2.a(dfy.dS) || $$2.a(dfy.nd)) {
         return false;
      } else {
         return !$$2.a(dfy.ed) && !$$2.a(dfy.fx) && !$$2.a(dfy.kF) && !$$2.a(dfy.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(dca $$0, jd $$1, dta $$2, ji $$3, jd $$4, dta $$5, eoy $$6, eox $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(dcx var1);

   protected int a(dcu $$0, jd $$1, eoy $$2, eoy $$3) {
      return this.a((dcx)$$0);
   }

   @Override
   public void b(dcu $$0, jd $$1, eoy $$2) {
      if (!$$2.b()) {
         eoy $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, dfy.a.o(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            dta $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(eoy $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(eoy $$0, dca $$1, jd $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(eoy $$0, dca $$1, jd $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(eoy $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(eoy var1);

   @Override
   public exp b(eoy $$0, dca $$1, jd $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? exm.b() : this.g.computeIfAbsent($$0, $$2x -> exm.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
