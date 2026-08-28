import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class erc extends erd {
   public static final dvu a = dvt.i;
   public static final dwd b = dvt.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<erc.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<erc.a> $$0 = new Object2ByteLinkedOpenHashMap<erc.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<ere, fab> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dve.a<erd, ere> $$0) {
      $$0.a(a);
   }

   @Override
   public ezh a(dea $$0, jg $$1, ere $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      jg.a $$5 = new jg.a();

      for (jl $$6 : jl.c.a) {
         $$5.a($$1, $$6);
         ere $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  jg $$10 = $$5.e();
                  ere $$11 = $$0.b_($$10);
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

      ezh $$12 = new ezh($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (jl $$13 : jl.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.d(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(ere $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(dea $$0, jg $$1, jl $$2) {
      dvd $$3 = $$0.a_($$1);
      ere $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == jl.b) {
         return true;
      } else {
         return $$3.b() instanceof dlv ? false : $$3.c($$0, $$1, $$2);
      }
   }

   protected void a(dev $$0, jg $$1, dvd $$2, ere $$3) {
      if (!$$3.c()) {
         jg $$4 = $$1.e();
         dvd $$5 = $$0.a_($$4);
         ere $$6 = $$5.y();
         if (this.a($$0, $$1, $$2, jl.a, $$4, $$5, $$6)) {
            ere $$7 = this.a($$0, $$4, $$5);
            erd $$8 = $$7.a();
            if ($$6.a($$0, $$4, $$8, jl.a) && b($$0, $$4, $$5, $$8)) {
               this.a($$0, $$4, $$5, jl.a, $$7);
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

   private void a(dev $$0, jg $$1, ere $$2, dvd $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<jl, ere> $$5 = this.b($$0, $$1, $$3);

         for (Entry<jl, ere> $$6 : $$5.entrySet()) {
            jl $$7 = $$6.getKey();
            ere $$8 = $$6.getValue();
            jg $$9 = $$1.a($$7);
            this.a($$0, $$9, $$0.a_($$9), $$7, $$8);
         }
      }
   }

   protected ere a(dev $$0, jg $$1, dvd $$2) {
      int $$3 = 0;
      int $$4 = 0;
      jg.a $$5 = new jg.a();

      for (jl $$6 : jl.c.a) {
         jg $$7 = $$5.a($$1, $$6);
         dvd $$8 = $$0.a_($$7);
         ere $$9 = $$8.y();
         if ($$9.a().a(this) && a($$6, $$0, $$1, $$2, $$7, $$8)) {
            if ($$9.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$9.e());
         }
      }

      if ($$4 >= 2 && this.a($$0)) {
         dvd $$10 = $$0.a_($$5.a($$1, jl.a));
         ere $$11 = $$10.y();
         if ($$10.e() || this.h($$11)) {
            return this.a(false);
         }
      }

      jg $$12 = $$5.a($$1, jl.b);
      dvd $$13 = $$0.a_($$12);
      ere $$14 = $$13.y();
      if (!$$14.c() && $$14.a().a(this) && a(jl.b, $$0, $$1, $$2, $$12, $$13)) {
         return this.a(8, true);
      } else {
         int $$15 = $$3 - this.c($$0);
         return $$15 <= 0 ? erf.a.g() : this.a($$15, false);
      }
   }

   private static boolean a(jl $$0, dea $$1, jg $$2, dvd $$3, jg $$4, dvd $$5) {
      fab $$6 = $$5.g($$1, $$4);
      if ($$6 == ezy.b()) {
         return false;
      } else {
         fab $$7 = $$3.g($$1, $$2);
         if ($$7 == ezy.b()) {
            return false;
         } else if ($$7 == ezy.a() && $$6 == ezy.a()) {
            return true;
         } else {
            Object2ByteLinkedOpenHashMap<erc.a> $$9;
            if (!$$3.b().n() && !$$5.b().n()) {
               $$9 = f.get();
            } else {
               $$9 = null;
            }

            erc.a $$10;
            if ($$9 != null) {
               $$10 = new erc.a($$3, $$5, $$0);
               byte $$11 = $$9.getAndMoveToFirst($$10);
               if ($$11 != 127) {
                  return $$11 != 0;
               }
            } else {
               $$10 = null;
            }

            boolean $$13 = !ezy.b($$7, $$6, $$0);
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

   public abstract erd d();

   public ere a(int $$0, boolean $$1) {
      return this.d().g().b(b, $$0).b(a, $$1);
   }

   public abstract erd e();

   public ere a(boolean $$0) {
      return this.e().g().b(a, $$0);
   }

   protected abstract boolean a(dev var1);

   protected void a(dew $$0, jg $$1, dvd $$2, jl $$3, ere $$4) {
      if ($$2.b() instanceof dmo $$5) {
         $$5.a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.l()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(dew var1, jg var2, dvd var3);

   protected int a(dey $$0, jg $$1, int $$2, jl $$3, dvd $$4, erc.b $$5) {
      int $$6 = 1000;

      for (jl $$7 : jl.c.a) {
         if ($$7 != $$3) {
            jg $$8 = $$1.a($$7);
            dvd $$9 = $$5.a($$8);
            ere $$10 = $$9.y();
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

   boolean a(dea $$0, jg $$1, dvd $$2, jg $$3, dvd $$4) {
      if (!a(jl.a, $$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else {
         return $$4.y().a().a(this) ? true : a($$0, $$3, $$4, this.d());
      }
   }

   private boolean a(dea $$0, erd $$1, jg $$2, dvd $$3, jl $$4, jg $$5, dvd $$6, ere $$7) {
      return this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7) && b($$0, $$5, $$6, $$1);
   }

   private boolean a(dea $$0, jg $$1, dvd $$2, jl $$3, jg $$4, dvd $$5, ere $$6) {
      return !this.h($$6) && a($$5) && a($$3, $$0, $$1, $$2, $$4, $$5);
   }

   private boolean h(ere $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(dey var1);

   private int a(dey $$0, jg $$1) {
      int $$2 = 0;

      for (jl $$3 : jl.c.a) {
         jg $$4 = $$1.a($$3);
         ere $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<jl, ere> b(dev $$0, jg $$1, dvd $$2) {
      int $$3 = 1000;
      Map<jl, ere> $$4 = Maps.newEnumMap(jl.class);
      erc.b $$5 = null;

      for (jl $$6 : jl.c.a) {
         jg $$7 = $$1.a($$6);
         dvd $$8 = $$0.a_($$7);
         ere $$9 = $$8.y();
         if (this.a($$0, $$1, $$2, $$6, $$7, $$8, $$9)) {
            ere $$10 = this.a($$0, $$7, $$8);
            if (b($$0, $$7, $$8, $$10.a())) {
               if ($$5 == null) {
                  $$5 = new erc.b($$0, $$1);
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

   private static boolean a(dvd $$0) {
      dhy $$1 = $$0.b();
      if ($$1 instanceof dmo) {
         return true;
      } else {
         return $$0.d()
            ? false
            : !($$1 instanceof dke)
               && !$$0.a(awz.ay)
               && !$$0.a(dia.cO)
               && !$$0.a(dia.dS)
               && !$$0.a(dia.nd)
               && !$$0.a(dia.ed)
               && !$$0.a(dia.fx)
               && !$$0.a(dia.kF)
               && !$$0.a(dia.kN);
      }
   }

   private static boolean a(dea $$0, jg $$1, dvd $$2, erd $$3) {
      return a($$2) && b($$0, $$1, $$2, $$3);
   }

   private static boolean b(dea $$0, jg $$1, dvd $$2, erd $$3) {
      return $$2.b() instanceof dmo $$5 ? $$5.a(null, $$0, $$1, $$2, $$3) : true;
   }

   protected abstract int c(dey var1);

   protected int a(dev $$0, jg $$1, ere $$2, ere $$3) {
      return this.a((dey)$$0);
   }

   @Override
   public void b(dev $$0, jg $$1, dvd $$2, ere $$3) {
      if (!$$3.b()) {
         ere $$4 = this.a($$0, $$1, $$0.a_($$1));
         int $$5 = this.a($$0, $$1, $$3, $$4);
         if ($$4.c()) {
            $$3 = $$4;
            $$2 = dia.a.m();
            $$0.a($$1, $$2, 3);
         } else if (!$$4.equals($$3)) {
            $$3 = $$4;
            $$2 = $$4.g();
            $$0.a($$1, $$2, 3);
            $$0.a($$1, $$4.a(), $$5);
         }
      }

      this.a($$0, $$1, $$2, $$3);
   }

   protected static int e(ere $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(ere $$0, dea $$1, jg $$2) {
      return $$0.a().a($$1.b_($$2.d()).a());
   }

   @Override
   public float a(ere $$0, dea $$1, jg $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(ere $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(ere var1);

   @Override
   public fab b(ere $$0, dea $$1, jg $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? ezy.b() : this.g.computeIfAbsent($$0, $$2x -> ezy.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }

   static record a(dvd a, dvd b, jl c) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof erc.a $$1 && this.a == $$1.a && this.b == $$1.b && this.c == $$1.c) {
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
      private final dea b;
      private final jg c;
      private final Short2ObjectMap<dvd> d = new Short2ObjectOpenHashMap();
      private final Short2BooleanMap e = new Short2BooleanOpenHashMap();

      b(final dea $$1, final jg $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public dvd a(jg $$0) {
         return this.a($$0, this.c($$0));
      }

      private dvd a(jg $$0, short $$1) {
         return (dvd)this.d.computeIfAbsent($$1, $$1x -> this.b.a_($$0));
      }

      public boolean b(jg $$0) {
         return this.e.computeIfAbsent(this.c($$0), $$1 -> {
            dvd $$2 = this.a($$0, $$1);
            jg $$3 = $$0.e();
            dvd $$4 = this.b.a_($$3);
            return erc.this.a(this.b, $$0, $$2, $$3, $$4);
         });
      }

      private short c(jg $$0) {
         int $$1 = $$0.u() - this.c.u();
         int $$2 = $$0.w() - this.c.w();
         return (short)(($$1 + 128 & 0xFF) << 8 | $$2 + 128 & 0xFF);
      }
   }
}
