import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class epc extends epd {
   public static final dtt a = dts.i;
   public static final duc b = dts.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dfc.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dfc.a> $$0 = new Object2ByteLinkedOpenHashMap<dfc.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<epe, exn> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dtd.a<epd, epe> $$0) {
      $$0.a(a);
   }

   @Override
   public ewu a(dbg $$0, ir $$1, epe $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      ir.a $$5 = new ir.a();

      for (iw $$6 : iw.c.a) {
         $$5.a($$1, $$6);
         epe $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  ir $$10 = $$5.d();
                  epe $$11 = $$0.b_($$10);
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

      ewu $$12 = new ewu($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (iw $$13 : iw.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.c(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(epe $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(dbg $$0, ir $$1, iw $$2) {
      dtc $$3 = $$0.a_($$1);
      epe $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == iw.b) {
         return true;
      } else {
         return $$3.b() instanceof dje ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(dca $$0, ir $$1, epe $$2) {
      if (!$$2.c()) {
         dtc $$3 = $$0.a_($$1);
         ir $$4 = $$1.d();
         dtc $$5 = $$0.a_($$4);
         epe $$6 = this.a($$0, $$4, $$5);
         if (this.a($$0, $$1, $$3, iw.a, $$4, $$5, $$0.b_($$4), $$6.a())) {
            this.a($$0, $$4, $$5, iw.a, $$6);
            if (this.a($$0, $$1) >= 3) {
               this.a($$0, $$1, $$2, $$3);
            }
         } else if ($$2.b() || !this.a($$0, $$6.a(), $$1, $$3, $$4, $$5)) {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(dca $$0, ir $$1, epe $$2, dtc $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<iw, epe> $$5 = this.b($$0, $$1, $$3);

         for (Entry<iw, epe> $$6 : $$5.entrySet()) {
            iw $$7 = $$6.getKey();
            epe $$8 = $$6.getValue();
            ir $$9 = $$1.a($$7);
            dtc $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected epe a(dca $$0, ir $$1, dtc $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (iw $$5 : iw.c.a) {
         ir $$6 = $$1.a($$5);
         dtc $$7 = $$0.a_($$6);
         epe $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         dtc $$9 = $$0.a_($$1.d());
         epe $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      ir $$11 = $$1.c();
      dtc $$12 = $$0.a_($$11);
      epe $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(iw.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? epf.a.g() : this.a($$14, false);
      }
   }

   private boolean a(iw $$0, dbg $$1, ir $$2, dtc $$3, ir $$4, dtc $$5) {
      Object2ByteLinkedOpenHashMap<dfc.a> $$7;
      if (!$$3.b().o() && !$$5.b().o()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      dfc.a $$8;
      if ($$7 != null) {
         $$8 = new dfc.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      exn $$11 = $$3.k($$1, $$2);
      exn $$12 = $$5.k($$1, $$4);
      boolean $$13 = !exk.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract epd d();

   public epe a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract epd e();

   public epe a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(dca var1);

   protected void a(dcb $$0, ir $$1, dtc $$2, iw $$3, epe $$4) {
      if ($$2.b() instanceof djx) {
         ((djx)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(dcb var1, ir var2, dtc var3);

   private static short a(ir $$0, ir $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(dcd $$0, ir $$1, int $$2, iw $$3, dtc $$4, ir $$5, Short2ObjectMap<Pair<dtc, epe>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (iw $$9 : iw.c.a) {
         if ($$9 != $$3) {
            ir $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<dtc, epe> $$12 = (Pair<dtc, epe>)$$6.computeIfAbsent($$11, $$2x -> {
               dtc $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            dtc $$13 = (dtc)$$12.getFirst();
            epe $$14 = (epe)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  ir $$4x = $$10.d();
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

   private boolean a(dbg $$0, epd $$1, ir $$2, dtc $$3, ir $$4, dtc $$5) {
      if (!this.a(iw.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(dbg $$0, epd $$1, ir $$2, dtc $$3, iw $$4, ir $$5, dtc $$6, epe $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(epe $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(dcd var1);

   private int a(dcd $$0, ir $$1) {
      int $$2 = 0;

      for (iw $$3 : iw.c.a) {
         ir $$4 = $$1.a($$3);
         epe $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<iw, epe> b(dca $$0, ir $$1, dtc $$2) {
      int $$3 = 1000;
      Map<iw, epe> $$4 = Maps.newEnumMap(iw.class);
      Short2ObjectMap<Pair<dtc, epe>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (iw $$7 : iw.c.a) {
         ir $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<dtc, epe> $$10 = (Pair<dtc, epe>)$$5.computeIfAbsent($$9, $$2x -> {
            dtc $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         dtc $$11 = (dtc)$$10.getFirst();
         epe $$12 = (epe)$$10.getSecond();
         epe $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            ir $$14 = $$8.d();
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

   private boolean a(dbg $$0, ir $$1, dtc $$2, epd $$3) {
      dfc $$4 = $$2.b();
      if ($$4 instanceof djx $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof dhj || $$2.a(awe.ay) || $$2.a(dfe.dA) || $$2.a(dfe.eG) || $$2.a(dfe.ob)) {
         return false;
      } else {
         return !$$2.a(dfe.eR) && !$$2.a(dfe.gp) && !$$2.a(dfe.lD) && !$$2.a(dfe.lL) && !$$2.a(dfe.eS) ? !$$2.d() : false;
      }
   }

   protected boolean a(dbg $$0, ir $$1, dtc $$2, iw $$3, ir $$4, dtc $$5, epe $$6, epd $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(dcd var1);

   protected int a(dca $$0, ir $$1, epe $$2, epe $$3) {
      return this.a((dcd)$$0);
   }

   @Override
   public void b(dca $$0, ir $$1, epe $$2) {
      if (!$$2.b()) {
         epe $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, dfe.a.n(), 3);
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

   protected static int e(epe $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(epe $$0, dbg $$1, ir $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(epe $$0, dbg $$1, ir $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(epe $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(epe var1);

   @Override
   public exn b(epe $$0, dbg $$1, ir $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? exk.b() : this.g.computeIfAbsent($$0, $$2x -> exk.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
