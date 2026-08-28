import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class epa extends epb {
   public static final dtt a = dts.i;
   public static final duc b = dts.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dfy.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dfy.a> $$0 = new Object2ByteLinkedOpenHashMap<dfy.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<epc, ext> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dtd.a<epb, epc> $$0) {
      $$0.a(a);
   }

   @Override
   public exa a(dcc $$0, jd $$1, epc $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      jd.a $$5 = new jd.a();

      for (ji $$6 : ji.c.a) {
         $$5.a($$1, $$6);
         epc $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  jd $$10 = $$5.e();
                  epc $$11 = $$0.b_($$10);
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

      exa $$12 = new exa($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (ji $$13 : ji.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.d(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(epc $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(dcc $$0, jd $$1, ji $$2) {
      dtc $$3 = $$0.a_($$1);
      epc $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == ji.b) {
         return true;
      } else {
         return $$3.b() instanceof djw ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(dcw $$0, jd $$1, epc $$2) {
      if (!$$2.c()) {
         dtc $$3 = $$0.a_($$1);
         jd $$4 = $$1.e();
         dtc $$5 = $$0.a_($$4);
         epc $$6 = this.a($$0, $$4, $$5);
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

   private void a(dcw $$0, jd $$1, epc $$2, dtc $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<ji, epc> $$5 = this.b($$0, $$1, $$3);

         for (Entry<ji, epc> $$6 : $$5.entrySet()) {
            ji $$7 = $$6.getKey();
            epc $$8 = $$6.getValue();
            jd $$9 = $$1.a($$7);
            dtc $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected epc a(dcw $$0, jd $$1, dtc $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (ji $$5 : ji.c.a) {
         jd $$6 = $$1.a($$5);
         dtc $$7 = $$0.a_($$6);
         epc $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         dtc $$9 = $$0.a_($$1.e());
         epc $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      jd $$11 = $$1.d();
      dtc $$12 = $$0.a_($$11);
      epc $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(ji.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? epd.a.g() : this.a($$14, false);
      }
   }

   private boolean a(ji $$0, dcc $$1, jd $$2, dtc $$3, jd $$4, dtc $$5) {
      Object2ByteLinkedOpenHashMap<dfy.a> $$7;
      if (!$$3.b().p() && !$$5.b().p()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      dfy.a $$8;
      if ($$7 != null) {
         $$8 = new dfy.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      ext $$11 = $$3.k($$1, $$2);
      ext $$12 = $$5.k($$1, $$4);
      boolean $$13 = !exq.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract epb d();

   public epc a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract epb e();

   public epc a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(dcw var1);

   protected void a(dcx $$0, jd $$1, dtc $$2, ji $$3, epc $$4) {
      if ($$2.b() instanceof dkp) {
         ((dkp)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(dcx var1, jd var2, dtc var3);

   private static short a(jd $$0, jd $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(dcz $$0, jd $$1, int $$2, ji $$3, dtc $$4, jd $$5, Short2ObjectMap<Pair<dtc, epc>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (ji $$9 : ji.c.a) {
         if ($$9 != $$3) {
            jd $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<dtc, epc> $$12 = (Pair<dtc, epc>)$$6.computeIfAbsent($$11, $$2x -> {
               dtc $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            dtc $$13 = (dtc)$$12.getFirst();
            epc $$14 = (epc)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  jd $$4x = $$10.e();
                  dtc $$5x = $$0.a_($$4x);
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

   private boolean a(dcc $$0, epb $$1, jd $$2, dtc $$3, jd $$4, dtc $$5) {
      if (!this.a(ji.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(dcc $$0, epb $$1, jd $$2, dtc $$3, ji $$4, jd $$5, dtc $$6, epc $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(epc $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(dcz var1);

   private int a(dcz $$0, jd $$1) {
      int $$2 = 0;

      for (ji $$3 : ji.c.a) {
         jd $$4 = $$1.a($$3);
         epc $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<ji, epc> b(dcw $$0, jd $$1, dtc $$2) {
      int $$3 = 1000;
      Map<ji, epc> $$4 = Maps.newEnumMap(ji.class);
      Short2ObjectMap<Pair<dtc, epc>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (ji $$7 : ji.c.a) {
         jd $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<dtc, epc> $$10 = (Pair<dtc, epc>)$$5.computeIfAbsent($$9, $$2x -> {
            dtc $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         dtc $$11 = (dtc)$$10.getFirst();
         epc $$12 = (epc)$$10.getSecond();
         epc $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            jd $$14 = $$8.e();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               dtc $$5x = $$0.a_($$14);
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

   private boolean a(dcc $$0, jd $$1, dtc $$2, epb $$3) {
      dfy $$4 = $$2.b();
      if ($$4 instanceof dkp $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof die || $$2.a(awe.ax) || $$2.a(dga.cO) || $$2.a(dga.dS) || $$2.a(dga.nd)) {
         return false;
      } else {
         return !$$2.a(dga.ed) && !$$2.a(dga.fx) && !$$2.a(dga.kF) && !$$2.a(dga.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(dcc $$0, jd $$1, dtc $$2, ji $$3, jd $$4, dtc $$5, epc $$6, epb $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(dcz var1);

   protected int a(dcw $$0, jd $$1, epc $$2, epc $$3) {
      return this.a((dcz)$$0);
   }

   @Override
   public void b(dcw $$0, jd $$1, epc $$2) {
      if (!$$2.b()) {
         epc $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, dga.a.o(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            dtc $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(epc $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(epc $$0, dcc $$1, jd $$2) {
      return $$0.a().a($$1.b_($$2.d()).a());
   }

   @Override
   public float a(epc $$0, dcc $$1, jd $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(epc $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(epc var1);

   @Override
   public ext b(epc $$0, dcc $$1, jd $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? exq.b() : this.g.computeIfAbsent($$0, $$2x -> exq.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
