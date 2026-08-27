import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class akz extends eut {
   private final MinecraftServer b;
   private final Set<eul> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public akz(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(eus $$0, eul $$1, euq $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ah().a(new aez($$0.cz(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(eus $$0, eul $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(eus $$0) {
      super.a($$0);
      this.b.ah().a(new ady($$0.cz(), null));
      this.a();
   }

   @Override
   public void b(eus $$0, eul $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ah().a(new ady($$0.cz(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(euk $$0, @Nullable eul $$1) {
      eul $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ah().a(new aep($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ah().a(new aep($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, euo $$1) {
      if (super.a($$0, $$1)) {
         this.b.ah().a(aey.a($$1, $$0, aey.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, euo $$1) {
      super.b($$0, $$1);
      this.b.ah().a(aey.a($$1, $$0, aey.a.b));
      this.a();
   }

   @Override
   public void a(eul $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(eul $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ah().a(new aew($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(eul $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(euo $$0) {
      super.a($$0);
      this.b.ah().a(aey.a($$0, true));
      this.a();
   }

   @Override
   public void b(euo $$0) {
      super.b($$0);
      this.b.ah().a(aey.a($$0, false));
      this.a();
   }

   @Override
   public void c(euo $$0) {
      super.c($$0);
      this.b.ah().a(aey.a($$0));
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

   public List<zb<?>> d(eul $$0) {
      List<zb<?>> $$1 = Lists.newArrayList();
      $$1.add(new aew($$0, 0));

      for (euk $$2 : euk.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aep($$2, $$0));
         }
      }

      for (eum $$3 : this.i($$0)) {
         $$1.add(new aez($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(eul $$0) {
      List<zb<?>> $$1 = this.d($$0);

      for (aqi $$2 : this.b.ah().t()) {
         for (zb<?> $$3 : $$1) {
            $$2.d.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<zb<?>> f(eul $$0) {
      List<zb<?>> $$1 = Lists.newArrayList();
      $$1.add(new aew($$0, 1));

      for (euk $$2 : euk.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aep($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(eul $$0) {
      List<zb<?>> $$1 = this.f($$0);

      for (aqi $$2 : this.b.ah().t()) {
         for (zb<?> $$3 : $$1) {
            $$2.d.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(eul $$0) {
      int $$1 = 0;

      for (euk $$2 : euk.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public enh.a<euu> b() {
      return new enh.a<>(this::h, this::a, azf.n);
   }

   private euu h() {
      euu $$0 = new euu(this);
      this.a($$0::c);
      return $$0;
   }

   private euu a(ua $$0, iy.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
