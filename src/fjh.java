import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fjh {
   private final GameProfile a;
   private final Supplier<gag> b;
   private cpu c = cpu.e;
   private int d;
   @Nullable
   private tn e;
   @Nullable
   private ud f;
   private ui g;

   public fjh(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gag>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gag> a(GameProfile $$0) {
      eqx $$1 = eqx.O();
      gah $$2 = $$1.al();
      CompletableFuture<gag> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gag $$5 = fzy.a($$0);
      return () -> {
         gag $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public ud b() {
      return this.f;
   }

   public ui c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(ud $$0) {
      this.f = $$0;
      this.g = $$0.a(cbz.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static ui b(boolean $$0) {
      return $$0 ? ui.c : ui.b;
   }

   public cpu e() {
      return this.c;
   }

   protected void a(cpu $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gag g() {
      return this.b.get();
   }

   @Nullable
   public eim h() {
      return eqx.O().r.I().g(this.a().getName());
   }

   public void a(@Nullable tn $$0) {
      this.e = $$0;
   }

   @Nullable
   public tn i() {
      return this.e;
   }
}
