import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class ero extends dvq<ern, ero> {
   public static final Codec<ero> a = a(lz.c.q(), ern::g).stable();
   public static final int f = 9;
   public static final int g = 8;

   public ero(ern $$0, Reference2ObjectArrayMap<dwq<?>, Comparable<?>> $$1, MapCodec<ero> $$2) {
      super($$0, $$1, $$2);
   }

   public ern a() {
      return this.d;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(ern $$0) {
      return this.d == $$0 && this.d.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(dek $$0, jh $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(dek $$0, jh $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            jh $$4 = $$1.b($$2, 0, $$3);
            ero $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).s()) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(dff $$0, jh $$1, dvo $$2) {
      this.a().b($$0, $$1, $$2, this);
   }

   public void a(dff $$0, jh $$1, azv $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(dff $$0, jh $$1, azv $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public ezr c(dek $$0, jh $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dvo g() {
      return this.a().b(this);
   }

   @Nullable
   public lq h() {
      return this.a().h();
   }

   public boolean a(axt<ern> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(ju<ern> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(ern $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(dek $$0, jh $$1, ern $$2, jm $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public fal d(dek $$0, jh $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public jq<ern> j() {
      return this.d.k();
   }

   public Stream<axt<ern>> k() {
      return this.d.k().c();
   }
}
