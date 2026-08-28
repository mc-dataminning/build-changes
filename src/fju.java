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

public class fju implements AutoCloseable {
   private static final azg a = azg.a();
   private static final float b = 32.0F;
   private final goz c;
   private final ale d;
   private fjy e;
   private fjy f;
   private List<eya.a> g = List.of();
   private List<eya> h = List.of();
   private final fjr<fjy> i = new fjr<>(fjy[]::new, fjy[][]::new);
   private final fjr<fju.a> j = new fjr<>(fju.a[]::new, fju.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<fjv> l = Lists.newArrayList();

   public fju(goz $$0, ale $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<eya.a> $$0, Set<fjt> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<fjt> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = fka.b.bake(this::a);
      this.f = fka.a.bake(this::a);
   }

   private List<eya> b(List<eya.a> $$0, Set<fjt> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<eya> $$3 = new ArrayList<>();

      for (eya.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<eya> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (eya $$3x : $$3) {
            exz $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fka.b) {
                  ((IntList)this.k.computeIfAbsent(ayy.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (fjv $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(exz $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fju.a b(int $$0) {
      exz $$1 = null;

      for (eya $$2 : this.h) {
         exz $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fju.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fju.a($$1, fka.b) : fju.a.c;
   }

   public exz a(int $$0, boolean $$1) {
      return this.j.a($$0, this::b).a($$1);
   }

   private fjy c(int $$0) {
      for (eya $$1 : this.h) {
         exz $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fjy a(int $$0) {
      return this.i.a($$0, this::c);
   }

   private fjy a(eyb $$0) {
      for (fjv $$1 : this.l) {
         fjy $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      ale $$3 = this.d.e("/" + this.l.size());
      boolean $$4 = $$0.c();
      fjw $$5 = $$4 ? fjw.b($$3) : fjw.a($$3);
      fjv $$6 = new fjv($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      fjy $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fjy a(exz $$0) {
      IntList $$1 = (IntList)this.k.get(ayy.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public ale a() {
      return this.d;
   }

   public fjy b() {
      return this.f;
   }

   static record a(exz a, exz b) {
      static final fju.a c = new fju.a(fka.b, fka.b);

      exz a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
