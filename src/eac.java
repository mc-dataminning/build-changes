import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class eac extends dfb<eab, eac> {
   public static final Codec<eac> a = a(jb.d.q(), eab::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public eac(eab $$0, ImmutableMap<dgc<?>, Comparable<?>> $$1, MapCodec<eac> $$2) {
      super($$0, $$1, $$2);
   }

   public eab a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(eab $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(cor $$0, gu $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(cor $$0, gu $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            gu $$4 = $$1.b($$2, 0, $$3);
            eac $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cpl $$0, gu $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(cpl $$0, gu $$1, aru $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(cpl $$0, gu $$1, aru $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public ehd c(cor $$0, gu $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dez g() {
      return this.a().b(this);
   }

   @Nullable
   public it h() {
      return this.a().h();
   }

   public boolean a(aqa<eab> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(hi<eab> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(eab $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(cor $$0, gu $$1, eab $$2, ha $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public ehw d(cor $$0, gu $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public he<eab> j() {
      return this.e.k();
   }

   public Stream<aqa<eab>> k() {
      return this.e.k().c();
   }
}
