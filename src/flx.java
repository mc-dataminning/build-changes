import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class flx {
   private final GameProfile a;
   private final Supplier<gcz> b;
   private csc c = csc.e;
   private int d;
   @Nullable
   private uv e;
   @Nullable
   private vm f;
   private vr g;

   public flx(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gcz>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gcz> a(GameProfile $$0) {
      eti $$1 = eti.N();
      gda $$2 = $$1.ak();
      CompletableFuture<gcz> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gcz $$5 = gcr.a($$0);
      return () -> {
         gcz $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public vm b() {
      return this.f;
   }

   public vr c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(vm $$0) {
      this.f = $$0;
      this.g = $$0.a(cec.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static vr b(boolean $$0) {
      return $$0 ? vr.c : vr.b;
   }

   public csc e() {
      return this.c;
   }

   protected void a(csc $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gcz g() {
      return this.b.get();
   }

   @Nullable
   public ekw h() {
      return eti.N().r.J().g(this.a().getName());
   }

   public void a(@Nullable uv $$0) {
      this.e = $$0;
   }

   @Nullable
   public uv i() {
      return this.e;
   }
}
