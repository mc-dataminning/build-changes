import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ezi extends eyy implements eyi, faw {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final vf e = vf.c("narration.tab_navigation.usage");
   private final fao f;
   private int g;
   private final ezh h;
   private final ImmutableList<ezg> i;
   private final ImmutableList<eyo> j;

   ezi(int $$0, ezh $$1, Iterable<ezg> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f = new fao(0, 0);
      this.f.c().b();
      Builder<eyo> $$3 = ImmutableList.builder();
      int $$4 = 0;

      for (ezg $$5 : $$2) {
         $$3.add(this.f.a(new eyo($$1, $$5, 0, 24), 0, $$4++));
      }

      this.j = $$3.build();
   }

   public static ezi.a a(ezh $$0, int $$1) {
      return new ezi.a($$0, $$1);
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
   public void a(@Nullable eza $$0) {
      super.a($$0);
      if ($$0 instanceof eyo $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public ewq a(fbe $$0) {
      if (!this.aI_()) {
         eyo $$1 = this.c();
         if ($$1 != null) {
            return ewq.a(this, ewq.a($$1));
         }
      }

      return $$0 instanceof fbe.c ? null : super.a($$0);
   }

   @Override
   public List<? extends eza> l() {
      return this.j;
   }

   @Override
   public faw.a s() {
      return this.j.stream().map(exd::s).max(Comparator.naturalOrder()).orElse(faw.a.a);
   }

   @Override
   public void b(fay $$0) {
      Optional<eyo> $$1 = this.j.stream().filter(exd::y).findFirst().or(() -> Optional.ofNullable(this.c()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aI_()) {
         $$0.a(fax.d, e);
      }
   }

   protected void a(fay $$0, eyo $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fax.b, vf.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      $$0.a(0, 0, this.g, 24, -16777216);
      $$0.a(fhq.a, 0, this.f.C() + this.f.u() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var5 = this.j.iterator();

      while (var5.hasNext()) {
         eyo $$4 = (eyo)var5.next();
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fbi F() {
      return this.f.F();
   }

   public void a() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = aun.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         eyo $$2 = (eyo)var3.next();
         $$2.l($$1);
      }

      this.f.a();
      this.f.n(aun.d((this.g - $$0) / 2, 2));
      this.f.o(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aI_()) {
         this.a((eza)this.j.get($$0));
      } else {
         this.h.a((ezg)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fda.s()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(aun.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = fda.t() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int b() {
      ezg $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private eyo c() {
      int $$0 = this.b();
      return $$0 != -1 ? (eyo)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final ezh b;
      private final List<ezg> c = new ArrayList<>();

      a(ezh $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public ezi.a a(ezg... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public ezi a() {
         return new ezi(this.a, this.b, this.c);
      }
   }
}
