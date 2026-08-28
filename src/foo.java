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

public class foo implements AutoCloseable {
   private static final azv a = azv.a();
   private static final float b = 32.0F;
   private final gyu c;
   private final all d;
   private fot e;
   private fot f;
   private List<fcj.a> g = List.of();
   private List<fcj> h = List.of();
   private final fol<fot> i = new fol<>(fot[]::new, fot[][]::new);
   private final fol<foo.a> j = new fol<>(foo.a[]::new, foo.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<fop> l = Lists.newArrayList();

   public foo(gyu $$0, all $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<fcj.a> $$0, Set<fon> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<fon> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = fov.b.bake(this::a);
      this.f = fov.a.bake(this::a);
   }

   private List<fcj> b(List<fcj.a> $$0, Set<fon> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<fcj> $$3 = new ArrayList<>();

      for (fcj.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<fcj> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (fcj $$3x : $$3) {
            fci $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fov.b) {
                  ((IntList)this.k.computeIfAbsent(azn.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (fop $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(fci $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private foo.a b(int $$0) {
      fci $$1 = null;

      for (fcj $$2 : this.h) {
         fci $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new foo.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new foo.a($$1, fov.b) : foo.a.c;
   }

   public fci a(int $$0, boolean $$1) {
      return this.j.a($$0, this::b).a($$1);
   }

   private fot c(int $$0) {
      for (fcj $$1 : this.h) {
         fci $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fot a(int $$0) {
      return this.i.a($$0, this::c);
   }

   private fot a(fck $$0) {
      for (fop $$1 : this.l) {
         fot $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      all $$3 = this.d.g("/" + this.l.size());
      boolean $$4 = $$0.c();
      foq $$5 = $$4 ? foq.b($$3) : foq.a($$3);
      fop $$6 = new fop($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      fot $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fot a(fci $$0) {
      IntList $$1 = (IntList)this.k.get(azn.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public all a() {
      return this.d;
   }

   public fot b() {
      return this.f;
   }

   static record a(fci a, fci b) {
      static final foo.a c = new foo.a(fov.b, fov.b);

      fci a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
