import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class egn extends ego {
   public static final dlw a = dlv.i;
   public static final dmf b = dlv.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<cyo.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<cyo.a> $$0 = new Object2ByteLinkedOpenHashMap<cyo.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<egp, eol> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dlg.a<ego, egp> $$0) {
      $$0.a(a);
   }

   @Override
   public ens a(cut $$0, hz $$1, egp $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      hz.a $$5 = new hz.a();

      for (ie $$6 : ie.c.a) {
         $$5.a($$1, $$6);
         egp $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  hz $$10 = $$5.d();
                  egp $$11 = $$0.b_($$10);
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

      ens $$12 = new ens($$3, 0.0, $$4);
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

   private boolean g(egp $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(cut $$0, hz $$1, ie $$2) {
      dlf $$3 = $$0.a_($$1);
      egp $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == ie.b) {
         return true;
      } else {
         return $$3.b() instanceof dcl ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(cvn $$0, hz $$1, egp $$2) {
      if (!$$2.c()) {
         dlf $$3 = $$0.a_($$1);
         hz $$4 = $$1.d();
         dlf $$5 = $$0.a_($$4);
         egp $$6 = this.a($$0, $$4, $$5);
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

   private void a(cvn $$0, hz $$1, egp $$2, dlf $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<ie, egp> $$5 = this.b($$0, $$1, $$3);

         for (Entry<ie, egp> $$6 : $$5.entrySet()) {
            ie $$7 = $$6.getKey();
            egp $$8 = $$6.getValue();
            hz $$9 = $$1.a($$7);
            dlf $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected egp a(cvn $$0, hz $$1, dlf $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (ie $$5 : ie.c.a) {
         hz $$6 = $$1.a($$5);
         dlf $$7 = $$0.a_($$6);
         egp $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         dlf $$9 = $$0.a_($$1.d());
         egp $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      hz $$11 = $$1.c();
      dlf $$12 = $$0.a_($$11);
      egp $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(ie.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? egq.a.g() : this.a($$14, false);
      }
   }

   private boolean a(ie $$0, cut $$1, hz $$2, dlf $$3, hz $$4, dlf $$5) {
      Object2ByteLinkedOpenHashMap<cyo.a> $$7;
      if (!$$3.b().p() && !$$5.b().p()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      cyo.a $$8;
      if ($$7 != null) {
         $$8 = new cyo.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      eol $$11 = $$3.k($$1, $$2);
      eol $$12 = $$5.k($$1, $$4);
      boolean $$13 = !eoi.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract ego d();

   public egp a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract ego e();

   public egp a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(cvn var1);

   protected void a(cvo $$0, hz $$1, dlf $$2, ie $$3, egp $$4) {
      if ($$2.b() instanceof dde) {
         ((dde)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(cvo var1, hz var2, dlf var3);

   private static short a(hz $$0, hz $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(cvq $$0, hz $$1, int $$2, ie $$3, dlf $$4, hz $$5, Short2ObjectMap<Pair<dlf, egp>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (ie $$9 : ie.c.a) {
         if ($$9 != $$3) {
            hz $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<dlf, egp> $$12 = (Pair<dlf, egp>)$$6.computeIfAbsent($$11, $$2x -> {
               dlf $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            dlf $$13 = (dlf)$$12.getFirst();
            egp $$14 = (egp)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  hz $$4x = $$10.d();
                  dlf $$5x = $$0.a_($$4x);
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

   private boolean a(cut $$0, ego $$1, hz $$2, dlf $$3, hz $$4, dlf $$5) {
      if (!this.a(ie.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(cut $$0, ego $$1, hz $$2, dlf $$3, ie $$4, hz $$5, dlf $$6, egp $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(egp $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(cvq var1);

   private int a(cvq $$0, hz $$1) {
      int $$2 = 0;

      for (ie $$3 : ie.c.a) {
         hz $$4 = $$1.a($$3);
         egp $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<ie, egp> b(cvn $$0, hz $$1, dlf $$2) {
      int $$3 = 1000;
      Map<ie, egp> $$4 = Maps.newEnumMap(ie.class);
      Short2ObjectMap<Pair<dlf, egp>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (ie $$7 : ie.c.a) {
         hz $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<dlf, egp> $$10 = (Pair<dlf, egp>)$$5.computeIfAbsent($$9, $$2x -> {
            dlf $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         dlf $$11 = (dlf)$$10.getFirst();
         egp $$12 = (egp)$$10.getSecond();
         egp $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            hz $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               dlf $$5x = $$0.a_($$14);
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

   private boolean a(cut $$0, hz $$1, dlf $$2, ego $$3) {
      cyo $$4 = $$2.b();
      if ($$4 instanceof dde $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof dau || $$2.a(atz.aw) || $$2.a(cyq.cO) || $$2.a(cyq.dS) || $$2.a(cyq.nd)) {
         return false;
      } else {
         return !$$2.a(cyq.ed) && !$$2.a(cyq.fx) && !$$2.a(cyq.kF) && !$$2.a(cyq.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(cut $$0, hz $$1, dlf $$2, ie $$3, hz $$4, dlf $$5, egp $$6, ego $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(cvq var1);

   protected int a(cvn $$0, hz $$1, egp $$2, egp $$3) {
      return this.a((cvq)$$0);
   }

   @Override
   public void b(cvn $$0, hz $$1, egp $$2) {
      if (!$$2.b()) {
         egp $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, cyq.a.o(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            dlf $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(egp $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(egp $$0, cut $$1, hz $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(egp $$0, cut $$1, hz $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(egp $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(egp var1);

   @Override
   public eol b(egp $$0, cut $$1, hz $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? eoi.b() : this.g.computeIfAbsent($$0, $$2x -> eoi.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
