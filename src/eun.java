import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class eun extends eud implements etn, euf, ewb {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final tl e = tl.c("narration.tab_navigation.usage");
   private final evt f;
   private int g;
   private final eum h;
   private final ImmutableList<eul> i;
   private final ImmutableList<ett> j;

   eun(int $$0, eum $$1, Iterable<eul> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f = new evt(0, 0);
      this.f.c().b();
      Builder<ett> $$3 = ImmutableList.builder();
      int $$4 = 0;

      for (eul $$5 : $$2) {
         $$3.add(this.f.a(new ett($$1, $$5, 0, 24), 0, $$4++));
      }

      this.j = $$3.build();
   }

   public static eun.a a(eum $$0, int $$1) {
      return new eun.a($$0, $$1);
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
   public void a(@Nullable euf $$0) {
      super.a($$0);
      if ($$0 instanceof ett $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public erw a(ewj $$0) {
      if (!this.aC_()) {
         ett $$1 = this.e();
         if ($$1 != null) {
            return erw.a(this, erw.a($$1));
         }
      }

      return $$0 instanceof ewj.c ? null : super.a($$0);
   }

   @Override
   public List<? extends euf> i() {
      return this.j;
   }

   @Override
   public ewb.a q() {
      return this.j.stream().map(esi::q).max(Comparator.naturalOrder()).orElse(ewb.a.a);
   }

   @Override
   public void b(ewd $$0) {
      Optional<ett> $$1 = this.j.stream().filter(esi::n).findFirst().or(() -> Optional.ofNullable(this.e()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aC_()) {
         $$0.a(ewc.d, e);
      }
   }

   protected void a(ewd $$0, ett $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(ewc.b, tl.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      $$0.a(0, 0, this.g, 24, -16777216);
      $$0.a(fct.a, 0, this.f.t() + this.f.i() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var5 = this.j.iterator();

      while (var5.hasNext()) {
         ett $$4 = (ett)var5.next();
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public ewn s() {
      return this.f.s();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = asb.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         ett $$2 = (ett)var3.next();
         $$2.d($$1);
      }

      this.f.a();
      this.f.f(asb.d((this.g - $$0) / 2, 2));
      this.f.g(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aC_()) {
         this.a((euf)this.j.get($$0));
      } else {
         this.h.a((eul)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (eye.p()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(asb.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = eye.q() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int d() {
      eul $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private ett e() {
      int $$0 = this.d();
      return $$0 != -1 ? (ett)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final eum b;
      private final List<eul> c = new ArrayList<>();

      a(eum $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public eun.a a(eul... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public eun a() {
         return new eun(this.a, this.b, this.c);
      }
   }
}
