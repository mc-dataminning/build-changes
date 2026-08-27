import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class ecg extends dgy<ecf, ecg> {
   public static final Codec<ecg> a = a(jy.d.q(), ecf::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public ecg(ecf $$0, ImmutableMap<dhz<?>, Comparable<?>> $$1, MapCodec<ecg> $$2) {
      super($$0, $$1, $$2);
   }

   public ecf a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(ecf $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(cqy $$0, ht $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(cqy $$0, ht $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            ht $$4 = $$1.b($$2, 0, $$3);
            ecg $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(crs $$0, ht $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(crs $$0, ht $$1, ato $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(crs $$0, ht $$1, ato $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public eji c(cqy $$0, ht $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dgw g() {
      return this.a().b(this);
   }

   @Nullable
   public jq h() {
      return this.a().h();
   }

   public boolean a(arr<ecf> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(ig<ecf> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(ecf $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(cqy $$0, ht $$1, ecf $$2, hx $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public ekb d(cqy $$0, ht $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public ib<ecf> j() {
      return this.e.k();
   }

   public Stream<arr<ecf>> k() {
      return this.e.k().c();
   }
}
