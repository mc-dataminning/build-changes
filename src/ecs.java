import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class ecs extends dhk<ecr, ecs> {
   public static final Codec<ecs> a = a(jy.d.q(), ecr::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public ecs(ecr $$0, ImmutableMap<dil<?>, Comparable<?>> $$1, MapCodec<ecs> $$2) {
      super($$0, $$1, $$2);
   }

   public ecr a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(ecr $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(crg $$0, ht $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(crg $$0, ht $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            ht $$4 = $$1.b($$2, 0, $$3);
            ecs $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(csa $$0, ht $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(csa $$0, ht $$1, ats $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(csa $$0, ht $$1, ats $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public eju c(crg $$0, ht $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dhi g() {
      return this.a().b(this);
   }

   @Nullable
   public jq h() {
      return this.a().h();
   }

   public boolean a(arv<ecr> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(ig<ecr> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(ecr $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(crg $$0, ht $$1, ecr $$2, hx $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public ekn d(crg $$0, ht $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public ib<ecr> j() {
      return this.e.k();
   }

   public Stream<arv<ecr>> k() {
      return this.e.k().c();
   }
}
