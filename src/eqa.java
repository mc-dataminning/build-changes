import java.util.Locale;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface eqa extends eqc {
   @Override
   String e();

   void a(boolean var1);

   int j();

   void c(int var1);

   void b(int var1);

   int h();

   @Override
   default void a(p $$0, dbz $$1) {
      eqc.super.a($$0, $$1);
      $$0.a("Level name", this::e);
      $$0.a(
         "Level game mode",
         () -> String.format(Locale.ROOT, "Game mode: %s (ID %d). Hardcore: %b. Commands: %b", this.k().b(), this.k().a(), this.l(), this.m())
      );
      $$0.a("Level weather", () -> String.format(Locale.ROOT, "Rain time: %d (now: %b), thunder time: %d (now: %b)", this.j(), this.i(), this.h(), this.g()));
   }

   int f();

   void a(int var1);

   int t();

   void d(int var1);

   int u();

   void e(int var1);

   @Nullable
   UUID v();

   void a(UUID var1);

   dbu k();

   void a(dts.c var1);

   dts.c p();

   boolean n();

   void c(boolean var1);

   boolean m();

   void a(dbu var1);

   evd<MinecraftServer> s();

   void a(long var1);

   void b(long var1);
}
