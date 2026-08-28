import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dq extends dz<dq.a> {
   @Override
   public Codec<dq.a> a() {
      return dq.a.a;
   }

   public void a(ard $$0, buj $$1, bsz $$2, float $$3, float $$4, boolean $$5) {
      evp $$6 = bx.b($$0, $$1);
      this.a($$0, $$6x -> $$6x.a($$0, $$6, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bi> b, Optional<bl> c, Optional<bi> d) implements dz.a {
      public static final Codec<dq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(dq.a::a),
                  bl.a.optionalFieldOf("damage").forGetter(dq.a::c),
                  bx.b.optionalFieldOf("entity").forGetter(dq.a::d)
               )
               .apply($$0, dq.a::new)
      );

      public static aq<dq.a> b() {
         return ap.h.a(new dq.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static aq<dq.a> a(Optional<bl> $$0) {
         return ap.h.a(new dq.a(Optional.empty(), $$0, Optional.empty()));
      }

      public static aq<dq.a> a(bl.a $$0) {
         return ap.h.a(new dq.a(Optional.empty(), Optional.of($$0.b()), Optional.empty()));
      }

      public static aq<dq.a> b(Optional<bx> $$0) {
         return ap.h.a(new dq.a(Optional.empty(), Optional.empty(), bx.a($$0)));
      }

      public static aq<dq.a> a(Optional<bl> $$0, Optional<bx> $$1) {
         return ap.h.a(new dq.a(Optional.empty(), $$0, bx.a($$1)));
      }

      public static aq<dq.a> a(bl.a $$0, Optional<bx> $$1) {
         return ap.h.a(new dq.a(Optional.empty(), Optional.of($$0.b()), bx.a($$1)));
      }

      public boolean a(ard $$0, evp $$1, bsz $$2, float $$3, float $$4, boolean $$5) {
         return this.c.isPresent() && !this.c.get().a($$0, $$2, $$3, $$4, $$5) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bj $$0) {
         dz.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }
   }
}
