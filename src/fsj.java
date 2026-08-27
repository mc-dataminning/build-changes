import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;

public class fsj {
   private final jo a;
   private final List<czc<?>> b;
   private final boolean c;
   private final Set<czc<?>> d = Sets.newHashSet();
   private final Set<czc<?>> e = Sets.newHashSet();
   private final Set<czc<?>> f = Sets.newHashSet();

   public fsj(jo $$0, List<czc<?>> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      if ($$1.size() <= 1) {
         this.c = true;
      } else {
         this.c = a($$0, $$1);
      }
   }

   private static boolean a(jo $$0, List<czc<?>> $$1) {
      int $$2 = $$1.size();
      cuh $$3 = $$1.get(0).b().a($$0);

      for (int $$4 = 1; $$4 < $$2; $$4++) {
         cuh $$5 = $$1.get($$4).b().a($$0);
         if (!cuh.c($$3, $$5)) {
            return false;
         }
      }

      return true;
   }

   public jo a() {
      return this.a;
   }

   public boolean b() {
      return !this.f.isEmpty();
   }

   public void a(avs $$0) {
      for (czc<?> $$1 : this.b) {
         if ($$0.b($$1)) {
            this.f.add($$1);
         }
      }
   }

   public void a(cmc $$0, int $$1, int $$2, avs $$3) {
      for (czc<?> $$4 : this.b) {
         boolean $$5 = $$4.b().a($$1, $$2) && $$3.b($$4);
         if ($$5) {
            this.e.add($$4);
         } else {
            this.e.remove($$4);
         }

         if ($$5 && $$0.a($$4.b(), null)) {
            this.d.add($$4);
         } else {
            this.d.remove($$4);
         }
      }
   }

   public boolean a(czc<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean c() {
      return !this.d.isEmpty();
   }

   public boolean d() {
      return !this.e.isEmpty();
   }

   public List<czc<?>> e() {
      return this.b;
   }

   public List<czc<?>> a(boolean $$0) {
      List<czc<?>> $$1 = Lists.newArrayList();
      Set<czc<?>> $$2 = $$0 ? this.d : this.e;

      for (czc<?> $$3 : this.b) {
         if ($$2.contains($$3)) {
            $$1.add($$3);
         }
      }

      return $$1;
   }

   public List<czc<?>> b(boolean $$0) {
      List<czc<?>> $$1 = Lists.newArrayList();

      for (czc<?> $$2 : this.b) {
         if (this.e.contains($$2) && this.d.contains($$2) == $$0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public boolean f() {
      return this.c;
   }
}
