import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class enu extends dsd<ent, enu> {
   public static final Codec<enu> a = a(lp.c.q(), ent::g).stable();
   public static final int b = 9;
   public static final int g = 8;

   public enu(ent $$0, Reference2ObjectArrayMap<dte<?>, Comparable<?>> $$1, MapCodec<enu> $$2) {
      super($$0, $$1, $$2);
   }

   public ent a() {
      return this.e;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(ent $$0) {
      return this.e == $$0 && this.e.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(dbd $$0, iz $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(dbd $$0, iz $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            iz $$4 = $$1.b($$2, 0, $$3);
            enu $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).i($$0, $$4)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(dbx $$0, iz $$1) {
      this.a().b($$0, $$1, this);
   }

   public void a(dbx $$0, iz $$1, azg $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void b(dbx $$0, iz $$1, azg $$2) {
      this.a().b($$0, $$1, this, $$2);
   }

   public evq c(dbd $$0, iz $$1) {
      return this.a().a($$0, $$1, this);
   }

   public dsb g() {
      return this.a().b(this);
   }

   @Nullable
   public lg h() {
      return this.a().h();
   }

   public boolean a(axe<ent> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(jm<ent> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(ent $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(dbd $$0, iz $$1, ent $$2, je $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public ewj d(dbd $$0, iz $$1) {
      return this.a().b(this, $$0, $$1);
   }

   public ji<ent> j() {
      return this.e.k();
   }

   public Stream<axe<ent>> k() {
      return this.e.k().c();
   }
}
