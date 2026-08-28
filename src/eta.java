import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class eta extends dxa<esz, eta> {
   public static final Codec<eta> a = a(mb.c.q(), esz::g).stable();
   public static final int f = 9;
   public static final int g = 8;

   public eta(esz $$0, Reference2ObjectArrayMap<dya<?>, Comparable<?>> $$1, MapCodec<eta> $$2) {
      super($$0, $$1, $$2);
   }

   public esz a() {
      return this.d;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(esz $$0) {
      return this.d == $$0 && this.d.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(dfo $$0, ji $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(dfo $$0, ji $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            ji $$4 = $$1.b($$2, 0, $$3);
            eta $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).s()) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(ard $$0, ji $$1, dwy $$2) {
      this.a().b($$0, $$1, $$2, this);
   }

   public void a(dgj $$0, ji $$1, azh $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void a(ard $$0, ji $$1, azh $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public fbb c(dfo $$0, ji $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dwy g() {
      return this.a().b(this);
   }

   @Nullable
   public lr h() {
      return this.a().h();
   }

   public boolean a(axf<esz> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(jv<esz> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(esz $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(dfo $$0, ji $$1, esz $$2, jn $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public fbv d(dfo $$0, ji $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public jr<esz> j() {
      return this.d.k();
   }

   public Stream<axf<esz>> k() {
      return this.d.k().c();
   }
}
