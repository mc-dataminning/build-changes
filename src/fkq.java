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

public class fkq extends fkg implements fjp, fmg {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final wz e = wz.c("narration.tab_navigation.usage");
   private final fmd f = fmd.e();
   private int g;
   private final fkp h;
   private final ImmutableList<fko> i;
   private final ImmutableList<fjv> j;

   fkq(int $$0, fkp $$1, Iterable<fko> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fjv> $$3 = ImmutableList.builder();

      for (fko $$4 : $$2) {
         $$3.add(this.f.a(new fjv($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fkq.a a(fkp $$0, int $$1) {
      return new fkq.a($$0, $$1);
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if (this.aN_() != null) {
         this.aN_().a($$0);
      }
   }

   @Override
   public void a(@Nullable fki $$0) {
      super.a($$0);
      if ($$0 instanceof fjv $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fhw a(fmo $$0) {
      if (!this.aO_()) {
         fjv $$1 = this.d();
         if ($$1 != null) {
            return fhw.a(this, fhw.a($$1));
         }
      }

      return $$0 instanceof fmo.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fki> aK_() {
      return this.j;
   }

   @Override
   public fmg.a u() {
      return this.j.stream().map(fik::u).max(Comparator.naturalOrder()).orElse(fmg.a.a);
   }

   @Override
   public void b(fmi $$0) {
      Optional<fjv> $$1 = this.j.stream().filter(fik::A).findFirst().or(() -> Optional.ofNullable(this.d()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aO_()) {
         $$0.a(fmh.d, e);
      }
   }

   protected void a(fmi $$0, fjv $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fmh.b, wz.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      RenderSystem.enableBlend();
      $$0.a(fod.g, 0, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, ((fjv)this.j.get(0)).D(), 2, 32, 2);
      int $$4 = ((fjv)this.j.get(this.j.size() - 1)).F();
      $$0.a(fod.g, $$4, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      RenderSystem.disableBlend();
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fjv $$5 = (fjv)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fms H() {
      return this.f.H();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = ayo.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fjv $$2 = (fjv)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(ayo.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aO_()) {
         this.a((fki)this.j.get($$0));
      } else {
         this.h.a((fko)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fod.r()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(ayo.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = fod.s() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fko $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fjv d() {
      int $$0 = this.c();
      return $$0 != -1 ? (fjv)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fkp b;
      private final List<fko> c = new ArrayList<>();

      a(fkp $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fkq.a a(fko... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fkq a() {
         return new fkq(this.a, this.b, this.c);
      }
   }
}
