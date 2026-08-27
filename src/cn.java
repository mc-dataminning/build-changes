import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cn extends df<cn.a> {
   @Override
   public Codec<cn.a> a() {
      return cn.a.a;
   }

   public void a(aqn $$0, euk $$1, int $$2) {
      this.a($$0, $$3 -> $$3.a($$0, $$1, $$2));
   }

   public static record a(Optional<bc> b, Optional<bi> c, ct.d d) implements df.a {
      public static final Codec<cn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  br.b.optionalFieldOf("player").forGetter(cn.a::a),
                  bi.a.optionalFieldOf("distance").forGetter(cn.a::b),
                  ct.d.d.optionalFieldOf("duration", ct.d.c).forGetter(cn.a::c)
               )
               .apply($$0, cn.a::new)
      );

      public static an<cn.a> a(bi $$0) {
         return am.v.a(new cn.a(Optional.empty(), Optional.of($$0), ct.d.c));
      }

      public boolean a(aqn $$0, euk $$1, int $$2) {
         return this.c.isPresent() && !this.c.get().a($$1.c, $$1.d, $$1.e, $$0.du(), $$0.dw(), $$0.dA()) ? false : this.d.d($$2);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<bi> b() {
         return this.c;
      }

      public ct.d c() {
         return this.d;
      }
   }
}
