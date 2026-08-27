import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fco extends fce implements fbn, fed {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final vs e = vs.c("narration.tab_navigation.usage");
   private final fdv f;
   private int g;
   private final fcn h;
   private final ImmutableList<fcm> i;
   private final ImmutableList<fbt> j;

   fco(int $$0, fcn $$1, Iterable<fcm> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f = new fdv(0, 0);
      this.f.c().b();
      Builder<fbt> $$3 = ImmutableList.builder();
      int $$4 = 0;

      for (fcm $$5 : $$2) {
         $$3.add(this.f.a(new fbt($$1, $$5, 0, 24), 0, $$4++));
      }

      this.j = $$3.build();
   }

   public static fco.a a(fcn $$0, int $$1) {
      return new fco.a($$0, $$1);
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
   public void a(@Nullable fcg $$0) {
      super.a($$0);
      if ($$0 instanceof fbt $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public ezu a(fel $$0) {
      if (!this.aK_()) {
         fbt $$1 = this.c();
         if ($$1 != null) {
            return ezu.a(this, ezu.a($$1));
         }
      }

      return $$0 instanceof fel.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fcg> l() {
      return this.j;
   }

   @Override
   public fed.a s() {
      return this.j.stream().map(fai::s).max(Comparator.naturalOrder()).orElse(fed.a.a);
   }

   @Override
   public void b(fef $$0) {
      Optional<fbt> $$1 = this.j.stream().filter(fai::y).findFirst().or(() -> Optional.ofNullable(this.c()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aK_()) {
         $$0.a(fee.d, e);
      }
   }

   protected void a(fef $$0, fbt $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fee.b, vs.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      $$0.a(0, 0, this.g, 24, -16777216);
      $$0.a(fkx.a, 0, this.f.C() + this.f.u() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var5 = this.j.iterator();

      while (var5.hasNext()) {
         fbt $$4 = (fbt)var5.next();
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fep F() {
      return this.f.F();
   }

   public void a() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = awm.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fbt $$2 = (fbt)var3.next();
         $$2.k($$1);
      }

      this.f.a();
      this.f.m(awm.d((this.g - $$0) / 2, 2));
      this.f.n(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aK_()) {
         this.a((fcg)this.j.get($$0));
      } else {
         this.h.a((fcm)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fgh.t()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(awm.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = fgh.v() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int b() {
      fcm $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fbt c() {
      int $$0 = this.b();
      return $$0 != -1 ? (fbt)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fcn b;
      private final List<fcm> c = new ArrayList<>();

      a(fcn $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fco.a a(fcm... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fco a() {
         return new fco(this.a, this.b, this.c);
      }
   }
}
