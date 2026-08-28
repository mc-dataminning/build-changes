import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cm extends dv<cm.a> {
   @Override
   public Codec<cm.a> a() {
      return cm.a.a;
   }

   public void a(aqv $$0, cuq $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static record a(Optional<bg> b, Optional<cs> c, dh.d d, dh.d e) implements dv.a {
      public static final Codec<cm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(cm.a::a),
                  cs.a.optionalFieldOf("item").forGetter(cm.a::b),
                  dh.d.d.optionalFieldOf("durability", dh.d.c).forGetter(cm.a::c),
                  dh.d.d.optionalFieldOf("delta", dh.d.c).forGetter(cm.a::d)
               )
               .apply($$0, cm.a::new)
      );

      public static ao<cm.a> a(Optional<cs> $$0, dh.d $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public static ao<cm.a> a(Optional<bg> $$0, Optional<cs> $$1, dh.d $$2) {
         return an.u.a(new cm.a($$0, $$1, $$2, dh.d.c));
      }

      public boolean a(cuq $$0, int $$1) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else {
            return !this.d.d($$0.o() - $$1) ? false : this.e.d($$0.n() - $$1);
         }
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<cs> b() {
         return this.c;
      }

      public dh.d c() {
         return this.d;
      }

      public dh.d d() {
         return this.e;
      }
   }
}
