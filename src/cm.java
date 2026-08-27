import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cm extends dd<cm.a> {
   @Override
   public Codec<cm.a> a() {
      return cm.a.a;
   }

   public void a(aqf $$0, etf $$1, int $$2) {
      this.a($$0, $$3 -> $$3.a($$0, $$1, $$2));
   }

   public static record a(Optional<bc> b, Optional<bi> c, cs.d d) implements dd.a {
      public static final Codec<cm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axe.a(br.b, "player").forGetter(cm.a::a), axe.a(bi.a, "distance").forGetter(cm.a::b), axe.a(cs.d.d, "duration", cs.d.c).forGetter(cm.a::c)
               )
               .apply($$0, cm.a::new)
      );

      public static an<cm.a> a(bi $$0) {
         return am.v.a(new cm.a(Optional.empty(), Optional.of($$0), cs.d.c));
      }

      public boolean a(aqf $$0, etf $$1, int $$2) {
         return this.c.isPresent() && !this.c.get().a($$1.c, $$1.d, $$1.e, $$0.ds(), $$0.du(), $$0.dy()) ? false : this.d.d($$2);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<bi> b() {
         return this.c;
      }

      public cs.d c() {
         return this.d;
      }
   }
}
