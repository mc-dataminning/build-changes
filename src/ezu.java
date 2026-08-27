import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ezu extends ezk implements eyu, fbi {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final vg e = vg.c("narration.tab_navigation.usage");
   private final fba f;
   private int g;
   private final ezt h;
   private final ImmutableList<ezs> i;
   private final ImmutableList<eza> j;

   ezu(int $$0, ezt $$1, Iterable<ezs> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f = new fba(0, 0);
      this.f.c().b();
      Builder<eza> $$3 = ImmutableList.builder();
      int $$4 = 0;

      for (ezs $$5 : $$2) {
         $$3.add(this.f.a(new eza($$1, $$5, 0, 24), 0, $$4++));
      }

      this.j = $$3.build();
   }

   public static ezu.a a(ezt $$0, int $$1) {
      return new ezu.a($$0, $$1);
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
   public void a(@Nullable ezm $$0) {
      super.a($$0);
      if ($$0 instanceof eza $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public exb a(fbq $$0) {
      if (!this.aK_()) {
         eza $$1 = this.c();
         if ($$1 != null) {
            return exb.a(this, exb.a($$1));
         }
      }

      return $$0 instanceof fbq.c ? null : super.a($$0);
   }

   @Override
   public List<? extends ezm> l() {
      return this.j;
   }

   @Override
   public fbi.a s() {
      return this.j.stream().map(exp::s).max(Comparator.naturalOrder()).orElse(fbi.a.a);
   }

   @Override
   public void b(fbk $$0) {
      Optional<eza> $$1 = this.j.stream().filter(exp::y).findFirst().or(() -> Optional.ofNullable(this.c()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aK_()) {
         $$0.a(fbj.d, e);
      }
   }

   protected void a(fbk $$0, eza $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(fbj.b, vg.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      $$0.a(0, 0, this.g, 24, -16777216);
      $$0.a(fic.a, 0, this.f.C() + this.f.u() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var5 = this.j.iterator();

      while (var5.hasNext()) {
         eza $$4 = (eza)var5.next();
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fbu F() {
      return this.f.F();
   }

   public void a() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = aup.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         eza $$2 = (eza)var3.next();
         $$2.l($$1);
      }

      this.f.a();
      this.f.n(aup.d((this.g - $$0) / 2, 2));
      this.f.o(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aK_()) {
         this.a((ezm)this.j.get($$0));
      } else {
         this.h.a((ezs)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fdm.t()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(aup.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = fdm.v() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int b() {
      ezs $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private eza c() {
      int $$0 = this.b();
      return $$0 != -1 ? (eza)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final ezt b;
      private final List<ezs> c = new ArrayList<>();

      a(ezt $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public ezu.a a(ezs... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public ezu a() {
         return new ezu(this.a, this.b, this.c);
      }
   }
}
