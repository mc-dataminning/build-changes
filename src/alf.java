import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class alf extends evq {
   private final MinecraftServer b;
   private final Set<evi> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public alf(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(evp $$0, evi $$1, evn $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ah().a(new afe($$0.cB(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(evp $$0, evi $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(evp $$0) {
      super.a($$0);
      this.b.ah().a(new aed($$0.cB(), null));
      this.a();
   }

   @Override
   public void b(evp $$0, evi $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ah().a(new aed($$0.cB(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(evh $$0, @Nullable evi $$1) {
      evi $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ah().a(new aeu($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ah().a(new aeu($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, evl $$1) {
      if (super.a($$0, $$1)) {
         this.b.ah().a(afd.a($$1, $$0, afd.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, evl $$1) {
      super.b($$0, $$1);
      this.b.ah().a(afd.a($$1, $$0, afd.a.b));
      this.a();
   }

   @Override
   public void a(evi $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(evi $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ah().a(new afb($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(evi $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(evl $$0) {
      super.a($$0);
      this.b.ah().a(afd.a($$0, true));
      this.a();
   }

   @Override
   public void b(evl $$0) {
      super.b($$0);
      this.b.ah().a(afd.a($$0, false));
      this.a();
   }

   @Override
   public void c(evl $$0) {
      super.c($$0);
      this.b.ah().a(afd.a($$0));
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

   public List<ze<?>> d(evi $$0) {
      List<ze<?>> $$1 = Lists.newArrayList();
      $$1.add(new afb($$0, 0));

      for (evh $$2 : evh.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aeu($$2, $$0));
         }
      }

      for (evj $$3 : this.i($$0)) {
         $$1.add(new afe($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(evi $$0) {
      List<ze<?>> $$1 = this.d($$0);

      for (aqo $$2 : this.b.ah().t()) {
         for (ze<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<ze<?>> f(evi $$0) {
      List<ze<?>> $$1 = Lists.newArrayList();
      $$1.add(new afb($$0, 1));

      for (evh $$2 : evh.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aeu($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(evi $$0) {
      List<ze<?>> $$1 = this.f($$0);

      for (aqo $$2 : this.b.ah().t()) {
         for (ze<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(evi $$0) {
      int $$1 = 0;

      for (evh $$2 : evh.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public eod.a<evr> b() {
      return new eod.a<>(this::h, this::a, azl.n);
   }

   private evr h() {
      evr $$0 = new evr(this);
      this.a($$0::c);
      return $$0;
   }

   private evr a(ud $$0, iz.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
