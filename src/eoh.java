import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class eoh extends dsm<eog, eoh> {
   public static final Codec<eoh> a = a(lq.c.r(), eog::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public eoh(eog $$0, Reference2ObjectArrayMap<dtn<?>, Comparable<?>> $$1, MapCodec<eoh> $$2) {
      super($$0, $$1, $$2);
   }

   public eog a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(eog $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(dbl $$0, ja $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(dbl $$0, ja $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            ja $$4 = $$1.b($$2, 0, $$3);
            eoh $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(dcf $$0, ja $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(dcf $$0, ja $$1, ayo $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(dcf $$0, ja $$1, ayo $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public ewf c(dbl $$0, ja $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dsk g() {
      return this.a().b(this);
   }

   @Nullable
   public lh h() {
      return this.a().h();
   }

   public boolean a(awm<eog> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(jn<eog> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(eog $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(dbl $$0, ja $$1, eog $$2, jf $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public ewy d(dbl $$0, ja $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public jj<eog> j() {
      return this.e.k();
   }

   public Stream<awm<eog>> k() {
      return this.e.k().c();
   }
}
