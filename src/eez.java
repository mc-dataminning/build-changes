import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class eez extends djr<eey, eez> {
   public static final Codec<eez> a = a(kd.c.q(), eey::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public eez(eey $$0, ImmutableMap<dks<?>, Comparable<?>> $$1, MapCodec<eez> $$2) {
      super($$0, $$1, $$2);
   }

   public eey a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(eey $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(ctd $$0, hx $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(ctd $$0, hx $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            hx $$4 = $$1.b($$2, 0, $$3);
            eez $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(ctx $$0, hx $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(ctx $$0, hx $$1, auw $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(ctx $$0, hx $$1, auw $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public emc c(ctd $$0, hx $$1) {
      return this.a().a($$0, $$1, this);
   }

   public djp g() {
      return this.a().b(this);
   }

   @Nullable
   public jv h() {
      return this.a().h();
   }

   public boolean a(asx<eey> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(il<eey> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(eey $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(ctd $$0, hx $$1, eey $$2, ic $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public emv d(ctd $$0, hx $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public ih<eey> j() {
      return this.e.k();
   }

   public Stream<asx<eey>> k() {
      return this.e.k().c();
   }
}
