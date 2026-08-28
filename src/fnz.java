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

public class fnz implements AutoCloseable {
   private static final azs a = azs.a();
   private static final float b = 32.0F;
   private final gye c;
   private final ali d;
   private fod e;
   private fod f;
   private List<fca.a> g = List.of();
   private List<fca> h = List.of();
   private final fnw<fod> i = new fnw<>(fod[]::new, fod[][]::new);
   private final fnw<fnz.a> j = new fnw<>(fnz.a[]::new, fnz.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<foa> l = Lists.newArrayList();

   public fnz(gye $$0, ali $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<fca.a> $$0, Set<fny> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<fny> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = fof.b.bake(this::a);
      this.f = fof.a.bake(this::a);
   }

   private List<fca> b(List<fca.a> $$0, Set<fny> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<fca> $$3 = new ArrayList<>();

      for (fca.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<fca> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (fca $$3x : $$3) {
            fbz $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fof.b) {
                  ((IntList)this.k.computeIfAbsent(azk.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (foa $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(fbz $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fnz.a b(int $$0) {
      fbz $$1 = null;

      for (fca $$2 : this.h) {
         fbz $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fnz.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fnz.a($$1, fof.b) : fnz.a.c;
   }

   public fbz a(int $$0, boolean $$1) {
      return this.j.a($$0, this::b).a($$1);
   }

   private fod c(int $$0) {
      for (fca $$1 : this.h) {
         fbz $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fod a(int $$0) {
      return this.i.a($$0, this::c);
   }

   private fod a(fcb $$0) {
      for (foa $$1 : this.l) {
         fod $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      ali $$3 = this.d.g("/" + this.l.size());
      boolean $$4 = $$0.c();
      fob $$5 = $$4 ? fob.b($$3) : fob.a($$3);
      foa $$6 = new foa($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      fod $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fod a(fbz $$0) {
      IntList $$1 = (IntList)this.k.get(azk.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public ali a() {
      return this.d;
   }

   public fod b() {
      return this.f;
   }

   static record a(fbz a, fbz b) {
      static final fnz.a c = new fnz.a(fof.b, fof.b);

      fbz a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
