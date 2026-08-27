import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fnc {
   private final GameProfile a;
   private final Supplier<geo> b;
   private csv c = csv.e;
   private int d;
   @Nullable
   private vb e;
   @Nullable
   private vs f;
   private vx g;

   public fnc(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<geo>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<geo> a(GameProfile $$0) {
      euk $$1 = euk.N();
      gep $$2 = $$1.ak();
      CompletableFuture<geo> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      geo $$5 = geg.a($$0);
      return () -> {
         geo $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public vs b() {
      return this.f;
   }

   public vx c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(vs $$0) {
      this.f = $$0;
      this.g = $$0.a(ceu.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static vx b(boolean $$0) {
      return $$0 ? vx.c : vx.b;
   }

   public csv e() {
      return this.c;
   }

   protected void a(csv $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public geo g() {
      return this.b.get();
   }

   @Nullable
   public ely h() {
      return euk.N().r.J().g(this.a().getName());
   }

   public void a(@Nullable vb $$0) {
      this.e = $$0;
   }

   @Nullable
   public vb i() {
      return this.e;
   }
}
