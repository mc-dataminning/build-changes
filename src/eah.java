import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class eah extends dfg<eag, eah> {
   public static final Codec<eah> a = a(jd.d.q(), eag::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public eah(eag $$0, ImmutableMap<dgh<?>, Comparable<?>> $$1, MapCodec<eah> $$2) {
      super($$0, $$1, $$2);
   }

   public eag a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(eag $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(cow $$0, gw $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(cow $$0, gw $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            gw $$4 = $$1.b($$2, 0, $$3);
            eah $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cpq $$0, gw $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(cpq $$0, gw $$1, arx $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(cpq $$0, gw $$1, arx $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public ehi c(cow $$0, gw $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dfe g() {
      return this.a().b(this);
   }

   @Nullable
   public iv h() {
      return this.a().h();
   }

   public boolean a(aqd<eag> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(hk<eag> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(eag $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(cow $$0, gw $$1, eag $$2, hc $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public eib d(cow $$0, gw $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public hg<eag> j() {
      return this.e.k();
   }

   public Stream<aqd<eag>> k() {
      return this.e.k().c();
   }
}
