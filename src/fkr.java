import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fkr extends fkh implements fjq, fmh {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final xe e = xe.c("narration.tab_navigation.usage");
   private final fme f = fme.e();
   private int g;
   private final fkq h;
   private final ImmutableList<fkp> i;
   private final ImmutableList<fjw> j;

   fkr(int $$0, fkq $$1, Iterable<fkp> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fjw> $$3 = ImmutableList.builder();

      for (fkp $$4 : $$2) {
         $$3.add(this.f.a(new fjw($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fkr.a a(fkq $$0, int $$1) {
      return new fkr.a($$0, $$1);
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if (this.aH_() != null) {
         this.aH_().a($$0);
      }
   }

   @Override
   public void a(@Nullable fkj $$0) {
      super.a($$0);
      if ($$0 instanceof fjw $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fhx a(fmp $$0) {
      if (!this.aI_()) {
         fjw $$1 = this.d();
         if ($$1 != null) {
            return fhx.a(this, fhx.a($$1));
         }
      }

      return $$0 instanceof fmp.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fkj> aE_() {
      return this.j;
   }

   @Override
   public fmh.a t() {
      return this.j.stream().map(fil::t).max(Comparator.naturalOrder()).orElse(fmh.a.a);
   }

   @Override
   public void b(fmj $$0) {
      Optional<fjw> $$1 = this.j.stream().filter(fil::z).findFirst().or(() -> Optional.ofNullable(this.d()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aI_()) {
         $$0.a(fmi.d, e);
      }
   }

   protected void a(fmj $$0, fjw $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fmi.b, xe.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      RenderSystem.enableBlend();
      $$0.a(fon.h, 0, this.f.D() + this.f.v() - 2, 0.0F, 0.0F, ((fjw)this.j.get(0)).C(), 2, 32, 2);
      int $$4 = ((fjw)this.j.get(this.j.size() - 1)).E();
      $$0.a(fon.h, $$4, this.f.D() + this.f.v() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      RenderSystem.disableBlend();
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fjw $$5 = (fjw)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fmt G() {
      return this.f.G();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = aym.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fjw $$2 = (fjw)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(aym.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aI_()) {
         this.a((fkj)this.j.get($$0));
      } else {
         this.h.a((fkp)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fon.r()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(aym.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = fon.s() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fkp $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fjw d() {
      int $$0 = this.c();
      return $$0 != -1 ? (fjw)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fkq b;
      private final List<fkp> c = new ArrayList<>();

      a(fkq $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fkr.a a(fkp... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fkr a() {
         return new fkr(this.a, this.b, this.c);
      }
   }
}
