import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class ewe extends ewf {
   public static final eaq a = eap.l;
   public static final eaz b = eap.aP;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<ewe.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<ewe.a> $$0 = new Object2ByteLinkedOpenHashMap<ewe.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<ewg, ffc> g = Maps.newIdentityHashMap();

   @Override
   protected void a(eaa.a<ewf, ewg> $$0) {
      $$0.a(a);
   }

   @Override
   public fei a(dib $$0, iu $$1, ewg $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      iu.a $$5 = new iu.a();

      for (ja $$6 : ja.c.a) {
         $$5.a($$1, $$6);
         ewg $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  iu $$10 = $$5.e();
                  ewg $$11 = $$0.b_($$10);
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

      fei $$12 = new fei($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (ja $$13 : ja.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.d(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(ewg $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(dib $$0, iu $$1, ja $$2) {
      dzz $$3 = $$0.a_($$1);
      ewg $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == ja.b) {
         return true;
      } else {
         return $$3.b() instanceof dqc ? false : $$3.c($$0, $$1, $$2);
      }
   }

   protected void a(arq $$0, iu $$1, dzz $$2, ewg $$3) {
      if (!$$3.c()) {
         iu $$4 = $$1.e();
         dzz $$5 = $$0.a_($$4);
         ewg $$6 = $$5.y();
         if (this.a($$0, $$1, $$2, ja.a, $$4, $$5, $$6)) {
            ewg $$7 = this.a($$0, $$4, $$5);
            ewf $$8 = $$7.a();
            if ($$6.a($$0, $$4, $$8, ja.a) && b($$0, $$4, $$5, $$8)) {
               this.a($$0, $$4, $$5, ja.a, $$7);
               if (this.a($$0, $$1) >= 3) {
                  this.a($$0, $$1, $$3, $$2);
               }

               return;
            }
         }

         if ($$3.b() || !this.a($$0, $$1, $$2, $$4, $$5)) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   private void a(arq $$0, iu $$1, ewg $$2, dzz $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<ja, ewg> $$5 = this.b($$0, $$1, $$3);

         for (Entry<ja, ewg> $$6 : $$5.entrySet()) {
            ja $$7 = $$6.getKey();
            ewg $$8 = $$6.getValue();
            iu $$9 = $$1.a($$7);
            this.a($$0, $$9, $$0.a_($$9), $$7, $$8);
         }
      }
   }

   protected ewg a(arq $$0, iu $$1, dzz $$2) {
      int $$3 = 0;
      int $$4 = 0;
      iu.a $$5 = new iu.a();

      for (ja $$6 : ja.c.a) {
         iu $$7 = $$5.a($$1, $$6);
         dzz $$8 = $$0.a_($$7);
         ewg $$9 = $$8.y();
         if ($$9.a().a(this) && a($$6, $$0, $$1, $$2, $$7, $$8)) {
            if ($$9.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$9.e());
         }
      }

      if ($$4 >= 2 && this.a($$0)) {
         dzz $$10 = $$0.a_($$5.a($$1, ja.a));
         ewg $$11 = $$10.y();
         if ($$10.e() || this.h($$11)) {
            return this.a(false);
         }
      }

      iu $$12 = $$5.a($$1, ja.b);
      dzz $$13 = $$0.a_($$12);
      ewg $$14 = $$13.y();
      if (!$$14.c() && $$14.a().a(this) && a(ja.b, $$0, $$1, $$2, $$12, $$13)) {
         return this.a(8, true);
      } else {
         int $$15 = $$3 - this.c($$0);
         return $$15 <= 0 ? ewh.a.g() : this.a($$15, false);
      }
   }

   private static boolean a(ja $$0, dib $$1, iu $$2, dzz $$3, iu $$4, dzz $$5) {
      ffc $$6 = $$5.g($$1, $$4);
      if ($$6 == fez.b()) {
         return false;
      } else {
         ffc $$7 = $$3.g($$1, $$2);
         if ($$7 == fez.b()) {
            return false;
         } else if ($$7 == fez.a() && $$6 == fez.a()) {
            return true;
         } else {
            Object2ByteLinkedOpenHashMap<ewe.a> $$9;
            if (!$$3.b().n() && !$$5.b().n()) {
               $$9 = f.get();
            } else {
               $$9 = null;
            }

            ewe.a $$10;
            if ($$9 != null) {
               $$10 = new ewe.a($$3, $$5, $$0);
               byte $$11 = $$9.getAndMoveToFirst($$10);
               if ($$11 != 127) {
                  return $$11 != 0;
               }
            } else {
               $$10 = null;
            }

            boolean $$13 = !fez.b($$7, $$6, $$0);
            if ($$9 != null) {
               if ($$9.size() == 200) {
                  $$9.removeLastByte();
               }

               $$9.putAndMoveToFirst($$10, (byte)($$13 ? 1 : 0));
            }

            return $$13;
         }
      }
   }

   public abstract ewf d();

   public ewg a(int $$0, boolean $$1) {
      return this.d().g().b(b, $$0).b(a, $$1);
   }

   public abstract ewf e();

   public ewg a(boolean $$0) {
      return this.e().g().b(a, $$0);
   }

   protected abstract boolean a(arq var1);

   protected void a(diw $$0, iu $$1, dzz $$2, ja $$3, ewg $$4) {
      if ($$2.b() instanceof dqw $$5) {
         $$5.a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.l()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(diw var1, iu var2, dzz var3);

   protected int a(diy $$0, iu $$1, int $$2, ja $$3, dzz $$4, ewe.b $$5) {
      int $$6 = 1000;

      for (ja $$7 : ja.c.a) {
         if ($$7 != $$3) {
            iu $$8 = $$1.a($$7);
            dzz $$9 = $$5.a($$8);
            ewg $$10 = $$9.y();
            if (this.a($$0, this.d(), $$1, $$4, $$7, $$8, $$9, $$10)) {
               if ($$5.b($$8)) {
                  return $$2;
               }

               if ($$2 < this.b($$0)) {
                  int $$11 = this.a($$0, $$8, $$2 + 1, $$7.g(), $$9, $$5);
                  if ($$11 < $$6) {
                     $$6 = $$11;
                  }
               }
            }
         }
      }

      return $$6;
   }

   boolean a(dib $$0, iu $$1, dzz $$2, iu $$3, dzz $$4) {
      if (!a(ja.a, $$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else {
         return $$4.y().a().a(this) ? true : a($$0, $$3, $$4, this.d());
      }
   }

   private boolean a(dib $$0, ewf $$1, iu $$2, dzz $$3, ja $$4, iu $$5, dzz $$6, ewg $$7) {
      return this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7) && b($$0, $$5, $$6, $$1);
   }

   private boolean a(dib $$0, iu $$1, dzz $$2, ja $$3, iu $$4, dzz $$5, ewg $$6) {
      return !this.h($$6) && a($$5) && a($$3, $$0, $$1, $$2, $$4, $$5);
   }

   private boolean h(ewg $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(diy var1);

   private int a(diy $$0, iu $$1) {
      int $$2 = 0;

      for (ja $$3 : ja.c.a) {
         iu $$4 = $$1.a($$3);
         ewg $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<ja, ewg> b(arq $$0, iu $$1, dzz $$2) {
      int $$3 = 1000;
      Map<ja, ewg> $$4 = Maps.newEnumMap(ja.class);
      ewe.b $$5 = null;

      for (ja $$6 : ja.c.a) {
         iu $$7 = $$1.a($$6);
         dzz $$8 = $$0.a_($$7);
         ewg $$9 = $$8.y();
         if (this.a($$0, $$1, $$2, $$6, $$7, $$8, $$9)) {
            ewg $$10 = this.a($$0, $$7, $$8);
            if (b($$0, $$7, $$8, $$10.a())) {
               if ($$5 == null) {
                  $$5 = new ewe.b($$0, $$1);
               }

               int $$11;
               if ($$5.b($$7)) {
                  $$11 = 0;
               } else {
                  $$11 = this.a($$0, $$7, 1, $$6.g(), $$8, $$5);
               }

               if ($$11 < $$3) {
                  $$4.clear();
               }

               if ($$11 <= $$3) {
                  if ($$9.a($$0, $$7, $$10.a(), $$6)) {
                     $$4.put($$6, $$10);
                  }

                  $$3 = $$11;
               }
            }
         }
      }

      return $$4;
   }

   private static boolean a(dzz $$0) {
      dma $$1 = $$0.b();
      if ($$1 instanceof dqw) {
         return true;
      } else {
         return $$0.d()
            ? false
            : !($$1 instanceof doh)
               && !$$0.a(axc.aA)
               && !$$0.a(dmc.cY)
               && !$$0.a(dmc.eg)
               && !$$0.a(dmc.nG)
               && !$$0.a(dmc.er)
               && !$$0.a(dmc.fT)
               && !$$0.a(dmc.li)
               && !$$0.a(dmc.lq);
      }
   }

   private static boolean a(dib $$0, iu $$1, dzz $$2, ewf $$3) {
      return a($$2) && b($$0, $$1, $$2, $$3);
   }

   private static boolean b(dib $$0, iu $$1, dzz $$2, ewf $$3) {
      return $$2.b() instanceof dqw $$5 ? $$5.a(null, $$0, $$1, $$2, $$3) : true;
   }

   protected abstract int c(diy var1);

   protected int a(div $$0, iu $$1, ewg $$2, ewg $$3) {
      return this.a($$0);
   }

   @Override
   public void b(arq $$0, iu $$1, dzz $$2, ewg $$3) {
      if (!$$3.b()) {
         ewg $$4 = this.a($$0, $$1, $$0.a_($$1));
         int $$5 = this.a($$0, $$1, $$3, $$4);
         if ($$4.c()) {
            $$3 = $$4;
            $$2 = dmc.a.m();
            $$0.a($$1, $$2, 3);
         } else if ($$4 != $$3) {
            $$3 = $$4;
            $$2 = $$4.g();
            $$0.a($$1, $$2, 3);
            $$0.a($$1, $$4.a(), $$5);
         }
      }

      this.a($$0, $$1, $$2, $$3);
   }

   protected static int e(ewg $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean d(ewg $$0, dib $$1, iu $$2) {
      return $$0.a().a($$1.b_($$2.d()).a());
   }

   @Override
   public float a(ewg $$0, dib $$1, iu $$2) {
      return d($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(ewg $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(ewg var1);

   @Override
   public ffc b(ewg $$0, dib $$1, iu $$2) {
      return $$0.e() == 9 && d($$0, $$1, $$2) ? fez.b() : this.g.computeIfAbsent($$0, $$2x -> fez.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }

   static record a(dzz a, dzz b, ja c) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof ewe.a $$1 && this.a == $$1.a && this.b == $$1.b && this.c == $$1.c) {
            return true;
         }

         return false;
      }

      @Override
      public int hashCode() {
         int $$0 = System.identityHashCode(this.a);
         $$0 = 31 * $$0 + System.identityHashCode(this.b);
         return 31 * $$0 + this.c.hashCode();
      }
   }

   protected class b {
      private final dib b;
      private final iu c;
      private final Short2ObjectMap<dzz> d = new Short2ObjectOpenHashMap();
      private final Short2BooleanMap e = new Short2BooleanOpenHashMap();

      b(final dib $$1, final iu $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public dzz a(iu $$0) {
         return this.a($$0, this.c($$0));
      }

      private dzz a(iu $$0, short $$1) {
         return (dzz)this.d.computeIfAbsent($$1, $$1x -> this.b.a_($$0));
      }

      public boolean b(iu $$0) {
         return this.e.computeIfAbsent(this.c($$0), $$1 -> {
            dzz $$2 = this.a($$0, $$1);
            iu $$3 = $$0.e();
            dzz $$4 = this.b.a_($$3);
            return ewe.this.a(this.b, $$0, $$2, $$3, $$4);
         });
      }

      private short c(iu $$0) {
         int $$1 = $$0.u() - this.c.u();
         int $$2 = $$0.w() - this.c.w();
         return (short)(($$1 + 128 & 0xFF) << 8 | $$2 + 128 & 0xFF);
      }
   }
}
