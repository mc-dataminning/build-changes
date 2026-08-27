import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cl extends dd<cl.a> {
   @Override
   public Codec<cl.a> a() {
      return cl.a.a;
   }

   public void a(aqf $$0, bql $$1, bpj $$2) {
      eoa $$3 = br.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$0, $$3, $$2));
   }

   public static record a(Optional<bc> b, Optional<bc> c, Optional<bg> d) implements dd.a {
      public static final Codec<cl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axe.a(br.b, "player").forGetter(cl.a::a), axe.a(br.b, "entity").forGetter(cl.a::e), axe.a(bg.a, "killing_blow").forGetter(cl.a::f))
               .apply($$0, cl.a::new)
      );

      public static an<cl.a> a(Optional<br> $$0) {
         return am.c.a(new cl.a(Optional.empty(), br.a($$0), Optional.empty()));
      }

      public static an<cl.a> a(br.a $$0) {
         return am.c.a(new cl.a(Optional.empty(), Optional.of(br.a($$0)), Optional.empty()));
      }

      public static an<cl.a> b() {
         return am.c.a(new cl.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<cl.a> a(Optional<br> $$0, Optional<bg> $$1) {
         return am.c.a(new cl.a(Optional.empty(), br.a($$0), $$1));
      }

      public static an<cl.a> a(br.a $$0, Optional<bg> $$1) {
         return am.c.a(new cl.a(Optional.empty(), Optional.of(br.a($$0)), $$1));
      }

      public static an<cl.a> a(Optional<br> $$0, bg.a $$1) {
         return am.c.a(new cl.a(Optional.empty(), br.a($$0), Optional.of($$1.b())));
      }

      public static an<cl.a> a(br.a $$0, bg.a $$1) {
         return am.c.a(new cl.a(Optional.empty(), Optional.of(br.a($$0)), Optional.of($$1.b())));
      }

      public static an<cl.a> c() {
         return am.Z.a(new cl.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<cl.a> b(Optional<br> $$0) {
         return am.d.a(new cl.a(Optional.empty(), br.a($$0), Optional.empty()));
      }

      public static an<cl.a> b(br.a $$0) {
         return am.d.a(new cl.a(Optional.empty(), Optional.of(br.a($$0)), Optional.empty()));
      }

      public static an<cl.a> d() {
         return am.d.a(new cl.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<cl.a> b(Optional<br> $$0, Optional<bg> $$1) {
         return am.d.a(new cl.a(Optional.empty(), br.a($$0), $$1));
      }

      public static an<cl.a> b(br.a $$0, Optional<bg> $$1) {
         return am.d.a(new cl.a(Optional.empty(), Optional.of(br.a($$0)), $$1));
      }

      public static an<cl.a> b(Optional<br> $$0, bg.a $$1) {
         return am.d.a(new cl.a(Optional.empty(), br.a($$0), Optional.of($$1.b())));
      }

      public static an<cl.a> b(br.a $$0, bg.a $$1) {
         return am.d.a(new cl.a(Optional.empty(), Optional.of(br.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(aqf $$0, eoa $$1, bpj $$2) {
         return this.d.isPresent() && !this.d.get().a($$0, $$2) ? false : this.c.isEmpty() || this.c.get().a($$1);
      }

      @Override
      public void a(bd $$0) {
         dd.a.super.a($$0);
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
