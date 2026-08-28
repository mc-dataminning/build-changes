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

public class fjy extends fjo implements fix, flo {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final wu e = wu.c("narration.tab_navigation.usage");
   private final fll f = fll.e();
   private int g;
   private final fjx h;
   private final ImmutableList<fjw> i;
   private final ImmutableList<fjd> j;

   fjy(int $$0, fjx $$1, Iterable<fjw> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fjd> $$3 = ImmutableList.builder();

      for (fjw $$4 : $$2) {
         $$3.add(this.f.a(new fjd($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fjy.a a(fjx $$0, int $$1) {
      return new fjy.a($$0, $$1);
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
   public void a(@Nullable fjq $$0) {
      super.a($$0);
      if ($$0 instanceof fjd $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fhe a(flw $$0) {
      if (!this.aK_()) {
         fjd $$1 = this.d();
         if ($$1 != null) {
            return fhe.a(this, fhe.a($$1));
         }
      }

      return $$0 instanceof flw.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fjq> aG_() {
      return this.j;
   }

   @Override
   public flo.a u() {
      return this.j.stream().map(fhs::u).max(Comparator.naturalOrder()).orElse(flo.a.a);
   }

   @Override
   public void b(flq $$0) {
      Optional<fjd> $$1 = this.j.stream().filter(fhs::A).findFirst().or(() -> Optional.ofNullable(this.d()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aK_()) {
         $$0.a(flp.d, e);
      }
   }

   protected void a(flq $$0, fjd $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(flp.b, wu.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      RenderSystem.enableBlend();
      $$0.a(fnl.g, 0, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, ((fjd)this.j.get(0)).D(), 2, 32, 2);
      int $$4 = ((fjd)this.j.get(this.j.size() - 1)).F();
      $$0.a(fnl.g, $$4, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      RenderSystem.disableBlend();
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fjd $$5 = (fjd)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fma H() {
      return this.f.H();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = ayg.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fjd $$2 = (fjd)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(ayg.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aK_()) {
         this.a((fjq)this.j.get($$0));
      } else {
         this.h.a((fjw)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fnl.r()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(ayg.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = fnl.s() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fjw $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fjd d() {
      int $$0 = this.c();
      return $$0 != -1 ? (fjd)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fjx b;
      private final List<fjw> c = new ArrayList<>();

      a(fjx $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fjy.a a(fjw... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fjy a() {
         return new fjy(this.a, this.b, this.c);
      }
   }
}
