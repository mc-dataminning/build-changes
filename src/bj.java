import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bj extends de<bj.a> {
   @Override
   public Codec<bj.a> a() {
      return bj.a.a;
   }

   public void a(aqi $$0, etp $$1) {
      etp $$2 = $$0.dl();
      this.a($$0, $$3 -> $$3.a($$0.z(), $$1, $$2));
   }

   public static record a(Optional<bc> b, Optional<cr> c, Optional<bi> d) implements de.a {
      public static final Codec<bj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axh.a(br.b, "player").forGetter(bj.a::a), axh.a(cr.a, "start_position").forGetter(bj.a::b), axh.a(bi.a, "distance").forGetter(bj.a::c)
               )
               .apply($$0, bj.a::new)
      );

      public static an<bj.a> a(br.a $$0, bi $$1, cr.a $$2) {
         return am.X.a(new bj.a(Optional.of(br.a($$0)), Optional.of($$2.b()), Optional.of($$1)));
      }

      public static an<bj.a> a(br.a $$0, bi $$1) {
         return am.Y.a(new bj.a(Optional.of(br.a($$0)), Optional.empty(), Optional.of($$1)));
      }

      public static an<bj.a> a(bi $$0) {
         return am.D.a(new bj.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public boolean a(aqh $$0, etp $$1, etp $$2) {
         return this.c.isPresent() && !this.c.get().a($$0, $$1.c, $$1.d, $$1.e)
            ? false
            : !this.d.isPresent() || this.d.get().a($$1.c, $$1.d, $$1.e, $$2.c, $$2.d, $$2.e);
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
   }
}
