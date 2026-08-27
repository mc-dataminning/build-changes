import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ahd extends eky {
   private final MinecraftServer a;
   private final Set<ekv> b = Sets.newHashSet();
   private final List<Runnable> c = Lists.newArrayList();

   public ahd(MinecraftServer $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ekx $$0) {
      super.a($$0);
      if (this.b.contains($$0.d())) {
         this.a.ae().a(new abr(ahd.a.a, $$0.d().b(), $$0.e(), $$0.b()));
      }

      this.a();
   }

   @Override
   public void a(String $$0) {
      super.a($$0);
      this.a.ae().a(new abr(ahd.a.b, null, $$0, 0));
      this.a();
   }

   @Override
   public void a(String $$0, ekv $$1) {
      super.a($$0, $$1);
      if (this.b.contains($$1)) {
         this.a.ae().a(new abr(ahd.a.b, $$1.b(), $$0, 0));
      }

      this.a();
   }

   @Override
   public void a(eku $$0, @Nullable ekv $$1) {
      ekv $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.a.ae().a(new abh($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.b.contains($$1)) {
            this.a.ae().a(new abh($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, ekw $$1) {
      if (super.a($$0, $$1)) {
         this.a.ae().a(abq.a($$1, $$0, abq.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, ekw $$1) {
      super.b($$0, $$1);
      this.a.ae().a(abq.a($$1, $$0, abq.a.b));
      this.a();
   }

   @Override
   public void a(ekv $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(ekv $$0) {
      super.b($$0);
      if (this.b.contains($$0)) {
         this.a.ae().a(new abo($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(ekv $$0) {
      super.c($$0);
      if (this.b.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(ekw $$0) {
      super.a($$0);
      this.a.ae().a(abq.a($$0, true));
      this.a();
   }

   @Override
   public void b(ekw $$0) {
      super.b($$0);
      this.a.ae().a(abq.a($$0, false));
      this.a();
   }

   @Override
   public void c(ekw $$0) {
      super.c($$0);
      this.a.ae().a(abq.a($$0));
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

   public List<wo<?>> d(ekv $$0) {
      List<wo<?>> $$1 = Lists.newArrayList();
      $$1.add(new abo($$0, 0));

      for (eku $$2 : eku.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new abh($$2, $$0));
         }
      }

      for (ekx $$3 : this.i($$0)) {
         $$1.add(new abr(ahd.a.a, $$3.d().b(), $$3.e(), $$3.b()));
      }

      return $$1;
   }

   public void e(ekv $$0) {
      List<wo<?>> $$1 = this.d($$0);

      for (amj $$2 : this.a.ae().t()) {
         for (wo<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.b.add($$0);
   }

   public List<wo<?>> f(ekv $$0) {
      List<wo<?>> $$1 = Lists.newArrayList();
      $$1.add(new abo($$0, 1));

      for (eku $$2 : eku.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new abh($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(ekv $$0) {
      List<wo<?>> $$1 = this.f($$0);

      for (amj $$2 : this.a.ae().t()) {
         for (wo<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.b.remove($$0);
   }

   public int h(ekv $$0) {
      int $$1 = 0;

      for (eku $$2 : eku.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public eec.a<ekz> b() {
      return new eec.a<>(this::i, this::a, auw.n);
   }

   private ekz i() {
      ekz $$0 = new ekz(this);
      this.a($$0::c);
      return $$0;
   }

   private ekz a(sd $$0) {
      return this.i().b($$0);
   }

   public static enum a {
      a,
      b;
   }
}
