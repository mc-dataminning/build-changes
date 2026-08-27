import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.ServicesKeySet;
import com.mojang.authlib.yggdrasil.ServicesKeyType;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import javax.annotation.Nullable;

public record afj(MinecraftSessionService a, ServicesKeySet b, GameProfileRepository c, anv d) {
   private static final String e = "usercache.json";

   public static afj a(YggdrasilAuthenticationService $$0, File $$1) {
      MinecraftSessionService $$2 = $$0.createMinecraftSessionService();
      GameProfileRepository $$3 = $$0.createProfileRepository();
      anv $$4 = new anv($$3, new File($$1, "usercache.json"));
      return new afj($$2, $$0.getServicesKeySet(), $$3, $$4);
   }

   @Nullable
   public arz a() {
      return arz.a(this.b, ServicesKeyType.PROFILE_KEY);
   }

   public MinecraftSessionService b() {
      return this.a;
   }

   public ServicesKeySet c() {
      return this.b;
   }

   public GameProfileRepository d() {
      return this.c;
   }

   public anv e() {
      return this.d;
   }
}
