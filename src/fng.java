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

public class fng implements AutoCloseable {
   private static final azn a = azn.a();
   private static final float b = 32.0F;
   private final gxh c;
   private final ale d;
   private fnk e;
   private fnk f;
   private List<fbh.a> g = List.of();
   private List<fbh> h = List.of();
   private final fnd<fnk> i = new fnd<>(fnk[]::new, fnk[][]::new);
   private final fnd<fng.a> j = new fnd<>(fng.a[]::new, fng.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<fnh> l = Lists.newArrayList();

   public fng(gxh $$0, ale $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<fbh.a> $$0, Set<fnf> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<fnf> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = fnm.b.bake(this::a);
      this.f = fnm.a.bake(this::a);
   }

   private List<fbh> b(List<fbh.a> $$0, Set<fnf> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<fbh> $$3 = new ArrayList<>();

      for (fbh.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<fbh> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (fbh $$3x : $$3) {
            fbg $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fnm.b) {
                  ((IntList)this.k.computeIfAbsent(azf.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (fnh $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(fbg $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fng.a b(int $$0) {
      fbg $$1 = null;

      for (fbh $$2 : this.h) {
         fbg $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fng.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fng.a($$1, fnm.b) : fng.a.c;
   }

   public fbg a(int $$0, boolean $$1) {
      return this.j.a($$0, this::b).a($$1);
   }

   private fnk c(int $$0) {
      for (fbh $$1 : this.h) {
         fbg $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fnk a(int $$0) {
      return this.i.a($$0, this::c);
   }

   private fnk a(fbi $$0) {
      for (fnh $$1 : this.l) {
         fnk $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      ale $$3 = this.d.g("/" + this.l.size());
      boolean $$4 = $$0.c();
      fni $$5 = $$4 ? fni.b($$3) : fni.a($$3);
      fnh $$6 = new fnh($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      fnk $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fnk a(fbg $$0) {
      IntList $$1 = (IntList)this.k.get(azf.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public ale a() {
      return this.d;
   }

   public fnk b() {
      return this.f;
   }

   static record a(fbg a, fbg b) {
      static final fng.a c = new fng.a(fnm.b, fnm.b);

      fbg a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
