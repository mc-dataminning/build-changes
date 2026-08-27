import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class edz extends dir<edy, edz> {
   public static final Codec<edz> a = a(kb.c.q(), edy::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public edz(edy $$0, ImmutableMap<djs<?>, Comparable<?>> $$1, MapCodec<edz> $$2) {
      super($$0, $$1, $$2);
   }

   public edy a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(edy $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(cse $$0, hv $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(cse $$0, hv $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            hv $$4 = $$1.b($$2, 0, $$3);
            edz $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(csy $$0, hv $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(csy $$0, hv $$1, auf $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(csy $$0, hv $$1, auf $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public elb c(cse $$0, hv $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dip g() {
      return this.a().b(this);
   }

   @Nullable
   public jt h() {
      return this.a().h();
   }

   public boolean a(asg<edy> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(ij<edy> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(edy $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(cse $$0, hv $$1, edy $$2, ia $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public elu d(cse $$0, hv $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public ie<edy> j() {
      return this.e.k();
   }

   public Stream<asg<edy>> k() {
      return this.e.k().c();
   }
}
