import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.ServicesKeySet;
import com.mojang.authlib.yggdrasil.ServicesKeyType;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import javax.annotation.Nullable;

public record agy(MinecraftSessionService a, ServicesKeySet b, GameProfileRepository c, apm d) {
   private static final String e = "usercache.json";

   public static agy a(YggdrasilAuthenticationService $$0, File $$1) {
      MinecraftSessionService $$2 = $$0.createMinecraftSessionService();
      GameProfileRepository $$3 = $$0.createProfileRepository();
      apm $$4 = new apm($$3, new File($$1, "usercache.json"));
      return new agy($$2, $$0.getServicesKeySet(), $$3, $$4);
   }

   @Nullable
   public att a() {
      return att.a(this.b, ServicesKeyType.PROFILE_KEY);
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

   public apm e() {
      return this.d;
   }
}
