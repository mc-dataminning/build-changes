import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cl extends dk<cl.a> {
   @Override
   public Codec<cl.a> a() {
      return cl.a.a;
   }

   public void a(arr $$0, czn $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static record a(Optional<bj> b, Optional<cm> c, cw.d d, cw.d e) implements dk.a {
      public static final Codec<cl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  by.b.optionalFieldOf("player").forGetter(cl.a::a),
                  cm.a.optionalFieldOf("item").forGetter(cl.a::b),
                  cw.d.d.optionalFieldOf("durability", cw.d.c).forGetter(cl.a::c),
                  cw.d.d.optionalFieldOf("delta", cw.d.c).forGetter(cl.a::d)
               )
               .apply($$0, cl.a::new)
      );

      public static ar<cl.a> a(Optional<cm> $$0, cw.d $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public static ar<cl.a> a(Optional<bj> $$0, Optional<cm> $$1, cw.d $$2) {
         return aq.u.a(new cl.a($$0, $$1, $$2, cw.d.c));
      }

      public boolean a(czn $$0, int $$1) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else {
            return !this.d.d($$0.p() - $$1) ? false : this.e.d($$0.o() - $$1);
         }
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<cm> b() {
         return this.c;
      }

      public cw.d c() {
         return this.d;
      }

      public cw.d d() {
         return this.e;
      }
   }
}
