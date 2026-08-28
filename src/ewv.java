import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class ewv extends eaq<ewu, ewv> {
   public static final Codec<ewv> a = a(mg.c.q(), ewu::g).stable();
   public static final int f = 9;
   public static final int g = 8;

   public ewv(ewu $$0, Reference2ObjectArrayMap<ebr<?>, Comparable<?>> $$1, MapCodec<ewv> $$2) {
      super($$0, $$1, $$2);
   }

   public ewu a() {
      return this.d;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(ewu $$0) {
      return this.d == $$0 && this.d.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(din $$0, iv $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(din $$0, iv $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            iv $$4 = $$1.b($$2, 0, $$3);
            ewv $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).s()) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(arq $$0, iv $$1, eao $$2) {
      this.a().b($$0, $$1, $$2, this);
   }

   public void a(djh $$0, iv $$1, azv $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void a(arq $$0, iv $$1, azv $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public fex c(din $$0, iv $$1) {
      return this.a().a($$0, $$1, this);
   }

   public eao g() {
      return this.a().b(this);
   }

   @Nullable
   public lw h() {
      return this.a().h();
   }

   public boolean a(axr<ewu> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(jj<ewu> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(ewu $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(din $$0, iv $$1, ewu $$2, jb $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public ffr d(din $$0, iv $$1) {
      return this.a().b(this, $$0, $$1);
   }

   @Nullable
   public fes e(din $$0, iv $$1) {
      return this.a().c(this, $$0, $$1);
   }

   public jf<ewu> j() {
      return this.d.k();
   }

   public Stream<axr<ewu>> k() {
      return this.d.k().c();
   }

   public void a(djh $$0, iv $$1, bwi $$2, bxb $$3) {
      this.a().a($$0, $$1, $$2, $$3);
   }
}
