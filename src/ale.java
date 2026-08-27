import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ale extends evo {
   private final MinecraftServer b;
   private final Set<evg> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public ale(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(evn $$0, evg $$1, evl $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ah().a(new afd($$0.cB(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(evn $$0, evg $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(evn $$0) {
      super.a($$0);
      this.b.ah().a(new aec($$0.cB(), null));
      this.a();
   }

   @Override
   public void b(evn $$0, evg $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ah().a(new aec($$0.cB(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(evf $$0, @Nullable evg $$1) {
      evg $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ah().a(new aet($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ah().a(new aet($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, evj $$1) {
      if (super.a($$0, $$1)) {
         this.b.ah().a(afc.a($$1, $$0, afc.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, evj $$1) {
      super.b($$0, $$1);
      this.b.ah().a(afc.a($$1, $$0, afc.a.b));
      this.a();
   }

   @Override
   public void a(evg $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(evg $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ah().a(new afa($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(evg $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(evj $$0) {
      super.a($$0);
      this.b.ah().a(afc.a($$0, true));
      this.a();
   }

   @Override
   public void b(evj $$0) {
      super.b($$0);
      this.b.ah().a(afc.a($$0, false));
      this.a();
   }

   @Override
   public void c(evj $$0) {
      super.c($$0);
      this.b.ah().a(afc.a($$0));
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

   public List<ze<?>> d(evg $$0) {
      List<ze<?>> $$1 = Lists.newArrayList();
      $$1.add(new afa($$0, 0));

      for (evf $$2 : evf.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aet($$2, $$0));
         }
      }

      for (evh $$3 : this.i($$0)) {
         $$1.add(new afd($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(evg $$0) {
      List<ze<?>> $$1 = this.d($$0);

      for (aqn $$2 : this.b.ah().t()) {
         for (ze<?> $$3 : $$1) {
            $$2.d.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<ze<?>> f(evg $$0) {
      List<ze<?>> $$1 = Lists.newArrayList();
      $$1.add(new afa($$0, 1));

      for (evf $$2 : evf.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aet($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(evg $$0) {
      List<ze<?>> $$1 = this.f($$0);

      for (aqn $$2 : this.b.ah().t()) {
         for (ze<?> $$3 : $$1) {
            $$2.d.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(evg $$0) {
      int $$1 = 0;

      for (evf $$2 : evf.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public eob.a<evp> b() {
      return new eob.a<>(this::h, this::a, azj.n);
   }

   private evp h() {
      evp $$0 = new evp(this);
      this.a($$0::c);
      return $$0;
   }

   private evp a(ud $$0, iz.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
