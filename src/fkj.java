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

public class fkj implements AutoCloseable {
   private static final ayo a = ayo.a();
   private static final float b = 32.0F;
   private final gpp c;
   private final akk d;
   private fkn e;
   private fkn f;
   private List<eyp.a> g = List.of();
   private List<eyp> h = List.of();
   private final fkg<fkn> i = new fkg<>(fkn[]::new, fkn[][]::new);
   private final fkg<fkj.a> j = new fkg<>(fkj.a[]::new, fkj.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<fkk> l = Lists.newArrayList();

   public fkj(gpp $$0, akk $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<eyp.a> $$0, Set<fki> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<fki> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = fkp.b.bake(this::a);
      this.f = fkp.a.bake(this::a);
   }

   private List<eyp> b(List<eyp.a> $$0, Set<fki> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<eyp> $$3 = new ArrayList<>();

      for (eyp.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<eyp> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (eyp $$3x : $$3) {
            eyo $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fkp.b) {
                  ((IntList)this.k.computeIfAbsent(ayg.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (fkk $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(eyo $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fkj.a b(int $$0) {
      eyo $$1 = null;

      for (eyp $$2 : this.h) {
         eyo $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fkj.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fkj.a($$1, fkp.b) : fkj.a.c;
   }

   public eyo a(int $$0, boolean $$1) {
      return this.j.a($$0, this::b).a($$1);
   }

   private fkn c(int $$0) {
      for (eyp $$1 : this.h) {
         eyo $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fkn a(int $$0) {
      return this.i.a($$0, this::c);
   }

   private fkn a(eyq $$0) {
      for (fkk $$1 : this.l) {
         fkn $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      akk $$3 = this.d.e("/" + this.l.size());
      boolean $$4 = $$0.c();
      fkl $$5 = $$4 ? fkl.b($$3) : fkl.a($$3);
      fkk $$6 = new fkk($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      fkn $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fkn a(eyo $$0) {
      IntList $$1 = (IntList)this.k.get(ayg.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public akk a() {
      return this.d;
   }

   public fkn b() {
      return this.f;
   }

   static record a(eyo a, eyo b) {
      static final fkj.a c = new fkj.a(fkp.b, fkp.b);

      eyo a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
