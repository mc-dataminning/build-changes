import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;

public class eyg {
   private final hs a;
   private final List<cjc<?>> b;
   private final boolean c;
   private final Set<cjc<?>> d = Sets.newHashSet();
   private final Set<cjc<?>> e = Sets.newHashSet();
   private final Set<cjc<?>> f = Sets.newHashSet();

   public eyg(hs $$0, List<cjc<?>> $$1) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      if ($$1.size() <= 1) {
         this.c = true;
      } else {
         this.c = a($$0, $$1);
      }
   }

   private static boolean a(hs $$0, List<cjc<?>> $$1) {
      int $$2 = $$1.size();
      cfz $$3 = $$1.get(0).a($$0);

      for (int $$4 = 1; $$4 < $$2; $$4++) {
         cfz $$5 = $$1.get($$4).a($$0);
         if (!cfz.c($$3, $$5)) {
            return false;
         }
      }

      return true;
   }

   public hs a() {
      return this.a;
   }

   public boolean b() {
      return !this.f.isEmpty();
   }

   public void a(amk $$0) {
      for (cjc<?> $$1 : this.b) {
         if ($$0.b($$1)) {
            this.f.add($$1);
         }
      }
   }

   public void a(bys $$0, int $$1, int $$2, amk $$3) {
      for (cjc<?> $$4 : this.b) {
         boolean $$5 = $$4.a($$1, $$2) && $$3.b($$4);
         if ($$5) {
            this.e.add($$4);
         } else {
            this.e.remove($$4);
         }

         if ($$5 && $$0.a($$4, null)) {
            this.d.add($$4);
         } else {
            this.d.remove($$4);
         }
      }
   }

   public boolean a(cjc<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean c() {
      return !this.d.isEmpty();
   }

   public boolean d() {
      return !this.e.isEmpty();
   }

   public List<cjc<?>> e() {
      return this.b;
   }

   public List<cjc<?>> a(boolean $$0) {
      List<cjc<?>> $$1 = Lists.newArrayList();
      Set<cjc<?>> $$2 = $$0 ? this.d : this.e;

      for (cjc<?> $$3 : this.b) {
         if ($$2.contains($$3)) {
            $$1.add($$3);
         }
      }

      return $$1;
   }

   public List<cjc<?>> b(boolean $$0) {
      List<cjc<?>> $$1 = Lists.newArrayList();

      for (cjc<?> $$2 : this.b) {
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
