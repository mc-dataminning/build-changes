import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ezj extends eyz implements eyj, fax {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final vf e = vf.c("narration.tab_navigation.usage");
   private final fap f;
   private int g;
   private final ezi h;
   private final ImmutableList<ezh> i;
   private final ImmutableList<eyp> j;

   ezj(int $$0, ezi $$1, Iterable<ezh> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f = new fap(0, 0);
      this.f.c().b();
      Builder<eyp> $$3 = ImmutableList.builder();
      int $$4 = 0;

      for (ezh $$5 : $$2) {
         $$3.add(this.f.a(new eyp($$1, $$5, 0, 24), 0, $$4++));
      }

      this.j = $$3.build();
   }

   public static ezj.a a(ezi $$0, int $$1) {
      return new ezj.a($$0, $$1);
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
   public void a(@Nullable ezb $$0) {
      super.a($$0);
      if ($$0 instanceof eyp $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public ewr a(fbf $$0) {
      if (!this.aI_()) {
         eyp $$1 = this.c();
         if ($$1 != null) {
            return ewr.a(this, ewr.a($$1));
         }
      }

      return $$0 instanceof fbf.c ? null : super.a($$0);
   }

   @Override
   public List<? extends ezb> l() {
      return this.j;
   }

   @Override
   public fax.a s() {
      return this.j.stream().map(exe::s).max(Comparator.naturalOrder()).orElse(fax.a.a);
   }

   @Override
   public void b(faz $$0) {
      Optional<eyp> $$1 = this.j.stream().filter(exe::y).findFirst().or(() -> Optional.ofNullable(this.c()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aI_()) {
         $$0.a(fay.d, e);
      }
   }

   protected void a(faz $$0, eyp $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fay.b, vf.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      $$0.a(0, 0, this.g, 24, -16777216);
      $$0.a(fhr.a, 0, this.f.C() + this.f.u() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var5 = this.j.iterator();

      while (var5.hasNext()) {
         eyp $$4 = (eyp)var5.next();
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fbj F() {
      return this.f.F();
   }

   public void a() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = auo.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         eyp $$2 = (eyp)var3.next();
         $$2.l($$1);
      }

      this.f.a();
      this.f.n(auo.d((this.g - $$0) / 2, 2));
      this.f.o(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aI_()) {
         this.a((ezb)this.j.get($$0));
      } else {
         this.h.a((ezh)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fdb.s()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(auo.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = fdb.t() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int b() {
      ezh $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private eyp c() {
      int $$0 = this.b();
      return $$0 != -1 ? (eyp)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final ezi b;
      private final List<ezh> c = new ArrayList<>();

      a(ezi $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public ezj.a a(ezh... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public ezj a() {
         return new ezj(this.a, this.b, this.c);
      }
   }
}
