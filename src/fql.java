import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fql extends fqb implements fpj, fsb {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final xv e = xv.c("narration.tab_navigation.usage");
   private final fry f = fry.e();
   private int g;
   private final fqk h;
   private final ImmutableList<fqj> i;
   private final ImmutableList<fpp> j;

   fql(int $$0, fqk $$1, Iterable<fqj> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fpp> $$3 = ImmutableList.builder();

      for (fqj $$4 : $$2) {
         $$3.add(this.f.a(new fpp($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fql.a a(fqk $$0, int $$1) {
      return new fql.a($$0, $$1);
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if (this.aM_() != null) {
         this.aM_().a($$0);
      }
   }

   @Override
   public void a(@Nullable fqd $$0) {
      super.a($$0);
      if ($$0 instanceof fpp $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fnp a(fsj $$0) {
      if (!this.aN_()) {
         fpp $$1 = this.g();
         if ($$1 != null) {
            return fnp.a(this, fnp.a($$1));
         }
      }

      return $$0 instanceof fsj.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fqd> aI_() {
      return this.j;
   }

   @Override
   public fsb.a u() {
      return this.j.stream().map(fod::u).max(Comparator.naturalOrder()).orElse(fsb.a.a);
   }

   @Override
   public void b(fsd $$0) {
      Optional<fpp> $$1 = this.j.stream().filter(fod::A).findFirst().or(() -> Optional.ofNullable(this.g()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aN_()) {
         $$0.a(fsc.d, e);
      }
   }

   protected void a(fsd $$0, fpp $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fsc.b, xv.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fns $$0, int $$1, int $$2, float $$3) {
      $$0.a(glv::C, fty.h, 0, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, ((fpp)this.j.get(0)).D(), 2, 32, 2);
      int $$4 = ((fpp)this.j.get(this.j.size() - 1)).F();
      $$0.a(glv::C, fty.h, $$4, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fpp $$5 = (fpp)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fsn H() {
      return this.f.H();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = bae.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fpp $$2 = (fpp)var3.next();
         $$2.i($$1);
      }

      this.f.a();
      this.f.k(bae.d((this.g - $$0) / 2, 2));
      this.f.l(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aN_()) {
         this.a((fqd)this.j.get($$0));
      } else {
         this.h.a((fqj)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fty.r()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(bae.a($$1, 0, this.i.size() - 1), true);
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
            int $$1 = this.c();
            if ($$1 != -1) {
               int $$2 = fty.s() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fqj $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fpp g() {
      int $$0 = this.c();
      return $$0 != -1 ? (fpp)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fqk b;
      private final List<fqj> c = new ArrayList<>();

      a(fqk $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fql.a a(fqj... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fql a() {
         return new fql(this.a, this.b, this.c);
      }
   }
}
