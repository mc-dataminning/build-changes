import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class fnr implements AutoCloseable {
   private static final azr a = azr.a();
   private static final float b = 32.0F;
   private final gxt c;
   private final alh d;
   private fnv e;
   private fnv f;
   private List<fbs.a> g = List.of();
   private List<fbs> h = List.of();
   private final fno<fnv> i = new fno<>(fnv[]::new, fnv[][]::new);
   private final fno<fnr.a> j = new fno<>(fnr.a[]::new, fnr.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<fns> l = Lists.newArrayList();

   public fnr(gxt $$0, alh $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<fbs.a> $$0, Set<fnq> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<fnq> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = fnx.b.bake(this::a);
      this.f = fnx.a.bake(this::a);
   }

   private List<fbs> b(List<fbs.a> $$0, Set<fnq> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<fbs> $$3 = new ArrayList<>();

      for (fbs.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<fbs> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (fbs $$3x : $$3) {
            fbr $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fnx.b) {
                  ((IntList)this.k.computeIfAbsent(azj.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
               }
               break;
            }
         }
      });
      return $$3.stream().filter($$5::contains).toList();
   }

   @Override
   public void close() {
      this.d();
   }

   private void d() {
      for (fns $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(fbr $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fnr.a b(int $$0) {
      fbr $$1 = null;

      for (fbs $$2 : this.h) {
         fbr $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fnr.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fnr.a($$1, fnx.b) : fnr.a.c;
   }

   public fbr a(int $$0, boolean $$1) {
      return this.j.a($$0, this::b).a($$1);
   }

   private fnv c(int $$0) {
      for (fbs $$1 : this.h) {
         fbr $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fnv a(int $$0) {
      return this.i.a($$0, this::c);
   }

   private fnv a(fbt $$0) {
      for (fns $$1 : this.l) {
         fnv $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      alh $$3 = this.d.g("/" + this.l.size());
      boolean $$4 = $$0.c();
      fnt $$5 = $$4 ? fnt.b($$3) : fnt.a($$3);
      fns $$6 = new fns($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      fnv $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fnv a(fbr $$0) {
      IntList $$1 = (IntList)this.k.get(azj.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public alh a() {
      return this.d;
   }

   public fnv b() {
      return this.f;
   }

   static record a(fbr a, fbr b) {
      static final fnr.a c = new fnr.a(fnx.b, fnx.b);

      fbr a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
