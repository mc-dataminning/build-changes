import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class eab extends dfa<eaa, eab> {
   public static final Codec<eab> a = a(jc.d.q(), eaa::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public eab(eaa $$0, ImmutableMap<dgb<?>, Comparable<?>> $$1, MapCodec<eab> $$2) {
      super($$0, $$1, $$2);
   }

   public eaa a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(eaa $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(coq $$0, gv $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(coq $$0, gv $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            gv $$4 = $$1.b($$2, 0, $$3);
            eab $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cpk $$0, gv $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(cpk $$0, gv $$1, art $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(cpk $$0, gv $$1, art $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public ehf c(coq $$0, gv $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dey g() {
      return this.a().b(this);
   }

   @Nullable
   public iu h() {
      return this.a().h();
   }

   public boolean a(apy<eaa> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(hj<eaa> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(eaa $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(coq $$0, gv $$1, eaa $$2, hb $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public ehy d(coq $$0, gv $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public hf<eaa> j() {
      return this.e.k();
   }

   public Stream<apy<eaa>> k() {
      return this.e.k().c();
   }
}
