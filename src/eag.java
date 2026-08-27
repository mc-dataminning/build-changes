import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class eag extends dff<eaf, eag> {
   public static final Codec<eag> a = a(jb.d.q(), eaf::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public eag(eaf $$0, ImmutableMap<dgg<?>, Comparable<?>> $$1, MapCodec<eag> $$2) {
      super($$0, $$1, $$2);
   }

   public eaf a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(eaf $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(cph $$0, gw $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(cph $$0, gw $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            gw $$4 = $$1.b($$2, 0, $$3);
            eag $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cqb $$0, gw $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(cqb $$0, gw $$1, ash $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(cqb $$0, gw $$1, ash $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public ehh c(cph $$0, gw $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dfd g() {
      return this.a().b(this);
   }

   @Nullable
   public it h() {
      return this.a().h();
   }

   public boolean a(aqk<eaf> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(hi<eaf> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(eaf $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(cph $$0, gw $$1, eaf $$2, ha $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public eia d(cph $$0, gw $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public he<eaf> j() {
      return this.e.k();
   }

   public Stream<aqk<eaf>> k() {
      return this.e.k().c();
   }
}
