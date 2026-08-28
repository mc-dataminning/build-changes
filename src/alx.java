import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class alx extends fab {
   private final MinecraftServer b;
   private final Set<ezt> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public alx(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(faa $$0, ezt $$1, ezy $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ag().a(new afr($$0.cF(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(faa $$0, ezt $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(faa $$0) {
      super.a($$0);
      this.b.ag().a(new aeo($$0.cF(), null));
      this.a();
   }

   @Override
   public void b(faa $$0, ezt $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ag().a(new aeo($$0.cF(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(ezs $$0, @Nullable ezt $$1) {
      ezt $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ag().a(new aff($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ag().a(new aff($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, ezw $$1) {
      if (super.a($$0, $$1)) {
         this.b.ag().a(afq.a($$1, $$0, afq.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, ezw $$1) {
      super.b($$0, $$1);
      this.b.ag().a(afq.a($$1, $$0, afq.a.b));
      this.a();
   }

   @Override
   public void a(ezt $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(ezt $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ag().a(new afn($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(ezt $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(ezw $$0) {
      super.a($$0);
      this.b.ag().a(afq.a($$0, true));
      this.a();
   }

   @Override
   public void b(ezw $$0) {
      super.b($$0);
      this.b.ag().a(afq.a($$0, false));
      this.a();
   }

   @Override
   public void c(ezw $$0) {
      super.c($$0);
      this.b.ag().a(afq.a($$0));
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

   public List<zl<?>> d(ezt $$0) {
      List<zl<?>> $$1 = Lists.newArrayList();
      $$1.add(new afn($$0, 0));

      for (ezs $$2 : ezs.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aff($$2, $$0));
         }
      }

      for (ezu $$3 : this.i($$0)) {
         $$1.add(new afr($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(ezt $$0) {
      List<zl<?>> $$1 = this.d($$0);

      for (ark $$2 : this.b.ag().t()) {
         for (zl<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<zl<?>> f(ezt $$0) {
      List<zl<?>> $$1 = Lists.newArrayList();
      $$1.add(new afn($$0, 1));

      for (ezs $$2 : ezs.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aff($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(ezt $$0) {
      List<zl<?>> $$1 = this.f($$0);

      for (ark $$2 : this.b.ag().t()) {
         for (zl<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(ezt $$0) {
      int $$1 = 0;

      for (ezs $$2 : ezs.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public esf.a<fac> b() {
      return new esf.a<>(this::h, this::a, bao.n);
   }

   private fac h() {
      fac $$0 = new fac(this);
      this.a($$0::c);
      return $$0;
   }

   private fac a(ug $$0, jq.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
