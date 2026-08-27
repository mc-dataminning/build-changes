import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class emu extends emv {
   public static final dru a = drt.i;
   public static final dsd b = drt.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dea.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dea.a> $$0 = new Object2ByteLinkedOpenHashMap<dea.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<emw, evf> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dre.a<emv, emw> $$0) {
      $$0.a(a);
   }

   @Override
   public eum a(daf $$0, io $$1, emw $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      io.a $$5 = new io.a();

      for (it $$6 : it.c.a) {
         $$5.a($$1, $$6);
         emw $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  io $$10 = $$5.d();
                  emw $$11 = $$0.b_($$10);
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

      eum $$12 = new eum($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (it $$13 : it.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.c(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(emw $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(daf $$0, io $$1, it $$2) {
      drd $$3 = $$0.a_($$1);
      emw $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == it.b) {
         return true;
      } else {
         return $$3.b() instanceof dhy ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(daz $$0, io $$1, emw $$2) {
      if (!$$2.c()) {
         drd $$3 = $$0.a_($$1);
         io $$4 = $$1.d();
         drd $$5 = $$0.a_($$4);
         emw $$6 = this.a($$0, $$4, $$5);
         if (this.a($$0, $$1, $$3, it.a, $$4, $$5, $$0.b_($$4), $$6.a())) {
            this.a($$0, $$4, $$5, it.a, $$6);
            if (this.a($$0, $$1) >= 3) {
               this.a($$0, $$1, $$2, $$3);
            }
         } else if ($$2.b() || !this.a($$0, $$6.a(), $$1, $$3, $$4, $$5)) {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(daz $$0, io $$1, emw $$2, drd $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<it, emw> $$5 = this.b($$0, $$1, $$3);

         for (Entry<it, emw> $$6 : $$5.entrySet()) {
            it $$7 = $$6.getKey();
            emw $$8 = $$6.getValue();
            io $$9 = $$1.a($$7);
            drd $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected emw a(daz $$0, io $$1, drd $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (it $$5 : it.c.a) {
         io $$6 = $$1.a($$5);
         drd $$7 = $$0.a_($$6);
         emw $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         drd $$9 = $$0.a_($$1.d());
         emw $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      io $$11 = $$1.c();
      drd $$12 = $$0.a_($$11);
      emw $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(it.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? emx.a.g() : this.a($$14, false);
      }
   }

   private boolean a(it $$0, daf $$1, io $$2, drd $$3, io $$4, drd $$5) {
      Object2ByteLinkedOpenHashMap<dea.a> $$7;
      if (!$$3.b().o() && !$$5.b().o()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      dea.a $$8;
      if ($$7 != null) {
         $$8 = new dea.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      evf $$11 = $$3.k($$1, $$2);
      evf $$12 = $$5.k($$1, $$4);
      boolean $$13 = !evc.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract emv d();

   public emw a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract emv e();

   public emw a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(daz var1);

   protected void a(dba $$0, io $$1, drd $$2, it $$3, emw $$4) {
      if ($$2.b() instanceof dir) {
         ((dir)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(dba var1, io var2, drd var3);

   private static short a(io $$0, io $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(dbc $$0, io $$1, int $$2, it $$3, drd $$4, io $$5, Short2ObjectMap<Pair<drd, emw>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (it $$9 : it.c.a) {
         if ($$9 != $$3) {
            io $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<drd, emw> $$12 = (Pair<drd, emw>)$$6.computeIfAbsent($$11, $$2x -> {
               drd $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            drd $$13 = (drd)$$12.getFirst();
            emw $$14 = (emw)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  io $$4x = $$10.d();
                  drd $$5x = $$0.a_($$4x);
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

   private boolean a(daf $$0, emv $$1, io $$2, drd $$3, io $$4, drd $$5) {
      if (!this.a(it.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(daf $$0, emv $$1, io $$2, drd $$3, it $$4, io $$5, drd $$6, emw $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(emw $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(dbc var1);

   private int a(dbc $$0, io $$1) {
      int $$2 = 0;

      for (it $$3 : it.c.a) {
         io $$4 = $$1.a($$3);
         emw $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<it, emw> b(daz $$0, io $$1, drd $$2) {
      int $$3 = 1000;
      Map<it, emw> $$4 = Maps.newEnumMap(it.class);
      Short2ObjectMap<Pair<drd, emw>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (it $$7 : it.c.a) {
         io $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<drd, emw> $$10 = (Pair<drd, emw>)$$5.computeIfAbsent($$9, $$2x -> {
            drd $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         drd $$11 = (drd)$$10.getFirst();
         emw $$12 = (emw)$$10.getSecond();
         emw $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            io $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               drd $$5x = $$0.a_($$14);
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

   private boolean a(daf $$0, io $$1, drd $$2, emv $$3) {
      dea $$4 = $$2.b();
      if ($$4 instanceof dir $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof dgg || $$2.a(avx.ax) || $$2.a(dec.cO) || $$2.a(dec.dS) || $$2.a(dec.nd)) {
         return false;
      } else {
         return !$$2.a(dec.ed) && !$$2.a(dec.fx) && !$$2.a(dec.kF) && !$$2.a(dec.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(daf $$0, io $$1, drd $$2, it $$3, io $$4, drd $$5, emw $$6, emv $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(dbc var1);

   protected int a(daz $$0, io $$1, emw $$2, emw $$3) {
      return this.a((dbc)$$0);
   }

   @Override
   public void b(daz $$0, io $$1, emw $$2) {
      if (!$$2.b()) {
         emw $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, dec.a.n(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            drd $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(emw $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(emw $$0, daf $$1, io $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(emw $$0, daf $$1, io $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(emw $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(emw var1);

   @Override
   public evf b(emw $$0, daf $$1, io $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? evc.b() : this.g.computeIfAbsent($$0, $$2x -> evc.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
