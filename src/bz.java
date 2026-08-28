import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class bz extends dx<bz.a> {
   @Override
   public Codec<bz.a> a() {
      return bz.a.a;
   }

   public void a(arn $$0, ezh $$1, @Nullable btz $$2) {
      ezh $$3 = $$0.dv();
      etw $$4 = $$2 != null ? bv.b($$0, $$2) : null;
      this.a($$0, $$4x -> $$4x.a($$0.B(), $$1, $$3, $$4));
   }

   public static record a(Optional<bg> b, Optional<dg> c, Optional<bm> d, Optional<bg> e) implements dx.a {
      public static final Codec<bz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(bz.a::a),
                  dg.a.optionalFieldOf("start_position").forGetter(bz.a::b),
                  bm.a.optionalFieldOf("distance").forGetter(bz.a::c),
                  bv.b.optionalFieldOf("cause").forGetter(bz.a::d)
               )
               .apply($$0, bz.a::new)
      );

      public static ao<bz.a> a(bm $$0, bv.a $$1) {
         return an.ae.a(new bz.a(Optional.empty(), Optional.empty(), Optional.of($$0), Optional.of(bv.a($$1))));
      }

      @Override
      public void a(bh $$0) {
         dx.a.super.a($$0);
         $$0.a(this.d(), ".cause");
      }

      public boolean a(arm $$0, ezh $$1, ezh $$2, @Nullable etw $$3) {
         if (this.c.isPresent() && !this.c.get().a($$0, $$1.d, $$1.e, $$1.f)) {
            return false;
         } else {
            return this.d.isPresent() && !this.d.get().a($$1.d, $$1.e, $$1.f, $$2.d, $$2.e, $$2.f)
               ? false
               : !this.e.isPresent() || $$3 != null && this.e.get().a($$3);
         }
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<dg> b() {
         return this.c;
      }

      public Optional<bm> c() {
         return this.d;
      }

      public Optional<bg> d() {
         return this.e;
      }
   }
}
