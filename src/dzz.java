import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class dzz extends eaa {
   public static final dfp a = dfo.i;
   public static final dfy b = dfo.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<csk.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<csk.a> $$0 = new Object2ByteLinkedOpenHashMap<csk.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<eab, ehy> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dez.a<eaa, eab> $$0) {
      $$0.a(a);
   }

   @Override
   public ehf a(coq $$0, gv $$1, eab $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      gv.a $$5 = new gv.a();

      for (hb $$6 : hb.c.a) {
         $$5.a($$1, $$6);
         eab $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  gv $$10 = $$5.d();
                  eab $$11 = $$0.b_($$10);
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

      ehf $$12 = new ehf($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (hb $$13 : hb.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.c(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(eab $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(coq $$0, gv $$1, hb $$2) {
      dey $$3 = $$0.a_($$1);
      eab $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == hb.b) {
         return true;
      } else {
         return $$3.b() instanceof cwf ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(cpk $$0, gv $$1, eab $$2) {
      if (!$$2.c()) {
         dey $$3 = $$0.a_($$1);
         gv $$4 = $$1.d();
         dey $$5 = $$0.a_($$4);
         eab $$6 = this.a($$0, $$4, $$5);
         if (this.a($$0, $$1, $$3, hb.a, $$4, $$5, $$0.b_($$4), $$6.a())) {
            this.a($$0, $$4, $$5, hb.a, $$6);
            if (this.a($$0, $$1) >= 3) {
               this.a($$0, $$1, $$2, $$3);
            }
         } else if ($$2.b() || !this.a($$0, $$6.a(), $$1, $$3, $$4, $$5)) {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(cpk $$0, gv $$1, eab $$2, dey $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<hb, eab> $$5 = this.b($$0, $$1, $$3);

         for (Entry<hb, eab> $$6 : $$5.entrySet()) {
            hb $$7 = $$6.getKey();
            eab $$8 = $$6.getValue();
            gv $$9 = $$1.a($$7);
            dey $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected eab a(cpk $$0, gv $$1, dey $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (hb $$5 : hb.c.a) {
         gv $$6 = $$1.a($$5);
         dey $$7 = $$0.a_($$6);
         eab $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         dey $$9 = $$0.a_($$1.d());
         eab $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      gv $$11 = $$1.c();
      dey $$12 = $$0.a_($$11);
      eab $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(hb.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? eac.a.g() : this.a($$14, false);
      }
   }

   private boolean a(hb $$0, coq $$1, gv $$2, dey $$3, gv $$4, dey $$5) {
      Object2ByteLinkedOpenHashMap<csk.a> $$7;
      if (!$$3.b().o() && !$$5.b().o()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      csk.a $$8;
      if ($$7 != null) {
         $$8 = new csk.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      ehy $$11 = $$3.k($$1, $$2);
      ehy $$12 = $$5.k($$1, $$4);
      boolean $$13 = !ehv.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract eaa d();

   public eab a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract eaa e();

   public eab a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(cpk var1);

   protected void a(cpl $$0, gv $$1, dey $$2, hb $$3, eab $$4) {
      if ($$2.b() instanceof cwy) {
         ((cwy)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(cpl var1, gv var2, dey var3);

   private static short a(gv $$0, gv $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(cpn $$0, gv $$1, int $$2, hb $$3, dey $$4, gv $$5, Short2ObjectMap<Pair<dey, eab>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (hb $$9 : hb.c.a) {
         if ($$9 != $$3) {
            gv $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<dey, eab> $$12 = (Pair<dey, eab>)$$6.computeIfAbsent($$11, $$2x -> {
               dey $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            dey $$13 = (dey)$$12.getFirst();
            eab $$14 = (eab)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  gv $$4x = $$10.d();
                  dey $$5x = $$0.a_($$4x);
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

   private boolean a(coq $$0, eaa $$1, gv $$2, dey $$3, gv $$4, dey $$5) {
      if (!this.a(hb.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(coq $$0, eaa $$1, gv $$2, dey $$3, hb $$4, gv $$5, dey $$6, eab $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(eab $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(cpn var1);

   private int a(cpn $$0, gv $$1) {
      int $$2 = 0;

      for (hb $$3 : hb.c.a) {
         gv $$4 = $$1.a($$3);
         eab $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<hb, eab> b(cpk $$0, gv $$1, dey $$2) {
      int $$3 = 1000;
      Map<hb, eab> $$4 = Maps.newEnumMap(hb.class);
      Short2ObjectMap<Pair<dey, eab>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (hb $$7 : hb.c.a) {
         gv $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<dey, eab> $$10 = (Pair<dey, eab>)$$5.computeIfAbsent($$9, $$2x -> {
            dey $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         dey $$11 = (dey)$$10.getFirst();
         eab $$12 = (eab)$$10.getSecond();
         eab $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            gv $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               dey $$5x = $$0.a_($$14);
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

   private boolean a(coq $$0, gv $$1, dey $$2, eaa $$3) {
      csk $$4 = $$2.b();
      if ($$4 instanceof cwy $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof cum || $$2.a(apj.aw) || $$2.a(csl.cO) || $$2.a(csl.dS) || $$2.a(csl.nd)) {
         return false;
      } else {
         return !$$2.a(csl.ee) && !$$2.a(csl.fx) && !$$2.a(csl.kF) && !$$2.a(csl.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(coq $$0, gv $$1, dey $$2, hb $$3, gv $$4, dey $$5, eab $$6, eaa $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(cpn var1);

   protected int a(cpk $$0, gv $$1, eab $$2, eab $$3) {
      return this.a((cpn)$$0);
   }

   @Override
   public void b(cpk $$0, gv $$1, eab $$2) {
      if (!$$2.b()) {
         eab $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, csl.a.n(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            dey $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(eab $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(eab $$0, coq $$1, gv $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(eab $$0, coq $$1, gv $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(eab $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(eab var1);

   @Override
   public ehy b(eab $$0, coq $$1, gv $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? ehv.b() : this.g.computeIfAbsent($$0, $$2x -> ehv.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
