import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class anw extends anv implements us, yu {
   private static final Logger d = LogUtils.getLogger();
   private static final vd e = vd.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile f;
   private final Queue<anp> g = new ConcurrentLinkedQueue<>();
   @Nullable
   private anp h;
   private amo i;

   public anw(MinecraftServer $$0, ue $$1, ano $$2) {
      super($$0, $$1, $$2);
      this.f = $$2.a();
      this.i = $$2.c();
   }

   @Override
   protected GameProfile j() {
      return this.f;
   }

   @Override
   public void a(vd $$0) {
      d.info("{} lost connection: {}", this.f, $$0.getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   public void m() {
      this.b(new xh(new xv(this.b.getServerModName())));
      io<ahm> $$0 = this.b.ba();
      this.b(new yt(chn.e.b(this.b.aY().M())));
      this.b(new ys(new iu.c(ix.a($$0)).d()));
      this.b(new xm(ast.a($$0)));
      this.o();
      this.g.add(new aof());
      this.p();
   }

   public void n() {
      this.g.add(new aof());
      this.p();
   }

   private void o() {
      this.b.U().ifPresent($$0 -> this.g.add(new aog($$0)));
   }

   @Override
   public void a(xo $$0) {
      this.i = $$0.a();
   }

   @Override
   public void a(xs $$0) {
      super.a($$0);
      if ($$0.a() != xs.a.d) {
         this.a(aog.a);
      }
   }

   @Override
   public void a(yv $$0) {
      this.c.a();
      xf.a($$0, this, this.b);
      this.a(aof.a);

      try {
         aqp $$1 = this.b.ae();
         if ($$1.a(this.f.getId()) != null) {
            this.b(aqp.g);
            return;
         }

         vd $$2 = $$1.a(this.c.f(), this.f);
         if ($$2 != null) {
            this.b($$2);
            return;
         }

         ana $$3 = $$1.a(this.f, this.i);
         $$1.a(this.c, $$3, this.a(this.i));
         this.c.b();
      } catch (Exception var5) {
         d.error("Couldn't place player in world", var5);
         this.c.a(new xi(e));
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
         anp $$0 = this.g.poll();
         if ($$0 != null) {
            this.h = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(anp.a $$0) {
      anp.a $$1 = this.h != null ? this.h.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.h = null;
         this.p();
      }
   }
}
