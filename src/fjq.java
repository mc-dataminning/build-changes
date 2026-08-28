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

public class fjq implements AutoCloseable {
   private static final azc a = azc.a();
   private static final float b = 32.0F;
   private final gov c;
   private final alb d;
   private fju e;
   private fju f;
   private List<exw.a> g = List.of();
   private List<exw> h = List.of();
   private final fjn<fju> i = new fjn<>(fju[]::new, fju[][]::new);
   private final fjn<fjq.a> j = new fjn<>(fjq.a[]::new, fjq.a[][]::new);
   private final Int2ObjectMap<IntList> k = new Int2ObjectOpenHashMap();
   private final List<fjr> l = Lists.newArrayList();

   public fjq(gov $$0, alb $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(List<exw.a> $$0, Set<fjp> $$1) {
      this.g = $$0;
      this.a($$1);
   }

   public void a(Set<fjp> $$0) {
      this.h = List.of();
      this.c();
      this.h = this.b(this.g, $$0);
   }

   private void c() {
      this.d();
      this.i.a();
      this.j.a();
      this.k.clear();
      this.e = fjw.b.bake(this::a);
      this.f = fjw.a.bake(this::a);
   }

   private List<exw> b(List<exw.a> $$0, Set<fjp> $$1) {
      IntSet $$2 = new IntOpenHashSet();
      List<exw> $$3 = new ArrayList<>();

      for (exw.a $$4 : $$0) {
         if ($$4.b().a($$1)) {
            $$3.add($$4.a());
            $$2.addAll($$4.a().a());
         }
      }

      Set<exw> $$5 = Sets.newHashSet();
      $$2.forEach($$2x -> {
         for (exw $$3x : $$3) {
            exv $$4x = $$3x.a($$2x);
            if ($$4x != null) {
               $$5.add($$3x);
               if ($$4x != fjw.b) {
                  ((IntList)this.k.computeIfAbsent(ayu.f($$4x.a(false)), $$0xx -> new IntArrayList())).add($$2x);
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
      for (fjr $$0 : this.l) {
         $$0.close();
      }

      this.l.clear();
   }

   private static boolean b(exv $$0) {
      float $$1 = $$0.a(false);
      if (!($$1 < 0.0F) && !($$1 > 32.0F)) {
         float $$2 = $$0.a(true);
         return $$2 < 0.0F || $$2 > 32.0F;
      } else {
         return true;
      }
   }

   private fjq.a b(int $$0) {
      exv $$1 = null;

      for (exw $$2 : this.h) {
         exv $$3 = $$2.a($$0);
         if ($$3 != null) {
            if ($$1 == null) {
               $$1 = $$3;
            }

            if (!b($$3)) {
               return new fjq.a($$1, $$3);
            }
         }
      }

      return $$1 != null ? new fjq.a($$1, fjw.b) : fjq.a.c;
   }

   public exv a(int $$0, boolean $$1) {
      return this.j.a($$0, this::b).a($$1);
   }

   private fju c(int $$0) {
      for (exw $$1 : this.h) {
         exv $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2.bake(this::a);
         }
      }

      return this.e;
   }

   public fju a(int $$0) {
      return this.i.a($$0, this::c);
   }

   private fju a(exx $$0) {
      for (fjr $$1 : this.l) {
         fju $$2 = $$1.a($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      alb $$3 = this.d.e("/" + this.l.size());
      boolean $$4 = $$0.c();
      fjs $$5 = $$4 ? fjs.b($$3) : fjs.a($$3);
      fjr $$6 = new fjr($$5, $$4);
      this.l.add($$6);
      this.c.a($$3, $$6);
      fju $$7 = $$6.a($$0);
      return $$7 == null ? this.e : $$7;
   }

   public fju a(exv $$0) {
      IntList $$1 = (IntList)this.k.get(ayu.f($$0.a(false)));
      return $$1 != null && !$$1.isEmpty() ? this.a($$1.getInt(a.a($$1.size()))) : this.e;
   }

   public alb a() {
      return this.d;
   }

   public fju b() {
      return this.f;
   }

   static record a(exv a, exv b) {
      static final fjq.a c = new fjq.a(fjw.b, fjw.b);

      exv a(boolean $$0) {
         return $$0 ? this.b : this.a;
      }
   }
}
