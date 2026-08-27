import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fqg {
   private final GameProfile a;
   private final Supplier<ght> b;
   private cvk c = cvk.e;
   private int d;
   @Nullable
   private vq e;
   @Nullable
   private wh f;
   private wm g;

   public fqg(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<ght>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<ght> a(GameProfile $$0) {
      exh $$1 = exh.O();
      ghu $$2 = $$1.al();
      CompletableFuture<ght> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      ght $$5 = ghm.a($$0);
      return () -> {
         ght $$3x = $$3.getNow($$5);
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
      this.g = $$0.a(chk.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static wm b(boolean $$0) {
      return $$0 ? wm.c : wm.b;
   }

   public cvk e() {
      return this.c;
   }

   protected void a(cvk $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public ght g() {
      return this.b.get();
   }

   @Nullable
   public eor h() {
      return exh.O().r.K().e(this.a().getName());
   }

   public void a(@Nullable vq $$0) {
      this.e = $$0;
   }

   @Nullable
   public vq i() {
      return this.e;
   }
}
