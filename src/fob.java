import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fob extends fnr implements fmz, fps {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final xl e = xl.c("narration.tab_navigation.usage");
   private final fpp f = fpp.e();
   private int g;
   private final foa h;
   private final ImmutableList<fnz> i;
   private final ImmutableList<fnf> j;

   fob(int $$0, foa $$1, Iterable<fnz> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fnf> $$3 = ImmutableList.builder();

      for (fnz $$4 : $$2) {
         $$3.add(this.f.a(new fnf($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fob.a a(foa $$0, int $$1) {
      return new fob.a($$0, $$1);
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
   public void a(@Nullable fnt $$0) {
      super.a($$0);
      if ($$0 instanceof fnf $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public flg a(fqa $$0) {
      if (!this.aM_()) {
         fnf $$1 = this.d();
         if ($$1 != null) {
            return flg.a(this, flg.a($$1));
         }
      }

      return $$0 instanceof fqa.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fnt> aI_() {
      return this.j;
   }

   @Override
   public fps.a u() {
      return this.j.stream().map(flu::u).max(Comparator.naturalOrder()).orElse(fps.a.a);
   }

   @Override
   public void b(fpu $$0) {
      Optional<fnf> $$1 = this.j.stream().filter(flu::A).findFirst().or(() -> Optional.ofNullable(this.d()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aM_()) {
         $$0.a(fpt.d, e);
      }
   }

   protected void a(fpu $$0, fnf $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fpt.b, xl.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      $$0.a(gjh::B, frp.h, 0, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, ((fnf)this.j.get(0)).D(), 2, 32, 2);
      int $$4 = ((fnf)this.j.get(this.j.size() - 1)).F();
      $$0.a(gjh::B, frp.h, $$4, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fnf $$5 = (fnf)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fqe H() {
      return this.f.H();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = azn.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fnf $$2 = (fnf)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(azn.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aM_()) {
         this.a((fnt)this.j.get($$0));
      } else {
         this.h.a((fnz)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (frp.s()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(azn.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = frp.t() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fnz $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fnf d() {
      int $$0 = this.c();
      return $$0 != -1 ? (fnf)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final foa b;
      private final List<fnz> c = new ArrayList<>();

      a(foa $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fob.a a(fnz... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fob a() {
         return new fob(this.a, this.b, this.c);
      }
   }
}
