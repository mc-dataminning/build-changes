import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class esy extends dwy<esx, esy> {
   public static final Codec<esy> a = a(mb.c.q(), esx::g).stable();
   public static final int f = 9;
   public static final int g = 8;

   public esy(esx $$0, Reference2ObjectArrayMap<dxy<?>, Comparable<?>> $$1, MapCodec<esy> $$2) {
      super($$0, $$1, $$2);
   }

   public esx a() {
      return this.d;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(esx $$0) {
      return this.d == $$0 && this.d.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(dfm $$0, ji $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(dfm $$0, ji $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            ji $$4 = $$1.b($$2, 0, $$3);
            esy $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).s()) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(ard $$0, ji $$1, dww $$2) {
      this.a().b($$0, $$1, $$2, this);
   }

   public void a(dgh $$0, ji $$1, azh $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void a(ard $$0, ji $$1, azh $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public faz c(dfm $$0, ji $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dww g() {
      return this.a().b(this);
   }

   @Nullable
   public lr h() {
      return this.a().h();
   }

   public boolean a(axf<esx> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(jv<esx> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(esx $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(dfm $$0, ji $$1, esx $$2, jn $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public fbt d(dfm $$0, ji $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public jr<esx> j() {
      return this.d.k();
   }

   public Stream<axf<esx>> k() {
      return this.d.k().c();
   }
}
