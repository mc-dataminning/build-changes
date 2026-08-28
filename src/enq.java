import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class enq extends drz<enp, enq> {
   public static final Codec<enq> a = a(lp.c.q(), enp::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public enq(enp $$0, Reference2ObjectArrayMap<dta<?>, Comparable<?>> $$1, MapCodec<enq> $$2) {
      super($$0, $$1, $$2);
   }

   public enp a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(enp $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(daz $$0, iz $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(daz $$0, iz $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            iz $$4 = $$1.b($$2, 0, $$3);
            enq $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(dbt $$0, iz $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(dbt $$0, iz $$1, azc $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(dbt $$0, iz $$1, azc $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public evm c(daz $$0, iz $$1) {
      return this.a().a($$0, $$1, this);
   }

   public drx g() {
      return this.a().b(this);
   }

   @Nullable
   public lh h() {
      return this.a().h();
   }

   public boolean a(axb<enp> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(jm<enp> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(enp $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(daz $$0, iz $$1, enp $$2, je $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public ewf d(daz $$0, iz $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public ji<enp> j() {
      return this.e.k();
   }

   public Stream<axb<enp>> k() {
      return this.e.k().c();
   }
}
