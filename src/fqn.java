import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fqn {
   private final GameProfile a;
   private final Supplier<gia> b;
   private cvo c = cvo.e;
   private int d;
   @Nullable
   private vq e;
   @Nullable
   private wh f;
   private wm g;

   public fqn(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gia>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gia> a(GameProfile $$0) {
      exo $$1 = exo.P();
      gib $$2 = $$1.am();
      CompletableFuture<gia> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gia $$5 = ght.a($$0);
      return () -> {
         gia $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public wh b() {
      return this.f;
   }

   public wm c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(wh $$0) {
      this.f = $$0;
      this.g = $$0.a(cho.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static wm b(boolean $$0) {
      return $$0 ? wm.c : wm.b;
   }

   public cvo e() {
      return this.c;
   }

   protected void a(cvo $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gia g() {
      return this.b.get();
   }

   @Nullable
   public eoy h() {
      return exo.P().r.K().e(this.a().getName());
   }

   public void a(@Nullable vq $$0) {
      this.e = $$0;
   }

   @Nullable
   public vq i() {
      return this.e;
   }
}
