import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class eek extends djc<eej, eek> {
   public static final Codec<eek> a = a(kd.c.q(), eej::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public eek(eej $$0, ImmutableMap<dkd<?>, Comparable<?>> $$1, MapCodec<eek> $$2) {
      super($$0, $$1, $$2);
   }

   public eej a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(eej $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(cso $$0, hx $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(cso $$0, hx $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            hx $$4 = $$1.b($$2, 0, $$3);
            eek $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cti $$0, hx $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(cti $$0, hx $$1, aup $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(cti $$0, hx $$1, aup $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public elm c(cso $$0, hx $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dja g() {
      return this.a().b(this);
   }

   @Nullable
   public jv h() {
      return this.a().h();
   }

   public boolean a(asq<eej> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(il<eej> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(eej $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(cso $$0, hx $$1, eej $$2, ic $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public emf d(cso $$0, hx $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public ih<eej> j() {
      return this.e.k();
   }

   public Stream<asq<eej>> k() {
      return this.e.k().c();
   }
}
