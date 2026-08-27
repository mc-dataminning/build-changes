import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class ecx extends dhp<ecw, ecx> {
   public static final Codec<ecx> a = a(kc.d.q(), ecw::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public ecx(ecw $$0, ImmutableMap<diq<?>, Comparable<?>> $$1, MapCodec<ecx> $$2) {
      super($$0, $$1, $$2);
   }

   public ecw a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(ecw $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(crl $$0, hx $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(crl $$0, hx $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            hx $$4 = $$1.b($$2, 0, $$3);
            ecx $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(csf $$0, hx $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(csf $$0, hx $$1, atw $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(csf $$0, hx $$1, atw $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public ejz c(crl $$0, hx $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dhn g() {
      return this.a().b(this);
   }

   @Nullable
   public ju h() {
      return this.a().h();
   }

   public boolean a(arz<ecw> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(ik<ecw> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(ecw $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(crl $$0, hx $$1, ecw $$2, ib $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public eks d(crl $$0, hx $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public ig<ecw> j() {
      return this.e.k();
   }

   public Stream<arz<ecw>> k() {
      return this.e.k().c();
   }
}
