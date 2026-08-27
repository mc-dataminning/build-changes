import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class evm extends evc implements eum, eve, exa {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final ui e = ui.c("narration.tab_navigation.usage");
   private final ews f;
   private int g;
   private final evl h;
   private final ImmutableList<evk> i;
   private final ImmutableList<eus> j;

   evm(int $$0, evl $$1, Iterable<evk> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f = new ews(0, 0);
      this.f.c().b();
      Builder<eus> $$3 = ImmutableList.builder();
      int $$4 = 0;

      for (evk $$5 : $$2) {
         $$3.add(this.f.a(new eus($$1, $$5, 0, 24), 0, $$4++));
      }

      this.j = $$3.build();
   }

   public static evm.a a(evl $$0, int $$1) {
      return new evm.a($$0, $$1);
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
   public void a(@Nullable eve $$0) {
      super.a($$0);
      if ($$0 instanceof eus $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public esv a(exi $$0) {
      if (!this.aG_()) {
         eus $$1 = this.e();
         if ($$1 != null) {
            return esv.a(this, esv.a($$1));
         }
      }

      return $$0 instanceof exi.c ? null : super.a($$0);
   }

   @Override
   public List<? extends eve> i() {
      return this.j;
   }

   @Override
   public exa.a q() {
      return this.j.stream().map(eth::q).max(Comparator.naturalOrder()).orElse(exa.a.a);
   }

   @Override
   public void b(exc $$0) {
      Optional<eus> $$1 = this.j.stream().filter(eth::m).findFirst().or(() -> Optional.ofNullable(this.e()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aG_()) {
         $$0.a(exb.d, e);
      }
   }

   protected void a(exc $$0, eus $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(exb.b, ui.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      $$0.a(0, 0, this.g, 24, -16777216);
      $$0.a(fds.a, 0, this.f.r() + this.f.i() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var5 = this.j.iterator();

      while (var5.hasNext()) {
         eus $$4 = (eus)var5.next();
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public exm s() {
      return this.f.s();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = asy.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         eus $$2 = (eus)var3.next();
         $$2.d($$1);
      }

      this.f.a();
      this.f.f(asy.d((this.g - $$0) / 2, 2));
      this.f.g(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aG_()) {
         this.a((eve)this.j.get($$0));
      } else {
         this.h.a((evk)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (ezd.p()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(asy.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = ezd.q() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      evk $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private eus e() {
      int $$0 = this.c();
      return $$0 != -1 ? (eus)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final evl b;
      private final List<evk> c = new ArrayList<>();

      a(evl $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public evm.a a(evk... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public evm a() {
         return new evm(this.a, this.b, this.c);
      }
   }
}
