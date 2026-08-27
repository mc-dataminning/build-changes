import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class elp extends elq {
   public static final dqp a = dqo.i;
   public static final dqy b = dqo.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dcv.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dcv.a> $$0 = new Object2ByteLinkedOpenHashMap<dcv.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<elr, ety> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dpz.a<elq, elr> $$0) {
      $$0.a(a);
   }

   @Override
   public etf a(cza $$0, im $$1, elr $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      im.a $$5 = new im.a();

      for (ir $$6 : ir.c.a) {
         $$5.a($$1, $$6);
         elr $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  im $$10 = $$5.d();
                  elr $$11 = $$0.b_($$10);
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

      etf $$12 = new etf($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (ir $$13 : ir.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.c(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(elr $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(cza $$0, im $$1, ir $$2) {
      dpy $$3 = $$0.a_($$1);
      elr $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == ir.b) {
         return true;
      } else {
         return $$3.b() instanceof dgt ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(czu $$0, im $$1, elr $$2) {
      if (!$$2.c()) {
         dpy $$3 = $$0.a_($$1);
         im $$4 = $$1.d();
         dpy $$5 = $$0.a_($$4);
         elr $$6 = this.a($$0, $$4, $$5);
         if (this.a($$0, $$1, $$3, ir.a, $$4, $$5, $$0.b_($$4), $$6.a())) {
            this.a($$0, $$4, $$5, ir.a, $$6);
            if (this.a($$0, $$1) >= 3) {
               this.a($$0, $$1, $$2, $$3);
            }
         } else if ($$2.b() || !this.a($$0, $$6.a(), $$1, $$3, $$4, $$5)) {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(czu $$0, im $$1, elr $$2, dpy $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<ir, elr> $$5 = this.b($$0, $$1, $$3);

         for (Entry<ir, elr> $$6 : $$5.entrySet()) {
            ir $$7 = $$6.getKey();
            elr $$8 = $$6.getValue();
            im $$9 = $$1.a($$7);
            dpy $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected elr a(czu $$0, im $$1, dpy $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (ir $$5 : ir.c.a) {
         im $$6 = $$1.a($$5);
         dpy $$7 = $$0.a_($$6);
         elr $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         dpy $$9 = $$0.a_($$1.d());
         elr $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      im $$11 = $$1.c();
      dpy $$12 = $$0.a_($$11);
      elr $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(ir.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? els.a.g() : this.a($$14, false);
      }
   }

   private boolean a(ir $$0, cza $$1, im $$2, dpy $$3, im $$4, dpy $$5) {
      Object2ByteLinkedOpenHashMap<dcv.a> $$7;
      if (!$$3.b().o() && !$$5.b().o()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      dcv.a $$8;
      if ($$7 != null) {
         $$8 = new dcv.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      ety $$11 = $$3.k($$1, $$2);
      ety $$12 = $$5.k($$1, $$4);
      boolean $$13 = !etv.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract elq d();

   public elr a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract elq e();

   public elr a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(czu var1);

   protected void a(czv $$0, im $$1, dpy $$2, ir $$3, elr $$4) {
      if ($$2.b() instanceof dhm) {
         ((dhm)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(czv var1, im var2, dpy var3);

   private static short a(im $$0, im $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(czx $$0, im $$1, int $$2, ir $$3, dpy $$4, im $$5, Short2ObjectMap<Pair<dpy, elr>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (ir $$9 : ir.c.a) {
         if ($$9 != $$3) {
            im $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<dpy, elr> $$12 = (Pair<dpy, elr>)$$6.computeIfAbsent($$11, $$2x -> {
               dpy $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            dpy $$13 = (dpy)$$12.getFirst();
            elr $$14 = (elr)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  im $$4x = $$10.d();
                  dpy $$5x = $$0.a_($$4x);
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

   private boolean a(cza $$0, elq $$1, im $$2, dpy $$3, im $$4, dpy $$5) {
      if (!this.a(ir.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(cza $$0, elq $$1, im $$2, dpy $$3, ir $$4, im $$5, dpy $$6, elr $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(elr $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(czx var1);

   private int a(czx $$0, im $$1) {
      int $$2 = 0;

      for (ir $$3 : ir.c.a) {
         im $$4 = $$1.a($$3);
         elr $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<ir, elr> b(czu $$0, im $$1, dpy $$2) {
      int $$3 = 1000;
      Map<ir, elr> $$4 = Maps.newEnumMap(ir.class);
      Short2ObjectMap<Pair<dpy, elr>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (ir $$7 : ir.c.a) {
         im $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<dpy, elr> $$10 = (Pair<dpy, elr>)$$5.computeIfAbsent($$9, $$2x -> {
            dpy $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         dpy $$11 = (dpy)$$10.getFirst();
         elr $$12 = (elr)$$10.getSecond();
         elr $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            im $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               dpy $$5x = $$0.a_($$14);
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

   private boolean a(cza $$0, im $$1, dpy $$2, elq $$3) {
      dcv $$4 = $$2.b();
      if ($$4 instanceof dhm $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof dfb || $$2.a(avo.ax) || $$2.a(dcx.cO) || $$2.a(dcx.dS) || $$2.a(dcx.nd)) {
         return false;
      } else {
         return !$$2.a(dcx.ed) && !$$2.a(dcx.fx) && !$$2.a(dcx.kF) && !$$2.a(dcx.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(cza $$0, im $$1, dpy $$2, ir $$3, im $$4, dpy $$5, elr $$6, elq $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(czx var1);

   protected int a(czu $$0, im $$1, elr $$2, elr $$3) {
      return this.a((czx)$$0);
   }

   @Override
   public void b(czu $$0, im $$1, elr $$2) {
      if (!$$2.b()) {
         elr $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, dcx.a.n(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            dpy $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(elr $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(elr $$0, cza $$1, im $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(elr $$0, cza $$1, im $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(elr $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(elr var1);

   @Override
   public ety b(elr $$0, cza $$1, im $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? etv.b() : this.g.computeIfAbsent($$0, $$2x -> etv.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
