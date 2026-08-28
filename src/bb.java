import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bb extends dj<bb.a> {
   @Override
   public Codec<bb.a> a() {
      return bb.a.a;
   }

   public void a(arr $$0, alf<div> $$1, alf<div> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bi> b, Optional<alf<div>> c, Optional<alf<div>> d) implements dj.a {
      public static final Codec<bb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(bb.a::a),
                  alf.a(mg.bn).optionalFieldOf("from").forGetter(bb.a::c),
                  alf.a(mg.bn).optionalFieldOf("to").forGetter(bb.a::d)
               )
               .apply($$0, bb.a::new)
      );

      public static aq<bb.a> b() {
         return ap.w.a(new bb.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static aq<bb.a> a(alf<div> $$0, alf<div> $$1) {
         return ap.w.a(new bb.a(Optional.empty(), Optional.of($$0), Optional.of($$1)));
      }

      public static aq<bb.a> a(alf<div> $$0) {
         return ap.w.a(new bb.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public static aq<bb.a> b(alf<div> $$0) {
         return ap.w.a(new bb.a(Optional.empty(), Optional.of($$0), Optional.empty()));
      }

      public boolean b(alf<div> $$0, alf<div> $$1) {
         return this.c.isPresent() && this.c.get() != $$0 ? false : !this.d.isPresent() || this.d.get() == $$1;
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }
   }
}
