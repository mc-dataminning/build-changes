import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class epc extends dte<epb, epc> {
   public static final Codec<epc> a = a(lt.c.r(), epb::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public epc(epb $$0, Reference2ObjectArrayMap<duf<?>, Comparable<?>> $$1, MapCodec<epc> $$2) {
      super($$0, $$1, $$2);
   }

   public epb a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(epb $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(dcc $$0, jd $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(dcc $$0, jd $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            jd $$4 = $$1.b($$2, 0, $$3);
            epc $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(dcw $$0, jd $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(dcw $$0, jd $$1, ayw $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(dcw $$0, jd $$1, ayw $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public exa c(dcc $$0, jd $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dtc g() {
      return this.a().b(this);
   }

   @Nullable
   public lk h() {
      return this.a().h();
   }

   public boolean a(awu<epb> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(jq<epb> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(epb $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(dcc $$0, jd $$1, epb $$2, ji $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public ext d(dcc $$0, jd $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public jm<epb> j() {
      return this.e.k();
   }

   public Stream<awu<epb>> k() {
      return this.e.k().c();
   }
}
