import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class ems extends emt {
   public static final drs a = drr.i;
   public static final dsb b = drr.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<ddy.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<ddy.a> $$0 = new Object2ByteLinkedOpenHashMap<ddy.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<emu, evd> g = Maps.newIdentityHashMap();

   @Override
   protected void a(drc.a<emt, emu> $$0) {
      $$0.a(a);
   }

   @Override
   public euk a(dad $$0, io $$1, emu $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      io.a $$5 = new io.a();

      for (it $$6 : it.c.a) {
         $$5.a($$1, $$6);
         emu $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  io $$10 = $$5.d();
                  emu $$11 = $$0.b_($$10);
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

      euk $$12 = new euk($$3, 0.0, $$4);
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

   private boolean g(emu $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(dad $$0, io $$1, it $$2) {
      drb $$3 = $$0.a_($$1);
      emu $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == it.b) {
         return true;
      } else {
         return $$3.b() instanceof dhw ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(dax $$0, io $$1, emu $$2) {
      if (!$$2.c()) {
         drb $$3 = $$0.a_($$1);
         io $$4 = $$1.d();
         drb $$5 = $$0.a_($$4);
         emu $$6 = this.a($$0, $$4, $$5);
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

   private void a(dax $$0, io $$1, emu $$2, drb $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<it, emu> $$5 = this.b($$0, $$1, $$3);

         for (Entry<it, emu> $$6 : $$5.entrySet()) {
            it $$7 = $$6.getKey();
            emu $$8 = $$6.getValue();
            io $$9 = $$1.a($$7);
            drb $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected emu a(dax $$0, io $$1, drb $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (it $$5 : it.c.a) {
         io $$6 = $$1.a($$5);
         drb $$7 = $$0.a_($$6);
         emu $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         drb $$9 = $$0.a_($$1.d());
         emu $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      io $$11 = $$1.c();
      drb $$12 = $$0.a_($$11);
      emu $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(it.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? emv.a.g() : this.a($$14, false);
      }
   }

   private boolean a(it $$0, dad $$1, io $$2, drb $$3, io $$4, drb $$5) {
      Object2ByteLinkedOpenHashMap<ddy.a> $$7;
      if (!$$3.b().o() && !$$5.b().o()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      ddy.a $$8;
      if ($$7 != null) {
         $$8 = new ddy.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      evd $$11 = $$3.k($$1, $$2);
      evd $$12 = $$5.k($$1, $$4);
      boolean $$13 = !eva.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract emt d();

   public emu a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract emt e();

   public emu a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(dax var1);

   protected void a(day $$0, io $$1, drb $$2, it $$3, emu $$4) {
      if ($$2.b() instanceof dip) {
         ((dip)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(day var1, io var2, drb var3);

   private static short a(io $$0, io $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(dba $$0, io $$1, int $$2, it $$3, drb $$4, io $$5, Short2ObjectMap<Pair<drb, emu>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (it $$9 : it.c.a) {
         if ($$9 != $$3) {
            io $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<drb, emu> $$12 = (Pair<drb, emu>)$$6.computeIfAbsent($$11, $$2x -> {
               drb $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            drb $$13 = (drb)$$12.getFirst();
            emu $$14 = (emu)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  io $$4x = $$10.d();
                  drb $$5x = $$0.a_($$4x);
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

   private boolean a(dad $$0, emt $$1, io $$2, drb $$3, io $$4, drb $$5) {
      if (!this.a(it.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(dad $$0, emt $$1, io $$2, drb $$3, it $$4, io $$5, drb $$6, emu $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(emu $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(dba var1);

   private int a(dba $$0, io $$1) {
      int $$2 = 0;

      for (it $$3 : it.c.a) {
         io $$4 = $$1.a($$3);
         emu $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<it, emu> b(dax $$0, io $$1, drb $$2) {
      int $$3 = 1000;
      Map<it, emu> $$4 = Maps.newEnumMap(it.class);
      Short2ObjectMap<Pair<drb, emu>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (it $$7 : it.c.a) {
         io $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<drb, emu> $$10 = (Pair<drb, emu>)$$5.computeIfAbsent($$9, $$2x -> {
            drb $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         drb $$11 = (drb)$$10.getFirst();
         emu $$12 = (emu)$$10.getSecond();
         emu $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            io $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               drb $$5x = $$0.a_($$14);
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

   private boolean a(dad $$0, io $$1, drb $$2, emt $$3) {
      ddy $$4 = $$2.b();
      if ($$4 instanceof dip $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof dge || $$2.a(avw.ax) || $$2.a(dea.cO) || $$2.a(dea.dS) || $$2.a(dea.nd)) {
         return false;
      } else {
         return !$$2.a(dea.ed) && !$$2.a(dea.fx) && !$$2.a(dea.kF) && !$$2.a(dea.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(dad $$0, io $$1, drb $$2, it $$3, io $$4, drb $$5, emu $$6, emt $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(dba var1);

   protected int a(dax $$0, io $$1, emu $$2, emu $$3) {
      return this.a((dba)$$0);
   }

   @Override
   public void b(dax $$0, io $$1, emu $$2) {
      if (!$$2.b()) {
         emu $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, dea.a.n(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            drb $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(emu $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(emu $$0, dad $$1, io $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(emu $$0, dad $$1, io $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(emu $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(emu var1);

   @Override
   public evd b(emu $$0, dad $$1, io $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? eva.b() : this.g.computeIfAbsent($$0, $$2x -> eva.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
