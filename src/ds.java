import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ds extends dh<ds.a> {
   @Override
   public Codec<ds.a> a() {
      return ds.a.a;
   }

   public void a(aqu $$0, brv $$1, ewu $$2, int $$3) {
      erp $$4 = bs.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$4, $$2, $$3));
   }

   public static record a(Optional<bd> b, cu.d c, Optional<bd> d) implements dh.a {
      public static final Codec<ds.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axu.a(bs.b, "player").forGetter(ds.a::a),
                  axu.a(cu.d.d, "signal_strength", cu.d.c).forGetter(ds.a::b),
                  axu.a(bs.b, "projectile").forGetter(ds.a::c)
               )
               .apply($$0, ds.a::new)
      );

      public static ao<ds.a> a(cu.d $$0, Optional<bd> $$1) {
         return an.M.a(new ds.a(Optional.empty(), $$0, $$1));
      }

      public boolean a(erp $$0, ewu $$1, int $$2) {
         return !this.c.d($$2) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public void a(be $$0) {
         dh.a.super.a($$0);
         $$0.a(this.d, ".projectile");
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }

      public cu.d b() {
         return this.c;
      }

      public Optional<bd> c() {
         return this.d;
      }
   }
}
