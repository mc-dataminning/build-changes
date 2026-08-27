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

public class fgg implements AutoCloseable {
   private static final axr a = axr.a();
   private static final float b = 32.0F;
   private final glk c;
   private final ajt d;
   private fgk e;
   private fgk f;
   private List<eul.a> g = List.of();
   private List<eul> h = List.of();
   private final fgd<fgk> i = new fgd<>(fgk[]::new, fgk[][]::new);
   private final fgd<fgg.a> j = new fgd<>(fgg.a[]::new, fgg.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<fgh> l = Lists.newArrayList();

   public fgg(glk $$0, ajt $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<eul.a> $$0, Set<fgf> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<fgf> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = fgm.b.bake(this::a);
      this.f = fgm.a.bake(this::a);
   }

   private List<eul> b(List<eul.a> $$0, Set<fgf> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<eul> $$3 = new ArrayList<>();

      for (eul.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<eul> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (eul $$3x : $$3) {
            euk $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fgm.b) {
                  ((IntList)this.k.computeIfAbsent(axk.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (fgh $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(euk $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fgg.a b(int $$0) {
      euk $$1 = null;

      for (eul $$2 : this.h) {
         euk $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fgg.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fgg.a($$1, fgm.b) : fgg.a.c;
   }

   public euk a(int $$0, boolean $$1) {
      return this.j.a($$0, this::b).a($$1);
   }

   private fgk c(int $$0) {
      for (eul $$1 : this.h) {
         euk $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fgk a(int $$0) {
      return this.i.a($$0, this::c);
   }

   private fgk a(eum $$0) {
      for (fgh $$1 : this.l) {
         fgk $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      ajt $$3 = this.d.e("/" + this.l.size());
      boolean $$4 = $$0.c();
      fgi $$5 = $$4 ? fgi.b($$3) : fgi.a($$3);
      fgh $$6 = new fgh($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      fgk $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fgk a(euk $$0) {
      IntList $$1 = (IntList)this.k.get(axk.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public ajt a() {
      return this.d;
   }

   public fgk b() {
      return this.f;
   }

   static record a(euk a, euk b) {
      static final fgg.a c = new fgg.a(fgm.b, fgm.b);

      euk a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
