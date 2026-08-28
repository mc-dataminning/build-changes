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

public class fjq extends fjg implements fip, flg {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final wu e = wu.c("narration.tab_navigation.usage");
   private final fld f = fld.e();
   private int g;
   private final fjp h;
   private final ImmutableList<fjo> i;
   private final ImmutableList<fiv> j;

   fjq(int $$0, fjp $$1, Iterable<fjo> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fiv> $$3 = ImmutableList.builder();

      for (fjo $$4 : $$2) {
         $$3.add(this.f.a(new fiv($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fjq.a a(fjp $$0, int $$1) {
      return new fjq.a($$0, $$1);
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if (this.aI_() != null) {
         this.aI_().a($$0);
      }
   }

   @Override
   public void a(@Nullable fji $$0) {
      super.a($$0);
      if ($$0 instanceof fiv $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fgw a(flo $$0) {
      if (!this.aJ_()) {
         fiv $$1 = this.d();
         if ($$1 != null) {
            return fgw.a(this, fgw.a($$1));
         }
      }

      return $$0 instanceof flo.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fji> aF_() {
      return this.j;
   }

   @Override
   public flg.a u() {
      return this.j.stream().map(fhk::u).max(Comparator.naturalOrder()).orElse(flg.a.a);
   }

   @Override
   public void b(fli $$0) {
      Optional<fiv> $$1 = this.j.stream().filter(fhk::A).findFirst().or(() -> Optional.ofNullable(this.d()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aJ_()) {
         $$0.a(flh.d, e);
      }
   }

   protected void a(fli $$0, fiv $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(flh.b, wu.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      RenderSystem.enableBlend();
      $$0.a(fnd.g, 0, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, ((fiv)this.j.get(0)).D(), 2, 32, 2);
      int $$4 = ((fiv)this.j.get(this.j.size() - 1)).F();
      $$0.a(fnd.g, $$4, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      RenderSystem.disableBlend();
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fiv $$5 = (fiv)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fls H() {
      return this.f.H();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = aye.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fiv $$2 = (fiv)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(aye.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aJ_()) {
         this.a((fji)this.j.get($$0));
      } else {
         this.h.a((fjo)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fnd.s()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(aye.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = fnd.t() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fjo $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fiv d() {
      int $$0 = this.c();
      return $$0 != -1 ? (fiv)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fjp b;
      private final List<fjo> c = new ArrayList<>();

      a(fjp $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fjq.a a(fjo... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fjq a() {
         return new fjq(this.a, this.b, this.c);
      }
   }
}
