import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class alo extends fcf {
   private final MinecraftServer b;
   private final Set<fbx> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public alo(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(fce $$0, fbx $$1, fcc $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ag().a(new afg($$0.cI(), $$1.b(), $$2.a(), Optional.ofNullable($$2.d()), Optional.ofNullable($$2.c())));
      }

      this.a();
   }

   @Override
   protected void a(fce $$0, fbx $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(fce $$0) {
      super.a($$0);
      this.b.ag().a(new aed($$0.cI(), null));
      this.a();
   }

   @Override
   public void b(fce $$0, fbx $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ag().a(new aed($$0.cI(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(fbw $$0, @Nullable fbx $$1) {
      fbx $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ag().a(new aeu($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ag().a(new aeu($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, fca $$1) {
      if (super.a($$0, $$1)) {
         this.b.ag().a(aff.a($$1, $$0, aff.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, fca $$1) {
      super.b($$0, $$1);
      this.b.ag().a(aff.a($$1, $$0, aff.a.b));
      this.a();
   }

   @Override
   public void a(fbx $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(fbx $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ag().a(new afc($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(fbx $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(fca $$0) {
      super.a($$0);
      this.b.ag().a(aff.a($$0, true));
      this.a();
   }

   @Override
   public void b(fca $$0) {
      super.b($$0);
      this.b.ag().a(aff.a($$0, false));
      this.a();
   }

   @Override
   public void c(fca $$0) {
      super.c($$0);
      this.b.ag().a(aff.a($$0));
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

   public List<yw<?>> d(fbx $$0) {
      List<yw<?>> $$1 = Lists.newArrayList();
      $$1.add(new afc($$0, 0));

      for (fbw $$2 : fbw.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aeu($$2, $$0));
         }
      }

      for (fby $$3 : this.i($$0)) {
         $$1.add(new afg($$3.c(), $$0.b(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
      }

      return $$1;
   }

   public void e(fbx $$0) {
      List<yw<?>> $$1 = this.d($$0);

      for (are $$2 : this.b.ag().t()) {
         for (yw<?> $$3 : $$1) {
            $$2.f.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<yw<?>> f(fbx $$0) {
      List<yw<?>> $$1 = Lists.newArrayList();
      $$1.add(new afc($$0, 1));

      for (fbw $$2 : fbw.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new aeu($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(fbx $$0) {
      List<yw<?>> $$1 = this.f($$0);

      for (are $$2 : this.b.ag().t()) {
         for (yw<?> $$3 : $$1) {
            $$2.f.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(fbx $$0) {
      int $$1 = 0;

      for (fbw $$2 : fbw.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public eul.a<fcg> b() {
      return new eul.a<>(this::h, this::a, ban.n);
   }

   private fcg h() {
      fcg $$0 = new fcg(this);
      this.a($$0::c);
      return $$0;
   }

   private fcg a(tq $$0, jt.a $$1) {
      return this.h().b($$0, $$1);
   }

   public static enum a {
      a,
      b;
   }
}
