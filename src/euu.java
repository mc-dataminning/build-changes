import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class euu extends euk implements etu, eum, ewi {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final tn e = tn.c("narration.tab_navigation.usage");
   private final ewa f;
   private int g;
   private final eut h;
   private final ImmutableList<eus> i;
   private final ImmutableList<eua> j;

   euu(int $$0, eut $$1, Iterable<eus> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f = new ewa(0, 0);
      this.f.c().b();
      Builder<eua> $$3 = ImmutableList.builder();
      int $$4 = 0;

      for (eus $$5 : $$2) {
         $$3.add(this.f.a(new eua($$1, $$5, 0, 24), 0, $$4++));
      }

      this.j = $$3.build();
   }

   public static euu.a a(eut $$0, int $$1) {
      return new euu.a($$0, $$1);
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
   public void a(@Nullable eum $$0) {
      super.a($$0);
      if ($$0 instanceof eua $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public ese a(ewq $$0) {
      if (!this.aC_()) {
         eua $$1 = this.e();
         if ($$1 != null) {
            return ese.a(this, ese.a($$1));
         }
      }

      return $$0 instanceof ewq.c ? null : super.a($$0);
   }

   @Override
   public List<? extends eum> i() {
      return this.j;
   }

   @Override
   public ewi.a q() {
      return this.j.stream().map(esq::q).max(Comparator.naturalOrder()).orElse(ewi.a.a);
   }

   @Override
   public void b(ewk $$0) {
      Optional<eua> $$1 = this.j.stream().filter(esq::n).findFirst().or(() -> Optional.ofNullable(this.e()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aC_()) {
         $$0.a(ewj.d, e);
      }
   }

   protected void a(ewk $$0, eua $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(ewj.b, tn.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      $$0.a(0, 0, this.g, 24, -16777216);
      $$0.a(fda.a, 0, this.f.t() + this.f.i() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var5 = this.j.iterator();

      while (var5.hasNext()) {
         eua $$4 = (eua)var5.next();
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public ewu s() {
      return this.f.s();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = ary.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         eua $$2 = (eua)var3.next();
         $$2.d($$1);
      }

      this.f.a();
      this.f.f(ary.d((this.g - $$0) / 2, 2));
      this.f.g(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aC_()) {
         this.a((eum)this.j.get($$0));
      } else {
         this.h.a((eus)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (eym.p()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(ary.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = eym.q() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int d() {
      eus $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private eua e() {
      int $$0 = this.d();
      return $$0 != -1 ? (eua)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final eut b;
      private final List<eus> c = new ArrayList<>();

      a(eut $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public euu.a a(eus... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public euu a() {
         return new euu(this.a, this.b, this.c);
      }
   }
}
