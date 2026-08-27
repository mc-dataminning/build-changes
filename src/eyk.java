import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class eyk extends eya implements exk, eyc, ezy {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final vb e = vb.c("narration.tab_navigation.usage");
   private final ezq f;
   private int g;
   private final eyj h;
   private final ImmutableList<eyi> i;
   private final ImmutableList<exq> j;

   eyk(int $$0, eyj $$1, Iterable<eyi> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f = new ezq(0, 0);
      this.f.c().b();
      Builder<exq> $$3 = ImmutableList.builder();
      int $$4 = 0;

      for (eyi $$5 : $$2) {
         $$3.add(this.f.a(new exq($$1, $$5, 0, 24), 0, $$4++));
      }

      this.j = $$3.build();
   }

   public static eyk.a a(eyj $$0, int $$1) {
      return new eyk.a($$0, $$1);
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if (this.t() != null) {
         this.t().a($$0);
      }
   }

   @Override
   public void a(@Nullable eyc $$0) {
      super.a($$0);
      if ($$0 instanceof exq $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public evt a(fag $$0) {
      if (!this.aJ_()) {
         exq $$1 = this.e();
         if ($$1 != null) {
            return evt.a(this, evt.a($$1));
         }
      }

      return $$0 instanceof fag.c ? null : super.a($$0);
   }

   @Override
   public List<? extends eyc> i() {
      return this.j;
   }

   @Override
   public ezy.a q() {
      return this.j.stream().map(ewf::q).max(Comparator.naturalOrder()).orElse(ezy.a.a);
   }

   @Override
   public void b(faa $$0) {
      Optional<exq> $$1 = this.j.stream().filter(ewf::m).findFirst().or(() -> Optional.ofNullable(this.e()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aJ_()) {
         $$0.a(ezz.d, e);
      }
   }

   protected void a(faa $$0, exq $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(ezz.b, vb.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      $$0.a(0, 0, this.g, 24, -16777216);
      $$0.a(fgs.a, 0, this.f.r() + this.f.i() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var5 = this.j.iterator();

      while (var5.hasNext()) {
         exq $$4 = (exq)var5.next();
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public fak s() {
      return this.f.s();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = aty.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         exq $$2 = (exq)var3.next();
         $$2.d($$1);
      }

      this.f.a();
      this.f.f(aty.d((this.g - $$0) / 2, 2));
      this.f.g(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aJ_()) {
         this.a((eyc)this.j.get($$0));
      } else {
         this.h.a((eyi)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (fcc.p()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(aty.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = fcc.q() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      eyi $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private exq e() {
      int $$0 = this.c();
      return $$0 != -1 ? (exq)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final eyj b;
      private final List<eyi> c = new ArrayList<>();

      a(eyj $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public eyk.a a(eyi... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public eyk a() {
         return new eyk(this.a, this.b, this.c);
      }
   }
}
