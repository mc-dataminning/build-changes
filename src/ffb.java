import com.google.common.base.MoreObjects;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.util.Map;
import javax.annotation.Nullable;

public class ffb {
   private final GameProfile a;
   private final Map<Type, acq> b = Maps.newEnumMap(Type.class);
   private cmj c = cmj.e;
   private int d;
   private boolean e;
   @Nullable
   private String f;
   @Nullable
   private sw g;
   @Nullable
   private tm h;
   private tr i;

   public ffb(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.i = b($$1);
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public tm b() {
      return this.h;
   }

   public tr c() {
      return this.i;
   }

   public boolean d() {
      return this.h != null;
   }

   protected void a(tm $$0) {
      this.h = $$0;
      this.i = $$0.a();
   }

   protected void a(boolean $$0) {
      this.h = null;
      this.i = b($$0);
   }

   private static tr b(boolean $$0) {
      return $$0 ? tr.b : tr.a;
   }

   public cmj e() {
      return this.c;
   }

   protected void a(cmj $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public boolean g() {
      return this.k() != null;
   }

   public boolean h() {
      return this.j() != null;
   }

   public String i() {
      return this.f == null ? fvm.b(this.a.getId()) : this.f;
   }

   public acq j() {
      this.n();
      return (acq)MoreObjects.firstNonNull(this.b.get(Type.SKIN), fvm.a(this.a.getId()));
   }

   @Nullable
   public acq k() {
      this.n();
      return this.b.get(Type.CAPE);
   }

   @Nullable
   public acq l() {
      this.n();
      return this.b.get(Type.ELYTRA);
   }

   @Nullable
   public efe m() {
      return enn.N().s.I().i(this.a().getName());
   }

   protected void n() {
      synchronized (this) {
         if (!this.e) {
            this.e = true;
            enn.N().ak().a(this.a, ($$0, $$1, $$2) -> {
               this.b.put($$0, $$1);
               if ($$0 == Type.SKIN) {
                  this.f = $$2.getMetadata("model");
                  if (this.f == null) {
                     this.f = "default";
                  }
               }
            }, true);
         }
      }
   }

   public void a(@Nullable sw $$0) {
      this.g = $$0;
   }

   @Nullable
   public sw o() {
      return this.g;
   }
}
