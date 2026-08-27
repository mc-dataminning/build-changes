import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ahk extends ema {
   private final MinecraftServer a;
   private final Set<elx> b = Sets.newHashSet();
   private final List<Runnable> c = Lists.newArrayList();

   public ahk(MinecraftServer $$0) {
      this.a = $$0;
   }

   @Override
   public void a(elz $$0) {
      super.a($$0);
      if (this.b.contains($$0.d())) {
         this.a.ae().a(new aby(ahk.a.a, $$0.d().b(), $$0.e(), $$0.b()));
      }

      this.a();
   }

   @Override
   public void a(String $$0) {
      super.a($$0);
      this.a.ae().a(new aby(ahk.a.b, null, $$0, 0));
      this.a();
   }

   @Override
   public void a(String $$0, elx $$1) {
      super.a($$0, $$1);
      if (this.b.contains($$1)) {
         this.a.ae().a(new aby(ahk.a.b, $$1.b(), $$0, 0));
      }

      this.a();
   }

   @Override
   public void a(elw $$0, @Nullable elx $$1) {
      elx $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.a.ae().a(new abo($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.b.contains($$1)) {
            this.a.ae().a(new abo($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, ely $$1) {
      if (super.a($$0, $$1)) {
         this.a.ae().a(abx.a($$1, $$0, abx.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, ely $$1) {
      super.b($$0, $$1);
      this.a.ae().a(abx.a($$1, $$0, abx.a.b));
      this.a();
   }

   @Override
   public void a(elx $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(elx $$0) {
      super.b($$0);
      if (this.b.contains($$0)) {
         this.a.ae().a(new abv($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(elx $$0) {
      super.c($$0);
      if (this.b.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(ely $$0) {
      super.a($$0);
      this.a.ae().a(abx.a($$0, true));
      this.a();
   }

   @Override
   public void b(ely $$0) {
      super.b($$0);
      this.a.ae().a(abx.a($$0, false));
      this.a();
   }

   @Override
   public void c(ely $$0) {
      super.c($$0);
      this.a.ae().a(abx.a($$0));
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

   public List<wu<?>> d(elx $$0) {
      List<wu<?>> $$1 = Lists.newArrayList();
      $$1.add(new abv($$0, 0));

      for (elw $$2 : elw.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new abo($$2, $$0));
         }
      }

      for (elz $$3 : this.i($$0)) {
         $$1.add(new aby(ahk.a.a, $$3.d().b(), $$3.e(), $$3.b()));
      }

      return $$1;
   }

   public void e(elx $$0) {
      List<wu<?>> $$1 = this.d($$0);

      for (amq $$2 : this.a.ae().t()) {
         for (wu<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.b.add($$0);
   }

   public List<wu<?>> f(elx $$0) {
      List<wu<?>> $$1 = Lists.newArrayList();
      $$1.add(new abv($$0, 1));

      for (elw $$2 : elw.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new abo($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(elx $$0) {
      List<wu<?>> $$1 = this.f($$0);

      for (amq $$2 : this.a.ae().t()) {
         for (wu<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.b.remove($$0);
   }

   public int h(elx $$0) {
      int $$1 = 0;

      for (elw $$2 : elw.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public efe.a<emb> b() {
      return new efe.a<>(this::i, this::a, avg.n);
   }

   private emb i() {
      emb $$0 = new emb(this);
      this.a($$0::c);
      return $$0;
   }

   private emb a(sj $$0) {
      return this.i().b($$0);
   }

   public static enum a {
      a,
      b;
   }
}
