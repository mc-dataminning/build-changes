import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class amk extends fhh {
   public static final ezn<fhi> a = new ezn<>("scoreboard", $$0 -> $$0.a().g().h(), $$0 -> {
      amk $$1 = $$0.a().g();
      return fhi.a.a.xmap($$1::a, fhi::a);
   }, bbo.n);
   private final MinecraftServer c;
   private final Set<fgz> d = Sets.newHashSet();
   private final List<Runnable> e = Lists.newArrayList();

   public amk(MinecraftServer $$0) {
      this.c = $$0;
   }

   @Override
   protected void a(fhg $$0, fgz $$1, fhe $$2) {
      super.a($$0, $$1, $$2);
      if (this.d.contains($$1)) {
         this.c.ag().a(new afz($$0.cI(), $$1.c(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(fhg $$0, fgz $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(fhg $$0) {
      super.a($$0);
      this.c.ag().a(new aew($$0.cI(), null));
      this.a();
   }

   @Override
   public void b(fhg $$0, fgz $$1) {
      super.b($$0, $$1);
      if (this.d.contains($$1)) {
         this.c.ag().a(new aew($$0.cI(), $$1.c()));
      }

      this.a();
   }

   @Override
   public void a(fgy $$0, @Nullable fgz $$1) {
      fgz $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.c.ag().a(new afn($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.d.contains($$1)) {
            this.c.ag().a(new afn($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, fhc $$1) {
      if (super.a($$0, $$1)) {
         this.c.ag().a(afy.a($$1, $$0, afy.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, fhc $$1) {
      super.b($$0, $$1);
      this.c.ag().a(afy.a($$1, $$0, afy.a.b));
      this.a();
   }

   @Override
   public void a(fgz $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(fgz $$0) {
      super.b($$0);
      if (this.d.contains($$0)) {
         this.c.ag().a(new afv($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(fgz $$0) {
      super.c($$0);
      if (this.d.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(fhc $$0) {
      super.a($$0);
      this.c.ag().a(afy.a($$0, true));
      this.a();
   }

   @Override
   public void b(fhc $$0) {
      super.b($$0);
      this.c.ag().a(afy.a($$0, false));
      this.a();
   }

   @Override
   public void c(fhc $$0) {
      super.c($$0);
      this.c.ag().a(afy.a($$0));
      this.a();
   }

   public void a(Runnable $$0) {
      this.e.add($$0);
   }

   protected void a() {
      for (Runnable $$0 : this.e) {
         $$0.run();
      }
   }

   public List<zo<?>> d(fgz $$0) {
      List<zo<?>> $$1 = Lists.newArrayList();
      $$1.add(new afv($$0, 0));

      for (fgy $$2 : fgy.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afn($$2, $$0));
         }
      }

      for (fha $$3 : this.i($$0)) {
         $$1.add(new afz($$3.c(), $$0.c(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(fgz $$0) {
      List<zo<?>> $$1 = this.d($$0);

      for (asc $$2 : this.c.ag().t()) {
         for (zo<?> $$3 : $$1) {
            $$2.f.b($$3);
         }
      }

      this.d.add($$0);
   }

   public List<zo<?>> f(fgz $$0) {
      List<zo<?>> $$1 = Lists.newArrayList();
      $$1.add(new afv($$0, 1));

      for (fgy $$2 : fgy.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afn($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(fgz $$0) {
      List<zo<?>> $$1 = this.f($$0);

      for (asc $$2 : this.c.ag().t()) {
         for (zo<?> $$3 : $$1) {
            $$2.f.b($$3);
         }
      }

      this.d.remove($$0);
   }

   public int h(fgz $$0) {
      int $$1 = 0;

      for (fgy $$2 : fgy.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   private fhi h() {
      fhi $$0 = new fhi(this);
      this.a($$0::f);
      return $$0;
   }

   private fhi a(fhi.a $$0) {
      fhi $$1 = this.h();
      $$1.a($$0);
      return $$1;
   }

   public static enum a {
      a,
      b;
   }
}
