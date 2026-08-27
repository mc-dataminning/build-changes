import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class egw extends dll<egv, egw> {
   public static final Codec<egw> a = a(kf.c.q(), egv::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public egw(egv $$0, ImmutableMap<dmm<?>, Comparable<?>> $$1, MapCodec<egw> $$2) {
      super($$0, $$1, $$2);
   }

   public egv a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(egv $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(cux $$0, hz $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(cux $$0, hz $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            hz $$4 = $$1.b($$2, 0, $$3);
            egw $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cvr $$0, hz $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(cvr $$0, hz $$1, awp $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(cvr $$0, hz $$1, awp $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public enz c(cux $$0, hz $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dlj g() {
      return this.a().b(this);
   }

   @Nullable
   public jx h() {
      return this.a().h();
   }

   public boolean a(aup<egv> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(in<egv> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(egv $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(cux $$0, hz $$1, egv $$2, ie $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public eos d(cux $$0, hz $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public ij<egv> j() {
      return this.e.k();
   }

   public Stream<aup<egv>> k() {
      return this.e.k().c();
   }
}
