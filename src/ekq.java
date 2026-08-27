import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class ekq extends ekr {
   public static final dpq a = dpp.i;
   public static final dpz b = dpp.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dby.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dby.a> $$0 = new Object2ByteLinkedOpenHashMap<dby.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<eks, est> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dpa.a<ekr, eks> $$0) {
      $$0.a(a);
   }

   @Override
   public esa a(cyd $$0, ib $$1, eks $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      ib.a $$5 = new ib.a();

      for (ih $$6 : ih.c.a) {
         $$5.a($$1, $$6);
         eks $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  ib $$10 = $$5.d();
                  eks $$11 = $$0.b_($$10);
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

      esa $$12 = new esa($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (ih $$13 : ih.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.c(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(eks $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(cyd $$0, ib $$1, ih $$2) {
      doz $$3 = $$0.a_($$1);
      eks $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == ih.b) {
         return true;
      } else {
         return $$3.b() instanceof dfv ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(cyx $$0, ib $$1, eks $$2) {
      if (!$$2.c()) {
         doz $$3 = $$0.a_($$1);
         ib $$4 = $$1.d();
         doz $$5 = $$0.a_($$4);
         eks $$6 = this.a($$0, $$4, $$5);
         if (this.a($$0, $$1, $$3, ih.a, $$4, $$5, $$0.b_($$4), $$6.a())) {
            this.a($$0, $$4, $$5, ih.a, $$6);
            if (this.a($$0, $$1) >= 3) {
               this.a($$0, $$1, $$2, $$3);
            }
         } else if ($$2.b() || !this.a($$0, $$6.a(), $$1, $$3, $$4, $$5)) {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(cyx $$0, ib $$1, eks $$2, doz $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<ih, eks> $$5 = this.b($$0, $$1, $$3);

         for (Entry<ih, eks> $$6 : $$5.entrySet()) {
            ih $$7 = $$6.getKey();
            eks $$8 = $$6.getValue();
            ib $$9 = $$1.a($$7);
            doz $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected eks a(cyx $$0, ib $$1, doz $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (ih $$5 : ih.c.a) {
         ib $$6 = $$1.a($$5);
         doz $$7 = $$0.a_($$6);
         eks $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         doz $$9 = $$0.a_($$1.d());
         eks $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      ib $$11 = $$1.c();
      doz $$12 = $$0.a_($$11);
      eks $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(ih.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? ekt.a.g() : this.a($$14, false);
      }
   }

   private boolean a(ih $$0, cyd $$1, ib $$2, doz $$3, ib $$4, doz $$5) {
      Object2ByteLinkedOpenHashMap<dby.a> $$7;
      if (!$$3.b().o() && !$$5.b().o()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      dby.a $$8;
      if ($$7 != null) {
         $$8 = new dby.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      est $$11 = $$3.k($$1, $$2);
      est $$12 = $$5.k($$1, $$4);
      boolean $$13 = !esq.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract ekr d();

   public eks a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract ekr e();

   public eks a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(cyx var1);

   protected void a(cyy $$0, ib $$1, doz $$2, ih $$3, eks $$4) {
      if ($$2.b() instanceof dgo) {
         ((dgo)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(cyy var1, ib var2, doz var3);

   private static short a(ib $$0, ib $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(cza $$0, ib $$1, int $$2, ih $$3, doz $$4, ib $$5, Short2ObjectMap<Pair<doz, eks>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (ih $$9 : ih.c.a) {
         if ($$9 != $$3) {
            ib $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<doz, eks> $$12 = (Pair<doz, eks>)$$6.computeIfAbsent($$11, $$2x -> {
               doz $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            doz $$13 = (doz)$$12.getFirst();
            eks $$14 = (eks)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  ib $$4x = $$10.d();
                  doz $$5x = $$0.a_($$4x);
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

   private boolean a(cyd $$0, ekr $$1, ib $$2, doz $$3, ib $$4, doz $$5) {
      if (!this.a(ih.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(cyd $$0, ekr $$1, ib $$2, doz $$3, ih $$4, ib $$5, doz $$6, eks $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(eks $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(cza var1);

   private int a(cza $$0, ib $$1) {
      int $$2 = 0;

      for (ih $$3 : ih.c.a) {
         ib $$4 = $$1.a($$3);
         eks $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<ih, eks> b(cyx $$0, ib $$1, doz $$2) {
      int $$3 = 1000;
      Map<ih, eks> $$4 = Maps.newEnumMap(ih.class);
      Short2ObjectMap<Pair<doz, eks>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (ih $$7 : ih.c.a) {
         ib $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<doz, eks> $$10 = (Pair<doz, eks>)$$5.computeIfAbsent($$9, $$2x -> {
            doz $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         doz $$11 = (doz)$$10.getFirst();
         eks $$12 = (eks)$$10.getSecond();
         eks $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            ib $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               doz $$5x = $$0.a_($$14);
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

   private boolean a(cyd $$0, ib $$1, doz $$2, ekr $$3) {
      dby $$4 = $$2.b();
      if ($$4 instanceof dgo $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof dee || $$2.a(avc.ax) || $$2.a(dca.cO) || $$2.a(dca.dS) || $$2.a(dca.nd)) {
         return false;
      } else {
         return !$$2.a(dca.ed) && !$$2.a(dca.fx) && !$$2.a(dca.kF) && !$$2.a(dca.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(cyd $$0, ib $$1, doz $$2, ih $$3, ib $$4, doz $$5, eks $$6, ekr $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(cza var1);

   protected int a(cyx $$0, ib $$1, eks $$2, eks $$3) {
      return this.a((cza)$$0);
   }

   @Override
   public void b(cyx $$0, ib $$1, eks $$2) {
      if (!$$2.b()) {
         eks $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, dca.a.n(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            doz $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(eks $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(eks $$0, cyd $$1, ib $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(eks $$0, cyd $$1, ib $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(eks $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(eks var1);

   @Override
   public est b(eks $$0, cyd $$1, ib $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? esq.b() : this.g.computeIfAbsent($$0, $$2x -> esq.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
