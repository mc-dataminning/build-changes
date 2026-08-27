import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class eeq extends dji<eep, eeq> {
   public static final Codec<eeq> a = a(kd.c.q(), eep::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public eeq(eep $$0, ImmutableMap<dkj<?>, Comparable<?>> $$1, MapCodec<eeq> $$2) {
      super($$0, $$1, $$2);
   }

   public eep a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(eep $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(csu $$0, hx $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(csu $$0, hx $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            hx $$4 = $$1.b($$2, 0, $$3);
            eeq $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cto $$0, hx $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(cto $$0, hx $$1, auu $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(cto $$0, hx $$1, auu $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public els c(csu $$0, hx $$1) {
      return this.a().a($$0, $$1, this);
   }

   public djg g() {
      return this.a().b(this);
   }

   @Nullable
   public jv h() {
      return this.a().h();
   }

   public boolean a(asv<eep> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(il<eep> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(eep $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(csu $$0, hx $$1, eep $$2, ic $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public eml d(csu $$0, hx $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public ih<eep> j() {
      return this.e.k();
   }

   public Stream<asv<eep>> k() {
      return this.e.k().c();
   }
}
