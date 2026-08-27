import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class egu extends egv {
   public static final dma a = dlz.i;
   public static final dmj b = dlz.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<cys.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<cys.a> $$0 = new Object2ByteLinkedOpenHashMap<cys.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<egw, eos> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dlk.a<egv, egw> $$0) {
      $$0.a(a);
   }

   @Override
   public enz a(cux $$0, hz $$1, egw $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      hz.a $$5 = new hz.a();

      for (ie $$6 : ie.c.a) {
         $$5.a($$1, $$6);
         egw $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  hz $$10 = $$5.d();
                  egw $$11 = $$0.b_($$10);
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

      enz $$12 = new enz($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (ie $$13 : ie.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.c(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(egw $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(cux $$0, hz $$1, ie $$2) {
      dlj $$3 = $$0.a_($$1);
      egw $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == ie.b) {
         return true;
      } else {
         return $$3.b() instanceof dcp ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(cvr $$0, hz $$1, egw $$2) {
      if (!$$2.c()) {
         dlj $$3 = $$0.a_($$1);
         hz $$4 = $$1.d();
         dlj $$5 = $$0.a_($$4);
         egw $$6 = this.a($$0, $$4, $$5);
         if (this.a($$0, $$1, $$3, ie.a, $$4, $$5, $$0.b_($$4), $$6.a())) {
            this.a($$0, $$4, $$5, ie.a, $$6);
            if (this.a($$0, $$1) >= 3) {
               this.a($$0, $$1, $$2, $$3);
            }
         } else if ($$2.b() || !this.a($$0, $$6.a(), $$1, $$3, $$4, $$5)) {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(cvr $$0, hz $$1, egw $$2, dlj $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<ie, egw> $$5 = this.b($$0, $$1, $$3);

         for (Entry<ie, egw> $$6 : $$5.entrySet()) {
            ie $$7 = $$6.getKey();
            egw $$8 = $$6.getValue();
            hz $$9 = $$1.a($$7);
            dlj $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected egw a(cvr $$0, hz $$1, dlj $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (ie $$5 : ie.c.a) {
         hz $$6 = $$1.a($$5);
         dlj $$7 = $$0.a_($$6);
         egw $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         dlj $$9 = $$0.a_($$1.d());
         egw $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      hz $$11 = $$1.c();
      dlj $$12 = $$0.a_($$11);
      egw $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(ie.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? egx.a.g() : this.a($$14, false);
      }
   }

   private boolean a(ie $$0, cux $$1, hz $$2, dlj $$3, hz $$4, dlj $$5) {
      Object2ByteLinkedOpenHashMap<cys.a> $$7;
      if (!$$3.b().p() && !$$5.b().p()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      cys.a $$8;
      if ($$7 != null) {
         $$8 = new cys.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      eos $$11 = $$3.k($$1, $$2);
      eos $$12 = $$5.k($$1, $$4);
      boolean $$13 = !eop.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract egv d();

   public egw a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract egv e();

   public egw a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(cvr var1);

   protected void a(cvs $$0, hz $$1, dlj $$2, ie $$3, egw $$4) {
      if ($$2.b() instanceof ddi) {
         ((ddi)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(cvs var1, hz var2, dlj var3);

   private static short a(hz $$0, hz $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(cvu $$0, hz $$1, int $$2, ie $$3, dlj $$4, hz $$5, Short2ObjectMap<Pair<dlj, egw>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (ie $$9 : ie.c.a) {
         if ($$9 != $$3) {
            hz $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<dlj, egw> $$12 = (Pair<dlj, egw>)$$6.computeIfAbsent($$11, $$2x -> {
               dlj $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            dlj $$13 = (dlj)$$12.getFirst();
            egw $$14 = (egw)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  hz $$4x = $$10.d();
                  dlj $$5x = $$0.a_($$4x);
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

   private boolean a(cux $$0, egv $$1, hz $$2, dlj $$3, hz $$4, dlj $$5) {
      if (!this.a(ie.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(cux $$0, egv $$1, hz $$2, dlj $$3, ie $$4, hz $$5, dlj $$6, egw $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(egw $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(cvu var1);

   private int a(cvu $$0, hz $$1) {
      int $$2 = 0;

      for (ie $$3 : ie.c.a) {
         hz $$4 = $$1.a($$3);
         egw $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<ie, egw> b(cvr $$0, hz $$1, dlj $$2) {
      int $$3 = 1000;
      Map<ie, egw> $$4 = Maps.newEnumMap(ie.class);
      Short2ObjectMap<Pair<dlj, egw>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (ie $$7 : ie.c.a) {
         hz $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<dlj, egw> $$10 = (Pair<dlj, egw>)$$5.computeIfAbsent($$9, $$2x -> {
            dlj $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         dlj $$11 = (dlj)$$10.getFirst();
         egw $$12 = (egw)$$10.getSecond();
         egw $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            hz $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               dlj $$5x = $$0.a_($$14);
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

   private boolean a(cux $$0, hz $$1, dlj $$2, egv $$3) {
      cys $$4 = $$2.b();
      if ($$4 instanceof ddi $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof day || $$2.a(aua.aw) || $$2.a(cyu.cO) || $$2.a(cyu.dS) || $$2.a(cyu.nd)) {
         return false;
      } else {
         return !$$2.a(cyu.ed) && !$$2.a(cyu.fx) && !$$2.a(cyu.kF) && !$$2.a(cyu.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(cux $$0, hz $$1, dlj $$2, ie $$3, hz $$4, dlj $$5, egw $$6, egv $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(cvu var1);

   protected int a(cvr $$0, hz $$1, egw $$2, egw $$3) {
      return this.a((cvu)$$0);
   }

   @Override
   public void b(cvr $$0, hz $$1, egw $$2) {
      if (!$$2.b()) {
         egw $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, cyu.a.o(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            dlj $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(egw $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(egw $$0, cux $$1, hz $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(egw $$0, cux $$1, hz $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(egw $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(egw var1);

   @Override
   public eos b(egw $$0, cux $$1, hz $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? eop.b() : this.g.computeIfAbsent($$0, $$2x -> eop.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
