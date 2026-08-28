import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class cc extends dk<cc.a> {
   @Override
   public Codec<cc.a> a() {
      return cc.a.a;
   }

   public void a(arr $$0, ffc $$1, @Nullable bwi $$2) {
      ffc $$3 = $$0.ds();
      ezt $$4 = $$2 != null ? by.b($$0, $$2) : null;
      this.a($$0, $$4x -> $$4x.a($$0.y(), $$1, $$3, $$4));
   }

   public static record a(Optional<bj> b, Optional<cu> c, Optional<bp> d, Optional<bj> e) implements dk.a {
      public static final Codec<cc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  by.b.optionalFieldOf("player").forGetter(cc.a::a),
                  cu.a.optionalFieldOf("start_position").forGetter(cc.a::b),
                  bp.a.optionalFieldOf("distance").forGetter(cc.a::c),
                  by.b.optionalFieldOf("cause").forGetter(cc.a::d)
               )
               .apply($$0, cc.a::new)
      );

      public static ar<cc.a> a(bp $$0, by.a $$1) {
         return aq.ae.a(new cc.a(Optional.empty(), Optional.empty(), Optional.of($$0), Optional.of(by.a($$1))));
      }

      @Override
      public void a(bk $$0) {
         dk.a.super.a($$0);
         $$0.a(this.d(), ".cause");
      }

      public boolean a(arq $$0, ffc $$1, ffc $$2, @Nullable ezt $$3) {
         if (this.c.isPresent() && !this.c.get().a($$0, $$1.d, $$1.e, $$1.f)) {
            return false;
         } else {
            return this.d.isPresent() && !this.d.get().a($$1.d, $$1.e, $$1.f, $$2.d, $$2.e, $$2.f)
               ? false
               : !this.e.isPresent() || $$3 != null && this.e.get().a($$3);
         }
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<cu> b() {
         return this.c;
      }

      public Optional<bp> c() {
         return this.d;
      }

      public Optional<bj> d() {
         return this.e;
      }
   }
}
