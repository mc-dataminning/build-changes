import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ams extends fcx {
   private final MinecraftServer b;
   private final Set<fcp> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public ams(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(fcw $$0, fcp $$1, fcu $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ag().a(new agm($$0.cI(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(fcw $$0, fcp $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(fcw $$0) {
      super.a($$0);
      this.b.ag().a(new afj($$0.cI(), null));
      this.a();
   }

   @Override
   public void b(fcw $$0, fcp $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ag().a(new afj($$0.cI(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(fco $$0, @Nullable fcp $$1) {
      fcp $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ag().a(new aga($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ag().a(new aga($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, fcs $$1) {
      if (super.a($$0, $$1)) {
         this.b.ag().a(agl.a($$1, $$0, agl.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, fcs $$1) {
      super.b($$0, $$1);
      this.b.ag().a(agl.a($$1, $$0, agl.a.b));
      this.a();
   }

   @Override
   public void a(fcp $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(fcp $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ag().a(new agi($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(fcp $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(fcs $$0) {
      super.a($$0);
      this.b.ag().a(agl.a($$0, true));
      this.a();
   }

   @Override
   public void b(fcs $$0) {
      super.b($$0);
      this.b.ag().a(agl.a($$0, false));
      this.a();
   }

   @Override
   public void c(fcs $$0) {
      super.c($$0);
      this.b.ag().a(agl.a($$0));
      this.a();
   }

   public void a(Runnable $$0) {
      this.d.add($$0);
   }

   protected void a() {
      for (Runnable $$0 : this.d) {
         $$0.run();
      }
   }

   public List<aac<?>> d(fcp $$0) {
      List<aac<?>> $$1 = Lists.newArrayList();
      $$1.add(new agi($$0, 0));

      for (fco $$2 : fco.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aga($$2, $$0));
         }
      }

      for (fcq $$3 : this.i($$0)) {
         $$1.add(new agm($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(fcp $$0) {
      List<aac<?>> $$1 = this.d($$0);

      for (asi $$2 : this.b.ag().t()) {
         for (aac<?> $$3 : $$1) {
            $$2.f.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<aac<?>> f(fcp $$0) {
      List<aac<?>> $$1 = Lists.newArrayList();
      $$1.add(new agi($$0, 1));

      for (fco $$2 : fco.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aga($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(fcp $$0) {
      List<aac<?>> $$1 = this.f($$0);

      for (asi $$2 : this.b.ag().t()) {
         for (aac<?> $$3 : $$1) {
            $$2.f.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(fcp $$0) {
      int $$1 = 0;

      for (fco $$2 : fco.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public evb.a<fcy> b() {
      return new evb.a<>(this::h, this::a, bbo.n);
   }

   private fcy h() {
      fcy $$0 = new fcy(this);
      this.a($$0::c);
      return $$0;
   }

   private fcy a(ux $$0, js.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
