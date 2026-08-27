import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class exh extends ewx implements ewh, ewz, eyv {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final uv e = uv.c("narration.tab_navigation.usage");
   private final eyn f;
   private int g;
   private final exg h;
   private final ImmutableList<exf> i;
   private final ImmutableList<ewn> j;

   exh(int $$0, exg $$1, Iterable<exf> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f = new eyn(0, 0);
      this.f.c().b();
      Builder<ewn> $$3 = ImmutableList.builder();
      int $$4 = 0;

      for (exf $$5 : $$2) {
         $$3.add(this.f.a(new ewn($$1, $$5, 0, 24), 0, $$4++));
      }

      this.j = $$3.build();
   }

   public static exh.a a(exg $$0, int $$1) {
      return new exh.a($$0, $$1);
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
   public void a(@Nullable ewz $$0) {
      super.a($$0);
      if ($$0 instanceof ewn $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public euq a(ezd $$0) {
      if (!this.aK_()) {
         ewn $$1 = this.e();
         if ($$1 != null) {
            return euq.a(this, euq.a($$1));
         }
      }

      return $$0 instanceof ezd.c ? null : super.a($$0);
   }

   @Override
   public List<? extends ewz> i() {
      return this.j;
   }

   @Override
   public eyv.a q() {
      return this.j.stream().map(evc::q).max(Comparator.naturalOrder()).orElse(eyv.a.a);
   }

   @Override
   public void b(eyx $$0) {
      Optional<ewn> $$1 = this.j.stream().filter(evc::m).findFirst().or(() -> Optional.ofNullable(this.e()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aK_()) {
         $$0.a(eyw.d, e);
      }
   }

   protected void a(eyx $$0, ewn $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(eyw.b, uv.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      $$0.a(0, 0, this.g, 24, -16777216);
      $$0.a(ffp.a, 0, this.f.r() + this.f.i() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var5 = this.j.iterator();

      while (var5.hasNext()) {
         ewn $$4 = (ewn)var5.next();
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public ezh s() {
      return this.f.s();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = atq.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         ewn $$2 = (ewn)var3.next();
         $$2.d($$1);
      }

      this.f.a();
      this.f.f(atq.d((this.g - $$0) / 2, 2));
      this.f.g(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aK_()) {
         this.a((ewz)this.j.get($$0));
      } else {
         this.h.a((exf)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (faz.p()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(atq.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = faz.q() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int c() {
      exf $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private ewn e() {
      int $$0 = this.c();
      return $$0 != -1 ? (ewn)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final exg b;
      private final List<exf> c = new ArrayList<>();

      a(exg $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public exh.a a(exf... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public exh a() {
         return new exh(this.a, this.b, this.c);
      }
   }
}
