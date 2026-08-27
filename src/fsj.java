import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fsj {
   private final GameProfile a;
   private final Supplier<gjy> b;
   private cww c = cww.e;
   private int d;
   @Nullable
   private vu e;
   @Nullable
   private wl f;
   private wq g;

   public fsj(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gjy>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gjy> a(GameProfile $$0) {
      ezg $$1 = ezg.Q();
      gjz $$2 = $$1.an();
      CompletableFuture<gjy> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gjy $$5 = gjr.a($$0);
      return () -> {
         gjy $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public wl b() {
      return this.f;
   }

   public wq c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(wl $$0) {
      this.f = $$0;
      this.g = $$0.a(civ.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static wq b(boolean $$0) {
      return $$0 ? wq.c : wq.b;
   }

   public cww e() {
      return this.c;
   }

   protected void a(cww $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gjy g() {
      return this.b.get();
   }

   @Nullable
   public eqq h() {
      return ezg.Q().r.K().e(this.a().getName());
   }

   public void a(@Nullable vu $$0) {
      this.e = $$0;
   }

   @Nullable
   public vu i() {
      return this.e;
   }
}
