import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class ema extends dqj<elz, ema> {
   public static final Codec<ema> a = a(ld.c.q(), elz::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public ema(elz $$0, Reference2ObjectArrayMap<drk<?>, Comparable<?>> $$1, MapCodec<ema> $$2) {
      super($$0, $$1, $$2);
   }

   public elz a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(elz $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(czj $$0, in $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(czj $$0, in $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            in $$4 = $$1.b($$2, 0, $$3);
            ema $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(dad $$0, in $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(dad $$0, in $$1, ayg $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(dad $$0, in $$1, ayg $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public etp c(czj $$0, in $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dqh g() {
      return this.a().b(this);
   }

   @Nullable
   public kv h() {
      return this.a().h();
   }

   public boolean a(awg<elz> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(ja<elz> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(elz $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(czj $$0, in $$1, elz $$2, is $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public eui d(czj $$0, in $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public iw<elz> j() {
      return this.e.k();
   }

   public Stream<awg<elz>> k() {
      return this.e.k().c();
   }
}
