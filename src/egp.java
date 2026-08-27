import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class egp extends dlh<ego, egp> {
   public static final Codec<egp> a = a(kf.c.q(), ego::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public egp(ego $$0, ImmutableMap<dmi<?>, Comparable<?>> $$1, MapCodec<egp> $$2) {
      super($$0, $$1, $$2);
   }

   public ego a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(ego $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(cut $$0, hz $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(cut $$0, hz $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            hz $$4 = $$1.b($$2, 0, $$3);
            egp $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cvn $$0, hz $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(cvn $$0, hz $$1, awo $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(cvn $$0, hz $$1, awo $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public ens c(cut $$0, hz $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dlf g() {
      return this.a().b(this);
   }

   @Nullable
   public jx h() {
      return this.a().h();
   }

   public boolean a(auo<ego> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(in<ego> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(ego $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(cut $$0, hz $$1, ego $$2, ie $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public eol d(cut $$0, hz $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public ij<ego> j() {
      return this.e.k();
   }

   public Stream<auo<ego>> k() {
      return this.e.k().c();
   }
}
