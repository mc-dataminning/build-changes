import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class eei extends eej {
   public static final djr a = djq.i;
   public static final dka b = djq.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<cwj.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<cwj.a> $$0 = new Object2ByteLinkedOpenHashMap<cwj.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<eek, emf> g = Maps.newIdentityHashMap();

   @Override
   protected void a(djb.a<eej, eek> $$0) {
      $$0.a(a);
   }

   @Override
   public elm a(cso $$0, hx $$1, eek $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      hx.a $$5 = new hx.a();

      for (ic $$6 : ic.c.a) {
         $$5.a($$1, $$6);
         eek $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  hx $$10 = $$5.d();
                  eek $$11 = $$0.b_($$10);
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

      elm $$12 = new elm($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (ic $$13 : ic.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.c(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(eek $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(cso $$0, hx $$1, ic $$2) {
      dja $$3 = $$0.a_($$1);
      eek $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == ic.b) {
         return true;
      } else {
         return $$3.b() instanceof dag ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(cti $$0, hx $$1, eek $$2) {
      if (!$$2.c()) {
         dja $$3 = $$0.a_($$1);
         hx $$4 = $$1.d();
         dja $$5 = $$0.a_($$4);
         eek $$6 = this.a($$0, $$4, $$5);
         if (this.a($$0, $$1, $$3, ic.a, $$4, $$5, $$0.b_($$4), $$6.a())) {
            this.a($$0, $$4, $$5, ic.a, $$6);
            if (this.a($$0, $$1) >= 3) {
               this.a($$0, $$1, $$2, $$3);
            }
         } else if ($$2.b() || !this.a($$0, $$6.a(), $$1, $$3, $$4, $$5)) {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(cti $$0, hx $$1, eek $$2, dja $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<ic, eek> $$5 = this.b($$0, $$1, $$3);

         for (Entry<ic, eek> $$6 : $$5.entrySet()) {
            ic $$7 = $$6.getKey();
            eek $$8 = $$6.getValue();
            hx $$9 = $$1.a($$7);
            dja $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected eek a(cti $$0, hx $$1, dja $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (ic $$5 : ic.c.a) {
         hx $$6 = $$1.a($$5);
         dja $$7 = $$0.a_($$6);
         eek $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         dja $$9 = $$0.a_($$1.d());
         eek $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      hx $$11 = $$1.c();
      dja $$12 = $$0.a_($$11);
      eek $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(ic.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? eel.a.g() : this.a($$14, false);
      }
   }

   private boolean a(ic $$0, cso $$1, hx $$2, dja $$3, hx $$4, dja $$5) {
      Object2ByteLinkedOpenHashMap<cwj.a> $$7;
      if (!$$3.b().p() && !$$5.b().p()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      cwj.a $$8;
      if ($$7 != null) {
         $$8 = new cwj.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      emf $$11 = $$3.k($$1, $$2);
      emf $$12 = $$5.k($$1, $$4);
      boolean $$13 = !emc.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract eej d();

   public eek a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract eej e();

   public eek a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(cti var1);

   protected void a(ctj $$0, hx $$1, dja $$2, ic $$3, eek $$4) {
      if ($$2.b() instanceof daz) {
         ((daz)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(ctj var1, hx var2, dja var3);

   private static short a(hx $$0, hx $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(ctl $$0, hx $$1, int $$2, ic $$3, dja $$4, hx $$5, Short2ObjectMap<Pair<dja, eek>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (ic $$9 : ic.c.a) {
         if ($$9 != $$3) {
            hx $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<dja, eek> $$12 = (Pair<dja, eek>)$$6.computeIfAbsent($$11, $$2x -> {
               dja $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            dja $$13 = (dja)$$12.getFirst();
            eek $$14 = (eek)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  hx $$4x = $$10.d();
                  dja $$5x = $$0.a_($$4x);
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

   private boolean a(cso $$0, eej $$1, hx $$2, dja $$3, hx $$4, dja $$5) {
      if (!this.a(ic.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(cso $$0, eej $$1, hx $$2, dja $$3, ic $$4, hx $$5, dja $$6, eek $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(eek $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(ctl var1);

   private int a(ctl $$0, hx $$1) {
      int $$2 = 0;

      for (ic $$3 : ic.c.a) {
         hx $$4 = $$1.a($$3);
         eek $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<ic, eek> b(cti $$0, hx $$1, dja $$2) {
      int $$3 = 1000;
      Map<ic, eek> $$4 = Maps.newEnumMap(ic.class);
      Short2ObjectMap<Pair<dja, eek>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (ic $$7 : ic.c.a) {
         hx $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<dja, eek> $$10 = (Pair<dja, eek>)$$5.computeIfAbsent($$9, $$2x -> {
            dja $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         dja $$11 = (dja)$$10.getFirst();
         eek $$12 = (eek)$$10.getSecond();
         eek $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            hx $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               dja $$5x = $$0.a_($$14);
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

   private boolean a(cso $$0, hx $$1, dja $$2, eej $$3) {
      cwj $$4 = $$2.b();
      if ($$4 instanceof daz $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof cyp || $$2.a(asb.aw) || $$2.a(cwl.cO) || $$2.a(cwl.dS) || $$2.a(cwl.nd)) {
         return false;
      } else {
         return !$$2.a(cwl.ed) && !$$2.a(cwl.fx) && !$$2.a(cwl.kF) && !$$2.a(cwl.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(cso $$0, hx $$1, dja $$2, ic $$3, hx $$4, dja $$5, eek $$6, eej $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(ctl var1);

   protected int a(cti $$0, hx $$1, eek $$2, eek $$3) {
      return this.a((ctl)$$0);
   }

   @Override
   public void b(cti $$0, hx $$1, eek $$2) {
      if (!$$2.b()) {
         eek $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, cwl.a.o(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            dja $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(eek $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(eek $$0, cso $$1, hx $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(eek $$0, cso $$1, hx $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(eek $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(eek var1);

   @Override
   public emf b(eek $$0, cso $$1, hx $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? emc.b() : this.g.computeIfAbsent($$0, $$2x -> emc.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
