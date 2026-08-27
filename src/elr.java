import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class elr extends dqa<elq, elr> {
   public static final Codec<elr> a = a(lc.c.q(), elq::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public elr(elq $$0, Reference2ObjectArrayMap<drb<?>, Comparable<?>> $$1, MapCodec<elr> $$2) {
      super($$0, $$1, $$2);
   }

   public elq a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(elq $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(cza $$0, im $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(cza $$0, im $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            im $$4 = $$1.b($$2, 0, $$3);
            elr $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(czu $$0, im $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(czu $$0, im $$1, ayd $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(czu $$0, im $$1, ayd $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public etf c(cza $$0, im $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dpy g() {
      return this.a().b(this);
   }

   @Nullable
   public ku h() {
      return this.a().h();
   }

   public boolean a(awd<elq> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(iz<elq> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(elq $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(cza $$0, im $$1, elq $$2, ir $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public ety d(cza $$0, im $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public iv<elq> j() {
      return this.e.k();
   }

   public Stream<awd<elq>> k() {
      return this.e.k().c();
   }
}
