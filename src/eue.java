import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class eue extends etu implements etj, etw, evr {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final te e = te.c("narration.tab_navigation.usage");
   private final evj f;
   private int g;
   private final eud h;
   private final ImmutableList<euc> i;
   private final ImmutableList<etp> j;

   eue(int $$0, eud $$1, Iterable<euc> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f = new evj(0, 0);
      this.f.c().b();
      Builder<etp> $$3 = ImmutableList.builder();
      int $$4 = 0;

      for (euc $$5 : $$2) {
         $$3.add(this.f.a(new etp($$1, $$5, 0, 24), 0, $$4++));
      }

      this.j = $$3.build();
   }

   public static eue.a a(eud $$0, int $$1) {
      return new eue.a($$0, $$1);
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   @Override
   public void c_(boolean $$0) {
      super.c_($$0);
      if (this.t() != null) {
         this.t().c_($$0);
      }
   }

   @Override
   public void a(@Nullable etw $$0) {
      super.a($$0);
      if ($$0 instanceof etp $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public eru a(evz $$0) {
      if (!this.ax_()) {
         etp $$1 = this.e();
         if ($$1 != null) {
            return eru.a(this, eru.a($$1));
         }
      }

      return $$0 instanceof evz.c ? null : super.a($$0);
   }

   @Override
   public List<? extends etw> i() {
      return this.j;
   }

   @Override
   public evr.a q() {
      return this.j.stream().map(esg::q).max(Comparator.naturalOrder()).orElse(evr.a.a);
   }

   @Override
   public void b(evt $$0) {
      Optional<etp> $$1 = this.j.stream().filter(esg::m).findFirst().or(() -> Optional.ofNullable(this.e()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.ax_()) {
         $$0.a(evs.d, e);
      }
   }

   protected void a(evt $$0, etp $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(evs.b, te.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      $$0.a(0, 0, this.g, 24, -16777216);
      $$0.a(fcf.a, 0, this.f.r() + this.f.h() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var5 = this.j.iterator();

      while (var5.hasNext()) {
         etp $$4 = (etp)var5.next();
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public ewd s() {
      return this.f.s();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = aro.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         etp $$2 = (etp)var3.next();
         $$2.d($$1);
      }

      this.f.a();
      this.f.e(aro.d((this.g - $$0) / 2, 2));
      this.f.f(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.ax_()) {
         this.a((etw)this.j.get($$0));
      } else {
         this.h.a((euc)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (exv.p()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(aro.a($$1, 0, this.i.size() - 1), true);
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
            int $$1 = this.d();
            if ($$1 != -1) {
               int $$2 = exv.q() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int d() {
      euc $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private etp e() {
      int $$0 = this.d();
      return $$0 != -1 ? (etp)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final eud b;
      private final List<euc> c = new ArrayList<>();

      a(eud $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public eue.a a(euc... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public eue a() {
         return new eue(this.a, this.b, this.c);
      }
   }
}
