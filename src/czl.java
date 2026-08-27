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

public class czl {
   public static final int a = 24;
   public static final int b = 1000;
   public static final float c = 0.5F;
   private static final int e = 32;
   public static final int d = 11;
   final boolean f;
   private final aqd<csq> g;
   private final int h;
   private final int i;
   private final int j;
   private final int k;
   private List<czl.a> l = new ArrayList<>();
   private static final Logger m = LogUtils.getLogger();

   public czl(boolean $$0, aqd<csq> $$1, int $$2, int $$3, int $$4, int $$5) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.j = $$4;
      this.k = $$5;
   }

   public static czl a() {
      return new czl(false, apo.bL, 10, 4, 10, 5);
   }

   public static czl b() {
      return new czl(true, apo.bM, 50, 1, 5, 10);
   }

   public aqd<csq> c() {
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
   public List<czl.a> i() {
      return this.l;
   }

   public void j() {
      this.l.clear();
   }

   public void a(qu $$0) {
      if ($$0.b("cursors", 9)) {
         this.l.clear();
         List<czl.a> $$1 = (List<czl.a>)czl.a.b.listOf().parse(new Dynamic(rf.a, $$0.c("cursors", 10))).resultOrPartial(m::error).orElseGet(ArrayList::new);
         int $$2 = Math.min($$1.size(), 32);

         for (int $$3 = 0; $$3 < $$2; $$3++) {
            this.a($$1.get($$3));
         }
      }
   }

   public void b(qu $$0) {
      czl.a.b.listOf().encodeStart(rf.a, this.l).resultOrPartial(m::error).ifPresent($$1 -> $$0.a("cursors", $$1));
   }

   public void a(gw $$0, int $$1) {
      while ($$1 > 0) {
         int $$2 = Math.min($$1, 1000);
         this.a(new czl.a($$0, $$2));
         $$1 -= $$2;
      }
   }

   private void a(czl.a $$0) {
      if (this.l.size() < 32) {
         this.l.add($$0);
      }
   }

   public void a(cpr $$0, gw $$1, arx $$2, boolean $$3) {
      if (!this.l.isEmpty()) {
         List<czl.a> $$4 = new ArrayList<>();
         Map<gw, czl.a> $$5 = new HashMap<>();
         Object2IntMap<gw> $$6 = new Object2IntOpenHashMap();

         for (czl.a $$7 : this.l) {
            $$7.a($$0, $$1, $$2, this, $$3);
            if ($$7.e <= 0) {
               $$0.c(3006, $$7.a(), 0);
            } else {
               gw $$8 = $$7.a();
               $$6.computeInt($$8, ($$1x, $$2x) -> ($$2x == null ? 0 : $$2x) + $$7.e);
               czl.a $$9 = $$5.get($$8);
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
            Entry<gw> $$10 = (Entry<gw>)var16.next();
            gw $$11 = (gw)$$10.getKey();
            int $$12 = $$10.getIntValue();
            czl.a $$13 = $$5.get($$11);
            Collection<hc> $$14 = $$13 == null ? null : $$13.d();
            if ($$12 > 0 && $$14 != null) {
               int $$15 = (int)(Math.log1p((double)$$12) / 2.3F) + 1;
               int $$16 = ($$15 << 6) + cxo.a($$14);
               $$0.c(3006, $$11, $$16);
            }
         }

         this.l = $$4;
      }
   }

   public static class a {
      private static final ObjectArrayList<ib> c = ac.a(
         new ObjectArrayList(18),
         $$0 -> gw.b(new gw(-1, -1, -1), new gw(1, 1, 1))
               .filter($$0x -> ($$0x.u() == 0 || $$0x.v() == 0 || $$0x.w() == 0) && !$$0x.equals(gw.b))
               .map(gw::i)
               .forEach($$0::add)
      );
      public static final int a = 1;
      private gw d;
      int e;
      private int f;
      private int g;
      @Nullable
      private Set<hc> h;
      private static final Codec<Set<hc>> i = hc.g.listOf().xmap($$0 -> Sets.newEnumSet($$0, hc.class), Lists::newArrayList);
      public static final Codec<czl.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  gw.a.fieldOf("pos").forGetter(czl.a::a),
                  Codec.intRange(0, 1000).fieldOf("charge").orElse(0).forGetter(czl.a::b),
                  Codec.intRange(0, 1).fieldOf("decay_delay").orElse(1).forGetter(czl.a::c),
                  Codec.intRange(0, Integer.MAX_VALUE).fieldOf("update_delay").orElse(0).forGetter($$0x -> $$0x.f),
                  i.optionalFieldOf("facings").forGetter($$0x -> Optional.ofNullable($$0x.d()))
               )
               .apply($$0, czl.a::new)
      );

      private a(gw $$0, int $$1, int $$2, int $$3, Optional<Set<hc>> $$4) {
         this.d = $$0;
         this.e = $$1;
         this.g = $$2;
         this.f = $$3;
         this.h = $$4.orElse(null);
      }

      public a(gw $$0, int $$1) {
         this($$0, $$1, 1, 0, Optional.empty());
      }

      public gw a() {
         return this.d;
      }

      public int b() {
         return this.e;
      }

      public int c() {
         return this.g;
      }

      @Nullable
      public Set<hc> d() {
         return this.h;
      }

      private boolean a(cpr $$0, gw $$1, boolean $$2) {
         if (this.e <= 0) {
            return false;
         } else if ($$2) {
            return true;
         } else {
            return $$0 instanceof akn $$3 ? $$3.m($$1) : false;
         }
      }

      public void a(cpr $$0, gw $$1, arx $$2, czl $$3, boolean $$4) {
         if (this.a($$0, $$1, $$3.f)) {
            if (this.f > 0) {
               this.f--;
            } else {
               dfe $$5 = $$0.a_(this.d);
               czg $$6 = a($$5);
               if ($$4 && $$6.a($$0, this.d, $$5, this.h, $$3.h())) {
                  if ($$6.c()) {
                     $$5 = $$0.a_(this.d);
                     $$6 = a($$5);
                  }

                  $$0.a(null, this.d, aoz.ug, apa.e, 1.0F, 1.0F);
               }

               this.e = $$6.a(this, $$0, $$1, $$2, $$3, $$4);
               if (this.e <= 0) {
                  $$6.a($$0, $$5, this.d, $$2);
               } else {
                  gw $$7 = a($$0, this.d, $$2);
                  if ($$7 != null) {
                     $$6.a($$0, $$5, this.d, $$2);
                     this.d = $$7.i();
                     if ($$3.h() && !this.d.a(new ib($$1.u(), this.d.v(), $$1.w()), 15.0)) {
                        this.e = 0;
                        return;
                     }

                     $$5 = $$0.a_($$7);
                  }

                  if ($$5.b() instanceof czg) {
                     this.h = cxo.h($$5);
                  }

                  this.g = $$6.i_(this.g);
                  this.f = $$6.a();
               }
            }
         }
      }

      void a(czl.a $$0) {
         this.e = this.e + $$0.e;
         $$0.e = 0;
         this.f = Math.min(this.f, $$0.f);
      }

      private static czg a(dfe $$0) {
         return $$0.b() instanceof czg $$1 ? $$1 : czg.t_;
      }

      private static List<ib> a(arx $$0) {
         return ac.a(c, $$0);
      }

      @Nullable
      private static gw a(cpr $$0, gw $$1, arx $$2) {
         gw.a $$3 = $$1.j();
         gw.a $$4 = $$1.j();

         for (ib $$5 : a($$2)) {
            $$4.a($$1, $$5);
            dfe $$6 = $$0.a_($$4);
            if ($$6.b() instanceof czg && a($$0, $$1, $$4)) {
               $$3.g($$4);
               if (czm.a($$0, $$6, $$4)) {
                  break;
               }
            }
         }

         return $$3.equals($$1) ? null : $$3;
      }

      private static boolean a(cpr $$0, gw $$1, gw $$2) {
         if ($$1.k($$2) == 1) {
            return true;
         } else {
            gw $$3 = $$2.b($$1);
            hc $$4 = hc.a(hc.a.a, $$3.u() < 0 ? hc.b.b : hc.b.a);
            hc $$5 = hc.a(hc.a.b, $$3.v() < 0 ? hc.b.b : hc.b.a);
            hc $$6 = hc.a(hc.a.c, $$3.w() < 0 ? hc.b.b : hc.b.a);
            if ($$3.u() == 0) {
               return a($$0, $$1, $$5) || a($$0, $$1, $$6);
            } else {
               return $$3.v() == 0 ? a($$0, $$1, $$4) || a($$0, $$1, $$6) : a($$0, $$1, $$4) || a($$0, $$1, $$5);
            }
         }
      }

      private static boolean a(cpr $$0, gw $$1, hc $$2) {
         gw $$3 = $$1.a($$2);
         return !$$0.a_($$3).d($$0, $$3, $$2.g());
      }
   }
}
