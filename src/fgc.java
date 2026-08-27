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

public class fgc extends ffs implements ffb, fhs {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final wi e = wi.c("narration.tab_navigation.usage");
   private final fhp f = fhp.e();
   private int g;
   private final fgb h;
   private final ImmutableList<fga> i;
   private final ImmutableList<ffh> j;

   fgc(int $$0, fgb $$1, Iterable<fga> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<ffh> $$3 = ImmutableList.builder();

      for (fga $$4 : $$2) {
         $$3.add(this.f.a(new ffh($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fgc.a a(fgb $$0, int $$1) {
      return new fgc.a($$0, $$1);
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
   public void a(@Nullable ffu $$0) {
      super.a($$0);
      if ($$0 instanceof ffh $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fdi a(fia $$0) {
      if (!this.aI_()) {
         ffh $$1 = this.d();
         if ($$1 != null) {
            return fdi.a(this, fdi.a($$1));
         }
      }

      return $$0 instanceof fia.c ? null : super.a($$0);
   }

   @Override
   public List<? extends ffu> aE_() {
      return this.j;
   }

   @Override
   public fhs.a t() {
      return this.j.stream().map(fdw::t).max(Comparator.naturalOrder()).orElse(fhs.a.a);
   }

   @Override
   public void b(fhu $$0) {
      Optional<ffh> $$1 = this.j.stream().filter(fdw::z).findFirst().or(() -> Optional.ofNullable(this.d()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aI_()) {
         $$0.a(fht.d, e);
      }
   }

   protected void a(fhu $$0, ffh $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fht.b, wi.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      RenderSystem.enableBlend();
      $$0.a(fom.a, 0, this.f.D() + this.f.v() - 2, 0.0F, 0.0F, ((ffh)this.j.get(0)).C(), 2, 32, 2);
      int $$4 = ((ffh)this.j.get(this.j.size() - 1)).E();
      $$0.a(fom.a, $$4, this.f.D() + this.f.v() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      RenderSystem.disableBlend();
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         ffh $$5 = (ffh)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fie G() {
      return this.f.G();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = axm.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         ffh $$2 = (ffh)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(axm.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aI_()) {
         this.a((ffu)this.j.get($$0));
      } else {
         this.h.a((fga)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fjx.r()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(axm.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = fjx.s() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fga $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private ffh d() {
      int $$0 = this.c();
      return $$0 != -1 ? (ffh)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fgb b;
      private final List<fga> c = new ArrayList<>();

      a(fgb $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fgc.a a(fga... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fgc a() {
         return new fgc(this.a, this.b, this.c);
      }
   }
}
