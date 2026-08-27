import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fka {
   private final GameProfile a;
   private final Supplier<gba> b;
   private cqw c = cqw.e;
   private int d;
   @Nullable
   private ui e;
   @Nullable
   private uz f;
   private ve g;

   public fka(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gba>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gba> a(GameProfile $$0) {
      ero $$1 = ero.O();
      gbb $$2 = $$1.al();
      CompletableFuture<gba> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gba $$5 = gas.a($$0);
      return () -> {
         gba $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public uz b() {
      return this.f;
   }

   public ve c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(uz $$0) {
      this.f = $$0;
      this.g = $$0.a(cda.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static ve b(boolean $$0) {
      return $$0 ? ve.c : ve.b;
   }

   public cqw e() {
      return this.c;
   }

   protected void a(cqw $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gba g() {
      return this.b.get();
   }

   @Nullable
   public ejc h() {
      return ero.O().r.I().g(this.a().getName());
   }

   public void a(@Nullable ui $$0) {
      this.e = $$0;
   }

   @Nullable
   public ui i() {
      return this.e;
   }
}
