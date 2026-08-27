import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.ServicesKeySet;
import com.mojang.authlib.yggdrasil.ServicesKeyType;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import javax.annotation.Nullable;

public record ahw(MinecraftSessionService a, ServicesKeySet b, GameProfileRepository c, aql d) {
   private static final String e = "usercache.json";

   public static ahw a(YggdrasilAuthenticationService $$0, File $$1) {
      MinecraftSessionService $$2 = $$0.createMinecraftSessionService();
      GameProfileRepository $$3 = $$0.createProfileRepository();
      aql $$4 = new aql($$3, new File($$1, "usercache.json"));
      return new ahw($$2, $$0.getServicesKeySet(), $$3, $$4);
   }

   @Nullable
   public auv a() {
      return auv.a(this.b, ServicesKeyType.PROFILE_KEY);
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

   public aql e() {
      return this.d;
   }
}
