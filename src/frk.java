import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class frk {
   private final GameProfile a;
   private final Supplier<giy> b;
   private cwb c = cwb.e;
   private int d;
   @Nullable
   private vs e;
   @Nullable
   private wj f;
   private wo g;

   public frk(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<giy>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<giy> a(GameProfile $$0) {
      eyk $$1 = eyk.P();
      giz $$2 = $$1.am();
      CompletableFuture<giy> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      giy $$5 = gir.a($$0);
      return () -> {
         giy $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public wj b() {
      return this.f;
   }

   public wo c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(wj $$0) {
      this.f = $$0;
      this.g = $$0.a(cid.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static wo b(boolean $$0) {
      return $$0 ? wo.c : wo.b;
   }

   public cwb e() {
      return this.c;
   }

   protected void a(cwb $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public giy g() {
      return this.b.get();
   }

   @Nullable
   public epu h() {
      return eyk.P().r.K().e(this.a().getName());
   }

   public void a(@Nullable vs $$0) {
      this.e = $$0;
   }

   @Nullable
   public vs i() {
      return this.e;
   }
}
