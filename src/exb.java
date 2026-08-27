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

public class exb implements AutoCloseable {
   private static final ato a = ato.a();
   private static final float b = 32.0F;
   private final gbi c;
   private final agg d;
   private exf e;
   private exf f;
   private final List<eln> g = Lists.newArrayList();
   private final ewz<exf> h = new ewz<>(exf[]::new, exf[][]::new);
   private final ewz<exb.a> i = new ewz<>(exb.a[]::new, exb.a[][]::new);
   private final Int2ObjectMap<IntList> j = new Int2ObjectOpenHashMap();
   private final List<exc> k = Lists.newArrayList();

   public exb(gbi $$0, agg $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<eln> $$0) {
      this.b();
      this.c();
      this.h.a();
      this.i.a();
      this.j.clear();
      this.e = exh.b.bake(this::a);
      this.f = exh.a.bake(this::a);
      IntSet $$1 = new IntOpenHashSet();

      for (eln $$2 : $$0) {
         $$1.addAll($$2.a());
      }

      Set<eln> $$3 = Sets.newHashSet();
      $$1.forEach($$2x -> {
         for (eln $$3x : $$0) {
            elm $$4 = $$3x.a($$2x);
            if ($$4 != null) {
               $$3.add($$3x);
               if ($$4 != exh.b) {
                  ((IntList)this.j.computeIfAbsent(ati.f($$4.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (eln $$0 : this.g) {
         $$0.close();
      }

      this.g.clear();
   }

   private void c() {
      for (exc $$0 : this.k) {
         $$0.close();
      }

      this.k.clear();
   }

   private static boolean b(elm $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private exb.a b(int $$0) {
      elm $$1 = null;

      for (eln $$2 : this.g) {
         elm $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new exb.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new exb.a($$1, exh.b) : exb.a.c;
   }

   public elm a(int $$0, boolean $$1) {
      return this.i.a($$0, this::b).a($$1);
   }

   private exf c(int $$0) {
      for (eln $$1 : this.g) {
         elm $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public exf a(int $$0) {
      return this.h.a($$0, this::c);
   }

   private exf a(elo $$0) {
      for (exc $$1 : this.k) {
         exf $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      agg $$3 = this.d.e("/" + this.k.size());
      boolean $$4 = $$0.c();
      exd $$5 = $$4 ? exd.b($$3) : exd.a($$3);
      exc $$6 = new exc($$5, $$4);
      this.k.add($$6);
      this.c.a($$3, $$6);
      exf $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public exf a(elm $$0) {
      IntList $$1 = (IntList)this.j.get(ati.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public exf a() {
      return this.f;
   }

   static record a(elm a, elm b) {
      static final exb.a c = new exb.a(exh.b, exh.b);

      elm a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
