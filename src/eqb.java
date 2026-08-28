import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class eqb extends duc<eqa, eqb> {
   public static final Codec<eqb> a = a(lu.c.q(), eqa::g).stable();
   public static final int f = 9;
   public static final int g = 8;

   public eqb(eqa $$0, Reference2ObjectArrayMap<dvd<?>, Comparable<?>> $$1, MapCodec<eqb> $$2) {
      super($$0, $$1, $$2);
   }

   public eqa a() {
      return this.d;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(eqa $$0) {
      return this.d == $$0 && this.d.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(dcx $$0, je $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(dcx $$0, je $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            je $$4 = $$1.b($$2, 0, $$3);
            eqb $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).s()) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(dds $$0, je $$1, dua $$2) {
      this.a().b($$0, $$1, $$2, this);
   }

   public void a(dds $$0, je $$1, azk $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(dds $$0, je $$1, azk $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public eye c(dcx $$0, je $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dua g() {
      return this.a().b(this);
   }

   @Nullable
   public ll h() {
      return this.a().h();
   }

   public boolean a(axi<eqa> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(jr<eqa> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(eqa $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(dcx $$0, je $$1, eqa $$2, jj $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public eyx d(dcx $$0, je $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public jn<eqa> j() {
      return this.d.k();
   }

   public Stream<axi<eqa>> k() {
      return this.d.k().c();
   }
}
