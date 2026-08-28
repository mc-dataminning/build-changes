import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.ServicesKeySet;
import com.mojang.authlib.yggdrasil.ServicesKeyType;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import javax.annotation.Nullable;

public record alw(MinecraftSessionService a, ServicesKeySet b, GameProfileRepository c, avc d) {
   private static final String e = "usercache.json";

   public static alw a(YggdrasilAuthenticationService $$0, File $$1) {
      MinecraftSessionService $$2 = $$0.createMinecraftSessionService();
      GameProfileRepository $$3 = $$0.createProfileRepository();
      avc $$4 = new avc($$3, new File($$1, "usercache.json"));
      return new alw($$2, $$0.getServicesKeySet(), $$3, $$4);
   }

   @Nullable
   public azp a() {
      return azp.a(this.b, ServicesKeyType.PROFILE_KEY);
   }

   public boolean b() {
      return !this.b.keys(ServicesKeyType.PROFILE_KEY).isEmpty();
   }

   public MinecraftSessionService c() {
      return this.a;
   }

   public ServicesKeySet d() {
      return this.b;
   }

   public GameProfileRepository e() {
      return this.c;
   }

   public avc f() {
      return this.d;
   }
}
