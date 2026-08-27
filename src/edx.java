import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class edx extends edy {
   public static final djg a = djf.i;
   public static final djp b = djf.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<cvz.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<cvz.a> $$0 = new Object2ByteLinkedOpenHashMap<cvz.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<edz, elu> g = Maps.newIdentityHashMap();

   @Override
   protected void a(diq.a<edy, edz> $$0) {
      $$0.a(a);
   }

   @Override
   public elb a(cse $$0, hv $$1, edz $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      hv.a $$5 = new hv.a();

      for (ia $$6 : ia.c.a) {
         $$5.a($$1, $$6);
         edz $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  hv $$10 = $$5.d();
                  edz $$11 = $$0.b_($$10);
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

      elb $$12 = new elb($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (ia $$13 : ia.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.c(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(edz $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(cse $$0, hv $$1, ia $$2) {
      dip $$3 = $$0.a_($$1);
      edz $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == ia.b) {
         return true;
      } else {
         return $$3.b() instanceof czw ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(csy $$0, hv $$1, edz $$2) {
      if (!$$2.c()) {
         dip $$3 = $$0.a_($$1);
         hv $$4 = $$1.d();
         dip $$5 = $$0.a_($$4);
         edz $$6 = this.a($$0, $$4, $$5);
         if (this.a($$0, $$1, $$3, ia.a, $$4, $$5, $$0.b_($$4), $$6.a())) {
            this.a($$0, $$4, $$5, ia.a, $$6);
            if (this.a($$0, $$1) >= 3) {
               this.a($$0, $$1, $$2, $$3);
            }
         } else if ($$2.b() || !this.a($$0, $$6.a(), $$1, $$3, $$4, $$5)) {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(csy $$0, hv $$1, edz $$2, dip $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<ia, edz> $$5 = this.b($$0, $$1, $$3);

         for (Entry<ia, edz> $$6 : $$5.entrySet()) {
            ia $$7 = $$6.getKey();
            edz $$8 = $$6.getValue();
            hv $$9 = $$1.a($$7);
            dip $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected edz a(csy $$0, hv $$1, dip $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (ia $$5 : ia.c.a) {
         hv $$6 = $$1.a($$5);
         dip $$7 = $$0.a_($$6);
         edz $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         dip $$9 = $$0.a_($$1.d());
         edz $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      hv $$11 = $$1.c();
      dip $$12 = $$0.a_($$11);
      edz $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(ia.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? eea.a.g() : this.a($$14, false);
      }
   }

   private boolean a(ia $$0, cse $$1, hv $$2, dip $$3, hv $$4, dip $$5) {
      Object2ByteLinkedOpenHashMap<cvz.a> $$7;
      if (!$$3.b().p() && !$$5.b().p()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      cvz.a $$8;
      if ($$7 != null) {
         $$8 = new cvz.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      elu $$11 = $$3.k($$1, $$2);
      elu $$12 = $$5.k($$1, $$4);
      boolean $$13 = !elr.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract edy d();

   public edz a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract edy e();

   public edz a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(csy var1);

   protected void a(csz $$0, hv $$1, dip $$2, ia $$3, edz $$4) {
      if ($$2.b() instanceof dap) {
         ((dap)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(csz var1, hv var2, dip var3);

   private static short a(hv $$0, hv $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(ctb $$0, hv $$1, int $$2, ia $$3, dip $$4, hv $$5, Short2ObjectMap<Pair<dip, edz>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (ia $$9 : ia.c.a) {
         if ($$9 != $$3) {
            hv $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<dip, edz> $$12 = (Pair<dip, edz>)$$6.computeIfAbsent($$11, $$2x -> {
               dip $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            dip $$13 = (dip)$$12.getFirst();
            edz $$14 = (edz)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  hv $$4x = $$10.d();
                  dip $$5x = $$0.a_($$4x);
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

   private boolean a(cse $$0, edy $$1, hv $$2, dip $$3, hv $$4, dip $$5) {
      if (!this.a(ia.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(cse $$0, edy $$1, hv $$2, dip $$3, ia $$4, hv $$5, dip $$6, edz $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(edz $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(ctb var1);

   private int a(ctb $$0, hv $$1) {
      int $$2 = 0;

      for (ia $$3 : ia.c.a) {
         hv $$4 = $$1.a($$3);
         edz $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<ia, edz> b(csy $$0, hv $$1, dip $$2) {
      int $$3 = 1000;
      Map<ia, edz> $$4 = Maps.newEnumMap(ia.class);
      Short2ObjectMap<Pair<dip, edz>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (ia $$7 : ia.c.a) {
         hv $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<dip, edz> $$10 = (Pair<dip, edz>)$$5.computeIfAbsent($$9, $$2x -> {
            dip $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         dip $$11 = (dip)$$10.getFirst();
         edz $$12 = (edz)$$10.getSecond();
         edz $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            hv $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               dip $$5x = $$0.a_($$14);
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

   private boolean a(cse $$0, hv $$1, dip $$2, edy $$3) {
      cvz $$4 = $$2.b();
      if ($$4 instanceof dap $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof cyf || $$2.a(arr.aw) || $$2.a(cwb.cO) || $$2.a(cwb.dS) || $$2.a(cwb.nd)) {
         return false;
      } else {
         return !$$2.a(cwb.ed) && !$$2.a(cwb.fx) && !$$2.a(cwb.kF) && !$$2.a(cwb.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(cse $$0, hv $$1, dip $$2, ia $$3, hv $$4, dip $$5, edz $$6, edy $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(ctb var1);

   protected int a(csy $$0, hv $$1, edz $$2, edz $$3) {
      return this.a((ctb)$$0);
   }

   @Override
   public void b(csy $$0, hv $$1, edz $$2) {
      if (!$$2.b()) {
         edz $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, cwb.a.o(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            dip $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(edz $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(edz $$0, cse $$1, hv $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(edz $$0, cse $$1, hv $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(edz $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(edz var1);

   @Override
   public elu b(edz $$0, cse $$1, hv $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? elr.b() : this.g.computeIfAbsent($$0, $$2x -> elr.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
