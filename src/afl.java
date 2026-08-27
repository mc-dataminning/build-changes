import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class afl extends eih {
   private final MinecraftServer a;
   private final Set<eie> b = Sets.newHashSet();
   private final List<Runnable> c = Lists.newArrayList();

   public afl(MinecraftServer $$0) {
      this.a = $$0;
   }

   @Override
   public void a(eig $$0) {
      super.a($$0);
      if (this.b.contains($$0.d())) {
         this.a.ac().a(new aad(afl.a.a, $$0.d().b(), $$0.e(), $$0.b()));
      }

      this.a();
   }

   @Override
   public void a(String $$0) {
      super.a($$0);
      this.a.ac().a(new aad(afl.a.b, null, $$0, 0));
      this.a();
   }

   @Override
   public void a(String $$0, eie $$1) {
      super.a($$0, $$1);
      if (this.b.contains($$1)) {
         this.a.ac().a(new aad(afl.a.b, $$1.b(), $$0, 0));
      }

      this.a();
   }

   @Override
   public void a(eid $$0, @Nullable eie $$1) {
      eie $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.a.ac().a(new zt($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.b.contains($$1)) {
            this.a.ac().a(new zt($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, eif $$1) {
      if (super.a($$0, $$1)) {
         this.a.ac().a(aac.a($$1, $$0, aac.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, eif $$1) {
      super.b($$0, $$1);
      this.a.ac().a(aac.a($$1, $$0, aac.a.b));
      this.a();
   }

   @Override
   public void a(eie $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(eie $$0) {
      super.b($$0);
      if (this.b.contains($$0)) {
         this.a.ac().a(new aaa($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(eie $$0) {
      super.c($$0);
      if (this.b.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(eif $$0) {
      super.a($$0);
      this.a.ac().a(aac.a($$0, true));
      this.a();
   }

   @Override
   public void b(eif $$0) {
      super.b($$0);
      this.a.ac().a(aac.a($$0, false));
      this.a();
   }

   @Override
   public void c(eif $$0) {
      super.c($$0);
      this.a.ac().a(aac.a($$0));
      this.a();
   }

   public void a(Runnable $$0) {
      this.c.add($$0);
   }

   protected void a() {
      for (Runnable $$0 : this.c) {
         $$0.run();
      }
   }

   public List<va<?>> d(eie $$0) {
      List<va<?>> $$1 = Lists.newArrayList();
      $$1.add(new aaa($$0, 0));

      for (eid $$2 : eid.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new zt($$2, $$0));
         }
      }

      for (eig $$3 : this.i($$0)) {
         $$1.add(new aad(afl.a.a, $$3.d().b(), $$3.e(), $$3.b()));
      }

      return $$1;
   }

   public void e(eie $$0) {
      List<va<?>> $$1 = this.d($$0);

      for (ako $$2 : this.a.ac().t()) {
         for (va<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.b.add($$0);
   }

   public List<va<?>> f(eie $$0) {
      List<va<?>> $$1 = Lists.newArrayList();
      $$1.add(new aaa($$0, 1));

      for (eid $$2 : eid.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new zt($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(eie $$0) {
      List<va<?>> $$1 = this.f($$0);

      for (ako $$2 : this.a.ac().t()) {
         for (va<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.b.remove($$0);
   }

   public int h(eie $$0) {
      int $$1 = 0;

      for (eid $$2 : eid.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public ebm.a<eii> b() {
      return new ebm.a<>(this::i, this::a, asv.n);
   }

   private eii i() {
      eii $$0 = new eii(this);
      this.a($$0::c);
      return $$0;
   }

   private eii a(qu $$0) {
      return this.i().b($$0);
   }

   public static enum a {
      a,
      b;
   }
}
