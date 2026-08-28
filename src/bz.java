import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class bz extends dv<bz.a> {
   @Override
   public Codec<bz.a> a() {
      return bz.a.a;
   }

   public void a(aqu $$0, eww $$1, @Nullable bsq $$2) {
      eww $$3 = $$0.do();
      erl $$4 = $$2 != null ? bv.b($$0, $$2) : null;
      this.a($$0, $$4x -> $$4x.a($$0.A(), $$1, $$3, $$4));
   }

   public static record a(Optional<bg> b, Optional<df> c, Optional<bm> d, Optional<bg> e) implements dv.a {
      public static final Codec<bz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(bz.a::a),
                  df.a.optionalFieldOf("start_position").forGetter(bz.a::b),
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
         dv.a.super.a($$0);
         $$0.a(this.d(), ".cause");
      }

      public boolean a(aqt $$0, eww $$1, eww $$2, @Nullable erl $$3) {
         if (this.c.isPresent() && !this.c.get().a($$0, $$1.c, $$1.d, $$1.e)) {
            return false;
         } else {
            return this.d.isPresent() && !this.d.get().a($$1.c, $$1.d, $$1.e, $$2.c, $$2.d, $$2.e)
               ? false
               : !this.e.isPresent() || $$3 != null && this.e.get().a($$3);
         }
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<df> b() {
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
