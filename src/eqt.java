import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class eqt extends duu<eqs, eqt> {
   public static final Codec<eqt> a = a(lv.c.q(), eqs::g).stable();
   public static final int f = 9;
   public static final int g = 8;

   public eqt(eqs $$0, Reference2ObjectArrayMap<dvv<?>, Comparable<?>> $$1, MapCodec<eqt> $$2) {
      super($$0, $$1, $$2);
   }

   public eqs a() {
      return this.d;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(eqs $$0) {
      return this.d == $$0 && this.d.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(ddo $$0, jf $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(ddo $$0, jf $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            jf $$4 = $$1.b($$2, 0, $$3);
            eqt $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).s()) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(dej $$0, jf $$1, dus $$2) {
      this.a().b($$0, $$1, $$2, this);
   }

   public void a(dej $$0, jf $$1, azn $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(dej $$0, jf $$1, azn $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public eyw c(ddo $$0, jf $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dus g() {
      return this.a().b(this);
   }

   @Nullable
   public lm h() {
      return this.a().h();
   }

   public boolean a(axl<eqs> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(js<eqs> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(eqs $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(ddo $$0, jf $$1, eqs $$2, jk $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public ezq d(ddo $$0, jf $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public jo<eqs> j() {
      return this.d.k();
   }

   public Stream<axl<eqs>> k() {
      return this.d.k().c();
   }
}
