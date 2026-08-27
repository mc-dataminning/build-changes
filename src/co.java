import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class co extends dh<co.a> {
   @Override
   public Codec<co.a> a() {
      return co.a.a;
   }

   public void a(aqu $$0, ewu $$1, int $$2) {
      this.a($$0, $$3 -> $$3.a($$0, $$1, $$2));
   }

   public static record a(Optional<bd> b, Optional<bj> c, cu.d d) implements dh.a {
      public static final Codec<co.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axu.a(bs.b, "player").forGetter(co.a::a), axu.a(bj.a, "distance").forGetter(co.a::b), axu.a(cu.d.d, "duration", cu.d.c).forGetter(co.a::c)
               )
               .apply($$0, co.a::new)
      );

      public static ao<co.a> a(bj $$0) {
         return an.v.a(new co.a(Optional.empty(), Optional.of($$0), cu.d.c));
      }

      public boolean a(aqu $$0, ewu $$1, int $$2) {
         return this.c.isPresent() && !this.c.get().a($$1.c, $$1.d, $$1.e, $$0.dz(), $$0.dB(), $$0.dF()) ? false : this.d.d($$2);
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }

      public Optional<bj> b() {
         return this.c;
      }

      public cu.d c() {
         return this.d;
      }
   }
}
