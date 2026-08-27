import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class eui extends ety implements eti, eua, evv {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final tf e = tf.c("narration.tab_navigation.usage");
   private final evn f;
   private int g;
   private final euh h;
   private final ImmutableList<eug> i;
   private final ImmutableList<eto> j;

   eui(int $$0, euh $$1, Iterable<eug> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f = new evn(0, 0);
      this.f.c().b();
      Builder<eto> $$3 = ImmutableList.builder();
      int $$4 = 0;

      for (eug $$5 : $$2) {
         $$3.add(this.f.a(new eto($$1, $$5, 0, 24), 0, $$4++));
      }

      this.j = $$3.build();
   }

   public static eui.a a(euh $$0, int $$1) {
      return new eui.a($$0, $$1);
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   @Override
   public void c_(boolean $$0) {
      super.c_($$0);
      if (this.t() != null) {
         this.t().c_($$0);
      }
   }

   @Override
   public void a(@Nullable eua $$0) {
      super.a($$0);
      if ($$0 instanceof eto $$1) {
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public ert a(ewd $$0) {
      if (!this.ax_()) {
         eto $$1 = this.e();
         if ($$1 != null) {
            return ert.a(this, ert.a($$1));
         }
      }

      return $$0 instanceof ewd.c ? null : super.a($$0);
   }

   @Override
   public List<? extends eua> i() {
      return this.j;
   }

   @Override
   public evv.a q() {
      return this.j.stream().map(esf::q).max(Comparator.naturalOrder()).orElse(evv.a.a);
   }

   @Override
   public void b(evx $$0) {
      Optional<eto> $$1 = this.j.stream().filter(esf::m).findFirst().or(() -> Optional.ofNullable(this.e()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.ax_()) {
         $$0.a(evw.d, e);
      }
   }

   protected void a(evx $$0, eto $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(evw.b, tf.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      $$0.a(0, 0, this.g, 24, -16777216);
      $$0.a(fcj.a, 0, this.f.r() + this.f.h() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var5 = this.j.iterator();

      while (var5.hasNext()) {
         eto $$4 = (eto)var5.next();
         $$4.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public ewh s() {
      return this.f.s();
   }

   public void b() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = arp.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         eto $$2 = (eto)var3.next();
         $$2.d($$1);
      }

      this.f.a();
      this.f.e(arp.d((this.g - $$0) / 2, 2));
      this.f.f(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.ax_()) {
         this.a((eua)this.j.get($$0));
      } else {
         this.h.a((eug)this.i.get($$0), $$1);
      }
   }

   public boolean b(int $$0) {
      if (exz.p()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(arp.a($$1, 0, this.i.size() - 1), true);
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
               int $$2 = exz.q() ? $$1 - 1 : $$1 + 1;
               return Math.floorMod($$2, this.i.size());
            }
         }

         return -1;
      }
   }

   private int d() {
      eug $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private eto e() {
      int $$0 = this.d();
      return $$0 != -1 ? (eto)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final euh b;
      private final List<eug> c = new ArrayList<>();

      a(euh $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public eui.a a(eug... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public eui a() {
         return new eui(this.a, this.b, this.c);
      }
   }
}
