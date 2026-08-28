import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class alw extends ewt {
   private final MinecraftServer b;
   private final Set<ewl> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public alw(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(ews $$0, ewl $$1, ewq $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ah().a(new afv($$0.cB(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(ews $$0, ewl $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(ews $$0) {
      super.a($$0);
      this.b.ah().a(new aeu($$0.cB(), null));
      this.a();
   }

   @Override
   public void b(ews $$0, ewl $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ah().a(new aeu($$0.cB(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(ewk $$0, @Nullable ewl $$1) {
      ewl $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ah().a(new afl($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ah().a(new afl($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, ewo $$1) {
      if (super.a($$0, $$1)) {
         this.b.ah().a(afu.a($$1, $$0, afu.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, ewo $$1) {
      super.b($$0, $$1);
      this.b.ah().a(afu.a($$1, $$0, afu.a.b));
      this.a();
   }

   @Override
   public void a(ewl $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(ewl $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ah().a(new afs($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(ewl $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(ewo $$0) {
      super.a($$0);
      this.b.ah().a(afu.a($$0, true));
      this.a();
   }

   @Override
   public void b(ewo $$0) {
      super.b($$0);
      this.b.ah().a(afu.a($$0, false));
      this.a();
   }

   @Override
   public void c(ewo $$0) {
      super.c($$0);
      this.b.ah().a(afu.a($$0));
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

   public List<zv<?>> d(ewl $$0) {
      List<zv<?>> $$1 = Lists.newArrayList();
      $$1.add(new afs($$0, 0));

      for (ewk $$2 : ewk.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afl($$2, $$0));
         }
      }

      for (ewm $$3 : this.i($$0)) {
         $$1.add(new afv($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(ewl $$0) {
      List<zv<?>> $$1 = this.d($$0);

      for (arf $$2 : this.b.ah().t()) {
         for (zv<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<zv<?>> f(ewl $$0) {
      List<zv<?>> $$1 = Lists.newArrayList();
      $$1.add(new afs($$0, 1));

      for (ewk $$2 : ewk.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new afl($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(ewl $$0) {
      List<zv<?>> $$1 = this.f($$0);

      for (arf $$2 : this.b.ah().t()) {
         for (zv<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(ewl $$0) {
      int $$1 = 0;

      for (ewk $$2 : ewk.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public epa.a<ewu> b() {
      return new epa.a<>(this::h, this::a, bae.n);
   }

   private ewu h() {
      ewu $$0 = new ewu(this);
      this.a($$0::c);
      return $$0;
   }

   private ewu a(ur $$0, jk.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
