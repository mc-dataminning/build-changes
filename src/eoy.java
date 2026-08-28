import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class eoy extends dtc<eox, eoy> {
   public static final Codec<eoy> a = a(lt.c.r(), eox::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public eoy(eox $$0, Reference2ObjectArrayMap<dud<?>, Comparable<?>> $$1, MapCodec<eoy> $$2) {
      super($$0, $$1, $$2);
   }

   public eox a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(eox $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(dca $$0, jd $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(dca $$0, jd $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            jd $$4 = $$1.b($$2, 0, $$3);
            eoy $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(dcu $$0, jd $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(dcu $$0, jd $$1, ayv $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(dcu $$0, jd $$1, ayv $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public eww c(dca $$0, jd $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dta g() {
      return this.a().b(this);
   }

   @Nullable
   public lk h() {
      return this.a().h();
   }

   public boolean a(awt<eox> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(jq<eox> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(eox $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(dca $$0, jd $$1, eox $$2, ji $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public exp d(dca $$0, jd $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public jm<eox> j() {
      return this.e.k();
   }

   public Stream<awt<eox>> k() {
      return this.e.k().c();
   }
}
