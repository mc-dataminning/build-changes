import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class cw extends df<cw.a> {
   @Override
   public Codec<cw.a> a() {
      return cw.a.a;
   }

   public void a(aqo $$0, ctq $$1, @Nullable brw $$2) {
      eph $$3 = br.b($$0, $$2);
      this.a($$0, $$3x -> $$3x.a($$0, $$1, $$3));
   }

   public static record a(Optional<bc> b, Optional<ch> c, Optional<bc> d) implements df.a {
      public static final Codec<cw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  br.b.optionalFieldOf("player").forGetter(cw.a::a),
                  ch.a.optionalFieldOf("item").forGetter(cw.a::b),
                  br.b.optionalFieldOf("entity").forGetter(cw.a::c)
               )
               .apply($$0, cw.a::new)
      );

      public static an<cw.a> a(bc $$0, Optional<ch> $$1, Optional<bc> $$2) {
         return am.R.a(new cw.a(Optional.of($$0), $$1, $$2));
      }

      public static an<cw.a> a(Optional<bc> $$0, Optional<ch> $$1, Optional<bc> $$2) {
         return am.S.a(new cw.a($$0, $$1, $$2));
      }

      public boolean a(aqo $$0, ctq $$1, eph $$2) {
         return this.c.isPresent() && !this.c.get().a($$1) ? false : !this.d.isPresent() || this.d.get().a($$2);
      }

      @Override
      public void a(bd $$0) {
         df.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<ch> b() {
         return this.c;
      }

      public Optional<bc> c() {
         return this.d;
      }
   }
}
