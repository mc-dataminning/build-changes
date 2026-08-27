import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class eks extends dpb<ekr, eks> {
   public static final Codec<eks> a = a(kr.c.q(), ekr::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public eks(ekr $$0, Reference2ObjectArrayMap<dqc<?>, Comparable<?>> $$1, MapCodec<eks> $$2) {
      super($$0, $$1, $$2);
   }

   public ekr a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(ekr $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(cyd $$0, ib $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(cyd $$0, ib $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            ib $$4 = $$1.b($$2, 0, $$3);
            eks $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cyx $$0, ib $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(cyx $$0, ib $$1, axr $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(cyx $$0, ib $$1, axr $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public esa c(cyd $$0, ib $$1) {
      return this.a().a($$0, $$1, this);
   }

   public doz g() {
      return this.a().b(this);
   }

   @Nullable
   public kj h() {
      return this.a().h();
   }

   public boolean a(avr<ekr> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(ip<ekr> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(ekr $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(cyd $$0, ib $$1, ekr $$2, ih $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public est d(cyd $$0, ib $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public il<ekr> j() {
      return this.e.k();
   }

   public Stream<avr<ekr>> k() {
      return this.e.k().c();
   }
}
