import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ams extends fdd {
   private final MinecraftServer b;
   private final Set<fcv> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public ams(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(fdc $$0, fcv $$1, fda $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ag().a(new agm($$0.cI(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(fdc $$0, fcv $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(fdc $$0) {
      super.a($$0);
      this.b.ag().a(new afj($$0.cI(), null));
      this.a();
   }

   @Override
   public void b(fdc $$0, fcv $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ag().a(new afj($$0.cI(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(fcu $$0, @Nullable fcv $$1) {
      fcv $$2 = this.a($$0);
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
   public boolean a(String $$0, fcy $$1) {
      if (super.a($$0, $$1)) {
         this.b.ag().a(agl.a($$1, $$0, agl.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, fcy $$1) {
      super.b($$0, $$1);
      this.b.ag().a(agl.a($$1, $$0, agl.a.b));
      this.a();
   }

   @Override
   public void a(fcv $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(fcv $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ag().a(new agi($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(fcv $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(fcy $$0) {
      super.a($$0);
      this.b.ag().a(agl.a($$0, true));
      this.a();
   }

   @Override
   public void b(fcy $$0) {
      super.b($$0);
      this.b.ag().a(agl.a($$0, false));
      this.a();
   }

   @Override
   public void c(fcy $$0) {
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

   public List<aac<?>> d(fcv $$0) {
      List<aac<?>> $$1 = Lists.newArrayList();
      $$1.add(new agi($$0, 0));

      for (fcu $$2 : fcu.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aga($$2, $$0));
         }
      }

      for (fcw $$3 : this.i($$0)) {
         $$1.add(new agm($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(fcv $$0) {
      List<aac<?>> $$1 = this.d($$0);

      for (asi $$2 : this.b.ag().t()) {
         for (aac<?> $$3 : $$1) {
            $$2.f.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<aac<?>> f(fcv $$0) {
      List<aac<?>> $$1 = Lists.newArrayList();
      $$1.add(new agi($$0, 1));

      for (fcu $$2 : fcu.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aga($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(fcv $$0) {
      List<aac<?>> $$1 = this.f($$0);

      for (asi $$2 : this.b.ag().t()) {
         for (aac<?> $$3 : $$1) {
            $$2.f.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(fcv $$0) {
      int $$1 = 0;

      for (fcu $$2 : fcu.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public evj.a<fde> b() {
      return new evj.a<>(this::h, this::a, bbs.n);
   }

   private fde h() {
      fde $$0 = new fde(this);
      this.a($$0::c);
      return $$0;
   }

   private fde a(ux $$0, js.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
