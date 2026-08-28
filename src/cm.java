import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cm extends dl<cm.a> {
   @Override
   public Codec<cm.a> a() {
      return cm.a.a;
   }

   public void a(arv $$0, daa $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static record a(Optional<bj> b, Optional<cn> c, cx.d d, cx.d e) implements dl.a {
      public static final Codec<cm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bz.b.optionalFieldOf("player").forGetter(cm.a::a),
                  cn.a.optionalFieldOf("item").forGetter(cm.a::b),
                  cx.d.d.optionalFieldOf("durability", cx.d.c).forGetter(cm.a::c),
                  cx.d.d.optionalFieldOf("delta", cx.d.c).forGetter(cm.a::d)
               )
               .apply($$0, cm.a::new)
      );

      public static ar<cm.a> a(Optional<cn> $$0, cx.d $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public static ar<cm.a> a(Optional<bj> $$0, Optional<cn> $$1, cx.d $$2) {
         return aq.u.a(new cm.a($$0, $$1, $$2, cx.d.c));
      }

      public boolean a(daa $$0, int $$1) {
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

      public Optional<cn> b() {
         return this.c;
      }

      public cx.d c() {
         return this.d;
      }

      public cx.d d() {
         return this.e;
      }
   }
}
