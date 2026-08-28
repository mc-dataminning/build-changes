import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.ServicesKeySet;
import com.mojang.authlib.yggdrasil.ServicesKeyType;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import javax.annotation.Nullable;

public record ale(MinecraftSessionService a, ServicesKeySet b, GameProfileRepository c, auf d) {
   private static final String e = "usercache.json";

   public static ale a(YggdrasilAuthenticationService $$0, File $$1) {
      MinecraftSessionService $$2 = $$0.createMinecraftSessionService();
      GameProfileRepository $$3 = $$0.createProfileRepository();
      auf $$4 = new auf($$3, new File($$1, "usercache.json"));
      return new ale($$2, $$0.getServicesKeySet(), $$3, $$4);
   }

   @Nullable
   public ayt a() {
      return ayt.a(this.b, ServicesKeyType.PROFILE_KEY);
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

   public auf f() {
      return this.d;
   }
}
