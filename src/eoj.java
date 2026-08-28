import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class eoj extends dsn<eoi, eoj> {
   public static final Codec<eoj> a = a(lq.c.r(), eoi::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public eoj(eoi $$0, Reference2ObjectArrayMap<dto<?>, Comparable<?>> $$1, MapCodec<eoj> $$2) {
      super($$0, $$1, $$2);
   }

   public eoi a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(eoi $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(dbm $$0, ja $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(dbm $$0, ja $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            ja $$4 = $$1.b($$2, 0, $$3);
            eoj $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(dcg $$0, ja $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(dcg $$0, ja $$1, ayo $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(dcg $$0, ja $$1, ayo $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public ewh c(dbm $$0, ja $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dsl g() {
      return this.a().b(this);
   }

   @Nullable
   public lh h() {
      return this.a().h();
   }

   public boolean a(awm<eoi> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(jn<eoi> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(eoi $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(dbm $$0, ja $$1, eoi $$2, jf $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public exa d(dbm $$0, ja $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public jj<eoi> j() {
      return this.e.k();
   }

   public Stream<awm<eoi>> k() {
      return this.e.k().c();
   }
}
