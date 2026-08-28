import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fqe extends fpu implements fpc, fru {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final xk e = xk.c("narration.tab_navigation.usage");
   private final frr f = frr.e();
   private int g;
   private final fqd h;
   private final ImmutableList<fqc> i;
   private final ImmutableList<fpi> j;

   fqe(int $$0, fqd $$1, Iterable<fqc> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fpi> $$3 = ImmutableList.builder();

      for (fqc $$4 : $$2) {
         $$3.add(this.f.a(new fpi($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fqe.a a(fqd $$0, int $$1) {
      return new fqe.a($$0, $$1);
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
   public void a(@Nullable fpw $$0) {
      super.a($$0);
      if ($$0 instanceof fpi $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fni a(fsc $$0) {
      if (!this.aN_()) {
         fpi $$1 = this.g();
         if ($$1 != null) {
            return fni.a(this, fni.a($$1));
         }
      }

      return $$0 instanceof fsc.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fpw> aI_() {
      return this.j;
   }

   @Override
   public fru.a u() {
      return this.j.stream().map(fnw::u).max(Comparator.naturalOrder()).orElse(fru.a.a);
   }

   @Override
   public void b(frw $$0) {
      Optional<fpi> $$1 = this.j.stream().filter(fnw::A).findFirst().or(() -> Optional.ofNullable(this.g()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aN_()) {
         $$0.a(frv.d, e);
      }
   }

   protected void a(frw $$0, fpi $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(frv.b, xk.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      $$0.a(glq::H, ftr.h, 0, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, ((fpi)this.j.get(0)).D(), 2, 32, 2);
      int $$4 = ((fpi)this.j.get(this.j.size() - 1)).F();
      $$0.a(glq::H, ftr.h, $$4, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fpi $$5 = (fpi)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fsg H() {
      return this.f.H();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = azu.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fpi $$2 = (fpi)var3.next();
         $$2.i($$1);
      }

      this.f.a();
      this.f.k(azu.d((this.g - $$0) / 2, 2));
      this.f.l(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aN_()) {
         this.a((fpw)this.j.get($$0));
      } else {
         this.h.a((fqc)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (ftr.r()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(azu.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = ftr.s() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fqc $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fpi g() {
      int $$0 = this.c();
      return $$0 != -1 ? (fpi)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fqd b;
      private final List<fqc> c = new ArrayList<>();

      a(fqd $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fqe.a a(fqc... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fqe a() {
         return new fqe(this.a, this.b, this.c);
      }
   }
}
