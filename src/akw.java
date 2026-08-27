import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class akw extends euj {
   private final MinecraftServer b;
   private final Set<eub> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public akw(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(eui $$0, eub $$1, eug $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ah().a(new aex($$0.cz(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(eui $$0, eub $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(eui $$0) {
      super.a($$0);
      this.b.ah().a(new adw($$0.cz(), null));
      this.a();
   }

   @Override
   public void b(eui $$0, eub $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ah().a(new adw($$0.cz(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(eua $$0, @Nullable eub $$1) {
      eub $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ah().a(new aen($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ah().a(new aen($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, eue $$1) {
      if (super.a($$0, $$1)) {
         this.b.ah().a(aew.a($$1, $$0, aew.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, eue $$1) {
      super.b($$0, $$1);
      this.b.ah().a(aew.a($$1, $$0, aew.a.b));
      this.a();
   }

   @Override
   public void a(eub $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(eub $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ah().a(new aeu($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(eub $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(eue $$0) {
      super.a($$0);
      this.b.ah().a(aew.a($$0, true));
      this.a();
   }

   @Override
   public void b(eue $$0) {
      super.b($$0);
      this.b.ah().a(aew.a($$0, false));
      this.a();
   }

   @Override
   public void c(eue $$0) {
      super.c($$0);
      this.b.ah().a(aew.a($$0));
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

   public List<yz<?>> d(eub $$0) {
      List<yz<?>> $$1 = Lists.newArrayList();
      $$1.add(new aeu($$0, 0));

      for (eua $$2 : eua.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aen($$2, $$0));
         }
      }

      for (euc $$3 : this.i($$0)) {
         $$1.add(new aex($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(eub $$0) {
      List<yz<?>> $$1 = this.d($$0);

      for (aqf $$2 : this.b.ah().t()) {
         for (yz<?> $$3 : $$1) {
            $$2.d.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<yz<?>> f(eub $$0) {
      List<yz<?>> $$1 = Lists.newArrayList();
      $$1.add(new aeu($$0, 1));

      for (eua $$2 : eua.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aen($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(eub $$0) {
      List<yz<?>> $$1 = this.f($$0);

      for (aqf $$2 : this.b.ah().t()) {
         for (yz<?> $$3 : $$1) {
            $$2.d.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(eub $$0) {
      int $$1 = 0;

      for (eua $$2 : eua.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public emy.a<euk> b() {
      return new emy.a<>(this::h, this::a, azc.n);
   }

   private euk h() {
      euk $$0 = new euk(this);
      this.a($$0::c);
      return $$0;
   }

   private euk a(ty $$0, ix.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
