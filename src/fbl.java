import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fbl extends fbb implements fak, fda {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final vq e = vq.c("narration.tab_navigation.usage");
   private final fcs f;
   private int g;
   private final fbk h;
   private final ImmutableList<fbj> i;
   private final ImmutableList<faq> j;

   fbl(int $$0, fbk $$1, Iterable<fbj> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f = new fcs(0, 0);
      this.f.c().b();
      Builder<faq> $$3 = ImmutableList.builder();
      int $$4 = 0;

      for (fbj $$5 : $$2) {
         $$3.add(this.f.a(new faq($$1, $$5, 0, 24), 0, $$4++));
      }

      this.j = $$3.build();
   }

   public static fbl.a a(fbk $$0, int $$1) {
      return new fbl.a($$0, $$1);
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if (this.aK_() != null) {
         this.aK_().a($$0);
      }
   }

   @Override
   public void a(@Nullable fbd $$0) {
      super.a($$0);
      if ($$0 instanceof faq $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public eyr a(fdi $$0) {
      if (!this.aL_()) {
         faq $$1 = this.c();
         if ($$1 != null) {
            return eyr.a(this, eyr.a($$1));
         }
      }

      return $$0 instanceof fdi.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fbd> l() {
      return this.j;
   }

   @Override
   public fda.a s() {
      return this.j.stream().map(ezf::s).max(Comparator.naturalOrder()).orElse(fda.a.a);
   }

   @Override
   public void b(fdc $$0) {
      Optional<faq> $$1 = this.j.stream().filter(ezf::y).findFirst().or(() -> Optional.ofNullable(this.c()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aL_()) {
         $$0.a(fdb.d, e);
      }
   }

   protected void a(fdc $$0, faq $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fdb.b, vq.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      $$0.a(0, 0, this.g, 24, -16777216);
      $$0.a(fju.a, 0, this.f.C() + this.f.u() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var5 = this.j.iterator();

      while (var5.hasNext()) {
         faq $$4 = (faq)var5.next();
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fdm F() {
      return this.f.F();
   }

   public void a() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = awh.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         faq $$2 = (faq)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(awh.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aL_()) {
         this.a((fbd)this.j.get($$0));
      } else {
         this.h.a((fbj)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (ffe.t()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(awh.a($$1, 0, this.i.size() - 1), true);
            return true;
         }
      }

      return false;
   }

   private int c(int $$0) {
      if ($$0 >= 49 && $$0 <= 57) {
         return $$0 - 49;
      } else {
         if ($$0 == 258) {
            int $$1 = this.b();
            if ($$1 != -1) {
               int $$2 = ffe.v() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int b() {
      fbj $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private faq c() {
      int $$0 = this.b();
      return $$0 != -1 ? (faq)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fbk b;
      private final List<fbj> c = new ArrayList<>();

      a(fbk $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fbl.a a(fbj... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fbl a() {
         return new fbl(this.a, this.b, this.c);
      }
   }
}
