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

public class fkk extends fka implements fjj, fma {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final wy e = wy.c("narration.tab_navigation.usage");
   private final flx f = flx.e();
   private int g;
   private final fkj h;
   private final ImmutableList<fki> i;
   private final ImmutableList<fjp> j;

   fkk(int $$0, fkj $$1, Iterable<fki> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fjp> $$3 = ImmutableList.builder();

      for (fki $$4 : $$2) {
         $$3.add(this.f.a(new fjp($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fkk.a a(fkj $$0, int $$1) {
      return new fkk.a($$0, $$1);
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if (this.aJ_() != null) {
         this.aJ_().a($$0);
      }
   }

   @Override
   public void a(@Nullable fkc $$0) {
      super.a($$0);
      if ($$0 instanceof fjp $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fhq a(fmi $$0) {
      if (!this.aK_()) {
         fjp $$1 = this.d();
         if ($$1 != null) {
            return fhq.a(this, fhq.a($$1));
         }
      }

      return $$0 instanceof fmi.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fkc> aG_() {
      return this.j;
   }

   @Override
   public fma.a u() {
      return this.j.stream().map(fie::u).max(Comparator.naturalOrder()).orElse(fma.a.a);
   }

   @Override
   public void b(fmc $$0) {
      Optional<fjp> $$1 = this.j.stream().filter(fie::A).findFirst().or(() -> Optional.ofNullable(this.d()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aK_()) {
         $$0.a(fmb.d, e);
      }
   }

   protected void a(fmc $$0, fjp $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fmb.b, wy.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      RenderSystem.enableBlend();
      $$0.a(fnx.g, 0, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, ((fjp)this.j.get(0)).D(), 2, 32, 2);
      int $$4 = ((fjp)this.j.get(this.j.size() - 1)).F();
      $$0.a(fnx.g, $$4, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      RenderSystem.disableBlend();
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fjp $$5 = (fjp)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fmm H() {
      return this.f.H();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = ayn.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fjp $$2 = (fjp)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(ayn.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aK_()) {
         this.a((fkc)this.j.get($$0));
      } else {
         this.h.a((fki)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fnx.r()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(ayn.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = fnx.s() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fki $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fjp d() {
      int $$0 = this.c();
      return $$0 != -1 ? (fjp)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fkj b;
      private final List<fki> c = new ArrayList<>();

      a(fkj $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fkk.a a(fki... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fkk a() {
         return new fkk(this.a, this.b, this.c);
      }
   }
}
