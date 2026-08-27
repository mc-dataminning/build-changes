import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class ehr extends dmg<ehq, ehr> {
   public static final Codec<ehr> a = a(kh.c.q(), ehq::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public ehr(ehq $$0, ImmutableMap<dnh<?>, Comparable<?>> $$1, MapCodec<ehr> $$2) {
      super($$0, $$1, $$2);
   }

   public ehq a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(ehq $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(cvk $$0, ib $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(cvk $$0, ib $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            ib $$4 = $$1.b($$2, 0, $$3);
            ehr $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cwe $$0, ib $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(cwe $$0, ib $$1, awt $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(cwe $$0, ib $$1, awt $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public eov c(cvk $$0, ib $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dme g() {
      return this.a().b(this);
   }

   @Nullable
   public jz h() {
      return this.a().h();
   }

   public boolean a(aut<ehq> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(ip<ehq> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(ehq $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(cvk $$0, ib $$1, ehq $$2, ih $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public epo d(cvk $$0, ib $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public il<ehq> j() {
      return this.e.k();
   }

   public Stream<aut<ehq>> k() {
      return this.e.k().c();
   }
}
