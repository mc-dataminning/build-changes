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

public class fow implements AutoCloseable {
   private static final azu a = azu.a();
   private static final float b = 32.0F;
   private final gzf c;
   private final alj d;
   private fpa e;
   private fpa f;
   private List<fcq.a> g = List.of();
   private List<fcq> h = List.of();
   private final fot<fpa> i = new fot<>(fpa[]::new, fpa[][]::new);
   private final fot<fow.a> j = new fot<>(fow.a[]::new, fow.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<fox> l = Lists.newArrayList();

   public fow(gzf $$0, alj $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<fcq.a> $$0, Set<fov> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<fov> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = fpc.b.bake(this::a);
      this.f = fpc.a.bake(this::a);
   }

   private List<fcq> b(List<fcq.a> $$0, Set<fov> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<fcq> $$3 = new ArrayList<>();

      for (fcq.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<fcq> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (fcq $$3x : $$3) {
            fcp $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fpc.b) {
                  ((IntList)this.k.computeIfAbsent(azm.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (fox $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(fcp $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fow.a b(int $$0) {
      fcp $$1 = null;

      for (fcq $$2 : this.h) {
         fcp $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fow.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fow.a($$1, fpc.b) : fow.a.c;
   }

   public fcp a(int $$0, boolean $$1) {
      return this.j.a($$0, this::b).a($$1);
   }

   private fpa c(int $$0) {
      for (fcq $$1 : this.h) {
         fcp $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fpa a(int $$0) {
      return this.i.a($$0, this::c);
   }

   private fpa a(fcr $$0) {
      for (fox $$1 : this.l) {
         fpa $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      alj $$3 = this.d.g("/" + this.l.size());
      boolean $$4 = $$0.c();
      foy $$5 = $$4 ? foy.b($$3) : foy.a($$3);
      fox $$6 = new fox($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      fpa $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fpa a(fcp $$0) {
      IntList $$1 = (IntList)this.k.get(azm.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public alj a() {
      return this.d;
   }

   public fpa b() {
      return this.f;
   }

   static record a(fcp a, fcp b) {
      static final fow.a c = new fow.a(fpc.b, fpc.b);

      fcp a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
