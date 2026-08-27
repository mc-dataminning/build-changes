import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class ece extends ecf {
   public static final dhn a = dhm.i;
   public static final dhw b = dhm.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<cut.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<cut.a> $$0 = new Object2ByteLinkedOpenHashMap<cut.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<ecg, ekb> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dgx.a<ecf, ecg> $$0) {
      $$0.a(a);
   }

   @Override
   public eji a(cqy $$0, ht $$1, ecg $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      ht.a $$5 = new ht.a();

      for (hx $$6 : hx.c.a) {
         $$5.a($$1, $$6);
         ecg $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  ht $$10 = $$5.d();
                  ecg $$11 = $$0.b_($$10);
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

      eji $$12 = new eji($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (hx $$13 : hx.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.c(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(ecg $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(cqy $$0, ht $$1, hx $$2) {
      dgw $$3 = $$0.a_($$1);
      ecg $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == hx.b) {
         return true;
      } else {
         return $$3.b() instanceof cyq ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(crs $$0, ht $$1, ecg $$2) {
      if (!$$2.c()) {
         dgw $$3 = $$0.a_($$1);
         ht $$4 = $$1.d();
         dgw $$5 = $$0.a_($$4);
         ecg $$6 = this.a($$0, $$4, $$5);
         if (this.a($$0, $$1, $$3, hx.a, $$4, $$5, $$0.b_($$4), $$6.a())) {
            this.a($$0, $$4, $$5, hx.a, $$6);
            if (this.a($$0, $$1) >= 3) {
               this.a($$0, $$1, $$2, $$3);
            }
         } else if ($$2.b() || !this.a($$0, $$6.a(), $$1, $$3, $$4, $$5)) {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(crs $$0, ht $$1, ecg $$2, dgw $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<hx, ecg> $$5 = this.b($$0, $$1, $$3);

         for (Entry<hx, ecg> $$6 : $$5.entrySet()) {
            hx $$7 = $$6.getKey();
            ecg $$8 = $$6.getValue();
            ht $$9 = $$1.a($$7);
            dgw $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected ecg a(crs $$0, ht $$1, dgw $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (hx $$5 : hx.c.a) {
         ht $$6 = $$1.a($$5);
         dgw $$7 = $$0.a_($$6);
         ecg $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         dgw $$9 = $$0.a_($$1.d());
         ecg $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      ht $$11 = $$1.c();
      dgw $$12 = $$0.a_($$11);
      ecg $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(hx.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? ech.a.g() : this.a($$14, false);
      }
   }

   private boolean a(hx $$0, cqy $$1, ht $$2, dgw $$3, ht $$4, dgw $$5) {
      Object2ByteLinkedOpenHashMap<cut.a> $$7;
      if (!$$3.b().p() && !$$5.b().p()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      cut.a $$8;
      if ($$7 != null) {
         $$8 = new cut.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      ekb $$11 = $$3.k($$1, $$2);
      ekb $$12 = $$5.k($$1, $$4);
      boolean $$13 = !ejy.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract ecf d();

   public ecg a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract ecf e();

   public ecg a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(crs var1);

   protected void a(crt $$0, ht $$1, dgw $$2, hx $$3, ecg $$4) {
      if ($$2.b() instanceof czj) {
         ((czj)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(crt var1, ht var2, dgw var3);

   private static short a(ht $$0, ht $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(crv $$0, ht $$1, int $$2, hx $$3, dgw $$4, ht $$5, Short2ObjectMap<Pair<dgw, ecg>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (hx $$9 : hx.c.a) {
         if ($$9 != $$3) {
            ht $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<dgw, ecg> $$12 = (Pair<dgw, ecg>)$$6.computeIfAbsent($$11, $$2x -> {
               dgw $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            dgw $$13 = (dgw)$$12.getFirst();
            ecg $$14 = (ecg)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  ht $$4x = $$10.d();
                  dgw $$5x = $$0.a_($$4x);
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

   private boolean a(cqy $$0, ecf $$1, ht $$2, dgw $$3, ht $$4, dgw $$5) {
      if (!this.a(hx.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(cqy $$0, ecf $$1, ht $$2, dgw $$3, hx $$4, ht $$5, dgw $$6, ecg $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(ecg $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(crv var1);

   private int a(crv $$0, ht $$1) {
      int $$2 = 0;

      for (hx $$3 : hx.c.a) {
         ht $$4 = $$1.a($$3);
         ecg $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<hx, ecg> b(crs $$0, ht $$1, dgw $$2) {
      int $$3 = 1000;
      Map<hx, ecg> $$4 = Maps.newEnumMap(hx.class);
      Short2ObjectMap<Pair<dgw, ecg>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (hx $$7 : hx.c.a) {
         ht $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<dgw, ecg> $$10 = (Pair<dgw, ecg>)$$5.computeIfAbsent($$9, $$2x -> {
            dgw $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         dgw $$11 = (dgw)$$10.getFirst();
         ecg $$12 = (ecg)$$10.getSecond();
         ecg $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            ht $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               dgw $$5x = $$0.a_($$14);
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

   private boolean a(cqy $$0, ht $$1, dgw $$2, ecf $$3) {
      cut $$4 = $$2.b();
      if ($$4 instanceof czj $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof cwy || $$2.a(arc.aw) || $$2.a(cuv.cO) || $$2.a(cuv.dS) || $$2.a(cuv.nd)) {
         return false;
      } else {
         return !$$2.a(cuv.ed) && !$$2.a(cuv.fx) && !$$2.a(cuv.kF) && !$$2.a(cuv.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(cqy $$0, ht $$1, dgw $$2, hx $$3, ht $$4, dgw $$5, ecg $$6, ecf $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(crv var1);

   protected int a(crs $$0, ht $$1, ecg $$2, ecg $$3) {
      return this.a((crv)$$0);
   }

   @Override
   public void b(crs $$0, ht $$1, ecg $$2) {
      if (!$$2.b()) {
         ecg $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, cuv.a.o(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            dgw $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(ecg $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(ecg $$0, cqy $$1, ht $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(ecg $$0, cqy $$1, ht $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(ecg $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(ecg var1);

   @Override
   public ekb b(ecg $$0, cqy $$1, ht $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? ejy.b() : this.g.computeIfAbsent($$0, $$2x -> ejy.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
