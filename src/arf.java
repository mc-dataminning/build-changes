import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class arf extends are implements abc, wi {
   private static final Logger e = LogUtils.getLogger();
   private static final wu f = wu.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile g;
   private final Queue<aqx> h = new ConcurrentLinkedQueue<>();
   @Nullable
   private aqx i;
   private apw j;
   @Nullable
   private arq k;

   public arf(MinecraftServer $$0, vs $$1, aqw $$2) {
      super($$0, $$1, $$2);
      this.g = $$2.a();
      this.j = $$2.c();
   }

   @Override
   protected GameProfile j() {
      return this.g;
   }

   @Override
   public void a(wu $$0) {
      e.info("{} lost connection: {}", this.g, $$0.getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.d.i();
   }

   public void m() {
      this.b(new zi(new aaa(this.c.getServerModName())));
      jd<akq> $$0 = this.c.bd();
      List<asy> $$1 = this.c.bg().b().flatMap($$0x -> $$0x.a().d().stream()).toList();
      this.b(new aaz(cnw.e.b(this.c.bb().K())));
      this.k = new arq($$1, $$0);
      this.h.add(this.k);
      this.o();
      this.h.add(new aro());
      this.p();
   }

   public void n() {
      this.h.add(new aro());
      this.p();
   }

   private void o() {
      this.c.X().ifPresent($$0 -> this.h.add(new arp($$0)));
   }

   @Override
   public void a(zt $$0) {
      this.j = $$0.b();
   }

   @Override
   public void a(zx $$0) {
      super.a($$0);
      if ($$0.e().a()) {
         this.a(arp.a);
      }
   }

   @Override
   public void a(abe $$0) {
      ze.a($$0, this, this.c);
      if (this.k == null) {
         throw new IllegalStateException("Unexpected response from client: received pack selection, but no negotiation ongoing");
      } else {
         this.k.a($$0.b(), this::b);
         this.a(arq.a);
      }
   }

   @Override
   public void a(abd $$0) {
      ze.a($$0, this, this.c);
      this.a(aro.a);
      this.d.a(afy.b.bind(wf.a(this.c.bc())));

      try {
         aue $$1 = this.c.ah();
         if ($$1.a(this.g.getId()) != null) {
            this.b(aue.g);
            return;
         }

         wu $$2 = $$1.a(this.d.d(), this.g);
         if ($$2 != null) {
            this.b($$2);
            return;
         }

         aqi $$3 = $$1.a(this.g, this.j);
         $$1.a(this.d, $$3, this.a(this.j));
      } catch (Exception var5) {
         e.error("Couldn't place player in world", var5);
         this.d.a(new zj(f));
         this.d.a(f);
      }
   }

   @Override
   public void e() {
      this.f();
   }

   private void p() {
      if (this.i != null) {
         throw new IllegalStateException("Task " + this.i.a().a() + " has not finished yet");
      } else if (this.c()) {
         aqx $$0 = this.h.poll();
         if ($$0 != null) {
            this.i = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(aqx.a $$0) {
      aqx.a $$1 = this.i != null ? this.i.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.i = null;
         this.p();
      }
   }
}
