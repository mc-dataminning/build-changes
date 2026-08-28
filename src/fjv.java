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

public class fjv implements AutoCloseable {
   private static final azh a = azh.a();
   private static final float b = 32.0F;
   private final gpa c;
   private final alf d;
   private fjz e;
   private fjz f;
   private List<eyb.a> g = List.of();
   private List<eyb> h = List.of();
   private final fjs<fjz> i = new fjs<>(fjz[]::new, fjz[][]::new);
   private final fjs<fjv.a> j = new fjs<>(fjv.a[]::new, fjv.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<fjw> l = Lists.newArrayList();

   public fjv(gpa $$0, alf $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<eyb.a> $$0, Set<fju> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<fju> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = fkb.b.bake(this::a);
      this.f = fkb.a.bake(this::a);
   }

   private List<eyb> b(List<eyb.a> $$0, Set<fju> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<eyb> $$3 = new ArrayList<>();

      for (eyb.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<eyb> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (eyb $$3x : $$3) {
            eya $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fkb.b) {
                  ((IntList)this.k.computeIfAbsent(ayz.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (fjw $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(eya $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fjv.a b(int $$0) {
      eya $$1 = null;

      for (eyb $$2 : this.h) {
         eya $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fjv.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fjv.a($$1, fkb.b) : fjv.a.c;
   }

   public eya a(int $$0, boolean $$1) {
      return this.j.a($$0, this::b).a($$1);
   }

   private fjz c(int $$0) {
      for (eyb $$1 : this.h) {
         eya $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fjz a(int $$0) {
      return this.i.a($$0, this::c);
   }

   private fjz a(eyc $$0) {
      for (fjw $$1 : this.l) {
         fjz $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      alf $$3 = this.d.e("/" + this.l.size());
      boolean $$4 = $$0.c();
      fjx $$5 = $$4 ? fjx.b($$3) : fjx.a($$3);
      fjw $$6 = new fjw($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      fjz $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fjz a(eya $$0) {
      IntList $$1 = (IntList)this.k.get(ayz.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public alf a() {
      return this.d;
   }

   public fjz b() {
      return this.f;
   }

   static record a(eya a, eya b) {
      static final fjv.a c = new fjv.a(fkb.b, fkb.b);

      eya a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
