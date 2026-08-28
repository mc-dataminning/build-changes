import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fmt extends fmj implements flr, foj {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final xe e = xe.c("narration.tab_navigation.usage");
   private final fog f = fog.e();
   private int g;
   private final fms h;
   private final ImmutableList<fmr> i;
   private final ImmutableList<flx> j;

   fmt(int $$0, fms $$1, Iterable<fmr> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<flx> $$3 = ImmutableList.builder();

      for (fmr $$4 : $$2) {
         $$3.add(this.f.a(new flx($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fmt.a a(fms $$0, int $$1) {
      return new fmt.a($$0, $$1);
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
   public void a(@Nullable fml $$0) {
      super.a($$0);
      if ($$0 instanceof flx $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fjy a(fos $$0) {
      if (!this.aN_()) {
         flx $$1 = this.d();
         if ($$1 != null) {
            return fjy.a(this, fjy.a($$1));
         }
      }

      return $$0 instanceof fos.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fml> aJ_() {
      return this.j;
   }

   @Override
   public foj.a u() {
      return this.j.stream().map(fkm::u).max(Comparator.naturalOrder()).orElse(foj.a.a);
   }

   @Override
   public void b(fol $$0) {
      Optional<flx> $$1 = this.j.stream().filter(fkm::A).findFirst().or(() -> Optional.ofNullable(this.d()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aN_()) {
         $$0.a(fok.d, e);
      }
   }

   protected void a(fol $$0, flx $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fok.b, xe.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      $$0.a(ghv::B, fqh.h, 0, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, ((flx)this.j.get(0)).D(), 2, 32, 2);
      int $$4 = ((flx)this.j.get(this.j.size() - 1)).F();
      $$0.a(ghv::B, fqh.h, $$4, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         flx $$5 = (flx)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fow H() {
      return this.f.H();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = azf.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         flx $$2 = (flx)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(azf.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aN_()) {
         this.a((fml)this.j.get($$0));
      } else {
         this.h.a((fmr)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fqh.s()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(azf.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = fqh.t() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fmr $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private flx d() {
      int $$0 = this.c();
      return $$0 != -1 ? (flx)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fms b;
      private final List<fmr> c = new ArrayList<>();

      a(fms $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fmt.a a(fmr... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fmt a() {
         return new fmt(this.a, this.b, this.c);
      }
   }
}
