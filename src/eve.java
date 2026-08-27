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

public class eve implements AutoCloseable {
   private static final asc a = asc.a();
   private static final float b = 32.0F;
   private final fzf c;
   private final aex d;
   private evi e;
   private evi f;
   private final List<ejs> g = Lists.newArrayList();
   private final evc<evi> h = new evc<>(evi[]::new, evi[][]::new);
   private final evc<eve.a> i = new evc<>(eve.a[]::new, eve.a[][]::new);
   private final Int2ObjectMap<IntList> j = new Int2ObjectOpenHashMap();
   private final List<evf> k = Lists.newArrayList();

   public eve(fzf $$0, aex $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<ejs> $$0) {
      this.b();
      this.c();
      this.h.a();
      this.i.a();
      this.j.clear();
      this.e = evk.b.bake(this::a);
      this.f = evk.a.bake(this::a);
      IntSet $$1 = new IntOpenHashSet();

      for (ejs $$2 : $$0) {
         $$1.addAll($$2.a());
      }

      Set<ejs> $$3 = Sets.newHashSet();
      $$1.forEach($$2x -> {
         for (ejs $$3x : $$0) {
            ejr $$4 = $$3x.a($$2x);
            if ($$4 != null) {
               $$3.add($$3x);
               if ($$4 != evk.b) {
                  ((IntList)this.j.computeIfAbsent(arx.f($$4.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (ejs $$0 : this.g) {
         $$0.close();
      }

      this.g.clear();
   }

   private void c() {
      for (evf $$0 : this.k) {
         $$0.close();
      }

      this.k.clear();
   }

   private static boolean b(ejr $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private eve.a b(int $$0) {
      ejr $$1 = null;

      for (ejs $$2 : this.g) {
         ejr $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new eve.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new eve.a($$1, evk.b) : eve.a.c;
   }

   public ejr a(int $$0, boolean $$1) {
      return this.i.a($$0, this::b).a($$1);
   }

   private evi c(int $$0) {
      for (ejs $$1 : this.g) {
         ejr $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public evi a(int $$0) {
      return this.h.a($$0, this::c);
   }

   private evi a(ejt $$0) {
      for (evf $$1 : this.k) {
         evi $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      aex $$3 = this.d.e("/" + this.k.size());
      boolean $$4 = $$0.c();
      evg $$5 = $$4 ? evg.b($$3) : evg.a($$3);
      evf $$6 = new evf($$5, $$4);
      this.k.add($$6);
      this.c.a($$3, $$6);
      evi $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public evi a(ejr $$0) {
      IntList $$1 = (IntList)this.j.get(arx.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public evi a() {
      return this.f;
   }

   static record a(ejr a, ejr b) {
      static final eve.a c = new eve.a(evk.b, evk.b);

      ejr a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
