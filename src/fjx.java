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

public class fjx implements AutoCloseable {
   private static final azh a = azh.a();
   private static final float b = 32.0F;
   private final gpc c;
   private final alf d;
   private fkb e;
   private fkb f;
   private List<eyd.a> g = List.of();
   private List<eyd> h = List.of();
   private final fju<fkb> i = new fju<>(fkb[]::new, fkb[][]::new);
   private final fju<fjx.a> j = new fju<>(fjx.a[]::new, fjx.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<fjy> l = Lists.newArrayList();

   public fjx(gpc $$0, alf $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<eyd.a> $$0, Set<fjw> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<fjw> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = fkd.b.bake(this::a);
      this.f = fkd.a.bake(this::a);
   }

   private List<eyd> b(List<eyd.a> $$0, Set<fjw> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<eyd> $$3 = new ArrayList<>();

      for (eyd.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<eyd> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (eyd $$3x : $$3) {
            eyc $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fkd.b) {
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
      for (fjy $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(eyc $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fjx.a b(int $$0) {
      eyc $$1 = null;

      for (eyd $$2 : this.h) {
         eyc $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fjx.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fjx.a($$1, fkd.b) : fjx.a.c;
   }

   public eyc a(int $$0, boolean $$1) {
      return this.j.a($$0, this::b).a($$1);
   }

   private fkb c(int $$0) {
      for (eyd $$1 : this.h) {
         eyc $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fkb a(int $$0) {
      return this.i.a($$0, this::c);
   }

   private fkb a(eye $$0) {
      for (fjy $$1 : this.l) {
         fkb $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      alf $$3 = this.d.e("/" + this.l.size());
      boolean $$4 = $$0.c();
      fjz $$5 = $$4 ? fjz.b($$3) : fjz.a($$3);
      fjy $$6 = new fjy($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      fkb $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fkb a(eyc $$0) {
      IntList $$1 = (IntList)this.k.get(ayz.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public alf a() {
      return this.d;
   }

   public fkb b() {
      return this.f;
   }

   static record a(eyc a, eyc b) {
      static final fjx.a c = new fjx.a(fkd.b, fkd.b);

      eyc a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
