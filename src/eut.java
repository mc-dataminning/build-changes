import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class eut extends dyo<eus, eut> {
   public static final Codec<eut> a = a(md.c.q(), eus::g).stable();
   public static final int f = 9;
   public static final int g = 8;

   public eut(eus $$0, Reference2ObjectArrayMap<dzp<?>, Comparable<?>> $$1, MapCodec<eut> $$2) {
      super($$0, $$1, $$2);
   }

   public eus a() {
      return this.d;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(eus $$0) {
      return this.d == $$0 && this.d.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(dgv $$0, jj $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(dgv $$0, jj $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            jj $$4 = $$1.b($$2, 0, $$3);
            eut $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).s()) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(arn $$0, jj $$1, dym $$2) {
      this.a().b($$0, $$1, $$2, this);
   }

   public void a(dhp $$0, jj $$1, azs $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void a(arn $$0, jj $$1, azs $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public fcu c(dgv $$0, jj $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dym g() {
      return this.a().b(this);
   }

   @Nullable
   public lt h() {
      return this.a().h();
   }

   public boolean a(axp<eus> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(jw<eus> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(eus $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(dgv $$0, jj $$1, eus $$2, jo $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public fdo d(dgv $$0, jj $$1) {
      return this.a().b(this, $$0, $$1);
   }

   @Nullable
   public fcp e(dgv $$0, jj $$1) {
      return this.a().c(this, $$0, $$1);
   }

   public js<eus> j() {
      return this.d.k();
   }

   public Stream<axp<eus>> k() {
      return this.d.k().c();
   }
}
