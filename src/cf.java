import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cf extends cx<cf.a> {
   @Override
   public Codec<cf.a> a() {
      return cf.a.a;
   }

   public void a(apt $$0, bpv $$1, bot $$2) {
      enb $$3 = br.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$0, $$3, $$2));
   }

   public static record a(Optional<bc> b, Optional<bc> c, Optional<bg> d) implements cx.a {
      public static final Codec<cf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(aws.a(br.b, "player").forGetter(cf.a::a), aws.a(br.b, "entity").forGetter(cf.a::e), aws.a(bg.a, "killing_blow").forGetter(cf.a::f))
               .apply($$0, cf.a::new)
      );

      public static an<cf.a> a(Optional<br> $$0) {
         return am.c.a(new cf.a(Optional.empty(), br.a($$0), Optional.empty()));
      }

      public static an<cf.a> a(br.a $$0) {
         return am.c.a(new cf.a(Optional.empty(), Optional.of(br.a($$0)), Optional.empty()));
      }

      public static an<cf.a> b() {
         return am.c.a(new cf.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<cf.a> a(Optional<br> $$0, Optional<bg> $$1) {
         return am.c.a(new cf.a(Optional.empty(), br.a($$0), $$1));
      }

      public static an<cf.a> a(br.a $$0, Optional<bg> $$1) {
         return am.c.a(new cf.a(Optional.empty(), Optional.of(br.a($$0)), $$1));
      }

      public static an<cf.a> a(Optional<br> $$0, bg.a $$1) {
         return am.c.a(new cf.a(Optional.empty(), br.a($$0), Optional.of($$1.b())));
      }

      public static an<cf.a> a(br.a $$0, bg.a $$1) {
         return am.c.a(new cf.a(Optional.empty(), Optional.of(br.a($$0)), Optional.of($$1.b())));
      }

      public static an<cf.a> c() {
         return am.Z.a(new cf.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<cf.a> b(Optional<br> $$0) {
         return am.d.a(new cf.a(Optional.empty(), br.a($$0), Optional.empty()));
      }

      public static an<cf.a> b(br.a $$0) {
         return am.d.a(new cf.a(Optional.empty(), Optional.of(br.a($$0)), Optional.empty()));
      }

      public static an<cf.a> d() {
         return am.d.a(new cf.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<cf.a> b(Optional<br> $$0, Optional<bg> $$1) {
         return am.d.a(new cf.a(Optional.empty(), br.a($$0), $$1));
      }

      public static an<cf.a> b(br.a $$0, Optional<bg> $$1) {
         return am.d.a(new cf.a(Optional.empty(), Optional.of(br.a($$0)), $$1));
      }

      public static an<cf.a> b(Optional<br> $$0, bg.a $$1) {
         return am.d.a(new cf.a(Optional.empty(), br.a($$0), Optional.of($$1.b())));
      }

      public static an<cf.a> b(br.a $$0, bg.a $$1) {
         return am.d.a(new cf.a(Optional.empty(), Optional.of(br.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(apt $$0, enb $$1, bot $$2) {
         return this.d.isPresent() && !this.d.get().a($$0, $$2) ? false : this.c.isEmpty() || this.c.get().a($$1);
      }

      @Override
      public void a(bd $$0) {
         cx.a.super.a($$0);
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
