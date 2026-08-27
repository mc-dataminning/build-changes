import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ewp extends ewf implements evp, ewh, eyd {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final ur e = ur.c("narration.tab_navigation.usage");
   private final exv f;
   private int g;
   private final ewo h;
   private final ImmutableList<ewn> i;
   private final ImmutableList<evv> j;

   ewp(int $$0, ewo $$1, Iterable<ewn> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f = new exv(0, 0);
      this.f.c().b();
      Builder<evv> $$3 = ImmutableList.builder();
      int $$4 = 0;

      for (ewn $$5 : $$2) {
         $$3.add(this.f.a(new evv($$1, $$5, 0, 24), 0, $$4++));
      }

      this.j = $$3.build();
   }

   public static ewp.a a(ewo $$0, int $$1) {
      return new ewp.a($$0, $$1);
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   @Override
   public void b_(boolean $$0) {
      super.b_($$0);
      if (this.t() != null) {
         this.t().b_($$0);
      }
   }

   @Override
   public void a(@Nullable ewh $$0) {
      super.a($$0);
      if ($$0 instanceof evv $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public ety a(eyl $$0) {
      if (!this.aI_()) {
         evv $$1 = this.e();
         if ($$1 != null) {
            return ety.a(this, ety.a($$1));
         }
      }

      return $$0 instanceof eyl.c ? null : super.a($$0);
   }

   @Override
   public List<? extends ewh> i() {
      return this.j;
   }

   @Override
   public eyd.a q() {
      return this.j.stream().map(euk::q).max(Comparator.naturalOrder()).orElse(eyd.a.a);
   }

   @Override
   public void b(eyf $$0) {
      Optional<evv> $$1 = this.j.stream().filter(euk::m).findFirst().or(() -> Optional.ofNullable(this.e()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aI_()) {
         $$0.a(eye.d, e);
      }
   }

   protected void a(eyf $$0, evv $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(eye.b, ur.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      $$0.a(0, 0, this.g, 24, -16777216);
      $$0.a(fex.a, 0, this.f.r() + this.f.i() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var5 = this.j.iterator();

      while (var5.hasNext()) {
         evv $$4 = (evv)var5.next();
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public eyp s() {
      return this.f.s();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = ati.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         evv $$2 = (evv)var3.next();
         $$2.d($$1);
      }

      this.f.a();
      this.f.f(ati.d((this.g - $$0) / 2, 2));
      this.f.g(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aI_()) {
         this.a((ewh)this.j.get($$0));
      } else {
         this.h.a((ewn)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fah.p()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(ati.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = fah.q() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      ewn $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private evv e() {
      int $$0 = this.c();
      return $$0 != -1 ? (evv)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final ewo b;
      private final List<ewn> c = new ArrayList<>();

      a(ewo $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public ewp.a a(ewn... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public ewp a() {
         return new ewp(this.a, this.b, this.c);
      }
   }
}
