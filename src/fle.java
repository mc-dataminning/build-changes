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

public class fle implements AutoCloseable {
   private static final ayt a = ayt.a();
   private static final float b = 32.0F;
   private final gqz c;
   private final akt d;
   private fli e;
   private fli f;
   private List<ezf.a> g = List.of();
   private List<ezf> h = List.of();
   private final flb<fli> i = new flb<>(fli[]::new, fli[][]::new);
   private final flb<fle.a> j = new flb<>(fle.a[]::new, fle.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<flf> l = Lists.newArrayList();

   public fle(gqz $$0, akt $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<ezf.a> $$0, Set<fld> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<fld> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = flk.b.bake(this::a);
      this.f = flk.a.bake(this::a);
   }

   private List<ezf> b(List<ezf.a> $$0, Set<fld> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<ezf> $$3 = new ArrayList<>();

      for (ezf.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<ezf> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (ezf $$3x : $$3) {
            eze $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != flk.b) {
                  ((IntList)this.k.computeIfAbsent(aym.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (flf $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(eze $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fle.a b(int $$0) {
      eze $$1 = null;

      for (ezf $$2 : this.h) {
         eze $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fle.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fle.a($$1, flk.b) : fle.a.c;
   }

   public eze a(int $$0, boolean $$1) {
      return this.j.a($$0, this::b).a($$1);
   }

   private fli c(int $$0) {
      for (ezf $$1 : this.h) {
         eze $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fli a(int $$0) {
      return this.i.a($$0, this::c);
   }

   private fli a(ezg $$0) {
      for (flf $$1 : this.l) {
         fli $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      akt $$3 = this.d.e("/" + this.l.size());
      boolean $$4 = $$0.c();
      flg $$5 = $$4 ? flg.b($$3) : flg.a($$3);
      flf $$6 = new flf($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      fli $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fli a(eze $$0) {
      IntList $$1 = (IntList)this.k.get(aym.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public akt a() {
      return this.d;
   }

   public fli b() {
      return this.f;
   }

   static record a(eze a, eze b) {
      static final fle.a c = new fle.a(flk.b, flk.b);

      eze a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
