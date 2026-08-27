import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ahx extends emx {
   private final MinecraftServer b;
   private final Set<emp> c = Sets.newHashSet();
   private final List<Runnable> d = Lists.newArrayList();

   public ahx(MinecraftServer $$0) {
      this.b = $$0;
   }

   @Override
   protected void a(emw $$0, emp $$1, emu $$2) {
      super.a($$0, $$1, $$2);
      if (this.c.contains($$1)) {
         this.b.ae().a(new acl($$0.cy(), $$1.b(), $$2.a(), $$2.d(), $$2.c()));
      }

      this.a();
   }

   @Override
   protected void a(emw $$0, emp $$1) {
      super.a($$0, $$1);
      this.a();
   }

   @Override
   public void a(emw $$0) {
      super.a($$0);
      this.b.ae().a(new abk($$0.cy(), null));
      this.a();
   }

   @Override
   public void b(emw $$0, emp $$1) {
      super.b($$0, $$1);
      if (this.c.contains($$1)) {
         this.b.ae().a(new abk($$0.cy(), $$1.b()));
      }

      this.a();
   }

   @Override
   public void a(emo $$0, @Nullable emp $$1) {
      emp $$2 = this.a($$0);
      super.a($$0, $$1);
      if ($$2 != $$1 && $$2 != null) {
         if (this.h($$2) > 0) {
            this.b.ae().a(new acb($$0, $$1));
         } else {
            this.g($$2);
         }
      }

      if ($$1 != null) {
         if (this.c.contains($$1)) {
            this.b.ae().a(new acb($$0, $$1));
         } else {
            this.e($$1);
         }
      }

      this.a();
   }

   @Override
   public boolean a(String $$0, ems $$1) {
      if (super.a($$0, $$1)) {
         this.b.ae().a(ack.a($$1, $$0, ack.a.a));
         this.a();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void b(String $$0, ems $$1) {
      super.b($$0, $$1);
      this.b.ae().a(ack.a($$1, $$0, ack.a.b));
      this.a();
   }

   @Override
   public void a(emp $$0) {
      super.a($$0);
      this.a();
   }

   @Override
   public void b(emp $$0) {
      super.b($$0);
      if (this.c.contains($$0)) {
         this.b.ae().a(new aci($$0, 2));
      }

      this.a();
   }

   @Override
   public void c(emp $$0) {
      super.c($$0);
      if (this.c.contains($$0)) {
         this.g($$0);
      }

      this.a();
   }

   @Override
   public void a(ems $$0) {
      super.a($$0);
      this.b.ae().a(ack.a($$0, true));
      this.a();
   }

   @Override
   public void b(ems $$0) {
      super.b($$0);
      this.b.ae().a(ack.a($$0, false));
      this.a();
   }

   @Override
   public void c(ems $$0) {
      super.c($$0);
      this.b.ae().a(ack.a($$0));
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

   public List<xf<?>> d(emp $$0) {
      List<xf<?>> $$1 = Lists.newArrayList();
      $$1.add(new aci($$0, 0));

      for (emo $$2 : emo.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new acb($$2, $$0));
         }
      }

      for (emq $$3 : this.i($$0)) {
         $$1.add(new acl($$3.c(), $$0.b(), $$3.d(), $$3.e(), $$3.f()));
      }

      return $$1;
   }

   public void e(emp $$0) {
      List<xf<?>> $$1 = this.d($$0);

      for (ane $$2 : this.b.ae().t()) {
         for (xf<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.add($$0);
   }

   public List<xf<?>> f(emp $$0) {
      List<xf<?>> $$1 = Lists.newArrayList();
      $$1.add(new aci($$0, 1));

      for (emo $$2 : emo.values()) {
         if (this.a($$2) == $$0) {
            $$1.add(new acb($$2, $$0));
         }
      }

      return $$1;
   }

   public void g(emp $$0) {
      List<xf<?>> $$1 = this.f($$0);

      for (ane $$2 : this.b.ae().t()) {
         for (xf<?> $$3 : $$1) {
            $$2.c.b($$3);
         }
      }

      this.c.remove($$0);
   }

   public int h(emp $$0) {
      int $$1 = 0;

      for (emo $$2 : emo.values()) {
         if (this.a($$2) == $$0) {
            $$1++;
         }
      }

      return $$1;
   }

   public efw.a<emy> b() {
      return new efw.a<>(this::i, this::a, avw.n);
   }

   private emy i() {
      emy $$0 = new emy(this);
      this.a($$0::c);
      return $$0;
   }

   private emy a(sn $$0) {
      return this.i().b($$0);
   }

   public static enum a {
      a,
      b;
   }
}
