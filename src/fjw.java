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

public class fjw extends fjm implements fiv, flm {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final wu e = wu.c("narration.tab_navigation.usage");
   private final flj f = flj.e();
   private int g;
   private final fjv h;
   private final ImmutableList<fju> i;
   private final ImmutableList<fjb> j;

   fjw(int $$0, fjv $$1, Iterable<fju> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fjb> $$3 = ImmutableList.builder();

      for (fju $$4 : $$2) {
         $$3.add(this.f.a(new fjb($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fjw.a a(fjv $$0, int $$1) {
      return new fjw.a($$0, $$1);
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
   public void a(@Nullable fjo $$0) {
      super.a($$0);
      if ($$0 instanceof fjb $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fhc a(flu $$0) {
      if (!this.aK_()) {
         fjb $$1 = this.d();
         if ($$1 != null) {
            return fhc.a(this, fhc.a($$1));
         }
      }

      return $$0 instanceof flu.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fjo> aG_() {
      return this.j;
   }

   @Override
   public flm.a u() {
      return this.j.stream().map(fhq::u).max(Comparator.naturalOrder()).orElse(flm.a.a);
   }

   @Override
   public void b(flo $$0) {
      Optional<fjb> $$1 = this.j.stream().filter(fhq::A).findFirst().or(() -> Optional.ofNullable(this.d()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aK_()) {
         $$0.a(fln.d, e);
      }
   }

   protected void a(flo $$0, fjb $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fln.b, wu.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      RenderSystem.enableBlend();
      $$0.a(fnj.g, 0, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, ((fjb)this.j.get(0)).D(), 2, 32, 2);
      int $$4 = ((fjb)this.j.get(this.j.size() - 1)).F();
      $$0.a(fnj.g, $$4, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      RenderSystem.disableBlend();
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fjb $$5 = (fjb)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fly H() {
      return this.f.H();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = ayg.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fjb $$2 = (fjb)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(ayg.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aK_()) {
         this.a((fjo)this.j.get($$0));
      } else {
         this.h.a((fju)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fnj.s()) {
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
               int $$2 = fnj.t() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fju $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fjb d() {
      int $$0 = this.c();
      return $$0 != -1 ? (fjb)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fjv b;
      private final List<fju> c = new ArrayList<>();

      a(fjv $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fjw.a a(fju... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fjw a() {
         return new fjw(this.a, this.b, this.c);
      }
   }
}
