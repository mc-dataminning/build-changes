import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class exq extends ebi<exp, exq> {
   public static final Codec<exq> a = a(mh.c.q(), exp::g).stable();
   public static final int f = 9;
   public static final int g = 8;

   public exq(exp $$0, Reference2ObjectArrayMap<ecj<?>, Comparable<?>> $$1, MapCodec<exq> $$2) {
      super($$0, $$1, $$2);
   }

   public exp a() {
      return this.d;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(exp $$0) {
      return this.d == $$0 && this.d.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(djd $$0, iw $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(djd $$0, iw $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            iw $$4 = $$1.b($$2, 0, $$3);
            exq $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).s()) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(aru $$0, iw $$1, ebg $$2) {
      this.a().b($$0, $$1, $$2, this);
   }

   public void a(djz $$0, iw $$1, azz $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void a(aru $$0, iw $$1, azz $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public ffs c(djd $$0, iw $$1) {
      return this.a().a($$0, $$1, this);
   }

   public ebg g() {
      return this.a().b(this);
   }

   @Nullable
   public lx h() {
      return this.a().h();
   }

   public boolean a(axv<exp> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(jk<exp> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(exp $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(djd $$0, iw $$1, exp $$2, jc $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public fgm d(djd $$0, iw $$1) {
      return this.a().b(this, $$0, $$1);
   }

   @Nullable
   public ffn e(djd $$0, iw $$1) {
      return this.a().c(this, $$0, $$1);
   }

   public jg<exp> j() {
      return this.d.k();
   }

   public Stream<axv<exp>> k() {
      return this.d.k().c();
   }

   public void a(djz $$0, iw $$1, bwv $$2, bxo $$3) {
      this.a().a($$0, $$1, $$2, $$3);
   }
}
