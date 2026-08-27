import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class foa {
   private final GameProfile a;
   private final Supplier<gfl> b;
   private ctl c = ctl.e;
   private int d;
   @Nullable
   private vf e;
   @Nullable
   private vw f;
   private wb g;

   public foa(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gfl>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gfl> a(GameProfile $$0) {
      evh $$1 = evh.O();
      gfm $$2 = $$1.al();
      CompletableFuture<gfl> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gfl $$5 = gfe.a($$0);
      return () -> {
         gfl $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public vw b() {
      return this.f;
   }

   public wb c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(vw $$0) {
      this.f = $$0;
      this.g = $$0.a(cfk.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static wb b(boolean $$0) {
      return $$0 ? wb.c : wb.b;
   }

   public ctl e() {
      return this.c;
   }

   protected void a(ctl $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gfl g() {
      return this.b.get();
   }

   @Nullable
   public emr h() {
      return evh.O().r.K().e(this.a().getName());
   }

   public void a(@Nullable vf $$0) {
      this.e = $$0;
   }

   @Nullable
   public vf i() {
      return this.e;
   }
}
