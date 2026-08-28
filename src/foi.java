import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class foi extends fny implements fng, fpz {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final xj e = xj.c("narration.tab_navigation.usage");
   private final fpw f = fpw.e();
   private int g;
   private final foh h;
   private final ImmutableList<fog> i;
   private final ImmutableList<fnm> j;

   foi(int $$0, foh $$1, Iterable<fog> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fnm> $$3 = ImmutableList.builder();

      for (fog $$4 : $$2) {
         $$3.add(this.f.a(new fnm($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static foi.a a(foh $$0, int $$1) {
      return new foi.a($$0, $$1);
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if (this.aK_() != null) {
         this.aK_().a($$0);
      }
   }

   @Override
   public void a(@Nullable foa $$0) {
      super.a($$0);
      if ($$0 instanceof fnm $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fln a(fqh $$0) {
      if (!this.aL_()) {
         fnm $$1 = this.d();
         if ($$1 != null) {
            return fln.a(this, fln.a($$1));
         }
      }

      return $$0 instanceof fqh.c ? null : super.a($$0);
   }

   @Override
   public List<? extends foa> aH_() {
      return this.j;
   }

   @Override
   public fpz.a u() {
      return this.j.stream().map(fmb::u).max(Comparator.naturalOrder()).orElse(fpz.a.a);
   }

   @Override
   public void b(fqb $$0) {
      Optional<fnm> $$1 = this.j.stream().filter(fmb::A).findFirst().or(() -> Optional.ofNullable(this.d()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aL_()) {
         $$0.a(fqa.d, e);
      }
   }

   protected void a(fqb $$0, fnm $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fqa.b, xj.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      $$0.a(gjq::B, frw.h, 0, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, ((fnm)this.j.get(0)).D(), 2, 32, 2);
      int $$4 = ((fnm)this.j.get(this.j.size() - 1)).F();
      $$0.a(gjq::B, frw.h, $$4, this.f.E() + this.f.w() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fnm $$5 = (fnm)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fql H() {
      return this.f.H();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = azm.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fnm $$2 = (fnm)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(azm.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aL_()) {
         this.a((foa)this.j.get($$0));
      } else {
         this.h.a((fog)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (frw.s()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(azm.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = frw.t() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      fog $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fnm d() {
      int $$0 = this.c();
      return $$0 != -1 ? (fnm)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final foh b;
      private final List<fog> c = new ArrayList<>();

      a(foh $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public foi.a a(fog... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public foi a() {
         return new foi(this.a, this.b, this.c);
      }
   }
}
