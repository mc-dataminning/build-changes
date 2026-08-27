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

public class fdx implements AutoCloseable {
   private static final axd a = axd.a();
   private static final float b = 32.0F;
   private final gja c;
   private final ajh d;
   private feb e;
   private feb f;
   private List<esc.a> g = List.of();
   private List<esc> h = List.of();
   private final fdu<feb> i = new fdu<>(feb[]::new, feb[][]::new);
   private final fdu<fdx.a> j = new fdu<>(fdx.a[]::new, fdx.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<fdy> l = Lists.newArrayList();

   public fdx(gja $$0, ajh $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<esc.a> $$0, Set<fdw> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<fdw> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = fed.b.bake(this::a);
      this.f = fed.a.bake(this::a);
   }

   private List<esc> b(List<esc.a> $$0, Set<fdw> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<esc> $$3 = new ArrayList<>();

      for (esc.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<esc> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (esc $$3x : $$3) {
            esb $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fed.b) {
                  ((IntList)this.k.computeIfAbsent(aww.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (fdy $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(esb $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fdx.a b(int $$0) {
      esb $$1 = null;

      for (esc $$2 : this.h) {
         esb $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fdx.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fdx.a($$1, fed.b) : fdx.a.c;
   }

   public esb a(int $$0, boolean $$1) {
      return this.j.a($$0, this::b).a($$1);
   }

   private feb c(int $$0) {
      for (esc $$1 : this.h) {
         esb $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public feb a(int $$0) {
      return this.i.a($$0, this::c);
   }

   private feb a(esd $$0) {
      for (fdy $$1 : this.l) {
         feb $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      ajh $$3 = this.d.e("/" + this.l.size());
      boolean $$4 = $$0.c();
      fdz $$5 = $$4 ? fdz.b($$3) : fdz.a($$3);
      fdy $$6 = new fdy($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      feb $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public feb a(esb $$0) {
      IntList $$1 = (IntList)this.k.get(aww.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public ajh a() {
      return this.d;
   }

   public feb b() {
      return this.f;
   }

   static record a(esb a, esb b) {
      static final fdx.a c = new fdx.a(fed.b, fed.b);

      esb a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
