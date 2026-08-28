import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class exo extends ebg<exn, exo> {
   public static final Codec<exo> a = a(mg.c.q(), exn::g).stable();
   public static final int f = 9;
   public static final int g = 8;

   public exo(exn $$0, Reference2ObjectArrayMap<ech<?>, Comparable<?>> $$1, MapCodec<exo> $$2) {
      super($$0, $$1, $$2);
   }

   public exn a() {
      return this.d;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(exn $$0) {
      return this.d == $$0 && this.d.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(djb $$0, iv $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(djb $$0, iv $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            iv $$4 = $$1.b($$2, 0, $$3);
            exo $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).s()) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(ars $$0, iv $$1, ebe $$2) {
      this.a().b($$0, $$1, $$2, this);
   }

   public void a(djx $$0, iv $$1, azx $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void a(ars $$0, iv $$1, azx $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public ffq c(djb $$0, iv $$1) {
      return this.a().a($$0, $$1, this);
   }

   public ebe g() {
      return this.a().b(this);
   }

   @Nullable
   public lw h() {
      return this.a().h();
   }

   public boolean a(axt<exn> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(jj<exn> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(exn $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(djb $$0, iv $$1, exn $$2, jb $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public fgk d(djb $$0, iv $$1) {
      return this.a().b(this, $$0, $$1);
   }

   @Nullable
   public ffl e(djb $$0, iv $$1) {
      return this.a().c(this, $$0, $$1);
   }

   public jf<exn> j() {
      return this.d.k();
   }

   public Stream<axt<exn>> k() {
      return this.d.k().c();
   }

   public void a(djx $$0, iv $$1, bwt $$2, bxm $$3) {
      this.a().a($$0, $$1, $$2, $$3);
   }
}
