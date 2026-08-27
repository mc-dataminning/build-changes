import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class eao extends dfn<ean, eao> {
   public static final Codec<eao> a = a(jd.d.q(), ean::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public eao(ean $$0, ImmutableMap<dgo<?>, Comparable<?>> $$1, MapCodec<eao> $$2) {
      super($$0, $$1, $$2);
   }

   public ean a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(ean $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(cpd $$0, gw $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(cpd $$0, gw $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            gw $$4 = $$1.b($$2, 0, $$3);
            eao $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cpx $$0, gw $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(cpx $$0, gw $$1, ase $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(cpx $$0, gw $$1, ase $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public ehp c(cpd $$0, gw $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dfl g() {
      return this.a().b(this);
   }

   @Nullable
   public iv h() {
      return this.a().h();
   }

   public boolean a(aqj<ean> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(hk<ean> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(ean $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(cpd $$0, gw $$1, ean $$2, hc $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public eii d(cpd $$0, gw $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public hg<ean> j() {
      return this.e.k();
   }

   public Stream<aqj<ean>> k() {
      return this.e.k().c();
   }
}
