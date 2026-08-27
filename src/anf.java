import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class anf extends ane implements uk, ye {
   private static final Logger d = LogUtils.getLogger();
   private static final uv e = uv.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile f;
   private final Queue<amy> g = new ConcurrentLinkedQueue<>();
   @Nullable
   private amy h;
   private alx i;

   public anf(MinecraftServer $$0, tw $$1, amx $$2) {
      super($$0, $$1, $$2);
      this.f = $$2.a();
      this.i = $$2.c();
   }

   @Override
   protected GameProfile j() {
      return this.f;
   }

   @Override
   public void a(uv $$0) {
      d.info("{} lost connection: {}", this.f, $$0.getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   public void m() {
      this.b(new ws(new xg(this.b.getServerModName())));
      in<agv> $$0 = this.b.ba();
      this.b(new yd(cgk.e.b(this.b.aY().M())));
      this.b(new yc(new it.c(iw.a($$0)).c()));
      this.b(new wx(asc.a($$0)));
      this.o();
      this.g.add(new ano());
      this.p();
   }

   public void n() {
      this.g.add(new ano());
      this.p();
   }

   private void o() {
      this.b.U().ifPresent($$0 -> this.g.add(new anp($$0)));
   }

   @Override
   public void a(wz $$0) {
      this.i = $$0.a();
   }

   @Override
   public void a(xd $$0) {
      super.a($$0);
      if ($$0.a() != xd.a.d) {
         this.a(anp.a);
      }
   }

   @Override
   public void a(yf $$0) {
      this.c.a();
      wq.a($$0, this, this.b);
      this.a(ano.a);

      try {
         apy $$1 = this.b.ae();
         if ($$1.a(this.f.getId()) != null) {
            this.b(apy.g);
            return;
         }

         uv $$2 = $$1.a(this.c.f(), this.f);
         if ($$2 != null) {
            this.b($$2);
            return;
         }

         amj $$3 = $$1.a(this.f, this.i);
         $$1.a(this.c, $$3, this.a(this.i));
         this.c.b();
      } catch (Exception var5) {
         d.error("Couldn't place player in world", var5);
         this.c.a(new wt(e));
         this.c.a(e);
      }
   }

   @Override
   public void e() {
      this.f();
   }

   private void p() {
      if (this.h != null) {
         throw new IllegalStateException("Task " + this.h.a().a() + " has not finished yet");
      } else if (this.c()) {
         amy $$0 = this.g.poll();
         if ($$0 != null) {
            this.h = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(amy.a $$0) {
      amy.a $$1 = this.h != null ? this.h.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.h = null;
         this.p();
      }
   }
}
