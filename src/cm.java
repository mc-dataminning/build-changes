import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cm extends df<cm.a> {
   @Override
   public Codec<cm.a> a() {
      return cm.a.a;
   }

   public void a(aqn $$0, bru $$1, bqn $$2) {
      epf $$3 = br.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$0, $$3, $$2));
   }

   public static record a(Optional<bc> b, Optional<bc> c, Optional<bg> d) implements df.a {
      public static final Codec<cm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  br.b.optionalFieldOf("player").forGetter(cm.a::a),
                  br.b.optionalFieldOf("entity").forGetter(cm.a::e),
                  bg.a.optionalFieldOf("killing_blow").forGetter(cm.a::f)
               )
               .apply($$0, cm.a::new)
      );

      public static an<cm.a> a(Optional<br> $$0) {
         return am.c.a(new cm.a(Optional.empty(), br.a($$0), Optional.empty()));
      }

      public static an<cm.a> a(br.a $$0) {
         return am.c.a(new cm.a(Optional.empty(), Optional.of(br.a($$0)), Optional.empty()));
      }

      public static an<cm.a> b() {
         return am.c.a(new cm.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<cm.a> a(Optional<br> $$0, Optional<bg> $$1) {
         return am.c.a(new cm.a(Optional.empty(), br.a($$0), $$1));
      }

      public static an<cm.a> a(br.a $$0, Optional<bg> $$1) {
         return am.c.a(new cm.a(Optional.empty(), Optional.of(br.a($$0)), $$1));
      }

      public static an<cm.a> a(Optional<br> $$0, bg.a $$1) {
         return am.c.a(new cm.a(Optional.empty(), br.a($$0), Optional.of($$1.b())));
      }

      public static an<cm.a> a(br.a $$0, bg.a $$1) {
         return am.c.a(new cm.a(Optional.empty(), Optional.of(br.a($$0)), Optional.of($$1.b())));
      }

      public static an<cm.a> c() {
         return am.Z.a(new cm.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<cm.a> b(Optional<br> $$0) {
         return am.d.a(new cm.a(Optional.empty(), br.a($$0), Optional.empty()));
      }

      public static an<cm.a> b(br.a $$0) {
         return am.d.a(new cm.a(Optional.empty(), Optional.of(br.a($$0)), Optional.empty()));
      }

      public static an<cm.a> d() {
         return am.d.a(new cm.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<cm.a> b(Optional<br> $$0, Optional<bg> $$1) {
         return am.d.a(new cm.a(Optional.empty(), br.a($$0), $$1));
      }

      public static an<cm.a> b(br.a $$0, Optional<bg> $$1) {
         return am.d.a(new cm.a(Optional.empty(), Optional.of(br.a($$0)), $$1));
      }

      public static an<cm.a> b(Optional<br> $$0, bg.a $$1) {
         return am.d.a(new cm.a(Optional.empty(), br.a($$0), Optional.of($$1.b())));
      }

      public static an<cm.a> b(br.a $$0, bg.a $$1) {
         return am.d.a(new cm.a(Optional.empty(), Optional.of(br.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(aqn $$0, epf $$1, bqn $$2) {
         return this.d.isPresent() && !this.d.get().a($$0, $$2) ? false : this.c.isEmpty() || this.c.get().a($$1);
      }

      @Override
      public void a(bd $$0) {
         df.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<bc> e() {
         return this.c;
      }

      public Optional<bg> f() {
         return this.d;
      }
   }
}
