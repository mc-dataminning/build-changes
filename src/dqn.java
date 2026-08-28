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

public class dqn {
   public static final int a = 24;
   public static final int b = 1000;
   public static final float c = 0.5F;
   private static final int f = 32;
   public static final int d = 11;
   public static final int e = 1024;
   final boolean g;
   private final axf<djn> h;
   private final int i;
   private final int j;
   private final int k;
   private final int l;
   private List<dqn.a> m = new ArrayList<>();
   private static final Logger n = LogUtils.getLogger();

   public dqn(boolean $$0, axf<djn> $$1, int $$2, int $$3, int $$4, int $$5) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   public static dqn a() {
      return new dqn(false, awp.bU, 10, 4, 10, 5);
   }

   public static dqn b() {
      return new dqn(true, awp.bV, 50, 1, 5, 10);
   }

   public axf<djn> c() {
      return this.h;
   }

   public int d() {
      return this.i;
   }

   public int e() {
      return this.j;
   }

   public int f() {
      return this.k;
   }

   public int g() {
      return this.l;
   }

   public boolean h() {
      return this.g;
   }

   @VisibleForTesting
   public List<dqn.a> i() {
      return this.m;
   }

   public void j() {
      this.m.clear();
   }

   public void a(tq $$0) {
      if ($$0.b("cursors", 9)) {
         this.m.clear();
         List<dqn.a> $$1 = (List<dqn.a>)dqn.a.b.listOf().parse(new Dynamic(ue.a, $$0.c("cursors", 10))).resultOrPartial(n::error).orElseGet(ArrayList::new);
         int $$2 = Math.min($$1.size(), 32);

         for (int $$3 = 0; $$3 < $$2; $$3++) {
            this.a($$1.get($$3));
         }
      }
   }

   public void b(tq $$0) {
      dqn.a.b.listOf().encodeStart(ue.a, this.m).resultOrPartial(n::error).ifPresent($$1 -> $$0.a("cursors", $$1));
   }

   public void a(ji $$0, int $$1) {
      while ($$1 > 0) {
         int $$2 = Math.min($$1, 1000);
         this.a(new dqn.a($$0, $$2));
         $$1 -= $$2;
      }
   }

   private void a(dqn.a $$0) {
      if (this.m.size() < 32) {
         this.m.add($$0);
      }
   }

   public void a(dgk $$0, ji $$1, azh $$2, boolean $$3) {
      if (!this.m.isEmpty()) {
         List<dqn.a> $$4 = new ArrayList<>();
         Map<ji, dqn.a> $$5 = new HashMap<>();
         Object2IntMap<ji> $$6 = new Object2IntOpenHashMap();

         for (dqn.a $$7 : this.m) {
            if (!$$7.a($$1)) {
               $$7.a($$0, $$1, $$2, this, $$3);
               if ($$7.e <= 0) {
                  $$0.c(3006, $$7.a(), 0);
               } else {
                  ji $$8 = $$7.a();
                  $$6.computeInt($$8, ($$1x, $$2x) -> ($$2x == null ? 0 : $$2x) + $$7.e);
                  dqn.a $$9 = $$5.get($$8);
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
         }

         ObjectIterator var16 = $$6.object2IntEntrySet().iterator();

         while (var16.hasNext()) {
            Entry<ji> $$10 = (Entry<ji>)var16.next();
            ji $$11 = (ji)$$10.getKey();
            int $$12 = $$10.getIntValue();
            dqn.a $$13 = $$5.get($$11);
            Collection<jn> $$14 = $$13 == null ? null : $$13.d();
            if ($$12 > 0 && $$14 != null) {
               int $$15 = (int)(Math.log1p((double)$$12) / 2.3F) + 1;
               int $$16 = ($$15 << 6) + dop.a($$14);
               $$0.c(3006, $$11, $$16);
            }
         }

         this.m = $$4;
      }
   }

   public static class a {
      private static final ObjectArrayList<km> c = af.a(
         new ObjectArrayList(18),
         $$0 -> ji.d(new ji(-1, -1, -1), new ji(1, 1, 1))
               .filter($$0x -> ($$0x.u() == 0 || $$0x.v() == 0 || $$0x.w() == 0) && !$$0x.equals(ji.c))
               .map(ji::j)
               .forEach($$0::add)
      );
      public static final int a = 1;
      private ji d;
      int e;
      private int f;
      private int g;
      @Nullable
      private Set<jn> h;
      private static final Codec<Set<jn>> i = jn.g.listOf().xmap($$0 -> Sets.newEnumSet($$0, jn.class), Lists::newArrayList);
      public static final Codec<dqn.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ji.a.fieldOf("pos").forGetter(dqn.a::a),
                  Codec.intRange(0, 1000).fieldOf("charge").orElse(0).forGetter(dqn.a::b),
                  Codec.intRange(0, 1).fieldOf("decay_delay").orElse(1).forGetter(dqn.a::c),
                  Codec.intRange(0, Integer.MAX_VALUE).fieldOf("update_delay").orElse(0).forGetter($$0x -> $$0x.f),
                  i.lenientOptionalFieldOf("facings").forGetter($$0x -> Optional.ofNullable($$0x.d()))
               )
               .apply($$0, dqn.a::new)
      );

      private a(ji $$0, int $$1, int $$2, int $$3, Optional<Set<jn>> $$4) {
         this.d = $$0;
         this.e = $$1;
         this.g = $$2;
         this.f = $$3;
         this.h = $$4.orElse(null);
      }

      public a(ji $$0, int $$1) {
         this($$0, $$1, 1, 0, Optional.empty());
      }

      public ji a() {
         return this.d;
      }

      boolean a(ji $$0) {
         return this.d.l($$0) > 1024;
      }

      public int b() {
         return this.e;
      }

      public int c() {
         return this.g;
      }

      @Nullable
      public Set<jn> d() {
         return this.h;
      }

      private boolean a(dgk $$0, ji $$1, boolean $$2) {
         if (this.e <= 0) {
            return false;
         } else if ($$2) {
            return true;
         } else {
            return $$0 instanceof ard $$3 ? $$3.n($$1) : false;
         }
      }

      public void a(dgk $$0, ji $$1, azh $$2, dqn $$3, boolean $$4) {
         if (this.a($$0, $$1, $$3.g)) {
            if (this.f > 0) {
               this.f--;
            } else {
               dwy $$5 = $$0.a_(this.d);
               dqi $$6 = a($$5);
               if ($$4 && $$6.a($$0, this.d, $$5, this.h, $$3.h())) {
                  if ($$6.d()) {
                     $$5 = $$0.a_(this.d);
                     $$6 = a($$5);
                  }

                  $$0.a(null, this.d, awa.wt, awb.e, 1.0F, 1.0F);
               }

               this.e = $$6.a(this, $$0, $$1, $$2, $$3, $$4);
               if (this.e <= 0) {
                  $$6.a($$0, $$5, this.d, $$2);
               } else {
                  ji $$7 = a($$0, this.d, $$2);
                  if ($$7 != null) {
                     $$6.a($$0, $$5, this.d, $$2);
                     this.d = $$7.j();
                     if ($$3.h() && !this.d.a(new km($$1.u(), this.d.v(), $$1.w()), 15.0)) {
                        this.e = 0;
                        return;
                     }

                     $$5 = $$0.a_($$7);
                  }

                  if ($$5.b() instanceof dqi) {
                     this.h = dop.o($$5);
                  }

                  this.g = $$6.j_(this.g);
                  this.f = $$6.b();
               }
            }
         }
      }

      void a(dqn.a $$0) {
         this.e = this.e + $$0.e;
         $$0.e = 0;
         this.f = Math.min(this.f, $$0.f);
      }

      private static dqi a(dwy $$0) {
         return $$0.b() instanceof dqi $$1 ? $$1 : dqi.u_;
      }

      private static List<km> a(azh $$0) {
         return af.a(c, $$0);
      }

      @Nullable
      private static ji a(dgk $$0, ji $$1, azh $$2) {
         ji.a $$3 = $$1.k();
         ji.a $$4 = $$1.k();

         for (km $$5 : a($$2)) {
            $$4.a($$1, $$5);
            dwy $$6 = $$0.a_($$4);
            if ($$6.b() instanceof dqi && a($$0, $$1, $$4)) {
               $$3.g($$4);
               if (dqo.a($$0, $$6, $$4)) {
                  break;
               }
            }
         }

         return $$3.equals($$1) ? null : $$3;
      }

      private static boolean a(dgk $$0, ji $$1, ji $$2) {
         if ($$1.k($$2) == 1) {
            return true;
         } else {
            ji $$3 = $$2.b($$1);
            jn $$4 = jn.a(jn.a.a, $$3.u() < 0 ? jn.b.b : jn.b.a);
            jn $$5 = jn.a(jn.a.b, $$3.v() < 0 ? jn.b.b : jn.b.a);
            jn $$6 = jn.a(jn.a.c, $$3.w() < 0 ? jn.b.b : jn.b.a);
            if ($$3.u() == 0) {
               return a($$0, $$1, $$5) || a($$0, $$1, $$6);
            } else {
               return $$3.v() == 0 ? a($$0, $$1, $$4) || a($$0, $$1, $$6) : a($$0, $$1, $$4) || a($$0, $$1, $$5);
            }
         }
      }

      private static boolean a(dgk $$0, ji $$1, jn $$2) {
         ji $$3 = $$1.a($$2);
         return !$$0.a_($$3).c($$0, $$3, $$2.g());
      }
   }
}
