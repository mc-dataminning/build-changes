import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class eip extends dnd<eio, eip> {
   public static final Codec<eip> a = a(ki.c.q(), eio::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public eip(eio $$0, Reference2ObjectArrayMap<doe<?>, Comparable<?>> $$1, MapCodec<eip> $$2) {
      super($$0, $$1, $$2);
   }

   public eio a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(eio $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(cwh $$0, ib $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(cwh $$0, ib $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            ib $$4 = $$1.b($$2, 0, $$3);
            eip $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cxb $$0, ib $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(cxb $$0, ib $$1, axd $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(cxb $$0, ib $$1, axd $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public ept c(cwh $$0, ib $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dnb g() {
      return this.a().b(this);
   }

   @Nullable
   public ka h() {
      return this.a().h();
   }

   public boolean a(avd<eio> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(ip<eio> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(eio $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(cwh $$0, ib $$1, eio $$2, ih $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public eqm d(cwh $$0, ib $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public il<eio> j() {
      return this.e.k();
   }

   public Stream<avd<eio>> k() {
      return this.e.k().c();
   }
}
