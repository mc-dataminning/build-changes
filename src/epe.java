import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class epe extends dte<epd, epe> {
   public static final Codec<epe> a = a(lh.c.q(), epd::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public epe(epd $$0, Reference2ObjectArrayMap<duf<?>, Comparable<?>> $$1, MapCodec<epe> $$2) {
      super($$0, $$1, $$2);
   }

   public epd a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(epd $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(dbg $$0, ir $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(dbg $$0, ir $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            ir $$4 = $$1.b($$2, 0, $$3);
            epe $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(dca $$0, ir $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(dca $$0, ir $$1, ayt $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(dca $$0, ir $$1, ayt $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public ewu c(dbg $$0, ir $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dtc g() {
      return this.a().b(this);
   }

   @Nullable
   public kz h() {
      return this.a().h();
   }

   public boolean a(awt<epd> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(je<epd> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(epd $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(dbg $$0, ir $$1, epd $$2, iw $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public exn d(dbg $$0, ir $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public ja<epd> j() {
      return this.e.k();
   }

   public Stream<awt<epd>> k() {
      return this.e.k().c();
   }
}
