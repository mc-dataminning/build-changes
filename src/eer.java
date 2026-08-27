import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class eer extends djj<eeq, eer> {
   public static final Codec<eer> a = a(kd.c.q(), eeq::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public eer(eeq $$0, ImmutableMap<dkk<?>, Comparable<?>> $$1, MapCodec<eer> $$2) {
      super($$0, $$1, $$2);
   }

   public eeq a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(eeq $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(csv $$0, hx $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(csv $$0, hx $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            hx $$4 = $$1.b($$2, 0, $$3);
            eer $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(ctp $$0, hx $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(ctp $$0, hx $$1, auv $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(ctp $$0, hx $$1, auv $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public elt c(csv $$0, hx $$1) {
      return this.a().a($$0, $$1, this);
   }

   public djh g() {
      return this.a().b(this);
   }

   @Nullable
   public jv h() {
      return this.a().h();
   }

   public boolean a(asw<eeq> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(il<eeq> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(eeq $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(csv $$0, hx $$1, eeq $$2, ic $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public emm d(csv $$0, hx $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public ih<eeq> j() {
      return this.e.k();
   }

   public Stream<asw<eeq>> k() {
      return this.e.k().c();
   }
}
