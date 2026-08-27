import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fjb {
   private final GameProfile a;
   private final Supplier<gaa> b;
   private cpy c = cpy.e;
   private int d;
   @Nullable
   private tl e;
   @Nullable
   private uc f;
   private uh g;

   public fjb(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gaa>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gaa> a(GameProfile $$0) {
      eqp $$1 = eqp.O();
      gab $$2 = $$1.al();
      CompletableFuture<gaa> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gaa $$5 = fzs.a($$0);
      return () -> {
         gaa $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public uc b() {
      return this.f;
   }

   public uh c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(uc $$0) {
      this.f = $$0;
      this.g = $$0.a(ccd.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static uh b(boolean $$0) {
      return $$0 ? uh.c : uh.b;
   }

   public cpy e() {
      return this.c;
   }

   protected void a(cpy $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gaa g() {
      return this.b.get();
   }

   @Nullable
   public eie h() {
      return eqp.O().r.I().g(this.a().getName());
   }

   public void a(@Nullable tl $$0) {
      this.e = $$0;
   }

   @Nullable
   public tl i() {
      return this.e;
   }
}
