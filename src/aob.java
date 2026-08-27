import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aob extends aoa implements uv, yy {
   private static final Logger d = LogUtils.getLogger();
   private static final vg e = vg.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile f;
   private final Queue<anu> g = new ConcurrentLinkedQueue<>();
   @Nullable
   private anu h;
   private amt i;

   public aob(MinecraftServer $$0, uh $$1, ant $$2) {
      super($$0, $$1, $$2);
      this.f = $$2.a();
      this.i = $$2.c();
   }

   @Override
   protected GameProfile j() {
      return this.f;
   }

   @Override
   public void a(vg $$0) {
      d.info("{} lost connection: {}", this.f, $$0.getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   public void m() {
      this.b(new xk(new xz(this.b.getServerModName())));
      io<ahq> $$0 = this.b.ba();
      this.b(new yx(cic.e.b(this.b.aY().M())));
      this.b(new yw(new iu.c(ix.a($$0)).d()));
      this.b(new xq(ata.a($$0)));
      this.o();
      this.g.add(new aok());
      this.p();
   }

   public void n() {
      this.g.add(new aok());
      this.p();
   }

   private void o() {
      this.b.U().ifPresent($$0 -> this.g.add(new aol($$0)));
   }

   @Override
   public void a(xs $$0) {
      this.i = $$0.a();
   }

   @Override
   public void a(xw $$0) {
      super.a($$0);
      if ($$0.d().a()) {
         this.a(aol.a);
      }
   }

   @Override
   public void a(yz $$0) {
      this.c.a();
      xi.a($$0, this, this.b);
      this.a(aok.a);

      try {
         aqw $$1 = this.b.ae();
         if ($$1.a(this.f.getId()) != null) {
            this.b(aqw.g);
            return;
         }

         vg $$2 = $$1.a(this.c.f(), this.f);
         if ($$2 != null) {
            this.b($$2);
            return;
         }

         anf $$3 = $$1.a(this.f, this.i);
         $$1.a(this.c, $$3, this.a(this.i));
         this.c.b();
      } catch (Exception var5) {
         d.error("Couldn't place player in world", var5);
         this.c.a(new xl(e));
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
         anu $$0 = this.g.poll();
         if ($$0 != null) {
            this.h = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(anu.a $$0) {
      anu.a $$1 = this.h != null ? this.h.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.h = null;
         this.p();
      }
   }
}
