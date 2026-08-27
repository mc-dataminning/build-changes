import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cn extends de<cn.a> {
   @Override
   public Codec<cn.a> a() {
      return cn.a.a;
   }

   public void a(aqi $$0, etp $$1, int $$2) {
      this.a($$0, $$3 -> $$3.a($$0, $$1, $$2));
   }

   public static record a(Optional<bc> b, Optional<bi> c, ct.d d) implements de.a {
      public static final Codec<cn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axh.a(br.b, "player").forGetter(cn.a::a), axh.a(bi.a, "distance").forGetter(cn.a::b), axh.a(ct.d.d, "duration", ct.d.c).forGetter(cn.a::c)
               )
               .apply($$0, cn.a::new)
      );

      public static an<cn.a> a(bi $$0) {
         return am.v.a(new cn.a(Optional.empty(), Optional.of($$0), ct.d.c));
      }

      public boolean a(aqi $$0, etp $$1, int $$2) {
         return this.c.isPresent() && !this.c.get().a($$1.c, $$1.d, $$1.e, $$0.ds(), $$0.du(), $$0.dy()) ? false : this.d.d($$2);
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
