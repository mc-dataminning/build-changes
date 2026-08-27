import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fnt {
   private final GameProfile a;
   private final Supplier<gff> b;
   private ctf c = ctf.e;
   private int d;
   @Nullable
   private vd e;
   @Nullable
   private vu f;
   private vz g;

   public fnt(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.g = b($$1);
      Supplier<Supplier<gff>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<gff> a(GameProfile $$0) {
      eva $$1 = eva.N();
      gfg $$2 = $$1.ak();
      CompletableFuture<gff> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      gff $$5 = gex.a($$0);
      return () -> {
         gff $$3x = $$3.getNow($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public vu b() {
      return this.f;
   }

   public vz c() {
      return this.g;
   }

   public boolean d() {
      return this.f != null;
   }

   protected void a(vu $$0) {
      this.f = $$0;
      this.g = $$0.a(cfe.b);
   }

   protected void a(boolean $$0) {
      this.f = null;
      this.g = b($$0);
   }

   private static vz b(boolean $$0) {
      return $$0 ? vz.c : vz.b;
   }

   public ctf e() {
      return this.c;
   }

   protected void a(ctf $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public gff g() {
      return this.b.get();
   }

   @Nullable
   public eml h() {
      return eva.N().r.K().e(this.a().getName());
   }

   public void a(@Nullable vd $$0) {
      this.e = $$0;
   }

   @Nullable
   public vd i() {
      return this.e;
   }
}
