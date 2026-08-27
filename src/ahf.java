import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.ServicesKeySet;
import com.mojang.authlib.yggdrasil.ServicesKeyType;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import javax.annotation.Nullable;

public record ahf(MinecraftSessionService a, ServicesKeySet b, GameProfileRepository c, apu d) {
   private static final String e = "usercache.json";

   public static ahf a(YggdrasilAuthenticationService $$0, File $$1) {
      MinecraftSessionService $$2 = $$0.createMinecraftSessionService();
      GameProfileRepository $$3 = $$0.createProfileRepository();
      apu $$4 = new apu($$3, new File($$1, "usercache.json"));
      return new ahf($$2, $$0.getServicesKeySet(), $$3, $$4);
   }

   @Nullable
   public auc a() {
      return auc.a(this.b, ServicesKeyType.PROFILE_KEY);
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

   public apu e() {
      return this.d;
   }
}
