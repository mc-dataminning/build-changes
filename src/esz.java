import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class esz extends dwz<esy, esz> {
   public static final Codec<esz> a = a(mb.c.q(), esy::g).stable();
   public static final int f = 9;
   public static final int g = 8;

   public esz(esy $$0, Reference2ObjectArrayMap<dxz<?>, Comparable<?>> $$1, MapCodec<esz> $$2) {
      super($$0, $$1, $$2);
   }

   public esy a() {
      return this.d;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(esy $$0) {
      return this.d == $$0 && this.d.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(dfn $$0, ji $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(dfn $$0, ji $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            ji $$4 = $$1.b($$2, 0, $$3);
            esz $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).s()) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(arc $$0, ji $$1, dwx $$2) {
      this.a().b($$0, $$1, $$2, this);
   }

   public void a(dgi $$0, ji $$1, azh $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void a(arc $$0, ji $$1, azh $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public fba c(dfn $$0, ji $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dwx g() {
      return this.a().b(this);
   }

   @Nullable
   public lr h() {
      return this.a().h();
   }

   public boolean a(axf<esy> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(jv<esy> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(esy $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(dfn $$0, ji $$1, esy $$2, jn $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public fbu d(dfn $$0, ji $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public jr<esy> j() {
      return this.d.k();
   }

   public Stream<axf<esy>> k() {
      return this.d.k().c();
   }
}
