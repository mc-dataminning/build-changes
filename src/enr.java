import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class enr extends ens {
   public static final dsr a = dsq.i;
   public static final dta b = dsq.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dex.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dex.a> $$0 = new Object2ByteLinkedOpenHashMap<dex.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<ent, ewi> g = Maps.newIdentityHashMap();

   @Override
   protected void a(dsb.a<ens, ent> $$0) {
      $$0.a(a);
   }

   @Override
   public evp a(dbc $$0, iz $$1, ent $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      iz.a $$5 = new iz.a();

      for (je $$6 : je.c.a) {
         $$5.a($$1, $$6);
         ent $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d()) {
                  iz $$10 = $$5.d();
                  ent $$11 = $$0.b_($$10);
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

      evp $$12 = new evp($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for (je $$13 : je.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.c(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(ent $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(dbc $$0, iz $$1, je $$2) {
      dsa $$3 = $$0.a_($$1);
      ent $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == je.b) {
         return true;
      } else {
         return $$3.b() instanceof div ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(dbw $$0, iz $$1, ent $$2) {
      if (!$$2.c()) {
         dsa $$3 = $$0.a_($$1);
         iz $$4 = $$1.d();
         dsa $$5 = $$0.a_($$4);
         ent $$6 = this.a($$0, $$4, $$5);
         if (this.a($$0, $$1, $$3, je.a, $$4, $$5, $$0.b_($$4), $$6.a())) {
            this.a($$0, $$4, $$5, je.a, $$6);
            if (this.a($$0, $$1) >= 3) {
               this.a($$0, $$1, $$2, $$3);
            }
         } else if ($$2.b() || !this.a($$0, $$6.a(), $$1, $$3, $$4, $$5)) {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private void a(dbw $$0, iz $$1, ent $$2, dsa $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<je, ent> $$5 = this.b($$0, $$1, $$3);

         for (Entry<je, ent> $$6 : $$5.entrySet()) {
            je $$7 = $$6.getKey();
            ent $$8 = $$6.getValue();
            iz $$9 = $$1.a($$7);
            dsa $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }
      }
   }

   protected ent a(dbw $$0, iz $$1, dsa $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for (je $$5 : je.c.a) {
         iz $$6 = $$1.a($$5);
         dsa $$7 = $$0.a_($$6);
         ent $$8 = $$7.u();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               $$4++;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.a($$0) && $$4 >= 2) {
         dsa $$9 = $$0.a_($$1.d());
         ent $$10 = $$9.u();
         if ($$9.e() || this.h($$10)) {
            return this.a(false);
         }
      }

      iz $$11 = $$1.c();
      dsa $$12 = $$0.a_($$11);
      ent $$13 = $$12.u();
      if (!$$13.c() && $$13.a().a(this) && this.a(je.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? enu.a.g() : this.a($$14, false);
      }
   }

   private boolean a(je $$0, dbc $$1, iz $$2, dsa $$3, iz $$4, dsa $$5) {
      Object2ByteLinkedOpenHashMap<dex.a> $$7;
      if (!$$3.b().p() && !$$5.b().p()) {
         $$7 = f.get();
      } else {
         $$7 = null;
      }

      dex.a $$8;
      if ($$7 != null) {
         $$8 = new dex.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      ewi $$11 = $$3.k($$1, $$2);
      ewi $$12 = $$5.k($$1, $$4);
      boolean $$13 = !ewf.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract ens d();

   public ent a(int $$0, boolean $$1) {
      return this.d().g().a(b, $$0).a(a, $$1);
   }

   public abstract ens e();

   public ent a(boolean $$0) {
      return this.e().g().a(a, $$0);
   }

   protected abstract boolean a(dbw var1);

   protected void a(dbx $$0, iz $$1, dsa $$2, je $$3, ent $$4) {
      if ($$2.b() instanceof djo) {
         ((djo)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.i()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }
   }

   protected abstract void a(dbx var1, iz var2, dsa var3);

   private static short a(iz $$0, iz $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(dbz $$0, iz $$1, int $$2, je $$3, dsa $$4, iz $$5, Short2ObjectMap<Pair<dsa, ent>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for (je $$9 : je.c.a) {
         if ($$9 != $$3) {
            iz $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<dsa, ent> $$12 = (Pair<dsa, ent>)$$6.computeIfAbsent($$11, $$2x -> {
               dsa $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.u());
            });
            dsa $$13 = (dsa)$$12.getFirst();
            ent $$14 = (ent)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  iz $$4x = $$10.d();
                  dsa $$5x = $$0.a_($$4x);
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

   private boolean a(dbc $$0, ens $$1, iz $$2, dsa $$3, iz $$4, dsa $$5) {
      if (!this.a(je.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.u().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(dbc $$0, ens $$1, iz $$2, dsa $$3, je $$4, iz $$5, dsa $$6, ent $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(ent $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(dbz var1);

   private int a(dbz $$0, iz $$1) {
      int $$2 = 0;

      for (je $$3 : je.c.a) {
         iz $$4 = $$1.a($$3);
         ent $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            $$2++;
         }
      }

      return $$2;
   }

   protected Map<je, ent> b(dbw $$0, iz $$1, dsa $$2) {
      int $$3 = 1000;
      Map<je, ent> $$4 = Maps.newEnumMap(je.class);
      Short2ObjectMap<Pair<dsa, ent>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for (je $$7 : je.c.a) {
         iz $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<dsa, ent> $$10 = (Pair<dsa, ent>)$$5.computeIfAbsent($$9, $$2x -> {
            dsa $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.u());
         });
         dsa $$11 = (dsa)$$10.getFirst();
         ent $$12 = (ent)$$10.getSecond();
         ent $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            iz $$14 = $$8.d();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               dsa $$5x = $$0.a_($$14);
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

   private boolean a(dbc $$0, iz $$1, dsa $$2, ens $$3) {
      dex $$4 = $$2.b();
      if ($$4 instanceof djo $$5) {
         return $$5.a(null, $$0, $$1, $$2, $$3);
      } else if ($$4 instanceof dhd || $$2.a(awo.ax) || $$2.a(dez.cO) || $$2.a(dez.dS) || $$2.a(dez.nd)) {
         return false;
      } else {
         return !$$2.a(dez.ed) && !$$2.a(dez.fx) && !$$2.a(dez.kF) && !$$2.a(dez.kN) ? !$$2.d() : false;
      }
   }

   protected boolean a(dbc $$0, iz $$1, dsa $$2, je $$3, iz $$4, dsa $$5, ent $$6, ens $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(dbz var1);

   protected int a(dbw $$0, iz $$1, ent $$2, ent $$3) {
      return this.a((dbz)$$0);
   }

   @Override
   public void b(dbw $$0, iz $$1, ent $$2) {
      if (!$$2.b()) {
         ent $$3 = this.a($$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, dez.a.o(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            dsa $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a($$0, $$1, $$2);
   }

   protected static int e(ent $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(ent $$0, dbc $$1, iz $$2) {
      return $$0.a().a($$1.b_($$2.c()).a());
   }

   @Override
   public float a(ent $$0, dbc $$1, iz $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(ent $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(ent var1);

   @Override
   public ewi b(ent $$0, dbc $$1, iz $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? ewf.b() : this.g.computeIfAbsent($$0, $$2x -> ewf.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
