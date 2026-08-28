import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class evv extends dzq<evu, evv> {
   public static final Codec<evv> a = a(mf.c.q(), evu::g).stable();
   public static final int f = 9;
   public static final int g = 8;

   public evv(evu $$0, Reference2ObjectArrayMap<ear<?>, Comparable<?>> $$1, MapCodec<evv> $$2) {
      super($$0, $$1, $$2);
   }

   public evu a() {
      return this.d;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(evu $$0) {
      return this.d == $$0 && this.d.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(dhv $$0, iu $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(dhv $$0, iu $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            iu $$4 = $$1.b($$2, 0, $$3);
            evv $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).s()) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(aro $$0, iu $$1, dzo $$2) {
      this.a().b($$0, $$1, $$2, this);
   }

   public void a(dip $$0, iu $$1, azt $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void a(aro $$0, iu $$1, azt $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public fdw c(dhv $$0, iu $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dzo g() {
      return this.a().b(this);
   }

   @Nullable
   public lv h() {
      return this.a().h();
   }

   public boolean a(axp<evu> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(ji<evu> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(evu $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(dhv $$0, iu $$1, evu $$2, ja $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public feq d(dhv $$0, iu $$1) {
      return this.a().b(this, $$0, $$1);
   }

   @Nullable
   public fdr e(dhv $$0, iu $$1) {
      return this.a().c(this, $$0, $$1);
   }

   public je<evu> j() {
      return this.d.k();
   }

   public Stream<axp<evu>> k() {
      return this.d.k().c();
   }
}
