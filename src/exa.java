import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class exa extends eav<ewz, exa> {
   public static final Codec<exa> a = a(mg.c.q(), ewz::g).stable();
   public static final int f = 9;
   public static final int g = 8;

   public exa(ewz $$0, Reference2ObjectArrayMap<ebw<?>, Comparable<?>> $$1, MapCodec<exa> $$2) {
      super($$0, $$1, $$2);
   }

   public ewz a() {
      return this.d;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(ewz $$0) {
      return this.d == $$0 && this.d.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(diq $$0, iv $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(diq $$0, iv $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            iv $$4 = $$1.b($$2, 0, $$3);
            exa $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).s()) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(arq $$0, iv $$1, eat $$2) {
      this.a().b($$0, $$1, $$2, this);
   }

   public void a(djm $$0, iv $$1, azv $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void a(arq $$0, iv $$1, azv $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public ffc c(diq $$0, iv $$1) {
      return this.a().a($$0, $$1, this);
   }

   public eat g() {
      return this.a().b(this);
   }

   @Nullable
   public lw h() {
      return this.a().h();
   }

   public boolean a(axr<ewz> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(jj<ewz> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(ewz $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(diq $$0, iv $$1, ewz $$2, jb $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public ffw d(diq $$0, iv $$1) {
      return this.a().b(this, $$0, $$1);
   }

   @Nullable
   public fex e(diq $$0, iv $$1) {
      return this.a().c(this, $$0, $$1);
   }

   public jf<ewz> j() {
      return this.d.k();
   }

   public Stream<axr<ewz>> k() {
      return this.d.k().c();
   }

   public void a(djm $$0, iv $$1, bwi $$2, bxb $$3) {
      this.a().a($$0, $$1, $$2, $$3);
   }
}
