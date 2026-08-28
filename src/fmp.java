import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fmp extends fmf implements fln, fof {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final xd e = xd.c("narration.tab_navigation.usage");
   private final foc f = foc.e();
   private int g;
   private final fmo h;
   private final ImmutableList<fmn> i;
   private final ImmutableList<flt> j;

   fmp(int $$0, fmo $$1, Iterable<fmn> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<flt> $$3 = ImmutableList.builder();

      for (fmn $$4 : $$2) {
         $$3.add(this.f.a(new flt($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fmp.a a(fmo $$0, int $$1) {
      return new fmp.a($$0, $$1);
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if (this.aL_() != null) {
         this.aL_().a($$0);
      }
   }

   @Override
   public void a(@Nullable fmh $$0) {
      super.a($$0);
      if ($$0 instanceof flt $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fju a(fon $$0) {
      if (!this.aM_()) {
         flt $$1 = this.d();
         if ($$1 != null) {
            return fju.a(this, fju.a($$1));
         }
      }

      return $$0 instanceof fon.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fmh> aI_() {
      return this.j;
   }

   @Override
   public fof.a u() {
      return this.j.stream().map(fki::u).max(Comparator.naturalOrder()).orElse(fof.a.a);
   }

   @Override
   public void b(foh $$0) {
      Optional<flt> $$1 = this.j.stream().filter(fki::A).findFirst().or(() -> Optional.ofNullable(this.d()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aM_()) {
         $$0.a(fog.d, e);
      }
   }

   protected void a(foh $$0, flt $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fog.b, xd.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
      $$0.a(ghq::B, fqd.h, 0, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, ((flt)this.j.get(0)).D(), 2, 32, 2);
      int $$4 = ((flt)this.j.get(this.j.size() - 1)).F();
      $$0.a(ghq::B, fqd.h, $$4, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         flt $$5 = (flt)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fos H() {
      return this.f.H();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = azd.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         flt $$2 = (flt)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(azd.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aM_()) {
         this.a((fmh)this.j.get($$0));
      } else {
         this.h.a((fmn)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fqd.s()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(azd.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = fqd.t() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fmn $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private flt d() {
      int $$0 = this.c();
      return $$0 != -1 ? (flt)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fmo b;
      private final List<fmn> c = new ArrayList<>();

      a(fmo $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fmp.a a(fmn... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fmp a() {
         return new fmp(this.a, this.b, this.c);
      }
   }
}
