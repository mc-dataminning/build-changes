import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class eus extends eui implements ets, euk, ewg {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final tl e = tl.c("narration.tab_navigation.usage");
   private final evy f;
   private int g;
   private final eur h;
   private final ImmutableList<euq> i;
   private final ImmutableList<ety> j;

   eus(int $$0, eur $$1, Iterable<euq> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f = new evy(0, 0);
      this.f.c().b();
      Builder<ety> $$3 = ImmutableList.builder();
      int $$4 = 0;

      for (euq $$5 : $$2) {
         $$3.add(this.f.a(new ety($$1, $$5, 0, 24), 0, $$4++));
      }

      this.j = $$3.build();
   }

   public static eus.a a(eur $$0, int $$1) {
      return new eus.a($$0, $$1);
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
   public void a(@Nullable euk $$0) {
      super.a($$0);
      if ($$0 instanceof ety $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public esc a(ewo $$0) {
      if (!this.aC_()) {
         ety $$1 = this.e();
         if ($$1 != null) {
            return esc.a(this, esc.a($$1));
         }
      }

      return $$0 instanceof ewo.c ? null : super.a($$0);
   }

   @Override
   public List<? extends euk> i() {
      return this.j;
   }

   @Override
   public ewg.a q() {
      return this.j.stream().map(eso::q).max(Comparator.naturalOrder()).orElse(ewg.a.a);
   }

   @Override
   public void b(ewi $$0) {
      Optional<ety> $$1 = this.j.stream().filter(eso::n).findFirst().or(() -> Optional.ofNullable(this.e()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aC_()) {
         $$0.a(ewh.d, e);
      }
   }

   protected void a(ewi $$0, ety $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(ewh.b, tl.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      $$0.a(0, 0, this.g, 24, -16777216);
      $$0.a(fcy.a, 0, this.f.t() + this.f.i() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var5 = this.j.iterator();

      while (var5.hasNext()) {
         ety $$4 = (ety)var5.next();
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public ews s() {
      return this.f.s();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = arw.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         ety $$2 = (ety)var3.next();
         $$2.d($$1);
      }

      this.f.a();
      this.f.f(arw.d((this.g - $$0) / 2, 2));
      this.f.g(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aC_()) {
         this.a((euk)this.j.get($$0));
      } else {
         this.h.a((euq)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (eyk.p()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(arw.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = eyk.q() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int d() {
      euq $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private ety e() {
      int $$0 = this.d();
      return $$0 != -1 ? (ety)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final eur b;
      private final List<euq> c = new ArrayList<>();

      a(eur $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public eus.a a(euq... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public eus a() {
         return new eus(this.a, this.b, this.c);
      }
   }
}
