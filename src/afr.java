import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.ServicesKeySet;
import com.mojang.authlib.yggdrasil.ServicesKeyType;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import javax.annotation.Nullable;

public record afr(MinecraftSessionService a, ServicesKeySet b, GameProfileRepository c, aof d) {
   private static final String e = "usercache.json";

   public static afr a(YggdrasilAuthenticationService $$0, File $$1) {
      MinecraftSessionService $$2 = $$0.createMinecraftSessionService();
      GameProfileRepository $$3 = $$0.createProfileRepository();
      aof $$4 = new aof($$3, new File($$1, "usercache.json"));
      return new afr($$2, $$0.getServicesKeySet(), $$3, $$4);
   }

   @Nullable
   public asm a() {
      return asm.a(this.b, ServicesKeyType.PROFILE_KEY);
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

   public aof e() {
      return this.d;
   }
}
