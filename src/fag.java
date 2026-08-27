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

public class fag implements AutoCloseable {
   private static final auw a = auw.a();
   private static final float b = 32.0F;
   private final gfc c;
   private final ahh d;
   private fak e;
   private fak f;
   private final List<eon> g = Lists.newArrayList();
   private final fae<fak> h = new fae<>(fak[]::new, fak[][]::new);
   private final fae<fag.a> i = new fae<>(fag.a[]::new, fag.a[][]::new);
   private final Int2ObjectMap<IntList> j = new Int2ObjectOpenHashMap();
   private final List<fah> k = Lists.newArrayList();

   public fag(gfc $$0, ahh $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<eon> $$0) {
      this.b();
      this.c();
      this.h.a();
      this.i.a();
      this.j.clear();
      this.e = fam.b.bake(this::a);
      this.f = fam.a.bake(this::a);
      IntSet $$1 = new IntOpenHashSet();

      for (eon $$2 : $$0) {
         $$1.addAll($$2.a());
      }

      Set<eon> $$3 = Sets.newHashSet();
      $$1.forEach($$2x -> {
         for (eon $$3x : $$0) {
            eom $$4 = $$3x.a($$2x);
            if ($$4 != null) {
               $$3.add($$3x);
               if ($$4 != fam.b) {
                  ((IntList)this.j.computeIfAbsent(aup.f($$4.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (eon $$0 : this.g) {
         $$0.close();
      }

      this.g.clear();
   }

   private void c() {
      for (fah $$0 : this.k) {
         $$0.close();
      }

      this.k.clear();
   }

   private static boolean b(eom $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fag.a b(int $$0) {
      eom $$1 = null;

      for (eon $$2 : this.g) {
         eom $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fag.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fag.a($$1, fam.b) : fag.a.c;
   }

   public eom a(int $$0, boolean $$1) {
      return this.i.a($$0, this::b).a($$1);
   }

   private fak c(int $$0) {
      for (eon $$1 : this.g) {
         eom $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fak a(int $$0) {
      return this.h.a($$0, this::c);
   }

   private fak a(eoo $$0) {
      for (fah $$1 : this.k) {
         fak $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      ahh $$3 = this.d.e("/" + this.k.size());
      boolean $$4 = $$0.c();
      fai $$5 = $$4 ? fai.b($$3) : fai.a($$3);
      fah $$6 = new fah($$5, $$4);
      this.k.add($$6);
      this.c.a($$3, $$6);
      fak $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fak a(eom $$0) {
      IntList $$1 = (IntList)this.j.get(aup.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public fak a() {
      return this.f;
   }

   static record a(eom a, eom b) {
      static final fag.a c = new fag.a(fam.b, fam.b);

      eom a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
