import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

public class erb extends eqr implements eqh, eqt, esn {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final sw e = sw.c("narration.tab_navigation.usage");
   private final esf f;
   private int g;
   private final era h;
   private final ImmutableList<eqz> i;
   private final ImmutableList<eqm> j;

   erb(int $$0, era $$1, Iterable<eqz> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f = new esf(0, 0);
      this.f.b().b();
      Builder<eqm> $$3 = ImmutableList.builder();
      int $$4 = 0;

      for (eqz $$5 : $$2) {
         $$3.add(this.f.a(new eqm($$1, $$5, 0, 24), 0, $$4++));
      }

      this.j = $$3.build();
   }

   public static erb.a a(era $$0, int $$1) {
      return new erb.a($$0, $$1);
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
   public void a(@Nullable eqt $$0) {
      super.a($$0);
      if ($$0 instanceof eqm $$1) {
         this.h.a($$1.b(), true);
      }
   }

   @Nullable
   @Override
   public eou a(esv $$0) {
      if (!this.aB_()) {
         eqm $$1 = this.e();
         if ($$1 != null) {
            return eou.a(this, eou.a($$1));
         }
      }

      return $$0 instanceof esv.c ? null : super.a($$0);
   }

   @Override
   public List<? extends eqt> i() {
      return this.j;
   }

   @Override
   public esn.a q() {
      return this.j.stream().map(epf::q).max(Comparator.naturalOrder()).orElse(esn.a.a);
   }

   @Override
   public void b(esp $$0) {
      Optional<eqm> $$1 = this.j.stream().filter(epf::m).findFirst().or(() -> Optional.ofNullable(this.e()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aB_()) {
         $$0.a(eso.d, e);
      }
   }

   protected void a(esp $$0, eqm $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(eso.b, sw.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      $$0.a(0, 0, this.g, 24, -16777216);
      $$0.a(eza.a, 0, this.f.r() + this.f.h() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var5 = this.j.iterator();

      while (var5.hasNext()) {
         eqm $$4 = (eqm)var5.next();
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public esz s() {
      return this.f.s();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = apa.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         eqm $$2 = (eqm)var3.next();
         $$2.d($$1);
      }

      this.f.c();
      this.f.e(apa.d((this.g - $$0) / 2, 2));
      this.f.f(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aB_()) {
         this.a((eqt)this.j.get($$0));
      } else {
         this.h.a((eqz)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (euq.p()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(apa.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = euq.q() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int d() {
      eqz $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private eqm e() {
      int $$0 = this.d();
      return $$0 != -1 ? (eqm)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final era b;
      private final List<eqz> c = new ArrayList<>();

      a(era $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public erb.a a(eqz... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public erb a() {
         return new erb(this.a, this.b, this.c);
      }
   }
}
