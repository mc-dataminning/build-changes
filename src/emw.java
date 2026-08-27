import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class emw extends drf<emv, emw> {
   public static final Codec<emw> a = a(le.c.q(), emv::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public emw(emv $$0, Reference2ObjectArrayMap<dsg<?>, Comparable<?>> $$1, MapCodec<emw> $$2) {
      super($$0, $$1, $$2);
   }

   public emv a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(emv $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(daf $$0, io $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(daf $$0, io $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            io $$4 = $$1.b($$2, 0, $$3);
            emw $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(daz $$0, io $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(daz $$0, io $$1, aym $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(daz $$0, io $$1, aym $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public eum c(daf $$0, io $$1) {
      return this.a().a($$0, $$1, this);
   }

   public drd g() {
      return this.a().b(this);
   }

   @Nullable
   public kw h() {
      return this.a().h();
   }

   public boolean a(awm<emv> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(jb<emv> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(emv $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(daf $$0, io $$1, emv $$2, it $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public evf d(daf $$0, io $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public ix<emv> j() {
      return this.e.k();
   }

   public Stream<awm<emv>> k() {
      return this.e.k().c();
   }
}
