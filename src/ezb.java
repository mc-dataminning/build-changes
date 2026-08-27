import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ezb extends eyr implements eyb, fap {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final vd e = vd.c("narration.tab_navigation.usage");
   private final fah f;
   private int g;
   private final eza h;
   private final ImmutableList<eyz> i;
   private final ImmutableList<eyh> j;

   ezb(int $$0, eza $$1, Iterable<eyz> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f = new fah(0, 0);
      this.f.c().b();
      Builder<eyh> $$3 = ImmutableList.builder();
      int $$4 = 0;

      for (eyz $$5 : $$2) {
         $$3.add(this.f.a(new eyh($$1, $$5, 0, 24), 0, $$4++));
      }

      this.j = $$3.build();
   }

   public static ezb.a a(eza $$0, int $$1) {
      return new ezb.a($$0, $$1);
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if (this.aH_() != null) {
         this.aH_().a($$0);
      }
   }

   @Override
   public void a(@Nullable eyt $$0) {
      super.a($$0);
      if ($$0 instanceof eyh $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public ewj a(fax $$0) {
      if (!this.aI_()) {
         eyh $$1 = this.c();
         if ($$1 != null) {
            return ewj.a(this, ewj.a($$1));
         }
      }

      return $$0 instanceof fax.c ? null : super.a($$0);
   }

   @Override
   public List<? extends eyt> l() {
      return this.j;
   }

   @Override
   public fap.a s() {
      return this.j.stream().map(eww::s).max(Comparator.naturalOrder()).orElse(fap.a.a);
   }

   @Override
   public void b(far $$0) {
      Optional<eyh> $$1 = this.j.stream().filter(eww::y).findFirst().or(() -> Optional.ofNullable(this.c()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aI_()) {
         $$0.a(faq.d, e);
      }
   }

   protected void a(far $$0, eyh $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(faq.b, vd.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      $$0.a(0, 0, this.g, 24, -16777216);
      $$0.a(fhj.a, 0, this.f.C() + this.f.u() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var5 = this.j.iterator();

      while (var5.hasNext()) {
         eyh $$4 = (eyh)var5.next();
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fbb F() {
      return this.f.F();
   }

   public void a() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = aui.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         eyh $$2 = (eyh)var3.next();
         $$2.l($$1);
      }

      this.f.a();
      this.f.n(aui.d((this.g - $$0) / 2, 2));
      this.f.o(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aI_()) {
         this.a((eyt)this.j.get($$0));
      } else {
         this.h.a((eyz)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fct.r()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(aui.a($$1, 0, this.i.size() - 1), true);
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
            int $$1 = this.b();
            if ($$1 != -1) {
               int $$2 = fct.s() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int b() {
      eyz $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private eyh c() {
      int $$0 = this.b();
      return $$0 != -1 ? (eyh)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final eza b;
      private final List<eyz> c = new ArrayList<>();

      a(eza $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public ezb.a a(eyz... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public ezb a() {
         return new ezb(this.a, this.b, this.c);
      }
   }
}
