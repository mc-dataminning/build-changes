import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class bv extends de<bv.a> {
   @Override
   public Codec<bv.a> a() {
      return bv.a.a;
   }

   public void a(aqi $$0, etp $$1, @Nullable brh $$2) {
      etp $$3 = $$0.dl();
      eol $$4 = $$2 != null ? br.b($$0, $$2) : null;
      this.a($$0, $$4x -> $$4x.a($$0.z(), $$1, $$3, $$4));
   }

   public static record a(Optional<bc> b, Optional<cr> c, Optional<bi> d, Optional<bc> e) implements de.a {
      public static final Codec<bv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axh.a(br.b, "player").forGetter(bv.a::a),
                  axh.a(cr.a, "start_position").forGetter(bv.a::b),
                  axh.a(bi.a, "distance").forGetter(bv.a::c),
                  axh.a(br.b, "cause").forGetter(bv.a::d)
               )
               .apply($$0, bv.a::new)
      );

      public static an<bv.a> a(bi $$0, br.a $$1) {
         return am.ae.a(new bv.a(Optional.empty(), Optional.empty(), Optional.of($$0), Optional.of(br.a($$1))));
      }

      @Override
      public void a(bd $$0) {
         de.a.super.a($$0);
         $$0.a(this.d(), ".cause");
      }

      public boolean a(aqh $$0, etp $$1, etp $$2, @Nullable eol $$3) {
         if (this.c.isPresent() && !this.c.get().a($$0, $$1.c, $$1.d, $$1.e)) {
            return false;
         } else {
            return this.d.isPresent() && !this.d.get().a($$1.c, $$1.d, $$1.e, $$2.c, $$2.d, $$2.e)
               ? false
               : !this.e.isPresent() || $$3 != null && this.e.get().a($$3);
         }
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<cr> b() {
         return this.c;
      }

      public Optional<bi> c() {
         return this.d;
      }

      public Optional<bc> d() {
         return this.e;
      }
   }
}
