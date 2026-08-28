import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class eya extends ebs<exz, eya> {
   public static final Codec<eya> a = a(mh.c.q(), exz::g).stable();
   public static final int f = 9;
   public static final int g = 8;

   public eya(exz $$0, Reference2ObjectArrayMap<ect<?>, Comparable<?>> $$1, MapCodec<eya> $$2) {
      super($$0, $$1, $$2);
   }

   public exz a() {
      return this.d;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(exz $$0) {
      return this.d == $$0 && this.d.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(djn $$0, iw $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(djn $$0, iw $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            iw $$4 = $$1.b($$2, 0, $$3);
            eya $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).s()) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(asb $$0, iw $$1, ebq $$2) {
      this.a().b($$0, $$1, $$2, this);
   }

   public void a(dkj $$0, iw $$1, bai $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void a(asb $$0, iw $$1, bai $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public fgc c(djn $$0, iw $$1) {
      return this.a().a($$0, $$1, this);
   }

   public ebq g() {
      return this.a().b(this);
   }

   @Nullable
   public lx h() {
      return this.a().h();
   }

   public boolean a(ayc<exz> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(jk<exz> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(exz $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(djn $$0, iw $$1, exz $$2, jc $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public fgw d(djn $$0, iw $$1) {
      return this.a().b(this, $$0, $$1);
   }

   @Nullable
   public ffx e(djn $$0, iw $$1) {
      return this.a().c(this, $$0, $$1);
   }

   public jg<exz> j() {
      return this.d.k();
   }

   public Stream<ayc<exz>> k() {
      return this.d.k().c();
   }

   public void a(dkj $$0, iw $$1, bxe $$2, bxx $$3) {
      this.a().a($$0, $$1, $$2, $$3);
   }
}
