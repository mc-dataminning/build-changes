import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dc extends dy<dc.a> {
   @Override
   public Codec<dc.a> a() {
      return dc.a.a;
   }

   public void a(asi $$0, bvf $$1, btv $$2) {
      ewh $$3 = bw.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$0, $$3, $$2));
   }

   public static record a(Optional<bh> b, Optional<bh> c, Optional<bl> d) implements dy.a {
      public static final Codec<dc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bw.b.optionalFieldOf("player").forGetter(dc.a::a),
                  bw.b.optionalFieldOf("entity").forGetter(dc.a::e),
                  bl.a.optionalFieldOf("killing_blow").forGetter(dc.a::f)
               )
               .apply($$0, dc.a::new)
      );

      public static ap<dc.a> a(Optional<bw> $$0) {
         return ao.c.a(new dc.a(Optional.empty(), bw.a($$0), Optional.empty()));
      }

      public static ap<dc.a> a(bw.a $$0) {
         return ao.c.a(new dc.a(Optional.empty(), Optional.of(bw.a($$0)), Optional.empty()));
      }

      public static ap<dc.a> b() {
         return ao.c.a(new dc.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ap<dc.a> a(Optional<bw> $$0, Optional<bl> $$1) {
         return ao.c.a(new dc.a(Optional.empty(), bw.a($$0), $$1));
      }

      public static ap<dc.a> a(bw.a $$0, Optional<bl> $$1) {
         return ao.c.a(new dc.a(Optional.empty(), Optional.of(bw.a($$0)), $$1));
      }

      public static ap<dc.a> a(Optional<bw> $$0, bl.a $$1) {
         return ao.c.a(new dc.a(Optional.empty(), bw.a($$0), Optional.of($$1.b())));
      }

      public static ap<dc.a> a(bw.a $$0, bl.a $$1) {
         return ao.c.a(new dc.a(Optional.empty(), Optional.of(bw.a($$0)), Optional.of($$1.b())));
      }

      public static ap<dc.a> c() {
         return ao.Z.a(new dc.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ap<dc.a> b(Optional<bw> $$0) {
         return ao.d.a(new dc.a(Optional.empty(), bw.a($$0), Optional.empty()));
      }

      public static ap<dc.a> b(bw.a $$0) {
         return ao.d.a(new dc.a(Optional.empty(), Optional.of(bw.a($$0)), Optional.empty()));
      }

      public static ap<dc.a> d() {
         return ao.d.a(new dc.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ap<dc.a> b(Optional<bw> $$0, Optional<bl> $$1) {
         return ao.d.a(new dc.a(Optional.empty(), bw.a($$0), $$1));
      }

      public static ap<dc.a> b(bw.a $$0, Optional<bl> $$1) {
         return ao.d.a(new dc.a(Optional.empty(), Optional.of(bw.a($$0)), $$1));
      }

      public static ap<dc.a> b(Optional<bw> $$0, bl.a $$1) {
         return ao.d.a(new dc.a(Optional.empty(), bw.a($$0), Optional.of($$1.b())));
      }

      public static ap<dc.a> b(bw.a $$0, bl.a $$1) {
         return ao.d.a(new dc.a(Optional.empty(), Optional.of(bw.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(asi $$0, ewh $$1, btv $$2) {
         return this.d.isPresent() && !this.d.get().a($$0, $$2) ? false : this.c.isEmpty() || this.c.get().a($$1);
      }

      @Override
      public void a(bi $$0) {
         dy.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public Optional<bh> e() {
         return this.c;
      }

      public Optional<bl> f() {
         return this.d;
      }
   }
}
