import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.List;
import java.util.Set;

public class ext implements AutoCloseable {
   private static final atw a = atw.a();
   private static final float b = 32.0F;
   private final gca c;
   private final agm d;
   private exx e;
   private exx f;
   private final List<eme> g = Lists.newArrayList();
   private final exr<exx> h = new exr<>(exx[]::new, exx[][]::new);
   private final exr<ext.a> i = new exr<>(ext.a[]::new, ext.a[][]::new);
   private final Int2ObjectMap<IntList> j = new Int2ObjectOpenHashMap();
   private final List<exu> k = Lists.newArrayList();

   public ext(gca $$0, agm $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<eme> $$0) {
      this.b();
      this.c();
      this.h.a();
      this.i.a();
      this.j.clear();
      this.e = exz.b.bake(this::a);
      this.f = exz.a.bake(this::a);
      IntSet $$1 = new IntOpenHashSet();

      for (eme $$2 : $$0) {
         $$1.addAll($$2.a());
      }

      Set<eme> $$3 = Sets.newHashSet();
      $$1.forEach($$2x -> {
         for (eme $$3x : $$0) {
            emd $$4 = $$3x.a($$2x);
            if ($$4 != null) {
               $$3.add($$3x);
               if ($$4 != exz.b) {
                  ((IntList)this.j.computeIfAbsent(atq.f($$4.a(false)), $$0xx -> new IntArrayList())).add($$2x);
               }
               break;
            }
         }
      });
      $$0.stream().filter($$3::contains).forEach(this.g::add);
   }

   @Override
   public void close() {
      this.b();
      this.c();
   }

   private void b() {
      for (eme $$0 : this.g) {
         $$0.close();
      }

      this.g.clear();
   }

   private void c() {
      for (exu $$0 : this.k) {
         $$0.close();
      }

      this.k.clear();
   }

   private static boolean b(emd $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private ext.a b(int $$0) {
      emd $$1 = null;

      for (eme $$2 : this.g) {
         emd $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new ext.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new ext.a($$1, exz.b) : ext.a.c;
   }

   public emd a(int $$0, boolean $$1) {
      return this.i.a($$0, this::b).a($$1);
   }

   private exx c(int $$0) {
      for (eme $$1 : this.g) {
         emd $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public exx a(int $$0) {
      return this.h.a($$0, this::c);
   }

   private exx a(emf $$0) {
      for (exu $$1 : this.k) {
         exx $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      agm $$3 = this.d.e("/" + this.k.size());
      boolean $$4 = $$0.c();
      exv $$5 = $$4 ? exv.b($$3) : exv.a($$3);
      exu $$6 = new exu($$5, $$4);
      this.k.add($$6);
      this.c.a($$3, $$6);
      exx $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public exx a(emd $$0) {
      IntList $$1 = (IntList)this.j.get(atq.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public exx a() {
      return this.f;
   }

   static record a(emd a, emd b) {
      static final ext.a c = new ext.a(exz.b, exz.b);

      emd a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
