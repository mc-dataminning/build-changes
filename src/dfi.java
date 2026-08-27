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

public class dfi {
   public static final int a = 24;
   public static final int b = 1000;
   public static final float c = 0.5F;
   private static final int e = 32;
   public static final int d = 11;
   final boolean f;
   private final auo<cyo> g;
   private final int h;
   private final int i;
   private final int j;
   private final int k;
   private List<dfi.a> l = new ArrayList<>();
   private static final Logger m = LogUtils.getLogger();

   public dfi(boolean $$0, auo<cyo> $$1, int $$2, int $$3, int $$4, int $$5) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.j = $$4;
      this.k = $$5;
   }

   public static dfi a() {
      return new dfi(false, atz.bL, 10, 4, 10, 5);
   }

   public static dfi b() {
      return new dfi(true, atz.bM, 50, 1, 5, 10);
   }

   public auo<cyo> c() {
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
   public List<dfi.a> i() {
      return this.l;
   }

   public void j() {
      this.l.clear();
   }

   public void a(sw $$0) {
      if ($$0.b("cursors", 9)) {
         this.l.clear();
         List<dfi.a> $$1 = (List<dfi.a>)dfi.a.b.listOf().parse(new Dynamic(tk.a, $$0.c("cursors", 10))).resultOrPartial(m::error).orElseGet(ArrayList::new);
         int $$2 = Math.min($$1.size(), 32);

         for (int $$3 = 0; $$3 < $$2; $$3++) {
            this.a($$1.get($$3));
         }
      }
   }

   public void b(sw $$0) {
      dfi.a.b.listOf().encodeStart(tk.a, this.l).resultOrPartial(m::error).ifPresent($$1 -> $$0.a("cursors", $$1));
   }

   public void a(hz $$0, int $$1) {
      while ($$1 > 0) {
         int $$2 = Math.min($$1, 1000);
         this.a(new dfi.a($$0, $$2));
         $$1 -= $$2;
      }
   }

   private void a(dfi.a $$0) {
      if (this.l.size() < 32) {
         this.l.add($$0);
      }
   }

   public void a(cvo $$0, hz $$1, awo $$2, boolean $$3) {
      if (!this.l.isEmpty()) {
         List<dfi.a> $$4 = new ArrayList<>();
         Map<hz, dfi.a> $$5 = new HashMap<>();
         Object2IntMap<hz> $$6 = new Object2IntOpenHashMap();

         for (dfi.a $$7 : this.l) {
            $$7.a($$0, $$1, $$2, this, $$3);
            if ($$7.e <= 0) {
               $$0.c(3006, $$7.a(), 0);
            } else {
               hz $$8 = $$7.a();
               $$6.computeInt($$8, ($$1x, $$2x) -> ($$2x == null ? 0 : $$2x) + $$7.e);
               dfi.a $$9 = $$5.get($$8);
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
            Entry<hz> $$10 = (Entry<hz>)var16.next();
            hz $$11 = (hz)$$10.getKey();
            int $$12 = $$10.getIntValue();
            dfi.a $$13 = $$5.get($$11);
            Collection<ie> $$14 = $$13 == null ? null : $$13.d();
            if ($$12 > 0 && $$14 != null) {
               int $$15 = (int)(Math.log1p((double)$$12) / 2.3F) + 1;
               int $$16 = ($$15 << 6) + ddn.a($$14);
               $$0.c(3006, $$11, $$16);
            }
         }

         this.l = $$4;
      }
   }

   public static class a {
      private static final ObjectArrayList<jd> c = ac.a(
         new ObjectArrayList(18),
         $$0 -> hz.b(new hz(-1, -1, -1), new hz(1, 1, 1))
               .filter($$0x -> ($$0x.u() == 0 || $$0x.v() == 0 || $$0x.w() == 0) && !$$0x.equals(hz.c))
               .map(hz::i)
               .forEach($$0::add)
      );
      public static final int a = 1;
      private hz d;
      int e;
      private int f;
      private int g;
      @Nullable
      private Set<ie> h;
      private static final Codec<Set<ie>> i = ie.g.listOf().xmap($$0 -> Sets.newEnumSet($$0, ie.class), Lists::newArrayList);
      public static final Codec<dfi.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  hz.a.fieldOf("pos").forGetter(dfi.a::a),
                  Codec.intRange(0, 1000).fieldOf("charge").orElse(0).forGetter(dfi.a::b),
                  Codec.intRange(0, 1).fieldOf("decay_delay").orElse(1).forGetter(dfi.a::c),
                  Codec.intRange(0, Integer.MAX_VALUE).fieldOf("update_delay").orElse(0).forGetter($$0x -> $$0x.f),
                  i.optionalFieldOf("facings").forGetter($$0x -> Optional.ofNullable($$0x.d()))
               )
               .apply($$0, dfi.a::new)
      );

      private a(hz $$0, int $$1, int $$2, int $$3, Optional<Set<ie>> $$4) {
         this.d = $$0;
         this.e = $$1;
         this.g = $$2;
         this.f = $$3;
         this.h = $$4.orElse(null);
      }

      public a(hz $$0, int $$1) {
         this($$0, $$1, 1, 0, Optional.empty());
      }

      public hz a() {
         return this.d;
      }

      public int b() {
         return this.e;
      }

      public int c() {
         return this.g;
      }

      @Nullable
      public Set<ie> d() {
         return this.h;
      }

      private boolean a(cvo $$0, hz $$1, boolean $$2) {
         if (this.e <= 0) {
            return false;
         } else if ($$2) {
            return true;
         } else {
            return $$0 instanceof aov $$3 ? $$3.n($$1) : false;
         }
      }

      public void a(cvo $$0, hz $$1, awo $$2, dfi $$3, boolean $$4) {
         if (this.a($$0, $$1, $$3.f)) {
            if (this.f > 0) {
               this.f--;
            } else {
               dlf $$5 = $$0.a_(this.d);
               dfd $$6 = a($$5);
               if ($$4 && $$6.a($$0, this.d, $$5, this.h, $$3.h())) {
                  if ($$6.d()) {
                     $$5 = $$0.a_(this.d);
                     $$6 = a($$5);
                  }

                  $$0.a(null, this.d, atk.vl, atl.e, 1.0F, 1.0F);
               }

               this.e = $$6.a(this, $$0, $$1, $$2, $$3, $$4);
               if (this.e <= 0) {
                  $$6.a($$0, $$5, this.d, $$2);
               } else {
                  hz $$7 = a($$0, this.d, $$2);
                  if ($$7 != null) {
                     $$6.a($$0, $$5, this.d, $$2);
                     this.d = $$7.i();
                     if ($$3.h() && !this.d.a(new jd($$1.u(), this.d.v(), $$1.w()), 15.0)) {
                        this.e = 0;
                        return;
                     }

                     $$5 = $$0.a_($$7);
                  }

                  if ($$5.b() instanceof dfd) {
                     this.h = ddn.m($$5);
                  }

                  this.g = $$6.i_(this.g);
                  this.f = $$6.b();
               }
            }
         }
      }

      void a(dfi.a $$0) {
         this.e = this.e + $$0.e;
         $$0.e = 0;
         this.f = Math.min(this.f, $$0.f);
      }

      private static dfd a(dlf $$0) {
         return $$0.b() instanceof dfd $$1 ? $$1 : dfd.v_;
      }

      private static List<jd> a(awo $$0) {
         return ac.a(c, $$0);
      }

      @Nullable
      private static hz a(cvo $$0, hz $$1, awo $$2) {
         hz.a $$3 = $$1.j();
         hz.a $$4 = $$1.j();

         for (jd $$5 : a($$2)) {
            $$4.a($$1, $$5);
            dlf $$6 = $$0.a_($$4);
            if ($$6.b() instanceof dfd && a($$0, $$1, $$4)) {
               $$3.g($$4);
               if (dfj.a($$0, $$6, $$4)) {
                  break;
               }
            }
         }

         return $$3.equals($$1) ? null : $$3;
      }

      private static boolean a(cvo $$0, hz $$1, hz $$2) {
         if ($$1.k($$2) == 1) {
            return true;
         } else {
            hz $$3 = $$2.b($$1);
            ie $$4 = ie.a(ie.a.a, $$3.u() < 0 ? ie.b.b : ie.b.a);
            ie $$5 = ie.a(ie.a.b, $$3.v() < 0 ? ie.b.b : ie.b.a);
            ie $$6 = ie.a(ie.a.c, $$3.w() < 0 ? ie.b.b : ie.b.a);
            if ($$3.u() == 0) {
               return a($$0, $$1, $$5) || a($$0, $$1, $$6);
            } else {
               return $$3.v() == 0 ? a($$0, $$1, $$4) || a($$0, $$1, $$6) : a($$0, $$1, $$4) || a($$0, $$1, $$5);
            }
         }
      }

      private static boolean a(cvo $$0, hz $$1, ie $$2) {
         hz $$3 = $$1.a($$2);
         return !$$0.a_($$3).d($$0, $$3, $$2.g());
      }
   }
}
