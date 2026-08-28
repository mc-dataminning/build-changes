import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class etw extends dxw<etv, etw> {
   public static final Codec<etw> a = a(ma.c.q(), etv::g).stable();
   public static final int f = 9;
   public static final int g = 8;

   public etw(etv $$0, Reference2ObjectArrayMap<dyw<?>, Comparable<?>> $$1, MapCodec<etw> $$2) {
      super($$0, $$1, $$2);
   }

   public etv a() {
      return this.d;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(etv $$0) {
      return this.d == $$0 && this.d.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(dgm $$0, jh $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(dgm $$0, jh $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            jh $$4 = $$1.b($$2, 0, $$3);
            etw $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).s()) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(ash $$0, jh $$1, dxu $$2) {
      this.a().b($$0, $$1, $$2, this);
   }

   public void a(dhh $$0, jh $$1, bam $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void a(ash $$0, jh $$1, bam $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public fbx c(dgm $$0, jh $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dxu g() {
      return this.a().b(this);
   }

   @Nullable
   public lq h() {
      return this.a().h();
   }

   public boolean a(ayk<etv> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(ju<etv> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(etv $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(dgm $$0, jh $$1, etv $$2, jm $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public fcr d(dgm $$0, jh $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public jq<etv> j() {
      return this.d.k();
   }

   public Stream<ayk<etv>> k() {
      return this.d.k().c();
   }
}
