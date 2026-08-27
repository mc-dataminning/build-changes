import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class eab extends eac {
   public static final dfr a = dfq.i;
   public static final dga b = dfq.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<csm.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<csm.a> $$0 = new Object2ByteLinkedOpenHashMap<csm.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<ead, ehx> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dfb.a<eac, ead> $$0) {
      $$0.a(a);
   }

   @Override
   public ehe a(cos $$0, gu $$1, ead $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      gu.a $$5 = new gu.a();

      for (ha $$6 : ha.c.a) {
         $$5.a($$1, $$6);
         ead $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  gu $$10 = $$5.d();
                  ead $$11 = $$0.b_($$10);
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

      ehe $$12 = new ehe($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (ha $$13 : ha.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.c(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(ead $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(cos $$0, gu $$1, ha $$2) {
      dfa $$3 = $$0.a_($$1);
      ead $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == ha.b) {
         return true;
      } else {
         return $$3.b() instanceof cwh ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(cpm $$0, gu $$1, ead $$2) {
      if (!$$2.c()) {
         dfa $$3 = $$0.a_($$1);
         gu $$4 = $$1.d();
         dfa $$5 = $$0.a_($$4);
         ead $$6 = this.a($$0, $$4, $$5);
         if (this.a($$0, $$1, $$3, ha.a, $$4, $$5, $$0.b_($$4), $$6.a())) {
            this.a($$0, $$4, $$5, ha.a, $$6);
            if (this.a($$0, $$1) >= 3) {
               this.a($$0, $$1, $$2, $$3);
            }
         } else if ($$2.b() || !this.a($$0, $$6.a(), $$1, $$3, $$4, $$5)) {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(cpm $$0, gu $$1, ead $$2, dfa $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<ha, ead> $$5 = this.b($$0, $$1, $$3);

         for (Entry<ha, ead> $$6 : $$5.entrySet()) {
            ha $$7 = $$6.getKey();
            ead $$8 = $$6.getValue();
            gu $$9 = $$1.a($$7);
            dfa $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected ead a(cpm $$0, gu $$1, dfa $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (ha $$5 : ha.c.a) {
         gu $$6 = $$1.a($$5);
         dfa $$7 = $$0.a_($$6);
         ead $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         dfa $$9 = $$0.a_($$1.d());
         ead $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      gu $$11 = $$1.c();
      dfa $$12 = $$0.a_($$11);
      ead $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(ha.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? eae.a.g() : this.a($$14, false);
      }
   }

   private boolean a(ha $$0, cos $$1, gu $$2, dfa $$3, gu $$4, dfa $$5) {
      Object2ByteLinkedOpenHashMap<csm.a> $$7;
      if (!$$3.b().o() && !$$5.b().o()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      csm.a $$8;
      if ($$7 != null) {
         $$8 = new csm.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      ehx $$11 = $$3.k($$1, $$2);
      ehx $$12 = $$5.k($$1, $$4);
      boolean $$13 = !ehu.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract eac d();

   public ead a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract eac e();

   public ead a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(cpm var1);

   protected void a(cpn $$0, gu $$1, dfa $$2, ha $$3, ead $$4) {
      if ($$2.b() instanceof cxa) {
         ((cxa)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(cpn var1, gu var2, dfa var3);

   private static short a(gu $$0, gu $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(cpp $$0, gu $$1, int $$2, ha $$3, dfa $$4, gu $$5, Short2ObjectMap<Pair<dfa, ead>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (ha $$9 : ha.c.a) {
         if ($$9 != $$3) {
            gu $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<dfa, ead> $$12 = (Pair<dfa, ead>)$$6.computeIfAbsent($$11, $$2x -> {
               dfa $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            dfa $$13 = (dfa)$$12.getFirst();
            ead $$14 = (ead)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  gu $$4x = $$10.d();
                  dfa $$5x = $$0.a_($$4x);
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

   private boolean a(cos $$0, eac $$1, gu $$2, dfa $$3, gu $$4, dfa $$5) {
      if (!this.a(ha.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(cos $$0, eac $$1, gu $$2, dfa $$3, ha $$4, gu $$5, dfa $$6, ead $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(ead $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(cpp var1);

   private int a(cpp $$0, gu $$1) {
      int $$2 = 0;

      for (ha $$3 : ha.c.a) {
         gu $$4 = $$1.a($$3);
         ead $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<ha, ead> b(cpm $$0, gu $$1, dfa $$2) {
      int $$3 = 1000;
      Map<ha, ead> $$4 = Maps.newEnumMap(ha.class);
      Short2ObjectMap<Pair<dfa, ead>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (ha $$7 : ha.c.a) {
         gu $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<dfa, ead> $$10 = (Pair<dfa, ead>)$$5.computeIfAbsent($$9, $$2x -> {
            dfa $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         dfa $$11 = (dfa)$$10.getFirst();
         ead $$12 = (ead)$$10.getSecond();
         ead $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            gu $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               dfa $$5x = $$0.a_($$14);
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

   private boolean a(cos $$0, gu $$1, dfa $$2, eac $$3) {
      csm $$4 = $$2.b();
      if ($$4 instanceof cxa $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof cuo || $$2.a(apl.aw) || $$2.a(csn.cO) || $$2.a(csn.dS) || $$2.a(csn.nd)) {
         return false;
      } else {
         return !$$2.a(csn.ee) && !$$2.a(csn.fx) && !$$2.a(csn.kF) && !$$2.a(csn.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(cos $$0, gu $$1, dfa $$2, ha $$3, gu $$4, dfa $$5, ead $$6, eac $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(cpp var1);

   protected int a(cpm $$0, gu $$1, ead $$2, ead $$3) {
      return this.a((cpp)$$0);
   }

   @Override
   public void b(cpm $$0, gu $$1, ead $$2) {
      if (!$$2.b()) {
         ead $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, csn.a.n(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            dfa $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(ead $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(ead $$0, cos $$1, gu $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(ead $$0, cos $$1, gu $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(ead $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(ead var1);

   @Override
   public ehx b(ead $$0, cos $$1, gu $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? ehu.b() : this.g.computeIfAbsent($$0, $$2x -> ehu.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
