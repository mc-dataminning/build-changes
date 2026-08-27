import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cg extends cx<cg.a> {
   @Override
   public Codec<cg.a> a() {
      return cg.a.a;
   }

   public void a(apt $$0, esa $$1, int $$2) {
      this.a($$0, $$3 -> $$3.a($$0, $$1, $$2));
   }

   public static record a(Optional<bc> b, Optional<bi> c, cm.d d) implements cx.a {
      public static final Codec<cg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aws.a(br.b, "player").forGetter(cg.a::a), aws.a(bi.a, "distance").forGetter(cg.a::b), aws.a(cm.d.d, "duration", cm.d.c).forGetter(cg.a::c)
               )
               .apply($$0, cg.a::new)
      );

      public static an<cg.a> a(bi $$0) {
         return am.v.a(new cg.a(Optional.empty(), Optional.of($$0), cm.d.c));
      }

      public boolean a(apt $$0, esa $$1, int $$2) {
         return this.c.isPresent() && !this.c.get().a($$1.c, $$1.d, $$1.e, $$0.dr(), $$0.dt(), $$0.dx()) ? false : this.d.d($$2);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<bi> b() {
         return this.c;
      }

      public cm.d c() {
         return this.d;
      }
   }
}
