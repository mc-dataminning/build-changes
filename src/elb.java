import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class elb extends dpk<ela, elb> {
   public static final Codec<elb> a = a(kt.c.q(), ela::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public elb(ela $$0, Reference2ObjectArrayMap<dql<?>, Comparable<?>> $$1, MapCodec<elb> $$2) {
      super($$0, $$1, $$2);
   }

   public ela a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(ela $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(cym $$0, id $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(cym $$0, id $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            id $$4 = $$1.b($$2, 0, $$3);
            elb $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(czg $$0, id $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(czg $$0, id $$1, axt $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(czg $$0, id $$1, axt $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public esj c(cym $$0, id $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dpi g() {
      return this.a().b(this);
   }

   @Nullable
   public kl h() {
      return this.a().h();
   }

   public boolean a(avt<ela> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(ir<ela> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(ela $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(cym $$0, id $$1, ela $$2, ij $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public etc d(cym $$0, id $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public in<ela> j() {
      return this.e.k();
   }

   public Stream<avt<ela>> k() {
      return this.e.k().c();
   }
}
