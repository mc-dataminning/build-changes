import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dbz {
   public static final int a = 24;
   public static final int b = 1000;
   public static final float c = 0.5F;
   private static final int e = 32;
   public static final int d = 11;
   final boolean f;
   private final arz<cvf> g;
   private final int h;
   private final int i;
   private final int j;
   private final int k;
   private List<dbz.a> l = new ArrayList<>();
   private static final Logger m = LogUtils.getLogger();

   public dbz(boolean $$0, arz<cvf> $$1, int $$2, int $$3, int $$4, int $$5) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.j = $$4;
      this.k = $$5;
   }

   public static dbz a() {
      return new dbz(false, ark.bL, 10, 4, 10, 5);
   }

   public static dbz b() {
      return new dbz(true, ark.bM, 50, 1, 5, 10);
   }

   public arz<cvf> c() {
      return this.g;
   }

   public int d() {
      return this.h;
   }

   public int e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }

   public int g() {
      return this.k;
   }

   public boolean h() {
      return this.f;
   }

   @VisibleForTesting
   public List<dbz.a> i() {
      return this.l;
   }

   public void j() {
      this.l.clear();
   }

   public void a(sd $$0) {
      if ($$0.b("cursors", 9)) {
         this.l.clear();
         List<dbz.a> $$1 = (List<dbz.a>)dbz.a.b.listOf().parse(new Dynamic(sr.a, $$0.c("cursors", 10))).resultOrPartial(m::error).orElseGet(ArrayList::new);
         int $$2 = Math.min($$1.size(), 32);

         for (int $$3 = 0; $$3 < $$2; $$3++) {
            this.a($$1.get($$3));
         }
      }
   }

   public void b(sd $$0) {
      dbz.a.b.listOf().encodeStart(sr.a, this.l).resultOrPartial(m::error).ifPresent($$1 -> $$0.a("cursors", $$1));
   }

   public void a(hx $$0, int $$1) {
      while ($$1 > 0) {
         int $$2 = Math.min($$1, 1000);
         this.a(new dbz.a($$0, $$2));
         $$1 -= $$2;
      }
   }

   private void a(dbz.a $$0) {
      if (this.l.size() < 32) {
         this.l.add($$0);
      }
   }

   public void a(csg $$0, hx $$1, atw $$2, boolean $$3) {
      if (!this.l.isEmpty()) {
         List<dbz.a> $$4 = new ArrayList<>();
         Map<hx, dbz.a> $$5 = new HashMap<>();
         Object2IntMap<hx> $$6 = new Object2IntOpenHashMap();

         for (dbz.a $$7 : this.l) {
            $$7.a($$0, $$1, $$2, this, $$3);
            if ($$7.e <= 0) {
               $$0.c(3006, $$7.a(), 0);
            } else {
               hx $$8 = $$7.a();
               $$6.computeInt($$8, ($$1x, $$2x) -> ($$2x == null ? 0 : $$2x) + $$7.e);
               dbz.a $$9 = $$5.get($$8);
               if ($$9 == null) {
                  $$5.put($$8, $$7);
                  $$4.add($$7);
               } else if (!this.h() && $$7.e + $$9.e <= 1000) {
                  $$9.a($$7);
               } else {
                  $$4.add($$7);
                  if ($$7.e < $$9.e) {
                     $$5.put($$8, $$7);
                  }
               }
            }
         }

         ObjectIterator var16 = $$6.object2IntEntrySet().iterator();

         while (var16.hasNext()) {
            Entry<hx> $$10 = (Entry<hx>)var16.next();
            hx $$11 = (hx)$$10.getKey();
            int $$12 = $$10.getIntValue();
            dbz.a $$13 = $$5.get($$11);
            Collection<ib> $$14 = $$13 == null ? null : $$13.d();
            if ($$12 > 0 && $$14 != null) {
               int $$15 = (int)(Math.log1p((double)$$12) / 2.3F) + 1;
               int $$16 = ($$15 << 6) + dae.a($$14);
               $$0.c(3006, $$11, $$16);
            }
         }

         this.l = $$4;
      }
   }

   public static class a {
      private static final ObjectArrayList<ja> c = ac.a(
         new ObjectArrayList(18),
         $$0 -> hx.b(new hx(-1, -1, -1), new hx(1, 1, 1))
               .filter($$0x -> ($$0x.u() == 0 || $$0x.v() == 0 || $$0x.w() == 0) && !$$0x.equals(hx.b))
               .map(hx::i)
               .forEach($$0::add)
      );
      public static final int a = 1;
      private hx d;
      int e;
      private int f;
      private int g;
      @Nullable
      private Set<ib> h;
      private static final Codec<Set<ib>> i = ib.g.listOf().xmap($$0 -> Sets.newEnumSet($$0, ib.class), Lists::newArrayList);
      public static final Codec<dbz.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  hx.a.fieldOf("pos").forGetter(dbz.a::a),
                  Codec.intRange(0, 1000).fieldOf("charge").orElse(0).forGetter(dbz.a::b),
                  Codec.intRange(0, 1).fieldOf("decay_delay").orElse(1).forGetter(dbz.a::c),
                  Codec.intRange(0, Integer.MAX_VALUE).fieldOf("update_delay").orElse(0).forGetter($$0x -> $$0x.f),
                  i.optionalFieldOf("facings").forGetter($$0x -> Optional.ofNullable($$0x.d()))
               )
               .apply($$0, dbz.a::new)
      );

      private a(hx $$0, int $$1, int $$2, int $$3, Optional<Set<ib>> $$4) {
         this.d = $$0;
         this.e = $$1;
         this.g = $$2;
         this.f = $$3;
         this.h = $$4.orElse(null);
      }

      public a(hx $$0, int $$1) {
         this($$0, $$1, 1, 0, Optional.empty());
      }

      public hx a() {
         return this.d;
      }

      public int b() {
         return this.e;
      }

      public int c() {
         return this.g;
      }

      @Nullable
      public Set<ib> d() {
         return this.h;
      }

      private boolean a(csg $$0, hx $$1, boolean $$2) {
         if (this.e <= 0) {
            return false;
         } else if ($$2) {
            return true;
         } else {
            return $$0 instanceof ami $$3 ? $$3.m($$1) : false;
         }
      }

      public void a(csg $$0, hx $$1, atw $$2, dbz $$3, boolean $$4) {
         if (this.a($$0, $$1, $$3.f)) {
            if (this.f > 0) {
               this.f--;
            } else {
               dhn $$5 = $$0.a_(this.d);
               dbu $$6 = a($$5);
               if ($$4 && $$6.a($$0, this.d, $$5, this.h, $$3.h())) {
                  if ($$6.d()) {
                     $$5 = $$0.a_(this.d);
                     $$6 = a($$5);
                  }

                  $$0.a(null, this.d, aqv.uB, aqw.e, 1.0F, 1.0F);
               }

               this.e = $$6.a(this, $$0, $$1, $$2, $$3, $$4);
               if (this.e <= 0) {
                  $$6.a($$0, $$5, this.d, $$2);
               } else {
                  hx $$7 = a($$0, this.d, $$2);
                  if ($$7 != null) {
                     $$6.a($$0, $$5, this.d, $$2);
                     this.d = $$7.i();
                     if ($$3.h() && !this.d.a(new ja($$1.u(), this.d.v(), $$1.w()), 15.0)) {
                        this.e = 0;
                        return;
                     }

                     $$5 = $$0.a_($$7);
                  }

                  if ($$5.b() instanceof dbu) {
                     this.h = dae.h($$5);
                  }

                  this.g = $$6.i_(this.g);
                  this.f = $$6.b();
               }
            }
         }
      }

      void a(dbz.a $$0) {
         this.e = this.e + $$0.e;
         $$0.e = 0;
         this.f = Math.min(this.f, $$0.f);
      }

      private static dbu a(dhn $$0) {
         return $$0.b() instanceof dbu $$1 ? $$1 : dbu.t_;
      }

      private static List<ja> a(atw $$0) {
         return ac.a(c, $$0);
      }

      @Nullable
      private static hx a(csg $$0, hx $$1, atw $$2) {
         hx.a $$3 = $$1.j();
         hx.a $$4 = $$1.j();

         for (ja $$5 : a($$2)) {
            $$4.a($$1, $$5);
            dhn $$6 = $$0.a_($$4);
            if ($$6.b() instanceof dbu && a($$0, $$1, $$4)) {
               $$3.g($$4);
               if (dca.a($$0, $$6, $$4)) {
                  break;
               }
            }
         }

         return $$3.equals($$1) ? null : $$3;
      }

      private static boolean a(csg $$0, hx $$1, hx $$2) {
         if ($$1.k($$2) == 1) {
            return true;
         } else {
            hx $$3 = $$2.b($$1);
            ib $$4 = ib.a(ib.a.a, $$3.u() < 0 ? ib.b.b : ib.b.a);
            ib $$5 = ib.a(ib.a.b, $$3.v() < 0 ? ib.b.b : ib.b.a);
            ib $$6 = ib.a(ib.a.c, $$3.w() < 0 ? ib.b.b : ib.b.a);
            if ($$3.u() == 0) {
               return a($$0, $$1, $$5) || a($$0, $$1, $$6);
            } else {
               return $$3.v() == 0 ? a($$0, $$1, $$4) || a($$0, $$1, $$6) : a($$0, $$1, $$4) || a($$0, $$1, $$5);
            }
         }
      }

      private static boolean a(csg $$0, hx $$1, ib $$2) {
         hx $$3 = $$1.a($$2);
         return !$$0.a_($$3).d($$0, $$3, $$2.g());
      }
   }
}
